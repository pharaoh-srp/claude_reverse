package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes3.dex */
public final class r7d extends a4 {
    public static final Parcelable.Creator<r7d> CREATOR = new o1l(8);
    public final LatLng E;
    public final String F;
    public final String G;

    public r7d(LatLng latLng, String str, String str2) {
        this.E = latLng;
        this.F = str;
        this.G = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.E0(parcel, 2, this.E, i);
        xn5.F0(parcel, 3, this.F);
        xn5.F0(parcel, 4, this.G);
        xn5.L0(parcel, iK0);
    }
}
