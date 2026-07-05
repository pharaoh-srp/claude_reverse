package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class cdk extends a4 {
    public static final Parcelable.Creator<cdk> CREATOR = new pak(10);
    public final int E;
    public final e8k F;

    public cdk(int i, e8k e8kVar) {
        this.E = i;
        this.F = e8kVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E);
        xn5.E0(parcel, 2, this.F, i);
        xn5.L0(parcel, iK0);
    }
}
