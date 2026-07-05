package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class kh7 extends a4 {
    public static final Parcelable.Creator<kh7> CREATOR = new o1l(13);
    public final String E;

    public kh7(String str) {
        dgj.v(str);
        this.E = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kh7) {
            return this.E.equals(((kh7) obj).E);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E});
    }

    public final String toString() {
        return ij0.m(new StringBuilder("FidoAppIdExtension{appid='"), this.E, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.F0(parcel, 2, this.E);
        xn5.L0(parcel, iK0);
    }
}
