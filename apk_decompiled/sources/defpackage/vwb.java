package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class vwb implements List, om9 {
    public final wwb E;

    public vwb(wwb wwbVar) {
        this.E = wwbVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.E.b(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        wwb wwbVar = this.E;
        return wwbVar.f(wwbVar.G, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.E.h();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.E.i(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.E.i(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        xwb.a(i, this);
        return this.E.E[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.E.k(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.E.G == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new nvb(0, 1, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        wwb wwbVar = this.E;
        Object[] objArr = wwbVar.E;
        for (int i = wwbVar.G - 1; i >= 0; i--) {
            if (x44.r(obj, objArr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new nvb(0, 1, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        xwb.a(i, this);
        return this.E.m(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        wwb wwbVar = this.E;
        int i = wwbVar.G;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            wwbVar.l(it.next());
        }
        return i != wwbVar.G;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        wwb wwbVar = this.E;
        int i = wwbVar.G;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(wwbVar.E[i2])) {
                wwbVar.m(i2);
            }
        }
        return i != wwbVar.G;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        xwb.a(i, this);
        Object[] objArr = this.E.E;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.E.G;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        xwb.b(i, i2, this);
        return new pvb(this, i, i2, 1);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return dch.T(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return dch.U(this, objArr);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.E.a(i, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new nvb(i, 1, this);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.E.f(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.E.l(obj);
    }
}
