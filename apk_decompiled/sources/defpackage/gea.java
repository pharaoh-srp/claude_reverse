package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
public final class gea implements Collection, mm9 {
    public static final gea G = new gea(lm6.E);
    public final List E;
    public final int F;

    public gea(String str) {
        List listY0 = bsg.Y0(str, new String[]{","}, 6);
        ArrayList arrayList = new ArrayList(listY0.size());
        int size = listY0.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(bsg.k1((String) listY0.get(i)).toString());
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList2.add(new eea((String) arrayList.get(i2)));
        }
        this(arrayList2);
    }

    public final eea a() {
        return (eea) this.E.get(0);
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof eea)) {
            return false;
        }
        return this.E.contains((eea) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.E.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gea) {
            return x44.r(this.E, ((gea) obj).E);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.E.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.E.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.F;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return dch.T(this);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.E + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return dch.U(this, objArr);
    }

    public gea(List list) {
        this.E = list;
        this.F = list.size();
    }
}
