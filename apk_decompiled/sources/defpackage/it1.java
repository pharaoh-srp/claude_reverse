package defpackage;

import com.anthropic.claude.R;
import java.time.Instant;
import java.time.ZoneId;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class it1 extends sk8 {
    public static final it1 j = new it1("BodyTemperatureRecord", R.string.health_data_type_body_temperature, jce.a.b(kt1.class), z7e.E, "°C", nm6.E, false);

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        kt1 kt1Var = (kt1) y7eVar;
        kt1Var.getClass();
        Instant instant = kt1Var.a;
        ZoneId zoneIdSystemDefault = kt1Var.b;
        if (zoneIdSystemDefault == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        return x44.W(new b9e(ebh.r(instant, zoneIdSystemDefault), String.valueOf(kt1Var.d.E), "°C", 1));
    }
}
