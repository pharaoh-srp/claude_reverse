package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class pqb extends a4 {
    public static final Parcelable.Creator<pqb> CREATOR = new s38(25);
    public final boolean E;
    public final int F;

    public pqb(boolean z, int i) {
        this.E = z;
        this.F = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E ? 1 : 0);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.F);
        xn5.L0(parcel, iK0);
    }
}
