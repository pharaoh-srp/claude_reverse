package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ct9 extends a4 {
    public static final Parcelable.Creator<ct9> CREATOR = new zmj(25);
    public final long E;
    public final int F;
    public final boolean G;
    public final j7k H;

    public ct9(long j, int i, boolean z, j7k j7kVar) {
        this.E = j;
        this.F = i;
        this.G = z;
        this.H = j7kVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ct9)) {
            return false;
        }
        ct9 ct9Var = (ct9) obj;
        return this.E == ct9Var.E && this.F == ct9Var.F && this.G == ct9Var.G && gb9.v(this.H, ct9Var.H);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.E), Integer.valueOf(this.F), Boolean.valueOf(this.G)});
    }

    public final String toString() {
        StringBuilder sbO = ij0.o("LastLocationRequest[");
        long j = this.E;
        if (j != Long.MAX_VALUE) {
            sbO.append("maxAge=");
            j9k.b(j, sbO);
        }
        int i = this.F;
        if (i != 0) {
            sbO.append(", ");
            sbO.append(lsk.f(i));
        }
        if (this.G) {
            sbO.append(", bypass");
        }
        j7k j7kVar = this.H;
        if (j7kVar != null) {
            sbO.append(", impersonation=");
            sbO.append(j7kVar);
        }
        sbO.append(']');
        return sbO.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 8);
        parcel.writeLong(this.E);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.F);
        xn5.J0(parcel, 3, 4);
        parcel.writeInt(this.G ? 1 : 0);
        xn5.E0(parcel, 5, this.H, i);
        xn5.L0(parcel, iK0);
    }
}
