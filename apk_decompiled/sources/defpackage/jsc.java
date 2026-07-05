package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class jsc extends jmg implements Parcelable, ddg, wlg, nwb {
    public static final Parcelable.Creator<jsc> CREATOR = new gsc(2);
    public cdg F;

    public jsc(long j) {
        rcg rcgVarJ = ycg.j();
        cdg cdgVar = new cdg(rcgVarJ.g(), j);
        if (!(rcgVarJ instanceof w78)) {
            cdgVar.b = new cdg(1L, j);
        }
        this.F = cdgVar;
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
        if (((cdg) kmgVar2).c == ((cdg) kmgVar3).c) {
            return kmgVar2;
        }
        return null;
    }

    @Override // defpackage.img
    public final void g(kmg kmgVar) {
        kmgVar.getClass();
        this.F = (cdg) kmgVar;
    }

    @Override // defpackage.wlg
    public final Object getValue() {
        return Long.valueOf(h());
    }

    public final long h() {
        return ((cdg) ycg.t(this.F, this)).c;
    }

    public final void i(long j) {
        rcg rcgVarJ;
        cdg cdgVar = (cdg) ycg.h(this.F);
        if (cdgVar.c != j) {
            cdg cdgVar2 = this.F;
            synchronized (ycg.c) {
                rcgVarJ = ycg.j();
                ((cdg) ycg.o(cdgVar2, this, rcgVarJ, cdgVar)).c = j;
            }
            ycg.n(rcgVarJ, this);
        }
    }

    @Override // defpackage.nwb
    public final void setValue(Object obj) {
        i(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((cdg) ycg.h(this.F)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(h());
    }
}
