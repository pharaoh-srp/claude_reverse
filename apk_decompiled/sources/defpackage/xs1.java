package defpackage;

import com.anthropic.claude.R;
import java.time.Instant;
import java.time.ZoneId;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xs1 extends sk8 {
    public static final xs1 j = new xs1("BloodPressureRecord", R.string.health_data_type_blood_pressure, jce.a.b(ys1.class), z7e.E, "mmHg", nm6.E, false);

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        ys1 ys1Var = (ys1) y7eVar;
        ys1Var.getClass();
        Instant instant = ys1Var.a;
        ZoneId zoneIdSystemDefault = ys1Var.b;
        if (zoneIdSystemDefault == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        return x44.W(new b9e(ebh.r(instant, zoneIdSystemDefault), ys1Var.d.E + "/" + ys1Var.e.E, "mmHg", 1));
    }
}
