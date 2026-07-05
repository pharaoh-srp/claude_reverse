package defpackage;

import android.health.connect.datatypes.ActiveCaloriesBurnedRecord;
import android.health.connect.datatypes.BoneMassRecord;
import android.health.connect.datatypes.CervicalMucusRecord;
import android.health.connect.datatypes.CyclingPedalingCadenceRecord;
import android.health.connect.datatypes.DataOrigin;
import android.health.connect.datatypes.Device;
import android.health.connect.datatypes.DistanceRecord;
import android.health.connect.datatypes.Metadata;
import android.window.SurfaceSyncGroup;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class ljb {
    public static /* bridge */ /* synthetic */ boolean B(Object obj) {
        return obj instanceof CyclingPedalingCadenceRecord;
    }

    public static /* bridge */ /* synthetic */ boolean D(Object obj) {
        return obj instanceof DistanceRecord;
    }

    public static /* bridge */ /* synthetic */ ActiveCaloriesBurnedRecord d(Object obj) {
        return (ActiveCaloriesBurnedRecord) obj;
    }

    public static /* bridge */ /* synthetic */ BoneMassRecord e(Object obj) {
        return (BoneMassRecord) obj;
    }

    public static /* bridge */ /* synthetic */ CervicalMucusRecord f(Object obj) {
        return (CervicalMucusRecord) obj;
    }

    public static /* bridge */ /* synthetic */ CyclingPedalingCadenceRecord g(Object obj) {
        return (CyclingPedalingCadenceRecord) obj;
    }

    public static /* synthetic */ DataOrigin.Builder h() {
        return new DataOrigin.Builder();
    }

    public static /* synthetic */ Device.Builder i() {
        return new Device.Builder();
    }

    public static /* synthetic */ Metadata.Builder j() {
        return new Metadata.Builder();
    }

    public static /* synthetic */ SurfaceSyncGroup l() {
        return new SurfaceSyncGroup("exo-sync-b-334901521");
    }

    public static /* bridge */ /* synthetic */ SurfaceSyncGroup m(Object obj) {
        return (SurfaceSyncGroup) obj;
    }

    public static /* bridge */ /* synthetic */ boolean y(Object obj) {
        return obj instanceof CervicalMucusRecord;
    }
}
