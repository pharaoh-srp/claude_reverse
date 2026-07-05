# Claude 遥测禁用指南

> 基于 Claude Code CLI v2.1.198 和 Claude Android APK 反编译分析  
> 分析日期：2026-07-05  
> 数据来源：cli_split 反编译代码 + jadx APK 反编译

---

## 一、CLI 关闭遥测的方法

### 1.1 环境变量方式

Claude Code CLI 的遥测系统通过流量模式（traffic mode）判定来控制开关。核心函数 `xTs()` 定义于 `auth/0022_preservableScopesFrom...js:275`：

```js
function xTs() {
    if (process.env.CLAUDE_CODE_DISABLE_NONESSENTIAL_TRAFFIC) {
        return "essential-traffic";
    }
    if (process.env.DISABLE_TELEMETRY) {
        return "no-telemetry";
    }
    if (st(process.env.DO_NOT_TRACK)) {
        return "no-telemetry";
    }
    return "default";
}
```

当流量模式不是 `"default"` 时，`yye()` 返回 true，1P 遥测即被禁用。

#### 三个环境变量对比

| 环境变量 | 流量模式 | 作用范围 | 推荐程度 |
|----------|----------|----------|----------|
| `DISABLE_TELEMETRY=1` | `"no-telemetry"` | 禁用 1P 事件日志 + Datadog 遥测 + 内部 BigQuery metrics | ⭐⭐⭐ 首选 |
| `DO_NOT_TRACK=1` | `"no-telemetry"` | 与 `DISABLE_TELEMETRY` 完全等价，遵循 DNT 标准 | ⭐⭐ 通用标准 |
| `CLAUDE_CODE_DISABLE_NONESSENTIAL_TRAFFIC=1` | `"essential-traffic"` | 禁用所有非必要流量（含遥测），范围更广 | ⭐⭐⭐ 最严格 |

**优先级**：`CLAUDE_CODE_DISABLE_NONESSENTIAL_TRAFFIC` > `DISABLE_TELEMETRY` > `DO_NOT_TRACK`（代码从上到下依次检查，先命中先生效）。

**注意**：`CLAUDE_CODE_DISABLE_NONESSENTIAL_TRAFFIC` 和 `DISABLE_TELEMETRY` 是按环境变量是否存在判断，设置为 `0` 这类非空值也会触发；`DO_NOT_TRACK` 走 `st()` truthy 判定。

**效果差异**：

- `no-telemetry` 模式：1P 事件日志、Datadog 和内部 BigQuery metrics 均被禁用，但核心 API 请求不受影响。
- `essential-traffic` 模式：除了禁用遥测，还会限制其他非必要网络请求（如自动更新检查等），是最严格的模式。

#### 设置方式

**临时生效（当前终端会话）：**

```bash
export DISABLE_TELEMETRY=1
claude
```

**永久生效（写入 shell 配置）：**

```bash
# Bash 用户
echo 'export DISABLE_TELEMETRY=1' >> ~/.bashrc
source ~/.bashrc

# Zsh 用户
echo 'export DISABLE_TELEMETRY=1' >> ~/.zshrc
source ~/.zshrc

# Fish 用户
set -Ux DISABLE_TELEMETRY 1
```

**单次命令生效：**

```bash
DISABLE_TELEMETRY=1 claude
```

---

### 1.2 使用非第一方 API 时自动禁用

1P 遥测禁用判定函数 `Jj()`（`core/0181_jHi.js:616`）在以下条件任一成立时返回 true：

```js
function Jj() {
    return j4d() || getGatewayAuth() !== null || yye();
}
```

#### 条件一：非第一方提供商（`j4d()`）

当 API 提供商不是 `firstParty` 时，`j4d()` 返回 true，遥测自动禁用。非第一方提供商包括：

- **Amazon Bedrock**（`bedrock`）
- **Google Vertex AI**（`vertex`）
- **AWS Foundry**（`foundry`）

即使用 Bedrock/Vertex/Foundry 作为后端时，1P 遥测和 Datadog 初始化均被跳过。

