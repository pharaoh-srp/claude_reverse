package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class d8a extends f3 implements RandomAccess, Serializable {
    public static final d8a H;
    public Object[] E;
    public int F;
    public boolean G;

    static {
        d8a d8aVar = new d8a(0);
        d8aVar.G = true;
        H = d8aVar;
    }

    public d8a(int i) {
        if (i >= 0) {
            this.E = new Object[i];
        } else {
            sz6.p("capacity must be non-negative.");
            throw null;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        h();
        e2 e2Var = i2.Companion;
        int i2 = this.F;
        e2Var.getClass();
        e2.c(i, i2);
        ((AbstractList) this).modCount++;
        k(i, 1);
        this.E[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        h();
        e2 e2Var = i2.Companion;
        int i2 = this.F;
        e2Var.getClass();
        e2.c(i, i2);
        int size = collection.size();
        e(i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        m(0, this.F);
    }

    public final void e(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        k(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.E[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.E;
            int i = this.F;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (x44.r(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void g(int i, Object obj) {
        ((AbstractList) this).modCount++;
        k(i, 1);
        this.E[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        e2 e2Var = i2.Companion;
        int i2 = this.F;
        e2Var.getClass();
        e2.b(i, i2);
        return this.E[i];
    }

    @Override // defpackage.f3
    public final int getSize() {
        return this.F;
    }

    public final void h() {
        if (this.G) {
            mr9.x();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.E;
        int i = this.F;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.F; i++) {
            if (x44.r(this.E[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.F == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void k(int i, int i2) {
        int i3 = this.F + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.E;
        if (i3 > objArr.length) {
            e2 e2Var = i2.Companion;
            int length = objArr.length;
            e2Var.getClass();
            int iE = e2.e(length, i3);
            Object[] objArr2 = this.E;
            objArr2.getClass();
            this.E = Arrays.copyOf(objArr2, iE);
        }
        Object[] objArr3 = this.E;
        mp0.s0(i + i2, i, this.F, objArr3, objArr3);
        this.F += i2;
    }

    public final Object l(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.E;
        Object obj = objArr[i];
        mp0.s0(i, i + 1, this.F, objArr, objArr);
        Object[] objArr2 = this.E;
        int i2 = this.F - 1;
        objArr2.getClass();
        objArr2[i2] = null;
        this.F--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.F - 1; i >= 0; i--) {
            if (x44.r(this.E[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        e2 e2Var = i2.Companion;
        int i2 = this.F;
        e2Var.getClass();
        e2.c(i, i2);
        return new c8a(this, i);
    }

    public final void m(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.E;
        mp0.s0(i, i + i2, this.F, objArr, objArr);
        Object[] objArr2 = this.E;
        int i3 = this.F;
        csg.K(objArr2, i3 - i2, i3);
        this.F -= i2;
    }

    public final int o(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.E;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = this.E;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        mp0.s0(i + i4, i2 + i, this.F, objArr, objArr);
        Object[] objArr3 = this.E;
        int i7 = this.F;
        csg.K(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.F -= i6;
        return i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
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
        h();
        return o(0, this.F, collection, false) > 0;
    }

    @Override // defpackage.f3
    public final Object removeAt(int i) {
        h();
        e2 e2Var = i2.Companion;
        int i2 = this.F;
        e2Var.getClass();
        e2.b(i, i2);
        return l(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        h();
        return o(0, this.F, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        h();
        e2 e2Var = i2.Companion;
        int i2 = this.F;
        e2Var.getClass();
        e2.b(i, i2);
        Object[] objArr = this.E;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        e2 e2Var = i2.Companion;
        int i3 = this.F;
        e2Var.getClass();
        e2.d(i, i2, i3);
        return new b8a(this.E, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.F;
        Object[] objArr2 = this.E;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        mp0.s0(0, 0, i, objArr2, objArr);
        int i2 = this.F;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return csg.l(this.E, 0, this.F, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h();
        int i = this.F;
        ((AbstractList) this).modCount++;
        k(i, 1);
        this.E[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        h();
        int size = collection.size();
        e(this.F, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return mp0.y0(this.E, 0, this.F);
    }
}
