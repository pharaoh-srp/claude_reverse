# Claude Code CLI 遥测系统分析

> 版本：2.1.198 (Build: 2026-07-01, GIT_SHA: b80c4964)
> 分析日期：2026-07-04
> 数据来源：cli_split 反编译代码

---

## 一、遥测开关如何设置

### 1.1 1P 事件日志（核心遥测通道）

**控制函数**：`is1PEventLoggingEnabled()` → 位于 `0185_shutdown1PEventLogging...js:55`

```js
function is1PEventLoggingEnabled() {
    return !Jj();
}
```

**`Jj()` 的定义**：位于 `core/0181_jHi.js:616`

```js
function Jj() {
    return j4d() || getGatewayAuth() !== null || yye();
}
```

即，**1P 遥测被禁用**（`Jj()` 返回 true）当以下任一条件成立：

| 条件 | 函数 | 含义 |
|------|------|------|
| `j4d()` 为 true | `core/0181_jHi.js:607` | 非第一方提供商 (非 firstParty) 且未被 `CLAUDE_CODE_PROVIDER_MANAGED_BY_HOST` 豁免 |
| `getGatewayAuth() !== null` | — | 使用了 Gateway 认证（企业网关模式） |
| `yye()` 为 true | `auth/0022...js:290` | 流量模式非 default（即用户设置了禁用遥测） |

### 1.2 流量模式判定（`xTs()`）

**位置**：`auth/0022_preservableScopesFrom...js:275`

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

**`yye()`** = `xTs() !== "default"`，即只要设置了以下任一环境变量，1P 遥测就会被禁用：

| 环境变量 | 效果 | 流量模式 |
|----------|------|----------|
| `CLAUDE_CODE_DISABLE_NONESSENTIAL_TRAFFIC` | 禁用所有非必要流量 | `"essential-traffic"` |
| `DISABLE_TELEMETRY` | 禁用遥测 | `"no-telemetry"` |
| `DO_NOT_TRACK` (truthy) | 禁用遥测 | `"no-telemetry"` |

### 1.3 Datadog 遥测通道

**控制函数**：`shouldTrackDatadog()` → 位于 `tools/0296...js:4573`

```js
function shouldTrackDatadog() {
    if (V4e("datadog")) {   // 检查 tengu_frond_boric["datadog"] === true → 远程 kill switch
        return false;
    }
    try {
        return getFeatureValue_CACHED_MAY_BE_STALE("tengu_log_datadog_events", false);
    } catch {
        return false;
    }
}
```

Datadog 的双重控制：
1. **远程 kill switch**：`V4e("datadog")` 检查 GrowthBook 动态配置 `tengu_frond_boric` 中 `datadog` 是否为 true（见 `tools/0184...js:1331`）
2. **Feature flag**：`tengu_log_datadog_events` 需要为 true（GrowthBook 远程配置）
3. **1P 条件**：`trackDatadogEvent()` 还要求 `getAPIProvider() === "firstParty"`

**Datadog 初始化**也受 `Jj()` 控制：

```js
// 0432_trackDatadogEvent...js:152
initializeDatadog = TEr(async () => {
    if (Jj() || lji()) {   // Jj()=1P disabled, lji()=BYOC without DD enabled
        Bnn = false;
        return false;
    }
    // ...
});
```

**`lji()`** 额外条件：`auth/0022...js` → BYOC 环境下除非显式启用 Datadog

```js
function lji() {
    return process.env.CLAUDE_CODE_ENVIRONMENT_KIND === "byoc" && !st(process.env.CLAUDE_CODE_BYOC_ENABLE_DATADOG);
}
```

### 1.4 第三方 OpenTelemetry 遥测

**控制函数**：`isTelemetryEnabled()` → 位于 `0339_parseOtelHeaders...js:292`

```js
function isTelemetryEnabled() {
    return st(process.env.CLAUDE_CODE_ENABLE_TELEMETRY);
}
```

**第三方 OTel 需要显式启用**，通过设置 `CLAUDE_CODE_ENABLE_TELEMETRY=1`。

### 1.5 远程 kill switch（`V4e()`）

**位置**：`tools/0184...js:1331`

```js
function V4e(e) {
    return getDynamicConfig_CACHED_MAY_BE_STALE("tengu_frond_boric", {})?.[e] === true;
}
```

GrowthBook 动态配置 `tengu_frond_boric` 可以远程关闭特定遥测通道：
- `V4e("firstParty")` → 关闭 1P 事件日志（`isKilled` 回调）
- `V4e("datadog")` → 关闭 Datadog 事件上报

