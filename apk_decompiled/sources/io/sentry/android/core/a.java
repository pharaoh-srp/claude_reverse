package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Handler;
import android.os.SystemClock;
import defpackage.grc;
import defpackage.pya;
import defpackage.u95;
import io.sentry.exception.ExceptionMechanismException;
import io.sentry.j5;
import io.sentry.t4;
import io.sentry.t5;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Thread {
    public final boolean E;
    public final u95 F;
    public final q0 G;
    public final io.sentry.b2 H;
    public final long I;
    public final long J;
    public final io.sentry.a1 K;
    public volatile long L;
    public final AtomicBoolean M;
    public final Context N;
    public final pya O;

    public a(long j, boolean z, u95 u95Var, io.sentry.a1 a1Var, Context context) {
        io.sentry.b2 b2Var = new io.sentry.b2(5);
        q0 q0Var = new q0();
        super("|ANR-WatchDog|");
        this.L = 0L;
        this.M = new AtomicBoolean(false);
        this.H = b2Var;
        this.J = j;
        this.I = 500L;
        this.E = z;
        this.F = u95Var;
        this.K = a1Var;
        this.G = q0Var;
        this.N = context;
        this.O = new pya(this, b2Var);
        if (j >= 1000) {
            return;
        }
        io.sentry.e0.g("ANRWatchDog: timeoutIntervalMillis has to be at least %d ms", new Object[]{1000L});
        throw null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws IOException {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        this.O.run();
        while (!isInterrupted()) {
            ((Handler) this.G.a).post(this.O);
            try {
                Thread.sleep(this.I);
                this.H.getClass();
                if (SystemClock.uptimeMillis() - this.L > this.J) {
                    if (this.E || !(Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        ActivityManager activityManager = (ActivityManager) this.N.getSystemService("activity");
                        if (activityManager != null) {
                            try {
                                processesInErrorState = activityManager.getProcessesInErrorState();
                            } catch (Throwable th) {
                                this.K.d(t5.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th);
                                processesInErrorState = null;
                            }
                            if (processesInErrorState != null) {
                                Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
                                while (it.hasNext()) {
                                    if (it.next().condition == 2) {
                                    }
                                }
                            }
                        }
                        if (this.M.compareAndSet(false, true)) {
                            ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(grc.r(this.J, " ms.", new StringBuilder("Application Not Responding for at least ")), ((Handler) this.G.a).getLooper().getThread());
                            u95 u95Var = this.F;
                            Object obj = u95Var.G;
                            SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) u95Var.F;
                            a aVar = AnrIntegration.I;
                            sentryAndroidOptions.getLogger().h(t5.INFO, "ANR triggered with message: %s", applicationNotResponding.getMessage());
                            boolean zEquals = Boolean.TRUE.equals(f0.I.H);
                            String strConcat = "ANR for at least " + sentryAndroidOptions.getAnrTimeoutIntervalMillis() + " ms.";
                            if (zEquals) {
                                strConcat = "Background ".concat(strConcat);
                            }
                            Thread thread = applicationNotResponding.E;
                            ApplicationNotResponding applicationNotResponding2 = thread == null ? new ApplicationNotResponding(strConcat) : new ApplicationNotResponding(strConcat, thread);
                            io.sentry.protocol.o oVar = new io.sentry.protocol.o();
                            oVar.E = "ANR";
                            j5 j5Var = new j5(new ExceptionMechanismException(oVar, applicationNotResponding2, thread, true));
                            j5Var.Y = t5.ERROR;
                            t4.g().I(j5Var, io.sentry.util.c.a(new w(zEquals)));
                        }
                    } else {
                        this.K.h(t5.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
                        this.M.set(true);
                    }
                }
            } catch (InterruptedException e) {
                try {
                    Thread.currentThread().interrupt();
                    this.K.h(t5.WARNING, "Interrupted: %s", e.getMessage());
                    return;
                } catch (SecurityException unused) {
                    this.K.h(t5.WARNING, "Failed to interrupt due to SecurityException: %s", e.getMessage());
                    return;
                }
            }
        }
    }
}