**例外**：如果设置了 `CLAUDE_CODE_PROVIDER_MANAGED_BY_HOST=1`，即使是非第一方提供商，`j4d()` 也返回 false（遥测不禁用）。此变量用于宿主环境（如 IDE 集成）中由宿主方决定是否上报遥测的场景。

#### 条件二：Gateway 认证模式

如果使用 Gateway 认证（企业网关模式），`getGatewayAuth() !== null` 为 true，遥测自动禁用。

---

### 1.3 各遥测通道的禁用条件总结

| 遥测通道 | 默认状态 | 禁用条件 |
|----------|----------|----------|
| **1P 事件日志** | 第一方用户默认开 | `DISABLE_TELEMETRY=1` / `DO_NOT_TRACK=1` / `CLAUDE_CODE_DISABLE_NONESSENTIAL_TRAFFIC=1` / 非第一方提供商 / Gateway 模式 |
| **Datadog 事件日志** | 第一方用户默认可用，按事件 allowlist 发送 | 同 1P 条件（`Jj()` 为 true 则 Datadog 初始化被跳过）；实际发送还要求 API provider 为 `firstParty` 且事件名在 allowlist 内 |
| **Datadog 错误追踪** | 第一方官方 base URL 默认可用 | `DISABLE_ERROR_REPORTING` / `DISABLE_TELEMETRY=1` / `DO_NOT_TRACK=1` / `CLAUDE_CODE_DISABLE_NONESSENTIAL_TRAFFIC=1` / 非第一方 provider / 非官方 Anthropic base URL |
| **BYOC 环境下的 Datadog** | 默认关 | `CLAUDE_CODE_ENVIRONMENT_KIND=byoc` 时默认禁用，除非显式设置 `CLAUDE_CODE_BYOC_ENABLE_DATADOG=1` |
| **第三方 OpenTelemetry exporter** | 默认关 | 需显式设置 `CLAUDE_CODE_ENABLE_TELEMETRY=1` 才开启 |
| **内部 BigQuery metrics** | 对部分第一方/API 客户或 Team/Enterprise 用户可开启 | `DISABLE_TELEMETRY=1` / `DO_NOT_TRACK=1` / `CLAUDE_CODE_DISABLE_NONESSENTIAL_TRAFFIC=1` 会关闭 |
| **Beta Tracing** | 默认关 | 需设置 `BETA_TRACING_ENDPOINT` 环境变量才开启 |

---

### 1.4 如何验证遥测是否已禁用

#### 方法一：检查环境变量

```bash
# 确认变量已设置
echo $DISABLE_TELEMETRY
echo $DO_NOT_TRACK
echo $CLAUDE_CODE_DISABLE_NONESSENTIAL_TRAFFIC
```

#### 方法二：观察网络流量

```bash
# 使用 strace 监控网络连接（Linux）
strace -e trace=connect -f claude 2>&1 | grep -E '(datadoghq|sentry|segment|anthropic.com/v1)'

# 或使用 mitmproxy / Wireshark 抓包分析
# 禁用成功时不应看到以下域名的请求：
#   - a-api.anthropic.com/v1 (1P 事件)
#   - http-intake.logs.us5.datadoghq.com (CLI Datadog 事件日志)
#   - browser-intake-us5-datadoghq.com (CLI Datadog 错误追踪)
#   - browser-intake-datadoghq.com (Android Datadog)
#   - api.segment.io (Segment 诊断)
```

#### 方法三：检查 Datadog 初始化日志

Datadog 初始化函数在 `Jj()` 为 true 时直接返回 false：

```js
// 0432_trackDatadogEvent...js:152
initializeDatadog = TEr(async () => {
    if (Jj() || lji()) {
        Bnn = false;
        return false;  // ← 禁用时不会初始化 Datadog SDK
    }
    // ...
});
```

可以开启 Node.js 调试日志来确认：

```bash
NODE_DEBUG=http,https DISABLE_TELEMETRY=1 claude 2>&1 | head -50
```

#### 方法四：不要把安全模式当作遥测开关

