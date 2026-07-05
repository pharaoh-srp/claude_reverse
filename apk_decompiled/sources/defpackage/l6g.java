package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class l6g extends a4 {
    public static final Parcelable.Creator<l6g> CREATOR = new zmj(20);
    public final String E;
    public final String F;

    public l6g(String str, String str2) {
        dgj.w("Account identifier cannot be null", str);
        String strTrim = str.trim();
        dgj.t(strTrim, "Account identifier cannot be empty");
        this.E = strTrim;
        dgj.s(str2);
        this.F = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l6g)) {
            return false;
        }
        l6g l6gVar = (l6g) obj;
        return gb9.v(this.E, l6gVar.E) && gb9.v(this.F, l6gVar.F);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, this.F});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.F0(parcel, 1, this.E);
        xn5.F0(parcel, 2, this.F);
        xn5.L0(parcel, iK0);
    }
}
