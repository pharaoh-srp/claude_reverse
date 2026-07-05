package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class vh1 extends a4 {
    public static final Parcelable.Creator<vh1> CREATOR = new zmj(9);
    public final uh1 E;
    public final rh1 F;
    public final String G;
    public final boolean H;
    public final int I;
    public final th1 J;
    public final sh1 K;
    public final boolean L;

    public vh1(uh1 uh1Var, rh1 rh1Var, String str, boolean z, int i, th1 th1Var, sh1 sh1Var, boolean z2) {
        dgj.v(uh1Var);
        this.E = uh1Var;
        dgj.v(rh1Var);
        this.F = rh1Var;
        this.G = str;
        this.H = z;
        this.I = i;
        this.J = th1Var == null ? new th1(null, false, null) : th1Var;
        this.K = sh1Var == null ? new sh1(false, null) : sh1Var;
        this.L = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vh1)) {
            return false;
        }
        vh1 vh1Var = (vh1) obj;
        return gb9.v(this.E, vh1Var.E) && gb9.v(this.F, vh1Var.F) && gb9.v(this.J, vh1Var.J) && gb9.v(this.K, vh1Var.K) && gb9.v(this.G, vh1Var.G) && this.H == vh1Var.H && this.I == vh1Var.I && this.L == vh1Var.L;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, this.F, this.J, this.K, this.G, Boolean.valueOf(this.H), Integer.valueOf(this.I), Boolean.valueOf(this.L)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.E0(parcel, 1, this.E, i);
        xn5.E0(parcel, 2, this.F, i);
        xn5.F0(parcel, 3, this.G);
        xn5.J0(parcel, 4, 4);
        parcel.writeInt(this.H ? 1 : 0);
        xn5.J0(parcel, 5, 4);
        parcel.writeInt(this.I);
        xn5.E0(parcel, 6, this.J, i);
        xn5.E0(parcel, 7, this.K, i);
        xn5.J0(parcel, 8, 4);
        parcel.writeInt(this.L ? 1 : 0);
        xn5.L0(parcel, iK0);
    }
}
