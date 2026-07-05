---
name: first-party-vs-third-party
description: isFirstPartyApiBackend/getAPIProvider 判断逻辑、非 FirstParty 用户的完整功能差异清单、隐藏行为差异
metadata: 
  node_type: memory
  type: reference
  originSessionId: af7764fa-70d9-4dfe-8ccc-b56e6b74e0e9
---

# FirstParty vs ThirdParty 用户差异分析

> 基于 `extracted/src/entrypoints/cli_split/` (v2.1.198) 逆向分析

## 核心判断函数

### `getAPIProvider()` — 返回当前 API 后端类型

**源码：** `api/0118_usesFirstPartyModelIds_shouldPropagateTraceContext_isFirstPa.js` L9391-9396

```javascript
function getAPIProvider() {
  if (getGatewayAuth()) return "gateway";
  return st(process.env.CLAUDE_CODE_USE_BEDROCK) ? "bedrock"
       : st(process.env.CLAUDE_CODE_USE_FOUNDRY) ? "foundry"
       : st(process.env.CLAUDE_CODE_USE_ANTHROPIC_AWS) ? "anthropicAws"
       : st(process.env.CLAUDE_CODE_USE_MANTLE) ? "mantle"
       : st(process.env.CLAUDE_CODE_USE_VERTEX) ? "vertex"
       : "firstParty";
}
```

**返回值：** `"firstParty"` | `"bedrock"` | `"vertex"` | `"anthropicAws"` | `"foundry"` | `"mantle"` | `"gateway"`

判断优先级：gateway > bedrock > foundry > anthropicAws > mantle > vertex > firstParty（默认）

触发环境变量：
- `CLAUDE_CODE_USE_BEDROCK` → `"bedrock"`
- `CLAUDE_CODE_USE_FOUNDRY` → `"foundry"`
- `CLAUDE_CODE_USE_ANTHROPIC_AWS` → `"anthropicAws"`
- `CLAUDE_CODE_USE_MANTLE` → `"mantle"`
- `CLAUDE_CODE_USE_VERTEX` → `"vertex"`
- 存在 Gateway 认证 → `"gateway"`
- 无以上条件 → `"firstParty"`

### `isFirstPartyApiBackend()` — 最严格的 FirstParty 判断

**源码：** 同文件 L9434-9436

```javascript
function isFirstPartyApiBackend() {
  return getAPIProvider() === "firstParty" && isFirstPartyAnthropicBaseUrl();
}
```

必须同时满足：
1. 没有设置任何 3P 环境变量（`getAPIProvider() === "firstParty"`）
2. `ANTHROPIC_BASE_URL` 为空或指向 `api.anthropic.com`

### `isFirstPartyAnthropicBaseUrl()` — Base URL 验证 + 逃生口

**源码：** 同文件 L9437-9442

```javascript
function isFirstPartyAnthropicBaseUrl() {
  if (Me._CLAUDE_CODE_ASSUME_FIRST_PARTY_BASE_URL) return true;  // 逃生口
  return isActualFirstPartyAnthropicBaseUrl();
}

function isActualFirstPartyAnthropicBaseUrl() {
  let e = process.env.ANTHROPIC_BASE_URL;
  if (!e) return true;  // 未设置 → 默认为 firstParty
  return isFirstPartyAnthropicHost(e);
}

function isFirstPartyAnthropicHost(e) {
  try {
    let t = new URL(e).host;
    return ["api.anthropic.com"].includes(t);  // 只认这一个域名
  } catch { return false; }
}
```

逃生口：设了 `CLAUDE_CODE_ASSUME_FIRST_PARTY_BASE_URL` 也会被当作 firstParty（即使 base URL 不是 api.anthropic.com）。

### 其他相关判断函数

