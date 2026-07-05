package defpackage;

import com.anthropic.claude.R;
import java.time.Instant;
import java.time.ZoneId;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bd1 extends sk8 {
    public static final bd1 j = new bd1("BasalBodyTemperatureRecord", R.string.health_data_type_basal_body_temperature, jce.a.b(cd1.class), z7e.E, "°C", nm6.E, false);

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        cd1 cd1Var = (cd1) y7eVar;
        cd1Var.getClass();
        Instant instant = cd1Var.a;
        ZoneId zoneIdSystemDefault = cd1Var.b;
        if (zoneIdSystemDefault == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        return x44.W(new b9e(ebh.r(instant, zoneIdSystemDefault), String.valueOf(cd1Var.d.E), "°C", 1));
    }
}
