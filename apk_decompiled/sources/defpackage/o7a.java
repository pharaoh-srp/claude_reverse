package defpackage;

import io.sentry.e0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class o7a implements Iterator {
    public p7a E;
    public p7a F = null;
    public int G;
    public final /* synthetic */ q7a H;

    public o7a(q7a q7aVar) {
        this.H = q7aVar;
        this.E = q7aVar.J.H;
        this.G = q7aVar.I;
    }

    public final p7a a() {
        p7a p7aVar = this.E;
        q7a q7aVar = this.H;
        if (p7aVar == q7aVar.J) {
            pmf.d();
            return null;
        }
        if (q7aVar.I != this.G) {
            sz6.c();
            return null;
        }
        this.E = p7aVar.H;
        this.F = p7aVar;
        return p7aVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.E != this.H.J;
    }

    @Override // java.util.Iterator
    public Object next() {
        return a();
    }

    @Override // java.util.Iterator
    public final void remove() {
        p7a p7aVar = this.F;
        if (p7aVar == null) {
            e0.b();
            return;
        }
        q7a q7aVar = this.H;
        q7aVar.d(p7aVar, true);
        this.F = null;
        this.G = q7aVar.I;
    }
}