| 函数 | 逻辑 | 源码行 |
|---|---|---|
| `isFirstPartyProvider()` | `getAPIProvider() === "firstParty"` | L9400 |
| `isUsing3PServices()` | `!isFirstPartyProvider()` | auth/0171 L1670 |
| `usesFirstPartyModelIds()` | `firstParty \|\| anthropicAws \|\| gateway` | L9428 |
| `hasFirstPartyCapabilities()` | `firstParty \|\| anthropicAws \|\| foundry \|\| mantle` | L9431 |
| `shouldPropagateTraceContext()` | `isFirstPartyAnthropicBaseUrl() \|\| CLAUDE_CODE_PROPAGATE_TRACEPARENT` | L9458 |

### `V4e()` — 服务端远程 Kill Switch

**源码：** `tools/0184_SEND_USER_FILE_TOOL_PROMPT_SEND_USER_FILE_TOOL_NAME_DESCRIPT.js` L1331-1333

```javascript
function V4e(e) {
  return getDynamicConfig_CACHED_MAY_BE_STALE("tengu_frond_boric", {})?.[e] === true;
}
```

读取 GrowthBook 动态配置 `tengu_frond_boric`，支持按通道名 kill：
- `V4e("firstParty")` → 关闭 1P OTel 遥测通道
- `V4e("datadog")` → 关闭 Datadog 遥测通道

---

## 非 FirstParty 用户功能差异完整清单

### 一、遥测与上报

| 功能 | 限制 | 判断条件 | 源码位置 |
|---|---|---|---|
| Datadog 遥测 | 完全不上报 | `getAPIProvider() !== "firstParty"` → return | cli/0432 L53 |
| 1P OTel 遥测 | 服务端可远程 kill | `V4e("firstParty")` → 跳过上报 + OTel Exporter `isKilled` | cli/0185 L97,115,127,205 |
| 错误自动上报 | 不上报到 Anthropic | `getAPIProvider() !== "firstParty" \|\| !isFirstPartyAnthropicBaseUrl()` → false | cli/0275 L173 |

### 二、认证与登录

| 功能 | 限制 | 判断条件 | 源码位置 |
|---|---|---|---|
| 账户信息查询 | 不查询 | `getAPIProvider() !== "firstParty"` → undefined | auth/0171 L1796,2141 |
| Auth 请求头 | 不附加 Anthropic 认证头 | `isUsing3PServices()` → 空 headers + error: "third_party" | auth/0171 L2582 |
| OAuth 刷新循环 | 跳过 | `isUsing3PServices()` → 跳过刷新 | cli/0413 L8499 |
| 浏览器登录 | 跳过 | `isUsing3PServices() && !n()` → 跳过 | cli/0413 L8407 |
| Chrome 集成 MCP | 不尝试 OAuth token 刷新 | `getAPIProvider() !== "firstParty"` → 关闭配对 | auth/0433 L71 |
| OAuth 认证路径 | 不走 OAuth | `getAPIProvider() === "firstParty" && !shouldUseWIFAuth() && !isAnthropicAuthEnabled()` | auth/0171 L2178 |

### 三、模型处理与上下文

| 功能 | 限制 | 判断条件 | 源码位置 |
|---|---|---|---|
| `[1m]` 上下文标签 | 非第一方保留 `[1m]` 后缀 | `!isFirstPartyApiBackend() && !hg(s)` → 添加 `[1m]` | api/0124 L1057 |
| `[1m]` 标签剥离 | 不剥离 | `isFirstPartyApiBackend()` → strip1mTag | api/0124 L249,253 |
| 原生 1M 上下文路径 | 不走 | `isFirstPartyApiBackend() && Lvd(o) && modelHasNative1MContext(o)` → 剥离 | api/0124 L1075 |
| Refusal 回退 + 模型切换 | 不触发 | `isFirstPartyApiBackend()` → false | sessions/0243 L1566 |
| Rotunda Pennant 回放 | 不回放/不应用 | `isFirstPartyApiBackend()` → false | cli/0429 L1073 |
| Rotunda Pennant fallback | 不应用 fallback 策略 | `isFirstPartyApiBackend()` → false | tools/0249 L957 |
| 模型别名迁移 | 不迁移 | `getAPIProvider() !== "firstParty"` → return | cli/0477 L2816 |
| 旧 Opus 迁移 | 不迁移 | `getAPIProvider() !== "firstParty"` → return | cli/0477 L3012 |
| Sonnet 45→46 迁移 | 不迁移 | `getAPIProvider() !== "firstParty"` → return | cli/0477 L3142 |
| Opus Pro 默认模型迁移 | 跳过并标记 complete | `getAPIProvider() !== "firstParty"` → 标记 skipped | cli/0477 L3250 |
| 旧版模型弃用提示 | 条件不同 | `usesFirstPartyModelIds() && isLegacyOpusFirstParty(o) && isLegacyModelRemapEnabled()` | auth/0123 L1370 |

