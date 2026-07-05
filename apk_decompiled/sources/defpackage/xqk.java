package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class xqk extends a4 {
    public static final Parcelable.Creator<xqk> CREATOR = new xok(11);
    public final byte E;
    public final byte F;
    public final String G;

    public xqk(byte b, byte b2, String str) {
        this.E = b;
        this.F = b2;
        this.G = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xqk.class != obj.getClass()) {
            return false;
        }
        xqk xqkVar = (xqk) obj;
        return this.E == xqkVar.E && this.F == xqkVar.F && this.G.equals(xqkVar.G);
    }

    public final int hashCode() {
        return this.G.hashCode() + ((((this.E + 31) * 31) + this.F) * 31);
    }

    public final String toString() {
        byte b = this.E;
        int length = String.valueOf((int) b).length();
        byte b2 = this.F;
        int length2 = String.valueOf((int) b2).length();
        String str = this.G;
        StringBuilder sb = new StringBuilder(length + 53 + length2 + 10 + String.valueOf(str).length() + 2);
        ij0.s(b, b2, "AmsEntityUpdateParcelable{, mEntityId=", ", mAttributeId=", sb);
        return kgh.q(sb, ", mValue='", str, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.E);
        xn5.J0(parcel, 3, 4);
        parcel.writeInt(this.F);
        xn5.F0(parcel, 4, this.G);
        xn5.L0(parcel, iK0);
    }
}
