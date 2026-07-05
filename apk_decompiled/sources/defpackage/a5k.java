package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class a5k extends dmj implements u4k {
    public a5k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", 8);
    }

    @Override // defpackage.u4k
    public final void beginAdUnitExposure(String str, long j) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeLong(j);
        K(parcelB, 23);
    }

    @Override // defpackage.u4k
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        qxj.d(parcelB, bundle);
        K(parcelB, 9);
    }

    @Override // defpackage.u4k
    public final void clearMeasurementEnabled(long j) {
        Parcel parcelB = b();
        parcelB.writeLong(j);
        K(parcelB, 43);
    }

    @Override // defpackage.u4k
    public final void endAdUnitExposure(String str, long j) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeLong(j);
        K(parcelB, 24);
    }

    @Override // defpackage.u4k
    public final void generateEventId(x4k x4kVar) {
        Parcel parcelB = b();
        qxj.c(parcelB, x4kVar);
        K(parcelB, 22);
    }

    @Override // defpackage.u4k
    public final void getCachedAppInstanceId(x4k x4kVar) {
        Parcel parcelB = b();
        qxj.c(parcelB, x4kVar);
        K(parcelB, 19);
    }

    @Override // defpackage.u4k
    public final void getConditionalUserProperties(String str, String str2, x4k x4kVar) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        qxj.c(parcelB, x4kVar);
        K(parcelB, 10);
    }

    @Override // defpackage.u4k
    public final void getCurrentScreenClass(x4k x4kVar) {
        Parcel parcelB = b();
        qxj.c(parcelB, x4kVar);
        K(parcelB, 17);
    }

    @Override // defpackage.u4k
    public final void getCurrentScreenName(x4k x4kVar) {
        Parcel parcelB = b();
        qxj.c(parcelB, x4kVar);
        K(parcelB, 16);
    }

    @Override // defpackage.u4k
    public final void getGmpAppId(x4k x4kVar) {
        Parcel parcelB = b();
        qxj.c(parcelB, x4kVar);
        K(parcelB, 21);
    }

    @Override // defpackage.u4k
    public final void getMaxUserProperties(String str, x4k x4kVar) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        qxj.c(parcelB, x4kVar);
        K(parcelB, 6);
    }

    @Override // defpackage.u4k
    public final void getUserProperties(String str, String str2, boolean z, x4k x4kVar) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        ClassLoader classLoader = qxj.a;
        parcelB.writeInt(z ? 1 : 0);
        qxj.c(parcelB, x4kVar);
        K(parcelB, 5);
    }

    @Override // defpackage.u4k
    public final void initialize(lu8 lu8Var, y5k y5kVar, long j) {
        Parcel parcelB = b();
        qxj.c(parcelB, lu8Var);
        qxj.d(parcelB, y5kVar);
        parcelB.writeLong(j);
        K(parcelB, 1);
    }

    @Override // defpackage.u4k
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        qxj.d(parcelB, bundle);
        parcelB.writeInt(z ? 1 : 0);
        parcelB.writeInt(1);
        parcelB.writeLong(j);
        K(parcelB, 2);
    }

    @Override // defpackage.u4k
    public final void logHealthData(int i, String str, lu8 lu8Var, lu8 lu8Var2, lu8 lu8Var3) {
        Parcel parcelB = b();
        parcelB.writeInt(5);
        parcelB.writeString("Error with data collection. Data lost.");
        qxj.c(parcelB, lu8Var);
        qxj.c(parcelB, lu8Var2);
        qxj.c(parcelB, lu8Var3);
        K(parcelB, 33);
    }

    @Override // defpackage.u4k
    public final void onActivityCreated(lu8 lu8Var, Bundle bundle, long j) {
        Parcel parcelB = b();
        qxj.c(parcelB, lu8Var);
        qxj.d(parcelB, bundle);
        parcelB.writeLong(j);
        K(parcelB, 27);
    }

    @Override // defpackage.u4k
    public final void onActivityDestroyed(lu8 lu8Var, long j) {
        Parcel parcelB = b();
        qxj.c(parcelB, lu8Var);
        parcelB.writeLong(j);
        K(parcelB, 28);
    }

    @Override // defpackage.u4k
    public final void onActivityPaused(lu8 lu8Var, long j) {
        Parcel parcelB = b();
        qxj.c(parcelB, lu8Var);
        parcelB.writeLong(j);
        K(parcelB, 29);
    }

    @Override // defpackage.u4k
    public final void onActivityResumed(lu8 lu8Var, long j) {
        Parcel parcelB = b();
        qxj.c(parcelB, lu8Var);
        parcelB.writeLong(j);
        K(parcelB, 30);
    }

    @Override // defpackage.u4k
    public final void onActivitySaveInstanceState(lu8 lu8Var, x4k x4kVar, long j) {
        Parcel parcelB = b();
        qxj.c(parcelB, lu8Var);
        qxj.c(parcelB, x4kVar);
        parcelB.writeLong(j);
        K(parcelB, 31);
    }

    @Override // defpackage.u4k
    public final void onActivityStarted(lu8 lu8Var, long j) {
        Parcel parcelB = b();
        qxj.c(parcelB, lu8Var);
        parcelB.writeLong(j);
        K(parcelB, 25);
    }

    @Override // defpackage.u4k
    public final void onActivityStopped(lu8 lu8Var, long j) {
        Parcel parcelB = b();
        qxj.c(parcelB, lu8Var);
        parcelB.writeLong(j);
        K(parcelB, 26);
    }

    @Override // defpackage.u4k
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel parcelB = b();
        qxj.d(parcelB, bundle);
        parcelB.writeLong(j);
        K(parcelB, 8);
    }

    @Override // defpackage.u4k
    public final void setCurrentScreen(lu8 lu8Var, String str, String str2, long j) {
        Parcel parcelB = b();
        qxj.c(parcelB, lu8Var);
        parcelB.writeString(str);
        parcelB.writeString(str2);
        parcelB.writeLong(j);
        K(parcelB, 15);
    }

    @Override // defpackage.u4k
    public final void setDataCollectionEnabled(boolean z) {
        throw null;
    }

    @Override // defpackage.u4k
    public final void setMeasurementEnabled(boolean z, long j) {
        Parcel parcelB = b();
        ClassLoader classLoader = qxj.a;
        parcelB.writeInt(z ? 1 : 0);
        parcelB.writeLong(j);
        K(parcelB, 11);
    }

    @Override // defpackage.u4k
    public final void setUserProperty(String str, String str2, lu8 lu8Var, boolean z, long j) {
        Parcel parcelB = b();
        parcelB.writeString("fcm");
        parcelB.writeString("_ln");
        qxj.c(parcelB, lu8Var);
        parcelB.writeInt(1);
        parcelB.writeLong(j);
        K(parcelB, 4);
    }
}
