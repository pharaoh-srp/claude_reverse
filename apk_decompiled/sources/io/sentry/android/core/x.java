package io.sentry.android.core;

/* JADX INFO: loaded from: classes.dex */
public final class x extends io.sentry.hints.c implements io.sentry.hints.b, io.sentry.hints.a {
    public final long H;
    public final boolean I;
    public final boolean J;

    public x(long j, io.sentry.a1 a1Var, long j2, boolean z, boolean z2) {
        super(j, a1Var);
        this.H = j2;
        this.I = z;
        this.J = z2;
    }

    @Override // io.sentry.hints.b
    public final boolean a() {
        return this.I;
    }

    @Override // io.sentry.hints.a
    public final Long b() {
        return Long.valueOf(this.H);
    }

    @Override // io.sentry.hints.a
    public final boolean c() {
        return false;
    }

    @Override // io.sentry.hints.a
    public final String e() {
        return this.J ? "anr_background" : "anr_foreground";
    }

    @Override // io.sentry.hints.c
    public final boolean f(io.sentry.protocol.w wVar) {
        return true;
    }

    @Override // io.sentry.hints.c
    public final void g(io.sentry.protocol.w wVar) {
    }
}
