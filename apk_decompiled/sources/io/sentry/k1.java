package io.sentry;

import defpackage.lf5;

/* JADX INFO: loaded from: classes.dex */
public interface k1 {
    void a(boolean z);

    void b(long j);

    void c(h7 h7Var, n0 n0Var);

    io.sentry.protocol.w d(y6 y6Var, f1 f1Var, n0 n0Var);

    io.sentry.protocol.w e(io.sentry.protocol.e0 e0Var, p7 p7Var, f1 f1Var, n0 n0Var, y3 y3Var);

    io.sentry.protocol.w f(io.sentry.protocol.k kVar, f1 f1Var);

    lf5 g();

    default boolean h() {
        return true;
    }

    io.sentry.protocol.w i(j5 j5Var, f1 f1Var, n0 n0Var);

    boolean isEnabled();

    io.sentry.protocol.w k(io.sentry.internal.debugmeta.c cVar, n0 n0Var);

    io.sentry.protocol.w n(v3 v3Var);
}
