package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes3.dex */
public final class i65 extends a4 {
    public static final Parcelable.Creator<i65> CREATOR = new dpj(15);
    public final String E;
    public final Bundle F;
    public final Bundle G;
    public final String H;
    public final String I;
    public final ResultReceiver J;

    public i65(String str, Bundle bundle, Bundle bundle2, String str2, String str3, ResultReceiver resultReceiver) {
        str.getClass();
        bundle.getClass();
        bundle2.getClass();
        this.E = str;
        this.F = bundle;
        this.G = bundle2;
        this.H = str2;
        this.I = str3;
        this.J = resultReceiver;
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
        xn5.E0(parcel, 6, this.J, i);
        xn5.L0(parcel, iK0);
    }
}
