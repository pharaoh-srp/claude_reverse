package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class drk extends a4 {
    public static final Parcelable.Creator<drk> CREATOR = new xok(12);
    public Bundle E;
    public jf7[] F;
    public int G;
    public sh4 H;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.y0(parcel, 1, this.E);
        xn5.H0(parcel, 2, this.F, i);
        int i2 = this.G;
        xn5.J0(parcel, 3, 4);
        parcel.writeInt(i2);
        xn5.E0(parcel, 4, this.H, i);
        xn5.L0(parcel, iK0);
    }
}
