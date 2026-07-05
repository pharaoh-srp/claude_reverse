package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class mwk extends a4 {
    public static final Parcelable.Creator<mwk> CREATOR = new xok(14);
    public final String E;
    public final float F;

    public mwk(String str, float f) {
        this.E = str;
        this.F = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.F0(parcel, 1, this.E);
        xn5.J0(parcel, 2, 4);
        parcel.writeFloat(this.F);
        xn5.L0(parcel, iK0);
    }
}
