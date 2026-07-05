package io.sentry;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r4 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ w6 F;

    public /* synthetic */ r4(w6 w6Var, int i) {
        this.E = i;
        this.F = w6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        w6 w6Var = this.F;
        switch (i) {
            case 0:
                w6Var.loadLazyFields();
                return;
            case 1:
                String cacheDirPathWithoutDsn = w6Var.getCacheDirPathWithoutDsn();
                if (cacheDirPathWithoutDsn != null) {
                    File file = new File(cacheDirPathWithoutDsn, "app_start_profiling_config");
                    try {
                        p.e(file);
                        if (w6Var.isEnableAppStartProfiling() || w6Var.isStartProfilerOnAppStart()) {
                            if (!w6Var.isStartProfilerOnAppStart() && !w6Var.isTracingEnabled()) {
                                w6Var.getLogger().h(t5.INFO, "Tracing is disabled and app start profiling will not start.", new Object[0]);
                                return;
                            }
                            if (file.createNewFile()) {
                                u4 u4Var = new u4(w6Var, w6Var.isEnableAppStartProfiling() ? w6Var.getInternalTracesSampler().a(new y(new s7("app.launch", "profile"), 3, Double.valueOf(io.sentry.util.m.a().c()))) : new r7(Boolean.FALSE, null));
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                try {
                                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, t4.e));
                                    try {
                                        w6Var.getSerializer().a(u4Var, bufferedWriter);
                                        bufferedWriter.close();
                                        fileOutputStream.close();
                                        return;
                                    } finally {
                                        try {
                                            break;
                                        } catch (Throwable th) {
                                        }
                                    }
                                } finally {
                                    try {
                                        break;
                                    } catch (Throwable th2) {
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        w6Var.getLogger().d(t5.ERROR, "Unable to create app start profiling config file. ", th3);
                        return;
                    }
                }
                return;
            case 2:
                for (b1 b1Var : w6Var.getOptionsObservers()) {
                    String release = w6Var.getRelease();
                    io.sentry.cache.e eVar = (io.sentry.cache.e) b1Var;
                    if (release == null) {
                        eVar.a("release.json");
                    } else {
                        eVar.b("release.json", release);
                    }
                    String proguardUuid = w6Var.getProguardUuid();
                    io.sentry.cache.e eVar2 = (io.sentry.cache.e) b1Var;
                    if (proguardUuid == null) {
                        eVar2.a("proguard-uuid.json");
                    } else {
                        eVar2.b("proguard-uuid.json", proguardUuid);
                    }
                    io.sentry.protocol.u sdkVersion = w6Var.getSdkVersion();
                    if (sdkVersion == null) {
                        eVar2.a("sdk-version.json");
                    } else {
                        eVar2.b("sdk-version.json", sdkVersion);
                    }
                    String dist = w6Var.getDist();
                    if (dist == null) {
                        eVar2.a("dist.json");
                    } else {
                        eVar2.b("dist.json", dist);
                    }
                    String environment = w6Var.getEnvironment();
                    if (environment == null) {
                        eVar2.a("environment.json");
                    } else {
                        eVar2.b("environment.json", environment);
                    }
                    eVar2.b("tags.json", w6Var.getTags());
                    Double d = w6Var.getSessionReplay().e;
                    if (d == null) {
                        eVar2.a("replay-error-sample-rate.json");
                    } else {
                        eVar2.b("replay-error-sample-rate.json", d.toString());
                    }
                }
                io.sentry.cache.g gVarFindPersistingScopeObserver = w6Var.findPersistingScopeObserver();
                if (gVarFindPersistingScopeObserver != null) {
                    try {
                        ((io.sentry.cache.tape.g) gVarFindPersistingScopeObserver.b.a()).clear();
                        break;
                    } catch (IOException e) {
                        gVarFindPersistingScopeObserver.a.getLogger().d(t5.ERROR, "Failed to clear breadcrumbs from file queue", e);
                    }
                    gVarFindPersistingScopeObserver.a("user.json");
                    gVarFindPersistingScopeObserver.a("level.json");
                    gVarFindPersistingScopeObserver.a("request.json");
                    gVarFindPersistingScopeObserver.a("fingerprint.json");
                    gVarFindPersistingScopeObserver.a("contexts.json");
                    gVarFindPersistingScopeObserver.a("extras.json");
                    gVarFindPersistingScopeObserver.a("tags.json");
                    gVarFindPersistingScopeObserver.a("trace.json");
                    gVarFindPersistingScopeObserver.a("transaction.json");
                    return;
                }
                return;
            default:
                t4.f(w6Var.getFlushTimeoutMillis());
                return;
        }
    }
}
