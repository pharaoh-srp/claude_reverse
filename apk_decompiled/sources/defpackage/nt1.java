package defpackage;

import com.anthropic.claude.R;
import java.time.Instant;
import java.time.ZoneId;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nt1 extends sk8 {
    public static final nt1 j = new nt1("BoneMassRecord", R.string.health_data_type_bone_mass, jce.a.b(ot1.class), z7e.E, "kg", nm6.E, false);

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        ot1 ot1Var = (ot1) y7eVar;
        ot1Var.getClass();
        Instant instant = ot1Var.a;
        ZoneId zoneIdSystemDefault = ot1Var.b;
        if (zoneIdSystemDefault == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        return x44.W(new b9e(ebh.r(instant, zoneIdSystemDefault), String.valueOf(ot1Var.c.a(eva.F)), "kg", 1));
    }
}
