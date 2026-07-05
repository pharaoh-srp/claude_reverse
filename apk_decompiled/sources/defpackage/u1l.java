package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u1l extends a4 {
    public static final Parcelable.Creator<u1l> CREATOR = new gsc(13);
    public final String E;
    public final String F;
    public final String G;
    public final String H;
    public final long I;
    public final long J;
    public final String K;
    public final boolean L;
    public final boolean M;
    public final long N;
    public final String O;
    public final long P;
    public final long Q;
    public final int R;
    public final boolean S;
    public final boolean T;
    public final String U;
    public final Boolean V;
    public final long W;
    public final List X;
    public final String Y;
    public final String Z;
    public final String a0;
    public final String b0;
    public final boolean c0;
    public final long d0;
    public final int e0;
    public final String f0;
    public final int g0;
    public final long h0;
    public final String i0;
    public final String j0;

    public u1l(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, int i, boolean z3, boolean z4, String str7, Boolean bool, long j5, List list, String str8, String str9, String str10, boolean z5, long j6, int i2, String str11, int i3, long j7, String str12, String str13) {
        dgj.s(str);
        this.E = str;
        this.F = TextUtils.isEmpty(str2) ? null : str2;
        this.G = str3;
        this.N = j;
        this.H = str4;
        this.I = j2;
        this.J = j3;
        this.K = str5;
        this.L = z;
        this.M = z2;
        this.O = str6;
        this.P = 0L;
        this.Q = j4;
        this.R = i;
        this.S = z3;
        this.T = z4;
        this.U = str7;
        this.V = bool;
        this.W = j5;
        this.X = list;
        this.Y = null;
        this.Z = str8;
        this.a0 = str9;
        this.b0 = str10;
        this.c0 = z5;
        this.d0 = j6;
        this.e0 = i2;
        this.f0 = str11;
        this.g0 = i3;
        this.h0 = j7;
        this.i0 = str12;
        this.j0 = str13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.F0(parcel, 2, this.E);
        xn5.F0(parcel, 3, this.F);
        xn5.F0(parcel, 4, this.G);
        xn5.F0(parcel, 5, this.H);
        xn5.J0(parcel, 6, 8);
        parcel.writeLong(this.I);
        xn5.J0(parcel, 7, 8);
        parcel.writeLong(this.J);
        xn5.F0(parcel, 8, this.K);
        xn5.J0(parcel, 9, 4);
        parcel.writeInt(this.L ? 1 : 0);
        xn5.J0(parcel, 10, 4);
        parcel.writeInt(this.M ? 1 : 0);
        xn5.J0(parcel, 11, 8);
        parcel.writeLong(this.N);
        xn5.F0(parcel, 12, this.O);
        xn5.J0(parcel, 13, 8);
        parcel.writeLong(this.P);
        xn5.J0(parcel, 14, 8);
        parcel.writeLong(this.Q);
        xn5.J0(parcel, 15, 4);
        parcel.writeInt(this.R);
        xn5.J0(parcel, 16, 4);
        parcel.writeInt(this.S ? 1 : 0);
        xn5.J0(parcel, 18, 4);
        parcel.writeInt(this.T ? 1 : 0);
        xn5.F0(parcel, 19, this.U);
        Boolean bool = this.V;
        if (bool != null) {
            xn5.J0(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        xn5.J0(parcel, 22, 8);
        parcel.writeLong(this.W);
        xn5.G0(parcel, 23, this.X);
        xn5.F0(parcel, 24, this.Y);
        xn5.F0(parcel, 25, this.Z);
        xn5.F0(parcel, 26, this.a0);
        xn5.F0(parcel, 27, this.b0);
        xn5.J0(parcel, 28, 4);
        parcel.writeInt(this.c0 ? 1 : 0);
        xn5.J0(parcel, 29, 8);
        parcel.writeLong(this.d0);
        xn5.J0(parcel, 30, 4);
        parcel.writeInt(this.e0);
        xn5.F0(parcel, 31, this.f0);
        xn5.J0(parcel, 32, 4);
        parcel.writeInt(this.g0);
        xn5.J0(parcel, 34, 8);
        parcel.writeLong(this.h0);
        xn5.F0(parcel, 35, this.i0);
        xn5.F0(parcel, 36, this.j0);
        xn5.L0(parcel, iK0);
    }

    public u1l(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, String str7, Boolean bool, long j6, ArrayList arrayList, String str8, String str9, String str10, String str11, boolean z5, long j7, int i2, String str12, int i3, long j8, String str13, String str14) {
        this.E = str;
        this.F = str2;
        this.G = str3;
        this.N = j3;
        this.H = str4;
        this.I = j;
        this.J = j2;
        this.K = str5;
        this.L = z;
        this.M = z2;
        this.O = str6;
        this.P = j4;
        this.Q = j5;
        this.R = i;
        this.S = z3;
        this.T = z4;
        this.U = str7;
        this.V = bool;
        this.W = j6;
        this.X = arrayList;
        this.Y = str8;
        this.Z = str9;
        this.a0 = str10;
        this.b0 = str11;
        this.c0 = z5;
        this.d0 = j7;
        this.e0 = i2;
        this.f0 = str12;
        this.g0 = i3;
        this.h0 = j8;
        this.i0 = str13;
        this.j0 = str14;
    }
}
