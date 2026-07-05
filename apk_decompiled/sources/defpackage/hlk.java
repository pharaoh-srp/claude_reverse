package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class hlk extends a4 {
    public static final Parcelable.Creator<hlk> CREATOR = new pak(23);
    public final int E;
    public final String F;
    public final byte[] G;
    public final String H;

    public hlk(int i, String str, String str2, byte[] bArr) {
        this.E = i;
        this.F = str;
        this.G = bArr;
        this.H = str2;
    }

    public final String toString() {
        byte[] bArr = this.G;
        String string = (bArr == null ? "null" : Integer.valueOf(bArr.length)).toString();
        int i = this.E;
        int length = String.valueOf(i).length();
        String str = this.F;
        StringBuilder sb = new StringBuilder(string.length() + String.valueOf(str).length() + length + 24 + 7 + 1);
        sb.append("MessageEventParcelable[");
        sb.append(i);
        sb.append(",");
        sb.append(str);
        return kgh.q(sb, ", size=", string, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.E);
        xn5.F0(parcel, 3, this.F);
        xn5.z0(parcel, 4, this.G);
        xn5.F0(parcel, 5, this.H);
        xn5.L0(parcel, iK0);
    }
}
