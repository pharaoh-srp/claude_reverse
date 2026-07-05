package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class wug implements List, om9 {
    public final kdg E;
    public final int F;
    public int G;
    public int H;

    public wug(kdg kdgVar, int i, int i2) {
        this.E = kdgVar;
        this.F = i;
        this.G = oq5.E(kdgVar);
        this.H = i2 - i;
    }

    public final void a() {
        if (oq5.E(this.E) == this.G) {
            return;
        }
        sz6.c();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i = this.F + this.H;
        kdg kdgVar = this.E;
        kdgVar.add(i, obj);
        this.H++;
        this.G = oq5.E(kdgVar);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        int i2 = i + this.F;
        kdg kdgVar = this.E;
        boolean zAddAll = kdgVar.addAll(i2, collection);
        if (zAddAll) {
            this.H = collection.size() + this.H;
            this.G = oq5.E(kdgVar);
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.H > 0) {
            a();
            int i = this.H;
            int i2 = this.F;
            kdg kdgVar = this.E;
            kdgVar.h(i2, i + i2);
            this.H = 0;
            this.G = oq5.E(kdgVar);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a();
        oq5.o(i, this.H);
        return this.E.get(this.F + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int iNextInt;
        a();
        int i = this.H;
        int i2 = this.F;
        Iterator it = wd6.H0(i2, i + i2).iterator();
        do {
            a79 a79Var = (a79) it;
            if (!a79Var.G) {
                return -1;
            }
            iNextInt = a79Var.nextInt();
        } while (!x44.r(obj, this.E.get(iNextInt)));
        return iNextInt - i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.H == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i = this.H;
        int i2 = this.F;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (x44.r(obj, this.E.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        a();
        bae baeVar = new bae();
        baeVar.E = i - 1;
        return new dse(baeVar, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        a();
        int i2 = this.F + i;
        kdg kdgVar = this.E;
        Object objRemove = kdgVar.remove(i2);
        this.H--;
        this.G = oq5.E(kdgVar);
        return objRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        l3 l3Var;
        rcg rcgVarJ;
        boolean zP;
        a();
        kdg kdgVar = this.E;
        int i2 = this.F;
        int i3 = this.H + i2;
        int size = kdgVar.size();
        do {
            synchronized (oq5.H) {
                emg emgVar = kdgVar.E;
                emgVar.getClass();
                emg emgVar2 = (emg) ycg.h(emgVar);
                i = emgVar2.d;
                l3Var = emgVar2.c;
            }
            l3Var.getClass();
            pzc pzcVarH = l3Var.h();
            pzcVarH.subList(i2, i3).retainAll(collection);
            l3 l3VarA = pzcVarH.a();
            if (x44.r(l3VarA, l3Var)) {
                break;
            }
            emg emgVar3 = kdgVar.E;
            emgVar3.getClass();
            synchronized (ycg.c) {
                rcgVarJ = ycg.j();
                zP = oq5.p((emg) ycg.w(emgVar3, kdgVar, rcgVarJ), i, l3VarA, true);
            }
            ycg.n(rcgVarJ, kdgVar);
        } while (!zP);
        int size2 = size - kdgVar.size();
        if (size2 > 0) {
            this.G = oq5.E(this.E);
            this.H -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        oq5.o(i, this.H);
        a();
        int i2 = i + this.F;
        kdg kdgVar = this.E;
        Object obj2 = kdgVar.set(i2, obj);
        this.G = oq5.E(kdgVar);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.H;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.H) {
            zad.a("fromIndex or toIndex are out of bounds");
        }
        a();
        int i3 = this.F;
        return new wug(this.E, i + i3, i2 + i3);
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
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        a();
        int i2 = this.F + i;
        kdg kdgVar = this.E;
        kdgVar.add(i2, obj);
        this.H++;
        this.G = oq5.E(kdgVar);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.H, collection);
    }
}
