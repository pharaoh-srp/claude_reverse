package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class arj extends a4 {
    public static final Parcelable.Creator<arj> CREATOR = new gqj(7);
    public final wik E;
    public final wik F;
    public final wik G;
    public final int H;

    public arj(wik wikVar, wik wikVar2, wik wikVar3, int i) {
        this.E = wikVar;
        this.F = wikVar2;
        this.G = wikVar3;
        this.H = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof arj)) {
            return false;
        }
        arj arjVar = (arj) obj;
        return gb9.v(this.E, arjVar.E) && gb9.v(this.F, arjVar.F) && gb9.v(this.G, arjVar.G) && this.H == arjVar.H;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, this.F, this.G, Integer.valueOf(this.H)});
    }

    public final String toString() {
        wik wikVar = this.E;
        String strR = fd9.R(wikVar == null ? null : wikVar.o());
        wik wikVar2 = this.F;
        String strR2 = fd9.R(wikVar2 == null ? null : wikVar2.o());
        wik wikVar3 = this.G;
        String strR3 = fd9.R(wikVar3 != null ? wikVar3.o() : null);
        StringBuilder sbR = kgh.r("HmacSecretExtension{coseKeyAgreement=", strR, ", saltEnc=", strR2, ", saltAuth=");
        sbR.append(strR3);
        sbR.append(", getPinUvAuthProtocol=");
        return vb7.l(this.H, "}", sbR);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        wik wikVar = this.E;
        xn5.z0(parcel, 1, wikVar == null ? null : wikVar.o());
        wik wikVar2 = this.F;
        xn5.z0(parcel, 2, wikVar2 == null ? null : wikVar2.o());
        wik wikVar3 = this.G;
        xn5.z0(parcel, 3, wikVar3 != null ? wikVar3.o() : null);
        xn5.J0(parcel, 4, 4);
        parcel.writeInt(this.H);
        xn5.L0(parcel, iK0);
    }
}
