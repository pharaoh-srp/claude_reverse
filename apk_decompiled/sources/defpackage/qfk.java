package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class qfk extends a4 {
    public static final Parcelable.Creator<qfk> CREATOR = new pak(18);
    public final int E;
    public final int F;
    public final byte[] G;

    public qfk(byte[] bArr, int i, int i2) {
        this.E = i;
        this.F = i2;
        this.G = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.F);
        xn5.z0(parcel, 3, this.G);
        xn5.L0(parcel, iK0);
    }
}
