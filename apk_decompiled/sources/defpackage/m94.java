package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class m94 extends a4 {
    public static final Parcelable.Creator<m94> CREATOR = new zwj(3);
    public final int E;
    public final int F;
    public final int G;
    public final boolean H;

    public m94(boolean z, int i, int i2, int i3) {
        this.E = i;
        this.F = i2;
        this.G = i3;
        this.H = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m94)) {
            return false;
        }
        m94 m94Var = (m94) obj;
        return this.E == m94Var.E && this.F == m94Var.F && this.G == m94Var.G && this.H == m94Var.H;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.E), Integer.valueOf(this.F), Integer.valueOf(this.G), Boolean.valueOf(this.H)});
    }

    public final String toString() {
        int i = this.E;
        int length = String.valueOf(i).length();
        int i2 = this.F;
        int length2 = String.valueOf(i2).length();
        int i3 = this.G;
        int length3 = String.valueOf(i3).length();
        boolean z = this.H;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z).length() + 1);
        ij0.s(i, i2, "ComplianceOptions{callerProductId=", ", dataOwnerProductId=", sb);
        sb.append(", processingReason=");
        sb.append(i3);
        sb.append(", isUserData=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.F);
        xn5.J0(parcel, 3, 4);
        parcel.writeInt(this.G);
        xn5.J0(parcel, 4, 4);
        parcel.writeInt(this.H ? 1 : 0);
        xn5.L0(parcel, iK0);
    }
}
