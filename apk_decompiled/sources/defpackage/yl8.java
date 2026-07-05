package defpackage;

import com.anthropic.claude.R;
import java.time.Instant;
import java.time.ZoneId;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yl8 extends sk8 {
    public static final yl8 j = new yl8("HeartRateVariabilityRmssdRecord", R.string.health_data_type_heart_rate_variability, jce.a.b(zl8.class), z7e.E, "ms", nm6.E, false);

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        zl8 zl8Var = (zl8) y7eVar;
        zl8Var.getClass();
        Instant instant = zl8Var.a;
        ZoneId zoneIdSystemDefault = zl8Var.b;
        if (zoneIdSystemDefault == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        return x44.W(new b9e(ebh.r(instant, zoneIdSystemDefault), String.valueOf(zl8Var.c), "ms", 1));
    }
}
