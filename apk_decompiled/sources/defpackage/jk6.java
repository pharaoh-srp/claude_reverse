package defpackage;

import com.anthropic.claude.R;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class jk6 extends sk8 {
    public static final jk6 j;

    static {
        Map mapSingletonMap = Collections.singletonMap(ls.E, kyk.b);
        mapSingletonMap.getClass();
        j = new jk6("ElevationGainedRecord", R.string.health_data_type_elevation_gained, jce.a.b(kk6.class), z7e.F, "meters", mapSingletonMap, false);
    }

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        kk6 kk6Var = (kk6) y7eVar;
        kk6Var.getClass();
        Instant instant = kk6Var.a;
        ZoneId zoneIdSystemDefault = kk6Var.b;
        if (zoneIdSystemDefault == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        OffsetDateTime offsetDateTimeR = ebh.r(instant, zoneIdSystemDefault);
        Instant instant2 = kk6Var.c;
        ZoneId zoneIdSystemDefault2 = kk6Var.d;
        if (zoneIdSystemDefault2 == null) {
            zoneIdSystemDefault2 = ZoneId.systemDefault();
        }
        return x44.W(new b9e(instant2.atZone(zoneIdSystemDefault2).toOffsetDateTime(), offsetDateTimeR, String.valueOf(kk6Var.e.a()), "meters"));
    }
}
