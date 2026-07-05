package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class vs1 implements fs {
    public final Set a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final LinkedHashSet d;

    public vs1(Set set) {
        set.getClass();
        this.a = set;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashSet();
        if (!us1.a.containsAll(set)) {
            StringBuilder sb = new StringBuilder("Invalid set of blood pressure fallback aggregation metrics ");
            Set set2 = set;
            ArrayList arrayList = new ArrayList(x44.y(set2, 10));
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                arrayList.add(((vr) it.next()).a());
            }
            sb.append(arrayList);
            throw new IllegalStateException(sb.toString().toString());
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            vr vrVar = (vr) it2.next();
            if (x44.r(vrVar, ys1.q) || x44.r(vrVar, ys1.n)) {
                this.b.put(vrVar, new x91());
            } else {
                if (!x44.r(vrVar, ys1.s) && !x44.r(vrVar, ys1.r) && !x44.r(vrVar, ys1.p) && !x44.r(vrVar, ys1.o)) {
                    throw new IllegalStateException("Invalid blood pressure fallback aggregation metric ".concat(vrVar.a()).toString());
                }
                this.c.put(vrVar, null);
            }
        }
    }

    @Override // defpackage.fs
    public final hs a() {
        Map linkedHashMap;
        double dDoubleValue;
        LinkedHashSet linkedHashSet = this.d;
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
                if (vrVar == ys1.q || vrVar == ys1.n) {
                    Object obj = this.b.get(vrVar);
                    obj.getClass();
                    x91 x91Var = (x91) obj;
                    dDoubleValue = x91Var.b / ((double) x91Var.a);
                } else {
                    if (vrVar != ys1.s && vrVar != ys1.r && vrVar != ys1.p && vrVar != ys1.o) {
                        throw new IllegalStateException("Invalid blood pressure fallback aggregation type ".concat(vrVar.a()).toString());
                    }
                    Object obj2 = this.c.get(vrVar);
                    obj2.getClass();
                    dDoubleValue = ((Number) obj2).doubleValue();
                }
                linkedHashMap.put(strA, Double.valueOf(dDoubleValue));
            }
        }
        return new hs(nm6Var, linkedHashMap, linkedHashSet);
    }

    @Override // defpackage.fs
    public final void b(y7e y7eVar) {
        ys1 ys1Var = (ys1) y7eVar;
        ys1Var.getClass();
        double d = ys1Var.e.E;
        double d2 = ys1Var.d.E;
        for (vr vrVar : this.a) {
            boolean zR = x44.r(vrVar, ys1.q);
            LinkedHashMap linkedHashMap = this.b;
            if (zR) {
                Object obj = linkedHashMap.get(vrVar);
                obj.getClass();
                x91 x91Var = (x91) obj;
                x91Var.a++;
                x91Var.b += d;
            } else {
                boolean zR2 = x44.r(vrVar, ys1.s);
                LinkedHashMap linkedHashMap2 = this.c;
                if (zR2) {
                    Double d3 = (Double) linkedHashMap2.get(vrVar);
                    linkedHashMap2.put(vrVar, Double.valueOf(Math.max(d3 != null ? d3.doubleValue() : d, d)));
                } else if (x44.r(vrVar, ys1.r)) {
                    Double d4 = (Double) linkedHashMap2.get(vrVar);
                    linkedHashMap2.put(vrVar, Double.valueOf(Math.min(d4 != null ? d4.doubleValue() : d, d)));
                } else if (x44.r(vrVar, ys1.n)) {
                    Object obj2 = linkedHashMap.get(vrVar);
                    obj2.getClass();
                    x91 x91Var2 = (x91) obj2;
                    x91Var2.a++;
                    x91Var2.b += d2;
                } else if (x44.r(vrVar, ys1.p)) {
                    Double d5 = (Double) linkedHashMap2.get(vrVar);
                    linkedHashMap2.put(vrVar, Double.valueOf(Math.max(d5 != null ? d5.doubleValue() : d2, d2)));
                } else if (x44.r(vrVar, ys1.o)) {
                    Double d6 = (Double) linkedHashMap2.get(vrVar);
                    linkedHashMap2.put(vrVar, Double.valueOf(Math.min(d6 != null ? d6.doubleValue() : d2, d2)));
                }
            }
            this.d.add(ys1Var.c.c);
        }
    }
}
