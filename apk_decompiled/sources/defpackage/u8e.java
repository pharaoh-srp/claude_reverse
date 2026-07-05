package defpackage;

import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.RespiratoryRateRecord;
import android.health.connect.datatypes.RestingHeartRateRecord;
import android.health.connect.datatypes.SpeedRecord;
import android.health.connect.datatypes.TotalCaloriesBurnedRecord;
import android.health.connect.datatypes.units.Energy;
import android.health.connect.datatypes.units.Velocity;
import java.time.Instant;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class u8e {
    public static /* synthetic */ RespiratoryRateRecord.Builder a(Metadata metadata, Instant instant, double d) {
        return new RespiratoryRateRecord.Builder(metadata, instant, d);
    }

    public static /* synthetic */ RestingHeartRateRecord.Builder b(Metadata metadata, Instant instant, long j) {
        return new RestingHeartRateRecord.Builder(metadata, instant, j);
    }

    public static /* synthetic */ SpeedRecord.SpeedRecordSample c(Velocity velocity, Instant instant) {
        return new SpeedRecord.SpeedRecordSample(velocity, instant);
    }

    public static /* synthetic */ TotalCaloriesBurnedRecord.Builder d(Metadata metadata, Instant instant, Instant instant2, Energy energy) {
        return new TotalCaloriesBurnedRecord.Builder(metadata, instant, instant2, energy);
    }

    public static /* synthetic */ void e() {
    }

    public static /* synthetic */ void g() {
    }

    public static /* synthetic */ void j() {
    }

    public static /* synthetic */ void k() {
    }
}
