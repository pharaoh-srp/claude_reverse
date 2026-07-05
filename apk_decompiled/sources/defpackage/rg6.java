package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class rg6 implements Comparator, Parcelable {
    public static final Parcelable.Creator<rg6> CREATOR = new dpj(23);
    public final qg6[] E;
    public int F;
    public final String G;
    public final int H;

    public rg6(Parcel parcel) {
        this.G = parcel.readString();
        qg6[] qg6VarArr = (qg6[]) parcel.createTypedArray(qg6.CREATOR);
        String str = tpi.a;
        this.E = qg6VarArr;
        this.H = qg6VarArr.length;
    }

    public final rg6 a(String str) {
        return Objects.equals(this.G, str) ? this : new rg6(str, false, this.E);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        qg6 qg6Var = (qg6) obj;
        qg6 qg6Var2 = (qg6) obj2;
        UUID uuid = o22.a;
        return uuid.equals(qg6Var.F) ? uuid.equals(qg6Var2.F) ? 0 : 1 : qg6Var.F.compareTo(qg6Var2.F);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rg6.class == obj.getClass()) {
            rg6 rg6Var = (rg6) obj;
            if (Objects.equals(this.G, rg6Var.G) && Arrays.equals(this.E, rg6Var.E)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.F == 0) {
            String str = this.G;
            this.F = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.E);
        }
        return this.F;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.G);
        parcel.writeTypedArray(this.E, 0);
    }

    public rg6(String str, boolean z, qg6... qg6VarArr) {
        this.G = str;
        qg6VarArr = z ? (qg6[]) qg6VarArr.clone() : qg6VarArr;
        this.E = qg6VarArr;
        this.H = qg6VarArr.length;
        Arrays.sort(qg6VarArr, this);
    }
}
