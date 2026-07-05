package io.sentry;

import defpackage.mr5;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 {
    public static volatile q0 g;
    public static final io.sentry.util.a h = new io.sentry.util.a();
    public final long a;
    public volatile String b;
    public volatile long c;
    public final AtomicBoolean d;
    public final o0 e;
    public final ExecutorService f;

    public q0() {
        o0 o0Var = new o0(0);
        this.d = new AtomicBoolean(false);
        this.f = Executors.newSingleThreadExecutor(new p0(0));
        this.a = 18000000L;
        this.e = o0Var;
        d();
    }

    public static q0 c() {
        if (g == null) {
            v vVarA = h.a();
            try {
                if (g == null) {
                    g = new q0();
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
        return g;
    }

    public final void a() {
        this.f.shutdown();
    }

    public final String b() {
        if (this.c < System.currentTimeMillis() && this.d.compareAndSet(false, true)) {
            d();
        }
        return this.b;
    }

    public final void d() {
        try {
            this.f.submit(new mr5(4, this)).get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            this.c = System.currentTimeMillis() + 1000;
        } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
            this.c = System.currentTimeMillis() + 1000;
        }
    }
}
