package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class hf0 extends a4 {
    public static final Parcelable.Creator<hf0> CREATOR = dpj.b;
    public static final hf0 H;
    public final m94 E;
    public final boolean F;
    public boolean G;

    static {
        hf0 hf0Var = new hf0(null, false);
        hf0Var.G = false;
        H = hf0Var;
    }

    public hf0(m94 m94Var, boolean z) {
        this.E = m94Var;
        this.F = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hf0)) {
            return false;
        }
        hf0 hf0Var = (hf0) obj;
        return gb9.v(this.E, hf0Var.E) && this.G == hf0Var.G && this.F == hf0Var.F;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, Boolean.valueOf(this.G), Boolean.valueOf(this.F)});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.E);
        return kgh.q(new StringBuilder(strValueOf.length() + 31), "ApiMetadata(complianceOptions=", strValueOf, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.G) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int iK0 = xn5.K0(parcel, 20293);
        xn5.E0(parcel, 1, this.E, i);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.F ? 1 : 0);
        xn5.L0(parcel, iK0);
    }
}
