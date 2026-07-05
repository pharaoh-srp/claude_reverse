package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static final a b = new a(new AbstractFuture$Failure$1("Failure occurred while trying to finish a future."));
    public final Throwable a;

    public a(Throwable th) {
        th.getClass();
        this.a = th;
    }
}
