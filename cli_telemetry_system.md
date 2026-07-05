---
name: telemetry-system
description: Claude Code logEvent 遥测体系完整分析：双通道架构、自动附加元数据、1513个事件、采样机制、脱敏策略差异、涉密事件标记
metadata: 
  node_type: memory
  type: reference
  originSessionId: af7764fa-70d9-4dfe-8ccc-b56e6b74e0e9
---

# Claude Code 遥测体系分析

> 基于 `extracted/src/entrypoints/cli.clean2.js` (v2.1.198) 逆向分析

## 架构概览

```
logEvent(eventName, metadata)
    │
    ├── shouldSampleEvent() ─── 采样率过滤（服务端可动态配置）
    │
    ├── trackDatadogEvent() ─── Datadog 日志通道（仅 firstParty + 白名单事件，有脱敏）
    │   └── POST https://http-intake.logs.us5.datadoghq.com/api/v2/logs
    │       DD-API-KEY: pubea5604404508cdd34afb69e6f42a05bc
    │
    └── logEventTo1P() ─── Anthropic 自有 OTel 通道（所有用户，无脱敏）
        └── OTel Logs SDK → BatchProcessor → HTTP Exporter → Anthropic 后端
```

**两个通道并行，条件不同，脱敏策略不同。**

## 双通道对比

| | Datadog | 1P 自有 (OTel) |
|---|---|---|
| **谁会上报** | 仅 firstParty 用户（api.anthropic.com） | 所有用户（除非显式禁用） |
| **事件范围** | 白名单 ~150 个 | 全部 1179 个 |
| **脱敏** | ✅ MCP tool 名脱敏、userBucket、version 去 SHA | ❌ 原始数据完整上报 |
| **包含邮箱/UUID** | 否（用 userBucket 替代） | ✅ email、accountUuid、organizationUuid |
| **实现函数** | `trackDatadogEvent()` | `logEventTo1P()` / `logEventTo1PAsync()` |
| **入口判断** | `getAPIProvider() !== "firstParty"` → skip | `is1PEventLoggingEnabled()` → skip |

## 每条事件自动附加的元数据

### core_metadata（`QOn()` 生成）

| 字段 | 来源 | 说明 |
|---|---|---|
| `model` | 当前对话模型 | 如 `claude-sonnet-5` |
| `sessionId` | 会话 ID | 每次启动生成 |
| `userType` | 固定 `"external"` | — |
| `betas` | API beta flags | 当前使用的 beta 功能列表 |
| `envContext` | 环境检测 | 见下方子表 |
| `entrypoint` | `CLAUDE_CODE_ENTRYPOINT` | 入口类型 |
| `sessionKind` | 会话类型 | headless/repl/bridge 等 |
| `hasAttacher` | `"0"` / `"1"` | 是否有 IDE 附加 |
| `agentSdkVersion` | `CLAUDE_AGENT_SDK_VERSION` | Agent SDK 版本 |
| `isInteractive` | 交互模式 | `"true"` / `"false"` |
| `clientType` | 客户端类型 | cli/vscode/jetbrains 等 |
| `processMetrics` | 进程指标 | CPU/内存等 |
| `sweBenchRunId` | SWE-bench 相关 | 测试评估用 |
| `subscriptionType` | 订阅类型 | pro/free 等 |
| `rh` | Git remote hash | 仓库指纹 |
| `head_sha` | Git HEAD SHA | 仅 consumer 用户 |
| `rendererMode` | 渲染模式 | ink/tui 等 |

### envContext 子对象

| 字段 | 说明 |
|---|---|
| `platform` | macos/linux/windows/wsl |
| `platformRaw` | 原始 platform 值 |
| `arch` | x64/arm64 |
| `nodeVersion` | Node.js 版本 |
| `terminal` | 终端类型 |
| `shell` | Shell 类型 |
| `packageManagers` | 检测到的包管理器 |
| `runtimes` | 检测到的运行时 |
| `isRunningWithBun` | 是否用 Bun 运行 |
| `isCi` | 是否 CI 环境 |
| `isClaubbit` | 是否 Claude Code Remote |
| `isClaudeCodeRemote` | 远程会话 |
| `isLocalAgentMode` | 本地 Agent 模式 |
| `isConductor` | Conductor 模式 |
| `isGithubAction` | GitHub Actions |
| `isClaudeCodeAction` | Claude Code Action |
| `isClaudeAiAuth` | claude.ai 认证 |
| `version` | CLI 版本号 |
| `buildTime` | 构建时间 |
| `deploymentEnvironment` | 部署环境 |
| `remoteEnvironmentType` | 远程环境类型 |
| `claudeCodeContainerId` | 容器 ID |
| `claudeCodeRemoteSessionId` | 远程会话 ID |
| `tags` | 环境标签 |
| `wslVersion` | WSL 版本 |
| `linuxDistroId` | Linux 发行版 ID |
| `linuxKernel` | Linux 内核版本 |
| `vcs` | 版本控制系统 |
| `versionBase` | 版本基础 |

### user_metadata（`sat()` 生成）

| 字段 | 说明 |
|---|---|
| `deviceId` | 随机生成的设备 ID（`crypto.randomBytes(32).hex`，持久化到 `~/.claude/config.json`） |
| `sessionId` | 会话 ID |
| `email` | 用户邮箱 |
| `appVersion` | CLI 版本 |
| `platform` | 平台 |
| `organizationUuid` | 组织 UUID |
| `accountUuid` | 账户 UUID |
| `userType` | `"external"` |
| `subscriptionType` | 订阅类型 |
| `rateLimitTier` | 速率限制层级 |
| `firstTokenTime` | 首次使用时间戳 |
| `githubActionsMetadata` | CI 环境下: actor, actorId, repository, repositoryId, repositoryOwner, repositoryOwnerId |

