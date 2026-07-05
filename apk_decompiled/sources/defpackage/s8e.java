package defpackage;

import android.health.connect.datatypes.ExerciseCompletionGoal;
import android.health.connect.datatypes.PlannedExerciseSessionRecord;
import android.health.connect.datatypes.SkinTemperatureRecord;
import android.health.connect.datatypes.units.TemperatureDelta;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class s8e {
    public static /* bridge */ /* synthetic */ boolean A(Object obj) {
        return obj instanceof ExerciseCompletionGoal.UnspecifiedGoal;
    }

    public static /* bridge */ /* synthetic */ boolean B(Object obj) {
        return obj instanceof ExerciseCompletionGoal.DistanceWithVariableRestGoal;
    }

    public static /* bridge */ /* synthetic */ boolean C(Object obj) {
        return obj instanceof ExerciseCompletionGoal.StepsGoal;
    }

    public static /* bridge */ /* synthetic */ ExerciseCompletionGoal.ActiveCaloriesBurnedGoal d(Object obj) {
        return (ExerciseCompletionGoal.ActiveCaloriesBurnedGoal) obj;
    }

    public static /* bridge */ /* synthetic */ ExerciseCompletionGoal.DistanceGoal e(Object obj) {
        return (ExerciseCompletionGoal.DistanceGoal) obj;
    }

    public static /* bridge */ /* synthetic */ ExerciseCompletionGoal.DistanceWithVariableRestGoal f(Object obj) {
        return (ExerciseCompletionGoal.DistanceWithVariableRestGoal) obj;
    }

    public static /* bridge */ /* synthetic */ ExerciseCompletionGoal.DurationGoal g(Object obj) {
        return (ExerciseCompletionGoal.DurationGoal) obj;
    }

    public static /* bridge */ /* synthetic */ ExerciseCompletionGoal.RepetitionsGoal h(Object obj) {
        return (ExerciseCompletionGoal.RepetitionsGoal) obj;
    }

    public static /* bridge */ /* synthetic */ ExerciseCompletionGoal.StepsGoal i(Object obj) {
        return (ExerciseCompletionGoal.StepsGoal) obj;
    }

    public static /* bridge */ /* synthetic */ ExerciseCompletionGoal.TotalCaloriesBurnedGoal j(Object obj) {
        return (ExerciseCompletionGoal.TotalCaloriesBurnedGoal) obj;
    }

    public static /* bridge */ /* synthetic */ TemperatureDelta o(Object obj) {
        return (TemperatureDelta) obj;
    }

    public static /* bridge */ /* synthetic */ Class q() {
        return PlannedExerciseSessionRecord.class;
    }

    public static /* bridge */ /* synthetic */ boolean t(Object obj) {
        return obj instanceof ExerciseCompletionGoal.DistanceGoal;
    }

    public static /* bridge */ /* synthetic */ Class u() {
        return SkinTemperatureRecord.class;
    }

    public static /* bridge */ /* synthetic */ boolean v(Object obj) {
        return obj instanceof ExerciseCompletionGoal.DurationGoal;
    }

    public static /* bridge */ /* synthetic */ boolean w(Object obj) {
        return obj instanceof ExerciseCompletionGoal.RepetitionsGoal;
    }

    public static /* bridge */ /* synthetic */ boolean x(Object obj) {
        return obj instanceof ExerciseCompletionGoal.TotalCaloriesBurnedGoal;
    }

    public static /* bridge */ /* synthetic */ boolean y(Object obj) {
        return obj instanceof ExerciseCompletionGoal.ActiveCaloriesBurnedGoal;
    }

    public static /* bridge */ /* synthetic */ boolean z(Object obj) {
        return obj instanceof ExerciseCompletionGoal.UnknownGoal;
    }
}
