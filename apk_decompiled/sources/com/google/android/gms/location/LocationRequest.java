package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a4;
import defpackage.bsj;
import defpackage.gb9;
import defpackage.gsc;
import defpackage.ij0;
import defpackage.j7k;
import defpackage.j9k;
import defpackage.lsk;
import defpackage.pok;
import defpackage.qgj;
import defpackage.xn5;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class LocationRequest extends a4 implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new gsc(6);
    public int E;
    public long F;
    public long G;
    public final long H;
    public final long I;
    public final int J;
    public final float K;
    public final boolean L;
    public long M;
    public final int N;
    public final int O;
    public final boolean P;
    public final WorkSource Q;
    public final j7k R;

    public LocationRequest(int i, long j, long j2, long j3, long j4, long j5, int i2, float f, boolean z, long j6, int i3, int i4, boolean z2, WorkSource workSource, j7k j7kVar) {
        this.E = i;
        if (i == 105) {
            this.F = Long.MAX_VALUE;
        } else {
            this.F = j;
        }
        this.G = j2;
        this.H = j3;
        this.I = j4 == Long.MAX_VALUE ? j5 : Math.min(Math.max(1L, j4 - SystemClock.elapsedRealtime()), j5);
        this.J = i2;
        this.K = f;
        this.L = z;
        this.M = j6 != -1 ? j6 : j;
        this.N = i3;
        this.O = i4;
        this.P = z2;
        this.Q = workSource;
        this.R = j7kVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        int i = this.E;
        if (i != locationRequest.E) {
            return false;
        }
        if ((i == 105 || this.F == locationRequest.F) && this.G == locationRequest.G && l0() == locationRequest.l0()) {
            return (!l0() || this.H == locationRequest.H) && this.I == locationRequest.I && this.J == locationRequest.J && this.K == locationRequest.K && this.L == locationRequest.L && this.N == locationRequest.N && this.O == locationRequest.O && this.P == locationRequest.P && this.Q.equals(locationRequest.Q) && gb9.v(this.R, locationRequest.R);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.E), Long.valueOf(this.F), Long.valueOf(this.G), this.Q});
    }

    public final boolean l0() {
        long j = this.H;
        return j > 0 && (j >> 1) >= this.F;
    }

    public final String toString() {
        StringBuilder sbO = ij0.o("Request[");
        int i = this.E;
        long j = this.H;
        if (i == 105) {
            sbO.append(bsj.c(i));
            if (j > 0) {
                sbO.append("/");
                j9k.b(j, sbO);
            }
        } else {
            sbO.append("@");
            boolean zL0 = l0();
            long j2 = this.F;
            if (zL0) {
                j9k.b(j2, sbO);
                sbO.append("/");
                j9k.b(j, sbO);
            } else {
                j9k.b(j2, sbO);
            }
            sbO.append(" ");
            sbO.append(bsj.c(this.E));
        }
        if (this.E == 105 || this.G != this.F) {
            sbO.append(", minUpdateInterval=");
            long j3 = this.G;
            sbO.append(j3 == Long.MAX_VALUE ? "∞" : j9k.a(j3));
        }
        float f = this.K;
        if (f > 0.0d) {
            sbO.append(", minUpdateDistance=");
            sbO.append(f);
        }
        boolean z = this.E == 105;
        long j4 = this.M;
        if (!z ? j4 != this.F : j4 != Long.MAX_VALUE) {
            sbO.append(", maxUpdateAge=");
            long j5 = this.M;
            sbO.append(j5 != Long.MAX_VALUE ? j9k.a(j5) : "∞");
        }
        long j6 = this.I;
        if (j6 != Long.MAX_VALUE) {
            sbO.append(", duration=");
            j9k.b(j6, sbO);
        }
        int i2 = this.J;
        if (i2 != Integer.MAX_VALUE) {
            sbO.append(", maxUpdates=");
            sbO.append(i2);
        }
        int i3 = this.O;
        if (i3 != 0) {
            sbO.append(", ");
            sbO.append(pok.j(i3));
        }
        int i4 = this.N;
        if (i4 != 0) {
            sbO.append(", ");
            sbO.append(lsk.f(i4));
        }
        if (this.L) {
            sbO.append(", waitForAccurateLocation");
        }
        if (this.P) {
            sbO.append(", bypass");
        }
        WorkSource workSource = this.Q;
        if (!qgj.b(workSource)) {
            sbO.append(", ");
            sbO.append(workSource);
        }
        j7k j7kVar = this.R;
        if (j7kVar != null) {
            sbO.append(", impersonation=");
            sbO.append(j7kVar);
        }
        sbO.append(']');
        return sbO.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        int i2 = this.E;
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(i2);
        long j = this.F;
        xn5.J0(parcel, 2, 8);
        parcel.writeLong(j);
        long j2 = this.G;
        xn5.J0(parcel, 3, 8);
        parcel.writeLong(j2);
        xn5.J0(parcel, 6, 4);
        parcel.writeInt(this.J);
        xn5.J0(parcel, 7, 4);
        parcel.writeFloat(this.K);
        xn5.J0(parcel, 8, 8);
        parcel.writeLong(this.H);
        xn5.J0(parcel, 9, 4);
        parcel.writeInt(this.L ? 1 : 0);
        xn5.J0(parcel, 10, 8);
        parcel.writeLong(this.I);
        long j3 = this.M;
        xn5.J0(parcel, 11, 8);
        parcel.writeLong(j3);
        xn5.J0(parcel, 12, 4);
        parcel.writeInt(this.N);
        xn5.J0(parcel, 13, 4);
        parcel.writeInt(this.O);
        xn5.J0(parcel, 15, 4);
        parcel.writeInt(this.P ? 1 : 0);
        xn5.E0(parcel, 16, this.Q, i);
        xn5.E0(parcel, 17, this.R, i);
        xn5.L0(parcel, iK0);
    }
}
