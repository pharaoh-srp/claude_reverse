package io.sentry;

import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements io.sentry.hints.d, io.sentry.hints.h, io.sentry.hints.k, io.sentry.hints.f {
    public boolean E = false;
    public boolean F = false;
    public final CountDownLatch G = new CountDownLatch(1);
    public final long H;
    public final a1 I;
    public final String J;
    public final Queue K;

    public a0(long j, a1 a1Var, String str, o7 o7Var) {
        this.H = j;
        this.J = str;
        this.K = o7Var;
        this.I = a1Var;
    }

    @Override // io.sentry.hints.h
    public final boolean a() {
        return this.E;
    }

    @Override // io.sentry.hints.k
    public final void b(boolean z) {
        this.F = z;
        this.G.countDown();
    }

    @Override // io.sentry.hints.h
    public final void c(boolean z) {
        this.E = z;
    }

    @Override // io.sentry.hints.f
    public final boolean d() {
        try {
            return this.G.await(this.H, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.I.d(t5.ERROR, "Exception while awaiting on lock.", e);
            return false;
        }
    }

    @Override // io.sentry.hints.k
    public final boolean e() {
        return this.F;
    }
}
