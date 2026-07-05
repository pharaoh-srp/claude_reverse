package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class zpk extends a4 {
    public static final Parcelable.Creator<zpk> CREATOR = new xok(4);
    public final String E;

    public zpk(String str) {
        this.E = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.F0(parcel, 1, this.E);
        xn5.L0(parcel, iK0);
    }
}