### event_metadata

每个事件自己的参数，如 `toolName`, `duration_ms`, `error_code` 等。

### 通用字段

| 字段 | 说明 |
|---|---|
| `event_name` | 事件名（如 `tengu_tool_use_success`） |
| `event_id` | UUID |
| `user_id` | 设备 ID |
| `timestamp` | 事件时间 |

## 采样机制

- 服务端通过 `tengu_event_sampling_config`（GrowthBook 动态配置）可按事件名设置采样率（0~1）
- 采样到的事件会附带 `sample_rate` 字段，用于统计还原
- 采样率为 0 → 丢弃；为 1 或未配置 → 全量上报
- 采样率在 0~1 之间 → `Math.random() < rate` 命中则上报

## Datadog 通道脱敏处理

```javascript
// trackDatadogEvent() 中的脱敏逻辑：
1. toolName 以 "mcp__" 开头 → 统一为 "mcp"
2. model 不含 "claude" → 丢弃整条事件
3. model 名规范化为 canonical name + 白名单映射（不在白名单则为 "other"）
4. version 去掉 git SHA 后缀
5. status → http_status + http_status_range
6. 用 userBucket（SHA256(userID) % 30）替代真实用户 ID
7. 指定字段作为 Datadog tags（arch, model, platform, toolName 等 ~30 个）
```

## 设备 ID 与用户追踪

```javascript
// getOrCreateUserID() — 持久化设备 ID
let t = crypto.randomBytes(32).toString("hex");
// 写入 ~/.claude/config.json 的 userID 字段
// 跨会话持久，用于关联同一用户的所有遥测事件

// getOrCreateMachineID() — 持久化机器 ID
let t = crypto.randomBytes(32).toString("hex");
// 写入 ~/.claude/config.json 的 machineID 字段

// Datadog userBucket — 不可逆分桶
let hash = crypto.createHash("sha256").update(userID).digest("hex");
let bucket = parseInt(hash.slice(0, 8), 16) % 30;
```

## 禁用方式

| 方式 | 作用域 |
|---|---|
| `CLAUDE_CODE_DISABLE_NONESSENTIAL_TRAFFIC` | 同时关闭 1P 和 Datadog |
| `V4e("firstParty")` / `V4e("datadog")` | 分别关闭对应通道 |
| `Jj()` 返回 true | 关闭 1P 通道 |
| GrowthBook `tengu_event_sampling_config` 中采样率=0 | 按事件名丢弃 |

## 事件分布（1513 个唯一事件名，全部以 `tengu_` 前缀）

### 🔴 高敏事件（涉及认证凭据、令牌、密钥存储）

| 事件名 | 风险点 |
|---|---|
| `tengu_oauth_token_exchange_success` | 记录了 token 交换成功，可能含 token 类型/范围信息 |
| `tengu_oauth_token_exchange_error` | 记录 token 交换失败，可能暴露认证端点/错误信息 |
| `tengu_oauth_token_refresh_success` | 记录 refresh 成功，含锁竞争/时序信息 |
| `tengu_oauth_token_refresh_failure` | 记录 refresh 失败，可能暴露认证状态/端点 |
| `tengu_oauth_token_refresh_lock_acquired` | 追踪锁获取时序，可推断并发认证模式 |
| `tengu_oauth_token_refresh_lock_acquiring` | 同上 |
| `tengu_oauth_token_refresh_lock_released` | 同上 |
| `tengu_oauth_token_refresh_lock_releasing` | 同上 |
| `tengu_oauth_token_refresh_lock_error` | 暴露锁机制实现细节 |
| `tengu_oauth_token_refresh_lock_release_error` | 同上 |
| `tengu_oauth_token_refresh_lock_retry` | 同上 |
| `tengu_oauth_token_refresh_lock_retry_limit_reached` | 暴露重试上限配置 |
| `tengu_oauth_token_refresh_race_recovered` | 暴露竞态条件存在 |
| `tengu_oauth_token_refresh_race_resolved` | 同上 |
| `tengu_oauth_token_refresh_starting` | 追踪刷新启动时序 |
| `tengu_oauth_token_refresh_completed` | 追踪刷新完成 |
| `tengu_oauth_tokens_saved` | 确认 token 持久化 |
| `tengu_oauth_tokens_save_failed` | 暴露存储机制失败 |
| `tengu_oauth_tokens_save_exception` | 暴露存储异常细节 |
| `tengu_oauth_tokens_inference_only` | 标记 token 仅用于推理 |
| `tengu_oauth_tokens_not_claude_ai` | 标记 token 来源非 claude.ai |
| `tengu_oauth_refresh_token_cleared_on_disk` | 确认磁盘上 token 清除 |
| `tengu_oauth_refresh_token_marked_dead_invalid_grant` | 标记 token 已死（invalid_grant）|
| `tengu_oauth_refresh_legacy_lock_contended` | 暴露旧版锁竞争 |
| `tengu_oauth_401_recovered_from_disk` | 从磁盘恢复 401 状态 |
| `tengu_oauth_401_recovered_from_keychain` | 从 keychain 恢复 401 状态 |
| `tengu_oauth_401_recovered_from_rotation` | 从轮换恢复 401 状态 |
| `tengu_oauth_401_sdk_callback_refreshed` | SDK 回调刷新 |
| `tengu_oauth_401_zombie_exit` | 僵尸 401 退出 |
| `tengu_oauth_storage_warning` | 存储警告 |
| `tengu_oauth_roles_stored` | 角色存储 |
| `tengu_oauth_api_key` | 记录 API Key 认证方式 |
| `tengu_oauth_auth_code_received` | 记录授权码接收 |
| `tengu_oauth_profile_fetch_success` | 确认 profile 拉取成功 |
| `tengu_api_key_saved_to_config` | 🔴 记录 API Key 保存到配置文件 |
| `tengu_api_key_saved_to_keychain` | 🔴 记录 API Key 保存到 keychain |
| `tengu_api_key_keychain_error` | Keychain 操作错误 |
| `tengu_login_from_refresh_token` | 🔴 记录从 refresh token 登录 |
| `tengu_wif_user_oauth_lock_acquired` | WIF（Workload Identity Federation）锁获取 |
| `tengu_wif_user_oauth_lock_released` | WIF 锁释放 |
| `tengu_wif_user_oauth_lock_retry` | WIF 锁重试 |
| `tengu_wif_user_oauth_lock_retry_limit` | WIF 锁重试上限 |
| `tengu_wif_user_oauth_refresh_race_resolved` | WIF OAuth 竞态解决 |
| `tengu_wif_user_oauth_refresh_token_cleared` | WIF token 清除 |
| `tengu_wif_implicit_profile_skipped_stored_login` | WIF 隐式 profile 跳过 |
| `tengu_mcp_oauth_flow_start` | MCP OAuth 流程启动 |
| `tengu_mcp_oauth_flow_success` | MCP OAuth 流程成功 |
| `tengu_mcp_oauth_flow_failure` | MCP OAuth 流程失败 |
| `tengu_mcp_oauth_flow_error` | MCP OAuth 流程错误 |
| `tengu_mcp_oauth_refresh_success` | MCP OAuth 刷新成功 |
| `tengu_mcp_oauth_refresh_failure` | MCP OAuth 刷新失败 |
| `tengu_mcp_oauth_browser_open` | MCP OAuth 浏览器打开 |
| `tengu_mcp_oauth_token_persist_failed` | MCP OAuth token 持久化失败 |
| `tengu_mcp_local_oauth_blocked_hosts` | 🔴 MCP OAuth 阻止的主机列表 |
| `tengu_design_oauth_login_error` | 设计态 OAuth 登录错误 |
| `tengu_design_oauth_login_success` | 设计态 OAuth 登录成功 |
| `tengu_design_oauth_manual_entry` | 设计态 OAuth 手动输入 |

