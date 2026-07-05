package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gsj extends a4 {
    public static final Parcelable.Creator<gsj> CREATOR = new gqj(13);
    public final String E;
    public final List F;

    public gsj(String str, ArrayList arrayList) {
        this.E = str;
        this.F = arrayList;
        dgj.v(str);
        dgj.v(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gsj.class != obj.getClass()) {
            return false;
        }
        gsj gsjVar = (gsj) obj;
        String str = gsjVar.E;
        String str2 = this.E;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        List list = gsjVar.F;
        List list2 = this.F;
        return list2 == null ? list == null : list2.equals(list);
    }

    public final int hashCode() {
        String str = this.E;
        int iHashCode = str != null ? str.hashCode() : 0;
        List list = this.F;
        return ((iHashCode + 31) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.F);
        String str = this.E;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 17 + strValueOf.length() + 1);
        kgh.u(sb, "CapabilityInfo{", str, ", ", strValueOf);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.F0(parcel, 2, this.E);
        xn5.I0(parcel, 3, this.F);
        xn5.L0(parcel, iK0);
    }
}
