package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class im0 extends a4 {
    public static final Parcelable.Creator<im0> CREATOR = new xok(20);
    public final int E;
    public final int F;

    public im0() {
        this.E = 0;
        this.F = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && im0.class == obj.getClass()) {
            im0 im0Var = (im0) obj;
            if (this.E == im0Var.E && this.F == im0Var.F) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.E), Integer.valueOf(this.F));
    }

    public final String toString() {
        int i = this.E;
        int length = String.valueOf(i).length();
        int i2 = this.F;
        StringBuilder sb = new StringBuilder(length + 39 + String.valueOf(i2).length() + 2);
        ij0.s(i, i2, "Description { textAlignment=", ", textSize=", sb);
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
        xn5.L0(parcel, iK0);
    }

    public im0(int i, int i2) {
        this.E = i;
        this.F = i2;
    }
}
