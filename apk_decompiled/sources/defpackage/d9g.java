package defpackage;

import com.anthropic.claude.R;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d9g extends sk8 {
    public static final d9g j = new d9g("SkinTemperatureRecord", R.string.health_data_type_skin_temperature, jce.a.b(f9g.class), z7e.G, "°C", sta.h0(new cpc(ls.F, new ws1(f9g.k, 7)), new cpc(ls.G, new ws1(f9g.l, 7)), new cpc(ls.H, new ws1(f9g.m, 7))), false);

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        f9g f9gVar = (f9g) y7eVar;
        f9gVar.getClass();
        List<e9g> list = f9gVar.f;
        ArrayList arrayList = new ArrayList(x44.y(list, 10));
        for (e9g e9gVar : list) {
            Instant instant = e9gVar.a;
            ZoneId zoneIdSystemDefault = f9gVar.b;
            if (zoneIdSystemDefault == null) {
                zoneIdSystemDefault = ZoneId.systemDefault();
            }
            arrayList.add(new b9e(ebh.r(instant, zoneIdSystemDefault), String.valueOf(e9gVar.b.E), "°C", 1));
        }
        return arrayList;
    }
}
