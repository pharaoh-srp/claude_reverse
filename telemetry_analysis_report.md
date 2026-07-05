# Anthropic Claude Android APK — 自身遥测代码分析报告

**APK**: `/home/ubuntu/claude_reverse/claude.apk`  
**反编译工具**: jadx 1.5.5  
**分析日期**: 2026-07-04  
**范围**: Anthropic 自身遥测代码，排除 Firebase/Google/Crashlytics 等标准第三方 SDK

---

## 一、遥测架构总览

Anthropic Claude Android 应用使用了 **双层遥测架构**：

| 层级 | 组件 | 发送方式 | 端点 |
|------|------|----------|------|
| **第一层：Anthropic 自有事件系统** | `AnalyticsEvent` 接口 + `EventLoggingRequest` | 直接 POST 到 Anthropic API | `a-api.anthropic.com/v1` |
| **第二层：Segment 中继** | Segment Analytics Kotlin SDK | 转发到 Segment，再分发到各下游 | `a-api.anthropic.com/v1`（自定义 API Host，非 Segment 默认） |

**关键发现**：Segment SDK 的 API Host 被改写为 `a-api.anthropic.com/v1`（非默认的 `api.segment.io/v1`），CDN Host 为 `a-cdn.anthropic.com/v1`。这意味着 **Segment 数据也经过 Anthropic 自己的服务器**。

---

## 二、Anthropic 自有事件系统（第一层）

### 2.1 事件定义框架

- **接口**: `com.anthropic.claude.analytics.events.AnalyticsEvent`
- **多态序列化**: 使用 `@SerialName(discriminator = "eventName")` 进行多态序列化
- **事件总数**: **101 个**独立事件类型
- **事件命名规范**: `claudeai.{domain}.{action}`

### 2.2 事件分类及完整列表

#### 聊天/消息 (Chat/Message)
```
claudeai.message.sent
claudeai.message.perceived_ttft
claudeai.message.response_complete
claudeai.message.response_failed
claudeai.message.streaming_abandoned
claudeai.chat.model.selected
claudeai.chat.model_change.viewed
claudeai.chat.model_change.dismissed
claudeai.chat.model_selector_sheet.viewed
claudeai.chat.refusal.viewed
claudeai.chat.safeguards_learn_more.tapped
claudeai.chat.busy_container_send_retry.completed
```

#### 代码编辑器 (Code)
```
claudeai.code.session.ttft
claudeai.code.session.init_breakdown
claudeai.code.session_stream.connect_result
claudeai.code.session_stream.connect_stalled
claudeai.code.session_filter.selected
claudeai.code.session_list.opened
claudeai.code.session_list.peeked
claudeai.code.session_pip.started
claudeai.code.session_pip.ended
claudeai.code.agent_session.created
claudeai.code.add_context.viewed
claudeai.code.attachments.added
claudeai.code.attachment.markup_opened
claudeai.code.attachment.markup_committed
claudeai.code.attachment.reordered
claudeai.code.message_action.clicked
claudeai.code.model_selector.viewed
claudeai.code.model_selector.selected
claudeai.code.model_selector.persist_failed
claudeai.code.prompt_suggestion.shown
claudeai.code.prompt_suggestion.received
claudeai.code.prompt_suggestion.sent
claudeai.code.prompt_suggestion.outcome
claudeai.code.refusal_fallback_prompt.shown
claudeai.code.refusal_fallback_prompt.answered
claudeai.code.refusal_fallback_prompt.withdrawn
claudeai.code.refusal_fallback_prompt.response_failed
claudeai.code.pull_request.opened
claudeai.code.radio.closed
claudeai.code.slash_command.invoked
claudeai.code.tool_payload.prettified
claudeai.code.user_dialog.auto_cancelled
claudeai.code.auto_default_mode.applied
claudeai.code.bridge_offline_send_blocked
claudeai.code.bridge_reconnect_wait
```

#### 语音 (Voice)
```
claudeai.voice.audio_route.changed
claudeai.voice.language_prompt
claudeai.voice.mic.dead_object_recovered
claudeai.voice.training_consent.opt_in_prompt.viewed
claudeai.voice.training_consent.opt_in_prompt.submitted
claudeai.voice.training_consent.opt_in_prompt.dismissed
claudeai.voice.training_consent.session_share.viewed
claudeai.voice.training_consent.session_share.submitted
claudeai.voice.training_consent.session_share.dismissed
claudeai.voice.training_consent.settings.viewed
claudeai.voice.training_consent.settings.changed
claudeai.voice.training_consent.share_preference_prompt.viewed
claudeai.voice.training_consent.share_preference_prompt.submitted
claudeai.voice.training_consent.share_preference_prompt.dismissed
```

