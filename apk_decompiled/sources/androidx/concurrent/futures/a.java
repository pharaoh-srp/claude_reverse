package androidx.concurrent.futures;

import defpackage.z3;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public final Throwable a;

    static {
        new a(new AbstractResolvableFuture$Failure$1("Failure occurred while trying to finish a future."));
    }

    public a(Throwable th) {
        boolean z = z3.H;
        th.getClass();
        this.a = th;
    }
}
