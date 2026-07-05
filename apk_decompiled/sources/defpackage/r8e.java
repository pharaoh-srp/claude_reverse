package defpackage;

import android.health.connect.datatypes.IntermenstrualBleedingRecord;
import android.health.connect.datatypes.MenstruationPeriodRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.SleepSessionRecord;
import android.health.connect.datatypes.StepsCadenceRecord;
import android.health.connect.datatypes.WeightRecord;
import android.health.connect.datatypes.units.Mass;
import java.time.Instant;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class r8e {
    public static /* synthetic */ IntermenstrualBleedingRecord.Builder a(Metadata metadata, Instant instant) {
        return new IntermenstrualBleedingRecord.Builder(metadata, instant);
    }

    public static /* synthetic */ MenstruationPeriodRecord.Builder b(Metadata metadata, Instant instant, Instant instant2) {
        return new MenstruationPeriodRecord.Builder(metadata, instant, instant2);
    }

    public static /* synthetic */ SleepSessionRecord.Builder c(Metadata metadata, Instant instant, Instant instant2) {
        return new SleepSessionRecord.Builder(metadata, instant, instant2);
    }

    public static /* synthetic */ SleepSessionRecord.Stage d(Instant instant, Instant instant2, int i) {
        return new SleepSessionRecord.Stage(instant, instant2, i);
    }

    public static /* synthetic */ StepsCadenceRecord.Builder e(Metadata metadata, Instant instant, Instant instant2, ArrayList arrayList) {
        return new StepsCadenceRecord.Builder(metadata, instant, instant2, arrayList);
    }

    public static /* synthetic */ StepsCadenceRecord.StepsCadenceRecordSample f(double d, Instant instant) {
        return new StepsCadenceRecord.StepsCadenceRecordSample(d, instant);
    }

    public static /* synthetic */ WeightRecord.Builder g(Metadata metadata, Instant instant, Mass mass) {
        return new WeightRecord.Builder(metadata, instant, mass);
    }

    public static /* synthetic */ void h() {
    }

    public static /* synthetic */ void l() {
    }

    public static /* synthetic */ void n() {
    }

    public static /* synthetic */ void q() {
    }

    public static /* synthetic */ void s() {
    }
}
