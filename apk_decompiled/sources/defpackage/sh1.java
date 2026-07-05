package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class sh1 extends a4 {
    public static final Parcelable.Creator<sh1> CREATOR = new zmj(13);
    public final boolean E;
    public final String F;

    public sh1(boolean z, String str) {
        if (z) {
            dgj.v(str);
        }
        this.E = z;
        this.F = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh1)) {
            return false;
        }
        sh1 sh1Var = (sh1) obj;
        return this.E == sh1Var.E && gb9.v(this.F, sh1Var.F);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.E), this.F});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E ? 1 : 0);
        xn5.F0(parcel, 2, this.F);
        xn5.L0(parcel, iK0);
    }
}
