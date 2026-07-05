package defpackage;

import io.sentry.e0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class g7a implements Iterator {
    public i7a E;
    public i7a F = null;
    public int G;
    public final /* synthetic */ j7a H;
    public final /* synthetic */ int I;

    public g7a(j7a j7aVar, int i) {
        this.I = i;
        this.H = j7aVar;
        this.E = j7aVar.G.H;
        this.G = j7aVar.I;
    }

    public final Object a() {
        return b();
    }

    public final i7a b() {
        i7a i7aVar = this.E;
        j7a j7aVar = this.H;
        if (i7aVar == j7aVar.G) {
            pmf.d();
            return null;
        }
        if (j7aVar.I != this.G) {
            sz6.c();
            return null;
        }
        this.E = i7aVar.H;
        this.F = i7aVar;
        return i7aVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.E != this.H.G;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.I) {
            case 1:
                return b().J;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        i7a i7aVar = this.F;
        if (i7aVar == null) {
            e0.b();
            return;
        }
        j7a j7aVar = this.H;
        j7aVar.d(i7aVar, true);
        this.F = null;
        this.G = j7aVar.I;
    }
}
