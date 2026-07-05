package defpackage;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class c8a implements ListIterator, mm9 {
    public int F;
    public int H;
    public final Object I;
    public final /* synthetic */ int E = 0;
    public int G = -1;

    public c8a(kdg kdgVar, int i) {
        this.I = kdgVar;
        this.F = i - 1;
        this.H = oq5.E(kdgVar);
    }

    public void a() {
        if (((AbstractList) ((d8a) this.I)).modCount == this.H) {
            return;
        }
        sz6.c();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.E;
        Object obj2 = this.I;
        switch (i) {
            case 0:
                a();
                d8a d8aVar = (d8a) obj2;
                int i2 = this.F;
                this.F = i2 + 1;
                d8aVar.add(i2, obj);
                this.G = -1;
                this.H = ((AbstractList) d8aVar).modCount;
                break;
            default:
                c();
                kdg kdgVar = (kdg) obj2;
                kdgVar.add(this.F + 1, obj);
                this.G = -1;
                this.F++;
                this.H = oq5.E(kdgVar);
                break;
        }
    }

    public void c() {
        if (oq5.E((kdg) this.I) == this.H) {
            return;
        }
        sz6.c();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.E;
        Object obj = this.I;
        switch (i) {
            case 0:
                if (this.F < ((d8a) obj).F) {
                }
                break;
            default:
                if (this.F < ((kdg) obj).size() - 1) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.E) {
            case 0:
                if (this.F > 0) {
                }
                break;
            default:
                if (this.F >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.E;
        Object obj = this.I;
        switch (i) {
            case 0:
                a();
                int i2 = this.F;
                d8a d8aVar = (d8a) obj;
                if (i2 >= d8aVar.F) {
                    pmf.d();
                    return null;
                }
                this.F = i2 + 1;
                this.G = i2;
                return d8aVar.E[i2];
            default:
                c();
                int i3 = this.F + 1;
                this.G = i3;
                kdg kdgVar = (kdg) obj;
                oq5.o(i3, kdgVar.size());
                Object obj2 = kdgVar.get(i3);
                this.F = i3;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.E) {
            case 0:
                return this.F;
            default:
                return this.F + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.E;
        Object obj = this.I;
        switch (i) {
            case 0:
                a();
                int i2 = this.F;
                if (i2 <= 0) {
                    pmf.d();
                    return null;
                }
                int i3 = i2 - 1;
                this.F = i3;
                this.G = i3;
                return ((d8a) obj).E[i3];
            default:
                c();
                kdg kdgVar = (kdg) obj;
                oq5.o(this.F, kdgVar.size());
                int i4 = this.F;
                this.G = i4;
                this.F--;
                return kdgVar.get(i4);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.E) {
            case 0:
                return this.F - 1;
            default:
                return this.F;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.E;
        Object obj = this.I;
        switch (i) {
            case 0:
                d8a d8aVar = (d8a) obj;
                a();
                int i2 = this.G;
                if (i2 == -1) {
                    sz6.j("Call next() or previous() before removing element from the iterator.");
                } else {
                    d8aVar.removeAt(i2);
                    this.F = this.G;
                    this.G = -1;
                    this.H = ((AbstractList) d8aVar).modCount;
                }
                break;
            default:
                c();
                kdg kdgVar = (kdg) obj;
                kdgVar.remove(this.G);
                this.F--;
                this.G = -1;
                this.H = oq5.E(kdgVar);
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.E;
        Object obj2 = this.I;
        switch (i) {
            case 0:
                a();
                int i2 = this.G;
                if (i2 == -1) {
                    sz6.j("Call next() or previous() before replacing element from the iterator.");
                } else {
                    ((d8a) obj2).set(i2, obj);
                }
                break;
            default:
                kdg kdgVar = (kdg) obj2;
                c();
                int i3 = this.G;
                if (i3 < 0) {
                    sz6.j("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                } else {
                    kdgVar.set(i3, obj);
                    this.H = oq5.E(kdgVar);
                }
                break;
        }
    }

    public c8a(d8a d8aVar, int i) {
        this.I = d8aVar;
        this.F = i;
        this.H = ((AbstractList) d8aVar).modCount;
    }
}
