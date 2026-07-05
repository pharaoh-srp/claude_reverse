package defpackage;

import com.anthropic.claude.R;
import java.time.Instant;
import java.time.ZoneId;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kg2 extends sk8 {
    public static final kg2 j = new kg2("CervicalMucusRecord", R.string.health_data_type_cervical_mucus, jce.a.b(lg2.class), z7e.E, null, nm6.E, true);

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        lg2 lg2Var = (lg2) y7eVar;
        lg2Var.getClass();
        int i = lg2Var.d;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "unknown" : "egg_white" : "watery" : "creamy" : "sticky" : "dry";
        Instant instant = lg2Var.a;
        ZoneId zoneIdSystemDefault = lg2Var.b;
        if (zoneIdSystemDefault == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        return x44.W(new b9e(ebh.r(instant, zoneIdSystemDefault), str, (String) null, 9));
    }
}
