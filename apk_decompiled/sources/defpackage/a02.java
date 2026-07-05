package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a02 {
    public static final Map a;
    public static final LinkedHashMap b;
    public static final Set c;
    public static final Set d;

    static {
        xw7 xw7Var = okg.j;
        cpc cpcVar = new cpc(xw7Var.b(sxb.e("name")).g(), sxb.e("name"));
        cpc cpcVar2 = new cpc(xw7Var.b(sxb.e("ordinal")).g(), sxb.e("ordinal"));
        cpc cpcVar3 = new cpc(okg.B.c(sxb.e("size")), sxb.e("size"));
        ww7 ww7Var = okg.F;
        Map mapH0 = sta.h0(cpcVar, cpcVar2, cpcVar3, new cpc(ww7Var.c(sxb.e("size")), sxb.e("size")), new cpc(okg.e.b(sxb.e("length")).g(), sxb.e("length")), new cpc(ww7Var.c(sxb.e("keys")), sxb.e("keySet")), new cpc(ww7Var.c(sxb.e("values")), sxb.e("values")), new cpc(ww7Var.c(sxb.e("entries")), sxb.e("entrySet")));
        a = mapH0;
        Set<Map.Entry> setEntrySet = mapH0.entrySet();
        ArrayList<cpc> arrayList = new ArrayList(x44.y(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new cpc(((ww7) entry.getKey()).f(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (cpc cpcVar4 : arrayList) {
            sxb sxbVar = (sxb) cpcVar4.F;
            Object arrayList2 = linkedHashMap.get(sxbVar);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(sxbVar, arrayList2);
            }
            ((List) arrayList2).add((sxb) cpcVar4.E);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(tta.d0(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), w44.H0((Iterable) entry2.getValue()));
        }
        b = linkedHashMap2;
        Set setKeySet = a.keySet();
        c = setKeySet;
        Set set = setKeySet;
        ArrayList arrayList3 = new ArrayList(x44.y(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList3.add(((ww7) it.next()).f());
        }
        d = w44.t1(arrayList3);
    }
}
