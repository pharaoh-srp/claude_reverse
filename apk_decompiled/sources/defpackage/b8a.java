package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class b8a extends f3 implements RandomAccess, Serializable {
    public Object[] E;
    public final int F;
    public int G;
    public final b8a H;
    public final d8a I;

    public b8a(Object[] objArr, int i, int i2, b8a b8aVar, d8a d8aVar) {
        objArr.getClass();
        d8aVar.getClass();
        this.E = objArr;
        this.F = i;
        this.G = i2;
        this.H = b8aVar;
        this.I = d8aVar;
        ((AbstractList) this).modCount = ((AbstractList) d8aVar).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        k();
        h();
        e2 e2Var = i2.Companion;
        int i2 = this.G;
        e2Var.getClass();
        e2.c(i, i2);
        g(this.F + i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        k();
        h();
        e2 e2Var = i2.Companion;
        int i2 = this.G;
        e2Var.getClass();
        e2.c(i, i2);
        int size = collection.size();
        e(this.F + i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        k();
        h();
        m(this.F, this.G);
    }

    public final void e(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        d8a d8aVar = this.I;
        b8a b8aVar = this.H;
        if (b8aVar != null) {
            b8aVar.e(i, collection, i2);
        } else {
            d8a d8aVar2 = d8a.H;
            d8aVar.e(i, collection, i2);
        }
        this.E = d8aVar.E;
        this.G += i2;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        h();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.E;
            int i = this.G;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (x44.r(objArr[this.F + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void g(int i, Object obj) {
        ((AbstractList) this).modCount++;
        d8a d8aVar = this.I;
        b8a b8aVar = this.H;
        if (b8aVar != null) {
            b8aVar.g(i, obj);
        } else {
            d8a d8aVar2 = d8a.H;
            d8aVar.g(i, obj);
        }
        this.E = d8aVar.E;
        this.G++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        h();
        e2 e2Var = i2.Companion;
        int i2 = this.G;
        e2Var.getClass();
        e2.b(i, i2);
        return this.E[this.F + i];
    }

    @Override // defpackage.f3
    public final int getSize() {
        h();
        return this.G;
    }

    public final void h() {
        if (((AbstractList) this.I).modCount == ((AbstractList) this).modCount) {
            return;
        }
        sz6.c();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        h();
        Object[] objArr = this.E;
        int i = this.G;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.F + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        h();
        for (int i = 0; i < this.G; i++) {
            if (x44.r(this.E[this.F + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        h();
        return this.G == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void k() {
        if (this.I.G) {
            mr9.x();
        }
    }

    public final Object l(int i) {
        Object objL;
        ((AbstractList) this).modCount++;
        b8a b8aVar = this.H;
        if (b8aVar != null) {
            objL = b8aVar.l(i);
        } else {
            d8a d8aVar = d8a.H;
            objL = this.I.l(i);
        }
        this.G--;
        return objL;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        h();
        for (int i = this.G - 1; i >= 0; i--) {
            if (x44.r(this.E[this.F + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        h();
        e2 e2Var = i2.Companion;
        int i2 = this.G;
        e2Var.getClass();
        e2.c(i, i2);
        return new bn8(this, i);
    }

    public final void m(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        b8a b8aVar = this.H;
        if (b8aVar != null) {
            b8aVar.m(i, i2);
        } else {
            d8a d8aVar = d8a.H;
            this.I.m(i, i2);
        }
        this.G -= i2;
    }

    public final int o(int i, int i2, Collection collection, boolean z) {
        int iO;
        b8a b8aVar = this.H;
        if (b8aVar != null) {
            iO = b8aVar.o(i, i2, collection, z);
        } else {
            d8a d8aVar = d8a.H;
            iO = this.I.o(i, i2, collection, z);
        }
        if (iO > 0) {
            ((AbstractList) this).modCount++;
        }
        this.G -= iO;
        return iO;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        k();
        h();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            removeAt(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        k();
        h();
        return o(this.F, this.G, collection, false) > 0;
    }

    @Override // defpackage.f3
    public final Object removeAt(int i) {
        k();
        h();
        e2 e2Var = i2.Companion;
        int i2 = this.G;
        e2Var.getClass();
        e2.b(i, i2);
        return l(this.F + i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        k();
        h();
        return o(this.F, this.G, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        k();
        h();
        e2 e2Var = i2.Companion;
        int i2 = this.G;
        e2Var.getClass();
        e2.b(i, i2);
        Object[] objArr = this.E;
        int i3 = this.F + i;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        e2 e2Var = i2.Companion;
        int i3 = this.G;
        e2Var.getClass();
        e2.d(i, i2, i3);
        return new b8a(this.E, this.F + i, i2 - i, this, this.I);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        h();
        int length = objArr.length;
        int i = this.G;
        Object[] objArr2 = this.E;
        int i2 = this.F;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        mp0.s0(0, i2, i + i2, objArr2, objArr);
        int i3 = this.G;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        h();
        return csg.l(this.E, this.F, this.G, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        k();
        h();
        g(this.F + this.G, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        k();
        h();
        int size = collection.size();
        e(this.F + this.G, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        h();
        Object[] objArr = this.E;
        int i = this.G;
        int i2 = this.F;
        return mp0.y0(objArr, i2, i + i2);
    }
}
