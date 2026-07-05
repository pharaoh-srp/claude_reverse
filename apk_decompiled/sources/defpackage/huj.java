package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class huj extends a4 {
    public static final Parcelable.Creator<huj> CREATOR = new zwj(2);
    public final String E;
    public final boolean F;

    public huj(String str, boolean z) {
        this.E = str;
        this.F = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof huj)) {
            return false;
        }
        huj hujVar = (huj) obj;
        return this.E.equals(hujVar.E) && this.F == hujVar.F;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, Boolean.valueOf(this.F)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.F0(parcel, 1, this.E);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.F ? 1 : 0);
        xn5.L0(parcel, iK0);
    }
}
