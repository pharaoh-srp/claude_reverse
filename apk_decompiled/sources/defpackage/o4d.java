package defpackage;

import com.anthropic.claude.R;
import java.time.Duration;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class o4d extends sk8 {
    public static final o4d j = new o4d("PlannedExerciseSessionRecord", R.string.health_data_type_planned_exercise_session, jce.a.b(p4d.class), z7e.F, "minutes", nm6.E, false);

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        p4d p4dVar = (p4d) y7eVar;
        p4dVar.getClass();
        Instant instant = p4dVar.a;
        Instant instant2 = p4dVar.c;
        long minutes = Duration.between(instant, instant2).toMinutes();
        ZoneId zoneIdSystemDefault = p4dVar.b;
        if (zoneIdSystemDefault == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        OffsetDateTime offsetDateTimeR = ebh.r(instant, zoneIdSystemDefault);
        ZoneId zoneIdSystemDefault2 = p4dVar.d;
        if (zoneIdSystemDefault2 == null) {
            zoneIdSystemDefault2 = ZoneId.systemDefault();
        }
        return x44.W(new b9e(instant2.atZone(zoneIdSystemDefault2).toOffsetDateTime(), offsetDateTimeR, String.valueOf(minutes), "minutes"));
    }
}
