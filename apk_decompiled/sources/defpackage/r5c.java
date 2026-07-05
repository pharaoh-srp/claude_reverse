package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class r5c implements Iterator {
    public c5c E;
    public c5c F;
    public c5c G;
    public c5c H;
    public c5c I;
    public final Class J;

    public r5c(c5c c5cVar, Class cls) {
        this.J = cls;
        if (cls.isInstance(c5cVar)) {
            this.F = c5cVar;
        }
        this.G = c5cVar;
        this.H = c5cVar;
        this.E = c5cVar;
        this.I = c5cVar.G();
    }

    public final void a() {
        c5c c5cVar;
        if (this.F != null) {
            return;
        }
        if (this.I != null && this.G.E == null) {
            this.G = this.H;
        }
        c5c c5cVarG = this.G;
        loop0: while (true) {
            c5cVar = null;
            if (c5cVarG.o() > 0) {
                c5cVarG = c5cVarG.m(0);
            } else {
                c5c c5cVar2 = this.E;
                c5cVar2.getClass();
                if (c5cVar2 == c5cVarG) {
                    c5cVarG = null;
                } else if (c5cVarG.z() != null) {
                    c5cVarG = c5cVarG.z();
                } else {
                    do {
                        c5cVarG = c5cVarG.G();
                        if (c5cVarG == null) {
                            break loop0;
                        }
                        c5c c5cVar3 = this.E;
                        c5cVar3.getClass();
                        if (c5cVar3 == c5cVarG) {
                            break loop0;
                        }
                    } while (c5cVarG.z() == null);
                    c5cVarG = c5cVarG.z();
                }
            }
            if (c5cVarG == null) {
                break;
            } else if (this.J.isInstance(c5cVarG)) {
                c5cVar = c5cVarG;
                break;
            }
        }
        this.F = c5cVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.F != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        c5c c5cVar = this.F;
        if (c5cVar == null) {
            pmf.d();
            return null;
        }
        this.H = this.G;
        this.G = c5cVar;
        this.I = c5cVar.G();
        this.F = null;
        return c5cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.G.J();
    }
}
