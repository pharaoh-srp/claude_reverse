package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.TokenBinding$UnsupportedTokenBindingStatusException;
import io.sentry.e0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ksh extends a4 {
    public static final Parcelable.Creator<ksh> CREATOR = new gqj(22);
    public final jsh E;
    public final String F;

    static {
        new ksh("supported", null);
        new ksh("not-supported", null);
    }

    public ksh(String str, String str2) {
        dgj.v(str);
        try {
            this.E = jsh.a(str);
            this.F = str2;
        } catch (TokenBinding$UnsupportedTokenBindingStatusException e) {
            e0.i(e);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ksh)) {
            return false;
        }
        ksh kshVar = (ksh) obj;
        return yok.l(this.E, kshVar.E) && yok.l(this.F, kshVar.F);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, this.F});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.F0(parcel, 2, this.E.E);
        xn5.F0(parcel, 3, this.F);
        xn5.L0(parcel, iK0);
    }
}
