package defpackage;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class iof implements fs {
    public final Set a;
    public final aqh b;
    public final x91 c;
    public Double d;
    public Double e;
    public final LinkedHashSet f;
    public final wr g;

    public iof(pl9 pl9Var, Set set, aqh aqhVar) {
        pl9Var.getClass();
        set.getClass();
        aqhVar.getClass();
        this.a = set;
        this.b = aqhVar;
        this.c = new x91();
        this.f = new LinkedHashSet();
        wr wrVar = (wr) kof.a.get(pl9Var);
        if (wrVar == null) {
            xh6.k("Non supported fallback series record ", pl9Var);
            throw null;
        }
        this.g = wrVar;
        if (mp0.Z0(new vr[]{wrVar.a, wrVar.b, wrVar.c}).containsAll(set)) {
            return;
        }
        StringBuilder sb = new StringBuilder("Invalid set of metrics ");
        Set set2 = set;
        ArrayList arrayList = new ArrayList(x44.y(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(((vr) it.next()).a());
        }
        sb.append(arrayList);
        throw new IllegalStateException(sb.toString().toString());
    }

    @Override // defpackage.fs
    public final hs a() {
        Map linkedHashMap;
        double dDoubleValue;
        LinkedHashSet linkedHashSet = this.f;
        boolean zIsEmpty = linkedHashSet.isEmpty();
        nm6 nm6Var = nm6.E;
        if (zIsEmpty) {
            linkedHashMap = nm6Var;
        } else {
            Set<vr> set = this.a;
            int iD0 = tta.d0(x44.y(set, 10));
            if (iD0 < 16) {
                iD0 = 16;
            }
            linkedHashMap = new LinkedHashMap(iD0);
            for (vr vrVar : set) {
                String strA = vrVar.a();
                wr wrVar = this.g;
                if (vrVar == wrVar.a) {
                    x91 x91Var = this.c;
                    dDoubleValue = x91Var.b / ((double) x91Var.a);
                } else if (vrVar == wrVar.c) {
                    Double d = this.e;
                    d.getClass();
                    dDoubleValue = d.doubleValue();
                } else {
                    if (vrVar != wrVar.b) {
                        throw new IllegalStateException("Invalid fallback aggregation metric ".concat(vrVar.a()).toString());
                    }
                    Double d2 = this.d;
                    d2.getClass();
                    dDoubleValue = d2.doubleValue();
                }
                linkedHashMap.put(strA, Double.valueOf(dDoubleValue));
            }
        }
        return new hs(nm6Var, linkedHashMap, linkedHashSet);
    }

    @Override // defpackage.fs
    public final void b(y7e y7eVar) {
        Instant instant;
        jof jofVar = (jof) y7eVar;
        jofVar.getClass();
        List listD = jofVar.d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD) {
            obj.getClass();
            if (obj instanceof se5) {
                instant = ((se5) obj).a;
            } else if (obj instanceof cig) {
                instant = ((cig) obj).a;
            } else {
                if (!(obj instanceof lng)) {
                    sz6.j(ij0.B("Unsupported type for time: ", obj));
                    return;
                }
                instant = ((lng) obj).a;
            }
            if (msk.f(instant, this.b, jofVar.g())) {
                arrayList.add(obj);
            }
        }
        for (Object obj2 : arrayList) {
            double dM = vok.m(obj2);
            x91 x91Var = this.c;
            x91Var.a++;
            x91Var.b += dM;
            Double d = this.d;
            this.d = Double.valueOf(Math.min(d != null ? d.doubleValue() : vok.m(obj2), vok.m(obj2)));
            Double d2 = this.e;
            this.e = Double.valueOf(Math.max(d2 != null ? d2.doubleValue() : vok.m(obj2), vok.m(obj2)));
        }
        this.f.add(jofVar.m().c);
    }
}
