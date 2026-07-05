package io.sentry.transport;

import defpackage.lf5;
import io.sentry.n0;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public interface f extends Closeable {
    void a(boolean z);

    void b(long j);

    lf5 g();

    default boolean h() {
        return true;
    }

    void m0(io.sentry.internal.debugmeta.c cVar, n0 n0Var);
}
