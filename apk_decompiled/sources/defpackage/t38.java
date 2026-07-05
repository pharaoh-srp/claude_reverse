package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class t38 extends a4 {
    public static final Parcelable.Creator<t38> CREATOR = new s38(1);
    public final k95 E;

    public t38(k95 k95Var) {
        k95Var.getClass();
        this.E = k95Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int iK0 = xn5.K0(parcel, 20293);
        xn5.E0(parcel, 1, this.E, i);
        xn5.L0(parcel, iK0);
    }
}
