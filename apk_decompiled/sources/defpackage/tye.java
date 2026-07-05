package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class tye implements uye {
    public final boolean a;
    public final WeakReference b;
    public final long c;
    public final jph d;

    public tye(boolean z, WeakReference weakReference, long j, jph jphVar) {
        this.a = z;
        this.b = weakReference;
        this.c = j;
        this.d = jphVar;
    }

    @Override // defpackage.uye
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.uye
    public final WeakReference b() {
        return this.b;
    }

    @Override // defpackage.uye
    public final jph c() {
        return this.d;
    }

    public final long d() {
        return this.c;
    }
}
