package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class uvb implements Iterator, mm9 {
    public final /* synthetic */ int E;
    public int F;
    public final Iterator G;
    public final /* synthetic */ Object H;

    public uvb(iwb iwbVar) {
        this.E = 1;
        this.H = iwbVar;
        this.F = -1;
        this.G = yb5.v(new hwb(iwbVar, this, null));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.E;
        Iterator it = this.G;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            default:
                yug yugVar = (yug) this.H;
                while (this.F < yugVar.b && it.hasNext()) {
                    it.next();
                    this.F++;
                }
                if (this.F >= yugVar.c || !it.hasNext()) {
                }
                break;
        }
        return ((zmf) it).hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.E;
        Iterator it = this.G;
        switch (i) {
            case 0:
                return ((zmf) it).next();
            case 1:
                return ((zmf) it).next();
            default:
                yug yugVar = (yug) this.H;
                while (this.F < yugVar.b && it.hasNext()) {
                    it.next();
                    this.F++;
                }
                int i2 = this.F;
                if (i2 < yugVar.c) {
                    this.F = i2 + 1;
                    return it.next();
                }
                pmf.d();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.E;
        Object obj = this.H;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 != -1) {
                    ((vvb) obj).F.h(i2);
                    this.F = -1;
                    return;
                }
                return;
            case 1:
                int i3 = this.F;
                if (i3 != -1) {
                    ((iwb) obj).F.n(i3);
                    this.F = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public uvb(yug yugVar) {
        this.E = 2;
        this.H = yugVar;
        this.G = yugVar.a.iterator();
    }

    public uvb(vvb vvbVar) {
        this.E = 0;
        this.H = vvbVar;
        this.F = -1;
        this.G = yb5.v(new tvb(vvbVar, this, null));
    }
}
