package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class axf extends AbstractCollection implements Set {
    public final Set E;
    public final hbd F;

    public axf(Set set, hbd hbdVar) {
        this.E = set;
        this.F = hbdVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        fd9.E(this.F.apply(obj));
        return this.E.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            fd9.E(this.F.apply(it.next()));
        }
        return this.E.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.E;
        boolean z = set instanceof RandomAccess;
        hbd hbdVar = this.F;
        if (!z || !(set instanceof List)) {
            Iterator it = set.iterator();
            hbdVar.getClass();
            while (it.hasNext()) {
                if (hbdVar.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        hbdVar.getClass();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            if (!hbdVar.apply(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        qwk.m(list, hbdVar, i, i2);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        qwk.m(list, hbdVar, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean zContains;
        Set set = this.E;
        set.getClass();
        try {
            zContains = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.F.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return uj5.h(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return uj5.k(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.E.iterator();
        hbd hbdVar = this.F;
        fd9.I("predicate", hbdVar);
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (hbdVar.apply(it.next())) {
                break;
            }
            i++;
        }
        return true ^ (i != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.E.iterator();
        it.getClass();
        hbd hbdVar = this.F;
        hbdVar.getClass();
        return new qc9(it, hbdVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.E.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.E.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.F.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.E.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.F.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.E.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.F.apply(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            qc9 qc9Var = (qc9) it;
            if (!qc9Var.hasNext()) {
                return arrayList.toArray();
            }
            arrayList.add(qc9Var.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            qc9 qc9Var = (qc9) it;
            if (qc9Var.hasNext()) {
                arrayList.add(qc9Var.next());
            } else {
                return arrayList.toArray(objArr);
            }
        }
    }
}
