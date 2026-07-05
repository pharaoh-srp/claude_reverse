package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class jm0 extends a4 {
    public static final Parcelable.Creator<jm0> CREATOR = new xok(27);
    public final int E;
    public final int F;
    public final int G;

    public jm0() {
        this.E = 0;
        this.F = 0;
        this.G = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jm0.class == obj.getClass()) {
            jm0 jm0Var = (jm0) obj;
            if (this.E == jm0Var.E && this.F == jm0Var.F && this.G == jm0Var.G) {
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
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 11 + String.valueOf(i3).length() + 2);
        ij0.s(i, i2, "Headline { textAlignment=", ", textWeight=", sb);
        sb.append(", textSize=");
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

    public jm0(int i, int i2, int i3) {
        this.E = i;
        this.F = i2;
        this.G = i3;
    }
}
