package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class wo3 extends a4 {
    public static final Parcelable.Creator<wo3> CREATOR = new s38(24);
    public final int E;
    public final String F;

    public wo3(int i, String str) {
        this.E = i;
        this.F = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wo3)) {
            return false;
        }
        wo3 wo3Var = (wo3) obj;
        return wo3Var.E == this.E && gb9.v(wo3Var.F, this.F);
    }

    public final int hashCode() {
        return this.E;
    }

    public final String toString() {
        return this.E + ":" + this.F;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E);
        xn5.F0(parcel, 2, this.F);
        xn5.L0(parcel, iK0);
    }
}
