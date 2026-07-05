package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zfk extends dmj implements pfk {
    public zfk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 8);
    }

    @Override // defpackage.pfk
    public final void A(u1l u1lVar) {
        Parcel parcelB = b();
        qxj.d(parcelB, u1lVar);
        K(parcelB, 6);
    }

    @Override // defpackage.pfk
    public final lrj B(u1l u1lVar) {
        Parcel parcelB = b();
        qxj.d(parcelB, u1lVar);
        Parcel parcelI = I(parcelB, 21);
        lrj lrjVar = (lrj) qxj.a(parcelI, lrj.CREATOR);
        parcelI.recycle();
        return lrjVar;
    }

    @Override // defpackage.pfk
    public final void C(u1l u1lVar) {
        Parcel parcelB = b();
        qxj.d(parcelB, u1lVar);
        K(parcelB, 25);
    }

    @Override // defpackage.pfk
    public final List e(Bundle bundle, u1l u1lVar) {
        Parcel parcelB = b();
        qxj.d(parcelB, u1lVar);
        qxj.d(parcelB, bundle);
        Parcel parcelI = I(parcelB, 24);
        ArrayList arrayListCreateTypedArrayList = parcelI.createTypedArrayList(f0l.CREATOR);
        parcelI.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.pfk
    public final void g(u1l u1lVar) {
        Parcel parcelB = b();
        qxj.d(parcelB, u1lVar);
        K(parcelB, 20);
    }

    @Override // defpackage.pfk
    public final void h(String str, String str2, String str3, long j) {
        Parcel parcelB = b();
        parcelB.writeLong(j);
        parcelB.writeString(str);
        parcelB.writeString(str2);
        parcelB.writeString(str3);
        K(parcelB, 10);
    }

    @Override // defpackage.pfk
    public final List i(String str, String str2, String str3, boolean z) {
        Parcel parcelB = b();
        parcelB.writeString(null);
        parcelB.writeString(str2);
        parcelB.writeString(str3);
        ClassLoader classLoader = qxj.a;
        parcelB.writeInt(z ? 1 : 0);
        Parcel parcelI = I(parcelB, 15);
        ArrayList arrayListCreateTypedArrayList = parcelI.createTypedArrayList(e1l.CREATOR);
        parcelI.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.pfk
    public final void l(u1l u1lVar) {
        Parcel parcelB = b();
        qxj.d(parcelB, u1lVar);
        K(parcelB, 26);
    }

    @Override // defpackage.pfk
    public final byte[] n(rvj rvjVar, String str) {
        Parcel parcelB = b();
        qxj.d(parcelB, rvjVar);
        parcelB.writeString(str);
        Parcel parcelI = I(parcelB, 9);
        byte[] bArrCreateByteArray = parcelI.createByteArray();
        parcelI.recycle();
        return bArrCreateByteArray;
    }

    @Override // defpackage.pfk
    public final void o(e1l e1lVar, u1l u1lVar) {
        Parcel parcelB = b();
        qxj.d(parcelB, e1lVar);
        qxj.d(parcelB, u1lVar);
        K(parcelB, 2);
    }

    @Override // defpackage.pfk
    public final List p(String str, String str2, u1l u1lVar) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        qxj.d(parcelB, u1lVar);
        Parcel parcelI = I(parcelB, 16);
        ArrayList arrayListCreateTypedArrayList = parcelI.createTypedArrayList(kqj.CREATOR);
        parcelI.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.pfk
    public final void q(u1l u1lVar) {
        Parcel parcelB = b();
        qxj.d(parcelB, u1lVar);
        K(parcelB, 4);
    }

    @Override // defpackage.pfk
    public final List s(String str, String str2, boolean z, u1l u1lVar) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        ClassLoader classLoader = qxj.a;
        parcelB.writeInt(z ? 1 : 0);
        qxj.d(parcelB, u1lVar);
        Parcel parcelI = I(parcelB, 14);
        ArrayList arrayListCreateTypedArrayList = parcelI.createTypedArrayList(e1l.CREATOR);
        parcelI.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.pfk
    public final List t(String str, String str2, String str3) {
        Parcel parcelB = b();
        parcelB.writeString(null);
        parcelB.writeString(str2);
        parcelB.writeString(str3);
        Parcel parcelI = I(parcelB, 17);
        ArrayList arrayListCreateTypedArrayList = parcelI.createTypedArrayList(kqj.CREATOR);
        parcelI.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.pfk
    public final void u(u1l u1lVar) {
        Parcel parcelB = b();
        qxj.d(parcelB, u1lVar);
        K(parcelB, 18);
    }

    @Override // defpackage.pfk
    public final String v(u1l u1lVar) {
        Parcel parcelB = b();
        qxj.d(parcelB, u1lVar);
        Parcel parcelI = I(parcelB, 11);
        String string = parcelI.readString();
        parcelI.recycle();
        return string;
    }

    @Override // defpackage.pfk
    public final void w(kqj kqjVar, u1l u1lVar) {
        Parcel parcelB = b();
        qxj.d(parcelB, kqjVar);
        qxj.d(parcelB, u1lVar);
        K(parcelB, 12);
    }

    @Override // defpackage.pfk
    public final void x(u1l u1lVar) {
        Parcel parcelB = b();
        qxj.d(parcelB, u1lVar);
        K(parcelB, 27);
    }

    @Override // defpackage.pfk
    public final void y(rvj rvjVar, u1l u1lVar) {
        Parcel parcelB = b();
        qxj.d(parcelB, rvjVar);
        qxj.d(parcelB, u1lVar);
        K(parcelB, 1);
    }

    @Override // defpackage.pfk
    public final void z(Bundle bundle, u1l u1lVar) {
        Parcel parcelB = b();
        qxj.d(parcelB, bundle);
        qxj.d(parcelB, u1lVar);
        K(parcelB, 28);
    }

    @Override // defpackage.pfk
    /* JADX INFO: renamed from: e */
    public final void mo1199e(Bundle bundle, u1l u1lVar) {
        Parcel parcelB = b();
        qxj.d(parcelB, bundle);
        qxj.d(parcelB, u1lVar);
        K(parcelB, 19);
    }
}
