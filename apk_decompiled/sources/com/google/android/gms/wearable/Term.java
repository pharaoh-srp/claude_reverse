package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a4;
import defpackage.o1l;
import defpackage.xn5;

/* JADX INFO: loaded from: classes3.dex */
public class Term extends a4 implements ReflectedParcelable {
    public static final Parcelable.Creator<Term> CREATOR = new o1l(4);
    public final int E;
    public final String F;
    public final boolean G;
    public final String H;
    public final String I;
    public final int J;

    public Term(int i, int i2, String str, String str2, String str3, boolean z) {
        this.E = i;
        this.H = str2;
        this.G = z;
        this.F = str;
        this.I = str3;
        this.J = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E);
        xn5.F0(parcel, 2, this.F);
        xn5.J0(parcel, 3, 4);
        parcel.writeInt(this.G ? 1 : 0);
        xn5.F0(parcel, 4, this.H);
        xn5.F0(parcel, 5, this.I);
        xn5.J0(parcel, 6, 4);
        parcel.writeInt(this.J);
        xn5.L0(parcel, iK0);
    }
}
