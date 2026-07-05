package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class rvj extends a4 {
    public static final Parcelable.Creator<rvj> CREATOR = new gsc(10);
    public final String E;
    public final avj F;
    public final String G;
    public final long H;

    public rvj(rvj rvjVar, long j) {
        dgj.v(rvjVar);
        this.E = rvjVar.E;
        this.F = rvjVar.F;
        this.G = rvjVar.G;
        this.H = j;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.F);
        StringBuilder sbR = kgh.r("origin=", this.G, ",name=", this.E, ",params=");
        sbR.append(strValueOf);
        return sbR.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.F0(parcel, 2, this.E);
        xn5.E0(parcel, 3, this.F, i);
        xn5.F0(parcel, 4, this.G);
        xn5.J0(parcel, 5, 8);
        parcel.writeLong(this.H);
        xn5.L0(parcel, iK0);
    }

    public rvj(String str, avj avjVar, String str2, long j) {
        this.E = str;
        this.F = avjVar;
        this.G = str2;
        this.H = j;
    }
}
