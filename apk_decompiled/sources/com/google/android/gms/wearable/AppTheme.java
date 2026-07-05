package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a4;
import defpackage.hm0;
import defpackage.ij0;
import defpackage.im0;
import defpackage.jm0;
import defpackage.kgh;
import defpackage.km0;
import defpackage.xn5;
import defpackage.zwj;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class AppTheme extends a4 implements ReflectedParcelable {
    public static final Parcelable.Creator<AppTheme> CREATOR = new zwj(1);
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public km0 J;
    public jm0 K;
    public im0 L;
    public hm0 M;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AppTheme)) {
                return false;
            }
            AppTheme appTheme = (AppTheme) obj;
            int i = this.F;
            if (i == 0) {
                i = 1;
            }
            int i2 = appTheme.F;
            if (i2 == 0) {
                i2 = 1;
            }
            if (i != i2) {
                return false;
            }
            int i3 = this.E;
            if (i3 == 0) {
                i3 = 1;
            }
            int i4 = appTheme.E;
            if (i4 == 0) {
                i4 = 1;
            }
            if (i3 != i4) {
                return false;
            }
            int i5 = this.G;
            if (i5 == 0) {
                i5 = 1;
            }
            int i6 = appTheme.G;
            if (i6 == 0) {
                i6 = 1;
            }
            if (i5 != i6) {
                return false;
            }
            int i7 = this.H;
            if (i7 == 0) {
                i7 = 3;
            }
            int i8 = appTheme.H;
            if (i7 != (i8 != 0 ? i8 : 3) || this.I != appTheme.I || !Objects.equals(this.J, appTheme.J) || !Objects.equals(this.K, appTheme.K) || !Objects.equals(this.L, appTheme.L) || !Objects.equals(this.M, appTheme.M)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.F;
        if (i == 0) {
            i = 1;
        }
        int i2 = i * 31;
        int i3 = this.E;
        if (i3 == 0) {
            i3 = 1;
        }
        int i4 = (i3 + i2) * 31;
        int i5 = this.G;
        int i6 = ((i5 != 0 ? i5 : 1) + i4) * 31;
        int i7 = this.H;
        if (i7 == 0) {
            i7 = 3;
        }
        return ((((((((((i7 + i6) * 31) + this.I) * 31) + Objects.hashCode(this.J)) * 31) + Objects.hashCode(this.K)) * 31) + Objects.hashCode(this.L)) * 31) + Objects.hashCode(this.M);
    }

    public final String toString() {
        int i = this.I;
        int i2 = this.E;
        if (i2 == 0) {
            i2 = 1;
        }
        int i3 = this.F;
        if (i3 == 0) {
            i3 = 1;
        }
        int i4 = this.H;
        if (i4 == 0) {
            i4 = 3;
        }
        int i5 = this.G;
        if (i5 == 0) {
            i5 = 1;
        }
        String strValueOf = String.valueOf(this.J);
        String strValueOf2 = String.valueOf(this.K);
        String strValueOf3 = String.valueOf(this.L);
        String strValueOf4 = String.valueOf(this.M);
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(i2).length();
        int length3 = String.valueOf(i3).length();
        int length4 = String.valueOf(i4).length();
        int length5 = String.valueOf(i5).length();
        int length6 = strValueOf.length();
        StringBuilder sb = new StringBuilder(length + 42 + length2 + 16 + length3 + 19 + length4 + 19 + length5 + 8 + length6 + 12 + strValueOf2.length() + 15 + strValueOf3.length() + 16 + strValueOf4.length() + 1);
        ij0.s(i, i2, "AppTheme {deviceExperience =", ", colorTheme =", sb);
        ij0.s(i3, i4, ", dynamicColor =", ", screenItemsSize =", sb);
        sb.append(", screenAlignment =");
        sb.append(i5);
        sb.append(", icon =");
        sb.append(strValueOf);
        kgh.u(sb, ", headline =", strValueOf2, ", description =", strValueOf3);
        return kgh.q(sb, ", callToAction =", strValueOf4, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        int i2 = this.E;
        if (i2 == 0) {
            i2 = 1;
        }
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.F;
        if (i3 == 0) {
            i3 = 1;
        }
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = this.G;
        int i5 = i4 != 0 ? i4 : 1;
        xn5.J0(parcel, 3, 4);
        parcel.writeInt(i5);
        int i6 = this.H;
        int i7 = i6 != 0 ? i6 : 3;
        xn5.J0(parcel, 4, 4);
        parcel.writeInt(i7);
        int i8 = this.I;
        xn5.J0(parcel, 5, 4);
        parcel.writeInt(i8);
        xn5.E0(parcel, 6, this.J, i);
        xn5.E0(parcel, 7, this.K, i);
        xn5.E0(parcel, 8, this.L, i);
        xn5.E0(parcel, 9, this.M, i);
        xn5.L0(parcel, iK0);
    }
}
