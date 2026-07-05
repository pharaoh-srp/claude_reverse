package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class rh1 extends a4 {
    public static final Parcelable.Creator<rh1> CREATOR = new zmj(12);
    public final boolean E;
    public final String F;
    public final String G;
    public final boolean H;
    public final String I;
    public final ArrayList J;
    public final boolean K;

    public rh1(boolean z, String str, String str2, boolean z2, String str3, ArrayList arrayList, boolean z3) {
        boolean z4 = true;
        if (z2 && z3) {
            z4 = false;
        }
        dgj.n("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z4);
        this.E = z;
        if (z) {
            dgj.w("serverClientId must be provided if Google ID tokens are requested", str);
        }
        this.F = str;
        this.G = str2;
        this.H = z2;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.J = arrayList2;
        this.I = str3;
        this.K = z3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rh1)) {
            return false;
        }
        rh1 rh1Var = (rh1) obj;
        return this.E == rh1Var.E && gb9.v(this.F, rh1Var.F) && gb9.v(this.G, rh1Var.G) && this.H == rh1Var.H && gb9.v(this.I, rh1Var.I) && gb9.v(this.J, rh1Var.J) && this.K == rh1Var.K;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.E), this.F, this.G, Boolean.valueOf(this.H), this.I, this.J, Boolean.valueOf(this.K)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E ? 1 : 0);
        xn5.F0(parcel, 2, this.F);
        xn5.F0(parcel, 3, this.G);
        xn5.J0(parcel, 4, 4);
        parcel.writeInt(this.H ? 1 : 0);
        xn5.F0(parcel, 5, this.I);
        xn5.G0(parcel, 6, this.J);
        xn5.J0(parcel, 7, 4);
        parcel.writeInt(this.K ? 1 : 0);
        xn5.L0(parcel, iK0);
    }
}
