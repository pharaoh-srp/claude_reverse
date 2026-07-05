package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class l48 extends a4 {
    public static final Parcelable.Creator<l48> CREATOR = new zmj(11);
    public final String E;
    public final String F;
    public final String G;
    public final String H;
    public final boolean I;
    public final int J;

    public l48(String str, String str2, String str3, String str4, boolean z, int i) {
        dgj.v(str);
        this.E = str;
        this.F = str2;
        this.G = str3;
        this.H = str4;
        this.I = z;
        this.J = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l48)) {
            return false;
        }
        l48 l48Var = (l48) obj;
        return gb9.v(this.E, l48Var.E) && gb9.v(this.H, l48Var.H) && gb9.v(this.F, l48Var.F) && gb9.v(Boolean.valueOf(this.I), Boolean.valueOf(l48Var.I)) && this.J == l48Var.J;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, this.F, this.H, Boolean.valueOf(this.I), Integer.valueOf(this.J)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.F0(parcel, 1, this.E);
        xn5.F0(parcel, 2, this.F);
        xn5.F0(parcel, 3, this.G);
        xn5.F0(parcel, 4, this.H);
        xn5.J0(parcel, 5, 4);
        parcel.writeInt(this.I ? 1 : 0);
        xn5.J0(parcel, 6, 4);
        parcel.writeInt(this.J);
        xn5.L0(parcel, iK0);
    }
}
