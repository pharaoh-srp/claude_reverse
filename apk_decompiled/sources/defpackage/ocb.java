package defpackage;

import com.anthropic.claude.R;
import java.time.Instant;
import java.time.ZoneId;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ocb extends sk8 {
    public static final ocb j = new ocb("MenstruationFlowRecord", R.string.health_data_type_menstruation_flow, jce.a.b(pcb.class), z7e.E, null, nm6.E, true);

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        pcb pcbVar = (pcb) y7eVar;
        pcbVar.getClass();
        int i = pcbVar.d;
        String str = i != 1 ? i != 2 ? i != 3 ? "unknown" : "heavy" : "medium" : "light";
        Instant instant = pcbVar.a;
        ZoneId zoneIdSystemDefault = pcbVar.b;
        if (zoneIdSystemDefault == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        return x44.W(new b9e(ebh.r(instant, zoneIdSystemDefault), str, (String) null, 9));
    }
}
