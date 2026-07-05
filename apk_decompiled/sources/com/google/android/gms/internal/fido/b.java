package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public final Object a;

    public b(Object obj) {
        this.a = obj;
    }

    public final Object a() {
        if (a.b == null) {
            a.b = new zzag();
        }
        synchronized (a.a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}
