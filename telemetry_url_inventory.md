# Claude Android APK — 遥测目标 URL/Host 完整清单

**APK**: `claude.apk`  
**反编译工具**: jadx 1.5.5  
**分析日期**: 2026-07-05  
**范围**: 所有遥测/分析相关的目标 host/URL，含 SDK 归属和数据类型

---

## 一、完整遥测 URL/Host 清单

### 1. Anthropic 自有事件系统 (BatchEventLoggingRequest)

| URL / Host | SDK / 功能 | 协议 | 发送数据类型 |
|------------|-----------|------|-------------|
| `https://a-api.anthropic.com/v1` → `event_logging/v2/batch` | Anthropic 自有 BatchEventLogging API (Retrofit) | HTTPS POST | `BatchEventLoggingRequest` — 包含 `List<EventLoggingRequest>`，三类事件：① `ExperimentExposure` (GrowthBook 实验曝光: event_id, timestamp, experiment_id, variation_id, environment, experiment_metadata, **device_id**, **session_id**, **user_attributes**) ② `FeatureEvaluation` (Feature Flag 评估: event_id, timestamp, feature_key, value, reason, **unit_id**, environment, project_id, rule_id, **user_attributes**) ③ `HealthMetric` (健康指标: event_id, event_timestamp, action, surface, outcome, error_type, error_code, variant, model, app_version, platform, duration_ms) |

**代码路径**: `com.anthropic.claude.api.events` 包  
**Retrofit 接口**: `defpackage.uz6` — `@smc("event_logging/v2/batch")`  
**Header**: `x-organization-uuid` + `x-service-name: claude-android`  
**版本号**: `1.260618.10` (硬编码在 `dl8.java`)

---

### 2. Segment Analytics 中继

| URL / Host | SDK / 功能 | 协议 | 发送数据类型 |
|------------|-----------|------|-------------|
| `https://a-api.anthropic.com/v1` | Segment Analytics Kotlin SDK (API Host 已重写) | HTTPS POST | Segment 事件: `TrackEvent`, `IdentifyEvent`, `ScreenEvent` 等。包含 101 个自定义 `AnalyticsEvent` (如 `claudeai.message.sent`, `claudeai.chat.model.selected` 等) + 用户 Traits (account_uuid, organization_uuid, email, subscription_level) |
| `https://a-cdn.anthropic.com/v1` | Segment Analytics Kotlin SDK (CDN Host 已重写) | HTTPS GET | Segment SDK 配/settings (Integrations 配置、计划等) |
| `https://api.segment.io/v1` | Segment RemoteMetric 内部诊断上报 | HTTPS POST | `RemoteMetric` — SDK 内部性能指标 (analytics_mobile 调用计数、错误计数)，仅采样上报 |

**关键**: Segment 的 API/CDN Host **已从默认值改写为 Anthropic 自有域名**，意味着 **所有 Segment 数据流经 Anthropic 服务器**，而非 Segment 的公共云。仅 RemoteMetric 诊断数据直接发到 Segment 官方。

**代码路径**: `defpackage.eg4` (Configuration 类)  
**配置详情**: `collectDeviceId=false`, `trackApplicationLifecycleEvents=true`, `flushAt=3`, `flushInterval=10`

---

### 3. Datadog (RUM + APM Trace + Logs)

| URL / Host | SDK / 功能 | 协议 | 发送数据类型 |
|------------|-----------|------|-------------|
| `https://browser-intake-datadoghq.com` | Datadog SDK — US1 站点 (RUM/APM/Logs) | HTTPS POST | RUM 事件 (View 加载时间、Action、Resource 请求、Error、Long Task、ANR、App Start)、APM Trace (分布式追踪 span)、Log 事件；device info (制造商/型号/OS 版本)、network info、user info、session info |
| `https://browser-intake-datadoghq.eu` | Datadog SDK — EU1 站点 (备选) | HTTPS POST | 同上（EU 区域备选站点） |
| `https://browser-intake-ddog-gov.com` | Datadog SDK — US1_FED 政府站点 (备选) | HTTPS POST | 同上（FedRAMP 合规站点） |
| `https://browser-intake-us2-ddog-gov.com` | Datadog SDK — US2_FED 政府站点 (备选) | HTTPS POST | 同上 |
| `https://browser-intake-datad0g.com` | Datadog SDK — Staging 站点 | HTTPS POST | 同上（内部测试） |
| `https://us3-datadoghq.com` | Datadog SDK — US3 站点 (动态生成) | HTTPS POST | 同上 |
| `https://us5-datadoghq.com` | Datadog SDK — US5 站点 (动态生成) | HTTPS POST | 同上 |
| `https://ap1-datadoghq.com` | Datadog SDK — AP1 站点 (动态生成) | HTTPS POST | 同上 |
| `https://ap2-datadoghq.com` | Datadog SDK — AP2 站点 (动态生成) | HTTPS POST | 同上 |

