package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class rnk extends a4 {
    public static final Parcelable.Creator<rnk> CREATOR = new pak(27);
    public final String E;
    public final String F;
    public final int G;
    public final boolean H;

    public rnk(String str, String str2, int i, boolean z) {
        this.E = str;
        this.F = str2;
        this.G = i;
        this.H = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rnk) {
            return ((rnk) obj).E.equals(this.E);
        }
        return false;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    public final String toString() {
        String str = this.F;
        int length = String.valueOf(str).length();
        String str2 = this.E;
        int length2 = String.valueOf(str2).length();
        int i = this.G;
        int length3 = String.valueOf(i).length();
        boolean z = this.H;
        StringBuilder sb = new StringBuilder(length + 10 + length2 + 7 + length3 + 11 + String.valueOf(z).length() + 1);
        kgh.u(sb, "Node{", str, ", id=", str2);
        sb.append(", hops=");
        sb.append(i);
        sb.append(", isNearby=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.F0(parcel, 2, this.E);
        xn5.F0(parcel, 3, this.F);
        xn5.J0(parcel, 4, 4);
        parcel.writeInt(this.G);
        xn5.J0(parcel, 5, 4);
        parcel.writeInt(this.H ? 1 : 0);
        xn5.L0(parcel, iK0);
    }
}
