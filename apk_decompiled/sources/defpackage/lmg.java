package defpackage;

import io.sentry.e0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class lmg implements Iterator, mm9 {
    public final pdg E;
    public final Iterator F;
    public Object G;
    public Object H;
    public int I;

    public lmg(pdg pdgVar, Iterator it) {
        this.E = pdgVar;
        this.F = it;
        mmg mmgVar = pdgVar.E;
        mmgVar.getClass();
        this.I = ((mmg) ycg.h(mmgVar)).d;
        this.G = this.H;
        this.H = it.hasNext() ? it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.H != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        mmg mmgVar = this.E.E;
        mmgVar.getClass();
        if (((mmg) ycg.h(mmgVar)).d != this.I) {
            sz6.c();
            return null;
        }
        this.G = this.H;
        Iterator it = this.F;
        this.H = it.hasNext() ? it.next() : null;
        Object obj = this.G;
        if (obj != null) {
            return obj;
        }
        e0.b();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        pdg pdgVar = this.E;
        mmg mmgVar = pdgVar.E;
        mmgVar.getClass();
        if (((mmg) ycg.h(mmgVar)).d != this.I) {
            sz6.c();
            return;
        }
        Object obj = this.G;
        if (obj == null) {
            e0.b();
            return;
        }
        pdgVar.remove(obj);
        this.G = null;
        mmg mmgVar2 = pdgVar.E;
        mmgVar2.getClass();
        this.I = ((mmg) ycg.h(mmgVar2)).d;
    }
}
