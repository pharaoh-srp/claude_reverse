package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class lck extends a4 {
    public static final Parcelable.Creator<lck> CREATOR = new pak(8);
    public final int E;
    public final o7k F;

    public lck(int i, o7k o7kVar) {
        this.E = i;
        this.F = o7kVar;
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
