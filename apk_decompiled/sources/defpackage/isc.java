package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class isc extends jmg implements Parcelable, ddg, nwb, wlg {
    public static final Parcelable.Creator<isc> CREATOR = new gsc(1);
    public bdg F;

    public isc(int i) {
        rcg rcgVarJ = ycg.j();
        bdg bdgVar = new bdg(rcgVarJ.g(), i);
        if (!(rcgVarJ instanceof w78)) {
            bdgVar.b = new bdg(1L, i);
        }
        this.F = bdgVar;
    }

    @Override // defpackage.img
    public final kmg a() {
        return this.F;
    }

    @Override // defpackage.ddg
    public final fdg c() {
        return a5.N;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.img
    public final kmg e(kmg kmgVar, kmg kmgVar2, kmg kmgVar3) {
        if (((bdg) kmgVar2).c == ((bdg) kmgVar3).c) {
            return kmgVar2;
        }
        return null;
    }

    @Override // defpackage.img
    public final void g(kmg kmgVar) {
        kmgVar.getClass();
        this.F = (bdg) kmgVar;
    }

    @Override // defpackage.wlg
    public Object getValue() {
        return Integer.valueOf(h());
    }

    public final int h() {
        return ((bdg) ycg.t(this.F, this)).c;
    }

    public final void i(int i) {
        rcg rcgVarJ;
        bdg bdgVar = (bdg) ycg.h(this.F);
        if (bdgVar.c != i) {
            bdg bdgVar2 = this.F;
            synchronized (ycg.c) {
                rcgVarJ = ycg.j();
                ((bdg) ycg.o(bdgVar2, this, rcgVarJ, bdgVar)).c = i;
            }
            ycg.n(rcgVarJ, this);
        }
    }

    @Override // defpackage.nwb
    public void setValue(Object obj) {
        i(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((bdg) ycg.h(this.F)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(h());
    }
}
