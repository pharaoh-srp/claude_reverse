package defpackage;

import com.anthropic.claude.R;
import java.time.Instant;
import java.time.ZoneId;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bre extends sk8 {
    public static final bre j = new bre("RestingHeartRateRecord", R.string.health_data_type_resting_heart_rate, jce.a.b(cre.class), z7e.E, "bpm", sta.h0(new cpc(ls.F, new ws1(cre.e, 6)), new cpc(ls.G, new ws1(cre.f, 6)), new cpc(ls.H, new ws1(cre.g, 6))), false);

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        cre creVar = (cre) y7eVar;
        creVar.getClass();
        Instant instant = creVar.a;
        ZoneId zoneIdSystemDefault = creVar.b;
        if (zoneIdSystemDefault == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        return x44.W(new b9e(ebh.r(instant, zoneIdSystemDefault), String.valueOf(creVar.c), "bpm", 1));
    }
}