### 1.6 安全模式

```js
// 0004_profileReport...js:441
function Ql() {
    return st(process.env.CLAUDE_CODE_SAFE_MODE) || nCr("--safe-mode");
}
```

安全模式 (`CLAUDE_CODE_SAFE_MODE` 或 `--safe-mode`) 会限制部分功能，但不是遥测的主开关。

### 开关总结表

| 遥测通道 | 默认状态 | 关闭方式 |
|----------|----------|----------|
| **1P 事件日志** | 第一方用户默认开 | `DISABLE_TELEMETRY=1` / `DO_NOT_TRACK=1` / `CLAUDE_CODE_DISABLE_NONESSENTIAL_TRAFFIC=1` / 使用非第一方提供商 / Gateway 模式 |
| **Datadog** | 第一方用户 + feature flag 开 | 同上 + GrowthBook `tengu_frond_boric.datadog=true` + `tengu_log_datadog_events=false` |
| **第三方 OTel** | 默认关 | 需 `CLAUDE_CODE_ENABLE_TELEMETRY=1` 开启 |
| **Beta Tracing** | 默认关 | 需 `BETA_TRACING_ENDPOINT` 环境变量 |

---

## 二、遥测触发条件

### 2.1 启动时触发

#### (a) `bootstrapTelemetry()`
**位置**：`0339_parseOtelHeaders...js:24`
**时机**：在 `initializeTelemetry()` 内部最先调用

- 设置全局 context manager
- 设置 `OTEL_EXPORTER_OTLP_METRICS_TEMPORALITY_PREFERENCE=delta`
- 如果 `Tx()` 为 true（beta tracing 模式），初始化 TracerProvider/LoggerProvider

#### (b) `initialize1PEventLogging()`
**位置**：`0185_shutdown1PEventLogging...js:168`
**时机**：在 `init()` 函数中异步调用（`0444_initReplBridge.js:2574`）

```js
// init() 内部 (0444_initReplBridge.js:2572-2577)
Promise.all([
    Promise.resolve().then(() => (BF(), z4e)),   // 1P event logging 模块
    Promise.resolve().then(() => ($n(), aDn))     // GrowthBook 模块
]).then(([s, i]) => {
    s.initialize1PEventLogging();
    i.onGrowthBookRefresh(() => {
        s.reinitialize1PEventLoggingIfConfigChanged();
    });
});
```

关键参数（来自 GrowthBook 动态配置 `tengu_1p_event_batch_config`）：
- `scheduledDelayMillis`：批量发送间隔，默认 `OTEL_LOGS_EXPORT_INTERVAL` 环境变量或 **10000ms**
- `maxExportBatchSize`：默认 200
- `maxQueueSize`：默认 8192
- `skipAuth`：是否跳过认证
- `baseUrl`/`path`：1P 日志端点

#### (c) `initializeTelemetryAfterTrust()`
**位置**：`0444_initReplBridge.js:2455`
**时机**：在 CLI 子命令处理中调用（`0500_parseKindArgs...js:3385`）

```js
// 0500_parseKindArgs...js:3385
applyConfigEnvironmentVariables();
initializeTelemetryAfterTrust();
```

逻辑：
- 如果有远程托管设置（`RCo()`），先等待远程设置加载，再初始化 OTel
- 否则立即初始化 OTel
- 如果是非交互式会话 + beta tracing，提前初始化

#### (d) `initializeAnalyticsSink()`
**位置**：`tools/0296...js:4624`
**时机**：在 `initSinks()` 中调用（`0415_initSinks.js:6`）

```js
function initializeAnalyticsSink() {
    attachAnalyticsSink({
        logEvent: t3p,      // 同步日志 → 检查采样 → Datadog + 1P
        logEventAsync: n3p   // 异步日志 → 检查采样 → Datadog + 1P
    });
}
```

将 analytics sink 注册到全局 `Kln` 状态，之后所有 `logEvent()` / `logEventAsync()` 调用都会走此 sink。

### 2.2 事件驱动触发

#### `logEvent()` / `logEventTo1P()` 的调用模式

核心调用链：
```
logEvent(eventName, metadata)
  → Kln.sink.logEvent(eventName, metadata)    // 如果 sink 已就绪
    → t3p(eventName, metadata)                 // initializeAnalyticsSink 注册的 sink
      → shouldSampleEvent(eventName)           // 采样检查
      → shouldTrackDatadog() → trackDatadogEvent()  // Datadog 通道
      → logEventTo1P(eventName, metadata)      // 1P 事件通道
```

