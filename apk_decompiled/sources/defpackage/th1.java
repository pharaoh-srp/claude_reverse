package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class th1 extends a4 {
    public static final Parcelable.Creator<th1> CREATOR = new zmj(14);
    public final boolean E;
    public final byte[] F;
    public final String G;

    public th1(String str, boolean z, byte[] bArr) {
        if (z) {
            dgj.v(bArr);
            dgj.v(str);
        }
        this.E = z;
        this.F = bArr;
        this.G = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th1)) {
            return false;
        }
        th1 th1Var = (th1) obj;
        return this.E == th1Var.E && Arrays.equals(this.F, th1Var.F) && Objects.equals(this.G, th1Var.G);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.F) + (Objects.hash(Boolean.valueOf(this.E), this.G) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E ? 1 : 0);
        xn5.z0(parcel, 2, this.F);
        xn5.F0(parcel, 3, this.G);
        xn5.L0(parcel, iK0);
    }
}
