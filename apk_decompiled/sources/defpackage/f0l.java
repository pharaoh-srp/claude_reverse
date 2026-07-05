package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class f0l extends a4 {
    public static final Parcelable.Creator<f0l> CREATOR = new xok(26);
    public final String E;
    public final long F;
    public final int G;

    public f0l(String str, long j, int i) {
        this.E = str;
        this.F = j;
        this.G = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.F0(parcel, 1, this.E);
        xn5.J0(parcel, 2, 8);
        parcel.writeLong(this.F);
        xn5.J0(parcel, 3, 4);
        parcel.writeInt(this.G);
        xn5.L0(parcel, iK0);
    }
}