### 🟠 中敏事件（涉及用户行为追踪、内容指纹、系统内部机制）

| 事件名 | 风险点 |
|---|---|
| `tengu_input_prompt` | 🟠 记录用户输入提示行为（可能含提示内容统计） |
| `tengu_input_bash` | 🟠 记录 Bash 命令输入 |
| `tengu_input_command` | 🟠 记录命令输入 |
| `tengu_input_slash_invalid` | 记录无效 slash 命令 |
| `tengu_input_slash_missing` | 记录缺失 slash 命令 |
| `tengu_bash_tool_command_executed` | 🟠 记录 Bash 命令执行（Datadog 白名单） |
| `tengu_bash_tool_command_failed` | 🟠 记录 Bash 命令失败（Datadog 白名单） |
| `tengu_bash_tool_simple_echo` | 记录简单 echo 命令 |
| `tengu_bash_command_explicitly_backgrounded` | 记录后台化命令 |
| `tengu_bash_command_timeout_backgrounded` | 记录超时后台化命令 |
| `tengu_bash_tool_kill_error` | Kill 进程错误 |
| `tengu_powershell_tool_command_executed` | 🟠 记录 PowerShell 命令执行 |
| `tengu_powershell_tool_command_failed` | 🟠 记录 PowerShell 命令失败 |
| `tengu_file_operation` | 🟠 记录文件操作（读/写/编辑） |
| `tengu_file_read_dedup` | 文件读去重 |
| `tengu_file_read_reread` | 重复读取同一文件 |
| `tengu_file_read_limits_override` | 文件读限制覆盖 |
| `tengu_file_upload_failed` | 文件上传失败 |
| `tengu_send_user_file` | 🟠 记录用户文件发送 |
| `tengu_session_file_read` | 🟠 记录会话中读取的文件（Datadog 白名单） |
| `tengu_team_mem_file_read` | 🟠 记录团队记忆文件读取 |
| `tengu_team_mem_file_write` | 🟠 记录团队记忆文件写入 |
| `tengu_team_mem_file_edit` | 🟠 记录团队记忆文件编辑 |
| `tengu_team_mem_accessed` | 团队记忆被访问 |
| `tengu_team_mem_secret_skipped` | 🟠 标记跳过了秘密内容 |
| `tengu_team_mem_foreign_partition_suppressed` | 外部分区被压制 |
| `tengu_team_mem_push_suppressed` | 推送被压制 |
| `tengu_memdir_file_edit` | 记忆目录文件编辑 |
| `tengu_memdir_file_read` | 记忆目录文件读取 |
| `tengu_memdir_file_write` | 记忆目录文件写入 |
| `tengu_paste_text` | 🟠 记录用户粘贴文本 |
| `tengu_paste_image` | 🟠 记录用户粘贴图片 |
| `tengu_pasted_image_resize_attempt` | 图片调整大小尝试 |
| `tengu_hook_output_persisted` | Hook 输出被持久化 |
| `tengu_transcript_accessed` | 🟠 记录对话记录被访问 |
| `tengu_transcript_view_enter` | 🟠 记录查看对话记录 |
| `tengu_transcript_view_exit` | 记录退出对话记录 |
| `tengu_transcript_write_failed` | 对话记录写入失败 |
| `tengu_web_fetch_http_error` | Web 请求错误 |
| `tengu_web_fetch_provenance_prompt` | 🟠 Web 请求来源提示 |
| `tengu_bug_report_description` | 🟠 记录 bug 报告描述内容 |
| `tengu_bug_report_submitted` | Bug 报告已提交 |
| `tengu_bug_report_failed` | Bug 报告提交失败 |
| `tengu_feedback_survey_event` | 反馈调查事件 |
| `tengu_bad_survey_transcript_ask_config` | 🟠 调查中请求查看对话记录 |
| `tengu_fine_survey_transcript_ask_config` | 同上 |
| `tengu_good_survey_transcript_ask_config` | 同上 |
| `tengu_long_context_survey_event` | 长上下文调查事件 |
| `tengu_post_compact_survey_event` | 压缩后调查事件 |
| `tengu_memory_survey_event` | 记忆调查事件 |
| `tengu_message_rated` | 🟠 用户对消息评分 |
| `tengu_feature_ok` / `feature_bad` / `feature_sad` | 功能评价（Datadog 白名单） |
| `tengu_tool_use_success` | 🟠 工具调用成功（含 toolName，Datadog 白名单） |
| `tengu_tool_use_error` | 🟠 工具调用错误（Datadog 白名单） |
| `tengu_tool_use_granted_in_prompt_permanent` | 🟠 工具永久授权 |
| `tengu_tool_use_granted_in_prompt_temporary` | 🟠 工具临时授权 |
| `tengu_tool_use_rejected_in_prompt` | 工具被拒绝 |
| `tengu_tool_use_denied_in_config` | 工具被配置拒绝 |
| `tengu_tool_use_granted_in_config` | 工具被配置授权 |
| `tengu_tool_use_granted_by_classifier` | 🟠 分类器自动授权工具 |
| `tengu_tool_use_granted_by_permission_hook` | 🟠 Hook 自动授权工具 |
| `tengu_tool_use_isolation_latch_denied` | 隔离锁拒绝 |
| `tengu_tool_use_show_permission_request` | 显示权限请求 |
| `tengu_permission_request_option_selected` | 🟠 用户选择权限选项 |
| `tengu_permission_request_escape` | 用户跳过权限 |
| `tengu_permission_explainer_generated` | 🟠 权限解释生成 |
| `tengu_shell_allow_rule_added` | 🟠 Shell 允许规则添加 |
| `tengu_shell_allow_rules_at_init` | 初始化时的 Shell 规则 |
| `tengu_shell_set_cwd` | 🟠 记录工作目录切换 |
| `tengu_shell_snapshot_error` / `snapshot_failed` | Shell 快照错误 |
| `tengu_trust_dialog_shown` / `accept` | 🟠 信任对话框交互 |
| `tengu_context_size` | 🟠 记录上下文大小 |
| `tengu_context_window_exceeded` | 上下文窗口超限 |
| `tengu_query_before_attachments` / `query_after_attachments` | 🟠 附件前后的查询信息 |
| `tengu_single_word_prompt` | 🟠 单词提示检测 |
| `tengu_model_response_keyword_detected` | 🟠 模型响应关键词检测 |
| `tengu_model_whitespace_response` | 空白响应检测 |
| `tengu_rotunda_pennant_replay` | 🟠 Pennant 回放（模型 fallback 机制） |
| `tengu_rotunda_pennant_applied` | 🟠 Pennant 应用 |
| `tengu_rotunda_pennant_materialized` | 🟠 Pennant 物化 |
| `tengu_rotunda_pennant_credit_echoed` | Pennant 信用回显 |
| `tengu_rotunda_pennant_strip` | Pennant 剥离 |
| `tengu_rotunda_pennant_malformed` | Pennant 格式错误 |
| `tengu_rotunda_pennant_chain_exhausted` | Pennant 链耗尽 |
| `tengu_rotunda_pennant_tools` | Pennant 工具 |
| `tengu_refusal_fallback_triggered` | 🟠 Refusal 回退触发 |
| `tengu_refusal_fallback_prompt_shown` | Refusal 提示显示 |
| `tengu_refusal_fallback_prompt_choice` | 🟠 Refusal 用户选择 |
| `tengu_refusal_api_response` | 🟠 记录 API refusal 响应 |
| `tengu_refusal_turn_classified_complete` | Refusal 分类完成 |
| `tengu_crimson_vector` | 🟠 内部 feature flag（图片上传限制 10MB） |
| `tengu_lantern_spool` | 🟠 内部 feature flag（anthropic-usage-limit header） |
| `tengu_cedar_lattice` | 🟠 内部 feature flag（anthropic-dispatch-id header） |
| `tengu_prompt_cache_diagnostics` | 🟠 提示缓存诊断 |
| `tengu_prompt_cache_diagnosis_received` | 提示缓存诊断接收 |
| `tengu_prompt_cache_break` | 提示缓存中断 |
| `tengu_prompt_cache_1h_config` | 1小时缓存配置 |
| `tengu_sysprompt_block` | 🟠 系统提示块检测 |
| `tengu_sysprompt_boundary_found` | 🟠 系统提示边界发现 |
| `tengu_sysprompt_missing_boundary_marker` | 系统提示缺少边界标记 |
| `tengu_sysprompt_using_tool_based_cache` | 🟠 使用基于工具的缓存 |
| `tengu_event_sampling_config` | 🟠 采样配置自身也被上报 |
| `tengu_1p_event_batch_config` | 🟠 1P 批处理配置被上报 |
| `tengu_frond_boric` | 🟠 Kill switch 配置自身也被上报 |
| `tengu_log_datadog_events` | 🟠 Datadog 日志配置被上报 |
| `tengu_startup_telemetry` | 🟠 启动遥测配置上报 |

