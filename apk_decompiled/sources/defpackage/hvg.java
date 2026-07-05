package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
public final class hvg implements Collection, mm9 {
    public final svb E;

    public hvg() {
        int i = vjc.a;
        this.E = new svb(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        return this.E.a(obj);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        this.E.b();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.E.c(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.E.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.E.g == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        svb svbVar = this.E;
        svbVar.getClass();
        return new vvb(svbVar).iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.E.g(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.E.g(collection);
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.E.i(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.E.g;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return dch.T(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return dch.U(this, objArr);
    }
}