安全模式（`CLAUDE_CODE_SAFE_MODE=1` 或 `--safe-mode`）会限制部分功能，但不在 `xTs()` / `yye()` / `Jj()` 的遥测禁用链路中，不能作为遥测是否关闭的验证依据：

```bash
claude --safe-mode
```

---

## 二、Android App 关闭遥测的方法

> ⚠️ **重要前提**：Claude Android 应用 **没有内置的遥测禁用开关**。反编译代码中搜索 `telemetry_opt`、`opt_out`、`analytics_enabled`、`tracking_enabled` 等关键词均无匹配。所有遥测 SDK（Segment、Datadog、Sentry、Sift、Firebase）常驻运行，无法通过应用设置关闭。

因此，只能通过网络层拦截来阻止遥测数据发出。以下是三种方案。

---

### 方法一：修改 hosts 文件（需 Root）

#### 原理

通过在 `/etc/hosts` 中将遥测域名指向 `127.0.0.1` 或 `0.0.0.0`，使应用无法解析到真实的遥测服务器 IP，从而阻断数据上传。

#### 完整 hosts 条目列表

```hosts
# === Claude Android App 遥测屏蔽 ===
# 来源：claude_reverse 反编译分析

# --- Segment 事件上报（Anthropic 自有域名代理） ---
# 101 个自定义 AnalyticsEvent + IdentifyEvent + ScreenEvent
# 均经此域名转发（Segment API Host 已从默认 api.segment.io 改写为 a-api.anthropic.com）
0.0.0.0 a-api.anthropic.com

# --- Segment 配置拉取（Anthropic 自有域名代理） ---
# Segment SDK 的 settings/integrations 配置下发
0.0.0.0 a-cdn.anthropic.com

# --- Datadog RUM/APM/Logs ---
# US1 主站点（实际使用站点）
0.0.0.0 browser-intake-datadoghq.com

# Datadog 备选站点（全部列出，防止回退）
0.0.0.0 browser-intake-datadoghq.eu
0.0.0.0 browser-intake-ddog-gov.com
0.0.0.0 browser-intake-us2-ddog-gov.com
0.0.0.0 browser-intake-datad0g.com
0.0.0.0 browser-intake-us3-datadoghq.com
0.0.0.0 browser-intake-us5-datadoghq.com
0.0.0.0 browser-intake-ap1-datadoghq.com
0.0.0.0 browser-intake-ap2-datadoghq.com

# --- Sift Science 反欺诈 ---
# 上传设备属性（Android ID、型号、Root 检测等）和应用状态
0.0.0.0 api3.siftscience.com

# --- Sentry 崩溃报告 ---
# 崩溃堆栈、ANR、性能 Transaction
0.0.0.0 o1158394.ingest.us.sentry.io

# --- Google Analytics (Firebase Analytics) ---
# 分析事件上报 (first_open, session_start, user_engagement 等)
0.0.0.0 app-measurement.com

# --- Segment SDK 内部诊断 ---
# RemoteMetric 调用计数/错误计数（唯一直接发往 Segment 官方的数据）
0.0.0.0 api.segment.io

# --- Firebase 安装 ID ---
# FID 注册和认证 token 获取
0.0.0.0 firebaseinstallations.googleapis.com
```

#### ⛔ 不要屏蔽的域名

| 域名 | 用途 | 为什么不能屏蔽 |
|------|------|----------------|
| `api.anthropic.com` | MCP 服务器目录 + 核心功能 API | 屏蔽会导致 MCP 功能无法使用，且此域名不是遥测端点 |
| `www.anthropic.com` | 静态法律页面 | 纯静态内容，不涉及遥测 |
| `privacy.anthropic.com` | 隐私政策页面 | 纯静态内容 |
| `support.anthropic.com` | 支持页面 | 纯静态内容 |
| `claude.ai` / `www.claude.ai` | 应用主服务 | 屏蔽将导致应用完全无法使用 |

#### 操作步骤

1. **确认设备已 Root**（需 Magisk、KernelSU 或其他 Root 方案）
2. **使用 Root 文件管理器或 adb 修改 hosts**：

