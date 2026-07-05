package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a4;
import defpackage.xn5;
import defpackage.xok;

/* JADX INFO: loaded from: classes3.dex */
public final class LatLng extends a4 implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new xok(25);
    public final double E;
    public final double F;

    public LatLng(double d, double d2) {
        if (d2 < -180.0d || d2 >= 180.0d) {
            this.F = ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        } else {
            this.F = d2;
        }
        this.E = Math.max(-90.0d, Math.min(90.0d, d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.E) == Double.doubleToLongBits(latLng.E) && Double.doubleToLongBits(this.F) == Double.doubleToLongBits(latLng.F);
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.E);
        long j = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.F);
        return ((((int) j) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        return "lat/lng: (" + this.E + "," + this.F + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 2, 8);
        parcel.writeDouble(this.E);
        xn5.J0(parcel, 3, 8);
        parcel.writeDouble(this.F);
        xn5.L0(parcel, iK0);
    }
}
