package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class a71 extends d71 {
    public static final Parcelable.Creator<a71> CREATOR = new xok(9);
    public final wik E;
    public final wik F;
    public final wik G;
    public final wik H;
    public final wik I;

    public a71(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        dgj.v(bArr);
        wik wikVarM = wik.m(bArr, bArr.length);
        dgj.v(bArr2);
        wik wikVarM2 = wik.m(bArr2, bArr2.length);
        dgj.v(bArr3);
        wik wikVarM3 = wik.m(bArr3, bArr3.length);
        dgj.v(bArr4);
        wik wikVarM4 = wik.m(bArr4, bArr4.length);
        wik wikVarM5 = bArr5 == null ? null : wik.m(bArr5, bArr5.length);
        this.E = wikVarM;
        this.F = wikVarM2;
        this.G = wikVarM3;
        this.H = wikVarM4;
        this.I = wikVarM5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a71)) {
            return false;
        }
        a71 a71Var = (a71) obj;
        return gb9.v(this.E, a71Var.E) && gb9.v(this.F, a71Var.F) && gb9.v(this.G, a71Var.G) && gb9.v(this.H, a71Var.H) && gb9.v(this.I, a71Var.I);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.E})), Integer.valueOf(Arrays.hashCode(new Object[]{this.F})), Integer.valueOf(Arrays.hashCode(new Object[]{this.G})), Integer.valueOf(Arrays.hashCode(new Object[]{this.H})), Integer.valueOf(Arrays.hashCode(new Object[]{this.I}))});
    }

    public final JSONObject l0() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", fd9.R(this.F.o()));
            jSONObject.put("authenticatorData", fd9.R(this.G.o()));
            jSONObject.put("signature", fd9.R(this.H.o()));
            wik wikVar = this.I;
            if (wikVar == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", fd9.R(wikVar == null ? null : wikVar.o()));
            return jSONObject;
        } catch (JSONException e) {
            xh6.f("Error encoding AuthenticatorAssertionResponse to JSON object", e);
            return null;
        }
    }

    public final String toString() {
        uvj uvjVar = new uvj(getClass().getSimpleName(), 0);
        vfk vfkVar = egk.d;
        byte[] bArrO = this.E.o();
        uvjVar.b("keyHandle", vfkVar.c(bArrO, bArrO.length));
        byte[] bArrO2 = this.F.o();
        uvjVar.b("clientDataJSON", vfkVar.c(bArrO2, bArrO2.length));
        byte[] bArrO3 = this.G.o();
        uvjVar.b("authenticatorData", vfkVar.c(bArrO3, bArrO3.length));
        byte[] bArrO4 = this.H.o();
        uvjVar.b("signature", vfkVar.c(bArrO4, bArrO4.length));
        wik wikVar = this.I;
        byte[] bArrO5 = wikVar == null ? null : wikVar.o();
        if (bArrO5 != null) {
            uvjVar.b("userHandle", vfkVar.c(bArrO5, bArrO5.length));
        }
        return uvjVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.z0(parcel, 2, this.E.o());
        xn5.z0(parcel, 3, this.F.o());
        xn5.z0(parcel, 4, this.G.o());
        xn5.z0(parcel, 5, this.H.o());
        wik wikVar = this.I;
        xn5.z0(parcel, 6, wikVar == null ? null : wikVar.o());
        xn5.L0(parcel, iK0);
    }
}
