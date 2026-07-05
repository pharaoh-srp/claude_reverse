package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class km0 extends a4 {
    public static final Parcelable.Creator<km0> CREATOR = new o1l(0);
    public final int E;

    public km0() {
        this.E = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && km0.class == obj.getClass() && this.E == ((km0) obj).E;
    }

    public final int hashCode() {
        return Integer.valueOf(this.E).hashCode();
    }

    public final String toString() {
        int i = this.E;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 28);
        sb.append("Icon { componentAlignment=");
        sb.append(i);
        sb.append(" }");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E);
        xn5.L0(parcel, iK0);
    }

    public km0(int i) {
        this.E = i;
    }
}
