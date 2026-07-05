package defpackage;

import com.anthropic.claude.R;
import java.time.Instant;
import java.time.ZoneId;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class b2a extends sk8 {
    public static final b2a j = new b2a("LeanBodyMassRecord", R.string.health_data_type_lean_body_mass, jce.a.b(c2a.class), z7e.E, "kg", nm6.E, false);

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        c2a c2aVar = (c2a) y7eVar;
        c2aVar.getClass();
        Instant instant = c2aVar.a;
        ZoneId zoneIdSystemDefault = c2aVar.b;
        if (zoneIdSystemDefault == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        return x44.W(new b9e(ebh.r(instant, zoneIdSystemDefault), String.valueOf(c2aVar.c.a(eva.F)), "kg", 1));
    }
}
