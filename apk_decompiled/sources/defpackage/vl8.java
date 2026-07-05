package defpackage;

import com.anthropic.claude.R;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vl8 extends sk8 {
    public static final vl8 j = new vl8("HeartRateRecord", R.string.health_data_type_heart_rate, jce.a.b(xl8.class), z7e.G, "bpm", sta.h0(new cpc(ls.F, new ul8(xl8.g)), new cpc(ls.G, new ul8(xl8.h)), new cpc(ls.H, new ul8(xl8.i)), new cpc(ls.I, new ul8(xl8.j, "count"))), false);

    @Override // defpackage.sk8
    public final List b(y7e y7eVar) {
        xl8 xl8Var = (xl8) y7eVar;
        xl8Var.getClass();
        List<wl8> list = xl8Var.e;
        ArrayList arrayList = new ArrayList(x44.y(list, 10));
        for (wl8 wl8Var : list) {
            Instant instant = wl8Var.a;
            ZoneId zoneIdSystemDefault = xl8Var.b;
            if (zoneIdSystemDefault == null) {
                zoneIdSystemDefault = ZoneId.systemDefault();
            }
            arrayList.add(new b9e(ebh.r(instant, zoneIdSystemDefault), String.valueOf(wl8Var.b), "bpm", 1));
        }
        return arrayList;
    }
}