### 🟡 低敏事件（运行状态、错误、性能指标）

| 事件名 | 说明 |
|---|---|
| `tengu_api_error` | API 调用错误（Datadog 白名单） |
| `tengu_api_success` | API 调用成功（Datadog 白名单） |
| `tengu_api_retry` | API 重试 |
| `tengu_api_slow_first_byte` | 慢首字节 |
| `tengu_api_fallback_last_resort` | 最后手段回退 |
| `tengu_api_after_normalize` / `before_normalize` | 消息标准化前后 |
| `tengu_streaming_error` | 流式错误 |
| `tengu_streaming_fallback_to_non_streaming` | 流式降级到非流式 |
| `tengu_streaming_stall` / `stall_summary` | 流式停滞 |
| `tengu_streaming_529_retry` | 529 重试 |
| `tengu_uncaught_exception` / `exception_loop` | 未捕获异常（Datadog 白名单） |
| `tengu_unhandled_rejection` | 未处理 rejection（Datadog 白名单） |
| `tengu_heap_dump` | 堆转储 |
| `tengu_daemon_startup_crash` / `worker_crash` | Daemon 崩溃 |
| `tengu_compact_failed` / `succeeded` | 上下文压缩 |
| `tengu_auto_compact_circuit_breaker` | 自动压缩熔断 |
| `tengu_startup_perf` | 启动性能分析（0.5% 采样） |
| `tengu_cost_threshold_reached` / `acknowledged` | 费用阈值 |
| `tengu_rate_limit_lever_hint` | 速率限制提示 |
| `tengu_config_changed` / `parse_error` / `model_changed` | 配置变更 |
| `tengu_config_auto_repaired` / `fallback_write` / `stale_write` | 配置修复 |
| `tengu_managed_settings_loaded` | 托管设置加载 |
| `tengu_managed_settings_validation_errors` | 托管设置验证错误 |
| `tengu_managed_settings_security_dialog_shown` / `accepted` / `rejected` | 托管安全对话框 |
| `tengu_policy_limits_fetch` / `cache_write_failed` | 策略限制 |
| `tengu_quota_mismatch` | 配额不匹配 |
| `tengu_usage_overage_included_models` | 超额使用 |
| `tengu_spend_limit_nudge_*` | 消费限制引导 |
| `tengu_version_check_success` / `failure` | 版本检查 |

