package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class znk extends a4 {
    public static final Parcelable.Creator<znk> CREATOR = new pak(28);
    public final int E;
    public final lzj F;

    public znk(int i, lzj lzjVar) {
        this.E = i;
        this.F = lzjVar;
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
