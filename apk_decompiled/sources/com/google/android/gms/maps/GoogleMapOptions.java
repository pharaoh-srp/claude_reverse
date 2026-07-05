package com.google.android.gms.maps;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import defpackage.a4;
import defpackage.bok;
import defpackage.q28;
import defpackage.xn5;
import defpackage.zmj;

/* JADX INFO: loaded from: classes3.dex */
public final class GoogleMapOptions extends a4 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new zmj(28);
    public Boolean E;
    public Boolean F;
    public CameraPosition H;
    public Boolean I;
    public Boolean J;
    public Boolean K;
    public Boolean L;
    public Boolean M;
    public Boolean N;
    public Boolean O;
    public Boolean P;
    public Boolean Q;
    public Boolean U;
    public int X;
    public int G = -1;
    public Float R = null;
    public Float S = null;
    public LatLngBounds T = null;
    public Integer V = null;
    public String W = null;

    static {
        Color.argb(255, 236, 233, 225);
    }

    public final String toString() {
        q28 q28Var = new q28(this);
        q28Var.c("MapType", Integer.valueOf(this.G));
        q28Var.c("LiteMode", this.O);
        q28Var.c("Camera", this.H);
        q28Var.c("CompassEnabled", this.J);
        q28Var.c("ZoomControlsEnabled", this.I);
        q28Var.c("ScrollGesturesEnabled", this.K);
        q28Var.c("ZoomGesturesEnabled", this.L);
        q28Var.c("TiltGesturesEnabled", this.M);
        q28Var.c("RotateGesturesEnabled", this.N);
        q28Var.c("ScrollGesturesEnabledDuringRotateOrZoom", this.U);
        q28Var.c("MapToolbarEnabled", this.P);
        q28Var.c("AmbientEnabled", this.Q);
        q28Var.c("MinZoomPreference", this.R);
        q28Var.c("MaxZoomPreference", this.S);
        q28Var.c("BackgroundColor", this.V);
        q28Var.c("LatLngBoundsForCameraTarget", this.T);
        q28Var.c("ZOrderOnTop", this.E);
        q28Var.c("UseViewLifecycleInFragment", this.F);
        q28Var.c("mapColorScheme", Integer.valueOf(this.X));
        return q28Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        byte bO = bok.o(this.E);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(bO);
        byte bO2 = bok.o(this.F);
        xn5.J0(parcel, 3, 4);
        parcel.writeInt(bO2);
        int i2 = this.G;
        xn5.J0(parcel, 4, 4);
        parcel.writeInt(i2);
        xn5.E0(parcel, 5, this.H, i);
        byte bO3 = bok.o(this.I);
        xn5.J0(parcel, 6, 4);
        parcel.writeInt(bO3);
        byte bO4 = bok.o(this.J);
        xn5.J0(parcel, 7, 4);
        parcel.writeInt(bO4);
        byte bO5 = bok.o(this.K);
        xn5.J0(parcel, 8, 4);
        parcel.writeInt(bO5);
        byte bO6 = bok.o(this.L);
        xn5.J0(parcel, 9, 4);
        parcel.writeInt(bO6);
        byte bO7 = bok.o(this.M);
        xn5.J0(parcel, 10, 4);
        parcel.writeInt(bO7);
        byte bO8 = bok.o(this.N);
        xn5.J0(parcel, 11, 4);
        parcel.writeInt(bO8);
        byte bO9 = bok.o(this.O);
        xn5.J0(parcel, 12, 4);
        parcel.writeInt(bO9);
        byte bO10 = bok.o(this.P);
        xn5.J0(parcel, 14, 4);
        parcel.writeInt(bO10);
        byte bO11 = bok.o(this.Q);
        xn5.J0(parcel, 15, 4);
        parcel.writeInt(bO11);
        xn5.A0(parcel, 16, this.R);
        xn5.A0(parcel, 17, this.S);
        xn5.E0(parcel, 18, this.T, i);
        byte bO12 = bok.o(this.U);
        xn5.J0(parcel, 19, 4);
        parcel.writeInt(bO12);
        xn5.C0(parcel, 20, this.V);
        xn5.F0(parcel, 21, this.W);
        int i3 = this.X;
        xn5.J0(parcel, 23, 4);
        parcel.writeInt(i3);
        xn5.L0(parcel, iK0);
    }
}
