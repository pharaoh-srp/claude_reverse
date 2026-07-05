package io.sentry.android.core;

import io.sentry.t5;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 implements io.sentry.hints.d, io.sentry.hints.h, io.sentry.hints.k, io.sentry.hints.f {
    public boolean E;
    public boolean F;
    public CountDownLatch G;
    public final long H;
    public final io.sentry.a1 I;

    public w0(long j, io.sentry.a1 a1Var) {
        f();
        this.H = j;
        io.sentry.p.v("ILogger is required.", a1Var);
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

    public final void f() {
        this.G = new CountDownLatch(1);
        this.E = false;
        this.F = false;
    }
}
