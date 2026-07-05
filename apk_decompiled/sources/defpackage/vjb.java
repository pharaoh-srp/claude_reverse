package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class vjb extends a4 {
    public static final Parcelable.Creator<vjb> CREATOR = new gsc(4);
    public final int E;
    public final int F;
    public final int G;
    public final long H;
    public final long I;
    public final String J;
    public final String K;
    public final int L;
    public final int M;

    public vjb(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.E = i;
        this.F = i2;
        this.G = i3;
        this.H = j;
        this.I = j2;
        this.J = str;
        this.K = str2;
        this.L = i4;
        this.M = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.F);
        xn5.J0(parcel, 3, 4);
        parcel.writeInt(this.G);
        xn5.J0(parcel, 4, 8);
        parcel.writeLong(this.H);
        xn5.J0(parcel, 5, 8);
        parcel.writeLong(this.I);
        xn5.F0(parcel, 6, this.J);
        xn5.F0(parcel, 7, this.K);
        xn5.J0(parcel, 8, 4);
        parcel.writeInt(this.L);
        xn5.J0(parcel, 9, 4);
        parcel.writeInt(this.M);
        xn5.L0(parcel, iK0);
    }
}
