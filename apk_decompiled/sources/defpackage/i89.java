package defpackage;

import com.anthropic.claude.R;
import java.time.Instant;
import java.time.ZoneId;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i89 extends sk8 {
    public static final i89 j = new i89("IntermenstrualBleedingRecord", R.string.health_data_type_intermenstrual_bleeding, jce.a.b(j89.class), z7e.E, null, nm6.E, true);

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        j89 j89Var = (j89) y7eVar;
        j89Var.getClass();
        Instant instant = j89Var.a;
        ZoneId zoneIdSystemDefault = j89Var.b;
        if (zoneIdSystemDefault == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        return x44.W(new b9e(ebh.r(instant, zoneIdSystemDefault), "recorded", (String) null, 9));
    }
}
