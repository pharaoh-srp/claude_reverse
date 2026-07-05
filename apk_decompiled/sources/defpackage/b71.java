package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class b71 extends d71 {
    public static final Parcelable.Creator<b71> CREATOR = new xok(13);
    public final wik E;
    public final wik F;
    public final wik G;
    public final String[] H;

    public b71(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        dgj.v(bArr);
        wik wikVarM = wik.m(bArr, bArr.length);
        dgj.v(bArr2);
        wik wikVarM2 = wik.m(bArr2, bArr2.length);
        dgj.v(bArr3);
        wik wikVarM3 = wik.m(bArr3, bArr3.length);
        this.E = wikVarM;
        this.F = wikVarM2;
        this.G = wikVarM3;
        dgj.v(strArr);
        this.H = strArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b71)) {
            return false;
        }
        b71 b71Var = (b71) obj;
        return gb9.v(this.E, b71Var.E) && gb9.v(this.F, b71Var.F) && gb9.v(this.G, b71Var.G);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.E})), Integer.valueOf(Arrays.hashCode(new Object[]{this.F})), Integer.valueOf(Arrays.hashCode(new Object[]{this.G}))});
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x021c A[Catch: JSONException -> 0x01ae, TRY_LEAVE, TryCatch #16 {JSONException -> 0x01ae, blocks: (B:86:0x0206, B:88:0x021c, B:49:0x0140, B:51:0x014b, B:56:0x0160, B:59:0x017c, B:61:0x0191, B:63:0x0196, B:68:0x01b4, B:69:0x01b9, B:70:0x01ba, B:71:0x01bf, B:76:0x01ca, B:78:0x01d7, B:80:0x01e4, B:81:0x01f8, B:82:0x01fd, B:83:0x01fe, B:84:0x0203, B:91:0x0229, B:92:0x022e, B:95:0x0232, B:96:0x0239, B:97:0x023a, B:98:0x0242, B:101:0x0246, B:112:0x0255, B:113:0x025c, B:105:0x024c, B:117:0x0263, B:118:0x026a, B:120:0x026c, B:121:0x0273, B:125:0x027a, B:126:0x0281, B:128:0x0283, B:129:0x028a, B:134:0x0291, B:135:0x0298), top: B:162:0x0059 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject l0() {
        /*
            Method dump skipped, instruction units count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b71.l0():org.json.JSONObject");
    }

    public final String toString() {
        uvj uvjVar = new uvj(getClass().getSimpleName(), 0);
        vfk vfkVar = egk.d;
        byte[] bArrO = this.E.o();
        uvjVar.b("keyHandle", vfkVar.c(bArrO, bArrO.length));
        byte[] bArrO2 = this.F.o();
        uvjVar.b("clientDataJSON", vfkVar.c(bArrO2, bArrO2.length));
        byte[] bArrO3 = this.G.o();
        uvjVar.b("attestationObject", vfkVar.c(bArrO3, bArrO3.length));
        uvjVar.b("transports", Arrays.toString(this.H));
        return uvjVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.z0(parcel, 2, this.E.o());
        xn5.z0(parcel, 3, this.F.o());
        xn5.z0(parcel, 4, this.G.o());
        String[] strArr = this.H;
        if (strArr != null) {
            int iK02 = xn5.K0(parcel, 5);
            parcel.writeStringArray(strArr);
            xn5.L0(parcel, iK02);
        }
        xn5.L0(parcel, iK0);
    }
}
