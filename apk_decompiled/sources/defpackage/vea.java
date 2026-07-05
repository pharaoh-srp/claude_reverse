package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class vea extends a4 {
    public static final Parcelable.Creator<vea> CREATOR = new gqj(6);
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;

    public vea(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.E = z;
        this.F = z2;
        this.G = z3;
        this.H = z4;
        this.I = z5;
        this.J = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E ? 1 : 0);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.F ? 1 : 0);
        xn5.J0(parcel, 3, 4);
        parcel.writeInt(this.G ? 1 : 0);
        xn5.J0(parcel, 4, 4);
        parcel.writeInt(this.H ? 1 : 0);
        xn5.J0(parcel, 5, 4);
        parcel.writeInt(this.I ? 1 : 0);
        xn5.J0(parcel, 6, 4);
        parcel.writeInt(this.J ? 1 : 0);
        xn5.L0(parcel, iK0);
    }
}