### 四、API 请求与 Header 注入

| 功能 | 限制 | 判断条件 | 源码位置 |
|---|---|---|---|
| `x-client-request-id` | 不生成 | 需 firstParty + Anthropic host \|\| anthropicAws + 无自定义 base URL | cli/0429 L558-561 |
| `traceparent` 传播 | 需手动启用 | 非第一方需设 `CLAUDE_CODE_PROPAGATE_TRACEPARENT` | api/0118 L9458 |
| `anthropic-usage-limit` header | 不注入 | 需 firstParty + Anthropic host + `tengu_lantern_spool` feature flag | cli/0429 L1785 |
| `anthropic-dispatch-id` header | 不注入 | 需 firstParty + Anthropic host + `tengu_cedar_lattice` feature flag | cli/0429 L1788 |
| 提示缓存诊断 | 不启用 | 需 firstParty + Anthropic host + `tengu_prompt_cache_diagnostics` | cli/0429 L685 |
| 子代理缓存驱逐 | 部分受限 | 需 firstParty + 无自定义 base URL | cli/0429 L695 |

### 五、功能可用性

| 功能 | 限制 | 判断条件 | 源码位置 |
|---|---|---|---|
| Fast 模式 | 完全不可用 | `getAPIProvider() !== "firstParty"` → false | auth/0123 L703 |
| Bootstrap 数据拉取 | 不拉取账户/订阅/组织信息 | `getAPIProvider() !== "firstParty"` → null | cli/0341 L72 |
| WebFetch 代理 (CCR) | 不使用 | `getAPIProvider() !== "firstParty"` → false | cli/0357 L20707 |
| Tool Search | 默认关闭 | firstParty + 非 Anthropic host → 关闭; vertex → 关闭 | cli/0234 L521,528 |
| Channels 功能 | 不可用 | `is3P: getAPIProvider() !== "firstParty"` | cli/0402 L1723 |
| Channels 可用性提示 | 显示 "not available on third-party providers" | 非 firstParty | cli/0386 L5323 |
| Powerup Discovery | 受限 | `isEnterpriseSubscriber() \|\| getAPIProvider() !== "firstParty" \|\| Vi()` → 禁用 | cli/0402 L2993 |
| 图片上传限制 | 更严格 | firstParty + `tengu_crimson_vector` → 10MB; 否则默认更小 | cli/0219 L3126 |
| API Key 审批流程 | 不触发 | 需 firstParty | cli/0477 L825 |
| Gateway 模型发现 | 仅 firstParty + 自定义 base URL | 非 firstParty → false | auth/0123 L1211 |
| `/feedback` 命令 | 不可用 | 3P 用户隐藏 | cli/0422 L4917 |
| Spinner Tips | 过滤为仅跨平台提示 | 非 firstParty → 只显示 providerAgnostic | cli/0468 L11356 |
| Console 渠道反馈 | 不可用 | `!isUsing3PServices() && isFirstPartyAnthropicBaseUrl()` | cli/0422 L4421 |

### 六、系统提示注入

非 FirstParty 用户会在系统提示中追加额外警告（`tools/0463` L10448）：

