package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class pdg implements Parcelable, img, Set, RandomAccess, an9 {
    public static final Parcelable.Creator<pdg> CREATOR = new ksc(1);
    public mmg E;

    public pdg() {
        gzc gzcVar = gzc.H;
        mmg mmgVar = new mmg(ycg.j().g(), gzcVar);
        if (ycg.b.get() != null) {
            mmgVar.b = new mmg(1L, gzcVar);
        }
        this.E = mmgVar;
    }

    @Override // defpackage.img
    public final kmg a() {
        return this.E;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        gzc gzcVar;
        rcg rcgVarJ;
        boolean zT;
        do {
            synchronized (x44.c) {
                mmg mmgVar = this.E;
                mmgVar.getClass();
                mmg mmgVar2 = (mmg) ycg.h(mmgVar);
                i = mmgVar2.d;
                gzcVar = mmgVar2.c;
            }
            gzcVar.getClass();
            gzc gzcVarA = gzcVar.a(obj);
            if (gzcVarA.equals(gzcVar)) {
                return false;
            }
            mmg mmgVar3 = this.E;
            mmgVar3.getClass();
            synchronized (ycg.c) {
                rcgVarJ = ycg.j();
                zT = x44.t((mmg) ycg.w(mmgVar3, this, rcgVarJ), i, gzcVarA);
            }
            ycg.n(rcgVarJ, this);
        } while (!zT);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        gzc gzcVar;
        rcg rcgVarJ;
        boolean zT;
        do {
            synchronized (x44.c) {
                mmg mmgVar = this.E;
                mmgVar.getClass();
                mmg mmgVar2 = (mmg) ycg.h(mmgVar);
                i = mmgVar2.d;
                gzcVar = mmgVar2.c;
            }
            gzcVar.getClass();
            izc izcVar = new izc(gzcVar);
            izcVar.addAll(collection);
            gzc gzcVarE = izcVar.e();
            if (gzcVarE.equals(gzcVar)) {
                return false;
            }
            mmg mmgVar3 = this.E;
            mmgVar3.getClass();
            synchronized (ycg.c) {
                rcgVarJ = ycg.j();
                zT = x44.t((mmg) ycg.w(mmgVar3, this, rcgVarJ), i, gzcVarE);
            }
            ycg.n(rcgVarJ, this);
        } while (!zT);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        rcg rcgVarJ;
        mmg mmgVar = this.E;
        mmgVar.getClass();
        synchronized (ycg.c) {
            rcgVarJ = ycg.j();
            mmg mmgVar2 = (mmg) ycg.w(mmgVar, this, rcgVarJ);
            synchronized (x44.c) {
                mmgVar2.c = gzc.H;
                mmgVar2.d++;
            }
        }
        ycg.n(rcgVarJ, this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return x44.O(this).c.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return x44.O(this).c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.img
    public final void g(kmg kmgVar) {
        kmgVar.b = this.E;
        this.E = (mmg) kmgVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return x44.O(this).c.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new lmg(this, x44.O(this).c.iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        gzc gzcVar;
        rcg rcgVarJ;
        boolean zT;
        do {
            synchronized (x44.c) {
                mmg mmgVar = this.E;
                mmgVar.getClass();
                mmg mmgVar2 = (mmg) ycg.h(mmgVar);
                i = mmgVar2.d;
                gzcVar = mmgVar2.c;
            }
            gzcVar.getClass();
            gzc gzcVarE = gzcVar.e(obj);
            if (gzcVarE.equals(gzcVar)) {
                return false;
            }
            mmg mmgVar3 = this.E;
            mmgVar3.getClass();
            synchronized (ycg.c) {
                rcgVarJ = ycg.j();
                zT = x44.t((mmg) ycg.w(mmgVar3, this, rcgVarJ), i, gzcVarE);
            }
            ycg.n(rcgVarJ, this);
        } while (!zT);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        gzc gzcVar;
        rcg rcgVarJ;
        boolean zT;
        do {
            synchronized (x44.c) {
                mmg mmgVar = this.E;
                mmgVar.getClass();
                mmg mmgVar2 = (mmg) ycg.h(mmgVar);
                i = mmgVar2.d;
                gzcVar = mmgVar2.c;
            }
            gzcVar.getClass();
            izc izcVar = new izc(gzcVar);
            izcVar.removeAll(collection);
            gzc gzcVarE = izcVar.e();
            if (gzcVarE.equals(gzcVar)) {
                return false;
            }
            mmg mmgVar3 = this.E;
            mmgVar3.getClass();
            synchronized (ycg.c) {
                rcgVarJ = ycg.j();
                zT = x44.t((mmg) ycg.w(mmgVar3, this, rcgVarJ), i, gzcVarE);
            }
            ycg.n(rcgVarJ, this);
        } while (!zT);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        gzc gzcVar;
        Object objInvoke;
        rcg rcgVarJ;
        boolean zT;
        j3 j3Var = new j3(4, collection);
        do {
            synchronized (x44.c) {
                mmg mmgVar = this.E;
                mmgVar.getClass();
                mmg mmgVar2 = (mmg) ycg.h(mmgVar);
                i = mmgVar2.d;
                gzcVar = mmgVar2.c;
            }
            if (gzcVar == null) {
                sz6.j("No set to mutate");
                return false;
            }
            izc izcVar = new izc(gzcVar);
            objInvoke = j3Var.invoke(izcVar);
            gzc gzcVarE = izcVar.e();
            if (gzcVarE.equals(gzcVar)) {
                break;
            }
            mmg mmgVar3 = this.E;
            mmgVar3.getClass();
            synchronized (ycg.c) {
                rcgVarJ = ycg.j();
                zT = x44.t((mmg) ycg.w(mmgVar3, this, rcgVarJ), i, gzcVarE);
            }
            ycg.n(rcgVarJ, this);
        } while (!zT);
        return ((Boolean) objInvoke).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return x44.O(this).c.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return dch.T(this);
    }

    public final String toString() {
        mmg mmgVar = this.E;
        mmgVar.getClass();
        return "SnapshotStateSet(value=" + ((mmg) ycg.h(mmgVar)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        gzc gzcVar = x44.O(this).c;
        parcel.writeInt(size());
        Iterator it = gzcVar.iterator();
        if (it.hasNext()) {
            parcel.writeValue(it.next());
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return dch.U(this, objArr);
    }
}
