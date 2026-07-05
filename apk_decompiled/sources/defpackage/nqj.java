package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class nqj extends a4 {
    public static final Parcelable.Creator<nqj> CREATOR = new gqj(4);
    public final String E;

    public nqj(String str) {
        dgj.v(str);
        this.E = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nqj) {
            return this.E.equals(((nqj) obj).E);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.F0(parcel, 1, this.E);
        xn5.L0(parcel, iK0);
    }
}
