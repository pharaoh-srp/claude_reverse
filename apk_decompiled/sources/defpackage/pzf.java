package defpackage;

import com.anthropic.claude.R;
import java.time.Instant;
import java.time.ZoneId;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pzf extends sk8 {
    public static final pzf j = new pzf("SexualActivityRecord", R.string.health_data_type_sexual_activity, jce.a.b(qzf.class), z7e.E, null, nm6.E, true);

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        qzf qzfVar = (qzf) y7eVar;
        qzfVar.getClass();
        int i = qzfVar.d;
        String str = i != 1 ? i != 2 ? "unknown" : "unprotected" : "protected";
        Instant instant = qzfVar.a;
        ZoneId zoneIdSystemDefault = qzfVar.b;
        if (zoneIdSystemDefault == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        return x44.W(new b9e(ebh.r(instant, zoneIdSystemDefault), str, (String) null, 9));
    }
}
