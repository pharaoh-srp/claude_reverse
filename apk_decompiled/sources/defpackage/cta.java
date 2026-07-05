package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class cta extends a4 {
    public static final Parcelable.Creator<cta> CREATOR = new xok(29);
    public final String E;

    public cta(String str) {
        dgj.w("json must not be null", str);
        this.E = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.F0(parcel, 2, this.E);
        xn5.L0(parcel, iK0);
    }
}