```bash
# 方式一：adb push
adb root
adb remount
adb pull /etc/hosts ./hosts
# 编辑 hosts 文件，添加上述条目
adb push ./hosts /etc/hosts

# 方式二：直接在设备上编辑
adb shell
su
echo "0.0.0.0 a-api.anthropic.com" >> /etc/hosts
# ... 添加其余条目
```

3. **刷新 DNS 缓存**：

```bash
# 重启设备最可靠
adb reboot

# 或尝试刷新 DNS（部分设备支持）
adb shell ndc resolver flushdefaultif
```

4. **验证屏蔽效果**：打开 Claude App 正常使用，同时用抓包工具（如 Charles、mitmproxy）确认上述域名的请求均被阻断。

#### ⚠️ 注意事项

- **a-api.anthropic.com 同时承载遥测和部分核心功能**。屏蔽此域名可能影响某些非聊天功能的 API 调用（如 BatchEventLogging）。如果发现功能异常，可以尝试只保留 Datadog/Sentry/Sift/app-measurement 等第三方域名的屏蔽条目，而暂时解除对 `a-api.anthropic.com` 的屏蔽。
- Android 系统的 hosts 文件位置可能因版本不同而不同（`/etc/hosts`、`/system/etc/hosts`、`/vendor/etc/hosts`）。
- 系统更新可能覆盖 hosts 文件，建议使用 Magisk 模块（如 MagiskHide Props Config）持久化修改。
- Sift Science 的 Root 检测会上报 Root 状态，但屏蔽 Sift 域名后该数据无法上传。

#### 优缺点

| 优点 | 缺点 |
|------|------|
| 全局生效，所有网络请求都会查询 hosts | 需要 Root 权限 |
| 不需要额外 App | 系统更新可能覆盖 |
| 对所有 App 生效 | 会影响所有 App 对这些域名的访问，可能误伤非遥测功能（特别是 a-api.anthropic.com） |
| 配置简单直观 | 无法按 App 精细控制 |

---

### 方法二：VPN 拦截按 App 按域名过滤（推荐，无需 Root）

#### 原理

利用 Android 的 VpnService API 创建本地 VPN，在网络层拦截指定 App 的 DNS 请求和流量，按域名过滤。无需 Root，且可以只针对 Claude App 屏蔽，其他 App 不受影响。

#### 推荐工具：NetGuard