#### MCP (Model Context Protocol)
```
claudeai.mcp.auth.init
claudeai.mcp.auth.completed
claudeai.mcp.create_server
claudeai.mcp.delete_server
claudeai.mcp.tool.toggled
claudeai.mcp.suggestion.viewed
claudeai.mcp.suggestion.actioned
claudeai.mcp.suggestion.opt_in.prompted
claudeai.mcp.suggestion.opt_in.actioned
```

#### 第三方工具 (Third-Party Tools)
```
claudeai.tool.thirdparty.discovered
claudeai.tool.thirdparty.executed
claudeai.tool.thirdparty.execution_failed
claudeai.tool.thirdparty.parse_failed
claudeai.tool.thirdparty.toggled
```

#### 搜索 (Search)
```
claudeai.image_search.result.clicked
claudeai.conversation_search.session_ended
```

#### 导航/应用 (Navigation/App)
```
claudeai.navigation.opened
claudeai.app_start.maybe_refresh.refreshed
claudeai.app_start.maybe_refresh.skipped
claudeai.install_referrer.logged
```

#### 网络 (Networking — Cronet)
```
claudeai.networking.cronet.initialization_succeeded
claudeai.networking.cronet.initialization_failed
claudeai.networking.cronet.initialization_skipped
claudeai.networking.cronet.request_success
claudeai.networking.cronet.request_failed
```

#### 性能 (Performance)
```
claudeai.perf.long_task
claudeai.offline.prefetch.completed
claudeai.offline.screen.resolved
```

#### IAP/推荐/其他 (IAP/Referral/Misc)
```
claudeai.iap.play_billing.call_failed
claudeai.referral.guest_pass.viewed
claudeai.referral.guest_pass.share_tapped
claudeai.referral.guest_pass.upsell.shown
claudeai.referral.guest_pass.upsell.dismissed
claudeai.composer.recent_photos.shown
claudeai.conversation.feedback.sent
claudeai.webview.error_state.viewed
claudeai.memory.files.viewed
claudeai.memory.file.deleted
claudeai.memory.file.link.opened
claudeai.memory.style.selected
```

### 2.3 事件数据上传模型

#### EventLoggingRequest（单条事件请求）

文件: `com.anthropic.claude.api.events.EventLoggingRequest`

支持三种事件类型（密封类）：

| 类型 | 事件数据类 | 说明 |
|------|-----------|------|
| `ExperimentExposure` | `GrowthBookExperimentEventData` | A/B 实验曝光 |
| `FeatureEvaluation` | `GrowthBookFeatureEvaluationEventData` | Feature Flag 评估 |
| `HealthMetric` | `HealthMetricEventData` | 健康指标 |

#### BatchEventLoggingRequest（批量事件请求）

文件: `com.anthropic.claude.api.events.BatchEventLoggingRequest`

```java
public final class BatchEventLoggingRequest {
    private final List<EventLoggingRequest> events;  // 事件列表
}
```

批量提交，通过 Retrofit 接口发送：

```java
@vg8({"x-service-name: claude-android"})  // Header: x-service-name: claude-android
Object a(@sg8("x-organization-uuid") String str,        // 路径参数: organization UUID
         @ft1 BatchEventLoggingRequest batchEventLoggingRequest,  // 请求体
         tp4<? super ApiResult<BatchEventLoggingResponse>> tp4Var);
```

### 2.4 GrowthBook 实验曝光数据

文件: `com.anthropic.claude.api.events.GrowthBookExperimentEventData`

| 字段 | 类型 | 说明 |
|------|------|------|
| `event_id` | String | 事件唯一 ID |
| `timestamp` | c69 (Instant) | 时间戳 |
| `experiment_id` | String | 实验 ID |
| `variation_id` | int | 实验变体 ID |
| `environment` | AppEnvironment | 环境 (prod/staging等) |
| `experiment_metadata` | String | 实验元数据 |
| **`device_id`** | **String** | **设备 ID** |
| **`session_id`** | **String** | **会话 ID** |
| **`user_attributes`** | **String** | **用户属性** |

### 2.5 GrowthBook Feature Flag 评估数据

文件: `com.anthropic.claude.api.events.GrowthBookFeatureEvaluationEventData`

| 字段 | 类型 | 说明 |
|------|------|------|
| `event_id` | String | 事件唯一 ID |
| `timestamp` | c69 (Instant) | 时间戳 |
| `feature_key` | String | Feature flag 键名 |
| `value` | String | 评估结果值 |
| `reason` | String | 评估原因 |
| **`unit_id`** | **String** | **单元 ID（用户标识）** |
| `environment` | AppEnvironment | 环境 |
| `project_id` | String | 项目 ID |
| `rule_id` | String | 规则 ID |
| **`user_attributes`** | **String** | **用户属性** |

