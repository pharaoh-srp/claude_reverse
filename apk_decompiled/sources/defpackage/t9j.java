package defpackage;

import com.anthropic.claude.R;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t9j extends sk8 {
    public static final t9j j;

    static {
        xb xbVar = bik.h;
        j = new t9j("WheelchairPushesRecord", R.string.health_data_type_wheelchair_pushes, jce.a.b(u9j.class), z7e.F, "count", sta.h0(new cpc(ls.E, xbVar), new cpc(ls.I, xbVar)), false);
    }

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        u9j u9jVar = (u9j) y7eVar;
        u9jVar.getClass();
        Instant instant = u9jVar.a;
        ZoneId zoneIdSystemDefault = u9jVar.b;
        if (zoneIdSystemDefault == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        OffsetDateTime offsetDateTimeR = ebh.r(instant, zoneIdSystemDefault);
        Instant instant2 = u9jVar.c;
        ZoneId zoneIdSystemDefault2 = u9jVar.d;
        if (zoneIdSystemDefault2 == null) {
            zoneIdSystemDefault2 = ZoneId.systemDefault();
        }
        return x44.W(new b9e(instant2.atZone(zoneIdSystemDefault2).toOffsetDateTime(), offsetDateTimeR, String.valueOf(u9jVar.e), "count"));
    }
}