### 🟢 内部代号/实验事件（大量代号事件，用途不明）

这些事件使用 `[颜色]_[名词]` 的命名模式，属于 A/B 测试或内部实验的 feature flag 追踪：

| 前缀 | 事件数 | 示例 |
|---|---|---|
| `tengu_amber_*` | 14 | amber_anchor, amber_creek, amber_flint, amber_lattice, amber_lynx, amber_moleskin, amber_packet, amber_prism, amber_quill, amber_redwood2, amber_redwood3, amber_relay, amber_rokovoko, amber_sentinel, amber_sextant, amber_wren |
| `tengu_cobalt_*` | 9 | cobalt_harbor, cobalt_heron, cobalt_lantern, cobalt_plinth, cobalt_plinth_dataviz, cobalt_plinth_direct, cobalt_plinth_fern, cobalt_plinth_putguard, cobalt_plinth_reader_persist, cobalt_ridge, cobalt_thicket, cobalt_wren |
| `tengu_slate_*` | 10 | slate_finch, slate_harbor, slate_harbor_experiment, slate_harrier, slate_ibis, slate_lantern, slate_moth, slate_prism, slate_quill, slate_ribbon, slate_thimble |
| `tengu_cedar_*` | 5 | cedar_lantern, cedar_lattice, cedar_marsh, cedar_plume, cedar_sundial |
| `tengu_basalt_*` | 3 | basalt_meadow, basalt_scarp, basalt_spur |
| `tengu_quiet_*` | 3 | quiet_fern, quiet_harbor, quiet_slate_wren |
| `tengu_velvet_*` | 5 | velvet_cascade, velvet_hammer, velvet_ibis, velvet_mallet, velvet_moth |
| `tengu_hazel_*` | 2 | hazel_osprey, hazel_osprey_floor |
| `tengu_ochre_*` | 2 | ochre_finch, ochre_hollow |
| `tengu_sepia_*` | 2 | sepia_cormorant, sepia_moth |
| `tengu_amber_*` | 14 | (见上) |
| 其他代号 | ~40 | alder_compass, birch_kettle, birch_lantern, brass_sled, chair_sermon, cinder_plover, cobalt_harbor, copper_fox, copper_lantern, copper_thistle, drift_lantern, dunwich_bell, ember_latch, flint_harbor_share, gorse_fathom, gypsum_kite, hawthorn_steeple, heron_brook, herring_clock, jade_anvil_4, kestrel_arch, lapis_anchor, lilac_loom, maple_pier, maple_sundial, marble_lark, marlin_porch, moss_anchor, moth_copse, ochre_finch, ochre_hollow, omelette_whisk, onyx_plover, orchid_mantis, orchid_mantis_v2, paper_halyard, passport_quail, pencil_farmer, pewter_brook, pewter_owl_model, pewter_summit, plum_vx3, russet_linnet, saffron_anchor, saffron_lattice, saffron_picker_dim, sage_compass2, sedge_lantern, shale_finch, sparrow_ledger, turtle_carbon, tussock_oriole, umber_petrel, vellum_siding, walnut_prism, walnut_spire |

