package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class lzj extends a4 implements Parcelable {
    public static final Parcelable.Creator<lzj> CREATOR = new zwj(5);
    public final String E;
    public final String F;
    public final String G;

    public lzj(String str, String str2, String str3) {
        str.getClass();
        this.E = str;
        str2.getClass();
        this.F = str2;
        str3.getClass();
        this.G = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lzj)) {
            return false;
        }
        lzj lzjVar = (lzj) obj;
        return this.E.equals(lzjVar.E) && gb9.v(lzjVar.F, this.F) && gb9.v(lzjVar.G, this.G);
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    public final String toString() {
        String str = this.E;
        int i = 0;
        for (char c : str.toCharArray()) {
            i += c;
        }
        String strTrim = str.trim();
        int length = strTrim.length();
        if (length > 25) {
            String strSubstring = strTrim.substring(0, 10);
            String strSubstring2 = strTrim.substring(length - 10, length);
            StringBuilder sb = new StringBuilder(strSubstring.length() + 3 + strSubstring2.length() + 2 + String.valueOf(i).length());
            kgh.u(sb, strSubstring, "...", strSubstring2, "::");
            sb.append(i);
            strTrim = sb.toString();
        }
        int length2 = strTrim.length();
        String str2 = this.F;
        int length3 = String.valueOf(str2).length() + length2 + 23;
        String str3 = this.G;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + length3 + 7 + 1);
        sb2.append("Channel{token=");
        sb2.append(strTrim);
        sb2.append(", nodeId=");
        sb2.append(str2);
        return kgh.q(sb2, ", path=", str3, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.F0(parcel, 2, this.E);
        xn5.F0(parcel, 3, this.F);
        xn5.F0(parcel, 4, this.G);
        xn5.L0(parcel, iK0);
    }
}