```
**Provider context:** This session is not using Anthropic's first-party API.
WebSearch may be unavailable, /feedback is unavailable, and some features
behave differently — check the docs page for the user's specific provider.
Direct issues to https://github.com/anthropics/claude-code/issues.
```

---

## 关键发现：隐藏差异

### 1. `[1m]` 上下文标签策略差异（最隐蔽）

非 firstParty 用户使用 `fable[1m]` 时，请求中会保留 `[1m]` 后缀，由第三方 API 自己处理；
firstParty 用户会自动剥离 `[1m]` 走原生 1M 上下文路径（如果模型支持）。

```javascript
// api/0124 L1057 — fable 别名解析
return s + (r && !isFirstPartyApiBackend() && !hg(s) ? "[1m]" : "");

// api/0124 L1075 — 原生 1M 上下文路径
if (r && isFirstPartyApiBackend() && Lvd(o) && modelHasNative1MContext(o)) {
  return t.replace(/(\[1m\])+$/i, "").trim();
}
```

### 2. 1P OTel 遥测的远程 Kill Switch

`V4e("firstParty")` 读取 `tengu_frond_boric` GrowthBook 配置，如果设为 true：
- 1P OTel 通道停止上报（`logEventTo1P` / `logEventTo1PAwaitable` 全部跳过）
- OTel Exporter 标记 `isKilled: () => V4e("firstParty")`，停止发送
- GrowthBook 实验日志也跳过

这意味着 Anthropic 可以远程关闭某个 firstParty 用户的 1P 遥测通道。

### 3. Rotunda Pennant 系统

仅 firstParty 才会回放和应用 "pennant"（一种服务端推送的模型回退/fallback 机制）。
非 firstParty 用户在某些场景下缺少模型回退策略。

### 4. Refusal Fallback + 模型自动切换

`switchModelsOnFlag` 需要 `isFirstPartyApiBackend()` 为 true。
非 firstParty 用户永远不会触发自动模型切换（当遇到 refusal 时自动降级到其他模型）。

```javascript
// sessions/0243 L1566
function rha() {
  return NX() && uc("switchModelsOnFlag", true).value && isFirstPartyApiBackend();
}
```

### 5. Lantern Spool / Cedar Lattice 内部调度信号

这两个 feature flag 控制的 HTTP header 注入只在 firstParty + Anthropic host 时生效：
- `anthropic-usage-limit: extended` — 可能触发扩展用量限制
- `anthropic-dispatch-id: v2s` — 可能是内部调度/路由信号

### 6. 模型迁移全部跳过

所有模型别名/版本迁移逻辑对非 firstParty 用户完全跳过：
- alias 迁移（`eWc`）
- 旧 Opus 迁移（`lWc`）
- Sonnet 45→46 迁移（`bWc`）
- Opus Pro 默认迁移（`CWc`）

这意味着非 firstParty 用户如果使用了旧版模型名（如 `claude-opus-4-20250514`），不会自动迁移到新别名。

### 7. 请求追踪 ID 差异

非 firstParty 用户不会生成 `x-client-request-id`，也不会传播 `traceparent`（除非手动设 `CLAUDE_CODE_PROPAGATE_TRACEPARENT`）。
这意味着在第三方 API 端更难追踪请求链路。

---

## 判断函数关系图

```
getAPIProvider()
    │
    ├── "firstParty" ─── isFirstPartyAnthropicBaseUrl()?
    │       │                   │
    │       │                   ├── true → isFirstPartyApiBackend() = true  (最严格)
    │       │                   │           usesFirstPartyModelIds() = true
    │       │                   │           hasFirstPartyCapabilities() = true
    │       │                   │
    │       │                   └── false (自定义 base URL) → isFirstPartyApiBackend() = false
    │       │                           但 isFirstPartyProvider() = true
    │       │                           usesFirstPartyModelIds() = true
    │       │                           isUsing3PServices() = false
    │       │
    │       └── CLAUDE_CODE_ASSUME_FIRST_PARTY_BASE_URL 可强制为 true
    │
    ├── "anthropicAws" ─── usesFirstPartyModelIds() = true
    │                      hasFirstPartyCapabilities() = true
    │                      isFirstPartyApiBackend() = false
    │
    ├── "gateway" ─── usesFirstPartyModelIds() = true
    │                  hasFirstPartyCapabilities() = false
    │
    ├── "foundry" / "mantle" ─── hasFirstPartyCapabilities() = true
    │
    └── "bedrock" / "vertex" ─── 完全 3P
                                 isUsing3PServices() = true
```

