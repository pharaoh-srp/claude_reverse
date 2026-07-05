package defpackage;

import com.anthropic.claude.R;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kad extends sk8 {
    public static final kad j = new kad("PowerRecord", R.string.health_data_type_power, jce.a.b(mad.class), z7e.G, "watts", sta.h0(new cpc(ls.F, new ws1(mad.h, 5)), new cpc(ls.G, new ws1(mad.i, 5)), new cpc(ls.H, new ws1(mad.j, 5))), false);

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        mad madVar = (mad) y7eVar;
        madVar.getClass();
        List<lad> list = madVar.e;
        ArrayList arrayList = new ArrayList(x44.y(list, 10));
        for (lad ladVar : list) {
            Instant instant = ladVar.a;
            ZoneId zoneIdSystemDefault = madVar.b;
            if (zoneIdSystemDefault == null) {
                zoneIdSystemDefault = ZoneId.systemDefault();
            }
            arrayList.add(new b9e(ebh.r(instant, zoneIdSystemDefault), String.valueOf(ladVar.b.a()), "watts", 1));
        }
        return arrayList;
    }
}
