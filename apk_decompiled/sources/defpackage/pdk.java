package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class pdk extends a4 {
    public static final Parcelable.Creator<pdk> CREATOR = new pak(12);
    public final int E;
    public final ParcelFileDescriptor F;

    public pdk(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.E = i;
        this.F = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.E);
        xn5.E0(parcel, 3, this.F, i | 1);
        xn5.L0(parcel, iK0);
    }
}
