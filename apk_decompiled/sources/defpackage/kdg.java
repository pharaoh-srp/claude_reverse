package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class kdg implements Parcelable, img, List, RandomAccess, om9 {
    public static final Parcelable.Creator<kdg> CREATOR = new jdg();
    public emg E;

    public kdg(l3 l3Var) {
        rcg rcgVarJ = ycg.j();
        emg emgVar = new emg(rcgVarJ.g(), l3Var);
        if (!(rcgVarJ instanceof w78)) {
            emgVar.b = new emg(1L, l3Var);
        }
        this.E = emgVar;
    }

    @Override // defpackage.img
    public final kmg a() {
        return this.E;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        l3 l3Var;
        rcg rcgVarJ;
        boolean zP;
        do {
            synchronized (oq5.H) {
                emg emgVar = this.E;
                emgVar.getClass();
                emg emgVar2 = (emg) ycg.h(emgVar);
                i = emgVar2.d;
                l3Var = emgVar2.c;
            }
            l3Var.getClass();
            l3 l3VarE = l3Var.e(obj);
            if (l3VarE.equals(l3Var)) {
                return false;
            }
            emg emgVar3 = this.E;
            emgVar3.getClass();
            synchronized (ycg.c) {
                rcgVarJ = ycg.j();
                zP = oq5.p((emg) ycg.w(emgVar3, this, rcgVarJ), i, l3VarE, true);
            }
            ycg.n(rcgVarJ, this);
        } while (!zP);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        l3 l3Var;
        rcg rcgVarJ;
        boolean zP;
        do {
            synchronized (oq5.H) {
                emg emgVar = this.E;
                emgVar.getClass();
                emg emgVar2 = (emg) ycg.h(emgVar);
                i = emgVar2.d;
                l3Var = emgVar2.c;
            }
            l3Var.getClass();
            l3 l3VarG = l3Var.g(collection);
            if (x44.r(l3VarG, l3Var)) {
                return false;
            }
            emg emgVar3 = this.E;
            emgVar3.getClass();
            synchronized (ycg.c) {
                rcgVarJ = ycg.j();
                zP = oq5.p((emg) ycg.w(emgVar3, this, rcgVarJ), i, l3VarG, true);
            }
            ycg.n(rcgVarJ, this);
        } while (!zP);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        rcg rcgVarJ;
        emg emgVar = this.E;
        emgVar.getClass();
        synchronized (ycg.c) {
            rcgVarJ = ycg.j();
            emg emgVar2 = (emg) ycg.w(emgVar, this, rcgVarJ);
            synchronized (oq5.H) {
                emgVar2.c = cbg.F;
                emgVar2.d++;
                emgVar2.e++;
            }
        }
        ycg.n(rcgVarJ, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return oq5.C(this).c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return oq5.C(this).c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.img
    public final void g(kmg kmgVar) {
        kmgVar.b = this.E;
        this.E = (emg) kmgVar;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return oq5.C(this).c.get(i);
    }

    public final void h(int i, int i2) {
        int i3;
        l3 l3Var;
        rcg rcgVarJ;
        boolean zP;
        do {
            synchronized (oq5.H) {
                emg emgVar = this.E;
                emgVar.getClass();
                emg emgVar2 = (emg) ycg.h(emgVar);
                i3 = emgVar2.d;
                l3Var = emgVar2.c;
            }
            l3Var.getClass();
            pzc pzcVarH = l3Var.h();
            pzcVarH.subList(i, i2).clear();
            l3 l3VarA = pzcVarH.a();
            if (x44.r(l3VarA, l3Var)) {
                return;
            }
            emg emgVar3 = this.E;
            emgVar3.getClass();
            synchronized (ycg.c) {
                rcgVarJ = ycg.j();
                zP = oq5.p((emg) ycg.w(emgVar3, this, rcgVarJ), i3, l3VarA, true);
            }
            ycg.n(rcgVarJ, this);
        } while (!zP);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return oq5.C(this).c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return oq5.C(this).c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return oq5.C(this).c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new c8a(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        l3 l3Var;
        rcg rcgVarJ;
        boolean zP;
        do {
            synchronized (oq5.H) {
                emg emgVar = this.E;
                emgVar.getClass();
                emg emgVar2 = (emg) ycg.h(emgVar);
                i = emgVar2.d;
                l3Var = emgVar2.c;
            }
            l3Var.getClass();
            int iIndexOf = l3Var.indexOf(obj);
            l3 l3VarL = iIndexOf != -1 ? l3Var.l(iIndexOf) : l3Var;
            if (l3VarL.equals(l3Var)) {
                return false;
            }
            emg emgVar3 = this.E;
            emgVar3.getClass();
            synchronized (ycg.c) {
                rcgVarJ = ycg.j();
                zP = oq5.p((emg) ycg.w(emgVar3, this, rcgVarJ), i, l3VarL, true);
            }
            ycg.n(rcgVarJ, this);
        } while (!zP);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        l3 l3Var;
        rcg rcgVarJ;
        boolean zP;
        do {
            synchronized (oq5.H) {
                emg emgVar = this.E;
                emgVar.getClass();
                emg emgVar2 = (emg) ycg.h(emgVar);
                i = emgVar2.d;
                l3Var = emgVar2.c;
            }
            l3Var.getClass();
            l3 l3VarK = l3Var.k(new j3(0, collection));
            if (x44.r(l3VarK, l3Var)) {
                return false;
            }
            emg emgVar3 = this.E;
            emgVar3.getClass();
            synchronized (ycg.c) {
                rcgVarJ = ycg.j();
                zP = oq5.p((emg) ycg.w(emgVar3, this, rcgVarJ), i, l3VarK, true);
            }
            ycg.n(rcgVarJ, this);
        } while (!zP);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return oq5.L(this, new j3(3, collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        l3 l3Var;
        rcg rcgVarJ;
        boolean zP;
        Object obj2 = get(i);
        do {
            synchronized (oq5.H) {
                emg emgVar = this.E;
                emgVar.getClass();
                emg emgVar2 = (emg) ycg.h(emgVar);
                i2 = emgVar2.d;
                l3Var = emgVar2.c;
            }
            l3Var.getClass();
            l3 l3VarM = l3Var.m(i, obj);
            if (l3VarM.equals(l3Var)) {
                break;
            }
            emg emgVar3 = this.E;
            emgVar3.getClass();
            synchronized (ycg.c) {
                rcgVarJ = ycg.j();
                zP = oq5.p((emg) ycg.w(emgVar3, this, rcgVarJ), i2, l3VarM, false);
            }
            ycg.n(rcgVarJ, this);
        } while (!zP);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return oq5.C(this).c.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            zad.a("fromIndex or toIndex are out of bounds");
        }
        return new wug(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return dch.T(this);
    }

    public final String toString() {
        emg emgVar = this.E;
        emgVar.getClass();
        return "SnapshotStateList(value=" + ((emg) ycg.h(emgVar)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        l3 l3Var = oq5.C(this).c;
        int size = l3Var.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeValue(l3Var.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return dch.U(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new c8a(this, i);
    }

    public kdg() {
        this(cbg.F);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        l3 l3Var;
        rcg rcgVarJ;
        boolean zP;
        do {
            synchronized (oq5.H) {
                emg emgVar = this.E;
                emgVar.getClass();
                emg emgVar2 = (emg) ycg.h(emgVar);
                i2 = emgVar2.d;
                l3Var = emgVar2.c;
            }
            l3Var.getClass();
            l3 l3VarA = l3Var.a(i, obj);
            if (l3VarA.equals(l3Var)) {
                return;
            }
            emg emgVar3 = this.E;
            emgVar3.getClass();
            synchronized (ycg.c) {
                rcgVarJ = ycg.j();
                zP = oq5.p((emg) ycg.w(emgVar3, this, rcgVarJ), i2, l3VarA, true);
            }
            ycg.n(rcgVarJ, this);
        } while (!zP);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return oq5.L(this, new jv0(i, collection, 3));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        l3 l3Var;
        rcg rcgVarJ;
        boolean zP;
        Object obj = get(i);
        do {
            synchronized (oq5.H) {
                emg emgVar = this.E;
                emgVar.getClass();
                emg emgVar2 = (emg) ycg.h(emgVar);
                i2 = emgVar2.d;
                l3Var = emgVar2.c;
            }
            l3Var.getClass();
            l3 l3VarL = l3Var.l(i);
            if (l3VarL.equals(l3Var)) {
                break;
            }
            emg emgVar3 = this.E;
            emgVar3.getClass();
            synchronized (ycg.c) {
                rcgVarJ = ycg.j();
                zP = oq5.p((emg) ycg.w(emgVar3, this, rcgVarJ), i2, l3VarL, true);
            }
            ycg.n(rcgVarJ, this);
        } while (!zP);
        return obj;
    }
}
