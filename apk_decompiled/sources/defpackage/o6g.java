package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class o6g extends a4 {
    public static final Parcelable.Creator<o6g> CREATOR = new s38(21);
    public final String E;
    public final String F;
    public final Bundle G;

    public o6g(String str, String str2, Bundle bundle) {
        str.getClass();
        bundle.getClass();
        this.E = str;
        this.F = str2;
        this.G = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int iK0 = xn5.K0(parcel, 20293);
        xn5.F0(parcel, 1, this.E);
        xn5.F0(parcel, 2, this.F);
        xn5.y0(parcel, 3, this.G);
        xn5.L0(parcel, iK0);
    }
}
