package defpackage;

import com.anthropic.claude.R;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ct8 extends sk8 {
    public static final ct8 j;

    static {
        Map mapSingletonMap = Collections.singletonMap(ls.E, t9e.b);
        mapSingletonMap.getClass();
        j = new ct8("HydrationRecord", R.string.health_data_type_hydration, jce.a.b(dt8.class), z7e.F, "L", mapSingletonMap, false);
    }

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        dt8 dt8Var = (dt8) y7eVar;
        dt8Var.getClass();
        Instant instant = dt8Var.a;
        ZoneId zoneIdSystemDefault = dt8Var.b;
        if (zoneIdSystemDefault == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        OffsetDateTime offsetDateTimeR = ebh.r(instant, zoneIdSystemDefault);
        Instant instant2 = dt8Var.c;
        ZoneId zoneIdSystemDefault2 = dt8Var.d;
        if (zoneIdSystemDefault2 == null) {
            zoneIdSystemDefault2 = ZoneId.systemDefault();
        }
        return x44.W(new b9e(instant2.atZone(zoneIdSystemDefault2).toOffsetDateTime(), offsetDateTimeR, String.valueOf(dt8Var.e.a()), "L"));
    }
}
