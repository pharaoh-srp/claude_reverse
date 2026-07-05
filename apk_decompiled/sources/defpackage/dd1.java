package defpackage;

import com.anthropic.claude.R;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class dd1 extends sk8 {
    public static final dd1 j;

    static {
        Map mapSingletonMap = Collections.singletonMap(ls.E, ssj.a);
        mapSingletonMap.getClass();
        j = new dd1("BasalMetabolicRateRecord", R.string.health_data_type_basal_metabolic_rate, jce.a.b(ed1.class), z7e.E, "kcal", mapSingletonMap, false);
    }

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        ed1 ed1Var = (ed1) y7eVar;
        ed1Var.getClass();
        Instant instant = ed1Var.a;
        ZoneId zoneIdSystemDefault = ed1Var.b;
        if (zoneIdSystemDefault == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        OffsetDateTime offsetDateTimeR = ebh.r(instant, zoneIdSystemDefault);
        jad jadVar = ed1Var.c;
        return x44.W(new b9e(offsetDateTimeR, String.valueOf(jadVar.F == iad.F ? jadVar.E : jadVar.a() / 0.0484259259d), "kcal", 1));
    }
}
