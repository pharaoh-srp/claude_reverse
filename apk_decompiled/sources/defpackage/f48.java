package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class f48 extends a4 {
    public static final Parcelable.Creator<f48> CREATOR = new s38(3);
    public final Bundle E;

    public f48(Bundle bundle) {
        bundle.getClass();
        this.E = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int iK0 = xn5.K0(parcel, 20293);
        xn5.y0(parcel, 1, this.E);
        xn5.L0(parcel, iK0);
    }
}
