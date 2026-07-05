package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class wvd extends a4 {
    public static final Parcelable.Creator<wvd> CREATOR = new gqj(16);
    public final String E;
    public final String F;
    public final String G;

    public wvd(String str, String str2, String str3) {
        dgj.v(str);
        this.E = str;
        dgj.v(str2);
        this.F = str2;
        this.G = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wvd)) {
            return false;
        }
        wvd wvdVar = (wvd) obj;
        return gb9.v(this.E, wvdVar.E) && gb9.v(this.F, wvdVar.F) && gb9.v(this.G, wvdVar.G);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, this.F, this.G});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb.append(this.E);
        sb.append("', \n name='");
        sb.append(this.F);
        sb.append("', \n icon='");
        return ij0.m(sb, this.G, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.F0(parcel, 2, this.E);
        xn5.F0(parcel, 3, this.F);
        xn5.F0(parcel, 4, this.G);
        xn5.L0(parcel, iK0);
    }
}
