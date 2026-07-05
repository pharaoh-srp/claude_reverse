package io.sentry;

import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import java.io.File;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes.dex */
public class w6 {
    static final t5 DEFAULT_DIAGNOSTIC_LEVEL = t5.DEBUG;
    private static final String DEFAULT_ENVIRONMENT = "production";
    public static final String DEFAULT_PROPAGATION_TARGETS = ".*";
    public static final long MAX_EVENT_SIZE_BYTES = 1048576;
    private boolean attachServerName;
    private boolean attachStacktrace;
    private boolean attachThreads;
    private io.sentry.backpressure.b backpressureMonitor;
    private h6 beforeBreadcrumb;
    private i6 beforeEnvelopeCallback;
    private j6 beforeSend;
    private j6 beforeSendFeedback;
    private k6 beforeSendReplay;
    private l6 beforeSendTransaction;
    private String cacheDirPath;
    private boolean captureOpenTelemetryEvents;
    io.sentry.clientreport.g clientReportRecorder;
    private n compositePerformanceCollector;
    private u0 connectionStatusProvider;
    private int connectionTimeoutMillis;
    private final List<String> contextTags;
    private v0 continuousProfiler;
    private m6 cron;
    private final io.sentry.util.h dateProvider;
    private long deadlineTimeout;
    private boolean debug;
    private io.sentry.internal.debugmeta.a debugMetaLoader;
    private l4 defaultScopeType;
    private final List<String> defaultTracePropagationTargets;
    private t5 diagnosticLevel;
    private String dist;
    private String distinctId;
    private n6 distribution;
    private w0 distributionController;
    private String dsn;
    private String dsnHash;
    private boolean enableAppStartProfiling;
    private boolean enableAutoSessionTracking;
    private boolean enableBackpressureHandling;
    private boolean enableCacheTracing;
    private boolean enableDatabaseTransactionTracing;
    private boolean enableDeduplication;
    private boolean enableEventSizeLimiting;
    private boolean enableExternalConfiguration;
    private boolean enablePrettySerializationOutput;
    private boolean enableQueueTracing;
    private boolean enableScopePersistence;
    private boolean enableScreenTracking;
    private boolean enableShutdownHook;
    private boolean enableSpotlight;
    private boolean enableTimeToFullDisplayTracing;
    private boolean enableUncaughtExceptionHandler;
    private boolean enableUserInteractionBreadcrumbs;
    private boolean enableUserInteractionTracing;
    private boolean enabled;
    private io.sentry.cache.d envelopeDiskCache;
    private final io.sentry.util.h envelopeReader;
    private String environment;
    private l1 executorService;
    private final j0 experimental;
    private a1 fatalLogger;
    private o5 feedbackOptions;
    private boolean forceInit;
    private m0 fullyDisplayedReporter;
    private final List<io.sentry.internal.gestures.a> gestureTargetLocators;
    private Boolean globalHubMode;
    private Long idleTimeout;
    private List<l0> ignoredCheckIns;
    private List<l0> ignoredSpanOrigins;
    private List<l0> ignoredTransactions;
    private final List<String> inAppExcludes;
    private final List<String> inAppIncludes;
    private v1 initPriority;
    private w1 instrumenter;
    private volatile q7 internalTracesSampler;
    protected final io.sentry.util.a lock;
    private a1 logger;
    private o6 logs;
    private long maxAttachmentSize;
    private int maxBreadcrumbs;
    private int maxCacheItems;
    private int maxDepth;
    private int maxFeatureFlags;
    private int maxQueueSize;
    private u6 maxRequestBodySize;
    private int maxSpans;
    private long maxTraceFileSize;
    private p6 metrics;
    private io.sentry.internal.modules.a modulesLoader;
    private final List<g1> observers;
    private q6 onDiscard;
    private r6 onOversizedEvent;
    private f6 openTelemetryMode;
    private final List<b1> optionsObservers;
    private String orgId;
    private final List<c1> performanceCollectors;
    private boolean printUncaughtStackTrace;
    private x3 profileLifecycle;
    private Double profileSessionSampleRate;
    private e1 profilerConverter;
    private Double profilesSampleRate;
    private s6 profilesSampler;
    private String profilingTracesDirPath;
    private int profilingTracesHz;
    private String proguardUuid;
    private boolean propagateTraceparent;
    private t6 proxy;
    private int readTimeoutMillis;
    private String release;
    private b4 replayController;
    private Double sampleRate;
    private j1 scopesStorageFactory;
    private io.sentry.protocol.u sdkVersion;
    private boolean sendClientReports;
    private boolean sendDefaultPii;
    private boolean sendModules;
    private String sentryClientName;
    private final io.sentry.util.h serializer;
    private String serverName;
    private a7 sessionReplay;
    private long sessionTrackingIntervalMillis;
    private o1 socketTagger;
    private q1 spanFactory;
    private String spotlightConnectionUrl;
    private final AtomicBoolean spotlightIntegrationLoaded;
    private SSLSocketFactory sslSocketFactory;
    private boolean startProfilerOnAppStart;
    private boolean strictTraceContinuation;
    private final Map<String, String> tags;
    private io.sentry.util.thread.a threadChecker;
    private boolean traceOptionsRequests;
    private List<String> tracePropagationTargets;
    private boolean traceSampling;
    private Double tracesSampleRate;
    private v6 tracesSampler;
    private s1 transactionProfiler;
    private t1 transportFactory;
    private io.sentry.transport.g transportGate;
    private u1 versionDetector;
    private final List<ComposeViewHierarchyExporter> viewHierarchyExporters;
    private final List<i0> eventProcessors = new CopyOnWriteArrayList();
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType = new CopyOnWriteArraySet();
    private List<l0> ignoredErrors = null;
    private final List<x1> integrations = new CopyOnWriteArrayList();
    private final Set<String> bundleIds = new CopyOnWriteArraySet();
    private final io.sentry.util.h parsedDsn = new io.sentry.util.h(new g6(this, 0));
    private long shutdownTimeoutMillis = 2000;
    private long flushTimeoutMillis = 15000;
    private long sessionFlushTimeoutMillis = 15000;