### 按业务域的完整分布

| 域 | 事件数 | 事件列表 |
|---|---|---|
| **bg** (后台 Agent) | 89 | bg_adopt, bg_adopt_sock_unlinked, bg_adopt_unverified, bg_adopt_upgrade_respawn, bg_agent_action, bg_agent_dispatch, bg_agent_terminal, bg_attach, bg_attach_first_frame, bg_attach_kick, bg_attach_legacy_autorespawn, bg_attach_outcome, bg_attach_stall_gave_up, bg_attach_stall_ms, bg_attach_stall_respawn, bg_attach_upgrade, bg_binary_takeover, bg_bridge_flush_truncated, bg_classifier_config, bg_classify, bg_daemon_bg_disabled_skip, bg_daemon_binary_takeover, bg_daemon_cold_start_ask, bg_daemon_cold_start_ask_answer, bg_daemon_install, bg_daemon_macos_aqua_wrap, bg_daemon_service_poll_fallthrough, bg_daemon_service_stale_exec, bg_daemon_spawn_execpath_fallback, bg_daemon_spawn_failed, bg_daemon_spawn_versions_fallback, bg_daemon_wmi_fallback, bg_daemon_zombie_false_positive, bg_daemon_zombie_restart, bg_dispatch, bg_dispatch_fallback, bg_dispatch_low_mem, bg_dispatch_rejected, bg_dispatch_rescued, bg_dispatch_sigkill_escalate, bg_dispatch_stale_drop, bg_dispatch_watcher_failed, bg_exec_no_lastline, bg_handoff_settle, bg_killjob_ctrl_fallback, bg_leftarrow_inprocess, bg_low_mem_mb, bg_orphan_reap, bg_phase_illegal, bg_prewarm_per_sweep, bg_proto_mismatch, bg_pty_unavailable, bg_ptyhost_crash, bg_respawn, bg_respawn_exhausted, bg_respawn_no_transcript, bg_respawn_stale, bg_respawn_unconfirmed_bail, bg_retire_grace_bridged_min, bg_retire_pinned_low_mem, bg_retired, bg_roster_orphan_adopted, bg_roster_parse_failed, bg_rv_connect_exhausted, bg_rv_reply_rejected, bg_sendclaim_failed, bg_settle, bg_skew_nudge, bg_spare_claim, bg_spare_claim_fail, bg_spare_enable, bg_spare_spawn, bg_spawn_binary_gone, bg_spawn_cwd_gone, bg_state_read_transient, bg_worker_exit, bg_worker_spawn, bg_worker_stalled, bg_worker_vanished |
| **oauth** (认证) | 60 | 🔴 见上方高敏事件列表 |
| **mcp** (MCP 服务) | 71 | mcp_add, mcp_arg_trailing_invoke_suffix, mcp_auth_config_authenticate, mcp_auth_config_clear, mcp_channel_enable, mcp_channel_flags, mcp_channel_gate, mcp_channel_message, mcp_claudeai_proxy_401, mcp_command_inline, mcp_degraded, mcp_delete, mcp_description_contains_toolcall_xml, mcp_dialog_choice, mcp_directory_bff, mcp_directory_visibility, mcp_elicitation_response, mcp_elicitation_shown, mcp_first_party_auto_auth, mcp_first_party_scope_expanded, mcp_get, mcp_headers, mcp_ide_server_connection_failed, mcp_ide_server_connection_succeeded, mcp_instructions_pool_change, mcp_large_result_handled, mcp_list, mcp_list_changed, mcp_list_paginated, mcp_local_oauth_blocked_hosts, mcp_login, mcp_logout, mcp_multidialog_choice, mcp_normalize_root_combinators, mcp_oauth_*, mcp_pending_call, mcp_reconcile, mcp_registry_fetch, mcp_reset_mcpjson_choices, mcp_resource_templates_fetched, mcp_server_config_invalid, mcp_server_connection_failed, mcp_server_connection_succeeded, mcp_server_needs_auth, mcp_server_policy_bypass_exempt, mcp_servers, mcp_session_expired, mcp_singleton_unwrap, mcp_skills, mcp_start, mcp_startup_policy_seed, mcp_stateless_skip_init, mcp_strip_trailing_xml_tags, mcp_subagent_prompt, mcp_tool_call_auth_error, mcp_tool_result_ended_turn, mcp_tools_commands_loaded, mcp_tools_listed, mcp_tools_refreshed_mid_turn |
| **auto** (自动模式/更新) | 53 | auto_compact_*, auto_connect_ide_changed, auto_default_notice_shown, auto_default_nudge_*, auto_dream_*, auto_install_ide_extension_changed, auto_mem_tool_denied, auto_memory_toggled, auto_mode_*, auto_updater_* |
| **plugin** (插件) | 38 | plugin_autoupdate_*, plugin_binary_assets, plugin_command_failed, plugin_delisted_enforcement, plugin_details_command, plugin_disable_command, plugin_disabled_all_cli, plugin_disabled_cli, plugin_disuse_review_action, plugin_enable_command, plugin_enabled_cli, plugin_enabled_for_session, plugin_folder_shadowed, plugin_hint_detected, plugin_hint_response, plugin_install_command, plugin_install_failed, plugin_installed, plugin_installed_cli, plugin_list_command, plugin_load_failed, plugin_name_collision, plugin_official_mkt_git_fallback, plugin_prune_cli, plugin_prune_command, plugin_refresh_on_miss, plugin_remote_fetch, plugin_renamed, plugin_settings_premature_read, plugin_skills_dir_loaded, plugin_state_file_error, plugin_uninstall_command, plugin_uninstalled_cli, plugin_update_command, plugin_updated_cli, plugins_loaded, plugins_sync_* |
| **session** (会话) | 41 | session_all_projects_toggled, session_branch_filter_toggled, session_file_read, session_forked_branches_fetched, session_group_expanded, session_linked_to_pr, session_persistence_failed, session_preview_opened, session_rename_started, session_renamed, session_resumed, session_search_toggled, session_start, session_title_generated, session_worktree_filter_toggled, sessions_elevated_auth_* |
| **bridge** (Bridge 模式) | 32 | bridge_attestation_*, bridge_command, bridge_fatal_error, bridge_heartbeat_*, bridge_message_received, bridge_min_version, bridge_poll_*, bridge_reconnected, bridge_registration_failed, bridge_repl_*, bridge_requires_action_details, bridge_session_*, bridge_shutdown, bridge_spawn_mode_*, bridge_started, bridge_system_init, bridge_token_refreshed, bridge_vivid, bridge_work_secret_failed |
| **refusal** (拒绝回退) | 23 | refusal_api_response, refusal_fallback_*, refusal_retraction_*, refusal_turn_classified_complete |
| **tool** (工具调用) | 33 | tool_empty_result, tool_input_coerced, tool_input_json_parse_fail, tool_pear, tool_result_pairing_repaired, tool_result_persisted, tool_result_persisted_message_budget, tool_search_*, tool_use_* |
| **file** (文件操作) | 34 | file_activity, file_changed, file_history_*, file_operation, file_read_*, file_suggestions_*, file_upload_failed |
| **remote** (远程) | 25 | remote_active_goal_adopted, remote_attach_session*, remote_backend, remote_bootstrap_cycle_hidden, remote_create_session*, remote_model_picker, remote_reply_channel_*, remote_send_headless*, remote_settings_401_*, remote_setup_*, remote_subagent_frame_nested, remote_trigger |
| **streaming** (流式) | 22 | streaming_529_retry, streaming_error, streaming_fallback_to_non_streaming, streaming_idle_timeout, streaming_partial_finalized, streaming_stale_connection_retry, streaming_stall, streaming_stall_summary, streaming_watchdog_retry |
| **daemon** (守护进程) | 13 | daemon_cold_start_prompt, daemon_config_reload, daemon_control, daemon_exit, daemon_idle_exit, daemon_install, daemon_install_prompt_answer, daemon_lease, daemon_peer_uid_reject, daemon_self_restart_on_upgrade, daemon_start, daemon_startup_crash, daemon_worker_crash, daemon_worker_permanent_exit, daemon_yield, daemon_yield_takeover |
| **native** (原生安装) | 23 | native_auto_updater_*, native_cursor, native_install_*, native_staging_cleanup, native_stale_locks_cleanup, native_temp_files_cleanup, native_update_*, native_version_cleanup |
| **config** (配置) | 21 | config_auth_loss_prevented, config_auto_repaired, config_cache_stats, config_changed, config_fallback_write, config_lock_contention, config_model_changed, config_parse_error, config_shorthand, config_stale_write |
| **api** (API 调用) | 20 | api, api_529_background_dropped, api_after_normalize, api_before_normalize, api_cache_breakpoints, api_custom_529_overloaded_error, api_error, api_fallback_last_resort, api_key_*, api_model_not_found_fallback_triggered, api_opus_fallback_triggered, api_persistent_retry_wait, api_query, api_retry, api_retry_after_too_long, api_slow_first_byte, api_success |
| **compact** (压缩) | 16 | auto_compact_*, compact, compact_cache_prefix, compact_cache_sharing_*, compact_credits_clamp_rescue, compact_failed, compact_preserved_unanchored, compact_ptl_retry, partial_compact*, post_autocompact_turn, post_compact_*, precomputed_compact_*, reactive_compact_*, time_based_microcompact |
| **worktree** | 16 | worktree_cleanup, worktree_created, worktree_detection, worktree_entered_existing, worktree_kept, worktree_removed |
| **vertex/bedrock** | 24 | vertex_*, bedrock_* |
| **team** (团队) | 24 | team_artifact_tip_shown, team_discovery, team_mem_*, team_memdir_disabled, team_onboarding_* |
| **ultraplan** | 15 | ultraplan_approved, ultraplan_awaiting_input, ultraplan_config, ultraplan_create_failed, ultraplan_dialog_choice, ultraplan_failed, ultraplan_first_launch, ultraplan_keyword, ultraplan_launched, ultraplan_plan_ready, ultraplan_prompt_identifier, ultraplan_stopped, ultraplan_timeout_seconds |
| **accept/reject** | 4 | accept_submitted, accept_feedback_mode_collapsed, accept_feedback_mode_entered, reject_submitted, reject_feedback_mode_collapsed, reject_feedback_mode_entered |
| **其他** | ~350 | agent_*, advisor_*, adopt_*, agentic_search_*, at_mention_*, attachment_*, autocompact_*, autofix_*, autoupdate_*, ax_*, bash_*, binary_*, birch_*, braid_*, c4e_*, ccr_*, cd_command, chain_*, chrome_*, cicada_*, claude_*, claudemd_*, cli_flags, client_data_cache_*, closed_issue_*, code_*, concurrent_*, context_*, continue, conversation_*, coordinator_*, copy, deep_link_*, default_view_*, defer_*, desktop_upsell, destructive_command_*, dialog_*, diff_tool_*, dir_search, disable_*, dispatch_*, doctor_command, doorbell_*, drift_*, duplicate_*, dynamic_*, edit_*, editor_mode_*, effort_command, event_loop_*, exit_*, ext_*, external_editor_*, extra_usage_*, fabricated_*, fallback_*, fast_mode_*, feedback_survey_*, fgts, fleet_*, fleetview_*, flint_*, fold_*, fork_*, fotw_*, frame_*, fullscreen_*, gcp, git_*, gleaming_*, goal_*, gouda_*, grove_*, guest_passes_*, harbor_*, headless_*, help_*, history_picker_*, hook_*, human_origin_*, ide_*, idle_*, image_*, immediate_*, inject_*, install_github_app_*, install_slack_app_*, jediterm_*, juniper_*, kairos_*, keybinding_*, language_*, left_arrow_*, lone_surrogate_*, long_context_survey_*, loop_*, lsp_*, malformed_*, malort_*, mantle_*, marketplace_*, max_tokens_*, media_*, memdir_*, memory_*, message_*, mid_conv_*, migrate_*, mint_*, mocha_*, mode_cycle, model_*, native_*, neapolitan, node_warning, non_deferrable_*, nonstreaming_*, notification_*, off_switch_*, official_marketplace_*, onboarding_*, open_agents_*, opus_to_opus1m_*, org_penguin_*, orphaned_*, output_style_*, partial_stream_*, pdf_*, pending_*, penguins_*, permission_*, personal_mem_*, phantom_*, pkg_manager_*, plan_*, plugin_*, powershell_*, powerup_*, pr_status_*, pre_stop_*, pre_tool_*, precompute_*, prefill_*, preflight_*, print_model_*, pro_trial_*, prompt_*, ptl_*, push_*, query_*, quiet_*, quota_*, rc_upsell_*, read_dedup_*, reduce_motion_*, reinit_*, reload_*, rename_*, render_*, reorder_*, repl_*, report_findings_tool, request_user_dialog_*, reset_pro_*, respect_gitignore_*, resume_*, return_to_session, review_*, rewind_*, ripgrep_*, rotunda_*, routine_*, run_hook, saffron_*, sage_*, schedule_*, scheduled_task_*, scratch, scroll_*, sdk_*, sedge_*, send_user_file, sepia_*, session_*, setup_github_actions_*, setup_token_command, shale_*, shell_*, shining_*, shoji_*, show_message_timestamps_*, show_turn_duration_*, shutdown_signal, silent_*, silk_*, skill_*, slash_*, soft_slate_*, sonnet45_*, sparrow_*, spend_limit_*, spinner_*, stage_file_*, started, startup_*, status_line_*, stdin_*, stop_hook_*, stream_*, structured_output_*, subagent_*, sunset_*, supported_dialog_*, surreal_*, switch_to_subscription_*, sync_*, sysprompt_*, tab_read_*, teammate_*, teleport_*, terminal_*, thinking_*, time_based_*, timer, tip_*, tips_*, toggle_*, tombstone_*, trace_*, transcript_*, tree_sitter_*, trust_*, tty_*, tui_*, turtle_*, tussock_*, ultra_*, ultrathink, unary_*, uncaught_*, unclean_*, unexpected_*, unknown_*, update_*, usage_*, velvet_*, verified_*, version_*, voice_*, vscode_*, walnut_*, watched_file_*, web_fetch_*, wif_*, workflow_*, worktree_*, write_* |

