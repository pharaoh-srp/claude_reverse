package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class hm0 extends a4 {
    public static final Parcelable.Creator<hm0> CREATOR = new zwj(14);
    public final int E;
    public final int F;
    public final int G;

    public hm0() {
        this.E = 0;
        this.F = 0;
        this.G = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hm0.class == obj.getClass()) {
            hm0 hm0Var = (hm0) obj;
            if (this.E == hm0Var.E && this.F == hm0Var.F && this.G == hm0Var.G) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.E), Integer.valueOf(this.F), Integer.valueOf(this.G));
    }

    public final String toString() {
        int i = this.E;
        int length = String.valueOf(i).length();
        int i2 = this.F;
        int length2 = String.valueOf(i2).length();
        int i3 = this.G;
        StringBuilder sb = new StringBuilder(length + 37 + length2 + 15 + String.valueOf(i3).length() + 2);
        ij0.s(i, i2, "CallToAction { textSize=", ", buttonSize=", sb);
        sb.append(", cornerRadius=");
        sb.append(i3);
        sb.append(" }");
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
        xn5.L0(parcel, iK0);
    }

    public hm0(int i, int i2, int i3) {
        this.E = i;
        this.F = i2;
        this.G = i3;
    }
}