### 2.6 健康指标事件

#### HealthMetricEventData（服务端上传格式）

文件: `com.anthropic.claude.api.events.HealthMetricEventData`

| 字段 | 类型 | 说明 |
|------|------|------|
| `event_id` | String | 事件 ID |
| `event_timestamp` | c69 (Instant) | 时间戳 |
| `action` | String | 操作类型 (如 auth.login, chat.message_send) |
| `surface` | String | 界面 |
| `outcome` | String | 结果 |
| `error_type` | String | 错误类型 |
| `error_code` | String | 错误代码 |
| `variant` | String | 变体 |
| `model` | String | AI 模型名 |
| `app_version` | String | 应用版本 |
| `duration_ms` | Long | 持续时间(毫秒) |

#### HealthMetricReport（客户端分析格式）

文件: `com.anthropic.claude.analytics.health.HealthMetricReport`

| 字段 | 类型 | 说明 |
|------|------|------|
| `outcome` | HealthMetricOutcome | 结果: UNSPECIFIED / SUCCESS / FAILURE / HANDOFF / ABORTED |
| `variant` | String? | 变体（可选） |
| `error_type` | String? | 错误类型（可选） |
| `error_code` | String? | 错误代码（可选） |
| `model` | String? | AI 模型名（可选） |
| `duration_ms` | Long? | 持续时间毫秒（可选） |
| `action` | HealthMetricAction | 操作类型 |

#### HealthMetricAction 枚举（触发的操作类型）

| 枚举值 | stringValue | 说明 |
|--------|-------------|------|
| `UNSPECIFIED` | `unspecified` | 未指定 |
| `LOGIN` | `auth.login` | 登录 |
| `SIGNUP` | `auth.signup` | 注册 |
| `MESSAGE_SEND` | `chat.message_send` | 发送消息 |
| `CONVERSATION_OPEN` | `chat.conversation_open` | 打开会话 |
| `CONVERSATION_CREATE` | `chat.conversation_create` | 创建会话 |
| `PROJECT_CREATE` | `chat.project_create` | 创建项目 |
| `PROJECTS_LOAD` | `page.projects_load` | 加载项目列表 |
| `PAID_CONVERSION` | `page.paid_conversion` | 付费转化 |
| `ONBOARDING_COMPLETE` | `page.onboarding_complete` | 引导完成 |
| `VOICE_DICTATION` | `voice.dictation` | 语音听写 |

---

## 三、Segment 分析层（第二层）

### 3.1 配置

文件: `defpackage.eg4` — Segment Configuration

```java
public final class eg4 {
    public final String a;  // writeKey（从构造函数传入）
    this.e = "a-api.anthropic.com/v1";   // API Host（覆盖默认）
    this.f = "a-cdn.anthropic.com/v1";   // CDN Host（覆盖默认）
    // collectDeviceId = false
    // trackApplicationLifecycleEvents = true
    // useLifecycleObserver = true
    // trackDeepLinks = false
    // flushAt = 3
    // flushInterval = 10
}
```

**关键配置**:
- **API Host 重写为 Anthropic 自有域名**：`a-api.anthropic.com/v1`（默认应为 `api.segment.io/v1`）
- **CDN Host 重写为**：`a-cdn.anthropic.com/v1`
- `collectDeviceId = false` — 不收集设备 ID
- `trackApplicationLifecycleEvents = true` — 自动追踪应用生命周期事件
- `flushAt = 3` — 每 3 个事件刷新一次
- `flushInterval = 10` — 每 10 秒刷新一次

### 3.2 用户 Traits（身份信息）

文件: `com.anthropic.claude.analytics.ClaudeAnalyticsImpl$Traits`

| 字段 | 类型 | 说明 |
|------|------|------|
| **`account_uuid`** | **AccountId (String)** | **账户 UUID** |
| **`organization_uuid`** | **OrganizationId (String)** | **组织 UUID** |
| **`email`** | **EmailAddress (String)** | **用户邮箱** |
| **`subscription_level`** | **String?** | **订阅级别（可选）** |

这些 Traits 通过 Segment `IdentifyEvent` 上报，在用户登录/切换时触发：

```java
// ClaudeAnalyticsImpl.d() — identify 调用
gxVar.c(new IdentifyEvent(str, jsonObjectI), null);  // Segment identify
qk5.a(this.c, str, str2, str3, pvgVar != null ? pvgVar.E : null);  // Sift 也同步
```

