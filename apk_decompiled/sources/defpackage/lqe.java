package defpackage;

import com.anthropic.claude.R;
import java.time.Instant;
import java.time.ZoneId;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lqe extends sk8 {
    public static final lqe j = new lqe("RespiratoryRateRecord", R.string.health_data_type_respiratory_rate, jce.a.b(mqe.class), z7e.E, "breaths/min", nm6.E, false);

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        mqe mqeVar = (mqe) y7eVar;
        mqeVar.getClass();
        Instant instant = mqeVar.a;
        ZoneId zoneIdSystemDefault = mqeVar.b;
        if (zoneIdSystemDefault == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        return x44.W(new b9e(ebh.r(instant, zoneIdSystemDefault), String.valueOf(mqeVar.c), "breaths/min", 1));
    }
}
