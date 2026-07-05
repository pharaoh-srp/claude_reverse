  __export(dxe, {
    waitForScrollIdle: () => waitForScrollIdle,
    updateLastInteractionTime: () => updateLastInteractionTime,
    switchSession: () => switchSession,
    snapshotOutputTokensForTurn: () => snapshotOutputTokensForTurn,
    setUserMsgOptIn: () => setUserMsgOptIn,
    setUseCoworkPlugins: () => setUseCoworkPlugins,
    setTracerProvider: () => setTracerProvider,
    setThinkingTypeOverride: () => setThinkingTypeOverride,
    setThinkingDisplayExplicit: () => setThinkingDisplayExplicit,
    setTerminalFocusForState: () => setTerminalFocusForState,
    setTeleportedSessionInfo: () => setTeleportedSessionInfo,
    setTeamMemoryServerStatus: () => setTeamMemoryServerStatus,
    setSystemPromptSectionCacheEntry: () => setSystemPromptSectionCacheEntry,
    setSyncedPluginDirs: () => setSyncedPluginDirs,
    setStrictToolResultPairing: () => setStrictToolResultPairing,
    setStrictMcpConfig: () => setStrictMcpConfig,
    setStatsStore: () => setStatsStore,
    setStartupPolicySnapshot: () => setStartupPolicySnapshot,
    setSessionTrustAccepted: () => setSessionTrustAccepted,
    setSessionStartType: () => setSessionStartType,
    setSessionSource: () => setSessionSource,
    setSessionSkillAllowlist: () => setSessionSkillAllowlist,
    setSessionPrResolved: () => setSessionPrResolved,
    setSessionPersistenceDisabled: () => setSessionPersistenceDisabled,
    setSessionOverridesGetter: () => setSessionOverridesGetter,
    setSessionIngressToken: () => setSessionIngressToken,
    setSessionBypassPermissionsMode: () => setSessionBypassPermissionsMode,
    setSearchToolsOptIn: () => setSearchToolsOptIn,
    setSdkSupportedDialogKinds: () => setSdkSupportedDialogKinds,
    setSdkOAuthTokenRefreshCallback: () => setSdkOAuthTokenRefreshCallback,
    setSdkDialogHostActive: () => setSdkDialogHostActive,
    setSdkBetas: () => setSdkBetas,
    setSdkAgentProgressSummariesEnabled: () => setSdkAgentProgressSummariesEnabled,
    setScheduledTasksEnabled: () => setScheduledTasksEnabled,
    setResolvedOrgDefault: () => setResolvedOrgDefault,
    setReplConfigArgv: () => setReplConfigArgv,
    setReplBridgeActive: () => setReplBridgeActive,
    setRendererModeForAnalytics: () => setRendererModeForAnalytics,
    setQuestionPreviewFormat: () => setQuestionPreviewFormat,
    setPromptId: () => setPromptId,
    setPromptCache1hAllowlist: () => setPromptCache1hAllowlist,
    setProjectRoot: () => setProjectRoot,
    setPermissionPromptToolName: () => setPermissionPromptToolName,
    setParentManagedSettings: () => setParentManagedSettings,
    setOriginalCwd: () => setOriginalCwd,
    setOnboardingShownThisSession: () => setOnboardingShownThisSession,
    setOauthTokenFromFd: () => setOauthTokenFromFd,
    setOauthScopesFromFd: () => setOauthScopesFromFd,
    setNeedsPlanModeExitAttachment: () => setNeedsPlanModeExitAttachment,
    setNeedsAutoModeExitAttachment: () => setNeedsAutoModeExitAttachment,
    setModelStrings: () => setModelStrings,
    setModelOverrideOptOutForSession: () => setModelOverrideOptOutForSession,
    setMeterProvider: () => setMeterProvider,
    setMeter: () => setMeter,
    setMemoryToggledOff: () => setMemoryToggledOff,
    setMcpConnectNonBlocking: () => setMcpConnectNonBlocking,
    setMcpClientsAccessor: () => setMcpClientsAccessor,
    setMainThreadAgentType: () => setMainThreadAgentType,
    setMainThreadAgentHooks: () => setMainThreadAgentHooks,
    setMainLoopModelOverride: () => setMainLoopModelOverride,
    setMainLoopBusy: () => setMainLoopBusy,
    setLspRecommendationShownThisSession: () => setLspRecommendationShownThisSession,
    setLoopTickInFlightPrompt: () => setLoopTickInFlightPrompt,
    setLoopConsecutiveKeepalives: () => setLoopConsecutiveKeepalives,
    setLoopChainStartedAt: () => setLoopChainStartedAt,
    setLongContext1mCreditsBlocked: () => setLongContext1mCreditsBlocked,
    setLoggerProvider: () => setLoggerProvider,
    setLastMainThreadCacheTtlMs: () => setLastMainThreadCacheTtlMs,
    setLastMainRequestId: () => setLastMainRequestId,
    setLastEmittedDate: () => setLastEmittedDate,
    setLastClassifierRequests: () => setLastClassifierRequests,
    setLastCancelledAPIMessageId: () => setLastCancelledAPIMessageId,
    setLastApiCompletionTimestamp: () => setLastApiCompletionTimestamp,
    setLastAPIRequestMessages: () => setLastAPIRequestMessages,
    setLastAPIRequest: () => setLastAPIRequest,
    setIsRemoteMode: () => setIsRemoteMode,
    setIsInteractive: () => setIsInteractive,
    setInlinePluginsNoMcp: () => setInlinePluginsNoMcp,
    setInlinePlugins: () => setInlinePlugins,
    setInlinePluginUrls: () => setInlinePluginUrls,
    setInitialMainLoopModel: () => setInitialMainLoopModel,
    setInitJsonSchema: () => setInitJsonSchema,
    setInheritedTeamName: () => setInheritedTeamName,
    setInferenceProfileBackingModel: () => setInferenceProfileBackingModel,
    setHostAuthTokenRefreshCallback: () => setHostAuthTokenRefreshCallback,
    setHasUnknownModelCost: () => setHasUnknownModelCost,
    setHasStreamingInput: () => setHasStreamingInput,
    setHasExitedPlanMode: () => setHasExitedPlanMode,
    setHasDevChannels: () => setHasDevChannels,
    setGatewayRefreshInFlight: () => setGatewayRefreshInFlight,
    setGatewayAuth: () => setGatewayAuth,
    setFlagSettingsPath: () => setFlagSettingsPath,
    setFlagSettingsInline: () => setFlagSettingsInline,
    setFlagSettingsExpectedContent: () => setFlagSettingsExpectedContent,
    setFableCreditsRequired: () => setFableCreditsRequired,
    setFableConsentSessionFallback: () => setFableConsentSessionFallback,
    setFableConsentDialogInteracted: () => setFableConsentDialogInteracted,
    setFableBridgeDialogTimedOut: () => setFableBridgeDialogTimedOut,
    setEventLogger: () => setEventLogger,
    setDisableSlashCommands: () => setDisableSlashCommands,
    setDirectConnectServerUrl: () => setDirectConnectServerUrl,
    setCwdState: () => setCwdState,
    setCostStateForRestore: () => setCostStateForRestore,
    setClientType: () => setClientType,
    setChromeFlagOverride: () => setChromeFlagOverride,
    setCaps: () => setCaps,
    setCachedTelemetryResource: () => setCachedTelemetryResource,
    setCachedOtlpHttpAgentFactory: () => setCachedOtlpHttpAgentFactory,
    setCachedClaudeMdContent: () => setCachedClaudeMdContent,
    setAttacherCaps: () => setAttacherCaps,
    setApiKeyFromFd: () => setApiKeyFromFd,
    setAllowedSettingSources: () => setAllowedSettingSources,
    setAllowedChannels: () => setAllowedChannels,
    setAdditionalDirectoriesForClaudeMd: () => setAdditionalDirectoriesForClaudeMd,
    setActiveRoutine: () => setActiveRoutine,
    rewriteRefusalFallbackPreviousOverride: () => rewriteRefusalFallbackPreviousOverride,
    resetTotalDurationStateAndCost_FOR_TESTS_ONLY: () => resetTotalDurationStateAndCost_FOR_TESTS_ONLY,
    resetStateForTests: () => resetStateForTests,
    resetStartTime: () => resetStartTime,
    resetModelStringsForTestingOnly: () => resetModelStringsForTestingOnly,
    resetModelStrings: () => resetModelStrings,
    resetInteractionBaseline: () => resetInteractionBaseline,
    resetFdCredentialState: () => resetFdCredentialState,
    resetCostState: () => resetCostState,
    removeSessionCronTasks: () => removeSessionCronTasks,
    registerHookCallbacks: () => registerHookCallbacks,
    regenerateSessionId: () => regenerateSessionId,
    preferThirdPartyAuthentication: () => preferThirdPartyAuthentication,
    onTerminalFocusChange: () => onTerminalFocusChange,
    onSessionSwitch: () => onSessionSwitch,
    onOriginalCwdChange: () => onOriginalCwdChange,
    onInteraction: () => onInteraction,
    onAttacherCapsChange: () => onAttacherCapsChange,
    needsPlanModeExitAttachment: () => needsPlanModeExitAttachment,
    needsAutoModeExitAttachment: () => needsAutoModeExitAttachment,
    markScrollActivity: () => markScrollActivity,
    markPostCompaction: () => markPostCompaction,
    markFirstTeleportMessageLogged: () => markFirstTeleportMessageLogged,
    mainAgentId: () => mainAgentId,
    latchRefusalFallbackModel: () => latchRefusalFallbackModel,
    isUserActiveForNotifications: () => isUserActiveForNotifications,
    isSessionPersistenceDisabled: () => isSessionPersistenceDisabled,
    isSdkDialogHostActive: () => isSdkDialogHostActive,
    isReplBridgeActive: () => isReplBridgeActive,
    isLongContext1mCreditsBlocked: () => isLongContext1mCreditsBlocked,
    isGatewayAuthPinned: () => isGatewayAuthPinned,
    isGatewayAuthExpired: () => isGatewayAuthExpired,
    isFableCreditsRequired: () => isFableCreditsRequired,
    incrementPromptIndex: () => incrementPromptIndex,
    incrementBudgetContinuationCount: () => incrementBudgetContinuationCount,
    hasUnknownModelCost: () => hasUnknownModelCost,
    hasShownLspRecommendationThisSession: () => hasShownLspRecommendationThisSession,
    hasFableConsentSessionFallback: () => hasFableConsentSessionFallback,
    hasFableConsentDialogInteracted: () => hasFableConsentDialogInteracted,
    hasFableBridgeDialogTimedOut: () => hasFableBridgeDialogTimedOut,
    hasExitedPlanModeInSession: () => hasExitedPlanModeInSession,
    handlePlanModeTransition: () => handlePlanModeTransition,
    handleAutoModeTransition: () => handleAutoModeTransition,
    getUserMsgOptIn: () => getUserMsgOptIn,
    getUseCoworkPlugins: () => getUseCoworkPlugins,
    getUsageForModel: () => getUsageForModel,
    getTurnOutputTokens: () => getTurnOutputTokens,
    getTracerProvider: () => getTracerProvider,
    getTotalWebSearchRequests: () => getTotalWebSearchRequests,
    getTotalToolDuration: () => getTotalToolDuration,
    getTotalOutputTokens: () => getTotalOutputTokens,
    getTotalLinesRemoved: () => getTotalLinesRemoved,
    getTotalLinesAdded: () => getTotalLinesAdded,
    getTotalInputTokens: () => getTotalInputTokens,
    getTotalDuration: () => getTotalDuration,
    getTotalCostUSD: () => getTotalCostUSD,
    getTotalCacheReadInputTokens: () => getTotalCacheReadInputTokens,
    getTotalCacheCreationInputTokens: () => getTotalCacheCreationInputTokens,
    getTotalAPIDurationWithoutRetries: () => getTotalAPIDurationWithoutRetries,
    getTotalAPIDuration: () => getTotalAPIDuration,
    getTokenCounter: () => getTokenCounter,
    getThinkingTypeOverride: () => getThinkingTypeOverride,
    getThinkingDisplayExplicit: () => getThinkingDisplayExplicit,
    getTerminalFocus: () => getTerminalFocus,
    getTeleportedSessionInfo: () => getTeleportedSessionInfo,
    getTeamMemoryServerStatus: () => getTeamMemoryServerStatus,
    getSystemPromptSectionCache: () => getSystemPromptSectionCache,
    getSyncedPluginDirs: () => getSyncedPluginDirs,
    getSurfacedHookSpawnFailures: () => getSurfacedHookSpawnFailures,
    getStrictToolResultPairing: () => getStrictToolResultPairing,
    getStrictMcpConfig: () => getStrictMcpConfig,
    getStickyBetas: () => getStickyBetas,
    getStatsStore: () => getStatsStore,
    getStartupPolicySnapshot: () => getStartupPolicySnapshot,
    getSlowOperations: () => getSlowOperations,
    getSessionTrustAccepted: () => getSessionTrustAccepted,
    getSessionStartType: () => getSessionStartType,
    getSessionStartTime: () => getSessionStartTime,
    getSessionSource: () => getSessionSource,
    getSessionSkillAllowlist: () => getSessionSkillAllowlist,
    getSessionProjectDir: () => getSessionProjectDir,
    getSessionPrResolved: () => getSessionPrResolved,
    getSessionIngressToken: () => getSessionIngressToken,
    getSessionId: () => getSessionId,
    getSessionCronTasks: () => getSessionCronTasks,
    getSessionCreatedTeams: () => getSessionCreatedTeams,
    getSessionCounter: () => getSessionCounter,
    getSessionBypassPermissionsMode: () => getSessionBypassPermissionsMode,
    getSessionApprovedMcpServers: () => getSessionApprovedMcpServers,
    getSearchToolsOptIn: () => getSearchToolsOptIn,
    getSdkSupportedDialogKinds: () => getSdkSupportedDialogKinds,
    getSdkOAuthTokenRefreshCallback: () => getSdkOAuthTokenRefreshCallback,
    getSdkDialogCapabilitySource: () => getSdkDialogCapabilitySource,
    getSdkBetas: () => getSdkBetas,
    getSdkAgentProgressSummariesEnabled: () => getSdkAgentProgressSummariesEnabled,
    getScheduledTasksEnabled: () => getScheduledTasksEnabled,
    getResolvedOrgDefault: () => getResolvedOrgDefault,
    getReplConfigArgv: () => getReplConfigArgv,
    getRendererModeForAnalytics: () => getRendererModeForAnalytics,
    getRegisteredHooks: () => getRegisteredHooks,
    getRefusalFallbackModelLatch: () => getRefusalFallbackModelLatch,
    getQuestionPreviewFormat: () => getQuestionPreviewFormat,
    getPromptIndex: () => getPromptIndex,
    getPromptId: () => getPromptId,
    getPromptCache1hAllowlist: () => getPromptCache1hAllowlist,
    getProjectRoot: () => getProjectRoot,
    getPrCounter: () => getPrCounter,
    getPlanSlugCache: () => getPlanSlugCache,
    getPermissionPromptToolName: () => getPermissionPromptToolName,
    getParentSessionId: () => getParentSessionId,
    getParentManagedSettings: () => getParentManagedSettings,
    getOriginalCwd: () => getOriginalCwd,
    getOnboardingShownThisSession: () => getOnboardingShownThisSession,
    getOauthTokenFromFd: () => getOauthTokenFromFd,
    getOauthScopesFromFd: () => getOauthScopesFromFd,
    getModelUsage: () => getModelUsage,
    getModelStrings: () => getModelStrings,
    getModelOverrideOptOutForSession: () => getModelOverrideOptOutForSession,
    getMeterProvider: () => getMeterProvider,
    getMeter: () => getMeter,
    getMemoryToggledOff: () => getMemoryToggledOff,
    getMcpConnectNonBlocking: () => getMcpConnectNonBlocking,
    getMcpClientsFromAccessor: () => getMcpClientsFromAccessor,
    getMainThreadAgentType: () => getMainThreadAgentType,
    getMainThreadAgentHooks: () => getMainThreadAgentHooks,
    getMainLoopModelOverride: () => getMainLoopModelOverride,
    getMainLoopBusy: () => getMainLoopBusy,
    getLoopTickInFlightPrompt: () => getLoopTickInFlightPrompt,
    getLoopConsecutiveKeepalives: () => getLoopConsecutiveKeepalives,
    getLoopChainStartedAt: () => getLoopChainStartedAt,
    getLoggerProvider: () => getLoggerProvider,
    getLocCounter: () => getLocCounter,
    getLastMainThreadCacheTtlMs: () => getLastMainThreadCacheTtlMs,
    getLastMainRequestId: () => getLastMainRequestId,
    getLastInteractionTime: () => getLastInteractionTime,
    getLastEmittedDate: () => getLastEmittedDate,
    getLastClassifierRequests: () => getLastClassifierRequests,
    getLastCancelledAPIMessageId: () => getLastCancelledAPIMessageId,
    getLastApiCompletionTimestamp: () => getLastApiCompletionTimestamp,
    getLastAPIRequestMessages: () => getLastAPIRequestMessages,
    getLastAPIRequest: () => getLastAPIRequest,
    getIsScrollDraining: () => getIsScrollDraining,
    getIsRemoteMode: () => getIsRemoteMode,
    getIsNonInteractiveSession: () => getIsNonInteractiveSession,
    getIsInteractive: () => getIsInteractive,
    getInvokedSkillsForAgent: () => getInvokedSkillsForAgent,
    getInvokedSkills: () => getInvokedSkills,
    getInlinePluginsNoMcp: () => getInlinePluginsNoMcp,
    getInlinePlugins: () => getInlinePlugins,
    getInlinePluginUrls: () => getInlinePluginUrls,
    getInitialMainLoopModel: () => getInitialMainLoopModel,
    getInitJsonSchema: () => getInitJsonSchema,
    getInheritedTeamName: () => getInheritedTeamName,
    getInferenceProfileBackingModelCached: () => getInferenceProfileBackingModelCached,
    getHostAuthTokenRefreshCallback: () => getHostAuthTokenRefreshCallback,
    getHasStreamingInput: () => getHasStreamingInput,
    getHasDevChannels: () => getHasDevChannels,
    getGatewayRefreshInFlight: () => getGatewayRefreshInFlight,
    getGatewayAuth: () => getGatewayAuth,
    getFoundryDeploymentCapabilities: () => getFoundryDeploymentCapabilities,
    getFlagSettingsPath: () => getFlagSettingsPath,
    getFlagSettingsInline: () => getFlagSettingsInline,
    getFlagSettingsExpectedContent: () => getFlagSettingsExpectedContent,
    getEventLogger: () => getEventLogger,
    getDisableSlashCommands: () => getDisableSlashCommands,
    getDirectConnectServerUrl: () => getDirectConnectServerUrl,
    getCwdState: () => getCwdState,
    getCurrentTurnTokenBudget: () => getCurrentTurnTokenBudget,
    getCostCounter: () => getCostCounter,
    getCommitCounter: () => getCommitCounter,
    getCodeEditToolDecisionCounter: () => getCodeEditToolDecisionCounter,
    getClientType: () => getClientType,
    getChromeFlagOverride: () => getChromeFlagOverride,
    getCaps: () => getCaps,
    getCachedTelemetryResource: () => getCachedTelemetryResource,
    getCachedOtlpHttpAgentFactory: () => getCachedOtlpHttpAgentFactory,
    getCachedClaudeMdContent: () => getCachedClaudeMdContent,
    getBudgetContinuationCount: () => getBudgetContinuationCount,
    getBareMcpServerMatchersWarned: () => getBareMcpServerMatchersWarned,
    getAttacherCaps: () => getAttacherCaps,
    getApiKeyFromFd: () => getApiKeyFromFd,
    getAllowedSettingSources: () => getAllowedSettingSources,
    getAllowedChannels: () => getAllowedChannels,
    getAgentColorMap: () => getAgentColorMap,
    getAdditionalDirectoriesForClaudeMd: () => getAdditionalDirectoriesForClaudeMd,
    getActiveTimeCounter: () => getActiveTimeCounter,
    getActiveRoutine: () => getActiveRoutine,
    flushInteractionTime: () => flushInteractionTime,
    discardPendingOTelEvents: () => discardPendingOTelEvents,
    deleteLoopChainStartedAt: () => deleteLoopChainStartedAt,
    consumePostCompaction: () => consumePostCompaction,
    clearSystemPromptSectionState: () => clearSystemPromptSectionState,
    clearRegisteredPluginHooks: () => clearRegisteredPluginHooks,
    clearRegisteredHooks: () => clearRegisteredHooks,
    clearRefusalFallbackModelLatch: () => clearRefusalFallbackModelLatch,
    clearInvokedSkillsForAgent: () => clearInvokedSkillsForAgent,
    clearInvokedSkills: () => clearInvokedSkills,
    clearBetaHeaderLatches: () => clearBetaHeaderLatches,
    bufferPendingOTelEvent: () => bufferPendingOTelEvent,
    addToTotalLinesChanged: () => addToTotalLinesChanged,
    addToTotalDurationState: () => addToTotalDurationState,
    addToTotalCostState: () => addToTotalCostState,
    addToToolDuration: () => addToToolDuration,
    addToInMemoryErrorLog: () => addToInMemoryErrorLog,
    addSlowOperation: () => addSlowOperation,
    addSessionCronTask: () => addSessionCronTask,
    addSessionApprovedMcpServers: () => addSessionApprovedMcpServers,
    addInvokedSkill: () => addInvokedSkill,
    NOTIF_ACTIVE_THRESHOLD_MS: () => 60000
  });
  function Wcs() {
    let e = "";
    if (typeof process < "u" && typeof process.cwd === "function" && typeof DEr.realpathSync === "function") {
      let n = qcs.cwd();
      try {
        e = DEr.realpathSync(n);
      } catch {
        e = n;
      }
    }
    return {
      originalCwd: e,
      projectRoot: e,
      totalCostUSD: 0,
      totalAPIDuration: 0,
      totalAPIDurationWithoutRetries: 0,
      totalToolDuration: 0,
      startTime: Date.now(),
      sessionLogicalStartTime: undefined,
      lastInteractionTime: Date.now(),
      totalLinesAdded: 0,
      totalLinesRemoved: 0,
      hasUnknownModelCost: false,
      cwd: e,
      modelUsage: {},
      mainLoopModelOverride: undefined,
      refusalFallbackModelLatch: undefined,
      sdkDialogHostActive: false,
      sdkSupportedDialogKinds: undefined,
      sdkSupportedDialogKindsSource: undefined,
      replConfigArgv: [],
      initialMainLoopModel: undefined,
      resolvedOrgDefault: undefined,
      modelStrings: null,
      isInteractive: false,
      thinkingDisplayExplicit: false,
      permissionPromptToolName: undefined,
      attacherCaps: null,
      hasStreamingInput: false,
      modelOverrideOptOutForSession: false,
      rendererMode: undefined,
      strictToolResultPairing: false,
      memoryToggledOff: false,
      teamMemoryServerStatus: undefined,
      sdkAgentProgressSummariesEnabled: false,
      userMsgOptIn: false,
      searchToolsOptIn: false,
      clientType: "cli",
      sessionSource: undefined,
      sessionStartType: "fresh",
      questionPreviewFormat: undefined,
      sessionIngressToken: undefined,
      oauthTokenFromFd: undefined,
      oauthScopesFromFd: undefined,
      apiKeyFromFd: undefined,
      gatewayAuth: null,
      gatewayRefreshInFlight: null,
      startupPolicySnapshot: undefined,
      flagSettingsPath: undefined,
      flagSettingsExpectedContent: undefined,
      flagSettingsInline: null,
      parentManagedSettings: null,
      allowedSettingSources: ["userSettings", "projectSettings", "localSettings", "flagSettings", "policySettings"],
      meter: null,
      sessionCounter: null,
      locCounter: null,
      prCounter: null,
      commitCounter: null,
      costCounter: null,
      tokenCounter: null,
      codeEditToolDecisionCounter: null,
      activeTimeCounter: null,
      statsStore: null,
      sessionId: kAt() ?? Zee.randomUUID(),
      mainAgentId: null,
      parentSessionId: undefined,
      loggerProvider: null,
      eventLogger: null,
      pendingOTelEvents: [],
      meterProvider: null,
      tracerProvider: null,
      cachedTelemetryResource: null,
      cachedOtlpHttpAgentFactory: {
        direct: null,
        proxied: null
      },
      foundryDeploymentCapabilities: new Map(),
      agentColorMap: new Map(),
      agentColorIndex: 0,
      lastAPIRequest: null,
      lastCancelledAPIMessageId: null,
      lastAPIRequestMessages: null,
      lastClassifierRequests: null,
      cachedClaudeMdContent: null,
      inMemoryErrorLog: [],
      inlinePlugins: [],
      inlinePluginsNoMcp: [],
      inlinePluginUrls: [],
      syncedPluginDirs: [],
      chromeFlagOverride: undefined,
      onboardingShownThisSession: false,
      useCoworkPlugins: false,
      disableSlashCommands: false,
      sessionBypassPermissionsMode: false,
      scheduledTasksEnabled: false,
      sessionPrResolved: false,
      sessionCronTasks: [],
      loopChainStartedAt: Object.create(null),
      loopTickInFlightPrompt: null,
      loopConsecutiveKeepalives: 0,
      sessionCreatedTeams: new Set(),
      surfacedHookSpawnFailures: new Set(),
      bareMcpServerMatchersWarned: new Set(),
      inheritedTeamName: undefined,
      sessionTrustAccepted: false,
      sessionPersistenceDisabled: false,
      hasExitedPlanMode: false,
      needsPlanModeExitAttachment: false,
      needsAutoModeExitAttachment: false,
      lspRecommendationShownThisSession: false,
      initJsonSchema: null,
      registeredHooks: null,
      planSlugCache: new Map(),
      teleportedSessionInfo: null,
      invokedSkills: new Map(),
      slowOperations: [],
      sdkBetas: undefined,
      longContext1mCreditsBlocked: false,
      fableCreditsRequired: false,
      fableConsentSessionFallback: false,
      fableBridgeDialogTimedOut: false,
      fableConsentDialogInteracted: false,
      sdkOAuthTokenRefreshCallback: null,
      hostAuthTokenRefreshCallback: null,
      mainThreadAgentType: undefined,
      mainThreadAgentHooks: undefined,
      sessionSkillAllowlist: undefined,
      caps: Knu,
      replBridgeActive: false,
      mainLoopBusy: false,
      directConnectServerUrl: undefined,
      mcpConnectNonBlocking: false,
      strictMcpConfig: false,
      sessionApprovedMcpServers: [],
      activeRoutine: undefined,
      systemPromptSectionCache: new Map(),
      lastEmittedDate: null,
      additionalDirectoriesForClaudeMd: [],
      allowedChannels: [],
      hasDevChannels: false,
      sessionProjectDir: null,
      promptCache1hAllowlist: null,
      stickyBetas: Cae(),
      thinkingTypeOverrides: new Map(),
      inferenceProfileBackingModels: new Map(),
      promptId: null,
      promptIndex: 0,
      lastMainRequestId: undefined,
      lastMainThreadCacheTtlMs: null,
      lastApiCompletionTimestamp: null,
      pendingPostCompaction: false
    };
  }
  function setSessionOverridesGetter(e) {
    ok = e;
  }
  function getSessionId() {
    return ok()?.sessionId ?? Bt.sessionId;
  }
  function mainAgentId() {
    let e = ok()?.sessionId;
    if (e) {
      return e;
    }
    Bt.mainAgentId ??= Bt.sessionId;
    return Bt.mainAgentId;
  }
  function regenerateSessionId(e = {}) {
    if (e.setCurrentAsParent) {
      Bt.parentSessionId = Bt.sessionId;
    }
    Bt.planSlugCache.delete(Bt.sessionId);
    Bt.sessionId = Zee.randomUUID();
    Bt.sessionProjectDir = null;
    Bt.promptIndex = 0;
    Bt.lastCancelledAPIMessageId = null;
    let t = Vcs();
    Gcs(Bt.sessionId, "clear", t);
    return Bt.sessionId;
  }
  function Gcs(e, t, n) {
    if (n) {
      cln.emit(e, t, n);
    } else {
      cln.emit(e, t);
    }
  }
  function getParentSessionId() {
    let e = ok();
    return e ? e.parentSessionId : Bt.parentSessionId;
  }
  function switchSession(e, t, n = null) {
    let r;
    if (Bt.sessionId !== e) {
      Bt.planSlugCache.delete(Bt.sessionId);
      Bt.lastCancelledAPIMessageId = null;
      r = Vcs();
      Bt.parentSessionId = undefined;
    }
    Bt.sessionId = e;
    Bt.sessionProjectDir = n;
    Gcs(e, t, r);
  }
  function Vcs() {
    let e = Bt.refusalFallbackModelLatch;
    if (Bt.refusalFallbackModelLatch = undefined, !e || Bt.mainLoopModelOverride !== e.fallbackModel) {
      return;
    }
    Bt.mainLoopModelOverride = e.previousOverride;
    return {
      appStateModel: e.previousAppStateModel,
      forSessionValue: e.previousModelForSession,
      overrideValue: e.previousOverride,
      restoredToExplicitOverride: e.previousOverride !== undefined,
      fallbackModel: e.fallbackModel
    };
  }
  function getSessionProjectDir() {
    let e = ok();
    return e ? e.sessionProjectDir : Bt.sessionProjectDir;
  }
  function getOriginalCwd() {
    return ok()?.originalCwd ?? Bt.originalCwd;
  }
  function getProjectRoot() {
    return ok()?.projectRoot ?? Bt.projectRoot;
  }
  function setOriginalCwd(e) {
    Bt.originalCwd = e;
    LEr.emit(Bt.originalCwd);
  }
  function setProjectRoot(e) {
    Bt.projectRoot = e;
  }
  function getCwdState() {
    return Bt.cwd;
  }
  function setCwdState(e) {
    Bt.cwd = e;
  }
  function resetStartTime() {
    Bt.startTime = Date.now();
    Bt.sessionLogicalStartTime = undefined;
  }
  function getSessionStartTime() {
    return Bt.sessionLogicalStartTime ?? Bt.startTime;
  }
  function getDirectConnectServerUrl() {
    return Bt.directConnectServerUrl;
  }
  function setDirectConnectServerUrl(e) {
    Bt.directConnectServerUrl = e;
  }
  function getMcpConnectNonBlocking() {
    return Bt.mcpConnectNonBlocking;
  }
  function setMcpConnectNonBlocking(e) {
    Bt.mcpConnectNonBlocking = e;
  }
  function getStrictMcpConfig() {
    return Bt.strictMcpConfig;
  }
  function setStrictMcpConfig(e) {
    Bt.strictMcpConfig = e;
  }
  function getSessionApprovedMcpServers() {
    return Bt.sessionApprovedMcpServers;
  }
  function addSessionApprovedMcpServers(e, t) {
    for (let n of t) {
      if (!Bt.sessionApprovedMcpServers.some(r => r.name === n && r.workspaceKey === e)) {
        Bt.sessionApprovedMcpServers.push({
          name: n,
          workspaceKey: e
        });
      }
    }
  }
  function getActiveRoutine() {
    return Bt.activeRoutine;
  }
  function setActiveRoutine(e) {
    Bt.activeRoutine = e;
  }
  function addToTotalDurationState(e, t) {
    Bt.totalAPIDuration += e;
    Bt.totalAPIDurationWithoutRetries += t;
  }
  function resetTotalDurationStateAndCost_FOR_TESTS_ONLY() {
    Bt.totalAPIDuration = 0;
    Bt.totalAPIDurationWithoutRetries = 0;
    Bt.totalCostUSD = 0;
  }
  function addToTotalCostState(e, t, n) {
    Bt.modelUsage[n] = t;
    Bt.totalCostUSD += e;
  }
  function getTotalCostUSD() {
    return Bt.totalCostUSD;
  }
  function getTotalAPIDuration() {
    return Bt.totalAPIDuration;
  }
  function getTotalDuration() {
    return Date.now() - Bt.startTime;
  }
  function getTotalAPIDurationWithoutRetries() {
    return Bt.totalAPIDurationWithoutRetries;
  }
  function getTotalToolDuration() {
    return Bt.totalToolDuration;
  }
  function addToToolDuration(e) {
    Bt.totalToolDuration += e;
  }
  function getStatsStore() {
    return Bt.statsStore;
  }
  function setStatsStore(e) {
    Bt.statsStore = e;
  }
  function updateLastInteractionTime(e) {
    if (e) {
      zcs();
    } else {
      pln = true;
    }
  }
  function flushInteractionTime() {
    if (pln) {
      zcs();
    }
  }
  function zcs() {
    Bt.lastInteractionTime = Date.now();
    pln = false;
    zEr.emit();
  }
  function resetInteractionBaseline() {
    Bt.lastInteractionTime = Date.now();
    pln = false;
  }
  function addToTotalLinesChanged(e, t) {
    Bt.totalLinesAdded += e;
    Bt.totalLinesRemoved += t;
  }
  function getTotalLinesAdded() {
    return Bt.totalLinesAdded;
  }
  function getTotalLinesRemoved() {
    return Bt.totalLinesRemoved;
  }
  function getTotalInputTokens() {
    return qnu(Object.values(Bt.modelUsage), "inputTokens");
  }
  function getTotalOutputTokens() {
    return qnu(Object.values(Bt.modelUsage), "outputTokens");
  }
  function getTotalCacheReadInputTokens() {
    return qnu(Object.values(Bt.modelUsage), "cacheReadInputTokens");
  }
  function getTotalCacheCreationInputTokens() {
    return qnu(Object.values(Bt.modelUsage), "cacheCreationInputTokens");
  }
  function getTotalWebSearchRequests() {
    return qnu(Object.values(Bt.modelUsage), "webSearchRequests");
  }
  function getTurnOutputTokens() {
    return getTotalOutputTokens() - JEr;
  }
  function getCurrentTurnTokenBudget() {
    return XEr;
  }
  function snapshotOutputTokensForTurn(e) {
    JEr = getTotalOutputTokens();
    XEr = e;
    fln = 0;
  }
  function getBudgetContinuationCount() {
    return fln;
  }
  function incrementBudgetContinuationCount() {
    fln++;
  }
  function setHasUnknownModelCost() {
    Bt.hasUnknownModelCost = true;
  }
  function hasUnknownModelCost() {
    return Bt.hasUnknownModelCost;
  }
  function getLastMainRequestId() {
    return Bt.lastMainRequestId;
  }
  function setLastMainRequestId(e) {
    Bt.lastMainRequestId = e;
  }
  function getLastMainThreadCacheTtlMs() {
    return Bt.lastMainThreadCacheTtlMs;
  }
  function setLastMainThreadCacheTtlMs(e) {
    Bt.lastMainThreadCacheTtlMs = e;
  }
  function getLastApiCompletionTimestamp() {
    return Bt.lastApiCompletionTimestamp;
  }
  function setLastApiCompletionTimestamp(e) {
    Bt.lastApiCompletionTimestamp = e;
  }
  function markPostCompaction() {
    Bt.pendingPostCompaction = true;
  }
  function consumePostCompaction() {
    let e = Bt.pendingPostCompaction;
    Bt.pendingPostCompaction = false;
    return e;
  }
  function getLastInteractionTime() {
    return Bt.lastInteractionTime;
  }
  function setTerminalFocusForState(e) {
    nvr = e;
    rvr.emit();
  }
  function getTerminalFocus() {
    return nvr;
  }
  function isUserActiveForNotifications() {
    let e = getTerminalFocus();
    if (e !== undefined) {
      return e;
    }
    return Date.now() - getLastInteractionTime() < 60000;
  }
  function markScrollActivity() {
    if (uln = true, AAt) {
      clearTimeout(AAt);
    }
    AAt = setTimeout(() => {
      uln = false;
      AAt = undefined;
    }, 150);
    AAt.unref?.();
  }
  function getIsScrollDraining() {
    return uln;
  }
  async function waitForScrollIdle() {
    while (uln) {
      await new Promise(e => setTimeout(e, 150));
    }
  }
  function getModelUsage() {
    return Bt.modelUsage;
  }
  function getUsageForModel(e) {
    return Bt.modelUsage[e];
  }
  function getMainLoopModelOverride() {
    return Bt.mainLoopModelOverride;
  }
  function getInitialMainLoopModel() {
    return Bt.initialMainLoopModel;
  }
  function setMainLoopModelOverride(e) {
    Bt.mainLoopModelOverride = e;
  }
  function latchRefusalFallbackModel(e) {
    let t = Bt.refusalFallbackModelLatch;
    if (t && Bt.mainLoopModelOverride === t.fallbackModel) {
      Bt.refusalFallbackModelLatch = {
        ...t,
        fallbackModel: e.fallbackModel
      };
      return;
    }
    Bt.refusalFallbackModelLatch = e;
  }
  function clearRefusalFallbackModelLatch() {
    Bt.refusalFallbackModelLatch = undefined;
  }
  function getRefusalFallbackModelLatch() {
    return Bt.refusalFallbackModelLatch;
  }
  function rewriteRefusalFallbackPreviousOverride(e) {
    if (Bt.refusalFallbackModelLatch) {
      Bt.refusalFallbackModelLatch = {
        ...Bt.refusalFallbackModelLatch,
        previousOverride: e
      };
    }
  }
  function setSdkDialogHostActive(e) {
    Bt.sdkDialogHostActive = e;
  }
  function isSdkDialogHostActive() {
    return Bt.sdkDialogHostActive;
  }
  function setSdkSupportedDialogKinds(e, t) {
    Bt.sdkSupportedDialogKinds = e;
    Bt.sdkSupportedDialogKindsSource = e === undefined ? undefined : t;
  }
  function getSdkSupportedDialogKinds() {
    return Bt.sdkSupportedDialogKinds;
  }
  function getSdkDialogCapabilitySource() {
    if (Bt.sdkSupportedDialogKinds === undefined) {
      return "none";
    }
    return Bt.sdkSupportedDialogKindsSource ?? "none";
  }
  function getReplConfigArgv() {
    return Bt.replConfigArgv;
  }
  function setReplConfigArgv(e) {
    Bt.replConfigArgv = e;
  }
  function setInitialMainLoopModel(e) {
    Bt.initialMainLoopModel = e;
  }
  function getResolvedOrgDefault() {
    return Bt.resolvedOrgDefault;
  }
  function setResolvedOrgDefault(e) {
    Bt.resolvedOrgDefault = e;
  }
  function getSdkBetas() {
    return ok()?.sdkBetas ?? Bt.sdkBetas;
  }
  function setSdkBetas(e) {
    Bt.sdkBetas = e;
  }
  function isLongContext1mCreditsBlocked() {
    return Bt.longContext1mCreditsBlocked;
  }
  function setLongContext1mCreditsBlocked(e) {
    Bt.longContext1mCreditsBlocked = e;
  }
  function isFableCreditsRequired() {
    return Bt.fableCreditsRequired;
  }
  function setFableCreditsRequired(e) {
    Bt.fableCreditsRequired = e;
  }
  function hasFableBridgeDialogTimedOut() {
    return Bt.fableBridgeDialogTimedOut;
  }
  function setFableBridgeDialogTimedOut(e = true) {
    Bt.fableBridgeDialogTimedOut = e;
  }
  function hasFableConsentDialogInteracted() {
    return Bt.fableConsentDialogInteracted;
  }
  function setFableConsentDialogInteracted(e = true) {
    Bt.fableConsentDialogInteracted = e;
  }
  function hasFableConsentSessionFallback() {
    return Bt.fableConsentSessionFallback;
  }
  function setFableConsentSessionFallback(e) {
    Bt.fableConsentSessionFallback = e;
  }
  function getSdkOAuthTokenRefreshCallback() {
    return Bt.sdkOAuthTokenRefreshCallback;
  }
  function setSdkOAuthTokenRefreshCallback(e) {
    Bt.sdkOAuthTokenRefreshCallback = e;
  }
  function getHostAuthTokenRefreshCallback() {
    return Bt.hostAuthTokenRefreshCallback;
  }
  function setHostAuthTokenRefreshCallback(e) {
    Bt.hostAuthTokenRefreshCallback = e;
  }
  function resetCostState() {
    Bt.totalCostUSD = 0;
    Bt.totalAPIDuration = 0;
    Bt.totalAPIDurationWithoutRetries = 0;
    Bt.totalToolDuration = 0;
    Bt.startTime = Date.now();
    Bt.sessionLogicalStartTime = undefined;
    Bt.totalLinesAdded = 0;
    Bt.totalLinesRemoved = 0;
    Bt.hasUnknownModelCost = false;
    Bt.modelUsage = {};
    Bt.promptId = null;
  }
  function setCostStateForRestore({
    totalCostUSD: e,
    totalAPIDuration: t,
    totalAPIDurationWithoutRetries: n,
    totalToolDuration: r,
    totalLinesAdded: o,
    totalLinesRemoved: s,
    lastDuration: i,
    startTime: a,
    modelUsage: l
  }) {
    if (Bt.totalCostUSD = e, Bt.totalAPIDuration = t, Bt.totalAPIDurationWithoutRetries = n, Bt.totalToolDuration = r, Bt.totalLinesAdded = o, Bt.totalLinesRemoved = s, l) {
      Bt.modelUsage = l;
    }
    if (i) {
      Bt.startTime = Date.now() - i;
    }
    Bt.sessionLogicalStartTime = a !== undefined ? Math.min(a, Bt.startTime) : undefined;
  }
  function resetStateForTests() {
    throw Error("resetStateForTests can only be called in tests");
  }
  function getModelStrings() {
    return Bt.modelStrings;
  }
  function setModelStrings(e) {
    Bt.modelStrings = e;
  }
  function resetModelStrings() {
    Bt.modelStrings = null;
  }
  function resetModelStringsForTestingOnly() {
    resetModelStrings();
  }
  function setMeter(e, t) {
    Bt.meter = e;
    Bt.sessionCounter = t("claude_code.session.count", {
      description: "Count of CLI sessions started"
    });
    Bt.locCounter = t("claude_code.lines_of_code.count", {
      description: "Count of lines of code modified, with the 'type' attribute indicating whether lines were added or removed and the 'model' attribute indicating which model made the change"
    });
    Bt.prCounter = t("claude_code.pull_request.count", {
      description: "Number of pull requests created"
    });
    Bt.commitCounter = t("claude_code.commit.count", {
      description: "Number of git commits created"
    });
    Bt.costCounter = t("claude_code.cost.usage", {
      description: "Cost of the Claude Code session",
      unit: "USD"
    });
    Bt.tokenCounter = t("claude_code.token.usage", {
      description: "Number of tokens used",
      unit: "tokens"
    });
    Bt.codeEditToolDecisionCounter = t("claude_code.code_edit_tool.decision", {
      description: "Count of code editing tool permission decisions (accept/reject) for Edit, Write, and NotebookEdit tools"
    });
    Bt.activeTimeCounter = t("claude_code.active_time.total", {
      description: "Total active time in seconds",
      unit: "s"
    });
  }
  function getMeter() {
    return Bt.meter;
  }
  function getSessionCounter() {
    return Bt.sessionCounter;
  }
  function getLocCounter() {
    return Bt.locCounter;
  }
  function getPrCounter() {
    return Bt.prCounter;
  }
  function getCommitCounter() {
    return Bt.commitCounter;
  }
  function getCostCounter() {
    return Bt.costCounter;
  }
  function getTokenCounter() {
    return Bt.tokenCounter;
  }
  function getCodeEditToolDecisionCounter() {
    return Bt.codeEditToolDecisionCounter;
  }
  function getActiveTimeCounter() {
    return Bt.activeTimeCounter;
  }
  function getLoggerProvider() {
    return Bt.loggerProvider;
  }
  function setLoggerProvider(e) {
    Bt.loggerProvider = e;
  }
  function getEventLogger() {
    return Bt.eventLogger;
  }
  function setEventLogger(e) {
    if (Bt.eventLogger = e, !e) {
      return;
    }
    let t = Bt.pendingOTelEvents;
    if (Bt.pendingOTelEvents = null, t) {
      for (let n of t) {
        e.emit(n);
      }
    }
  }
  function bufferPendingOTelEvent(e) {
    if (Bt.pendingOTelEvents === null || Bt.pendingOTelEvents.length >= 100) {
      return false;
    }
    Bt.pendingOTelEvents.push(e);
    return true;
  }
  function discardPendingOTelEvents() {
    Bt.pendingOTelEvents = null;
  }
  function getMeterProvider() {
    return Bt.meterProvider;
  }
  function setMeterProvider(e) {
    Bt.meterProvider = e;
  }
  function getTracerProvider() {
    return Bt.tracerProvider;
  }
  function setTracerProvider(e) {
    Bt.tracerProvider = e;
  }
  function getFoundryDeploymentCapabilities() {
    return Bt.foundryDeploymentCapabilities;
  }
  function getCachedTelemetryResource() {
    return Bt.cachedTelemetryResource;
  }
  function setCachedTelemetryResource(e) {
    Bt.cachedTelemetryResource = e;
  }
  function getCachedOtlpHttpAgentFactory(e) {
    return Bt.cachedOtlpHttpAgentFactory[e ? "proxied" : "direct"];
  }
  function setCachedOtlpHttpAgentFactory(e, t) {
    Bt.cachedOtlpHttpAgentFactory[e ? "proxied" : "direct"] = t;
  }
  function getIsNonInteractiveSession() {
    return !Bt.isInteractive;
  }
  function getIsInteractive() {
    return Bt.isInteractive;
  }
  function setIsInteractive(e) {
    Bt.isInteractive = e;
  }
  function getThinkingDisplayExplicit() {
    return Bt.thinkingDisplayExplicit;
  }
  function setThinkingDisplayExplicit(e) {
    Bt.thinkingDisplayExplicit = e;
  }
  function getPermissionPromptToolName() {
    return Bt.permissionPromptToolName;
  }
  function setPermissionPromptToolName(e) {
    Bt.permissionPromptToolName = e;
  }
  function getAttacherCaps() {
    return Bt.attacherCaps;
  }
  function setAttacherCaps(e) {
    Bt.attacherCaps = e;
    $vr.emit();
  }
  function getModelOverrideOptOutForSession() {
    return Bt.modelOverrideOptOutForSession;
  }
  function setModelOverrideOptOutForSession() {
    Bt.modelOverrideOptOutForSession = true;
  }
  function getHasStreamingInput() {
    return Bt.hasStreamingInput;
  }
  function setHasStreamingInput(e) {
    Bt.hasStreamingInput = e;
  }
  function getClientType() {
    return Bt.clientType;
  }
  function setClientType(e) {
    Bt.clientType = e;
  }
  function getSdkAgentProgressSummariesEnabled() {
    return Bt.sdkAgentProgressSummariesEnabled;
  }
  function setSdkAgentProgressSummariesEnabled(e) {
    Bt.sdkAgentProgressSummariesEnabled = e;
  }
  function getRendererModeForAnalytics() {
    return Bt.rendererMode;
  }
  function setRendererModeForAnalytics(e) {
    Bt.rendererMode = e;
  }
  function getStrictToolResultPairing() {
    return Bt.strictToolResultPairing;
  }
  function setStrictToolResultPairing(e) {
    Bt.strictToolResultPairing = e;
  }
  function getMemoryToggledOff() {
    return Bt.memoryToggledOff;
  }
  function setMemoryToggledOff(e) {
    Bt.memoryToggledOff = e;
  }
  function getTeamMemoryServerStatus() {
    return Bt.teamMemoryServerStatus;
  }
  function setTeamMemoryServerStatus(e) {
    Bt.teamMemoryServerStatus = e;
  }
  function getUserMsgOptIn() {
    return Bt.userMsgOptIn;
  }
  function setUserMsgOptIn(e) {
    Bt.userMsgOptIn = e;
  }
  function getSearchToolsOptIn() {
    return Bt.searchToolsOptIn;
  }
  function setSearchToolsOptIn(e) {
    Bt.searchToolsOptIn = e;
  }
  function getSessionSource() {
    return Bt.sessionSource;
  }
  function setSessionSource(e) {
    Bt.sessionSource = e;
  }
  function getSessionStartType() {
    return Bt.sessionStartType;
  }
  function setSessionStartType(e) {
    Bt.sessionStartType = e;
  }
  function getQuestionPreviewFormat() {
    return Bt.questionPreviewFormat;
  }
  function setQuestionPreviewFormat(e) {
    Bt.questionPreviewFormat = e;
  }
  function getAgentColorMap() {
    return Bt.agentColorMap;
  }
  function getFlagSettingsPath() {
    return Bt.flagSettingsPath;
  }
  function setFlagSettingsPath(e) {
    Bt.flagSettingsPath = e;
  }
  function getFlagSettingsExpectedContent() {
    return Bt.flagSettingsExpectedContent;
  }
  function setFlagSettingsExpectedContent(e) {
    Bt.flagSettingsExpectedContent = e;
  }
  function getFlagSettingsInline() {
    return Bt.flagSettingsInline;
  }
  function setFlagSettingsInline(e) {
    Bt.flagSettingsInline = e;
  }
  function getParentManagedSettings() {
    return Bt.parentManagedSettings;
  }
  function setParentManagedSettings(e) {
    Bt.parentManagedSettings = e;
  }
  function getSessionIngressToken() {
    let e = ok();
    return e ? e.secrets.sessionIngressToken : Bt.sessionIngressToken;
  }
  function setSessionIngressToken(e) {
    Bt.sessionIngressToken = e;
  }
  function getOauthTokenFromFd() {
    return Bt.oauthTokenFromFd;
  }
  function setOauthTokenFromFd(e) {
    Bt.oauthTokenFromFd = e;
  }
  function getOauthScopesFromFd() {
    return Bt.oauthScopesFromFd;
  }
  function setOauthScopesFromFd(e) {
    Bt.oauthScopesFromFd = e;
  }
  function getApiKeyFromFd() {
    return Bt.apiKeyFromFd;
  }
  function setApiKeyFromFd(e) {
    Bt.apiKeyFromFd = e;
  }
  function resetFdCredentialState() {
    Bt.sessionIngressToken = undefined;
    Bt.oauthTokenFromFd = undefined;
    Bt.oauthScopesFromFd = undefined;
    Bt.apiKeyFromFd = undefined;
  }
  function getGatewayAuth() {
    return Bt.gatewayAuth;
  }
  function isGatewayAuthExpired() {
    let e = Bt.gatewayAuth;
    return !!e && e.expiresAt <= Date.now();
  }
  function isGatewayAuthPinned(e) {
    return !!e && !e.unpinned;
  }
  function setGatewayAuth(e) {
    Bt.gatewayAuth = e;
  }
  function getStartupPolicySnapshot() {
    return Bt.startupPolicySnapshot;
  }
  function setStartupPolicySnapshot(e) {
    Bt.startupPolicySnapshot = e;
  }
  function getGatewayRefreshInFlight() {
    return Bt.gatewayRefreshInFlight;
  }
  function setGatewayRefreshInFlight(e) {
    Bt.gatewayRefreshInFlight = e;
  }
  function setLastAPIRequest(e) {
    Bt.lastAPIRequest = e;
  }
  function getLastAPIRequest() {
    return Bt.lastAPIRequest;
  }
  function setLastCancelledAPIMessageId(e) {
    Bt.lastCancelledAPIMessageId = e;
  }
  function getLastCancelledAPIMessageId() {
    return Bt.lastCancelledAPIMessageId;
  }
  function setLastAPIRequestMessages(e) {
    Bt.lastAPIRequestMessages = e;
  }
  function getLastAPIRequestMessages() {
    return Bt.lastAPIRequestMessages;
  }
  function setLastClassifierRequests(e) {
    Bt.lastClassifierRequests = e;
  }
  function getLastClassifierRequests() {
    return Bt.lastClassifierRequests;
  }
  function setCachedClaudeMdContent(e) {
    let t = ok();
    if (t) {
      t.cachedClaudeMdContent = e;
    } else {
      Bt.cachedClaudeMdContent = e;
    }
  }
  function getCachedClaudeMdContent() {
    let e = ok();
    return e ? e.cachedClaudeMdContent : Bt.cachedClaudeMdContent;
  }
  function addToInMemoryErrorLog(e) {
    if (Bt.inMemoryErrorLog.length >= 100) {
      Bt.inMemoryErrorLog.shift();
    }
    Bt.inMemoryErrorLog.push(e);
  }
  function getAllowedSettingSources() {
    return Bt.allowedSettingSources;
  }
  function setAllowedSettingSources(e) {
    Bt.allowedSettingSources = e;
  }
  function preferThirdPartyAuthentication() {
    return getIsNonInteractiveSession() && Bt.clientType !== "claude-vscode";
  }
  function setInlinePlugins(e) {
    Bt.inlinePlugins = e;
  }
  function getInlinePlugins() {
    return Bt.inlinePlugins;
  }
  function setInlinePluginsNoMcp(e) {
    Bt.inlinePluginsNoMcp = e;
  }
  function getInlinePluginsNoMcp() {
    return Bt.inlinePluginsNoMcp;
  }
  function setInlinePluginUrls(e) {
    Bt.inlinePluginUrls = e;
  }
  function getInlinePluginUrls() {
    return Bt.inlinePluginUrls;
  }
  function setSyncedPluginDirs(e) {
    Bt.syncedPluginDirs = e;
  }
  function getSyncedPluginDirs() {
    return Bt.syncedPluginDirs;
  }
  function setChromeFlagOverride(e) {
    Bt.chromeFlagOverride = e;
  }
  function getChromeFlagOverride() {
    return Bt.chromeFlagOverride;
  }
  function setOnboardingShownThisSession(e) {
    Bt.onboardingShownThisSession = e;
  }
  function getOnboardingShownThisSession() {
    return Bt.onboardingShownThisSession;
  }
  function setUseCoworkPlugins(e) {
    Bt.useCoworkPlugins = e;
    o_();
  }
  function getUseCoworkPlugins() {
    return Bt.useCoworkPlugins;
  }
  function setDisableSlashCommands(e) {
    Bt.disableSlashCommands = e;
  }
  function getDisableSlashCommands() {
    return Bt.disableSlashCommands;
  }
  function setSessionBypassPermissionsMode(e) {
    Bt.sessionBypassPermissionsMode = e;
  }
  function getSessionBypassPermissionsMode() {
    return Bt.sessionBypassPermissionsMode;
  }
  function setScheduledTasksEnabled(e) {
    Bt.scheduledTasksEnabled = e;
  }
  function getScheduledTasksEnabled() {
    return Bt.scheduledTasksEnabled;
  }
  function getSessionCronTasks() {
    return ok()?.sessionCronTasks ?? Bt.sessionCronTasks;
  }
  function getSessionPrResolved() {
    return Bt.sessionPrResolved;
  }
  function setSessionPrResolved(e) {
    Bt.sessionPrResolved = e;
  }
  function addSessionCronTask(e) {
    Bt.sessionCronTasks.push(e);
  }
  function getLoopChainStartedAt(e) {
    return Bt.loopChainStartedAt[e];
  }
  function setLoopChainStartedAt(e, t) {
    Bt.loopChainStartedAt[e] = t;
  }
  function deleteLoopChainStartedAt(e) {
    delete Bt.loopChainStartedAt[e];
  }
  function getLoopTickInFlightPrompt() {
    return Bt.loopTickInFlightPrompt;
  }
  function setLoopTickInFlightPrompt(e) {
    Bt.loopTickInFlightPrompt = e;
  }
  function getLoopConsecutiveKeepalives() {
    return Bt.loopConsecutiveKeepalives;
  }
  function setLoopConsecutiveKeepalives(e) {
    Bt.loopConsecutiveKeepalives = e;
  }
  function removeSessionCronTasks(e) {
    if (e.length === 0) {
      return 0;
    }
    let t = new Set(e);
    let n = Bt.sessionCronTasks.filter(o => !t.vZc(o.id));
    let r = Bt.sessionCronTasks.length - n.length;
    if (r === 0) {
      return 0;
    }
    Bt.sessionCronTasks = n;
    return r;
  }
  function setSessionTrustAccepted(e) {
    Bt.sessionTrustAccepted = e;
  }
  function getSessionTrustAccepted() {
    return Bt.sessionTrustAccepted;
  }
  function setSessionPersistenceDisabled(e) {
    Bt.sessionPersistenceDisabled = e;
  }
  function isSessionPersistenceDisabled() {
    return Bt.sessionPersistenceDisabled;
  }
  function hasExitedPlanModeInSession() {
    return Bt.hasExitedPlanMode;
  }
  function setHasExitedPlanMode(e) {
    Bt.hasExitedPlanMode = e;
  }
  function needsPlanModeExitAttachment() {
    return Bt.needsPlanModeExitAttachment;
  }
  function setNeedsPlanModeExitAttachment(e) {
    Bt.needsPlanModeExitAttachment = e;
  }
  function handlePlanModeTransition(e, t) {
    if (t === "plan" && e !== "plan") {
      Bt.needsPlanModeExitAttachment = false;
    }
    if (e === "plan" && t !== "plan") {
      Bt.needsPlanModeExitAttachment = true;
    }
  }
  function needsAutoModeExitAttachment() {
    return Bt.needsAutoModeExitAttachment;
  }
  function setNeedsAutoModeExitAttachment(e) {
    Bt.needsAutoModeExitAttachment = e;
  }
  function handleAutoModeTransition(e, t) {
    if (e === "auto" && t === "plan" || e === "plan" && t === "auto") {
      return;
    }
    let n = e === "auto";
    let r = t === "auto";
    if (r && !n) {
      Bt.needsAutoModeExitAttachment = false;
    }
    if (n && !r) {
      Bt.needsAutoModeExitAttachment = true;
    }
  }
  function hasShownLspRecommendationThisSession() {
    return Bt.lspRecommendationShownThisSession;
  }
  function setLspRecommendationShownThisSession(e) {
    Bt.lspRecommendationShownThisSession = e;
  }
  function setInitJsonSchema(e) {
    Bt.initJsonSchema = e;
  }
  function getInitJsonSchema() {
    return Bt.initJsonSchema;
  }
  function setMcpClientsAccessor(e) {
    Mwr = e;
  }
  function getMcpClientsFromAccessor() {
    return Mwr?.();
  }
  function Fln() {
    return ok() ?? Bt;
  }
  function registerHookCallbacks(e) {
    let t = Fln();
    if (!t.registeredHooks) {
      t.registeredHooks = {};
    }
    for (let [n, r] of Object.entries(e)) {
      let o = n;
      if (!t.registeredHooks[o]) {
        t.registeredHooks[o] = [];
      }
      t.registeredHooks[o].push(...r);
    }
  }
  function getRegisteredHooks() {
    return Fln().registeredHooks;
  }
  function clearRegisteredHooks() {
    Fln().registeredHooks = null;
  }
  function clearRegisteredPluginHooks() {
    let e = Fln();
    if (!e.registeredHooks) {
      return;
    }
    let t = {};
    for (let [n, r] of Object.entries(e.registeredHooks)) {
      let o = r.filter(s => !("pluginRoot" in s));
      if (o.length > 0) {
        t[n] = o;
      }
    }
    e.registeredHooks = Object.keys(t).length > 0 ? t : null;
  }
  function getPlanSlugCache() {
    return Bt.planSlugCache;
  }
  function getSessionCreatedTeams() {
    return ok()?.sessionCreatedTeams ?? Bt.sessionCreatedTeams;
  }
  function getSurfacedHookSpawnFailures() {
    return ok()?.surfacedHookSpawnFailures ?? Bt.surfacedHookSpawnFailures;
  }
  function getBareMcpServerMatchersWarned() {
    return ok()?.bareMcpServerMatchersWarned ?? Bt.bareMcpServerMatchersWarned;
  }
  function getInheritedTeamName() {
    return Bt.inheritedTeamName;
  }
  function setInheritedTeamName(e) {
    Bt.inheritedTeamName = e;
  }
  function setTeleportedSessionInfo(e) {
    Bt.teleportedSessionInfo = {
      isTeleported: true,
      hasLoggedFirstMessage: false,
      sessionId: e.sessionId
    };
  }
  function getTeleportedSessionInfo() {
    return Bt.teleportedSessionInfo;
  }
  function markFirstTeleportMessageLogged() {
    if (Bt.teleportedSessionInfo) {
      Bt.teleportedSessionInfo.hasLoggedFirstMessage = true;
    }
  }
  function addInvokedSkill(e, t, n, r = null) {
    let o = `${r ?? ""}:${e}`;
    Bt.invokedSkills.set(o, {
      skillName: e,
      skillPath: t,
      content: n,
      invokedAt: Date.now(),
      agentId: r
    });
  }
  function getInvokedSkills() {
    return Bt.invokedSkills;
  }
  function getInvokedSkillsForAgent(e) {
    let t = e ?? null;
    let n = new Map();
    for (let [r, o] of Bt.invokedSkills) {
      if (o.agentId === t) {
        n.set(r, o);
      }
    }
    return n;
  }
  function clearInvokedSkills(e) {
    if (!e || e.size === 0) {
      Bt.invokedSkills.clear();
      return;
    }
    for (let [t, n] of Bt.invokedSkills) {
      if (n.agentId === null || !e.vZc(n.agentId)) {
        Bt.invokedSkills.delete(t);
      }
    }
  }
  function clearInvokedSkillsForAgent(e) {
    for (let [t, n] of Bt.invokedSkills) {
      if (n.agentId === e) {
        Bt.invokedSkills.delete(t);
      }
    }
  }
  function addSlowOperation(e, t) {
    return;
  }
  function getSlowOperations() {
    if (Bt.slowOperations.length === 0) {
      return jcs;
    }
    let e = Date.now();
    if (Bt.slowOperations.some(t => e - t.timestamp >= 1e4)) {
      if (Bt.slowOperations = Bt.slowOperations.filter(t => e - t.timestamp < 1e4), Bt.slowOperations.length === 0) {
        return jcs;
      }
    }
    return Bt.slowOperations;
  }
  function getMainThreadAgentType() {
    let e = ok();
    return e ? e.mainThreadAgentType : Bt.mainThreadAgentType;
  }
  function setMainThreadAgentType(e) {
    let t = ok();
    if (t) {
      t.mainThreadAgentType = e;
    } else {
      Bt.mainThreadAgentType = e;
    }
  }
  function getMainThreadAgentHooks() {
    let e = ok();
    return e ? e.mainThreadAgentHooks : Bt.mainThreadAgentHooks;
  }
  function setMainThreadAgentHooks(e) {
    let t = ok();
    if (t) {
      t.mainThreadAgentHooks = e;
    } else {
      Bt.mainThreadAgentHooks = e;
    }
  }
  function getSessionSkillAllowlist() {
    return Bt.sessionSkillAllowlist;
  }
  function setSessionSkillAllowlist(e) {
    Bt.sessionSkillAllowlist = e;
  }
  function getCaps() {
    return Bt.caps;
  }
  function setCaps(e) {
    Bt.caps = e;
  }
  function getIsRemoteMode() {
    return Bt.caps.workspace === "remote";
  }
  function setIsRemoteMode(e) {
    Bt.caps = {
      ...Bt.caps,
      workspace: e ? "remote" : "local"
    };
  }
  function getSystemPromptSectionCache() {
    return Bt.systemPromptSectionCache;
  }
  function setSystemPromptSectionCacheEntry(e, t) {
    Bt.systemPromptSectionCache.set(e, t);
  }
  function clearSystemPromptSectionState() {
    Bt.systemPromptSectionCache.clear();
  }
  function getLastEmittedDate() {
    return Bt.lastEmittedDate;
  }
  function setLastEmittedDate(e) {
    Bt.lastEmittedDate = e;
  }
  function getAdditionalDirectoriesForClaudeMd() {
    return Bt.additionalDirectoriesForClaudeMd;
  }
  function setAdditionalDirectoriesForClaudeMd(e) {
    Bt.additionalDirectoriesForClaudeMd = e;
  }
  function getAllowedChannels() {
    return Bt.allowedChannels;
  }
  function setAllowedChannels(e) {
    Bt.allowedChannels = e;
  }
  function getHasDevChannels() {
    return Bt.hasDevChannels;
  }
  function setHasDevChannels(e) {
    Bt.hasDevChannels = e;
  }
  function getPromptCache1hAllowlist() {
    return Bt.promptCache1hAllowlist;
  }
  function setPromptCache1hAllowlist(e) {
    Bt.promptCache1hAllowlist = e;
  }
  function getThinkingTypeOverride(e) {
    return Bt.thinkingTypeOverrides.get(e);
  }
  function setThinkingTypeOverride(e, t) {
    Bt.thinkingTypeOverrides.set(e, t);
  }
  function getInferenceProfileBackingModelCached(e) {
    return Bt.inferenceProfileBackingModels.get(e);
  }
  function setInferenceProfileBackingModel(e, t) {
    Bt.inferenceProfileBackingModels.set(e, t);
  }
  function getStickyBetas() {
    return ok()?.stickyBetas ?? Bt.stickyBetas;
  }
  function clearBetaHeaderLatches() {
    let e = ok();
    if (e) {
      e.stickyBetas = Cae();
    } else {
      Bt.stickyBetas = Cae();
    }
  }
  function getPromptId() {
    return Bt.promptId;
  }
  function setPromptId(e) {
    Bt.promptId = e;
  }
  function incrementPromptIndex() {
    Bt.promptIndex++;
    return Bt.promptIndex;
  }
  function getPromptIndex() {
    return Bt.promptIndex;
  }
  function isReplBridgeActive() {
    return Bt.replBridgeActive ?? false;
  }
  function setReplBridgeActive(e) {
    if (Bt.replBridgeActive === e) {
      return;
    }
    Bt.replBridgeActive = e;
  }
  function getMainLoopBusy() {
    return Bt.mainLoopBusy ?? false;
  }
  function setMainLoopBusy(e) {
    if (Bt.mainLoopBusy === e) {
      return;
    }
    Bt.mainLoopBusy = e;
  }
  var DEr;
  var qcs;
  var Knu;
  var Bt;
  var ok = () => {
    return;
  };
  var cln;
  var onSessionSwitch;
  var LEr;
  var onOriginalCwdChange;
  var pln = false;
  var zEr;
  var onInteraction;
  var JEr = 0;
  var XEr = null;
  var fln = 0;
  var nvr = undefined;
  var rvr;
  var onTerminalFocusChange;
  var uln = false;
  var AAt;
  var $vr;
  var onAttacherCapsChange;
  var Mwr;
  var jcs;
  var at = __lazy(() => {
    CAt();
    sln();
    DA();
    ph();
    D_();
    DEr = require("fs");
    qcs = require("process");
    Knu = {
      renderTarget: "ink",
      workspace: "local",
      canDrive: true,
      transcriptSource: "local-jsonl",
      remote: null
    };
    Bt = Wcs();
    cln = Si();
    onSessionSwitch = cln.subscribe;
    LEr = Si();
    onOriginalCwdChange = LEr.subscribe;
    zEr = Si();
    onInteraction = zEr.subscribe;
    rvr = Si();
    onTerminalFocusChange = rvr.subscribe;
    $vr = Si();
    onAttacherCapsChange = $vr.subscribe;
    jcs = [];
  });
  var S0t = {};