package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class co3 extends a4 {
    public static final Parcelable.Creator<co3> CREATOR = new dpj(12);
    public final boolean E;

    public co3(boolean z) {
        this.E = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E ? 1 : 0);
        xn5.L0(parcel, iK0);
    }
}
