package defpackage;

import com.anthropic.claude.R;
import java.time.Instant;
import java.time.ZoneId;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gt1 extends sk8 {
    public static final gt1 j = new gt1("BodyFatRecord", R.string.health_data_type_body_fat, jce.a.b(ht1.class), z7e.E, "%", nm6.E, false);

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        ht1 ht1Var = (ht1) y7eVar;
        ht1Var.getClass();
        Instant instant = ht1Var.a;
        ZoneId zoneIdSystemDefault = ht1Var.b;
        if (zoneIdSystemDefault == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        return x44.W(new b9e(ebh.r(instant, zoneIdSystemDefault), String.valueOf(ht1Var.c.E), "%", 1));
    }
}
