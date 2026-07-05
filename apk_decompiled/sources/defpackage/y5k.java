package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class y5k extends a4 {
    public static final Parcelable.Creator<y5k> CREATOR = new gsc(11);
    public final long E;
    public final long F;
    public final boolean G;
    public final String H;
    public final String I;
    public final String J;
    public final Bundle K;
    public final String L;

    public y5k(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle, String str4) {
        this.E = j;
        this.F = j2;
        this.G = z;
        this.H = str;
        this.I = str2;
        this.J = str3;
        this.K = bundle;
        this.L = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 8);
        parcel.writeLong(this.E);
        xn5.J0(parcel, 2, 8);
        parcel.writeLong(this.F);
        xn5.J0(parcel, 3, 4);
        parcel.writeInt(this.G ? 1 : 0);
        xn5.F0(parcel, 4, this.H);
        xn5.F0(parcel, 5, this.I);
        xn5.F0(parcel, 6, this.J);
        xn5.y0(parcel, 7, this.K);
        xn5.F0(parcel, 8, this.L);
        xn5.L0(parcel, iK0);
    }
}