### 3.3 事件上报流程

```
AnalyticsEvent → 序列化为 JSON → Segment TrackEvent → 
  → a-api.anthropic.com/v1 (Segment API Host 重写)
  → 同时也通过 BatchEventLoggingRequest 发送到 a-api.anthropic.com
```

### 3.4 Screen 追踪

- `AnalyticsScreen` 接口用于追踪页面浏览
- 特别追踪 `ChatScreen`（含 `organization_uuid`, `conversation_uuid`）和 `ChatListScreen`（含 `organization_uuid`）

---

## 四、设备/用户标识

### 4.1 Device ID

文件: `defpackage.m26` — Device ID 管理

```java
public final class m26 {
    public final String a() {
        String string = sharedPreferences.getString("device_id", null);
        if (string != null) return string;
        String newId = vb7.i();  // 生成新 UUID
        kgh.t(sharedPreferences, "device_id", newId);  // 持久化
        return newId;
    }
}
```

- 存储在 SharedPreferences 中
- 首次使用时生成 UUID，之后持久复用
- Segment 配置中 `collectDeviceId = false`，但 GrowthBook 事件数据中仍包含 `device_id`

### 4.2 Session ID

- GrowthBook 实验事件中包含 `session_id` 字段
- 由 Segment SDK 自动管理

---

## 五、第三方 SDK 清单（已排除，仅记录）

| SDK | 用途 | 端点 | Anthropic 是否使用 |
|-----|------|------|--------------------|
| **Datadog** (RUM/APM/Logs) | 性能监控 | `browser-intake-datadoghq.com` | ✅ 已集成，1处初始化 |
| **Sentry** | 崩溃报告 | Sentry DSN (配置中) | ✅ 已集成 |
| **Sift Science** | 反欺诈/信任安全 | Sift 后端 | ✅ 已集成，传入 account_id + beacon_key |
| **GrowthBook** | A/B 实验/Feature Flag | 从 Anthropic 服务端获取配置 (AppStartResponse.org_growthbook) | ✅ 已集成，自有托管 |
| **Segment Analytics** | 事件中转 | **已改写到 a-api.anthropic.com/v1** | ✅ 核心分析层 |
| **Firebase/Google** | 推送/分析 | Google 后端 | ✅ 标准集成 |
| ~~Amplitude~~ | — | — | ❌ 未集成 |
| ~~Statsig~~ | — | — | ❌ 未集成 |
| ~~Tengu~~ | — | — | ❌ 未集成 |
| ~~Mixpanel~~ | — | — | ❌ 未集成 |
| ~~PostHog~~ | — | — | ❌ 未集成 |

---

## 六、Sift Science 反欺诈集成

文件: `defpackage.b6g`

```java
Sift.open(activity, new Sift.Config.Builder()
    .withAccountId(e6gVar.a())     // Sift Account ID（从配置获取）
    .withBeaconKey(e6gVar.b())     // Sift Beacon Key（从配置获取）
    .build());
```

文件: `defpackage.ioi`

```java
Sift.setUserId(str);  // 设置用户 ID
```

---

## 七、GrowthBook Feature Flag 系统

### 7.1 配置来源

GrowthBook 配置**不从 GrowthBook 官方 CDN 获取**，而是从 Anthropic 自有 API 返回：

文件: `com.anthropic.claude.api.account.AppStartResponse`

```java
public final class AppStartResponse {
    private final Account account;
    private final MemoryMode memory_mode;
    private final GrowthBookSchema org_growthbook;      // ← 服务端下发
    private final Map<String, String> server_localizations;
    private final CurrentUserAccess current_user_access;
    private final List<ModelSelectorState> model_selector_state;
    private final List<ModelSelectorConfig> model_selector_config;
}
```

### 7.2 Gate 类型

文件: `com.anthropic.claude.settings.internal.growthbook.GateKind`

```java
BOOLEAN, STRING, NUMBER, JSON, UNKNOWN
```

Feature Flag 支持布尔门控、字符串值、数值、JSON 配置。

### 7.3 事件上报

Feature Flag 评估结果通过 `GrowthBookFeatureEvaluationEventData` 上报到 Anthropic 自有端点，包含 `feature_key`、`value`、`reason`、`unit_id`、`user_attributes` 等信息。

---

## 八、异常脱敏处理

### 8.1 RedactedThrowable

文件: `com.anthropic.claude.core.telemetry.RedactedThrowable`

用于脱敏异常堆栈，避免上传敏感信息。

### 8.2 SilentException

文件: `com.anthropic.claude.core.telemetry.SilentException`