**采样机制**：`shouldSampleEvent()` → `0185...js:18`

```js
function shouldSampleEvent(e) {
    let n = getEventSamplingConfig()[e];  // tengu_event_sampling_config
    if (!n) return null;       // 无配置 = 不采样，正常上报
    let r = n.sample_rate;
    if (r >= 1) return null;   // 采样率 100% = 不采样，正常上报
    if (r <= 0) return 0;      // 采样率 0% = 完全不上报
    return Math.random() < r ? r : 0;  // 概率采样
}
```

#### 已发现的事件触发点

| 事件名 | 触发时机 | 代码位置 |
|--------|----------|----------|
| `tengu_startup_telemetry` | CLI 启动后 | `0500...js:1651` |
| `tengu_init` | 初始化完成 | `0500...js:4575` |
| `tengu_exit` | 退出时 | `0439...js:166` |
| `tengu_api_success` | API 请求成功 | `0345...js:853` |
| `tengu_api_error` | API 请求失败 | Datadog 白名单 |
| `tengu_api_before_normalize` | API 请求预处理 | `0429...js:1028` |
| `tengu_api_after_normalize` | API 请求后处理 | `0429...js:1081` |
| `tengu_api_slow_first_byte` | 首字节慢 | `0429...js:1775` |
| `tengu_cancel` | 用户取消 | DD 白名单 |
| `tengu_tool_use_success/error` | 工具使用 | DD 白名单 |
| `tengu_ext_installed` | IDE 扩展安装 | `tools/0296...js:453` |

### 2.3 定时/周期触发

#### (a) Datadog 批量刷新
**位置**：`0432_trackDatadogEvent...js:128-129`

```js
function e_f() {
    return parseInt(process.env.CLAUDE_CODE_DATADOG_FLUSH_INTERVAL_MS || "", 10) || 15000;
}
```

- **默认 15 秒**刷新一次（`CLAUDE_CODE_DATADOG_FLUSH_INTERVAL_MS` 可覆盖）
- 缓冲区满 100 条时立即刷新
- 使用 `setTimeout().unref()` 不阻止进程退出

#### (b) 1P 事件批量导出
**位置**：`0185...js:176`

```js
let n = t.scheduledDelayMillis || R7(process.env.OTEL_LOGS_EXPORT_INTERVAL, 10000);
```

- **默认 10 秒**批量导出（`OTEL_LOGS_EXPORT_INTERVAL` 可覆盖）
- 最大批量 200 条，队列上限 8192

#### (c) 第三方 OTel 指标导出
**位置**：`0339...js:136`

```js
let t = R7(process.env.OTEL_METRIC_EXPORT_INTERVAL, 60000);
```

- **默认 60 秒**导出指标（`OTEL_METRIC_EXPORT_INTERVAL` 可覆盖）

#### (d) BigQuery 指标
**位置**：`0339...js:296-300`

```js
function Pdm() {
    let e = new aRo();
    return new k1e.PeriodicExportingMetricReader({
        exporter: e,
        exportIntervalMillis: 300000   // 5 分钟
    });
}
```

- **5 分钟**导出一次，仅限企业/团队订阅 + 第一方 API 客户

#### (e) Beta Tracing 周期
- Span 处理器 `scheduledDelayMillis: 5000`（5 秒）
- Logger 处理器 `scheduledDelayMillis: 5000`（5 秒）

### 2.4 进程退出时触发

**位置**：`0339...js:102-109`、`0275_setupGracefulShutdown...js:650-661`

```js
process.on("beforeExit", async () => {
    await s.forceFlush().catch(() => {});
    await r.forceFlush().catch(() => {});
});
process.on("exit", () => {
    s.forceFlush().catch(() => {});
    r.forceFlush().catch(() => {});
});
```

`flushAnalyticsSinks()` 汇总刷新三个通道：
```js
async function flushAnalyticsSinks() {
    let [e, t, n] = await Promise.all([
        shutdown1PEventLogging(),
        shutdownDatadog(),
        shutdownErrorTracking()
    ]);
    await Promise.race([Promise.all([e, t, n]), sleep(500)]);
}
```

---

## 三、关键环境变量汇总

