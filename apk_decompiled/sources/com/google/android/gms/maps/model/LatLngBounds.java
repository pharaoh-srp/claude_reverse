package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a4;
import defpackage.dgj;
import defpackage.q28;
import defpackage.xn5;
import defpackage.xok;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class LatLngBounds extends a4 implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new xok(19);
    public final LatLng E;
    public final LatLng F;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        dgj.w("southwest must not be null.", latLng);
        dgj.w("northeast must not be null.", latLng2);
        double d = latLng2.E;
        double d2 = latLng.E;
        dgj.p(d >= d2, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d2), Double.valueOf(d));
        this.E = latLng;
        this.F = latLng2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.E.equals(latLngBounds.E) && this.F.equals(latLngBounds.F);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, this.F});
    }

    public final String toString() {
        q28 q28Var = new q28(this);
        q28Var.c("southwest", this.E);
        q28Var.c("northeast", this.F);
        return q28Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.E0(parcel, 2, this.E, i);
        xn5.E0(parcel, 3, this.F, i);
        xn5.L0(parcel, iK0);
    }
}
