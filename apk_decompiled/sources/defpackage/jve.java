package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class jve extends a4 {
    public static final Parcelable.Creator<jve> CREATOR = new gqj(2);
    public final int E;
    public final boolean F;
    public final boolean G;
    public final int H;
    public final int I;

    public jve(int i, boolean z, boolean z2, int i2, int i3) {
        this.E = i;
        this.F = z;
        this.G = z2;
        this.H = i2;
        this.I = i3;
    }

    public final boolean l0() {
        return this.F;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.F ? 1 : 0);
        xn5.J0(parcel, 3, 4);
        parcel.writeInt(this.G ? 1 : 0);
        xn5.J0(parcel, 4, 4);
        parcel.writeInt(this.H);
        xn5.J0(parcel, 5, 4);
        parcel.writeInt(this.I);
        xn5.L0(parcel, iK0);
    }
}
