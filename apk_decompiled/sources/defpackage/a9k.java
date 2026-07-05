package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class a9k extends a4 {
    public static final Parcelable.Creator<a9k> CREATOR = new zwj(24);
    public final int E;
    public final boolean F;

    public a9k(int i, boolean z) {
        this.E = i;
        this.F = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.F ? 1 : 0);
        xn5.L0(parcel, iK0);
    }
}