| 环境变量 | 作用 | 默认值 |
|----------|------|--------|
| `DISABLE_TELEMETRY` | 禁用 1P 遥测 + Datadog | — |
| `DO_NOT_TRACK` | 禁用 1P 遥测 + Datadog (truthy) | — |
| `CLAUDE_CODE_DISABLE_NONESSENTIAL_TRAFFIC` | 禁用非必要流量（含遥测） | — |
| `CLAUDE_CODE_ENABLE_TELEMETRY` | 启用第三方 OTel 遥测 | — |
| `CLAUDE_CODE_SAFE_MODE` / `--safe-mode` | 安全模式 | — |
| `CLAUDE_CODE_PROVIDER_MANAGED_BY_HOST` | 豁免第三方提供商的遥测禁用 | — |
| `CLAUDE_CODE_ENVIRONMENT_KIND` | `byoc` 时额外限制 Datadog | — |
| `CLAUDE_CODE_BYOC_ENABLE_DATADOG` | BYOC 环境下启用 Datadog | — |
| `CLAUDE_CODE_DATADOG_FLUSH_INTERVAL_MS` | Datadog 刷新间隔 | 15000 |
| `OTEL_LOGS_EXPORT_INTERVAL` | 1P 日志导出间隔 | 10000 |
| `OTEL_METRIC_EXPORT_INTERVAL` | OTel 指标导出间隔 | 60000 |
| `OTEL_TRACES_EXPORT_INTERVAL` | OTel 追踪导出间隔 | 5000 |
| `OTEL_METRICS_EXPORTER` | 第三方指标导出器类型 | — |
| `OTEL_LOGS_EXPORTER` | 第三方日志导出器类型 | — |
| `OTEL_TRACES_EXPORTER` | 第三方追踪导出器类型 | — |
| `OTEL_EXPORTER_OTLP_ENDPOINT` | OTel 端点 | — |
| `OTEL_EXPORTER_OTLP_HEADERS` | OTel 认证头 | — |
| `BETA_TRACING_ENDPOINT` | Beta 追踪端点 | — |
| `CLAUDE_CODE_OTEL_SHUTDOWN_TIMEOUT_MS` | OTel 关闭超时 | 2000 |
| `CLAUDE_CODE_OTEL_FLUSH_TIMEOUT_MS` | OTel 刷新超时 | 5000 |

---

## 四、远程配置 Feature Flags

| Flag 名称 | 作用 |
|-----------|------|
| `tengu_frond_boric` | 远程 kill switch 对象，`datadog=true` 关闭 DD，`firstParty=true` 关闭 1P |
| `tengu_log_datadog_events` | Datadog 事件上报开关 |
| `tengu_1p_event_batch_config` | 1P 事件批量配置（间隔、大小、端点等） |
| `tengu_event_sampling_config` | 事件采样配置（per-event sample_rate） |

---

## 五、代码位置索引

| 功能 | 文件（cli_split/ 下） | 行号 |
|------|----------------------|------|
| 1P 事件日志初始化 | `cli/0185_shutdown1PEventLogging...js` | 168 |
| 1P 日志开关 `Jj()` | `core/0181_jHi.js` | 616 |
| 非第一方判断 `j4d()` | `core/0181_jHi.js` | 607 |
| BYOC Datadog 限制 `lji()` | `core/0181_jHi.js` | 613 |
| 流量模式 `xTs()` | `auth/0022_preservableScopesFrom...js` | 275 |
| 远程 kill switch `V4e()` | `tools/0184_SEND_USER_FILE...js` | 1331 |
| OTel 初始化 | `cli/0339_parseOtelHeaders...js` | 310 |
| OTel 开关 `isTelemetryEnabled()` | `cli/0339_parseOtelHeaders...js` | 292 |
| Beta tracing | `cli/0339_parseOtelHeaders...js` | 114 |
| Datadog 初始化 | `cli/0432_trackDatadogEvent...js` | 152 |
| Datadog 开关 | `tools/0296_shouldTrackDatadog...js` | 4573 |
| Analytics sink 注册 | `tools/0296_shouldTrackDatadog...js` | 4624 |
| 事件采样 | `cli/0185_shutdown1PEventLogging...js` | 18 |
| 通用 logEvent | `cli/0004_profileReport...js` | 51 |
| flushAnalyticsSinks | `cli/0275_setupGracefulShutdown...js` | 650 |
| init() 中启动 1P | `cli/0444_initReplBridge.js` | 2574 |
| initializeTelemetryAfterTrust | `cli/0444_initReplBridge.js` | 2455 |
| CLI 子命令触发遥测 | `cli/0500_parseKindArgs...js` | 3385 |
| API provider 判断 | `api/0118_usesFirstPartyModelIds...js` | 9395 |
