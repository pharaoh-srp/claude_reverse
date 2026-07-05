package defpackage;

import com.anthropic.claude.R;
import java.time.Instant;
import java.time.ZoneId;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kmc extends sk8 {
    public static final kmc j = new kmc("OvulationTestRecord", R.string.health_data_type_ovulation_test, jce.a.b(lmc.class), z7e.E, null, nm6.E, true);

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        lmc lmcVar = (lmc) y7eVar;
        lmcVar.getClass();
        int i = lmcVar.c;
        String str = i != 0 ? i != 1 ? i != 2 ? i != 3 ? "unknown" : "negative" : "high" : "positive" : "inconclusive";
        Instant instant = lmcVar.a;
        ZoneId zoneIdSystemDefault = lmcVar.b;
        if (zoneIdSystemDefault == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        return x44.W(new b9e(ebh.r(instant, zoneIdSystemDefault), str, (String) null, 9));
    }
}
