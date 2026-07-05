package defpackage;

import com.anthropic.claude.R;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class re5 extends sk8 {
    public static final re5 j = new re5("CyclingPedalingCadenceRecord", R.string.health_data_type_cycling_pedaling_cadence, jce.a.b(te5.class), z7e.G, "rpm", sta.h0(new cpc(ls.F, new ws1(te5.g, 4)), new cpc(ls.G, new ws1(te5.h, 4)), new cpc(ls.H, new ws1(te5.i, 4))), false);

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        te5 te5Var = (te5) y7eVar;
        te5Var.getClass();
        List<se5> list = te5Var.e;
        ArrayList arrayList = new ArrayList(x44.y(list, 10));
        for (se5 se5Var : list) {
            Instant instant = se5Var.a;
            ZoneId zoneIdSystemDefault = te5Var.b;
            if (zoneIdSystemDefault == null) {
                zoneIdSystemDefault = ZoneId.systemDefault();
            }
            arrayList.add(new b9e(ebh.r(instant, zoneIdSystemDefault), String.valueOf(se5Var.b), "rpm", 1));
        }
        return arrayList;
    }
}
