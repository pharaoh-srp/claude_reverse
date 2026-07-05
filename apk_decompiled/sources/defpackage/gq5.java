package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class gq5 {
    public List a;
    public ae2 b;
    public ae2 c;

    public final ae2 a(float f, vp4 vp4Var) {
        ae2 ae2Var = this.c;
        if (ae2Var == null) {
            return null;
        }
        List<Map> list = this.a;
        ArrayList arrayList = new ArrayList();
        for (Map map : list) {
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                double dDoubleValue = ((Number) entry.getKey()).doubleValue();
                fq5 fq5Var = (fq5) entry.getValue();
                knk.u(vp4Var.getContext());
                zd2 zd2Var = fq5Var.b;
                zd2 zd2VarA = zd2Var != null ? zd2Var.a(fq5Var.a, f) : null;
                cpc cpcVar = zd2VarA != null ? new cpc(new Double(dDoubleValue), zd2VarA) : null;
                if (cpcVar != null) {
                    arrayList2.add(cpcVar);
                }
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            Map mapP0 = arrayList2 != null ? sta.p0(arrayList2) : null;
            if (mapP0 != null) {
                arrayList.add(mapP0);
            }
        }
        return ae2Var.a(arrayList, this.b, f);
    }

    public final void b() {
        Map map;
        Map map2;
        d8a d8aVarE = x44.E();
        ae2 ae2Var = this.b;
        Integer numValueOf = ae2Var != null ? Integer.valueOf(ae2Var.E.size()) : null;
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        ae2 ae2Var2 = this.c;
        Integer numValueOf2 = ae2Var2 != null ? Integer.valueOf(ae2Var2.E.size()) : null;
        int iMax = Math.max(iIntValue, numValueOf2 != null ? numValueOf2.intValue() : 0);
        for (int i = 0; i < iMax; i++) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ae2 ae2Var3 = this.b;
            if (ae2Var3 != null && (map2 = (Map) w44.O0(i, ae2Var3)) != null) {
                for (Map.Entry entry : map2.entrySet()) {
                    linkedHashMap.put(Double.valueOf(((Number) entry.getKey()).doubleValue()), new fq5((zd2) entry.getValue(), null));
                }
            }
            ae2 ae2Var4 = this.c;
            if (ae2Var4 != null && (map = (Map) w44.O0(i, ae2Var4)) != null) {
                for (Map.Entry entry2 : map.entrySet()) {
                    double dDoubleValue = ((Number) entry2.getKey()).doubleValue();
                    zd2 zd2Var = (zd2) entry2.getValue();
                    Double dValueOf = Double.valueOf(dDoubleValue);
                    fq5 fq5Var = (fq5) linkedHashMap.get(Double.valueOf(dDoubleValue));
                    linkedHashMap.put(dValueOf, new fq5(fq5Var != null ? fq5Var.a : null, zd2Var));
                }
            }
            d8aVarE.add(linkedHashMap);
        }
        this.a = x44.v(d8aVarE);
    }
}
