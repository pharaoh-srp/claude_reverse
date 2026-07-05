package defpackage;

import com.anthropic.claude.R;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class big extends sk8 {
    public static final big j = new big("SpeedRecord", R.string.health_data_type_speed, jce.a.b(dig.class), z7e.G, "m/s", sta.h0(new cpc(ls.F, new ws1(dig.h, 8)), new cpc(ls.G, new ws1(dig.i, 8)), new cpc(ls.H, new ws1(dig.j, 8))), false);

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        dig digVar = (dig) y7eVar;
        digVar.getClass();
        List<cig> list = digVar.e;
        ArrayList arrayList = new ArrayList(x44.y(list, 10));
        for (cig cigVar : list) {
            Instant instant = cigVar.a;
            ZoneId zoneIdSystemDefault = digVar.b;
            if (zoneIdSystemDefault == null) {
                zoneIdSystemDefault = ZoneId.systemDefault();
            }
            arrayList.add(new b9e(ebh.r(instant, zoneIdSystemDefault), String.valueOf(cigVar.b.a()), "m/s", 1));
        }
        return arrayList;
    }
}
