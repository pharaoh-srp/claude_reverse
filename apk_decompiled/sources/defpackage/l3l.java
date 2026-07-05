package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class l3l extends a4 {
    public static final Parcelable.Creator<l3l> CREATOR = new o1l(6);
    public final boolean E;
    public final List F;

    public l3l(ArrayList arrayList, boolean z) {
        this.E = z;
        this.F = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l3l.class == obj.getClass()) {
            l3l l3lVar = (l3l) obj;
            if (this.E == l3lVar.E && Objects.equals(this.F, l3lVar.F)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.E), this.F);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.F);
        boolean z = this.E;
        StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 59 + strValueOf.length() + 1);
        sb.append("AppWearDetailsParcelable{isWatchface=");
        sb.append(z);
        sb.append(", watchfaceCategories=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E ? 1 : 0);
        xn5.G0(parcel, 2, this.F);
        xn5.L0(parcel, iK0);
    }
}