**实际使用站点**: 代码中 `rk5.java` 定义了所有站点枚举，但 **实际初始化时选定一个站点**（通常 US1）。域名格式为 `browser-intake-{site}-datadoghq.com`，由 `rk5` 枚举动态构建。

**SDK 模块**: `dd-sdk-android-rum`, `dd-sdk-android-trace`, `dd-sdk-android-internal`  
**代码路径**: `com.datadog.android.rum` (RUM), `com.datadog.android.trace` (APM)  
**RUM 配置**: `trackFrustrations=true`, `trackNonFatalAnrs=true`, `useViewTrackingStrategy`  
**DatadogContext**: 包含 site, clientToken, service, env, version, deviceInfo, networkInfo, userInfo, trackingConsent

---

### 4. Sentry (崩溃报告 + 性能追踪)

| URL / Host | SDK / 功能 | 协议 | 发送数据类型 |
|------------|-----------|------|-------------|
| `https://o1158394.ingest.us.sentry.io/4507346684477440` | Sentry Android SDK (DSN) | HTTPS POST (`application/x-sentry-envelope`) | 异常/崩溃事件 (消息、堆栈、线程信息)、性能 Transaction (trace、span)、Breadcrumbs (用户操作轨迹)、View Hierarchy、NDK 崩溃 (Native层)、Tombstone (ANR 原始数据) |

**DSN**: `https://319c8a...500e@o1158394.ingest.us.sentry.io/4507346684477440` (密钥部分被 jadx 截断为 `319c8a...500e`)  
**Organization ID**: `o1158394`  
**Project ID**: `4507346684477440`

**代码路径**: `defpackage.pze` (Sentry 配置)  
**配置详情**:  
- `enableAutoSessionTracking=false` (不自动追踪会话)
- `sendClientReports=false` (不发客户端报告)
- `attachScreenshot=false` (不附截图)
- `attachViewHierarchy=true` (附视图层级)
- `tracesSampleRate=0.005` (性能追踪采样率 0.5%)
- `enablePerformanceV2=true`
- `enableAppStartProfiling=true`
- `enableTimeToFullDisplayTracing=true`
- `tombstoneEnabled=true` (ANR tombstone 收集)
- `propagateTraceparent=true` (分布式追踪传播)
- **tracePropagationTargets**: Anthropic 域名列表 (`claude.ai`, `claude.com`, `anthropic.com`, `ant.dev`, `claudeusercontent.com`)

---

### 5. Sift Science (反欺诈/信任安全)

| URL / Host | SDK / 功能 | 协议 | 发送数据类型 |
|------------|-----------|------|-------------|
| `https://api3.siftscience.com/v3/accounts/{accountId}/mobile_events` | Sift Science Android SDK | HTTPS PUT (gzip + JSON) | **设备属性** (app_name, app_version, android_id, device_manufacturer, device_model, mobile_carrier_name, mobile_iso_country_code, device_system_version, build_tags, **root 检测证据**: su 文件存在、root 应用安装、危险系统属性、可写系统目录) + **应用状态事件** (app 活动/前台/后台) + **用户 ID** (userId) |

**Account ID**:  
- Production: `64e6742e35ba4d3981f27c05`  
- Sandbox: `64e6742e35ba4d3981f27c08`

**Beacon Key**:  
- Production: `99dfa2e716`  
- Sandbox: `88af42bf8a`

**代码路径**: `siftscience.android.Sift`, `siftscience.android.Uploader`, `siftscience.android.DevicePropertiesCollector`  
**认证方式**: HTTP Basic Auth (Beacon Key 作为密码)  
**特别收集**: **Root 检测** — 检查 su 二进制文件、Superuser/SuperSU/Xposed 等应用安装、ro.debuggable=1/ro.secure=0 属性、可写系统目录

---

### 6. GrowthBook (A/B 实验 / Feature Flag)

| URL / Host | SDK / 功能 | 协议 | 发送数据类型 |
|------------|-----------|------|-------------|
| **无独立 URL** — GrowthBook 配置从 Anthropic 自有 API 获取 | GrowthBook Feature Flag SDK | HTTPS GET (从 Anthropic API) | **不向外发送数据**。GrowthBook 配置通过 `AppStartResponse.org_growthbook` 字段从 `api.anthropic.com` 下发，而非从 GrowthBook 官方 CDN (`cdn.growthbook.io`) 获取。评估结果上报到 Anthropic 自有事件系统 (见第 1 项) |

