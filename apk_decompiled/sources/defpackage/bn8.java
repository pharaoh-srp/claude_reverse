package defpackage;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class bn8 implements ListIterator, mm9 {
    public final /* synthetic */ int E;
    public int F;
    public int G;
    public int H;
    public final Object I;

    public bn8(b8a b8aVar, int i) {
        this.E = 1;
        this.I = b8aVar;
        this.F = i;
        this.G = -1;
        this.H = ((AbstractList) b8aVar).modCount;
    }

    public void a() {
        if (((AbstractList) ((b8a) this.I).I).modCount == this.H) {
            return;
        }
        sz6.c();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.E) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                a();
                b8a b8aVar = (b8a) this.I;
                int i = this.F;
                this.F = i + 1;
                b8aVar.add(i, obj);
                this.G = -1;
                this.H = ((AbstractList) b8aVar).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.E) {
            case 0:
                if (this.F < this.H) {
                }
                break;
            default:
                if (this.F < ((b8a) this.I).G) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.E) {
            case 0:
                if (this.F > this.G) {
                }
                break;
            default:
                if (this.F > 0) {
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
                qvb qvbVar = ((dn8) obj).E;
                int i2 = this.F;
                this.F = i2 + 1;
                Object objF = qvbVar.f(i2);
                objF.getClass();
                return (hqb) objF;
            default:
                a();
                int i3 = this.F;
                b8a b8aVar = (b8a) obj;
                if (i3 >= b8aVar.G) {
                    pmf.d();
                    return null;
                }
                this.F = i3 + 1;
                this.G = i3;
                return b8aVar.E[b8aVar.F + i3];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.E) {
            case 0:
                return this.F - this.G;
            default:
                return this.F;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.E;
        Object obj = this.I;
        switch (i) {
            case 0:
                qvb qvbVar = ((dn8) obj).E;
                int i2 = this.F - 1;
                this.F = i2;
                Object objF = qvbVar.f(i2);
                objF.getClass();
                return (hqb) objF;
            default:
                a();
                int i3 = this.F;
                if (i3 <= 0) {
                    pmf.d();
                    return null;
                }
                int i4 = i3 - 1;
                this.F = i4;
                this.G = i4;
                b8a b8aVar = (b8a) obj;
                return b8aVar.E[b8aVar.F + i4];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.E) {
            case 0:
                return (this.F - this.G) - 1;
            default:
                return this.F - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.E) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                b8a b8aVar = (b8a) this.I;
                a();
                int i = this.G;
                if (i == -1) {
                    sz6.j("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                b8aVar.removeAt(i);
                this.F = this.G;
                this.G = -1;
                this.H = ((AbstractList) b8aVar).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.E) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                a();
                int i = this.G;
                if (i != -1) {
                    ((b8a) this.I).set(i, obj);
                    return;
                } else {
                    sz6.j("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
        }
    }

    public bn8(dn8 dn8Var, int i, int i2, int i3) {
        this.E = 0;
        this.I = dn8Var;
        this.F = i;
        this.G = i2;
        this.H = i3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bn8(dn8 dn8Var, int i, int i2) {
        this(dn8Var, (i2 & 1) != 0 ? 0 : i, 0, dn8Var.E.b);
        this.E = 0;
    }
}
