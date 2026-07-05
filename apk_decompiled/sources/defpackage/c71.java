package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.ErrorCode$UnsupportedErrorCodeException;
import io.sentry.e0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class c71 extends d71 {
    public static final Parcelable.Creator<c71> CREATOR = new xok(18);
    public final wr6 E;
    public final String F;
    public final int G;

    public c71(int i, int i2, String str) {
        try {
            this.E = wr6.a(i);
            this.F = str;
            this.G = i2;
        } catch (ErrorCode$UnsupportedErrorCodeException e) {
            e0.i(e);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c71)) {
            return false;
        }
        c71 c71Var = (c71) obj;
        return gb9.v(this.E, c71Var.E) && gb9.v(this.F, c71Var.F) && gb9.v(Integer.valueOf(this.G), Integer.valueOf(c71Var.G));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, this.F, Integer.valueOf(this.G)});
    }

    public final String toString() {
        uvj uvjVar = new uvj(getClass().getSimpleName(), 0);
        String strValueOf = String.valueOf(this.E.E);
        ivj ivjVar = new ivj(29, false);
        ((lrb) uvjVar.H).H = ivjVar;
        uvjVar.H = ivjVar;
        ivjVar.G = strValueOf;
        ivjVar.F = "errorCode";
        String str = this.F;
        if (str != null) {
            uvjVar.b("errorMessage", str);
        }
        return uvjVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        int i2 = this.E.E;
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(i2);
        xn5.F0(parcel, 3, this.F);
        xn5.J0(parcel, 4, 4);
        parcel.writeInt(this.G);
        xn5.L0(parcel, iK0);
    }
}