标记为"静默"的异常，30 处引用，用于不上报到遥测的内部异常。

---

## 九、是否可禁用？

### 9.1 遥测禁用开关

**未发现专门的遥测禁用开关**。搜索了以下关键词均无匹配：

- `telemetry_opt` / `telemetryOpt`
- `opt_out` / `optOut`（仅 `ChatSnapshotReportRequest.opt_out_of_training` 用于举报功能）
- `analytics_enabled` / `analyticsEnabled`
- `tracking_enabled` / `trackingEnabled`

### 9.2 唯一的"退出"机制

- **语音训练数据共享**：`VoiceEvents$TrainingConsent*` 系列事件显示，语音训练数据共享有明确的 opt-in/opt-out 流程
- **举报功能**：`ChatSnapshotReportRequest` 中有 `opt_out_of_training` 字段

### 9.3 结论

**Anthropic 自身遥测不可通过应用内设置禁用**。Segment SDK、事件日志系统、GrowthBook、HealthMetric 均为始终运行，无用户可控开关。

---

## 十、发送端点汇总

| 端点 | 用途 | 协议 |
|------|------|------|
| `a-api.anthropic.com/v1` | Segment 事件上报（重写 API Host） | HTTPS POST |
| `a-cdn.anthropic.com/v1` | Segment 配置获取（重写 CDN Host） | HTTPS GET |
| `a-api.anthropic.com/v1` | BatchEventLoggingRequest 批量事件 | HTTPS POST (Header: x-service-name: claude-android) |
| `browser-intake-datadoghq.com` | Datadog RUM/APM/Logs | HTTPS POST |
| Sift 后端 | 反欺诈数据 | HTTPS POST |
| Sentry DSN | 崩溃报告 | HTTPS POST |

---

## 十一、上传信息汇总

### 始终上传的数据
- **账户 UUID** (`account_uuid`)
- **组织 UUID** (`organization_uuid`)  
- **邮箱** (`email`)
- **设备 ID** (`device_id`) — 持久化 UUID
- **会话 ID** (`session_id`) — Segment 自动管理
- **订阅级别** (`subscription_level`)
- **应用版本** (`app_version`)
- **AI 模型名** (`model`)
- **环境** (`environment`: AppEnvironment)

### 按事件类型上传的数据
- **操作/页面/结果/错误信息** (HealthMetric: action, surface, outcome, error_type, error_code)
- **持续时间** (duration_ms)
- **实验变体** (experiment_id, variation_id)
- **Feature Flag 评估** (feature_key, value, reason, rule_id)
- **用户属性** (user_attributes)
- **对话 UUID** (conversation_uuid) — 聊天事件和页面浏览
- **语音会话信息** (voice_session_id, activation_mode, entry_source, selected_voice 等)

---

## 十二、文件索引

关键反编译源码文件：

```
com/anthropic/claude/analytics/events/AnalyticsEvent.java          — 事件接口
com/anthropic/claude/analytics/b.java                               — ClaudeAnalyticsImpl 主逻辑
com/anthropic/claude/analytics/ClaudeAnalyticsImpl$Traits.java     — 用户 Traits
com/anthropic/claude/analytics/health/HealthMetricReport.java      — 健康指标报告
com/anthropic/claude/analytics/health/HealthMetricAction.java      — 健康指标动作枚举
com/anthropic/claude/analytics/health/HealthMetricOutcome.java     — 健康指标结果枚举
com/anthropic/claude/api/events/EventLoggingRequest.java           — 事件日志请求
com/anthropic/claude/api/events/BatchEventLoggingRequest.java      — 批量事件请求
com/anthropic/claude/api/events/GrowthBookExperimentEventData.java — GB 实验数据
com/anthropic/claude/api/events/GrowthBookFeatureEvaluationEventData.java — GB Feature 数据
com/anthropic/claude/api/events/HealthMetricEventData.java         — 健康指标事件数据
com/anthropic/claude/api/account/AppStartResponse.java             — 启动响应(含 GB 配置)
com/anthropic/claude/core/telemetry/RedactedThrowable.java         — 脱敏异常
com/anthropic/claude/core/telemetry/SilentException.java           — 静默异常
com/anthropic/claude/settings/internal/growthbook/GateKind.java    — Feature Flag 类型
defpackage/eg4.java       — Segment 配置(writeKey, API Host, CDN Host)
defpackage/uz6.java       — Retrofit 事件上报接口
defpackage/m26.java       — Device ID 管理
defpackage/b6g.java       — Sift 初始化
defpackage/rk5.java       — Datadog 端点配置
defpackage/gx.java        — Segment Analytics 基类
```
