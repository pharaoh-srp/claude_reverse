package io.sentry.android.core;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import defpackage.lf5;
import io.sentry.p4;
import io.sentry.t5;
import io.sentry.w6;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i1 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ w6 G;
    public final /* synthetic */ Object H;

    public /* synthetic */ i1(SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration, io.sentry.h1 h1Var, SentryAndroidOptions sentryAndroidOptions) {
        this.E = 2;
        this.F = systemEventsBreadcrumbsIntegration;
        this.H = h1Var;
        this.G = sentryAndroidOptions;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.sentry.v vVarA;
        switch (this.E) {
            case 0:
                SendCachedEnvelopeIntegration sendCachedEnvelopeIntegration = (SendCachedEnvelopeIntegration) this.F;
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.G;
                io.sentry.h1 h1Var = (io.sentry.h1) this.H;
                try {
                    if (sendCachedEnvelopeIntegration.M.get()) {
                        sentryAndroidOptions.getLogger().h(t5.INFO, "SendCachedEnvelopeIntegration, not trying to send after closing.", new Object[0]);
                        return;
                    }
                    if (!sendCachedEnvelopeIntegration.L.getAndSet(true)) {
                        io.sentry.u0 connectionStatusProvider = sentryAndroidOptions.getConnectionStatusProvider();
                        sendCachedEnvelopeIntegration.H = connectionStatusProvider;
                        connectionStatusProvider.h0(sendCachedEnvelopeIntegration);
                        sendCachedEnvelopeIntegration.K = sendCachedEnvelopeIntegration.E.a(h1Var, sentryAndroidOptions);
                    }
                    io.sentry.u0 u0Var = sendCachedEnvelopeIntegration.H;
                    if (u0Var != null && u0Var.e0() == io.sentry.s0.DISCONNECTED) {
                        sentryAndroidOptions.getLogger().h(t5.INFO, "SendCachedEnvelopeIntegration, no connection.", new Object[0]);
                        return;
                    }
                    lf5 lf5VarG = h1Var.g();
                    if (lf5VarG != null && lf5VarG.d(io.sentry.o.All)) {
                        sentryAndroidOptions.getLogger().h(t5.INFO, "SendCachedEnvelopeIntegration, rate limiting active.", new Object[0]);
                        return;
                    }
                    p4 p4Var = sendCachedEnvelopeIntegration.K;
                    if (p4Var == null) {
                        sentryAndroidOptions.getLogger().h(t5.ERROR, "SendCachedEnvelopeIntegration factory is null.", new Object[0]);
                        return;
                    } else {
                        p4Var.a();
                        return;
                    }
                } catch (Throwable th) {
                    sentryAndroidOptions.getLogger().d(t5.ERROR, "Failed trying to send cached events.", th);
                    return;
                }
            case 1:
                EnvelopeFileObserverIntegration envelopeFileObserverIntegration = (EnvelopeFileObserverIntegration) this.F;
                w6 w6Var = this.G;
                String str = (String) this.H;
                vVarA = envelopeFileObserverIntegration.H.a();
                try {
                    if (!envelopeFileObserverIntegration.G) {
                        envelopeFileObserverIntegration.c(w6Var, str);
                        break;
                    }
                    vVarA.close();
                    return;
                } finally {
                    try {
                        vVarA.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            default:
                SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration = (SystemEventsBreadcrumbsIntegration) this.F;
                io.sentry.h1 h1Var2 = (io.sentry.h1) this.H;
                SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) this.G;
                vVarA = systemEventsBreadcrumbsIntegration.O.a();
                try {
                    if (!systemEventsBreadcrumbsIntegration.J && !systemEventsBreadcrumbsIntegration.K && systemEventsBreadcrumbsIntegration.F == null) {
                        systemEventsBreadcrumbsIntegration.F = new z1(systemEventsBreadcrumbsIntegration, h1Var2, sentryAndroidOptions2);
                        if (systemEventsBreadcrumbsIntegration.L == null) {
                            systemEventsBreadcrumbsIntegration.L = new IntentFilter();
                            for (String str2 : systemEventsBreadcrumbsIntegration.I) {
                                systemEventsBreadcrumbsIntegration.L.addAction(str2);
                            }
                        }
                        if (systemEventsBreadcrumbsIntegration.M == null) {
                            systemEventsBreadcrumbsIntegration.M = new HandlerThread("SystemEventsReceiver", 10);
                            systemEventsBreadcrumbsIntegration.M.start();
                        }
                        try {
                            Handler handler = new Handler(systemEventsBreadcrumbsIntegration.M.getLooper());
                            Context context = systemEventsBreadcrumbsIntegration.E;
                            z1 z1Var = systemEventsBreadcrumbsIntegration.F;
                            IntentFilter intentFilter = systemEventsBreadcrumbsIntegration.L;
                            io.sentry.p.v("The ILogger object is required.", sentryAndroidOptions2.getLogger());
                            if (Build.VERSION.SDK_INT >= 33) {
                                context.registerReceiver(z1Var, intentFilter, null, handler, 4);
                            } else {
                                context.registerReceiver(z1Var, intentFilter, null, handler);
                            }
                            if (!systemEventsBreadcrumbsIntegration.N.getAndSet(true)) {
                                sentryAndroidOptions2.getLogger().h(t5.DEBUG, "SystemEventsBreadcrumbsIntegration installed.", new Object[0]);
                                io.sentry.p.a("SystemEventsBreadcrumbs");
                            }
                        } catch (Throwable th3) {
                            sentryAndroidOptions2.setEnableSystemEventBreadcrumbs(false);
                            sentryAndroidOptions2.getLogger().d(t5.ERROR, "Failed to initialize SystemEventsBreadcrumbsIntegration.", th3);
                        }
                        break;
                    }
                    vVarA.close();
                    return;
                } finally {
                }
        }
    }

    public /* synthetic */ i1(Object obj, w6 w6Var, Object obj2, int i) {
        this.E = i;
        this.F = obj;
        this.G = w6Var;
        this.H = obj2;
    }
}
