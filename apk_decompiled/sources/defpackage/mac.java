package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.api.tasks.TaskSessionEvent;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class mac extends sk8 {
    public static final mac j;

    static {
        Map mapSingletonMap = Collections.singletonMap(ls.E, new ws1(qac.H0, 3));
        mapSingletonMap.getClass();
        j = new mac("NutritionFatRecord", R.string.health_data_type_nutrition_fat, jce.a.b(qac.class), z7e.F, "g", mapSingletonMap, false);
    }

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        String strValueOf;
        qac qacVar = (qac) y7eVar;
        qacVar.getClass();
        Instant instant = qacVar.a;
        ZoneId zoneIdSystemDefault = qacVar.b;
        if (zoneIdSystemDefault == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        OffsetDateTime offsetDateTimeR = ebh.r(instant, zoneIdSystemDefault);
        Instant instant2 = qacVar.c;
        ZoneId zoneIdSystemDefault2 = qacVar.d;
        if (zoneIdSystemDefault2 == null) {
            zoneIdSystemDefault2 = ZoneId.systemDefault();
        }
        OffsetDateTime offsetDateTime = instant2.atZone(zoneIdSystemDefault2).toOffsetDateTime();
        fva fvaVar = qacVar.K;
        if (fvaVar == null || (strValueOf = String.valueOf(fvaVar.b())) == null) {
            strValueOf = TaskSessionEvent.REPLAY_FROM_START;
        }
        return x44.W(new b9e(offsetDateTime, offsetDateTimeR, strValueOf, "g"));
    }
}