    /* JADX WARN: Removed duplicated region for block: B:19:0x029c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w6(boolean r11) {
        /*
            Method dump skipped, instruction units count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.w6.<init>(boolean):void");
    }

    public static /* synthetic */ f0 a(w6 w6Var) {
        return new f0(w6Var.dsn);
    }

    public static /* synthetic */ g0 b(w6 w6Var) {
        return new g0((n1) w6Var.serializer.a());
    }

    public static w6 empty() {
        return new w6(true);
    }

    public void activate() {
        if (this.executorService instanceof h3) {
            n5 n5Var = new n5(this);
            this.executorService = n5Var;
            n5Var.b();
        }
        if (this.spotlightIntegrationLoaded.compareAndSet(false, true)) {
            try {
                this.integrations.add((x1) Class.forName("io.sentry.spotlight.SpotlightIntegration").getConstructor(null).newInstance(null));
            } catch (Throwable unused) {
            }
        }
    }

    public void addBundleId(String str) {
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            this.bundleIds.add(strTrim);
        }
    }

    public void addContextTag(String str) {
        this.contextTags.add(str);
    }

    public void addEventProcessor(i0 i0Var) {
        this.eventProcessors.add(i0Var);
    }

    public void addIgnoredCheckIn(String str) {
        if (this.ignoredCheckIns == null) {
            this.ignoredCheckIns = new ArrayList();
        }
        this.ignoredCheckIns.add(new l0(str));
    }

    public void addIgnoredError(String str) {
        if (this.ignoredErrors == null) {
            this.ignoredErrors = new ArrayList();
        }
        this.ignoredErrors.add(new l0(str));
    }

    public void addIgnoredExceptionForType(Class<? extends Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    public void addIgnoredSpanOrigin(String str) {
        if (this.ignoredSpanOrigins == null) {
            this.ignoredSpanOrigins = new ArrayList();
        }
        this.ignoredSpanOrigins.add(new l0(str));
    }

    public void addIgnoredTransaction(String str) {
        if (this.ignoredTransactions == null) {
            this.ignoredTransactions = new ArrayList();
        }
        this.ignoredTransactions.add(new l0(str));
    }

    public void addInAppExclude(String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(String str) {
        this.inAppIncludes.add(str);
    }

    public void addIntegration(x1 x1Var) {
        this.integrations.add(x1Var);
    }

    public void addOptionsObserver(b1 b1Var) {
        this.optionsObservers.add(b1Var);
    }

    public void addPerformanceCollector(c1 c1Var) {
        this.performanceCollectors.add(c1Var);
    }

    public void addScopeObserver(g1 g1Var) {
        this.observers.add(g1Var);
    }

    public boolean containsIgnoredExceptionForType(Throwable th) {
        return this.ignoredExceptionsForType.contains(th.getClass());
    }

    public io.sentry.cache.g findPersistingScopeObserver() {
        for (g1 g1Var : this.observers) {
            if (g1Var instanceof io.sentry.cache.g) {
                return (io.sentry.cache.g) g1Var;
            }
        }
        return null;
    }

    public io.sentry.backpressure.b getBackpressureMonitor() {
        return this.backpressureMonitor;
    }

    public h6 getBeforeBreadcrumb() {
        return this.beforeBreadcrumb;
    }

    public i6 getBeforeEnvelopeCallback() {
        return null;
    }

    public j6 getBeforeSend() {
        return this.beforeSend;
    }

    public j6 getBeforeSendFeedback() {
        return this.beforeSendFeedback;
    }

    public k6 getBeforeSendReplay() {
        return null;
    }

    public l6 getBeforeSendTransaction() {
        return this.beforeSendTransaction;
    }

    public Set<String> getBundleIds() {
        return this.bundleIds;
    }

    public String getCacheDirPath() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.dsnHash != null ? new File(this.cacheDirPath, this.dsnHash).getAbsolutePath() : this.cacheDirPath;
    }

    public String getCacheDirPathWithoutDsn() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.cacheDirPath;
    }

    public io.sentry.clientreport.g getClientReportRecorder() {
        return this.clientReportRecorder;
    }

    public n getCompositePerformanceCollector() {
        return this.compositePerformanceCollector;
    }

    public u0 getConnectionStatusProvider() {
        return this.connectionStatusProvider;
    }

    public int getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    public List<String> getContextTags() {
        return this.contextTags;
    }

    public v0 getContinuousProfiler() {
        return this.continuousProfiler;
    }

    public m6 getCron() {
        return this.cron;
    }

    public b5 getDateProvider() {
        return (b5) this.dateProvider.a();
    }

    public long getDeadlineTimeout() {
        return this.deadlineTimeout;
    }

    public io.sentry.internal.debugmeta.a getDebugMetaLoader() {
        return this.debugMetaLoader;
    }

    public l4 getDefaultScopeType() {
        return this.defaultScopeType;
    }

    public t5 getDiagnosticLevel() {
        return this.diagnosticLevel;
    }

    public String getDist() {
        return this.dist;
    }

    public String getDistinctId() {
        return this.distinctId;
    }

    public n6 getDistribution() {
        return this.distribution;
    }

    public w0 getDistributionController() {
        return this.distributionController;
    }

    public String getDsn() {
        return this.dsn;
    }

    public String getEffectiveOrgId() {
        String str = this.orgId;
        if (str != null) {
            String strTrim = str.trim();
            if (!strTrim.isEmpty()) {
                return strTrim;
            }
        }
        try {
            return retrieveParsedDsn().d;
        } catch (Throwable unused) {
            return null;
        }
    }

    public io.sentry.cache.d getEnvelopeDiskCache() {
        return this.envelopeDiskCache;
    }

    public x0 getEnvelopeReader() {
        return (x0) this.envelopeReader.a();
    }

    public String getEnvironment() {
        String str = this.environment;
        return str != null ? str : DEFAULT_ENVIRONMENT;
    }

    public List<i0> getEventProcessors() {
        return this.eventProcessors;
    }

    public l1 getExecutorService() {
        return this.executorService;
    }

    public j0 getExperimental() {
        return this.experimental;
    }

    public a1 getFatalLogger() {
        return this.fatalLogger;
    }

    public o5 getFeedbackOptions() {
        return this.feedbackOptions;
    }

    public long getFlushTimeoutMillis() {
        return this.flushTimeoutMillis;
    }

    public m0 getFullyDisplayedReporter() {
        return this.fullyDisplayedReporter;
    }

    public List<io.sentry.internal.gestures.a> getGestureTargetLocators() {
        return this.gestureTargetLocators;
    }

    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    public List<l0> getIgnoredCheckIns() {
        return this.ignoredCheckIns;
    }

    public List<l0> getIgnoredErrors() {
        return this.ignoredErrors;
    }

    public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    public List<l0> getIgnoredSpanOrigins() {
        return this.ignoredSpanOrigins;
    }

    public List<l0> getIgnoredTransactions() {
        return this.ignoredTransactions;
    }

    public List<String> getInAppExcludes() {
        return this.inAppExcludes;
    }

    public List<String> getInAppIncludes() {
        return this.inAppIncludes;
    }

    public v1 getInitPriority() {
        return this.initPriority;
    }

    public w1 getInstrumenter() {
        return this.instrumenter;
    }

    public List<x1> getIntegrations() {
        return this.integrations;
    }

    public q7 getInternalTracesSampler() {
        if (this.internalTracesSampler == null) {
            v vVarA = this.lock.a();
            try {
                if (this.internalTracesSampler == null) {
                    this.internalTracesSampler = new q7(this);
                }
                vVarA.close();
            } catch (Throwable th) {
                try {
                    vVarA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return this.internalTracesSampler;
    }

    public a1 getLogger() {
        return this.logger;
    }

    public o6 getLogs() {
        return this.logs;
    }

    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public int getMaxCacheItems() {
        return this.maxCacheItems;
    }

    public int getMaxDepth() {
        return this.maxDepth;
    }

    public int getMaxFeatureFlags() {
        return this.maxFeatureFlags;
    }

    public int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    public u6 getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    public int getMaxSpans() {
        return this.maxSpans;
    }

    public long getMaxTraceFileSize() {
        return this.maxTraceFileSize;
    }

    public p6 getMetrics() {
        return this.metrics;
    }

    public io.sentry.internal.modules.a getModulesLoader() {
        return this.modulesLoader;
    }

    public q6 getOnDiscard() {
        return null;
    }

    public r6 getOnOversizedEvent() {
        return null;
    }

    public f6 getOpenTelemetryMode() {
        return this.openTelemetryMode;
    }

    public List<b1> getOptionsObservers() {
        return this.optionsObservers;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public String getOutboxPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "outbox").getAbsolutePath();
    }

    public List<c1> getPerformanceCollectors() {
        return this.performanceCollectors;
    }

    public x3 getProfileLifecycle() {
        return this.profileLifecycle;
    }

    public Double getProfileSessionSampleRate() {
        return this.profileSessionSampleRate;
    }

    public e1 getProfilerConverter() {
        return this.profilerConverter;
    }

    public Double getProfilesSampleRate() {
        return this.profilesSampleRate;
    }

    public s6 getProfilesSampler() {
        return null;
    }

    public String getProfilingTracesDirPath() {
        String str = this.profilingTracesDirPath;
        if (str != null && !str.isEmpty()) {
            return this.dsnHash != null ? new File(this.profilingTracesDirPath, this.dsnHash).getAbsolutePath() : this.profilingTracesDirPath;
        }
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "profiling_traces").getAbsolutePath();
    }

    public int getProfilingTracesHz() {
        return this.profilingTracesHz;
    }

    public String getProguardUuid() {
        return this.proguardUuid;
    }

    public t6 getProxy() {
        return this.proxy;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public String getRelease() {
        return this.release;
    }

    public b4 getReplayController() {
        return this.replayController;
    }

    public Double getSampleRate() {
        return this.sampleRate;
    }

    public List<g1> getScopeObservers() {
        return this.observers;
    }

    public j1 getScopesStorageFactory() {
        return null;
    }

    public io.sentry.protocol.u getSdkVersion() {
        return this.sdkVersion;
    }

    public String getSentryClientName() {
        return this.sentryClientName;
    }

    public n1 getSerializer() {
        return (n1) this.serializer.a();
    }

    public String getServerName() {
        return this.serverName;
    }

    public long getSessionFlushTimeoutMillis() {
        return this.sessionFlushTimeoutMillis;
    }

    public a7 getSessionReplay() {
        return this.sessionReplay;
    }

    public long getSessionTrackingIntervalMillis() {
        return this.sessionTrackingIntervalMillis;
    }

    public long getShutdownTimeoutMillis() {
        return this.shutdownTimeoutMillis;
    }

    public o1 getSocketTagger() {
        return this.socketTagger;
    }

    public q1 getSpanFactory() {
        return this.spanFactory;
    }

    public String getSpotlightConnectionUrl() {
        return this.spotlightConnectionUrl;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public io.sentry.util.thread.a getThreadChecker() {
        return this.threadChecker;
    }

    public List<String> getTracePropagationTargets() {
        List<String> list = this.tracePropagationTargets;
        return list == null ? this.defaultTracePropagationTargets : list;
    }

    public Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    public v6 getTracesSampler() {
        return this.tracesSampler;
    }

    public s1 getTransactionProfiler() {
        return this.transactionProfiler;
    }

    public t1 getTransportFactory() {
        return this.transportFactory;
    }

    public io.sentry.transport.g getTransportGate() {
        return this.transportGate;
    }

    public u1 getVersionDetector() {
        return this.versionDetector;
    }

    public final List<ComposeViewHierarchyExporter> getViewHierarchyExporters() {
        return this.viewHierarchyExporters;
    }

    public boolean isAttachServerName() {
        return this.attachServerName;
    }

    public boolean isAttachStacktrace() {
        return this.attachStacktrace;
    }

    public boolean isAttachThreads() {
        return this.attachThreads;
    }

    public boolean isCaptureOpenTelemetryEvents() {
        return this.captureOpenTelemetryEvents;
    }

    public boolean isContinuousProfilingEnabled() {
        Double d;
        return this.profilesSampleRate == null && (d = this.profileSessionSampleRate) != null && d.doubleValue() > 0.0d;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public boolean isEnableAppStartProfiling() {
        return (isProfilingEnabled() || isContinuousProfilingEnabled()) && this.enableAppStartProfiling;
    }

    public boolean isEnableAutoSessionTracking() {
        return this.enableAutoSessionTracking;
    }

    public boolean isEnableBackpressureHandling() {
        return this.enableBackpressureHandling;
    }

    public boolean isEnableCacheTracing() {
        return this.enableCacheTracing;
    }

    public boolean isEnableDatabaseTransactionTracing() {
        return this.enableDatabaseTransactionTracing;
    }

    public boolean isEnableDeduplication() {
        return this.enableDeduplication;
    }

    public boolean isEnableEventSizeLimiting() {
        return this.enableEventSizeLimiting;
    }

    public boolean isEnableExternalConfiguration() {
        return this.enableExternalConfiguration;
    }

    public boolean isEnablePrettySerializationOutput() {
        return this.enablePrettySerializationOutput;
    }

    public boolean isEnableQueueTracing() {
        return this.enableQueueTracing;
    }

    public boolean isEnableScopePersistence() {
        return this.enableScopePersistence;
    }

    public boolean isEnableScreenTracking() {
        return this.enableScreenTracking;
    }

    public boolean isEnableShutdownHook() {
        return this.enableShutdownHook;
    }

    public boolean isEnableSpotlight() {
        return this.enableSpotlight;
    }

    public boolean isEnableTimeToFullDisplayTracing() {
        return this.enableTimeToFullDisplayTracing;
    }

    public boolean isEnableUncaughtExceptionHandler() {
        return this.enableUncaughtExceptionHandler;
    }

    public boolean isEnableUserInteractionBreadcrumbs() {
        return this.enableUserInteractionBreadcrumbs;
    }

    public boolean isEnableUserInteractionTracing() {
        return this.enableUserInteractionTracing;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isForceInit() {
        return this.forceInit;
    }

    public Boolean isGlobalHubMode() {
        return this.globalHubMode;
    }

    public boolean isPrintUncaughtStackTrace() {
        return this.printUncaughtStackTrace;
    }

    public boolean isProfilingEnabled() {
        Double d = this.profilesSampleRate;
        return d != null && d.doubleValue() > 0.0d;
    }

    public boolean isPropagateTraceparent() {
        return this.propagateTraceparent;
    }

    public boolean isSendClientReports() {
        return this.sendClientReports;
    }

    public boolean isSendDefaultPii() {
        return this.sendDefaultPii;
    }

    public boolean isSendModules() {
        return this.sendModules;
    }

    public boolean isStartProfilerOnAppStart() {
        return this.startProfilerOnAppStart;
    }

    public boolean isStrictTraceContinuation() {
        return this.strictTraceContinuation;
    }

    public boolean isTraceOptionsRequests() {
        return this.traceOptionsRequests;
    }

    public boolean isTraceSampling() {
        return this.traceSampling;
    }

    public boolean isTracingEnabled() {
        return (getTracesSampleRate() == null && getTracesSampler() == null) ? false : true;
    }

    public void loadLazyFields() {
        getSerializer();
        retrieveParsedDsn();
        getEnvelopeReader();
        getDateProvider();
    }

    public void merge(k0 k0Var) {
        if (k0Var.g() != null) {
            setDsn(k0Var.g());
        }
        if (k0Var.j() != null) {
            setEnvironment(k0Var.j());
        }
        if (k0Var.A() != null) {
            setRelease(k0Var.A());
        }
        if (k0Var.f() != null) {
            setDist(k0Var.f());
        }
        if (k0Var.D() != null) {
            setServerName(k0Var.D());
        }
        if (k0Var.z() != null) {
            setProxy(k0Var.z());
        }
        if (k0Var.i() != null) {
            setEnableUncaughtExceptionHandler(k0Var.i().booleanValue());
        }
        if (k0Var.t() != null) {
            setPrintUncaughtStackTrace(k0Var.t().booleanValue());
        }
        if (k0Var.B() != null) {
            setSampleRate(k0Var.B());
        }
        if (k0Var.J() != null) {
            setTracesSampleRate(k0Var.J());
        }
        if (k0Var.w() != null) {
            setProfilesSampleRate(k0Var.w());
        }
        if (k0Var.e() != null) {
            setDebug(k0Var.e().booleanValue());
        }
        if (k0Var.h() != null) {
            setEnableDeduplication(k0Var.h().booleanValue());
        }
        if (k0Var.C() != null) {
            setSendClientReports(k0Var.C().booleanValue());
        }
        if (k0Var.U() != null) {
            setForceInit(k0Var.U().booleanValue());
        }
        for (Map.Entry entry : new HashMap(k0Var.H()).entrySet()) {
            this.tags.put((String) entry.getKey(), (String) entry.getValue());
        }
        Iterator it = new ArrayList(k0Var.q()).iterator();
        while (it.hasNext()) {
            addInAppInclude((String) it.next());
        }
        Iterator it2 = new ArrayList(k0Var.p()).iterator();
        while (it2.hasNext()) {
            addInAppExclude((String) it2.next());
        }
        Iterator it3 = new HashSet(k0Var.n()).iterator();
        while (it3.hasNext()) {
            addIgnoredExceptionForType((Class) it3.next());
        }
        if (k0Var.I() != null) {
            setTracePropagationTargets(new ArrayList(k0Var.I()));
        }
        Iterator it4 = new ArrayList(k0Var.c()).iterator();
        while (it4.hasNext()) {
            addContextTag((String) it4.next());
        }
        if (k0Var.y() != null) {
            setProguardUuid(k0Var.y());
        }
        if (k0Var.k() != null) {
            setIdleTimeout(k0Var.k());
        }
        if (k0Var.F() != null) {
            setShutdownTimeoutMillis(k0Var.F().longValue());
        }
        if (k0Var.E() != null) {
            setSessionFlushTimeoutMillis(k0Var.E().longValue());
        }
        Iterator it5 = k0Var.b().iterator();
        while (it5.hasNext()) {
            addBundleId((String) it5.next());
        }
        if (k0Var.T() != null) {
            setEnabled(k0Var.T().booleanValue());
        }
        if (k0Var.Q() != null) {
            setEnablePrettySerializationOutput(k0Var.Q().booleanValue());
        }
        if (k0Var.X() != null) {
            setSendModules(k0Var.X().booleanValue());
        }
        if (k0Var.l() != null) {
            setIgnoredCheckIns(new ArrayList(k0Var.l()));
        }
        if (k0Var.o() != null) {
            setIgnoredTransactions(new ArrayList(k0Var.o()));
        }
        if (k0Var.m() != null) {
            setIgnoredErrors(new ArrayList(k0Var.m()));
        }
        if (k0Var.L() != null) {
            setEnableBackpressureHandling(k0Var.L().booleanValue());
        }
        if (k0Var.N() != null) {
            setEnableDatabaseTransactionTracing(k0Var.N().booleanValue());
        }
        if (k0Var.M() != null) {
            setEnableCacheTracing(k0Var.M().booleanValue());
        }
        if (k0Var.R() != null) {
            setEnableQueueTracing(k0Var.R().booleanValue());
        }
        if (k0Var.r() != null) {
            setMaxRequestBodySize(k0Var.r());
        }
        if (k0Var.W() != null) {
            setSendDefaultPii(k0Var.W().booleanValue());
        }
        if (k0Var.K() != null) {
            setCaptureOpenTelemetryEvents(k0Var.K().booleanValue());
        }
        if (k0Var.S() != null) {
            setEnableSpotlight(k0Var.S().booleanValue());
        }
        if (k0Var.G() != null) {
            setSpotlightConnectionUrl(k0Var.G());
        }
        if (k0Var.V() != null) {
            setGlobalHubMode(k0Var.V());
        }
        if (k0Var.d() != null) {
            if (getCron() == null) {
                setCron(k0Var.d());
            } else {
                if (k0Var.d().a != null) {
                    getCron().a = k0Var.d().a;
                }
                if (k0Var.d().b != null) {
                    getCron().b = k0Var.d().b;
                }
                if (k0Var.d().c != null) {
                    getCron().c = k0Var.d().c;
                }
                if (k0Var.d().d != null) {
                    getCron().d = k0Var.d().d;
                }
                if (k0Var.d().e != null) {
                    getCron().e = k0Var.d().e;
                }
            }
        }
        if (k0Var.O() != null) {
            getLogs().a = k0Var.O().booleanValue();
        }
        if (k0Var.P() != null) {
            getMetrics().a = k0Var.P().booleanValue();
        }
        if (k0Var.v() != null) {
            setProfileSessionSampleRate(k0Var.v());
        }
        if (k0Var.x() != null) {
            setProfilingTracesDirPath(k0Var.x());
        }
        if (k0Var.u() != null) {
            setProfileLifecycle(k0Var.u());
        }
        if (k0Var.Y() != null) {
            setStrictTraceContinuation(k0Var.Y().booleanValue());
        }
        if (k0Var.s() != null) {
            setOrgId(k0Var.s());
        }
    }

    public f0 retrieveParsedDsn() {
        return (f0) this.parsedDsn.a();
    }

    public void setAttachServerName(boolean z) {
        this.attachServerName = z;
    }

    public void setAttachStacktrace(boolean z) {
        this.attachStacktrace = z;
    }

    public void setAttachThreads(boolean z) {
        this.attachThreads = z;
    }

    public void setBackpressureMonitor(io.sentry.backpressure.b bVar) {
        this.backpressureMonitor = bVar;
    }

    public void setBeforeBreadcrumb(h6 h6Var) {
        this.beforeBreadcrumb = h6Var;
    }

    public void setBeforeEnvelopeCallback(i6 i6Var) {
    }

    public void setBeforeSend(j6 j6Var) {
        this.beforeSend = j6Var;
    }

    public void setBeforeSendFeedback(j6 j6Var) {
        this.beforeSendFeedback = j6Var;
    }

    public void setBeforeSendReplay(k6 k6Var) {
    }

    public void setBeforeSendTransaction(l6 l6Var) {
        this.beforeSendTransaction = l6Var;
    }

    public void setCacheDirPath(String str) {
        this.cacheDirPath = str;
    }

    public void setCaptureOpenTelemetryEvents(boolean z) {
        this.captureOpenTelemetryEvents = z;
    }

    public void setCompositePerformanceCollector(n nVar) {
        this.compositePerformanceCollector = nVar;
    }

    public void setConnectionStatusProvider(u0 u0Var) {
        this.connectionStatusProvider = u0Var;
    }

    public void setConnectionTimeoutMillis(int i) {
        this.connectionTimeoutMillis = i;
    }

    public void setContinuousProfiler(v0 v0Var) {
        if (this.continuousProfiler != u2.E || v0Var == null) {
            return;
        }
        this.continuousProfiler = v0Var;
    }

    public void setCron(m6 m6Var) {
        this.cron = m6Var;
    }

    public void setDateProvider(b5 b5Var) {
        this.dateProvider.c(b5Var);
    }

    public void setDeadlineTimeout(long j) {
        this.deadlineTimeout = j;
    }

    public void setDebug(boolean z) {
        this.debug = z;
    }

    public void setDebugMetaLoader(io.sentry.internal.debugmeta.a aVar) {
        if (aVar == null) {
            aVar = io.sentry.internal.debugmeta.b.E;
        }
        this.debugMetaLoader = aVar;
    }

    public void setDefaultScopeType(l4 l4Var) {
        this.defaultScopeType = l4Var;
    }

    public void setDiagnosticLevel(t5 t5Var) {
        if (t5Var == null) {
            t5Var = DEFAULT_DIAGNOSTIC_LEVEL;
        }
        this.diagnosticLevel = t5Var;
    }

    public void setDist(String str) {
        this.dist = str;
    }

    public void setDistinctId(String str) {
        this.distinctId = str;
    }

    public void setDistribution(n6 n6Var) {
        if (n6Var == null) {
            n6Var = new n6();
        }
        this.distribution = n6Var;
    }

    public void setDistributionController(w0 w0Var) {
        if (w0Var == null) {
            w0Var = v2.E;
        }
        this.distributionController = w0Var;
    }

    public void setDsn(String str) {
        String string = null;
        this.dsn = str != null ? str.trim() : null;
        this.parsedDsn.b();
        String str2 = this.dsn;
        a1 a1Var = this.logger;
        Charset charset = io.sentry.util.o.a;
        if (str2 != null && !str2.isEmpty()) {
            try {
                string = new StringBuilder(new BigInteger(1, MessageDigest.getInstance("SHA-1").digest(str2.getBytes(io.sentry.util.o.a))).toString(16)).toString();
            } catch (NoSuchAlgorithmException e) {
                a1Var.d(t5.INFO, "SHA-1 isn't available to calculate the hash.", e);
            } catch (Throwable th) {
                a1Var.h(t5.INFO, "string: %s could not calculate its hash", th, str2);
            }
        }
        this.dsnHash = string;
    }

    public void setEnableAppStartProfiling(boolean z) {
        this.enableAppStartProfiling = z;
    }

    public void setEnableAutoSessionTracking(boolean z) {
        this.enableAutoSessionTracking = z;
    }

    public void setEnableBackpressureHandling(boolean z) {
        this.enableBackpressureHandling = z;
    }

    public void setEnableCacheTracing(boolean z) {
        this.enableCacheTracing = z;
    }

    public void setEnableDatabaseTransactionTracing(boolean z) {
        this.enableDatabaseTransactionTracing = z;
    }

    public void setEnableDeduplication(boolean z) {
        this.enableDeduplication = z;
    }

    public void setEnableEventSizeLimiting(boolean z) {
        this.enableEventSizeLimiting = z;
    }

    public void setEnableExternalConfiguration(boolean z) {
        this.enableExternalConfiguration = z;
    }

    public void setEnablePrettySerializationOutput(boolean z) {
        this.enablePrettySerializationOutput = z;
    }

    public void setEnableQueueTracing(boolean z) {
        this.enableQueueTracing = z;
    }

    public void setEnableScopePersistence(boolean z) {
        this.enableScopePersistence = z;
    }

    public void setEnableScreenTracking(boolean z) {
        this.enableScreenTracking = z;
    }

    public void setEnableShutdownHook(boolean z) {
        this.enableShutdownHook = z;
    }

    public void setEnableSpotlight(boolean z) {
        this.enableSpotlight = z;
    }

    public void setEnableTimeToFullDisplayTracing(boolean z) {
        this.enableTimeToFullDisplayTracing = z;
    }

    public void setEnableUncaughtExceptionHandler(boolean z) {
        this.enableUncaughtExceptionHandler = z;
    }

    public void setEnableUserInteractionBreadcrumbs(boolean z) {
        this.enableUserInteractionBreadcrumbs = z;
    }

    public void setEnableUserInteractionTracing(boolean z) {
        this.enableUserInteractionTracing = z;
    }

    public void setEnabled(boolean z) {
        this.enabled = z;
    }

    public void setEnvelopeDiskCache(io.sentry.cache.d dVar) {
        if (dVar == null) {
            dVar = io.sentry.transport.h.E;
        }
        this.envelopeDiskCache = dVar;
    }

    public void setEnvelopeReader(x0 x0Var) {
        io.sentry.util.h hVar = this.envelopeReader;
        if (x0Var == null) {
            x0Var = w2.a;
        }
        hVar.c(x0Var);
    }

    public void setEnvironment(String str) {
        this.environment = str;
    }

    public void setExecutorService(l1 l1Var) {
        if (l1Var != null) {
            this.executorService = l1Var;
        }
    }

    public void setFatalLogger(a1 a1Var) {
        if (a1Var == null) {
            a1Var = z2.E;
        }
        this.fatalLogger = a1Var;
    }

    public void setFeedbackOptions(o5 o5Var) {
        this.feedbackOptions = o5Var;
    }

    public void setFlushTimeoutMillis(long j) {
        this.flushTimeoutMillis = j;
    }

    public void setForceInit(boolean z) {
        this.forceInit = z;
    }

    public void setFullyDisplayedReporter(m0 m0Var) {
        this.fullyDisplayedReporter = m0Var;
    }

    public void setGestureTargetLocators(List<io.sentry.internal.gestures.a> list) {
        this.gestureTargetLocators.clear();
        this.gestureTargetLocators.addAll(list);
    }

    public void setGlobalHubMode(Boolean bool) {
        this.globalHubMode = bool;
    }

    public void setIdleTimeout(Long l) {
        this.idleTimeout = l;
    }

    public void setIgnoredCheckIns(List<String> list) {
        if (list == null) {
            this.ignoredCheckIns = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(new l0(str));
            }
        }
        this.ignoredCheckIns = arrayList;
    }

    public void setIgnoredErrors(List<String> list) {
        if (list == null) {
            this.ignoredErrors = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new l0(str));
            }
        }
        this.ignoredErrors = arrayList;
    }

    public void setIgnoredSpanOrigins(List<String> list) {
        if (list == null) {
            this.ignoredSpanOrigins = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new l0(str));
            }
        }
        this.ignoredSpanOrigins = arrayList;
    }

    public void setIgnoredTransactions(List<String> list) {
        if (list == null) {
            this.ignoredTransactions = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new l0(str));
            }
        }
        this.ignoredTransactions = arrayList;
    }

    public void setInitPriority(v1 v1Var) {
        this.initPriority = v1Var;
    }

    @Deprecated
    public void setInstrumenter(w1 w1Var) {
        this.instrumenter = w1Var;
    }

    public void setLogger(a1 a1Var) {
        this.logger = a1Var == null ? z2.E : new y(this, 0, a1Var);
    }

    public void setLogs(o6 o6Var) {
        this.logs = o6Var;
    }

    public void setMaxAttachmentSize(long j) {
        this.maxAttachmentSize = j;
    }

    public void setMaxBreadcrumbs(int i) {
        this.maxBreadcrumbs = i;
    }

    public void setMaxCacheItems(int i) {
        this.maxCacheItems = i;
    }

    public void setMaxDepth(int i) {
        this.maxDepth = i;
    }

    public void setMaxFeatureFlags(int i) {
        this.maxFeatureFlags = i;
    }

    public void setMaxQueueSize(int i) {
        if (i > 0) {
            this.maxQueueSize = i;
        }
    }

    public void setMaxRequestBodySize(u6 u6Var) {
        this.maxRequestBodySize = u6Var;
    }

    public void setMaxSpans(int i) {
        this.maxSpans = i;
    }

    public void setMaxTraceFileSize(long j) {
        this.maxTraceFileSize = j;
    }

    public void setMetrics(p6 p6Var) {
        this.metrics = p6Var;
    }

    public void setModulesLoader(io.sentry.internal.modules.a aVar) {
        if (aVar == null) {
            aVar = io.sentry.internal.modules.e.a;
        }
        this.modulesLoader = aVar;
    }

    public void setOnDiscard(q6 q6Var) {
    }

    public void setOnOversizedEvent(r6 r6Var) {
    }

    public void setOpenTelemetryMode(f6 f6Var) {
        this.openTelemetryMode = f6Var;
    }

    public void setOrgId(String str) {
        this.orgId = str;
    }

    public void setPrintUncaughtStackTrace(boolean z) {
        this.printUncaughtStackTrace = z;
    }

    public void setProfileLifecycle(x3 x3Var) {
        this.profileLifecycle = x3Var;
        if (x3Var != x3.TRACE || isTracingEnabled()) {
            return;
        }
        this.logger.h(t5.WARNING, "Profiling lifecycle is set to TRACE but tracing is disabled. Profiling will not be started automatically.", new Object[0]);
    }

    public void setProfileSessionSampleRate(Double d) {
        if (p.q(d, true)) {
            this.profileSessionSampleRate = d;
        } else {
            e0.d(d, " is not valid. Use values between 0.0 and 1.0.", "The value ");
        }
    }

    public void setProfilerConverter(e1 e1Var) {
        this.profilerConverter = e1Var;
    }

    public void setProfilesSampleRate(Double d) {
        if (p.q(d, true)) {
            this.profilesSampleRate = d;
        } else {
            e0.d(d, " is not valid. Use null to disable or values between 0.0 and 1.0.", "The value ");
        }
    }

    public void setProfilesSampler(s6 s6Var) {
    }

    public void setProfilingTracesDirPath(String str) {
        this.profilingTracesDirPath = str;
    }

    public void setProfilingTracesHz(int i) {
        this.profilingTracesHz = i;
    }

    public void setProguardUuid(String str) {
        this.proguardUuid = str;
    }

    public void setPropagateTraceparent(boolean z) {
        this.propagateTraceparent = z;
    }

    public void setProxy(t6 t6Var) {
        this.proxy = t6Var;
    }

    public void setReadTimeoutMillis(int i) {
        this.readTimeoutMillis = i;
    }

    public void setRelease(String str) {
        this.release = str;
    }

    public void setReplayController(b4 b4Var) {
        if (b4Var == null) {
            b4Var = v2.F;
        }
        this.replayController = b4Var;
    }

    public void setSampleRate(Double d) {
        if (p.q(d, true)) {
            this.sampleRate = d;
        } else {
            e0.d(d, " is not valid. Use null to disable or values >= 0.0 and <= 1.0.", "The value ");
        }
    }

    public void setScopesStorageFactory(j1 j1Var) {
    }

    public void setSdkVersion(io.sentry.protocol.u uVar) {
        io.sentry.protocol.u uVar2 = getSessionReplay().l;
        io.sentry.protocol.u uVar3 = this.sdkVersion;
        if (uVar3 != null && uVar2 != null && uVar3.equals(uVar2)) {
            getSessionReplay().l = uVar;
        }
        this.sdkVersion = uVar;
    }

    public void setSendClientReports(boolean z) {
        this.sendClientReports = z;
        if (z) {
            this.clientReportRecorder = new y(this);
        } else {
            this.clientReportRecorder = new io.sentry.android.core.internal.gestures.h();
        }
    }

    public void setSendDefaultPii(boolean z) {
        this.sendDefaultPii = z;
    }

    public void setSendModules(boolean z) {
        this.sendModules = z;
    }

    public void setSentryClientName(String str) {
        this.sentryClientName = str;
    }

    public void setSerializer(n1 n1Var) {
        io.sentry.util.h hVar = this.serializer;
        if (n1Var == null) {
            n1Var = i3.a;
        }
        hVar.c(n1Var);
    }

    public void setServerName(String str) {
        this.serverName = str;
    }

    public void setSessionFlushTimeoutMillis(long j) {
        this.sessionFlushTimeoutMillis = j;
    }

    public void setSessionReplay(a7 a7Var) {
        this.sessionReplay = a7Var;
    }

    public void setSessionTrackingIntervalMillis(long j) {
        this.sessionTrackingIntervalMillis = j;
    }

    public void setShutdownTimeoutMillis(long j) {
        this.shutdownTimeoutMillis = j;
    }

    public void setSocketTagger(o1 o1Var) {
        if (o1Var == null) {
            o1Var = j3.E;
        }
        this.socketTagger = o1Var;
    }

    public void setSpanFactory(q1 q1Var) {
        this.spanFactory = q1Var;
    }

    public void setSpotlightConnectionUrl(String str) {
        this.spotlightConnectionUrl = str;
    }

    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void setStartProfilerOnAppStart(boolean z) {
        this.startProfilerOnAppStart = z;
    }

    public void setStrictTraceContinuation(boolean z) {
        this.strictTraceContinuation = z;
    }

    public void setTag(String str, String str2) {
        if (str == null) {
            return;
        }
        Map<String, String> map = this.tags;
        if (str2 == null) {
            map.remove(str);
        } else {
            map.put(str, str2);
        }
    }

    public void setThreadChecker(io.sentry.util.thread.a aVar) {
        this.threadChecker = aVar;
    }

    public void setTraceOptionsRequests(boolean z) {
        this.traceOptionsRequests = z;
    }

    public void setTracePropagationTargets(List<String> list) {
        if (list == null) {
            this.tracePropagationTargets = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.tracePropagationTargets = arrayList;
    }

    @Deprecated
    public void setTraceSampling(boolean z) {
        this.traceSampling = z;
    }

    public void setTracesSampleRate(Double d) {
        if (p.q(d, true)) {
            this.tracesSampleRate = d;
        } else {
            e0.d(d, " is not valid. Use null to disable or values between 0.0 and 1.0.", "The value ");
        }
    }

    public void setTracesSampler(v6 v6Var) {
        this.tracesSampler = v6Var;
    }

    public void setTransactionProfiler(s1 s1Var) {
        if (this.transactionProfiler != v2.G || s1Var == null) {
            return;
        }
        this.transactionProfiler = s1Var;
    }

    public void setTransportFactory(t1 t1Var) {
        if (t1Var == null) {
            t1Var = n3.E;
        }
        this.transportFactory = t1Var;
    }

    public void setTransportGate(io.sentry.transport.g gVar) {
        if (gVar == null) {
            gVar = io.sentry.transport.j.a;
        }
        this.transportGate = gVar;
    }

    public void setVersionDetector(u1 u1Var) {
        this.versionDetector = u1Var;
    }

    public void setViewHierarchyExporters(List<ComposeViewHierarchyExporter> list) {
        this.viewHierarchyExporters.clear();
        this.viewHierarchyExporters.addAll(list);
    }
}
