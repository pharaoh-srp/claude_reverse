package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class k65 extends a4 {
    public static final Parcelable.Creator<k65> CREATOR = new dpj(16);
    public final String E;
    public final Bundle F;

    public k65(String str, Bundle bundle) {
        str.getClass();
        bundle.getClass();
        this.E = str;
        this.F = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int iK0 = xn5.K0(parcel, 20293);
        xn5.F0(parcel, 1, this.E);
        xn5.y0(parcel, 2, this.F);
        xn5.L0(parcel, iK0);
    }
}
