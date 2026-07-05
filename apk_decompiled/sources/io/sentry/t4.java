package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public abstract class t4 {
    public static volatile i1 a = f3.a;
    public static volatile h1 b = d3.b;
    public static final h4 c = new h4(w6.empty());
    public static volatile boolean d = false;
    public static final Charset e = Charset.forName("UTF-8");
    public static final long f = System.currentTimeMillis();
    public static final io.sentry.util.a g = new io.sentry.util.a();

    public static void a(String str, Boolean bool) {
        g().d(str, bool);
    }

    public static void b(Throwable th, j4 j4Var) {
        h1 h1VarG = g();
        h1VarG.getClass();
        h1VarG.o(th, new n0(), j4Var);
    }

    public static io.sentry.protocol.w c(t5 t5Var) {
        return g().H(t5Var);
    }

    public static void d() {
        v vVarA = g.a();
        try {
            h1 h1VarG = g();
            b = d3.b;
            a.close();
            h1VarG.a(false);
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

    public static void e(j4 j4Var) {
        g().w(j4Var);
    }

    public static void f(long j) {
        g().b(j);
    }

    public static h1 g() {
        if (d) {
            return b;
        }
        h1 h1Var = a.get();
        if (h1Var != null && !h1Var.l()) {
            return h1Var;
        }
        h1 h1VarF = b.F("getCurrentScopes");
        a.a(h1VarF);
        return h1VarF;
    }

    public static void h(v2 v2Var, io.sentry.android.core.f fVar) {
        w6 w6Var = (w6) SentryAndroidOptions.class.getDeclaredConstructor(null).newInstance(null);
        try {
            fVar.d(w6Var);
        } catch (Throwable th) {
            w6Var.getLogger().d(t5.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th);
        }
        v vVarA = g.a();
        try {
            if (!w6Var.getClass().getName().equals("io.sentry.android.core.SentryAndroidOptions") && io.sentry.util.k.a) {
                throw new IllegalArgumentException("You are running Android. Please, use SentryAndroid.init. ".concat(w6Var.getClass().getName()));
            }
            if (w6Var.isEnableExternalConfiguration()) {
                w6Var.merge(k0.a(io.sentry.config.a.h(), w6Var.getLogger()));
            }
            String dsn = w6Var.getDsn();
            if (!w6Var.isEnabled() || (dsn != null && dsn.isEmpty())) {
                d();
            } else {
                if (dsn == null) {
                    throw new IllegalArgumentException("DSN is required. Use empty string or set enabled to false in SentryOptions to disable SDK.");
                }
                w6Var.retrieveParsedDsn();
                Boolean boolIsGlobalHubMode = w6Var.isGlobalHubMode();
                int i = 1;
                boolean zBooleanValue = boolIsGlobalHubMode != null ? boolIsGlobalHubMode.booleanValue() : true;
                w6Var.getLogger().h(t5.INFO, "GlobalHubMode: '%s'", String.valueOf(zBooleanValue));
                d = zBooleanValue;
                if (w6Var.getFatalLogger() instanceof z2) {
                    w6Var.setFatalLogger(new x2());
                }
                h4 h4Var = c;
                int i2 = 0;
                if (p.w(h4Var.m, w6Var, l())) {
                    if (l()) {
                        w6Var.getLogger().h(t5.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
                    }
                    w6Var.activate();
                    g().a(true);
                    h4Var.m = w6Var;
                    Queue queue = h4Var.h;
                    h4Var.h = h4.b(w6Var.getMaxBreadcrumbs());
                    Iterator it = queue.iterator();
                    while (it.hasNext()) {
                        h4Var.j((g) it.next(), null);
                    }
                    b = new m4(new h4(w6Var), new h4(w6Var), h4Var);
                    if (w6Var.isDebug() && (w6Var.getLogger() instanceof z2)) {
                        w6Var.setLogger(new x2());
                    }
                    j(w6Var);
                    a.a(b);
                    i(w6Var);
                    h4Var.v = new y4(w6Var);
                    if (w6Var.getExecutorService().isClosed()) {
                        w6Var.setExecutorService(new n5(w6Var));
                        w6Var.getExecutorService().b();
                    }
                    try {
                        w6Var.getExecutorService().submit(new r4(w6Var, i2));
                    } catch (RejectedExecutionException e2) {
                        w6Var.getLogger().d(t5.DEBUG, "Failed to call the executor. Lazy fields will not be loaded. Did you call Sentry.close()?", e2);
                    }
                    try {
                        w6Var.getExecutorService().submit(new r2(w6Var));
                    } catch (Throwable th2) {
                        w6Var.getLogger().d(t5.DEBUG, "Failed to move previous session.", th2);
                    }
                    for (x1 x1Var : w6Var.getIntegrations()) {
                        try {
                            x1Var.H(w6Var);
                        } catch (Throwable th3) {
                            w6Var.getLogger().d(t5.WARNING, "Failed to register the integration " + x1Var.getClass().getName(), th3);
                        }
                    }
                    try {
                        w6Var.getExecutorService().submit(new r4(w6Var, 2));
                    } catch (Throwable th4) {
                        w6Var.getLogger().d(t5.DEBUG, "Failed to notify options observers.", th4);
                    }
                    try {
                        w6Var.getExecutorService().submit(new t3(w6Var));
                    } catch (Throwable th5) {
                        w6Var.getLogger().d(t5.DEBUG, "Failed to finalize previous session.", th5);
                    }
                    try {
                        w6Var.getExecutorService().submit(new r4(w6Var, i));
                    } catch (Throwable th6) {
                        w6Var.getLogger().d(t5.ERROR, "Failed to call the executor. App start profiling config will not be changed. Did you call Sentry.close()?", th6);
                    }
                    a1 logger = w6Var.getLogger();
                    t5 t5Var = t5.DEBUG;
                    logger.h(t5Var, "Using openTelemetryMode %s", w6Var.getOpenTelemetryMode());
                    w6Var.getLogger().h(t5Var, "Using span factory %s", w6Var.getSpanFactory().getClass().getName());
                    w6Var.getLogger().h(t5Var, "Using scopes storage %s", a.getClass().getName());
                } else {
                    w6Var.getLogger().h(t5.WARNING, "This init call has been ignored due to priority being too low.", new Object[0]);
                }
            }
            vVarA.close();
        } catch (Throwable th7) {
            try {
                vVarA.close();
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
            }
            throw th7;
        }
    }

    public static void i(w6 w6Var) {
        io.sentry.cache.d cVar;
        a1 logger = w6Var.getLogger();
        t5 t5Var = t5.INFO;
        logger.h(t5Var, "Initializing SDK with DSN: '%s'", w6Var.getDsn());
        String outboxPath = w6Var.getOutboxPath();
        if (outboxPath != null) {
            new File(outboxPath).mkdirs();
        } else {
            logger.h(t5Var, "No outbox dir path is defined in options.", new Object[0]);
        }
        String cacheDirPath = w6Var.getCacheDirPath();
        if (cacheDirPath != null) {
            new File(cacheDirPath).mkdirs();
            if (w6Var.getEnvelopeDiskCache() instanceof io.sentry.transport.h) {
                int i = io.sentry.cache.c.N;
                String cacheDirPath2 = w6Var.getCacheDirPath();
                int maxCacheItems = w6Var.getMaxCacheItems();
                if (cacheDirPath2 == null) {
                    w6Var.getLogger().h(t5.WARNING, "cacheDirPath is null, returning NoOpEnvelopeCache", new Object[0]);
                    cVar = io.sentry.transport.h.E;
                } else {
                    cVar = new io.sentry.cache.c(w6Var, cacheDirPath2, maxCacheItems);
                }
                w6Var.setEnvelopeDiskCache(cVar);
            }
        }
        String profilingTracesDirPath = w6Var.getProfilingTracesDirPath();
        if ((w6Var.isProfilingEnabled() || w6Var.isContinuousProfilingEnabled()) && profilingTracesDirPath != null) {
            File file = new File(profilingTracesDirPath);
            file.mkdirs();
            try {
                w6Var.getExecutorService().submit(new defpackage.y0(13, file));
            } catch (RejectedExecutionException e2) {
                w6Var.getLogger().d(t5.ERROR, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?", e2);
            }
        }
        io.sentry.internal.modules.a modulesLoader = w6Var.getModulesLoader();
        if (!w6Var.isSendModules()) {
            w6Var.setModulesLoader(io.sentry.internal.modules.e.a);
        } else if (modulesLoader instanceof io.sentry.internal.modules.e) {
            w6Var.setModulesLoader(new io.sentry.internal.modules.f(Arrays.asList(new io.sentry.internal.modules.c(w6Var.getLogger()), new io.sentry.internal.modules.f(w6Var.getLogger())), w6Var.getLogger()));
        }
        if (w6Var.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
            w6Var.setDebugMetaLoader(new io.sentry.internal.debugmeta.c(w6Var.getLogger()));
        }
        List<Properties> listF = w6Var.getDebugMetaLoader().f();
        if (listF != null) {
            if (w6Var.getBundleIds().isEmpty()) {
                Iterator it = listF.iterator();
                while (it.hasNext()) {
                    String property = ((Properties) it.next()).getProperty("io.sentry.bundle-ids");
                    w6Var.getLogger().h(t5.DEBUG, "Bundle IDs found: %s", property);
                    if (property != null) {
                        for (String str : property.split(",", -1)) {
                            w6Var.addBundleId(str);
                        }
                    }
                }
            }
            if (w6Var.getProguardUuid() == null) {
                Iterator it2 = listF.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    String property2 = ((Properties) it2.next()).getProperty("io.sentry.ProguardUuids");
                    if (property2 != null) {
                        w6Var.getLogger().h(t5.DEBUG, "Proguard UUID found: %s", property2);
                        w6Var.setProguardUuid(property2);
                        break;
                    }
                }
            }
            Iterator it3 = listF.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Properties properties = (Properties) it3.next();
                String property3 = properties.getProperty("io.sentry.build-tool");
                if (property3 != null) {
                    String property4 = properties.getProperty("io.sentry.build-tool-version");
                    if (property4 == null) {
                        property4 = "unknown";
                    }
                    w6Var.getLogger().h(t5.DEBUG, "Build tool found: %s, version %s", property3, property4);
                    r5.d().b(property3, property4);
                }
            }
            for (Properties properties2 : listF) {
                String property5 = properties2.getProperty("io.sentry.distribution.org-slug");
                String property6 = properties2.getProperty("io.sentry.distribution.project-slug");
                String property7 = properties2.getProperty("io.sentry.distribution.auth-token");
                String property8 = properties2.getProperty("io.sentry.distribution.build-configuration");
                String property9 = properties2.getProperty("io.sentry.distribution.install-groups-override");
                if (property5 != null || property6 != null || property7 != null || property8 != null || property9 != null) {
                    n6 distribution = w6Var.getDistribution();
                    if (property5 != null && !property5.isEmpty() && distribution.b.isEmpty()) {
                        w6Var.getLogger().h(t5.DEBUG, "Distribution org slug found: %s", property5);
                        distribution.b = property5;
                    }
                    if (property6 != null && !property6.isEmpty() && distribution.c.isEmpty()) {
                        w6Var.getLogger().h(t5.DEBUG, "Distribution project slug found: %s", property6);
                        distribution.c = property6;
                    }
                    if (property7 != null && !property7.isEmpty() && distribution.a.isEmpty()) {
                        w6Var.getLogger().h(t5.DEBUG, "Distribution org auth token found", new Object[0]);
                        distribution.a = property7;
                    }
                    if (property8 != null && !property8.isEmpty() && distribution.d == null) {
                        w6Var.getLogger().h(t5.DEBUG, "Distribution build configuration found: %s", property8);
                        distribution.d = property8;
                    }
                    if (property9 != null && !property9.isEmpty() && distribution.e == null) {
                        String[] strArrSplit = property9.split(",", -1);
                        ArrayList arrayList = new ArrayList();
                        for (String str2 : strArrSplit) {
                            String strTrim = str2.trim();
                            if (!strTrim.isEmpty()) {
                                arrayList.add(strTrim);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            w6Var.getLogger().h(t5.DEBUG, "Distribution install groups override found: %s", arrayList);
                            distribution.e = arrayList;
                        }
                    }
                }
            }
        }
        if (w6Var.getThreadChecker() instanceof io.sentry.util.thread.b) {
            w6Var.setThreadChecker(io.sentry.util.thread.c.d());
        }
        if (w6Var.getPerformanceCollectors().isEmpty()) {
            w6Var.addPerformanceCollector(new y1());
        }
        if (w6Var.isEnableBackpressureHandling() && !io.sentry.util.k.a) {
            if (w6Var.getBackpressureMonitor() instanceof io.sentry.backpressure.c) {
                w6Var.setBackpressureMonitor(new io.sentry.backpressure.a(w6Var));
            }
            w6Var.getBackpressureMonitor().start();
        }
        if (!io.sentry.util.k.a && w6Var.isContinuousProfilingEnabled() && (w6Var.getContinuousProfiler() instanceof u2)) {
            try {
                if (w6Var.getProfilingTracesDirPath() == null) {
                    File file2 = new File(System.getProperty("java.io.tmpdir"), "sentry_profiling_traces");
                    if (file2.mkdirs() || file2.exists()) {
                        w6Var.setProfilingTracesDirPath(file2.getAbsolutePath());
                    } else {
                        b2.g("Creating a fallback directory for profiling failed in ", file2.getAbsolutePath());
                    }
                }
                a1 logger2 = w6Var.getLogger();
                w6Var.getProfilingTracesHz();
                w6Var.getExecutorService();
                io.sentry.config.a.A(logger2);
                w6Var.getLogger().h(t5.WARNING, "Could not load profiler, profiling will be disabled. If you are using Spring or Spring Boot with the OTEL Agent profiler init will be retried.", new Object[0]);
            } catch (Exception e3) {
                w6Var.getLogger().d(t5.ERROR, "Failed to create default profiling traces directory", e3);
            }
            w6Var.getContinuousProfiler();
        } else {
            w6Var.getContinuousProfiler();
        }
        if (!io.sentry.util.k.a && w6Var.isContinuousProfilingEnabled() && (w6Var.getProfilerConverter() instanceof a3)) {
            io.sentry.config.a.B();
            w6Var.getLogger().h(t5.WARNING, "Could not load profile converter. If you are using Spring or Spring Boot with the OTEL Agent, profile converter init will be retried.", new Object[0]);
            w6Var.getProfilerConverter();
        } else {
            w6Var.getProfilerConverter();
        }
        w6Var.getLogger().h(t5.INFO, "Continuous profiler is enabled %s mode: %s", Boolean.valueOf(w6Var.isContinuousProfilingEnabled()), w6Var.getProfileLifecycle());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public static void j(w6 w6Var) {
        ?? arrayList;
        z2 z2Var = z2.E;
        boolean z = io.sentry.util.k.a;
        if (!z) {
            if (f6.AUTO.equals(w6Var.getOpenTelemetryMode())) {
                if (io.sentry.android.core.internal.gestures.h.b(z2Var, "io.sentry.opentelemetry.agent.AgentMarker")) {
                    w6Var.getLogger().h(t5.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENT", new Object[0]);
                    w6Var.setOpenTelemetryMode(f6.AGENT);
                } else if (io.sentry.android.core.internal.gestures.h.b(z2Var, "io.sentry.opentelemetry.agent.AgentlessMarker")) {
                    w6Var.getLogger().h(t5.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS", new Object[0]);
                    w6Var.setOpenTelemetryMode(f6.AGENTLESS);
                } else if (io.sentry.android.core.internal.gestures.h.b(z2Var, "io.sentry.opentelemetry.agent.AgentlessSpringMarker")) {
                    w6Var.getLogger().h(t5.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS_SPRING", new Object[0]);
                    w6Var.setOpenTelemetryMode(f6.AGENTLESS_SPRING);
                }
            }
        }
        f6 f6Var = f6.OFF;
        if (f6Var == w6Var.getOpenTelemetryMode()) {
            w6Var.setSpanFactory(new l3(1));
        }
        a.close();
        w6Var.getScopesStorageFactory();
        if (f6Var == w6Var.getOpenTelemetryMode()) {
            a = new w();
        } else {
            a = io.sentry.config.a.g(new io.sentry.android.core.internal.gestures.h());
        }
        if (z) {
            return;
        }
        f6 openTelemetryMode = w6Var.getOpenTelemetryMode();
        if (f6Var.equals(openTelemetryMode)) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            ConcurrentHashMap concurrentHashMap = io.sentry.util.n.a;
            arrayList = new ArrayList();
            f6 f6Var2 = f6.AGENT;
            if (f6Var2 == openTelemetryMode || f6.AGENTLESS_SPRING == openTelemetryMode) {
                arrayList.add("auto.http.spring_jakarta.webmvc");
                arrayList.add("auto.http.spring.webmvc");
                arrayList.add("auto.http.spring7.webmvc");
                arrayList.add("auto.spring_jakarta.webflux");
                arrayList.add("auto.spring.webflux");
                arrayList.add("auto.spring7.webflux");
                arrayList.add("auto.db.jdbc");
                arrayList.add("auto.http.spring_jakarta.webclient");
                arrayList.add("auto.http.spring.webclient");
                arrayList.add("auto.http.spring7.webclient");
                arrayList.add("auto.http.spring_jakarta.restclient");
                arrayList.add("auto.http.spring.restclient");
                arrayList.add("auto.http.spring7.restclient");
                arrayList.add("auto.http.spring_jakarta.resttemplate");
                arrayList.add("auto.http.spring.resttemplate");
                arrayList.add("auto.http.spring7.resttemplate");
                arrayList.add("auto.http.openfeign");
                arrayList.add("auto.http.ktor-client");
                arrayList.add("auto.queue.spring_jakarta.kafka.producer");
                arrayList.add("auto.queue.spring_jakarta.kafka.consumer");
                arrayList.add("auto.queue.kafka.producer");
                arrayList.add("auto.queue.kafka.consumer");
            }
            if (f6Var2 == openTelemetryMode) {
                arrayList.add("auto.graphql.graphql");
                arrayList.add("auto.graphql.graphql22");
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            w6Var.addIgnoredSpanOrigin((String) it.next());
        }
    }

    public static Boolean k() {
        return g().x();
    }

    public static boolean l() {
        return g().isEnabled();
    }

    public static void m() {
        g().q();
    }

    public static void n(String str, String str2) {
        g().f(str, str2);
    }

    public static void o(io.sentry.protocol.i0 i0Var) {
        g().e(i0Var);
    }

    public static void p(j4 j4Var) {
        g().B(j4Var);
    }
}
