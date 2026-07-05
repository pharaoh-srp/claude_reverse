package io.sentry.hints;

import io.sentry.a1;
import io.sentry.protocol.w;
import io.sentry.t5;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements f {
    public final CountDownLatch E = new CountDownLatch(1);
    public final long F;
    public final a1 G;

    public c(long j, a1 a1Var) {
        this.F = j;
        this.G = a1Var;
    }

    @Override // io.sentry.hints.f
    public final boolean d() {
        try {
            return this.E.await(this.F, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.G.d(t5.ERROR, "Exception while awaiting for flush in BlockingFlushHint", e);
            return false;
        }
    }

    public abstract boolean f(w wVar);

    public abstract void g(w wVar);
}
