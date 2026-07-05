package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class jf7 extends a4 {
    public static final Parcelable.Creator<jf7> CREATOR = new gsc(8);
    public final String E;
    public final int F;
    public final long G;
    public final boolean H;

    public jf7(String str, int i, long j, boolean z) {
        this.E = str;
        this.F = i;
        this.G = j;
        this.H = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jf7) {
            jf7 jf7Var = (jf7) obj;
            if (gb9.v(this.E, jf7Var.E) && l0() == jf7Var.l0() && this.H == jf7Var.H) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, Long.valueOf(l0()), Boolean.valueOf(this.H)});
    }

    public final long l0() {
        long j = this.G;
        return j == -1 ? this.F : j;
    }

    public final String toString() {
        q28 q28Var = new q28(this);
        q28Var.c("name", this.E);
        q28Var.c("version", Long.valueOf(l0()));
        q28Var.c("is_fully_rolled_out", Boolean.valueOf(this.H));
        return q28Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.F0(parcel, 1, this.E);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.F);
        long jL0 = l0();
        xn5.J0(parcel, 3, 8);
        parcel.writeLong(jL0);
        xn5.J0(parcel, 4, 4);
        parcel.writeInt(this.H ? 1 : 0);
        xn5.L0(parcel, iK0);
    }

    public jf7(String str, long j) {
        this(str, -1, j, false);
    }
}
