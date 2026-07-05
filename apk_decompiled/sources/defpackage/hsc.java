package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class hsc extends jmg implements Parcelable, ddg, nwb, wlg {
    public static final Parcelable.Creator<hsc> CREATOR = new gsc(0);
    public adg F;

    public hsc(float f) {
        rcg rcgVarJ = ycg.j();
        adg adgVar = new adg(rcgVarJ.g(), f);
        if (!(rcgVarJ instanceof w78)) {
            adgVar.b = new adg(1L, f);
        }
        this.F = adgVar;
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
        if (((adg) kmgVar2).c == ((adg) kmgVar3).c) {
            return kmgVar2;
        }
        return null;
    }

    @Override // defpackage.img
    public final void g(kmg kmgVar) {
        kmgVar.getClass();
        this.F = (adg) kmgVar;
    }

    @Override // defpackage.wlg
    public Object getValue() {
        return Float.valueOf(h());
    }

    public final float h() {
        return ((adg) ycg.t(this.F, this)).c;
    }

    public final void i(float f) {
        rcg rcgVarJ;
        adg adgVar = (adg) ycg.h(this.F);
        if (adgVar.c == f) {
            return;
        }
        adg adgVar2 = this.F;
        synchronized (ycg.c) {
            rcgVarJ = ycg.j();
            ((adg) ycg.o(adgVar2, this, rcgVarJ, adgVar)).c = f;
        }
        ycg.n(rcgVarJ, this);
    }

    @Override // defpackage.nwb
    public void setValue(Object obj) {
        i(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((adg) ycg.h(this.F)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(h());
    }
}
