package defpackage;

import com.anthropic.claude.R;
import java.time.Instant;
import java.time.ZoneId;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g36 extends sk8 {
    public static final g36 j = new g36("DiastolicBloodPressureRecord", R.string.health_data_type_diastolic_blood_pressure, jce.a.b(ys1.class), z7e.E, "mmHg", sta.h0(new cpc(ls.H, new ws1(ys1.s, 0)), new cpc(ls.G, new ws1(ys1.r, 0)), new cpc(ls.F, new ws1(ys1.q, 0))), false);

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        ys1 ys1Var = (ys1) y7eVar;
        ys1Var.getClass();
        Instant instant = ys1Var.a;
        ZoneId zoneIdSystemDefault = ys1Var.b;
        if (zoneIdSystemDefault == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        return x44.W(new b9e(ebh.r(instant, zoneIdSystemDefault), String.valueOf(ys1Var.e.E), "mmHg", 1));
    }
}
