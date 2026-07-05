package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class jd5 extends a4 {
    public static final Parcelable.Creator<jd5> CREATOR = new xok(7);
    public final long E;
    public final int F;
    public final int G;
    public final long H;
    public final boolean I;
    public final int J;
    public final WorkSource K;
    public final j7k L;

    public jd5(long j, int i, int i2, long j2, boolean z, int i3, WorkSource workSource, j7k j7kVar) {
        this.E = j;
        this.F = i;
        this.G = i2;
        this.H = j2;
        this.I = z;
        this.J = i3;
        this.K = workSource;
        this.L = j7kVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jd5)) {
            return false;
        }
        jd5 jd5Var = (jd5) obj;
        return this.E == jd5Var.E && this.F == jd5Var.F && this.G == jd5Var.G && this.H == jd5Var.H && this.I == jd5Var.I && this.J == jd5Var.J && gb9.v(this.K, jd5Var.K) && gb9.v(this.L, jd5Var.L);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.E), Integer.valueOf(this.F), Integer.valueOf(this.G), Long.valueOf(this.H)});
    }

    public final String toString() {
        StringBuilder sbO = ij0.o("CurrentLocationRequest[");
        sbO.append(bsj.c(this.G));
        long j = this.E;
        if (j != Long.MAX_VALUE) {
            sbO.append(", maxAge=");
            j9k.b(j, sbO);
        }
        long j2 = this.H;
        if (j2 != Long.MAX_VALUE) {
            ij0.u(j2, ", duration=", "ms", sbO);
        }
        int i = this.F;
        if (i != 0) {
            sbO.append(", ");
            sbO.append(lsk.f(i));
        }
        if (this.I) {
            sbO.append(", bypass");
        }
        int i2 = this.J;
        if (i2 != 0) {
            sbO.append(", ");
            sbO.append(pok.j(i2));
        }
        WorkSource workSource = this.K;
        if (!qgj.b(workSource)) {
            sbO.append(", workSource=");
            sbO.append(workSource);
        }
        j7k j7kVar = this.L;
        if (j7kVar != null) {
            sbO.append(", impersonation=");
            sbO.append(j7kVar);
        }
        sbO.append(']');
        return sbO.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 8);
        parcel.writeLong(this.E);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.F);
        xn5.J0(parcel, 3, 4);
        parcel.writeInt(this.G);
        xn5.J0(parcel, 4, 8);
        parcel.writeLong(this.H);
        xn5.J0(parcel, 5, 4);
        parcel.writeInt(this.I ? 1 : 0);
        xn5.E0(parcel, 6, this.K, i);
        xn5.J0(parcel, 7, 4);
        parcel.writeInt(this.J);
        xn5.E0(parcel, 9, this.L, i);
        xn5.L0(parcel, iK0);
    }
}
