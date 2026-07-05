package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class t98 extends a4 {
    public static final Parcelable.Creator<t98> CREATOR = new s38(23);
    public final int E;
    public final int F;
    public final Bundle G;

    public t98(int i, int i2, Bundle bundle) {
        this.E = i;
        this.F = i2;
        this.G = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.F);
        xn5.y0(parcel, 3, this.G);
        xn5.L0(parcel, iK0);
    }
}
