package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a4;
import defpackage.dgj;
import defpackage.q28;
import defpackage.xn5;
import defpackage.zmj;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class CameraPosition extends a4 implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new zmj(22);
    public final LatLng E;
    public final float F;
    public final float G;
    public final float H;

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        dgj.w("camera target must not be null.", latLng);
        boolean z = false;
        if (f2 >= MTTypesetterKt.kLineSkipLimitMultiplier && f2 <= 90.0f) {
            z = true;
        }
        dgj.p(z, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f2));
        this.E = latLng;
        this.F = f;
        this.G = f2 + MTTypesetterKt.kLineSkipLimitMultiplier;
        this.H = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.E.equals(cameraPosition.E) && Float.floatToIntBits(this.F) == Float.floatToIntBits(cameraPosition.F) && Float.floatToIntBits(this.G) == Float.floatToIntBits(cameraPosition.G) && Float.floatToIntBits(this.H) == Float.floatToIntBits(cameraPosition.H);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, Float.valueOf(this.F), Float.valueOf(this.G), Float.valueOf(this.H)});
    }

    public final String toString() {
        q28 q28Var = new q28(this);
        q28Var.c("target", this.E);
        q28Var.c("zoom", Float.valueOf(this.F));
        q28Var.c("tilt", Float.valueOf(this.G));
        q28Var.c("bearing", Float.valueOf(this.H));
        return q28Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.E0(parcel, 2, this.E, i);
        xn5.J0(parcel, 3, 4);
        parcel.writeFloat(this.F);
        xn5.J0(parcel, 4, 4);
        parcel.writeFloat(this.G);
        xn5.J0(parcel, 5, 4);
        parcel.writeFloat(this.H);
        xn5.L0(parcel, iK0);
    }
}
