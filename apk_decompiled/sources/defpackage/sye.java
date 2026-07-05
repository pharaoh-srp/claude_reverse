package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class sye implements uye {
    public final boolean a;
    public final WeakReference b;
    public final jph c;

    public sye(boolean z, WeakReference weakReference, jph jphVar) {
        this.a = z;
        this.b = weakReference;
        this.c = jphVar;
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
        return this.c;
    }
}
