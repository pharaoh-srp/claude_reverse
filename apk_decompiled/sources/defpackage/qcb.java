package defpackage;

import com.anthropic.claude.R;
import java.time.Duration;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qcb extends sk8 {
    public static final qcb j = new qcb("MenstruationPeriodRecord", R.string.health_data_type_menstruation_period, jce.a.b(rcb.class), z7e.F, "days", nm6.E, true);

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        rcb rcbVar = (rcb) y7eVar;
        rcbVar.getClass();
        Instant instant = rcbVar.a;
        Instant instant2 = rcbVar.c;
        long days = Duration.between(instant, instant2).toDays();
        ZoneId zoneIdSystemDefault = rcbVar.b;
        if (zoneIdSystemDefault == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        OffsetDateTime offsetDateTimeR = ebh.r(instant, zoneIdSystemDefault);
        ZoneId zoneIdSystemDefault2 = rcbVar.d;
        if (zoneIdSystemDefault2 == null) {
            zoneIdSystemDefault2 = ZoneId.systemDefault();
        }
        return x44.W(new b9e(instant2.atZone(zoneIdSystemDefault2).toOffsetDateTime(), offsetDateTimeR, String.valueOf(days), "days"));
    }
}
