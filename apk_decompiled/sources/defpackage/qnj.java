package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class qnj extends a4 {
    public static final Parcelable.Creator<qnj> CREATOR = new zmj(5);
    public final int E;
    public final hh4 F;
    public final ynj G;

    public qnj(int i, hh4 hh4Var, ynj ynjVar) {
        this.E = i;
        this.F = hh4Var;
        this.G = ynjVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E);
        xn5.E0(parcel, 2, this.F, i);
        xn5.E0(parcel, 3, this.G, i);
        xn5.L0(parcel, iK0);
    }
}