---

## 关键源码位置索引

| 功能 | 文件（cli_split 目录下） |
|---|---|
| `getAPIProvider()` 定义 | `api/0118_usesFirstPartyModelIds_shouldPropagateTraceContext_isFirstPa.js` L9391 |
| `isFirstPartyApiBackend()` 定义 | 同文件 L9434 |
| `isFirstPartyAnthropicBaseUrl()` 定义 | 同文件 L9437 |
| `V4e()` kill switch 定义 | `tools/0184_SEND_USER_FILE_TOOL_PROMPT_SEND_USER_FILE_TOOL_NAME_DESCRIPT.js` L1331 |
| Datadog 通道 firstParty 判断 | `cli/0432_trackDatadogEvent_shutdownDatadog_resetDatadogInit.js` L53 |
| 1P OTel 通道 kill 逻辑 | `cli/0185_shutdown1PEventLogging_shouldSampleEvent_reinitialize1PEvent.js` L97,115,127,205 |
| 错误上报判断 | `cli/0275_setupGracefulShutdown_resetShutdownState_releaseShutdownClai.js` L173 |
| Fast 模式判断 | `auth/0123_propertyProviderChain_fromWebToken_fromTokenFile.js` L703 |
| `[1m]` 标签处理 | `api/0124_swapShrinksContextWindow_strip1mTag_resolvesToDefaultModel.js` L249,253,1057,1075 |
| Refusal 回退 + 模型切换 | `sessions/0243_userAbortReason_unwrapAbortReason_subagentParkAbortReason.js` L1566 |
| Rotunda Pennant | `cli/0429_handleHintReject_createContextHintController_applyHintEdits.js` L1073 |
| Rotunda fallback | `tools/0249_unhideComputerUseApps_createCliExecutor.js` L957 |
| 模型迁移（4 个） | `cli/0477_loadSettingsFromFlag_loadSettingSourcesFromFlag_loadManagedS.js` L2816,3012,3142,3250 |
| Lantern Spool header | `cli/0429` L1785 |
| Cedar Lattice header | `cli/0429` L1788 |
| 提示缓存诊断 | `cli/0429` L685 |
| Tool Search 判断 | `cli/0234_isKairosCronEnabled_isDurableCronEnabled_buildDurableParamDe.js` L521,528 |
| Channels 功能 | `cli/0402_resolvePowerupDiscoveryArm_POWERUP_DISCOVERY_COPY.js` L1723,2993 |
| 3P 系统提示注入 | `tools/0463_registerClaudeCodeSkill_CLAUDE_CODE_SKILL_NAME_CLAUDE_CODE_S.js` L10448 |
| Chrome MCP | `auth/0433_runClaudeInChromeMcpServer_createChromeContext.js` L71 |
| Auth 请求头 | `auth/0171_withOAuth401Retry_getWebFetchUserAgent_getUserAgent.js` L2582 |
| Bootstrap 数据 | `cli/0341_fetchBootstrapData_buildBootstrapRequestConfig_buildBootstra.js` L72 |
| Spinner Tips 过滤 | `cli/0468_launchRepl.js` L11356 |
| Slash 命令隐藏 | `cli/0422_toSlashCommands_shippedCommandNames_scopedSkillName.js` L4917 |
| 图片上传限制 | `cli/0219_trackClaudeInChromeTabId_openInChrome_isTrackedClaudeInChrom.js` L3126 |
