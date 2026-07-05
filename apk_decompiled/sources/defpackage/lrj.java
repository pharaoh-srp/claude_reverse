package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class lrj extends a4 {
    public static final Parcelable.Creator<lrj> CREATOR = new gqj(11);
    public final Bundle E;

    public lrj(Bundle bundle) {
        this.E = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.y0(parcel, 1, this.E);
        xn5.L0(parcel, iK0);
    }
}
