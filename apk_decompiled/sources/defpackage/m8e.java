package defpackage;

import android.health.connect.datatypes.PlannedExerciseBlock;
import android.health.connect.datatypes.PlannedExerciseSessionRecord;
import android.health.connect.datatypes.PlannedExerciseStep;
import android.health.connect.datatypes.SkinTemperatureRecord;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class m8e {
    public static /* bridge */ /* synthetic */ boolean D(Object obj) {
        return obj instanceof SkinTemperatureRecord;
    }

    public static /* bridge */ /* synthetic */ PlannedExerciseBlock f(Object obj) {
        return (PlannedExerciseBlock) obj;
    }

    public static /* bridge */ /* synthetic */ PlannedExerciseSessionRecord g(Object obj) {
        return (PlannedExerciseSessionRecord) obj;
    }

    public static /* bridge */ /* synthetic */ PlannedExerciseStep h(Object obj) {
        return (PlannedExerciseStep) obj;
    }

    public static /* bridge */ /* synthetic */ SkinTemperatureRecord.Delta i(Object obj) {
        return (SkinTemperatureRecord.Delta) obj;
    }

    public static /* bridge */ /* synthetic */ SkinTemperatureRecord j(Object obj) {
        return (SkinTemperatureRecord) obj;
    }

    public static /* bridge */ /* synthetic */ boolean x(Object obj) {
        return obj instanceof PlannedExerciseSessionRecord;
    }
}
