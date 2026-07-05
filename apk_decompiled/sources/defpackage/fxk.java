package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class fxk extends a4 {
    public static final Parcelable.Creator<fxk> CREATOR = new xok(21);
    public final int E;
    public final String F;
    public final String G;
    public final String H;
    public final String I;
    public final String J;
    public final String K;
    public final byte L;
    public final byte M;
    public final byte N;
    public final byte O;
    public final String P;

    public fxk(int i, String str, String str2, String str3, String str4, String str5, String str6, byte b, byte b2, byte b3, byte b4, String str7) {
        this.E = i;
        this.F = str;
        this.G = str2;
        this.H = str3;
        this.I = str4;
        this.J = str5;
        this.K = str6;
        this.L = b;
        this.M = b2;
        this.N = b3;
        this.O = b4;
        this.P = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fxk.class != obj.getClass()) {
            return false;
        }
        fxk fxkVar = (fxk) obj;
        if (this.E != fxkVar.E || this.L != fxkVar.L || this.M != fxkVar.M || this.N != fxkVar.N || this.O != fxkVar.O || !this.F.equals(fxkVar.F)) {
            return false;
        }
        String str = fxkVar.G;
        String str2 = this.G;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        if (!this.H.equals(fxkVar.H) || !this.I.equals(fxkVar.I) || !this.J.equals(fxkVar.J)) {
            return false;
        }
        String str3 = fxkVar.K;
        String str4 = this.K;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        String str5 = fxkVar.P;
        String str6 = this.P;
        return str6 != null ? str6.equals(str5) : str5 == null;
    }

    public final int hashCode() {
        int iHashCode = this.F.hashCode() + ((this.E + 31) * 31);
        String str = this.G;
        int iL = kgh.l(kgh.l(kgh.l(((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31, 31, this.H), 31, this.I), 31, this.J);
        String str2 = this.K;
        int iHashCode2 = (((((((((iL + (str2 != null ? str2.hashCode() : 0)) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31;
        String str3 = this.P;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        int i = this.E;
        int length = String.valueOf(i).length();
        String str = this.F;
        int length2 = String.valueOf(str).length();
        String str2 = this.G;
        int length3 = String.valueOf(str2).length();
        byte b = this.L;
        int length4 = String.valueOf((int) b).length();
        byte b2 = this.M;
        int length5 = String.valueOf((int) b2).length();
        byte b3 = this.N;
        int length6 = String.valueOf((int) b3).length();
        byte b4 = this.O;
        int length7 = String.valueOf((int) b4).length();
        String str3 = this.P;
        StringBuilder sb = new StringBuilder(length + 41 + length2 + 13 + length3 + 11 + length4 + 13 + length5 + 13 + length6 + 16 + length7 + 15 + String.valueOf(str3).length() + 2);
        sb.append("AncsNotificationParcelable{, id=");
        sb.append(i);
        sb.append(", appId='");
        sb.append(str);
        sb.append("', dateTime='");
        sb.append(str2);
        sb.append("', eventId=");
        sb.append((int) b);
        ij0.s(b2, b3, ", eventFlags=", ", categoryId=", sb);
        sb.append(", categoryCount=");
        sb.append((int) b4);
        sb.append(", packageName='");
        sb.append(str3);
        sb.append("'}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.E);
        String str = this.F;
        xn5.F0(parcel, 3, str);
        xn5.F0(parcel, 4, this.G);
        xn5.F0(parcel, 5, this.H);
        xn5.F0(parcel, 6, this.I);
        xn5.F0(parcel, 7, this.J);
        String str2 = this.K;
        if (str2 != null) {
            str = str2;
        }
        xn5.F0(parcel, 8, str);
        xn5.J0(parcel, 9, 4);
        parcel.writeInt(this.L);
        xn5.J0(parcel, 10, 4);
        parcel.writeInt(this.M);
        xn5.J0(parcel, 11, 4);
        parcel.writeInt(this.N);
        xn5.J0(parcel, 12, 4);
        parcel.writeInt(this.O);
        xn5.F0(parcel, 13, this.P);
        xn5.L0(parcel, iK0);
    }
}
