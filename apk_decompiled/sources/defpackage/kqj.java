package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class kqj extends a4 {
    public static final Parcelable.Creator<kqj> CREATOR = new gqj(0);
    public String E;
    public String F;
    public e1l G;
    public long H;
    public boolean I;
    public String J;
    public final rvj K;
    public long L;
    public rvj M;
    public final long N;
    public final rvj O;

    public kqj(kqj kqjVar) {
        dgj.v(kqjVar);
        this.E = kqjVar.E;
        this.F = kqjVar.F;
        this.G = kqjVar.G;
        this.H = kqjVar.H;
        this.I = kqjVar.I;
        this.J = kqjVar.J;
        this.K = kqjVar.K;
        this.L = kqjVar.L;
        this.M = kqjVar.M;
        this.N = kqjVar.N;
        this.O = kqjVar.O;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.F0(parcel, 2, this.E);
        xn5.F0(parcel, 3, this.F);
        xn5.E0(parcel, 4, this.G, i);
        long j = this.H;
        xn5.J0(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z = this.I;
        xn5.J0(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        xn5.F0(parcel, 7, this.J);
        xn5.E0(parcel, 8, this.K, i);
        long j2 = this.L;
        xn5.J0(parcel, 9, 8);
        parcel.writeLong(j2);
        xn5.E0(parcel, 10, this.M, i);
        xn5.J0(parcel, 11, 8);
        parcel.writeLong(this.N);
        xn5.E0(parcel, 12, this.O, i);
        xn5.L0(parcel, iK0);
    }

    public kqj(String str, String str2, e1l e1lVar, long j, boolean z, String str3, rvj rvjVar, long j2, rvj rvjVar2, long j3, rvj rvjVar3) {
        this.E = str;
        this.F = str2;
        this.G = e1lVar;
        this.H = j;
        this.I = z;
        this.J = str3;
        this.K = rvjVar;
        this.L = j2;
        this.M = rvjVar2;
        this.N = j3;
        this.O = rvjVar3;
    }
}
