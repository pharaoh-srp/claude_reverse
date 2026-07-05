package defpackage;

import com.anthropic.claude.R;
import java.time.Instant;
import java.time.ZoneId;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e9j extends sk8 {
    public static final e9j j = new e9j("WeightRecord", R.string.health_data_type_weight, jce.a.b(g9j.class), z7e.E, "kg", sta.h0(new cpc(ls.F, zhk.b), new cpc(ls.G, zhk.c), new cpc(ls.H, zhk.d)), false);

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        g9j g9jVar = (g9j) y7eVar;
        g9jVar.getClass();
        Instant instant = g9jVar.a;
        ZoneId zoneIdSystemDefault = g9jVar.b;
        if (zoneIdSystemDefault == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        return x44.W(new b9e(ebh.r(instant, zoneIdSystemDefault), String.valueOf(g9jVar.c.a(eva.F)), "kg", 1));
    }
}
