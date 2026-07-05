package defpackage;

import com.anthropic.claude.R;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class wb extends sk8 {
    public static final wb j;

    static {
        Map mapSingletonMap = Collections.singletonMap(ls.E, fe5.b);
        mapSingletonMap.getClass();
        j = new wb("ActiveCaloriesBurnedRecord", R.string.health_data_type_active_calories_burned, jce.a.b(zb.class), z7e.F, "kcal", mapSingletonMap, false);
    }

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        zb zbVar = (zb) y7eVar;
        zbVar.getClass();
        Instant instant = zbVar.a;
        ZoneId zoneIdSystemDefault = zbVar.b;
        if (zoneIdSystemDefault == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        OffsetDateTime offsetDateTimeR = ebh.r(instant, zoneIdSystemDefault);
        Instant instant2 = zbVar.c;
        ZoneId zoneIdSystemDefault2 = zbVar.d;
        if (zoneIdSystemDefault2 == null) {
            zoneIdSystemDefault2 = ZoneId.systemDefault();
        }
        return x44.W(new b9e(instant2.atZone(zoneIdSystemDefault2).toOffsetDateTime(), offsetDateTimeR, String.valueOf(zbVar.e.b()), "kcal"));
    }
}
