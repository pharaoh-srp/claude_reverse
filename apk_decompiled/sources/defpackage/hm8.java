package defpackage;

import com.anthropic.claude.R;
import java.time.Instant;
import java.time.ZoneId;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hm8 extends sk8 {
    public static final hm8 j = new hm8("HeightRecord", R.string.health_data_type_height, jce.a.b(lm8.class), z7e.E, "meters", sta.h0(new cpc(ls.F, new ws1(lm8.f, 1)), new cpc(ls.G, new ws1(lm8.g, 1)), new cpc(ls.H, new ws1(lm8.h, 1))), false);

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        lm8 lm8Var = (lm8) y7eVar;
        lm8Var.getClass();
        Instant instant = lm8Var.a;
        ZoneId zoneIdSystemDefault = lm8Var.b;
        if (zoneIdSystemDefault == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        return x44.W(new b9e(ebh.r(instant, zoneIdSystemDefault), String.valueOf(lm8Var.c.a()), "meters", 1));
    }
}
