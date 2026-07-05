package defpackage;

import com.anthropic.claude.R;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kng extends sk8 {
    public static final kng j = new kng("StepsCadenceRecord", R.string.health_data_type_steps_cadence, jce.a.b(mng.class), z7e.G, "steps/min", sta.h0(new cpc(ls.F, new ws1(mng.g, 9)), new cpc(ls.G, new ws1(mng.h, 9)), new cpc(ls.H, new ws1(mng.i, 9))), false);

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        mng mngVar = (mng) y7eVar;
        mngVar.getClass();
        List<lng> list = mngVar.e;
        ArrayList arrayList = new ArrayList(x44.y(list, 10));
        for (lng lngVar : list) {
            Instant instant = lngVar.a;
            ZoneId zoneIdSystemDefault = mngVar.b;
            if (zoneIdSystemDefault == null) {
                zoneIdSystemDefault = ZoneId.systemDefault();
            }
            arrayList.add(new b9e(ebh.r(instant, zoneIdSystemDefault), String.valueOf(lngVar.b), "steps/min", 1));
        }
        return arrayList;
    }
}
