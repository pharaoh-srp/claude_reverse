package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class sok extends a4 {
    public static final Parcelable.Creator<sok> CREATOR = new xok(0);
    public final byte[] E;

    public sok(byte[] bArr) {
        bArr.getClass();
        this.E = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.z0(parcel, 1, this.E);
        xn5.L0(parcel, iK0);
    }
}
