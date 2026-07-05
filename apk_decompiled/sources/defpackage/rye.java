package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class rye implements uye {
    public final boolean a;
    public final WeakReference b;
    public final long c;
    public final jph d;

    public rye(boolean z, WeakReference weakReference, long j, jph jphVar) {
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
}
