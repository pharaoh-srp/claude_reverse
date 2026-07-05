package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException;
import io.sentry.e0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class uvd extends a4 {
    public static final Parcelable.Creator<uvd> CREATOR;
    public final xvd E;
    public final wik F;
    public final List G;

    static {
        b0k.o(2, qik.b, qik.c);
        CREATOR = new gqj(14);
    }

    public uvd(String str, byte[] bArr, ArrayList arrayList) {
        wik wikVar = wik.G;
        wik wikVarM = wik.m(bArr, bArr.length);
        dgj.v(str);
        try {
            this.E = xvd.a(str);
            this.F = wikVarM;
            this.G = arrayList;
        } catch (PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException e) {
            e0.i(e);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uvd)) {
            return false;
        }
        uvd uvdVar = (uvd) obj;
        List list = uvdVar.G;
        if (!this.E.equals(uvdVar.E) || !gb9.v(this.F, uvdVar.F)) {
            return false;
        }
        List list2 = this.G;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, this.F, this.G});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.E);
        String strR = fd9.R(this.F.o());
        return ij0.m(kgh.r("PublicKeyCredentialDescriptor{\n type=", strValueOf, ", \n id=", strR, ", \n transports="), String.valueOf(this.G), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        this.E.getClass();
        xn5.F0(parcel, 2, "public-key");
        xn5.z0(parcel, 3, this.F.o());
        xn5.I0(parcel, 4, this.G);
        xn5.L0(parcel, iK0);
    }
}
