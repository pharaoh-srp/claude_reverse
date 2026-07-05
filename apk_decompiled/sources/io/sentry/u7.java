package io.sentry;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class u7 extends io.sentry.hints.c implements io.sentry.hints.i, io.sentry.hints.l {
    public final AtomicReference H;

    public u7(long j, a1 a1Var) {
        super(j, a1Var);
        this.H = new AtomicReference();
    }

    @Override // io.sentry.hints.c
    public final boolean f(io.sentry.protocol.w wVar) {
        io.sentry.protocol.w wVar2 = (io.sentry.protocol.w) this.H.get();
        return wVar2 != null && wVar2.equals(wVar);
    }

    @Override // io.sentry.hints.c
    public final void g(io.sentry.protocol.w wVar) {
        this.H.set(wVar);
    }
}
