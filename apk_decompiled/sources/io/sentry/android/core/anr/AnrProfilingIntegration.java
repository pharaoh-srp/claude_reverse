package io.sentry.android.core.anr;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import defpackage.grc;
import defpackage.tui;
import defpackage.y0;
import io.sentry.a1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.c0;
import io.sentry.android.core.f0;
import io.sentry.p;
import io.sentry.t5;
import io.sentry.util.m;
import io.sentry.v;
import io.sentry.w6;
import io.sentry.x1;
import io.sentry.z2;
import java.io.Closeable;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class AnrProfilingIntegration implements x1, Closeable, c0, Runnable {
    public volatile e L;
    public volatile SentryAndroidOptions N;
    public volatile Handler R;
    public volatile Thread S;
    public final AtomicBoolean E = new AtomicBoolean(true);
    public final y0 F = new y0(15, this);
    public final io.sentry.util.a G = new io.sentry.util.a();
    public final io.sentry.util.a H = new io.sentry.util.a();
    public volatile long I = SystemClock.uptimeMillis();
    public final AtomicInteger J = new AtomicInteger();
    public volatile a K = a.IDLE;
    public volatile a1 M = z2.E;
    public volatile Thread O = null;
    public volatile boolean P = false;
    public volatile boolean Q = false;

    public enum a {
        IDLE,
        SUSPICIOUS,
        ANR_DETECTED
    }

    @Override // io.sentry.x1
    public final void H(w6 w6Var) {
        SentryAndroidOptions sentryAndroidOptions = w6Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) w6Var : null;
        p.v("SentryAndroidOptions is required", sentryAndroidOptions);
        this.N = sentryAndroidOptions;
        this.M = w6Var.getLogger();
        if (this.N.isAnrProfilingEnabled()) {
            if (this.N.getCacheDirPath() == null) {
                this.M.h(t5.WARNING, "ANR Profiling is enabled but cacheDirPath is not set", new Object[0]);
                return;
            }
            Looper mainLooper = Looper.getMainLooper();
            this.S = mainLooper.getThread();
            this.R = new Handler(mainLooper);
            p.a("AnrProfiling");
            f0.I.c(this);
        }
    }

    public final void c(Thread thread) {
        long jUptimeMillis = SystemClock.uptimeMillis() - this.I;
        if (jUptimeMillis < 1000) {
            this.K = a.IDLE;
            this.P = false;
        }
        if (this.K == a.IDLE && jUptimeMillis > 1000) {
            a1 a1Var = this.M;
            t5 t5Var = t5.DEBUG;
            if (a1Var.l(t5Var)) {
                this.M.h(t5Var, "ANR: main thread is suspicious", new Object[0]);
            }
            this.K = a.SUSPICIOUS;
            SentryAndroidOptions sentryAndroidOptions = this.N;
            Double anrProfilingSampleRate = sentryAndroidOptions != null ? sentryAndroidOptions.getAnrProfilingSampleRate() : null;
            if (anrProfilingSampleRate != null && m.a().c() < anrProfilingSampleRate.doubleValue()) {
                this.P = true;
            }
            if (this.P) {
                this.J.set(0);
                d().d();
            }
        }
        if (this.P && (this.K == a.SUSPICIOUS || this.K == a.ANR_DETECTED)) {
            if (this.J.get() < 151) {
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                g gVar = new g(System.currentTimeMillis(), thread.getStackTrace());
                long jUptimeMillis3 = SystemClock.uptimeMillis() - jUptimeMillis2;
                a1 a1Var2 = this.M;
                t5 t5Var2 = t5.DEBUG;
                if (a1Var2.l(t5Var2)) {
                    this.M.h(t5Var2, grc.q(jUptimeMillis3, "AnrWatchdog: capturing main thread stacktrace took ", "ms"), new Object[0]);
                }
                if (this.E.get()) {
                    this.J.incrementAndGet();
                    d().c(gVar);
                }
            } else {
                a1 a1Var3 = this.M;
                t5 t5Var3 = t5.DEBUG;
                if (a1Var3.l(t5Var3)) {
                    this.M.h(t5Var3, "ANR: reached maximum number of collected stack traces, skipping further collection", new Object[0]);
                }
            }
        }
        if (this.K != a.SUSPICIOUS || jUptimeMillis <= 4000) {
            return;
        }
        a1 a1Var4 = this.M;
        t5 t5Var4 = t5.DEBUG;
        if (a1Var4.l(t5Var4)) {
            this.M.h(t5Var4, "ANR: main thread ANR threshold reached", new Object[0]);
        }
        this.K = a.ANR_DETECTED;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.E.set(false);
        f0.I.f(this);
        Handler handler = this.R;
        if (handler != null) {
            handler.removeCallbacks(this.F);
        }
        Thread thread = this.O;
        if (thread != null) {
            synchronized (this) {
                notifyAll();
            }
            thread.interrupt();
        }
        SentryAndroidOptions sentryAndroidOptions = this.N;
        v vVarA = this.H.a();
        try {
            e eVar = this.L;
            this.L = null;
            vVarA.close();
            if (sentryAndroidOptions != null) {
                try {
                    sentryAndroidOptions.getExecutorService().submit(new tui(this, 13, eVar));
                } catch (Throwable unused) {
                    this.M.h(t5.WARNING, "Failed to submit AnrProfileManager close", new Object[0]);
                }
            }
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final e d() {
        v vVarA = this.H.a();
        try {
            if (this.L == null) {
                SentryAndroidOptions sentryAndroidOptions = this.N;
                p.v("Options can't be null", sentryAndroidOptions);
                String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
                if (cacheDirPath == null) {
                    throw new IllegalStateException("cacheDirPath is required for ANR profiling");
                }
                File file = new File(cacheDirPath);
                f.b(file);
                this.L = new e(sentryAndroidOptions, new File(file, "anr_profile"));
            }
            e eVar = this.L;
            vVarA.close();
            return eVar;
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.android.core.c0
    public final void i() {
        if (this.E.get()) {
            v vVarA = this.G.a();
            try {
                if (this.Q) {
                    vVarA.close();
                    return;
                }
                this.Q = true;
                this.F.run();
                Thread thread = this.O;
                if (thread != null && thread.isAlive()) {
                    synchronized (this) {
                        notifyAll();
                    }
                }
                if (thread == null || !thread.isAlive()) {
                    Thread thread2 = new Thread(this, "AnrProfilingIntegration");
                    thread2.setDaemon(true);
                    thread2.start();
                    this.O = thread2;
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
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = this.R;
        Thread thread = this.S;
        if (handler == null || thread == null) {
            return;
        }
        while (this.E.get() && !Thread.currentThread().isInterrupted()) {
            try {
                try {
                    if (this.Q) {
                        c(thread);
                        handler.removeCallbacks(this.F);
                        handler.post(this.F);
                        Thread.sleep(66L);
                    } else {
                        synchronized (this) {
                            while (!this.Q && this.E.get()) {
                                try {
                                    wait();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        this.F.run();
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            } catch (Throwable th2) {
                this.M.d(t5.WARNING, "Failed to execute AnrStacktraceIntegration", th2);
                return;
            }
        }
    }

    @Override // io.sentry.android.core.c0
    public final void x() {
        if (this.E.get()) {
            v vVarA = this.G.a();
            try {
                this.Q = false;
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
    }
}