**代码路径**: `com.anthropic.claude.api.account.AppStartResponse` → `org_growthbook` 字段  
**Gate 类型**: BOOLEAN, STRING, NUMBER, JSON  
**Feature Flag 名称**: `cuj_event_logging_config` 等

**关键**: GrowthBook 是 **自托管模式**，配置和上报都走 Anthropic 自有服务器，**不与 growthbook.io 通信**。

---

### 7. Firebase / Google (推送 + 分析 + 安装)

| URL / Host | SDK / 功能 | 协议 | 发送数据类型 |
|------------|-----------|------|-------------|
| `https://firebaseinstallations.googleapis.com/v1/` | Firebase Installations SDK | HTTPS POST | Firebase 安装 ID (FID) 注册、认证 token 获取 |
| `https://app-measurement.com/a` | Google Analytics / Firebase Analytics | HTTPS POST | 分析事件上报 (自动收集的事件: first_open, session_start, user_engagement 等 + 自定义事件) |
| `https://app-measurement.com/s` | Google Analytics — Google Signal | HTTPS POST | Google Signal 信号数据 |
| `app-measurement.com` (authority) | Google Analytics — 配置获取 | HTTPS | 远程配置/测量配置 |
| Firebase Cloud Messaging (FCM) 后端 | Firebase Messaging SDK | HTTPS | 推送通知注册/接收 |

**代码路径**: `com.google.firebase.analytics.FirebaseAnalytics`, `com.google.firebase.messaging.FirebaseMessaging`, `defpackage.vl7` (Firebase Installations), `defpackage.m1l` / `defpackage.zvj` (AppMeasurement)  
**Firebase 组件**: FirebaseAnalytics, FirebaseMessaging, FirebaseCommon, FirebaseInitProvider, FirebaseInstallations, DataTransport (CCT)

**MLKit Firelog**: 代码中包含 `MLKitLoggingOptions` (play-services-mlkit-language-id)，enableFirelog=true，可能通过 Google CCT 通道上报。

---

### 8. 其他 Anthropic API 端点 (非遥测，但涉及数据传输)

| URL / Host | 功能 | 说明 |
|------------|------|------|
| `https://api.anthropic.com/api/directory/servers` | MCP 服务器目录 | 获取可用 MCP 远程服务器列表 |
| `claude.ai` + `www.claude.ai` + `api.anthropic.com` | QUIC 提示 | Cronet QUIC 连接预提示 (443 端口) |
| `https://www.anthropic.com/legal/` | 法律页面 | 非遥测，静态内容 |
| `https://privacy.anthropic.com/en/articles/*` | 隐私政策 | 非遥测，静态内容 |
| `https://support.anthropic.com/` | 支持页面 | 非遥测 |

---

## 二、数据流向拓扑

```
┌─────────────────────────────────────────────────────────────────────┐
│                    Claude Android App                               │
├─────────────────────────────────────────────────────────────────────┤
│                                                                     │
│  ┌──────────────────┐    ┌──────────────┐    ┌──────────────────┐   │
│  │ AnalyticsEvent   │    │ Segment SDK  │    │ BatchEventLog    │   │
│  │ (101 custom)     │───▶│ (API→a-api)  │    │ Request          │   │
│  └──────────────────┘    └──────────────┘    └──────────────────┘   │
│         │                       │                     │             │
│         │                       │                     │             │
│         ▼                       ▼                     ▼             │
│  ┌──────────────────────────────────────────────────────────────┐  │
│  │         a-api.anthropic.com/v1  (Anthropic 自有服务器)        │  │
│  │  • Segment 事件转发 (重写 API Host)                           │  │
│  │  • Segment 配置下发 (重写 CDN Host → a-cdn.anthropic.com/v1) │  │
│  │  • event_logging/v2/batch (BatchEventLogging)                 │  │
│  │  • GrowthBook 配置下发 (AppStartResponse.org_growthbook)      │  │
│  │  • MCP directory/servers                                     │  │
│  └──────────────────────────────────────────────────────────────┘  │
│                                                                     │
│  ┌────────────────┐     ┌──────────────┐    ┌────────────────┐     │
│  │ Datadog RUM/   │     │ Sentry SDK   │    │ Sift Science   │     │
│  │ APM/Logs       │     │              │    │                │     │
│  └────────────────┘     └──────────────┘    └────────────────┘     │
│         │                       │                     │             │
│         ▼                       ▼                     ▼             │
│  browser-intake-          o1158394.ingest.     api3.siftscience.   │
│  datadoghq.com            us.sentry.io         com                 │
│  (US1 站点)               (DSN 端点)           (反欺诈)            │
│                                                                     │
│  ┌────────────────┐     ┌──────────────┐                           │
│  │ Firebase       │     │ Google       │                           │
│  │ Analytics+FCM  │     │ Analytics    │                           │
│  └────────────────┘     └──────────────┘                           │
│         │                       │                                  │
│         ▼                       ▼                                  │
│  firebaseinstallations.   app-measurement.com                      │
│  googleapis.com           (分析上报)                                │
│                                                                     │
│  ┌──────────────────┐                                               │
│  │ Segment Remote   │  (仅内部诊断)                                  │
│  │ Metric           │                                               │
│  └──────────────────┘                                               │
│         │                                                           │
│         ▼                                                           │
│  api.segment.io/v1  (唯一直接发往 Segment 官方的数据)                 │
│                                                                     │
└─────────────────────────────────────────────────────────────────────┘
```

