package defpackage;

import com.anthropic.claude.R;
import java.time.Instant;
import java.time.ZoneId;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pmc extends sk8 {
    public static final pmc j = new pmc("OxygenSaturationRecord", R.string.health_data_type_oxygen_saturation, jce.a.b(qmc.class), z7e.E, "%", nm6.E, false);

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        qmc qmcVar = (qmc) y7eVar;
        qmcVar.getClass();
        Instant instant = qmcVar.a;
        ZoneId zoneIdSystemDefault = qmcVar.b;
        if (zoneIdSystemDefault == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        return x44.W(new b9e(ebh.r(instant, zoneIdSystemDefault), String.valueOf(qmcVar.c.E), "%", 1));
    }
}
