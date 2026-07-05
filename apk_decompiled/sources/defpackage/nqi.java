package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class nqi extends a4 {
    public static final Parcelable.Creator<nqi> CREATOR = new gqj(29);
    public final int E;
    public final short F;
    public final short G;

    public nqi(int i, short s, short s2) {
        this.E = i;
        this.F = s;
        this.G = s2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nqi)) {
            return false;
        }
        nqi nqiVar = (nqi) obj;
        return this.E == nqiVar.E && this.F == nqiVar.F && this.G == nqiVar.G;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.E), Short.valueOf(this.F), Short.valueOf(this.G)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.F);
        xn5.J0(parcel, 3, 4);
        parcel.writeInt(this.G);
        xn5.L0(parcel, iK0);
    }
}
