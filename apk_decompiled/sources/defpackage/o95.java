package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class o95 extends a4 {
    public static final Parcelable.Creator<o95> CREATOR = new dpj(20);
    public final String E;
    public final Bundle F;
    public final Bundle G;
    public final String H;
    public final String I;
    public final String J;

    public o95(String str, Bundle bundle, Bundle bundle2, String str2, String str3, String str4) {
        str.getClass();
        bundle.getClass();
        bundle2.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.E = str;
        this.F = bundle;
        this.G = bundle2;
        this.H = str2;
        this.I = str3;
        this.J = str4;
        boolean z = (bsg.I0(str3) || bsg.I0(str4)) ? false : true;
        boolean z2 = !bsg.I0(str) && str3.length() == 0 && str4.length() == 0;
        if (z || z2) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + String.valueOf(str).length() + 31 + String.valueOf(str3).length() + 19 + 69);
        kgh.u(sb, "Either type: ", str, ", or requestType: ", str3);
        sz6.p(kgh.q(sb, " and protocolType: ", str4, " must be specified, but at least one contains an invalid blank value."));
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int iK0 = xn5.K0(parcel, 20293);
        xn5.F0(parcel, 1, this.E);
        xn5.y0(parcel, 2, this.F);
        xn5.y0(parcel, 3, this.G);
        xn5.F0(parcel, 4, this.H);
        xn5.F0(parcel, 5, this.I);
        xn5.F0(parcel, 6, this.J);
        xn5.L0(parcel, iK0);
    }
}
