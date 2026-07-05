package io.sentry;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
public final class h3 implements l1 {
    public static final h3 a = new h3();

    @Override // io.sentry.l1
    public final void a(long j) {
    }

    @Override // io.sentry.l1
    public final void b() {
    }

    @Override // io.sentry.l1
    public final Future c(Runnable runnable, long j) {
        return new FutureTask(new o0(1));
    }

    @Override // io.sentry.l1
    public final boolean isClosed() {
        return false;
    }

    @Override // io.sentry.l1
    public final Future submit(Runnable runnable) {
        return new FutureTask(new o0(1));
    }
}
