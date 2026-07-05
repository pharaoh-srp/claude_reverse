package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class o2k extends r0k {
    public static final o2k M;
    public final transient pzj L;

    static {
        fyj fyjVar = pzj.H;
        M = new o2k(e2k.K, w1k.F);
    }

    public o2k(pzj pzjVar, Comparator comparator) {
        super(comparator);
        this.L = pzjVar;
    }

    @Override // defpackage.upj
    public final int a(Object[] objArr) {
        return this.L.a(objArr);
    }

    @Override // defpackage.upj
    public final int b() {
        return this.L.b();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iW = w(obj, true);
        pzj pzjVar = this.L;
        if (iW == pzjVar.size()) {
            return null;
        }
        return pzjVar.get(iW);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.L, obj, this.J) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof r1k) {
            collection = ((r1k) collection).zza();
        }
        Comparator comparator = this.J;
        if (!xpk.g(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        fyj fyjVarListIterator = this.L.listIterator(0);
        Iterator it = collection.iterator();
        if (fyjVarListIterator.hasNext()) {
            Object next = it.next();
            Object next2 = fyjVarListIterator.next();
            while (true) {
                try {
                    int iCompare = comparator.compare(next2, next);
                    if (iCompare >= 0) {
                        if (iCompare != 0) {
                            break;
                        }
                        if (!it.hasNext()) {
                            return true;
                        }
                        next = it.next();
                    } else {
                        if (!fyjVarListIterator.hasNext()) {
                            break;
                        }
                        next2 = fyjVarListIterator.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        }
        return false;
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.L.o().listIterator(0);
    }

    @Override // defpackage.b0k, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            pzj pzjVar = this.L;
            if (pzjVar.size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                Comparator comparator = this.J;
                if (!xpk.g(comparator, set)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    fyj fyjVarListIterator = pzjVar.listIterator(0);
                    while (fyjVarListIterator.hasNext()) {
                        Object next = fyjVarListIterator.next();
                        Object next2 = it.next();
                        if (next2 == null || comparator.compare(next, next2) != 0) {
                        }
                    }
                    return true;
                } catch (ClassCastException | NoSuchElementException unused) {
                }
            }
        }
        return false;
    }

    @Override // defpackage.r0k, java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.L.get(0);
        }
        pmf.d();
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int iV = v(obj, true) - 1;
        if (iV == -1) {
            return null;
        }
        return this.L.get(iV);
    }

    @Override // defpackage.upj
    public final int g() {
        return this.L.g();
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int iW = w(obj, false);
        pzj pzjVar = this.L;
        if (iW == pzjVar.size()) {
            return null;
        }
        return pzjVar.get(iW);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.L.listIterator(0);
    }

    @Override // defpackage.upj
    public final efi k() {
        return this.L.listIterator(0);
    }

    @Override // defpackage.upj
    public final Object[] l() {
        return this.L.l();
    }

    @Override // defpackage.r0k, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            pmf.d();
            return null;
        }
        return this.L.get(r1.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int iV = v(obj, false) - 1;
        if (iV == -1) {
            return null;
        }
        return this.L.get(iV);
    }

    @Override // defpackage.b0k
    public final pzj q() {
        return this.L;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.L.size();
    }

    public final int v(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.L, obj, this.J);
        return iBinarySearch >= 0 ? z ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    public final int w(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.L, obj, this.J);
        return iBinarySearch >= 0 ? z ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    public final o2k y(int i, int i2) {
        pzj pzjVar = this.L;
        if (i == 0) {
            if (i2 == pzjVar.size()) {
                return this;
            }
            i = 0;
        }
        Comparator comparator = this.J;
        return i < i2 ? new o2k(pzjVar.subList(i, i2), comparator) : r0k.u(comparator);
    }
}
