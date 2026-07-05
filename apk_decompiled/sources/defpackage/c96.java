package defpackage;

import com.anthropic.claude.R;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class c96 extends sk8 {
    public static final c96 j;

    static {
        Map mapSingletonMap = Collections.singletonMap(ls.E, rwk.a);
        mapSingletonMap.getClass();
        j = new c96("DistanceRecord", R.string.health_data_type_distance, jce.a.b(d96.class), z7e.F, "meters", mapSingletonMap, false);
    }

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        d96 d96Var = (d96) y7eVar;
        d96Var.getClass();
        Instant instant = d96Var.a;
        ZoneId zoneIdSystemDefault = d96Var.b;
        if (zoneIdSystemDefault == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        OffsetDateTime offsetDateTimeR = ebh.r(instant, zoneIdSystemDefault);
        Instant instant2 = d96Var.c;
        ZoneId zoneIdSystemDefault2 = d96Var.d;
        if (zoneIdSystemDefault2 == null) {
            zoneIdSystemDefault2 = ZoneId.systemDefault();
        }
        return x44.W(new b9e(instant2.atZone(zoneIdSystemDefault2).toOffsetDateTime(), offsetDateTimeR, String.valueOf(d96Var.e.a()), "meters"));
    }
}