---

## 三、隐私敏感数据汇总

| 数据类型 | 发往何处 | 包含在哪些 SDK |
|----------|----------|---------------|
| **设备 ID (UUID)** | a-api.anthropic.com | GrowthBook 事件 (device_id), HealthMetric (platform) |
| **Session ID** | a-api.anthropic.com | GrowthBook 实验事件 (session_id) |
| **Android ID** | api3.siftscience.com | Sift DeviceProperties (android_id) |
| **用户邮箱** | a-api.anthropic.com | Segment Traits (email) |
| **账户 UUID** | a-api.anthropic.com | Segment Traits (account_uuid) |
| **组织 UUID** | a-api.anthropic.com | Segment Traits + BatchEventLogging Header (x-organization-uuid) |
| **用户属性** | a-api.anthropic.com | GrowthBook 事件 (user_attributes) |
| **设备型号/制造商** | browser-intake-datadoghq.com, api3.siftscience.com | Datadog deviceInfo, Sift DeviceProperties |
| **Root 检测结果** | api3.siftscience.com | Sift (su 文件、root 应用、debuggable 属性、可写系统目录) |
| **运营商/国家代码** | api3.siftscience.com | Sift (mobile_carrier_name, mobile_iso_country_code) |
| **应用版本** | a-api.anthropic.com, browser-intake-datadoghq.com, api3.siftscience.com | HealthMetric, Datadog, Sift |
| **AI 模型名** | a-api.anthropic.com | HealthMetric (model) |
| **操作时长 (TTFT等)** | a-api.anthropic.com, browser-intake-datadoghq.com | HealthMetric (duration_ms), Datadog RUM |
| **崩溃堆栈** | o1158394.ingest.us.sentry.io | Sentry (异常消息、堆栈、线程、View Hierarchy) |
| **ANR/Tombstone** | o1158394.ingest.us.sentry.io | Sentry (Native 崩溃、ANR 原始数据) |
| **Firebase 安装 ID** | firebaseinstallations.googleapis.com | Firebase Installations |

---

## 四、关键发现总结

1. **Segment 数据全部经 Anthropic 自有服务器**：API Host (`a-api.anthropic.com/v1`) 和 CDN Host (`a-cdn.anthropic.com/v1`) 均已从 Segment 默认域名改写，唯一直接发到 Segment 官方 (`api.segment.io/v1`) 的仅是 SDK 内部诊断指标 (RemoteMetric)。

2. **GrowthBook 自托管**：配置从 Anthropic API 下发 (`AppStartResponse.org_growthbook`)，不访问 `growthbook.io`。评估结果上报回 Anthropic 自有事件系统。

3. **Sift Science 收集最敏感的设备信息**：包括 Android ID、Root 检测、运营商信息、系统属性 — 这些数据其他 SDK 不收集。

4. **Datadog 覆盖面最广**：RUM（页面加载/用户交互）+ APM（分布式追踪）+ Logs，发送到 `browser-intake-datadoghq.com`。

5. **Sentry 仅发崩溃/性能**：采样率很低 (traces 0.5%)，不附截图，但启用 View Hierarchy 和 Tombstone。

6. **Firebase/Google 是标准集成**：Analytics + FCM + Installations，通过 `app-measurement.com` 和 `firebaseinstallations.googleapis.com` 通信。

7. **无遥测禁用开关**：所有遥测 SDK 常驻运行，用户无法通过应用设置关闭。
