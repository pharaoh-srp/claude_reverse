package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zo0 implements Collection {
    public final /* synthetic */ bp0 E;

    public zo0(bp0 bp0Var) {
        this.E = bp0Var;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.E.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.E.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.E.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new wo0(this.E, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        bp0 bp0Var = this.E;
        int iA = bp0Var.a(obj);
        if (iA < 0) {
            return false;
        }
        bp0Var.g(iA);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        bp0 bp0Var = this.E;
        int i = bp0Var.G;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(bp0Var.i(i2))) {
                bp0Var.g(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        bp0 bp0Var = this.E;
        int i = bp0Var.G;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(bp0Var.i(i2))) {
                bp0Var.g(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.E.G;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        bp0 bp0Var = this.E;
        int i = bp0Var.G;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = bp0Var.i(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        bp0 bp0Var = this.E;
        int i = bp0Var.G;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = bp0Var.i(i2);
        }
        return objArr;
    }
}
