package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class jok extends a4 {
    public static final Parcelable.Creator<jok> CREATOR = new pak(29);
    public final String E;
    public final String F;
    public final long G;

    public jok(String str, String str2, long j) {
        this.E = str;
        this.F = str2;
        this.G = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.F0(parcel, 2, this.E);
        xn5.F0(parcel, 3, this.F);
        xn5.J0(parcel, 4, 8);
        parcel.writeLong(this.G);
        xn5.L0(parcel, iK0);
    }
}
