package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException;
import io.sentry.e0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class vvd extends a4 {
    public static final Parcelable.Creator<vvd> CREATOR = new gqj(15);
    public final xvd E;
    public final i42 F;

    public vvd(String str, int i) {
        dgj.v(str);
        try {
            this.E = xvd.a(str);
            try {
                this.F = i42.a(i);
            } catch (COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException e) {
                e0.i(e);
                throw null;
            }
        } catch (PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException e2) {
            e0.i(e2);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vvd)) {
            return false;
        }
        vvd vvdVar = (vvd) obj;
        return this.E.equals(vvdVar.E) && this.F.equals(vvdVar.F);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, this.F});
    }

    public final String toString() {
        return ij0.l("PublicKeyCredentialParameters{\n type=", String.valueOf(this.E), ", \n algorithm=", String.valueOf(this.F), "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        this.E.getClass();
        xn5.F0(parcel, 2, "public-key");
        xn5.C0(parcel, 3, Integer.valueOf(this.F.E.a()));
        xn5.L0(parcel, iK0);
    }
}
