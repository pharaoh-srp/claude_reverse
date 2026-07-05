package defpackage;

import com.anthropic.claude.R;
import java.time.Instant;
import java.time.ZoneId;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lt1 extends sk8 {
    public static final lt1 j = new lt1("BodyWaterMassRecord", R.string.health_data_type_body_water_mass, jce.a.b(mt1.class), z7e.E, "kg", nm6.E, false);

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        mt1 mt1Var = (mt1) y7eVar;
        mt1Var.getClass();
        Instant instant = mt1Var.a;
        ZoneId zoneIdSystemDefault = mt1Var.b;
        if (zoneIdSystemDefault == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        return x44.W(new b9e(ebh.r(instant, zoneIdSystemDefault), String.valueOf(mt1Var.c.a(eva.F)), "kg", 1));
    }
}
