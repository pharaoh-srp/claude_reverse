package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class uwk extends a4 {
    public static final Parcelable.Creator<uwk> CREATOR = new xok(15);
    public final Float E;

    public uwk(Float f) {
        this.E = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.A0(parcel, 1, this.E);
        xn5.L0(parcel, iK0);
    }
}
