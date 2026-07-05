package defpackage;

import com.anthropic.claude.R;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class b3i extends sk8 {
    public static final b3i j;

    static {
        Map mapSingletonMap = Collections.singletonMap(ls.E, x2k.b);
        mapSingletonMap.getClass();
        j = new b3i("TotalCaloriesBurnedRecord", R.string.health_data_type_total_calories_burned, jce.a.b(c3i.class), z7e.F, "kcal", mapSingletonMap, false);
    }

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        c3i c3iVar = (c3i) y7eVar;
        c3iVar.getClass();
        Instant instant = c3iVar.a;
        ZoneId zoneIdSystemDefault = c3iVar.b;
        if (zoneIdSystemDefault == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        OffsetDateTime offsetDateTimeR = ebh.r(instant, zoneIdSystemDefault);
        Instant instant2 = c3iVar.c;
        ZoneId zoneIdSystemDefault2 = c3iVar.d;
        if (zoneIdSystemDefault2 == null) {
            zoneIdSystemDefault2 = ZoneId.systemDefault();
        }
        return x44.W(new b9e(instant2.atZone(zoneIdSystemDefault2).toOffsetDateTime(), offsetDateTimeR, String.valueOf(c3iVar.e.b()), "kcal"));
    }
}
