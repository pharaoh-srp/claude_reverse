package defpackage;

import android.health.connect.datatypes.LeanBodyMassRecord;
import android.health.connect.datatypes.MenstruationFlowRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.NutritionRecord;
import android.health.connect.datatypes.OvulationTestRecord;
import android.health.connect.datatypes.OxygenSaturationRecord;
import android.health.connect.datatypes.SexualActivityRecord;
import android.health.connect.datatypes.StepsRecord;
import android.health.connect.datatypes.Vo2MaxRecord;
import android.health.connect.datatypes.WheelchairPushesRecord;
import android.health.connect.datatypes.units.Mass;
import android.health.connect.datatypes.units.Percentage;
import java.time.Instant;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class t8e {
    public static /* synthetic */ LeanBodyMassRecord.Builder a(Metadata metadata, Instant instant, Mass mass) {
        return new LeanBodyMassRecord.Builder(metadata, instant, mass);
    }

    public static /* synthetic */ MenstruationFlowRecord.Builder b(Metadata metadata, Instant instant, int i) {
        return new MenstruationFlowRecord.Builder(metadata, instant, i);
    }

    public static /* synthetic */ NutritionRecord.Builder c(Metadata metadata, Instant instant, Instant instant2) {
        return new NutritionRecord.Builder(metadata, instant, instant2);
    }

    public static /* synthetic */ OvulationTestRecord.Builder d(Metadata metadata, Instant instant, int i) {
        return new OvulationTestRecord.Builder(metadata, instant, i);
    }

    public static /* synthetic */ OxygenSaturationRecord.Builder e(Metadata metadata, Instant instant, Percentage percentage) {
        return new OxygenSaturationRecord.Builder(metadata, instant, percentage);
    }

    public static /* synthetic */ SexualActivityRecord.Builder f(Metadata metadata, Instant instant, int i) {
        return new SexualActivityRecord.Builder(metadata, instant, i);
    }

    public static /* synthetic */ StepsRecord.Builder g(Metadata metadata, Instant instant, Instant instant2, long j) {
        return new StepsRecord.Builder(metadata, instant, instant2, j);
    }

    public static /* synthetic */ Vo2MaxRecord.Builder h(Metadata metadata, Instant instant, int i, double d) {
        return new Vo2MaxRecord.Builder(metadata, instant, i, d);
    }

    public static /* synthetic */ WheelchairPushesRecord.Builder i(Metadata metadata, Instant instant, Instant instant2, long j) {
        return new WheelchairPushesRecord.Builder(metadata, instant, instant2, j);
    }

    public static /* synthetic */ void j() {
    }

    public static /* synthetic */ void l() {
    }

    public static /* synthetic */ void n() {
    }

    public static /* synthetic */ void o() {
    }

    public static /* synthetic */ void p() {
    }

    public static /* synthetic */ void q() {
    }

    public static /* synthetic */ void r() {
    }

    public static /* synthetic */ void s() {
    }
}
