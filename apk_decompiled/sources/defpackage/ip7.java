package defpackage;

import com.anthropic.claude.R;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ip7 extends sk8 {
    public static final ip7 j;

    static {
        Map mapSingletonMap = Collections.singletonMap(ls.E, oe5.b);
        mapSingletonMap.getClass();
        j = new ip7("FloorsClimbedRecord", R.string.health_data_type_floors_climbed, jce.a.b(jp7.class), z7e.F, "floors", mapSingletonMap, false);
    }

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        jp7 jp7Var = (jp7) y7eVar;
        jp7Var.getClass();
        Instant instant = jp7Var.a;
        ZoneId zoneIdSystemDefault = jp7Var.b;
        if (zoneIdSystemDefault == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        OffsetDateTime offsetDateTimeR = ebh.r(instant, zoneIdSystemDefault);
        Instant instant2 = jp7Var.c;
        ZoneId zoneIdSystemDefault2 = jp7Var.d;
        if (zoneIdSystemDefault2 == null) {
            zoneIdSystemDefault2 = ZoneId.systemDefault();
        }
        return x44.W(new b9e(instant2.atZone(zoneIdSystemDefault2).toOffsetDateTime(), offsetDateTimeR, String.valueOf(jp7Var.e), "floors"));
    }
}
