package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class zek extends a4 {
    public static final Parcelable.Creator<zek> CREATOR = new pak(17);
    public final int E;
    public final String F;

    public zek(int i, String str) {
        this.E = i;
        this.F = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.E);
        xn5.F0(parcel, 3, this.F);
        xn5.L0(parcel, iK0);
    }
}
