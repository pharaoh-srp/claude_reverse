package defpackage;

import android.health.connect.datatypes.BloodGlucoseRecord;
import android.health.connect.datatypes.BloodPressureRecord;
import android.health.connect.datatypes.WeightRecord;
import android.health.connect.datatypes.WheelchairPushesRecord;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class c8e {
    public static /* bridge */ /* synthetic */ BloodGlucoseRecord a(Object obj) {
        return (BloodGlucoseRecord) obj;
    }

    public static /* bridge */ /* synthetic */ BloodPressureRecord b(Object obj) {
        return (BloodPressureRecord) obj;
    }

    public static /* bridge */ /* synthetic */ WeightRecord h(Object obj) {
        return (WeightRecord) obj;
    }

    public static /* bridge */ /* synthetic */ WheelchairPushesRecord i(Object obj) {
        return (WheelchairPushesRecord) obj;
    }

    public static /* bridge */ /* synthetic */ boolean q(Object obj) {
        return obj instanceof WeightRecord;
    }

    public static /* bridge */ /* synthetic */ boolean s(Object obj) {
        return obj instanceof WheelchairPushesRecord;
    }

    public static /* bridge */ /* synthetic */ boolean t(Object obj) {
        return obj instanceof BloodPressureRecord;
    }
}
