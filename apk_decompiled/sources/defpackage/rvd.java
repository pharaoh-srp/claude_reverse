package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class rvd extends a4 {
    public static final Parcelable.Creator<rvd> CREATOR = new gqj(12);
    public final String E;
    public final String F;
    public final wik G;
    public final b71 H;
    public final a71 I;
    public final c71 J;
    public final y61 K;
    public final String L;

    public rvd(String str, String str2, byte[] bArr, b71 b71Var, a71 a71Var, c71 c71Var, y61 y61Var, String str3) {
        wik wikVarM = bArr == null ? null : wik.m(bArr, bArr.length);
        boolean z = false;
        dgj.n("Must provide a response object.", (b71Var != null && a71Var == null && c71Var == null) || (b71Var == null && a71Var != null && c71Var == null) || (b71Var == null && a71Var == null && c71Var != null));
        if (c71Var != null || (str != null && wikVarM != null)) {
            z = true;
        }
        dgj.n("Must provide id and rawId if not an error response.", z);
        this.E = str;
        this.F = str2;
        this.G = wikVarM;
        this.H = b71Var;
        this.I = a71Var;
        this.J = c71Var;
        this.K = y61Var;
        this.L = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rvd)) {
            return false;
        }
        rvd rvdVar = (rvd) obj;
        return gb9.v(this.E, rvdVar.E) && gb9.v(this.F, rvdVar.F) && gb9.v(this.G, rvdVar.G) && gb9.v(this.H, rvdVar.H) && gb9.v(this.I, rvdVar.I) && gb9.v(this.J, rvdVar.J) && gb9.v(this.K, rvdVar.K) && gb9.v(this.L, rvdVar.L);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, this.F, this.G, this.I, this.H, this.J, this.K, this.L});
    }

    public final String toString() {
        wik wikVar = this.G;
        String strR = fd9.R(wikVar == null ? null : wikVar.o());
        String strValueOf = String.valueOf(this.H);
        String strValueOf2 = String.valueOf(this.I);
        String strValueOf3 = String.valueOf(this.J);
        String strValueOf4 = String.valueOf(this.K);
        StringBuilder sbR = kgh.r("PublicKeyCredential{\n id='", this.E, "', \n type='", this.F, "', \n rawId=");
        kgh.u(sbR, strR, ", \n registerResponse=", strValueOf, ", \n signResponse=");
        kgh.u(sbR, strValueOf2, ", \n errorResponse=", strValueOf3, ", \n extensionsClientOutputs=");
        return vb7.t(sbR, strValueOf4, ", \n authenticatorAttachment='", this.L, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        wnk.a.a();
        throw null;
    }
}
