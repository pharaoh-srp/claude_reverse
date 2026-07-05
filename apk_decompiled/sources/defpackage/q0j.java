package defpackage;

import com.anthropic.claude.R;
import java.time.Instant;
import java.time.ZoneId;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class q0j extends sk8 {
    public static final q0j j = new q0j("Vo2MaxRecord", R.string.health_data_type_vo2_max, jce.a.b(r0j.class), z7e.E, "mL/kg/min", nm6.E, false);

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        r0j r0jVar = (r0j) y7eVar;
        r0jVar.getClass();
        Instant instant = r0jVar.a;
        ZoneId zoneIdSystemDefault = r0jVar.b;
        if (zoneIdSystemDefault == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        return x44.W(new b9e(ebh.r(instant, zoneIdSystemDefault), String.valueOf(r0jVar.d), "mL/kg/min", 1));
    }
}
