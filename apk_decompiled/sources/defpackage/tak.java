package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class tak extends a4 {
    public static final Parcelable.Creator<tak> CREATOR = new pak(0);
    public final int E;
    public final boolean F;
    public final boolean G;

    public tak(int i, boolean z, boolean z2) {
        this.E = i;
        this.F = z;
        this.G = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.E);
        xn5.J0(parcel, 3, 4);
        parcel.writeInt(this.F ? 1 : 0);
        xn5.J0(parcel, 4, 4);
        parcel.writeInt(this.G ? 1 : 0);
        xn5.L0(parcel, iK0);
    }
}
