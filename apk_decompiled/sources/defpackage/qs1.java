package defpackage;

import com.anthropic.claude.R;
import java.time.Instant;
import java.time.ZoneId;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qs1 extends sk8 {
    public static final qs1 j = new qs1("BloodGlucoseRecord", R.string.health_data_type_blood_glucose, jce.a.b(rs1.class), z7e.E, "mmol/L", nm6.E, false);

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        rs1 rs1Var = (rs1) y7eVar;
        rs1Var.getClass();
        Instant instant = rs1Var.a;
        ZoneId zoneIdSystemDefault = rs1Var.b;
        if (zoneIdSystemDefault == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        return x44.W(new b9e(ebh.r(instant, zoneIdSystemDefault), String.valueOf(rs1Var.d.a()), "mmol/L", 1));
    }
}
