package io.sentry;

import defpackage.lf5;

/* JADX INFO: loaded from: classes.dex */
public interface h1 {
    y0 A();

    void B(j4 j4Var);

    default void C(j4 j4Var) {
        w(j4Var);
    }

    io.sentry.protocol.w D(Exception exc, n0 n0Var);

    io.sentry.protocol.w E(io.sentry.protocol.e0 e0Var, p7 p7Var, n0 n0Var, y3 y3Var);

    h1 F(String str);

    io.sentry.protocol.w G(io.sentry.protocol.k kVar);

    io.sentry.protocol.w H(t5 t5Var);

    io.sentry.protocol.w I(j5 j5Var, n0 n0Var);

    void a(boolean z);

    void b(long j);

    p1 c();

    z0 clone();

    void d(String str, Boolean bool);

    void e(io.sentry.protocol.i0 i0Var);

    void f(String str, String str2);

    lf5 g();

    boolean h();

    void i(Throwable th, i7 i7Var, String str);

    boolean isEnabled();

    void j(g gVar, n0 n0Var);

    io.sentry.protocol.w k(io.sentry.internal.debugmeta.c cVar, n0 n0Var);

    default boolean l() {
        return false;
    }

    void m(g gVar);

    io.sentry.protocol.w n(v3 v3Var);

    io.sentry.protocol.w o(Throwable th, n0 n0Var, j4 j4Var);

    default io.sentry.protocol.w p(io.sentry.protocol.k kVar) {
        return G(kVar);
    }

    void q();

    w6 r();

    r1 s();

    r1 t(s7 s7Var, t7 t7Var);

    void u();

    void v();

    void w(j4 j4Var);

    Boolean x();

    io.sentry.protocol.w y(y6 y6Var, n0 n0Var);

    f1 z();
}
