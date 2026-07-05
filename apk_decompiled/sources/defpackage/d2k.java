package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d2k extends a4 {
    public static final Parcelable.Creator<d2k> CREATOR = new zwj(10);
    public final int E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final List J;
    public final String K;
    public final Long L;

    public d2k(int i, boolean z, boolean z2, boolean z3, boolean z4, ArrayList arrayList, String str, Long l) {
        this.E = i;
        this.F = z;
        this.G = z2;
        this.H = z3;
        this.I = z4;
        this.J = arrayList;
        this.K = str;
        this.L = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2k)) {
            return false;
        }
        d2k d2kVar = (d2k) obj;
        if (this.E == d2kVar.E && this.F == d2kVar.F && this.G == d2kVar.G && this.H == d2kVar.H && this.I == d2kVar.I) {
            List list = d2kVar.J;
            List list2 = this.J;
            if (list2 == null || list == null ? list2 == list : !(!list2.containsAll(list) || list2.size() != list.size())) {
                if (gb9.v(this.K, d2kVar.K) && gb9.v(this.L, d2kVar.L)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.E), Boolean.valueOf(this.F), Boolean.valueOf(this.G), Boolean.valueOf(this.H), Boolean.valueOf(this.I), this.J, this.K, this.L});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.J);
        int i = this.E;
        int length = String.valueOf(i).length();
        boolean z = this.F;
        int length2 = String.valueOf(z).length();
        boolean z2 = this.G;
        int length3 = String.valueOf(z2).length();
        boolean z3 = this.H;
        int length4 = String.valueOf(z3).length();
        boolean z4 = this.I;
        int length5 = String.valueOf(z4).length();
        int length6 = strValueOf.length();
        String str = this.K;
        int length7 = String.valueOf(str).length();
        Long l = this.L;
        StringBuilder sb = new StringBuilder(length + 46 + length2 + 21 + length3 + 23 + length4 + 22 + length5 + 25 + length6 + 10 + length7 + 27 + String.valueOf(l).length() + 1);
        sb.append("ConsentResponse {statusCode =");
        sb.append(i);
        sb.append(", hasTosConsent =");
        sb.append(z);
        sb.append(", hasLoggingConsent =");
        sb.append(z2);
        sb.append(", hasCloudSyncConsent =");
        sb.append(z3);
        sb.append(", hasLocationConsent =");
        sb.append(z4);
        sb.append(", accountConsentRecords =");
        sb.append(strValueOf);
        sb.append(", nodeId =");
        sb.append(str);
        sb.append(", lastUpdateRequestedTime =");
        sb.append(l);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.F ? 1 : 0);
        xn5.J0(parcel, 3, 4);
        parcel.writeInt(this.G ? 1 : 0);
        xn5.J0(parcel, 4, 4);
        parcel.writeInt(this.H ? 1 : 0);
        xn5.J0(parcel, 5, 4);
        parcel.writeInt(this.I ? 1 : 0);
        xn5.I0(parcel, 6, this.J);
        xn5.F0(parcel, 7, this.K);
        xn5.D0(parcel, 8, this.L);
        xn5.L0(parcel, iK0);
    }
}
