package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public class x2 extends AbstractCollection implements List {
    public final Object E;
    public Collection F;
    public final x2 G;
    public final Collection H;
    public final /* synthetic */ dub I;
    public final /* synthetic */ dub J;

    public x2(dub dubVar, Object obj, List list, x2 x2Var) {
        this.J = dubVar;
        this.I = dubVar;
        this.E = obj;
        this.F = list;
        this.G = x2Var;
        this.H = x2Var == null ? null : x2Var.F;
    }

    public final void a() {
        x2 x2Var = this.G;
        if (x2Var != null) {
            x2Var.a();
        } else {
            this.I.H.put(this.E, this.F);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        boolean zIsEmpty = this.F.isEmpty();
        boolean zAdd = this.F.add(obj);
        if (zAdd) {
            this.I.I++;
            if (zIsEmpty) {
                a();
            }
        }
        return zAdd;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.F).addAll(i, collection);
        if (zAddAll) {
            this.J.I += this.F.size() - size;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }

    public final void b() {
        Collection collection;
        x2 x2Var = this.G;
        if (x2Var != null) {
            x2Var.b();
            if (x2Var.F == this.H) {
                return;
            }
            sz6.c();
            return;
        }
        if (!this.F.isEmpty() || (collection = (Collection) this.I.H.get(this.E)) == null) {
            return;
        }
        this.F = collection;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.F.clear();
        this.I.I -= size;
        e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        b();
        return this.F.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        b();
        return this.F.containsAll(collection);
    }

    public final void e() {
        x2 x2Var = this.G;
        if (x2Var != null) {
            x2Var.e();
        } else if (this.F.isEmpty()) {
            this.I.H.remove(this.E);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        b();
        return this.F.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        b();
        return ((List) this.F).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        b();
        return this.F.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        return ((List) this.F).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        b();
        return new o2(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        return ((List) this.F).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        b();
        return new w2(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        b();
        boolean zRemove = this.F.remove(obj);
        if (zRemove) {
            dub dubVar = this.I;
            dubVar.I--;
            e();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.F.removeAll(collection);
        if (zRemoveAll) {
            this.I.I += this.F.size() - size;
            e();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.F.retainAll(collection);
        if (zRetainAll) {
            this.I.I += this.F.size() - size;
            e();
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        b();
        return ((List) this.F).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        b();
        return this.F.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        b();
        List listSubList = ((List) this.F).subList(i, i2);
        x2 x2Var = this.G;
        if (x2Var == null) {
            x2Var = this;
        }
        boolean z = listSubList instanceof RandomAccess;
        dub dubVar = this.J;
        Object obj = this.E;
        return z ? new t2(dubVar, obj, listSubList, x2Var) : new x2(dubVar, obj, listSubList, x2Var);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        b();
        return this.F.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        b();
        return new w2(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        b();
        Object objRemove = ((List) this.F).remove(i);
        dub dubVar = this.J;
        dubVar.I--;
        e();
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        b();
        boolean zIsEmpty = this.F.isEmpty();
        ((List) this.F).add(i, obj);
        this.J.I++;
        if (zIsEmpty) {
            a();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.F.addAll(collection);
        if (zAddAll) {
            this.I.I += this.F.size() - size;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }
}
