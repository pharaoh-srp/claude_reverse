package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class o3l extends a4 {
    public static final Parcelable.Creator<o3l> CREATOR = new o1l(7);
    public final boolean E;
    public final String F;
    public final int G;
    public final int H;
    public final long I;

    public o3l(boolean z, String str, int i, int i2, long j) {
        this.E = z;
        this.F = str;
        this.G = ssk.r(i) - 1;
        this.H = gpk.l(i2) - 1;
        this.I = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E ? 1 : 0);
        xn5.F0(parcel, 2, this.F);
        xn5.J0(parcel, 3, 4);
        parcel.writeInt(this.G);
        xn5.J0(parcel, 4, 4);
        parcel.writeInt(this.H);
        xn5.J0(parcel, 5, 8);
        parcel.writeLong(this.I);
        xn5.L0(parcel, iK0);
    }
}
