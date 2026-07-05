package defpackage;

import android.health.connect.AggregateRecordsRequest;
import android.health.connect.LocalTimeRangeFilter;
import android.health.connect.ReadRecordsRequestUsingFilters;
import android.health.connect.TimeRangeFilter;
import android.health.connect.datatypes.ActiveCaloriesBurnedRecord;
import android.health.connect.datatypes.BasalBodyTemperatureRecord;
import android.health.connect.datatypes.BasalMetabolicRateRecord;
import android.health.connect.datatypes.BloodGlucoseRecord;
import android.health.connect.datatypes.BloodPressureRecord;
import android.health.connect.datatypes.BodyFatRecord;
import android.health.connect.datatypes.BodyTemperatureRecord;
import android.health.connect.datatypes.BoneMassRecord;
import android.health.connect.datatypes.CervicalMucusRecord;
import android.health.connect.datatypes.CyclingPedalingCadenceRecord;
import android.health.connect.datatypes.DistanceRecord;
import android.health.connect.datatypes.ElevationGainedRecord;
import android.health.connect.datatypes.ExerciseSessionRecord;
import android.health.connect.datatypes.FloorsClimbedRecord;
import android.health.connect.datatypes.HeartRateRecord;
import android.health.connect.datatypes.StepsRecord;
import android.health.connect.datatypes.TotalCaloriesBurnedRecord;
import android.health.connect.datatypes.Vo2MaxRecord;
import android.health.connect.datatypes.WeightRecord;
import android.health.connect.datatypes.WheelchairPushesRecord;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class z8e {
    public static /* bridge */ /* synthetic */ Class A() {
        return WheelchairPushesRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class B() {
        return BasalBodyTemperatureRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class C() {
        return BasalMetabolicRateRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class D() {
        return BloodGlucoseRecord.class;
    }

    public static /* synthetic */ AggregateRecordsRequest.Builder a(TimeRangeFilter timeRangeFilter) {
        return new AggregateRecordsRequest.Builder(timeRangeFilter);
    }

    public static /* synthetic */ LocalTimeRangeFilter.Builder b() {
        return new LocalTimeRangeFilter.Builder();
    }

    public static /* synthetic */ ReadRecordsRequestUsingFilters.Builder d(Class cls) {
        return new ReadRecordsRequestUsingFilters.Builder(cls);
    }

    public static /* bridge */ /* synthetic */ Class f() {
        return StepsRecord.class;
    }

    public static /* synthetic */ void g() {
    }

    public static /* bridge */ /* synthetic */ Class k() {
        return BoneMassRecord.class;
    }

    public static /* synthetic */ void l() {
    }

    public static /* bridge */ /* synthetic */ Class m() {
        return BloodPressureRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class n() {
        return BodyFatRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class o() {
        return CervicalMucusRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class p() {
        return BodyTemperatureRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class q() {
        return CyclingPedalingCadenceRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class r() {
        return DistanceRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class s() {
        return ElevationGainedRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class t() {
        return ExerciseSessionRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class u() {
        return FloorsClimbedRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class v() {
        return HeartRateRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class w() {
        return TotalCaloriesBurnedRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class x() {
        return Vo2MaxRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class y() {
        return WeightRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class z() {
        return ActiveCaloriesBurnedRecord.class;
    }
}
