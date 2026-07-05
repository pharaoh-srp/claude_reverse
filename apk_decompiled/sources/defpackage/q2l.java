package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class q2l extends a4 {
    public static final Parcelable.Creator<q2l> CREATOR = new o1l(5);
    public final long E;
    public final wik F;
    public final wik G;
    public final wik H;

    public q2l(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        dgj.v(bArr);
        wik wikVarM = wik.m(bArr, bArr.length);
        dgj.v(bArr2);
        wik wikVarM2 = wik.m(bArr2, bArr2.length);
        dgj.v(bArr3);
        wik wikVarM3 = wik.m(bArr3, bArr3.length);
        this.E = j;
        this.F = wikVarM;
        this.G = wikVarM2;
        this.H = wikVarM3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q2l)) {
            return false;
        }
        q2l q2lVar = (q2l) obj;
        return this.E == q2lVar.E && gb9.v(this.F, q2lVar.F) && gb9.v(this.G, q2lVar.G) && gb9.v(this.H, q2lVar.H);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.E), this.F, this.G, this.H});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 8);
        parcel.writeLong(this.E);
        xn5.z0(parcel, 2, this.F.o());
        xn5.z0(parcel, 3, this.G.o());
        xn5.z0(parcel, 4, this.H.o());
        xn5.L0(parcel, iK0);
    }
}
