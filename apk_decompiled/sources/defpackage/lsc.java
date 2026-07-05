package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class lsc extends jmg implements Parcelable, ddg {
    public static final Parcelable.Creator<lsc> CREATOR = new ksc(0);
    public final fdg F;
    public edg G;

    public lsc(Object obj, fdg fdgVar) {
        this.F = fdgVar;
        rcg rcgVarJ = ycg.j();
        edg edgVar = new edg(rcgVarJ.g(), obj);
        if (!(rcgVarJ instanceof w78)) {
            edgVar.b = new edg(1L, obj);
        }
        this.G = edgVar;
    }

    @Override // defpackage.img
    public final kmg a() {
        return this.G;
    }

    @Override // defpackage.ddg
    public final fdg c() {
        return this.F;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.img
    public final kmg e(kmg kmgVar, kmg kmgVar2, kmg kmgVar3) {
        if (this.F.q(((edg) kmgVar2).c, ((edg) kmgVar3).c)) {
            return kmgVar2;
        }
        return null;
    }

    @Override // defpackage.img
    public final void g(kmg kmgVar) {
        kmgVar.getClass();
        this.G = (edg) kmgVar;
    }

    @Override // defpackage.wlg
    public final Object getValue() {
        return ((edg) ycg.t(this.G, this)).c;
    }

    @Override // defpackage.nwb
    public final void setValue(Object obj) {
        rcg rcgVarJ;
        edg edgVar = (edg) ycg.h(this.G);
        if (this.F.q(edgVar.c, obj)) {
            return;
        }
        edg edgVar2 = this.G;
        synchronized (ycg.c) {
            rcgVarJ = ycg.j();
            ((edg) ycg.o(edgVar2, this, rcgVarJ, edgVar)).c = obj;
        }
        ycg.n(rcgVarJ, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((edg) ycg.h(this.G)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        ql8 ql8Var = ql8.J;
        fdg fdgVar = this.F;
        if (x44.r(fdgVar, ql8Var)) {
            i2 = 0;
        } else if (x44.r(fdgVar, a5.N)) {
            i2 = 1;
        } else {
            if (!x44.r(fdgVar, zp3.X)) {
                sz6.j("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
