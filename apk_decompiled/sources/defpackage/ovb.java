package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ovb implements List, om9 {
    public final qvb E;

    public ovb(qvb qvbVar) {
        this.E = qvbVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        qvb qvbVar = this.E;
        if (i < 0 || i > (i2 = qvbVar.b)) {
            StringBuilder sbU = vb7.u("Index ", i, " must be in 0..");
            sbU.append(qvbVar.b);
            gtk.h(sbU.toString());
            throw null;
        }
        int i3 = i2 + 1;
        Object[] objArr = qvbVar.a;
        if (objArr.length < i3) {
            qvbVar.m(i3, objArr);
        }
        Object[] objArr2 = qvbVar.a;
        int i4 = qvbVar.b;
        if (i != i4) {
            mp0.s0(i + 1, i, i4, objArr2, objArr2);
        }
        objArr2[i] = obj;
        qvbVar.b++;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        qvb qvbVar = this.E;
        if (i < 0 || i > qvbVar.b) {
            StringBuilder sbU = vb7.u("Index ", i, " must be in 0..");
            sbU.append(qvbVar.b);
            gtk.h(sbU.toString());
            throw null;
        }
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size() + qvbVar.b;
        Object[] objArr = qvbVar.a;
        if (objArr.length < size) {
            qvbVar.m(size, objArr);
        }
        Object[] objArr2 = qvbVar.a;
        if (i != qvbVar.b) {
            mp0.s0(collection.size() + i, i, qvbVar.b, objArr2, objArr2);
        }
        for (Object obj : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                x44.n0();
                throw null;
            }
            objArr2[i2 + i] = obj;
            i2 = i3;
        }
        qvbVar.b = collection.size() + qvbVar.b;
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.E.d();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.E.g(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (this.E.g(it.next()) < 0) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        wac.a(i, this);
        return this.E.f(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.E.g(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.E.h();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new nvb(0, 0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        qvb qvbVar = this.E;
        Object[] objArr = qvbVar.a;
        int i = qvbVar.b;
        if (obj == null) {
            for (int i2 = i - 1; -1 < i2; i2--) {
                if (objArr[i2] == null) {
                    return i2;
                }
            }
        } else {
            for (int i3 = i - 1; -1 < i3; i3--) {
                if (obj.equals(objArr[i3])) {
                    return i3;
                }
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new nvb(0, 0, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        wac.a(i, this);
        return this.E.k(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        qvb qvbVar = this.E;
        int i = qvbVar.b;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            qvbVar.j(it.next());
        }
        return i != qvbVar.b;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        qvb qvbVar = this.E;
        int i = qvbVar.b;
        Object[] objArr = qvbVar.a;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(objArr[i2])) {
                qvbVar.k(i2);
            }
        }
        return i != qvbVar.b;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        wac.a(i, this);
        return this.E.n(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.E.b;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        wac.b(i, i2, this);
        return new pvb(this, i, i2, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return dch.U(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new nvb(i, 0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return dch.T(this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.E.j(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.E.a(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        qvb qvbVar = this.E;
        int i = qvbVar.b;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            qvbVar.a(it.next());
        }
        return i != qvbVar.b;
    }
}
