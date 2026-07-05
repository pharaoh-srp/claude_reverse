package defpackage;

import com.anthropic.claude.settings.internal.growthbook.GateKind;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
public final class id8 extends iwe {
    public static final xbd k = new xbd("custom_features_v2");
    public static final epk l;
    public final rc8 b;
    public final vg5 c;
    public final fn0 d;
    public final rc8 e;
    public final List f;
    public final Map g;
    public final Map h;
    public final mdg i;
    public final lsc j;

    static {
        l18 l18Var = new l18();
        l18 l18Var2 = new l18();
        new hz6(21).invoke(l18Var);
        new ed8(2).invoke(l18Var2);
        epk epkVar = new epk();
        epkVar.E = l18Var;
        epkVar.F = l18Var2;
        l = epkVar;
    }

    public id8(rc8 rc8Var, m78 m78Var, vg5 vg5Var, fn0 fn0Var, h86 h86Var) {
        rc8 rc8Var2;
        super(h86Var);
        this.b = rc8Var;
        this.c = vg5Var;
        this.d = fn0Var;
        tp4 tp4Var = null;
        if (rc8Var == null && m78Var == null) {
            sz6.p("At least one GrowthBookFeatureManager must be provided");
            throw null;
        }
        if (rc8Var == null) {
            m78Var.getClass();
            rc8Var2 = m78Var;
        } else {
            rc8Var2 = rc8Var;
        }
        this.e = rc8Var2;
        epk epkVar = l;
        l18 l18Var = rc8Var == null ? (l18) epkVar.E : (l18) epkVar.F;
        this.f = w44.p1(l18Var.a);
        this.g = sta.q0(l18Var.b);
        this.h = sta.q0(l18Var.c);
        this.i = new mdg();
        this.j = mpk.P(nm6.E);
        O();
        gb9.D(this.a, null, null, new cj(this, tp4Var, 29), 3);
    }

    public final void O() {
        rc8 rc8Var = this.e;
        Set setQ = rc8Var.q();
        List list = this.f;
        lsc lscVar = this.j;
        Set setT1 = w44.t1(w44.a1(w44.a1(list, ((Map) lscVar.getValue()).keySet()), setQ));
        mdg mdgVar = this.i;
        Set<String> set = setT1;
        Iterator it = dxf.o0(mdgVar.G, set).iterator();
        while (it.hasNext()) {
            mdgVar.remove((String) it.next());
        }
        for (String str : set) {
            pg7 pg7VarN = rc8Var.n(str);
            JsonElement defaultValue = pg7VarN != null ? pg7VarN.b.getDefaultValue() : null;
            boolean zContains = setQ.contains(str);
            GateKind gateKind = (GateKind) this.g.get(str);
            if (gateKind == null) {
                gateKind = (GateKind) ((Map) lscVar.getValue()).get(str);
            }
            mdgVar.put(str, new n18(str, defaultValue, zContains, gateKind, (String) this.h.get(str)));
        }
    }
}
