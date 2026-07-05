# Claude Reverse Analysis

本项目保存了对 Claude Code CLI v2.1.198 和 Claude Android APK 的逆向分析材料，重点关注遥测体系、网络端点、第一方/第三方后端判断逻辑、敏感数据采集和遥测关闭方式。

仓库内容主要来自两类反编译结果：

- `extracted/`: Claude Code CLI 拆分后的 JavaScript 代码。
- `apk_decompiled/`: Claude Android APK 通过 jadx 反编译后的资源和 Java 源码。

原始 APK 文件为 `claude.apk`，辅助提取脚本为 `extract_bun.js`。

## 文档索引

| 文件 | 内容 |
|------|------|
| `telemetry_disable_guide.md` | 遥测禁用指南。总结 CLI 通过 `DISABLE_TELEMETRY`、`DO_NOT_TRACK`、`CLAUDE_CODE_DISABLE_NONESSENTIAL_TRAFFIC` 关闭遥测的方法，以及 Android App 通过 hosts、NetGuard、AdAway 等网络层方案拦截遥测端点的方法。 |
| `telemetry_analysis.md` | Claude Code CLI 遥测系统分析。说明 1P 事件日志、Datadog、OpenTelemetry、BigQuery metrics 等通道的启用条件、环境变量开关和关键函数链路。 |
| `cli_telemetry_system.md` | Claude Code CLI `logEvent` 遥测体系的详细分析。覆盖双通道架构、事件元数据、采样机制、脱敏差异、事件规模和敏感事件标记。 |
| `cli_first-party-vs-third-party.md` | CLI 第一方与第三方后端差异分析。解释 `getAPIProvider()`、`isFirstPartyApiBackend()`、`isFirstPartyAnthropicBaseUrl()` 等判断逻辑，以及 Bedrock、Vertex、Foundry、Gateway 等模式下的功能差异。 |
| `telemetry_analysis_report.md` | Claude Android APK 自身遥测代码分析报告。聚焦 Anthropic 自有事件系统和 Segment 中继架构，排除常规第三方 SDK 后梳理 App 内部遥测实现。 |
| `telemetry_url_inventory.md` | Android APK 遥测 URL/Host 清单。列出 Anthropic 自有事件、Segment、Datadog、Sentry、Sift、Firebase/Google Analytics 等端点、协议和数据类型。 |
| `sensitive_data_analysis.md` | 敏感数据采集补充分析。逐字段确认时区、设备信息、网络信息、Root 状态、用户标识等敏感数据是否被采集和上传。 |

## 目录结构

```text
.
├── claude.apk
├── extract_bun.js
├── extracted/
├── apk_decompiled/
├── telemetry_disable_guide.md
├── telemetry_analysis.md
├── cli_telemetry_system.md
├── cli_first-party-vs-third-party.md
├── telemetry_analysis_report.md
├── telemetry_url_inventory.md
└── sensitive_data_analysis.md
```

## 快速结论

- CLI 关闭遥测：设置 `DISABLE_TELEMETRY=1`；更严格可设置 `CLAUDE_CODE_DISABLE_NONESSENTIAL_TRAFFIC=1`。
- Android App 关闭遥测：App 内无遥测开关，只能通过 hosts、VPN 防火墙或 AdAway/NetGuard 等工具按域名拦截。
- `apk_decompiled/` 和 `extracted/` 是主要证据来源，Markdown 文档中的函数名、文件路径和端点均基于这些反编译结果整理。
