package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes.dex */
public final class dn8 implements List, mm9 {
    public final qvb E = new qvb(16);
    public final dvb F = new dvb(16);
    public int G = -1;

    public final long a() {
        long jA = rsk.a(Float.POSITIVE_INFINITY, false, false);
        int i = this.G + 1;
        int i2 = this.E.b - 1;
        if (i <= i2) {
            while (true) {
                long jB = this.F.b(i);
                if (dtj.e(jB, jA) < 0) {
                    jA = jB;
                }
                if ((dtj.h(jA) < MTTypesetterKt.kLineSkipLimitMultiplier && dtj.j(jA)) || i == i2) {
                    break;
                }
                i++;
            }
        }
        return jA;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.G = -1;
        this.E.d();
        this.F.b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof hqb) && indexOf((hqb) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((hqb) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void e(int i, int i2) {
        if (i >= i2) {
            return;
        }
        this.E.l(i, i2);
        dvb dvbVar = this.F;
        if (i >= 0) {
            int i3 = dvbVar.b;
            if (i <= i3 && i2 >= 0 && i2 <= i3) {
                if (i2 < i) {
                    gtk.f("The end index must be < start index");
                    throw null;
                }
                if (i2 != i) {
                    if (i2 < i3) {
                        long[] jArr = dvbVar.a;
                        mp0.t0(jArr, jArr, i, i2, i3);
                    }
                    dvbVar.b -= i2 - i;
                    return;
                }
                return;
            }
        } else {
            dvbVar.getClass();
        }
        gtk.h("Index must be between 0 and size");
        throw null;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object objF = this.E.f(i);
        objF.getClass();
        return (hqb) objF;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof hqb)) {
            return -1;
        }
        hqb hqbVar = (hqb) obj;
        int size = size() - 1;
        if (size >= 0) {
            int i = 0;
            while (!x44.r(this.E.f(i), hqbVar)) {
                if (i != size) {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.E.h();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new bn8(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof hqb)) {
            return -1;
        }
        hqb hqbVar = (hqb) obj;
        for (int size = size() - 1; -1 < size; size--) {
            if (x44.r(this.E.f(size), hqbVar)) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new bn8(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.E.b;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return new cn8(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return dch.T(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return dch.U(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new bn8(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
