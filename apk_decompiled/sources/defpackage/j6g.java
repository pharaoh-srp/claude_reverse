package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class j6g extends a4 {
    public static final Parcelable.Creator<j6g> CREATOR = new zmj(19);
    public final String E;
    public final String F;
    public final String G;
    public final String H;
    public final Uri I;
    public final String J;
    public final String K;
    public final String L;
    public final rvd M;

    public j6g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, rvd rvdVar) {
        dgj.v(str);
        this.E = str;
        this.F = str2;
        this.G = str3;
        this.H = str4;
        this.I = uri;
        this.J = str5;
        this.K = str6;
        this.L = str7;
        this.M = rvdVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j6g)) {
            return false;
        }
        j6g j6gVar = (j6g) obj;
        return gb9.v(this.E, j6gVar.E) && gb9.v(this.F, j6gVar.F) && gb9.v(this.G, j6gVar.G) && gb9.v(this.H, j6gVar.H) && gb9.v(this.I, j6gVar.I) && gb9.v(this.J, j6gVar.J) && gb9.v(this.K, j6gVar.K) && gb9.v(this.L, j6gVar.L) && gb9.v(this.M, j6gVar.M);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.F0(parcel, 1, this.E);
        xn5.F0(parcel, 2, this.F);
        xn5.F0(parcel, 3, this.G);
        xn5.F0(parcel, 4, this.H);
        xn5.E0(parcel, 5, this.I, i);
        xn5.F0(parcel, 6, this.J);
        xn5.F0(parcel, 7, this.K);
        xn5.F0(parcel, 8, this.L);
        xn5.E0(parcel, 9, this.M, i);
        xn5.L0(parcel, iK0);
    }
}
