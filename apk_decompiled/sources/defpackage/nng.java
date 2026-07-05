package defpackage;

import com.anthropic.claude.R;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nng extends sk8 {
    public static final nng j;

    static {
        xb xbVar = lwj.f;
        j = new nng("StepsRecord", R.string.health_data_type_steps, jce.a.b(ong.class), z7e.F, "count", sta.h0(new cpc(ls.E, xbVar), new cpc(ls.I, xbVar)), false);
    }

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        ong ongVar = (ong) y7eVar;
        ongVar.getClass();
        Instant instant = ongVar.a;
        ZoneId zoneIdSystemDefault = ongVar.b;
        if (zoneIdSystemDefault == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        OffsetDateTime offsetDateTimeR = ebh.r(instant, zoneIdSystemDefault);
        Instant instant2 = ongVar.c;
        ZoneId zoneIdSystemDefault2 = ongVar.d;
        if (zoneIdSystemDefault2 == null) {
            zoneIdSystemDefault2 = ZoneId.systemDefault();
        }
        return x44.W(new b9e(instant2.atZone(zoneIdSystemDefault2).toOffsetDateTime(), offsetDateTimeR, String.valueOf(ongVar.e), "count"));
    }
}
