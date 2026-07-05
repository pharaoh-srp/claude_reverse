package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class m64 implements ee2 {
    public final List a;
    public final List b;
    public final int c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    public final double h;
    public final double i;
    public final uub j;

    public m64(List list, uub uubVar) {
        if (list.isEmpty()) {
            sz6.p("At least one series should be added.");
            throw null;
        }
        List<List> list2 = list;
        ArrayList arrayList = new ArrayList(x44.y(list2, 10));
        for (List list3 : list2) {
            if (list3.isEmpty()) {
                sz6.p("Series can’t be empty.");
                throw null;
            }
            arrayList.add(w44.i1(list3, new mt7(18)));
        }
        this.b = arrayList;
        this.a = x44.G(arrayList);
        Iterator it = arrayList.iterator();
        List list4 = (List) it.next();
        double dMin = ((k64) w44.L0(list4)).a;
        double dMax = ((k64) w44.U0(list4)).a;
        while (it.hasNext()) {
            List list5 = (List) it.next();
            double d = ((k64) w44.L0(list5)).a;
            double d2 = ((k64) w44.U0(list5)).a;
            dMin = Math.min(dMin, d);
            dMax = Math.max(dMax, d2);
        }
        Iterator it2 = this.a.iterator();
        double dMin2 = ((k64) it2.next()).b;
        double dMax2 = dMin2;
        while (it2.hasNext()) {
            double d3 = ((k64) it2.next()).b;
            dMin2 = Math.min(dMin2, d3);
            dMax2 = Math.max(dMax2, d3);
        }
        List list6 = this.a;
        double d4 = 0.0d;
        Double dValueOf = Double.valueOf(0.0d);
        list6.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it3 = list6.iterator();
        while (it3.hasNext()) {
            k64 k64Var = (k64) it3.next();
            double d5 = d4;
            double d6 = k64Var.a;
            double d7 = k64Var.b;
            Object obj = linkedHashMap.get(Double.valueOf(d6));
            cpc cpcVar = (cpc) (obj == null ? new cpc(dValueOf, dValueOf) : obj);
            Iterator it4 = it3;
            double dDoubleValue = ((Number) cpcVar.E).doubleValue();
            double dDoubleValue2 = ((Number) cpcVar.F).doubleValue();
            linkedHashMap.put(Double.valueOf(k64Var.a), d7 < d5 ? new cpc(Double.valueOf(dDoubleValue + d7), Double.valueOf(dDoubleValue2)) : new cpc(Double.valueOf(dDoubleValue), Double.valueOf(dDoubleValue2 + d7)));
            it3 = it4;
            d4 = d5;
        }
        Iterator it5 = linkedHashMap.values().iterator();
        cpc cpcVar2 = (cpc) it5.next();
        double dDoubleValue3 = ((Number) cpcVar2.E).doubleValue();
        double dDoubleValue4 = ((Number) cpcVar2.F).doubleValue();
        while (it5.hasNext()) {
            cpc cpcVar3 = (cpc) it5.next();
            double d8 = dMax2;
            double dDoubleValue5 = ((Number) cpcVar3.E).doubleValue();
            Iterator it6 = it5;
            double dDoubleValue6 = ((Number) cpcVar3.F).doubleValue();
            dDoubleValue3 = Math.min(dDoubleValue3, dDoubleValue5);
            dDoubleValue4 = Math.max(dDoubleValue4, dDoubleValue6);
            it5 = it6;
            dMax2 = d8;
        }
        this.c = this.b.hashCode();
        this.d = dMin;
        this.e = dMax;
        this.f = dMin2;
        this.g = dMax2;
        this.h = dDoubleValue3;
        this.i = dDoubleValue4;
        this.j = uubVar;
    }

    @Override // defpackage.ee2
    public final double a() {
        return this.e;
    }

    @Override // defpackage.ee2
    public final double b() {
        return this.d;
    }

    @Override // defpackage.ee2
    public final double c() {
        return ywj.k(this.a);
    }

    @Override // defpackage.ee2
    public final ee2 d(uub uubVar) {
        return new m64(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, uubVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m64)) {
            return false;
        }
        m64 m64Var = (m64) obj;
        return x44.r(this.b, m64Var.b) && this.c == m64Var.c && this.d == m64Var.d && this.e == m64Var.e && this.f == m64Var.f && this.g == m64Var.g && this.h == m64Var.h && this.i == m64Var.i && x44.r(this.j, m64Var.j);
    }

    @Override // defpackage.ee2
    public final int getId() {
        return this.c;
    }

    public final int hashCode() {
        return this.j.a.hashCode() + fsh.o(this.i, fsh.o(this.h, fsh.o(this.g, fsh.o(this.f, fsh.o(this.e, fsh.o(this.d, ((this.b.hashCode() * 31) + this.c) * 31, 31), 31), 31), 31), 31), 31);
    }

    public m64(List list, List list2, int i, double d, double d2, double d3, double d4, double d5, double d6, uub uubVar) {
        this.a = list;
        this.b = list2;
        this.c = i;
        this.d = d;
        this.e = d2;
        this.f = d3;
        this.g = d4;
        this.h = d5;
        this.i = d6;
        this.j = uubVar;
    }
}
