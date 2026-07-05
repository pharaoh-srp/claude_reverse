package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class yvd extends a4 {
    public static final Parcelable.Creator<yvd> CREATOR = new gqj(18);
    public final wik E;
    public final String F;
    public final String G;
    public final String H;

    public yvd(String str, String str2, String str3, byte[] bArr) {
        dgj.v(bArr);
        this.E = wik.m(bArr, bArr.length);
        dgj.v(str);
        this.F = str;
        this.G = str2;
        dgj.v(str3);
        this.H = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yvd)) {
            return false;
        }
        yvd yvdVar = (yvd) obj;
        return gb9.v(this.E, yvdVar.E) && gb9.v(this.F, yvdVar.F) && gb9.v(this.G, yvdVar.G) && gb9.v(this.H, yvdVar.H);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, this.F, this.G, this.H});
    }

    public final String toString() {
        StringBuilder sbX = sq6.x("PublicKeyCredentialUserEntity{\n id=", fd9.R(this.E.o()), ", \n name='");
        sbX.append(this.F);
        sbX.append("', \n icon='");
        sbX.append(this.G);
        sbX.append("', \n displayName='");
        return ij0.m(sbX, this.H, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.z0(parcel, 2, this.E.o());
        xn5.F0(parcel, 3, this.F);
        xn5.F0(parcel, 4, this.G);
        xn5.F0(parcel, 5, this.H);
        xn5.L0(parcel, iK0);
    }
}
