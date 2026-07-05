package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class qek extends a4 {
    public static final Parcelable.Creator<qek> CREATOR = new pak(15);
    public final int E;
    public final rnk F;

    public qek(int i, rnk rnkVar) {
        this.E = i;
        this.F = rnkVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.E);
        xn5.E0(parcel, 3, this.F, i);
        xn5.L0(parcel, iK0);
    }
}
