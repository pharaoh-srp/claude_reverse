package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class pzk extends a4 {
    public static final Parcelable.Creator<pzk> CREATOR = new xok(28);
    public final String E;
    public final String F;
    public final hwk G;
    public final String H;
    public final String I;
    public final Float J;
    public final l3l K;

    public pzk(String str, String str2, hwk hwkVar, String str3, String str4, Float f, l3l l3lVar) {
        this.E = str;
        this.F = str2;
        this.G = hwkVar;
        this.H = str3;
        this.I = str4;
        this.J = f;
        this.K = l3lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pzk.class == obj.getClass()) {
            pzk pzkVar = (pzk) obj;
            if (Objects.equals(this.E, pzkVar.E) && Objects.equals(this.F, pzkVar.F) && Objects.equals(this.G, pzkVar.G) && Objects.equals(this.H, pzkVar.H) && Objects.equals(this.I, pzkVar.I) && Objects.equals(this.J, pzkVar.J) && Objects.equals(this.K, pzkVar.K)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.E, this.F, this.G, this.H, this.I, this.J, this.K);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.K);
        String strValueOf2 = String.valueOf(this.G);
        String str = this.F;
        int length = String.valueOf(str).length();
        String str2 = this.H;
        int length2 = String.valueOf(str2).length();
        String str3 = this.I;
        int length3 = String.valueOf(str3).length();
        Float f = this.J;
        int length4 = String.valueOf(f).length();
        int length5 = strValueOf.length();
        String str4 = this.E;
        StringBuilder sb = new StringBuilder(length + 39 + length2 + 19 + length3 + 14 + length4 + 14 + length5 + 15 + String.valueOf(str4).length() + 8 + strValueOf2.length() + 1);
        kgh.u(sb, "AppParcelable{title='", str, "', developerName='", str2);
        sb.append("', formattedPrice='");
        sb.append(str3);
        sb.append("', starRating=");
        sb.append(f);
        kgh.u(sb, ", wearDetails=", strValueOf, ", deepLinkUri='", str4);
        return kgh.q(sb, "', icon=", strValueOf2, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.F0(parcel, 1, this.E);
        xn5.F0(parcel, 2, this.F);
        xn5.E0(parcel, 3, this.G, i);
        xn5.F0(parcel, 4, this.H);
        xn5.F0(parcel, 5, this.I);
        xn5.A0(parcel, 6, this.J);
        xn5.E0(parcel, 7, this.K, i);
        xn5.L0(parcel, iK0);
    }
}