## 启动性能分析（`tengu_startup_perf`）

专用事件，采样率 0.5%（`Math.random() < 0.005`）或 `CLAUDE_CODE_PROFILE_STARTUP` 手动开启。

上报的检查点对（20+ 个阶段）：

| 阶段 | 起止标记 |
|---|---|
| import_time | cli_entry → main_tsx_imports_loaded |
| init_time | init_function_start → init_function_end |
| settings_time | eagerLoadSettings_start → eagerLoadSettings_end |
| tools_loaded | init_function_end → action_tools_loaded |
| mcp_connect | before_connectMcp → after_connectMcp_claudeai |
| sandbox_init | before_sandbox_init → after_sandbox_init |
| total_time | cli_entry → main_after_run |

额外附加：`free_mem_mb`、`load_avg_1m`、`checkpoint_count`、`node_boot_ms`、`gap_unaccounted_ms`。

## 关键源码位置

| 功能 | 文件（cli_split 目录下） |
|---|---|
| logEvent 核心 + AnalyticsState | `cli/0004_profileReport_profileCheckpoint_logStartupPerf.js` L1-77 |
| 采样 + 1P 通道 | `cli/0185_shutdown1PEventLogging_shouldSampleEvent_reinitialize1PEvent.js` |
| Datadog 通道 + 白名单 | `cli/0432_trackDatadogEvent_shutdownDatadog_resetDatadogInit.js` |
| Sink 初始化 | `tools/0296_shouldTrackDatadog_initializeAnalyticsSink.js` L4568-4638 |
| core_metadata（QOn） | `tools/0184_SEND_USER_FILE_TOOL_PROMPT_SEND_USER_FILE_TOOL_NAME_DESCRIPT.js` L505-555 |
| user_metadata（sat） | `auth/0171_withOAuth401Retry_getWebFetchUserAgent_getUserAgent.js` L2776-2824 |
| 设备 ID | `sandbox/0431_shouldSkipPluginAutoupdate_setPathTrusted_setClientDataCache.js` L8998-9040 |
| 启动性能 | `cli/0004_profileReport_profileCheckpoint_logStartupPerf.js` L9400-9649 |
| flushAnalyticsSinks | `cli/0275_setupGracefulShutdown_resetShutdownState_releaseShutdownClai.js` L648-897 |
