package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wgg {
    public static final ArrayList a;
    public static final ArrayList b;
    public static final Map c;
    public static final LinkedHashMap d;
    public static final Set e;
    public static final Set f;
    public static final tgg g;
    public static final Map h;
    public static final LinkedHashMap i;
    public static final ArrayList j;
    public static final LinkedHashMap k;

    static {
        Set setZ0 = mp0.Z0(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(x44.y(setZ0, 10));
        Iterator it = setZ0.iterator();
        while (it.hasNext()) {
            arrayList.add(am4.o("java/util/Collection", (String) it.next(), "Ljava/util/Collection;", nk9.BOOLEAN.G));
        }
        a = arrayList;
        ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((tgg) it2.next()).b);
        }
        b = arrayList2;
        ArrayList arrayList3 = a;
        ArrayList arrayList4 = new ArrayList(x44.y(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((tgg) it3.next()).a.b());
        }
        String strConcat = "java/util/".concat("Collection");
        nk9 nk9Var = nk9.BOOLEAN;
        String str = nk9Var.G;
        String str2 = nk9Var.G;
        tgg tggVarO = am4.o(strConcat, "contains", "Ljava/lang/Object;", str);
        vgg vggVar = vgg.H;
        cpc cpcVar = new cpc(tggVarO, vggVar);
        cpc cpcVar2 = new cpc(am4.o("java/util/".concat("Collection"), "remove", "Ljava/lang/Object;", str2), vggVar);
        cpc cpcVar3 = new cpc(am4.o("java/util/".concat("Map"), "containsKey", "Ljava/lang/Object;", str2), vggVar);
        cpc cpcVar4 = new cpc(am4.o("java/util/".concat("Map"), "containsValue", "Ljava/lang/Object;", str2), vggVar);
        cpc cpcVar5 = new cpc(am4.o("java/util/".concat("Map"), "remove", "Ljava/lang/Object;Ljava/lang/Object;", str2), vggVar);
        cpc cpcVar6 = new cpc(am4.o("java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), vgg.I);
        tgg tggVarO2 = am4.o("java/util/".concat("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        vgg vggVar2 = vgg.F;
        cpc cpcVar7 = new cpc(tggVarO2, vggVar2);
        cpc cpcVar8 = new cpc(am4.o("java/util/".concat("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), vggVar2);
        String strConcat2 = "java/util/".concat("List");
        nk9 nk9Var2 = nk9.INT;
        tgg tggVarO3 = am4.o(strConcat2, "indexOf", "Ljava/lang/Object;", nk9Var2.G);
        vgg vggVar3 = vgg.G;
        Map mapH0 = sta.h0(cpcVar, cpcVar2, cpcVar3, cpcVar4, cpcVar5, cpcVar6, cpcVar7, cpcVar8, new cpc(tggVarO3, vggVar3), new cpc(am4.o("java/util/".concat("List"), "lastIndexOf", "Ljava/lang/Object;", nk9Var2.G), vggVar3));
        c = mapH0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(tta.d0(mapH0.size()));
        for (Map.Entry entry : mapH0.entrySet()) {
            linkedHashMap.put(((tgg) entry.getKey()).b, entry.getValue());
        }
        d = linkedHashMap;
        LinkedHashSet linkedHashSetP0 = dxf.p0(c.keySet(), a);
        ArrayList arrayList5 = new ArrayList(x44.y(linkedHashSetP0, 10));
        Iterator it4 = linkedHashSetP0.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((tgg) it4.next()).a);
        }
        e = w44.t1(arrayList5);
        ArrayList arrayList6 = new ArrayList(x44.y(linkedHashSetP0, 10));
        Iterator it5 = linkedHashSetP0.iterator();
        while (it5.hasNext()) {
            arrayList6.add(((tgg) it5.next()).b);
        }
        f = w44.t1(arrayList6);
        nk9 nk9Var3 = nk9.INT;
        String str3 = nk9Var3.G;
        String str4 = nk9Var3.G;
        tgg tggVarO4 = am4.o("java/util/List", "removeAt", str3, "Ljava/lang/Object;");
        g = tggVarO4;
        Map mapH02 = sta.h0(new cpc(am4.o("java/lang/".concat("Number"), "toByte", "", nk9.BYTE.G), sxb.e("byteValue")), new cpc(am4.o("java/lang/".concat("Number"), "toShort", "", nk9.SHORT.G), sxb.e("shortValue")), new cpc(am4.o("java/lang/".concat("Number"), "toInt", "", str4), sxb.e("intValue")), new cpc(am4.o("java/lang/".concat("Number"), "toLong", "", nk9.LONG.G), sxb.e("longValue")), new cpc(am4.o("java/lang/".concat("Number"), "toFloat", "", nk9.FLOAT.G), sxb.e("floatValue")), new cpc(am4.o("java/lang/".concat("Number"), "toDouble", "", nk9.DOUBLE.G), sxb.e("doubleValue")), new cpc(tggVarO4, sxb.e("remove")), new cpc(am4.o("java/lang/".concat("CharSequence"), "get", str4, nk9.CHAR.G), sxb.e("charAt")));
        h = mapH02;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(tta.d0(mapH02.size()));
        for (Map.Entry entry2 : mapH02.entrySet()) {
            linkedHashMap2.put(((tgg) entry2.getKey()).b, entry2.getValue());
        }
        i = linkedHashMap2;
        Set setKeySet = h.keySet();
        ArrayList arrayList7 = new ArrayList(x44.y(setKeySet, 10));
        Iterator it6 = setKeySet.iterator();
        while (it6.hasNext()) {
            arrayList7.add(((tgg) it6.next()).a);
        }
        j = arrayList7;
        Set<Map.Entry> setEntrySet = h.entrySet();
        ArrayList<cpc> arrayList8 = new ArrayList(x44.y(setEntrySet, 10));
        for (Map.Entry entry3 : setEntrySet) {
            arrayList8.add(new cpc(((tgg) entry3.getKey()).a, entry3.getValue()));
        }
        int iD0 = tta.d0(x44.y(arrayList8, 10));
        if (iD0 < 16) {
            iD0 = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iD0);
        for (cpc cpcVar9 : arrayList8) {
            linkedHashMap3.put((sxb) cpcVar9.F, (sxb) cpcVar9.E);
        }
        k = linkedHashMap3;
    }
}
