package io.sentry;

import defpackage.lf5;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v2 implements w0, b4, s1, t1 {
    public static final v2 E = new v2();
    public static final v2 F = new v2();
    public static final v2 G = new v2();

    @Override // io.sentry.b4
    public void K() {
    }

    @Override // io.sentry.b4
    /* JADX INFO: renamed from: P */
    public a4 getR() {
        return b3.a;
    }

    @Override // io.sentry.t1
    public io.sentry.transport.f a(w6 w6Var, y yVar) {
        return new io.sentry.transport.b(w6Var, new lf5(w6Var), w6Var.getTransportGate(), yVar);
    }

    @Override // io.sentry.s1
    public void b(r1 r1Var) {
    }

    @Override // io.sentry.b4
    public void c(Boolean bool) {
    }

    @Override // io.sentry.s1
    public void close() {
    }

    @Override // io.sentry.s1
    public y3 d(f7 f7Var, List list, w6 w6Var) {
        return null;
    }

    @Override // io.sentry.b4
    public void f() {
    }

    @Override // io.sentry.b4
    public void i(io.sentry.protocol.w wVar) {
    }

    @Override // io.sentry.s1
    public boolean isRunning() {
        return false;
    }

    @Override // io.sentry.b4
    public void j(io.sentry.android.replay.d dVar) {
    }

    @Override // io.sentry.b4
    public io.sentry.protocol.w n() {
        return io.sentry.protocol.w.F;
    }

    @Override // io.sentry.s1
    public void start() {
    }

    @Override // io.sentry.b4
    public void stop() {
    }

    @Override // io.sentry.b4
    public void x() {
    }
}
