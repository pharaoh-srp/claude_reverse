package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ojk extends a4 {
    public static final Parcelable.Creator<ojk> CREATOR = new pak(25);
    public final int E;

    public ojk(int i) {
        this.E = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.E);
        xn5.L0(parcel, iK0);
    }
}
