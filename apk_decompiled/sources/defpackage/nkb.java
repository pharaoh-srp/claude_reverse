package defpackage;

import com.anthropic.claude.R;
import java.time.Duration;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class nkb extends sk8 {
    public static final nkb j;

    static {
        Map mapSingletonMap = Collections.singletonMap(ls.J, jpi.c);
        mapSingletonMap.getClass();
        j = new nkb("MindfulnessSessionRecord", R.string.health_data_type_mindfulness_session, jce.a.b(okb.class), z7e.F, "minutes", mapSingletonMap, false);
    }

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        okb okbVar = (okb) y7eVar;
        okbVar.getClass();
        Instant instant = okbVar.a;
        Instant instant2 = okbVar.c;
        long minutes = Duration.between(instant, instant2).toMinutes();
        ZoneId zoneIdSystemDefault = okbVar.b;
        if (zoneIdSystemDefault == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        OffsetDateTime offsetDateTimeR = ebh.r(instant, zoneIdSystemDefault);
        ZoneId zoneIdSystemDefault2 = okbVar.d;
        if (zoneIdSystemDefault2 == null) {
            zoneIdSystemDefault2 = ZoneId.systemDefault();
        }
        return x44.W(new b9e(instant2.atZone(zoneIdSystemDefault2).toOffsetDateTime(), offsetDateTimeR, String.valueOf(minutes), "minutes"));
    }
}
