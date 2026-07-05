package io.sentry.android.core;

/* JADX INFO: loaded from: classes.dex */
public final class a2 extends io.sentry.hints.c implements io.sentry.hints.b, io.sentry.hints.g {
    public final long H;
    public final boolean I;

    public a2(long j, io.sentry.a1 a1Var, long j2, boolean z) {
        super(j, a1Var);
        this.H = j2;
        this.I = z;
    }

    @Override // io.sentry.hints.b
    public final boolean a() {
        return this.I;
    }

    @Override // io.sentry.hints.c
    public final boolean f(io.sentry.protocol.w wVar) {
        return true;
    }

    @Override // io.sentry.hints.c
    public final void g(io.sentry.protocol.w wVar) {
    }
}
