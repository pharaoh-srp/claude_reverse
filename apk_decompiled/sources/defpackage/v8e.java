package defpackage;

import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.PowerRecord;
import android.health.connect.datatypes.SpeedRecord;
import android.health.connect.datatypes.units.Power;
import java.time.Instant;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class v8e {
    public static /* synthetic */ PowerRecord.Builder b(Metadata metadata, Instant instant, Instant instant2, ArrayList arrayList) {
        return new PowerRecord.Builder(metadata, instant, instant2, arrayList);
    }

    public static /* synthetic */ PowerRecord.PowerRecordSample c(Power power, Instant instant) {
        return new PowerRecord.PowerRecordSample(power, instant);
    }

    public static /* synthetic */ SpeedRecord.Builder e(Metadata metadata, Instant instant, Instant instant2, ArrayList arrayList) {
        return new SpeedRecord.Builder(metadata, instant, instant2, arrayList);
    }

    public static /* synthetic */ void f() {
    }

    public static /* synthetic */ void h() {
    }
}