[NetGuard](https://github.com/M66B/NetGuard) 是开源的 Android 防火墙 App，支持基于 VPN 的流量过滤。

#### 配置步骤

1. **安装 NetGuard**：

从 [F-Droid](https://f-droid.org/en/packages/eu.faircode.netguard/) 或 [GitHub Releases](https://github.com/M66B/NetGuard/releases) 下载安装。**不要使用 Play Store 版本**（因 Google 政策限制，Play Store 版本不含域名过滤功能）。

2. **启用域名过滤**：

```
设置 → 高级选项 → 域名过滤 → ✅ 启用
设置 → 高级选项 → 自动启用 → ✅ 启用（可选，开机自启）
```

3. **配置 Claude App 的域名黑名单**：

```
1. 打开 NetGuard，找到 "Claude" 应用
2. 点击 Claude 应用名称，进入应用级设置
3. 确保 Claude 的 WiFi 和移动网络权限为 ✅（允许联网，否则 App 无法使用）
4. 切换到"域名"标签页
5. 添加以下域名到黑名单（拦截模式）：
```

**需要添加到黑名单的域名：**

```
a-api.anthropic.com
a-cdn.anthropic.com
browser-intake-datadoghq.com
browser-intake-datadoghq.eu
browser-intake-ddog-gov.com
browser-intake-us2-ddog-gov.com
browser-intake-datad0g.com
browser-intake-us3-datadoghq.com
browser-intake-us5-datadoghq.com
browser-intake-ap1-datadoghq.com
browser-intake-ap2-datadoghq.com
api3.siftscience.com
o1158394.ingest.us.sentry.io
app-measurement.com
api.segment.io
firebaseinstallations.googleapis.com
```

4. **启动 NetGuard VPN**：

点击 NetGuard 主界面的开关，启用 VPN。系统会弹出 VPN 连接确认对话框，点击"确定"。

5. **验证效果**：

打开 Claude App 正常使用聊天功能，同时观察 NetGuard 的日志（设置 → 显示日志），确认上述域名的请求被拦截。

#### ⚠️ 关于 a-api.anthropic.com 的特殊说明

`a-api.anthropic.com` 同时用于：
- **遥测**：Segment 事件上报（API Host 重写）、BatchEventLoggingRequest
- **部分功能 API**：可能有其他非遥测的 API 调用

如果屏蔽 `a-api.anthropic.com` 后 Claude App 功能异常，建议：
1. 先屏蔽除 `a-api.anthropic.com` 和 `a-cdn.anthropic.com` 之外的所有域名
2. 确认 App 功能正常
3. 再尝试逐步屏蔽 `a-cdn.anthropic.com`（Segment 配置，风险较低）
4. 最后评估是否屏蔽 `a-api.anthropic.com`

#### 其他可选 VPN 过滤工具

| 工具 | 特点 | Root 需求 |
|------|------|-----------|
| **NetGuard** | 开源，按 App + 按域名过滤，F-Droid 版本功能完整 | ❌ 无需 |
| **TrackerControl** | 基于 NetGuard，专注于追踪器屏蔽，内置追踪器列表 | ❌ 无需 |
| **RethinkDNS** | 开源，DNS-over-HTTPS + 防火墙，支持自定义域名规则 | ❌ 无需 |
| **Blokada** | 开源，DNS 级别拦截，支持自定义 hosts 列表 | ❌ 无需 |
| **AdGuard** | 商业软件，功能完善，按 App 按域名过滤 | ❌ 无需 |

#### 优缺点

| 优点 | 缺点 |
|------|------|
| **无需 Root** | VPN 常驻运行，轻微增加耗电 |
| 按 App 精细控制，不影响其他 App | 需要安装额外 App |
| 可随时开关，灵活 | NetGuard F-Droid 版才支持域名过滤 |
| 域名黑名单/白名单模式 | 与其他 VPN 不能同时使用（Android 限制） |
| 支持实时日志查看拦截情况 | 部分设备可能需要排除 Claude App 的电池优化 |

---

### 方法三：AdAway（需 Root）

#### 原理

[AdAway](https://github.com/AdAway/AdAway) 是专为广告和追踪器屏蔽设计的开源 hosts 管理工具。它通过修改系统 hosts 文件或使用 VPN 模式来拦截域名。

#### 操作步骤

1. **安装 AdAway**：

从 [F-Droid](https://f-droid.org/en/packages/org.adaway/) 下载安装。需 Root 权限。

2. **添加自定义 hosts 源**：

```
菜单 → 主机源 → 添加自定义源
```

可以创建一个自定义的 hosts 文件托管在本地或私有服务器上，内容包含上述所有遥测域名。

3. **手动添加重定向规则**：

```
菜单 → 主机重定向 → 添加

逐一添加以下域名的重定向规则（目标：127.0.0.1）：
```

| 域名 | 用途说明 |
|------|----------|
| `a-api.anthropic.com` | Segment 事件上报 |
| `a-cdn.anthropic.com` | Segment 配置拉取 |
| `browser-intake-datadoghq.com` | Datadog RUM/APM/Logs（US1 主站点） |
| `browser-intake-datadoghq.eu` | Datadog EU1 备选站点 |
| `browser-intake-ddog-gov.com` | Datadog US1_FED 政府站点 |
| `browser-intake-us2-ddog-gov.com` | Datadog US2_FED 政府站点 |
| `browser-intake-datad0g.com` | Datadog Staging 站点 |
| `browser-intake-us3-datadoghq.com` | Datadog US3 站点 |
| `browser-intake-us5-datadoghq.com` | Datadog US5 站点 |
| `browser-intake-ap1-datadoghq.com` | Datadog AP1 站点 |
| `browser-intake-ap2-datadoghq.com` | Datadog AP2 站点 |
| `api3.siftscience.com` | Sift Science 反欺诈 |
| `o1158394.ingest.us.sentry.io` | Sentry 崩溃报告 |
| `app-measurement.com` | Google Analytics |
| `api.segment.io` | Segment 诊断 |
| `firebaseinstallations.googleapis.com` | Firebase 安装 ID |

4. **应用规则**：

```
点击主界面的"启用广告拦截"按钮
```

5. **验证**：

打开 Claude App 使用，确认遥测域名被拦截。可在 AdAway 的日志中查看请求记录。

#### AdAway 的两种模式

| 模式 | 原理 | Root 需求 | 特点 |
|------|------|-----------|------|
| **Hosts 模式** | 直接修改 /etc/hosts | ✅ 需要 | 全局生效，无需 VPN |
| **VPN 模式** | 本地 VPN 拦截 | ❌ 不需要 | 与 NetGuard 类似，可按 App 控制 |

如果已有 Root，推荐 Hosts 模式，避免 VPN 冲突。

#### 优缺点

| 优点 | 缺点 |
|------|------|
| 专为广告/追踪设计，UI 友好 | Hosts 模式需 Root |
| 支持自定义 hosts 源和规则 | Hosts 模式全局生效，无法按 App 控制 |
| 支持自动更新 hosts 规则 | VPN 模式与其他 VPN 冲突 |
| 开源、无广告 | |
| 可导入/导出规则，方便迁移 | |

---

## 三、三种方案对比

| 特性 | Hosts 文件 | VPN 过滤 (NetGuard) | AdAway |
|------|-----------|--------------------|---------| 
| **需要 Root** | ✅ 是 | ❌ 否 | ✅ 是（Hosts 模式）/ ❌ 否（VPN 模式） |
| **按 App 控制** | ❌ 全局 | ✅ 支持 | ❌ 全局（Hosts）/ ✅ 支持（VPN） |
| **与其他 VPN 共存** | ✅ 是 | ❌ 否 | ✅ 是（Hosts）/ ❌ 否（VPN） |
| **持久性** | 可能被系统更新覆盖 | 随 App 运行 | 自动重新应用 |
| **配置难度** | 低 | 中 | 低 |
| **对其他 App 影响** | 会影响所有 App 对这些域名的访问 | 无（按 App 控制） | 会影响所有 App 对这些域名的访问（Hosts）/ 无（按 App 控制，VPN） |
| **推荐场景** | 已 Root，不用 VPN | 未 Root，需要精细控制 | 已 Root，想要管理界面 |

**综合推荐**：
- **未 Root 用户** → 方法二（NetGuard / VPN 过滤），灵活且无需 Root
- **已 Root 用户** → 方法三（AdAway Hosts 模式）或 方法一（直接改 hosts），更轻量
- **最简单方案** → 方法二（NetGuard），一键开关

---

## 四、屏蔽效果预期

成功屏蔽上述域名后，以下遥测数据将无法上传：

| 被阻断的遥测 | 域名 | 数据类型 |
|-------------|------|----------|
| ✅ Segment 事件上报 | `a-api.anthropic.com` | 101 个自定义 AnalyticsEvent + 用户 Traits (account_uuid, email, organization_uuid, subscription_level) |
| ✅ Segment 配置拉取 | `a-cdn.anthropic.com` | Segment SDK settings/integrations |
| ✅ Datadog 性能监控 | `browser-intake-datadoghq.com` / `browser-intake-us5-datadoghq.com` 等 | RUM (View/Action/Resource/Error/Long Task/ANR) + APM Trace + Logs |
| ✅ Sift 反欺诈 | `api3.siftscience.com` | 设备属性 (Android ID, 型号, Root 检测) + GPS (如有权限) + 本地 IP |
| ✅ Sentry 崩溃报告 | `o1158394.ingest.us.sentry.io` | 崩溃堆栈、ANR Tombstone、View Hierarchy |
| ✅ Google Analytics | `app-measurement.com` | first_open, session_start, user_engagement 等 |
| ✅ Segment 诊断 | `api.segment.io` | SDK 内部 RemoteMetric |
| ✅ Firebase 安装 ID | `firebaseinstallations.googleapis.com` | FID 注册和 token |

**不受影响的功能**：

| 功能 | 域名 | 说明 |
|------|------|------|
| ✅ 聊天/对话 | `claude.ai` / `api.anthropic.com` | 核心功能不受影响 |
| ✅ MCP 服务器目录 | `api.anthropic.com/api/directory/servers` | 不在屏蔽列表 |
| ✅ 推送通知 | Firebase Cloud Messaging | FCM 走 Google Play Services，与 Firebase Installations 分离 |

---

## 五、附录

### A. Claude Android App 遥测架构一览

```
┌──────────────────────────────────────────────────────────────┐
│                   Claude Android App                         │
├──────────────────────────────────────────────────────────────┤
│                                                              │
│  ┌──────────────┐  ┌──────────────┐  ┌────────────────────┐ │
│  │ AnalyticsEvent│  │ Segment SDK  │  │ BatchEventLogReq   │ │
│  │ (101 custom) │─▶│ (API→a-api)  │  │ (event_logging/v2) │ │
│  └──────────────┘  └──────────────┘  └────────────────────┘ │
│         │                 │                      │            │
│         ▼                 ▼                      ▼            │
│  ┌─────────────────────────────────────────────────────┐     │
│  │        a-api.anthropic.com (Anthropic 自有服务器)     │     │
│  └─────────────────────────────────────────────────────┘     │
│                                                              │
│  ┌────────────┐  ┌────────────┐  ┌──────────────────────┐  │
│  │ Datadog    │  │ Sentry     │  │ Sift Science         │  │
│  │ RUM/APM    │  │ Crash      │  │ Anti-fraud           │  │
│  └────────────┘  └────────────┘  └──────────────────────┘  │
│       │               │                    │                 │
│       ▼               ▼                    ▼                 │
│  browser-intake-  o1158394.ingest.    api3.siftscience.     │
│  datadoghq.com    us.sentry.io        com                   │
│                                                              │
│  ┌────────────┐  ┌──────────────────┐                       │
│  │ Firebase   │  │ Google Analytics │                       │
│  │ Installations│ │                  │                       │
│  └────────────┘  └──────────────────┘                       │
│       │                    │                                 │
│       ▼                    ▼                                 │
│  firebaseinstallations.  app-measurement.com                 │
│  googleapis.com                                              │
└──────────────────────────────────────────────────────────────┘
```

### B. CLI 关键环境变量速查表

| 环境变量 | 作用 | 默认值 |
|----------|------|--------|
| `DISABLE_TELEMETRY` | 禁用 1P 遥测 + Datadog + 内部 BigQuery metrics | — |
| `DO_NOT_TRACK` | 禁用 1P 遥测 + Datadog + 内部 BigQuery metrics (truthy) | — |
| `CLAUDE_CODE_DISABLE_NONESSENTIAL_TRAFFIC` | 禁用所有非必要流量 | — |
| `CLAUDE_CODE_ENABLE_TELEMETRY` | 启用第三方 OTel exporter，不控制内部 BigQuery metrics | — |
| `CLAUDE_CODE_PROVIDER_MANAGED_BY_HOST` | 豁免第三方提供商的遥测禁用 | — |
| `CLAUDE_CODE_ENVIRONMENT_KIND` | `byoc` 时额外限制 Datadog | — |
| `CLAUDE_CODE_BYOC_ENABLE_DATADOG` | BYOC 环境下启用 Datadog | — |
| `CLAUDE_CODE_SAFE_MODE` | 安全模式 | — |

### C. 参考文档

- `telemetry_analysis.md` — CLI 遥测系统完整技术分析
- `telemetry_analysis_report.md` — Android APK 自身遥测代码分析报告
- `telemetry_url_inventory.md` — Android APK 遥测目标 URL/Host 完整清单
- `sensitive_data_analysis.md` — 敏感数据采集深度分析补充报告
