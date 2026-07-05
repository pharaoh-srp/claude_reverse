package defpackage;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class sta extends tta {
    public static Object f0(Object obj, Map map) {
        map.getClass();
        if (map instanceof lta) {
            return ((lta) map).b();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        pmf.h(grc.t(obj, "Key ", " is missing in the map."));
        return null;
    }

    public static HashMap g0(cpc... cpcVarArr) {
        HashMap map = new HashMap(tta.d0(cpcVarArr.length));
        n0(map, cpcVarArr);
        return map;
    }

    public static Map h0(cpc... cpcVarArr) {
        cpcVarArr.getClass();
        if (cpcVarArr.length <= 0) {
            return nm6.E;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(tta.d0(cpcVarArr.length));
        n0(linkedHashMap, cpcVarArr);
        return linkedHashMap;
    }

    public static Map i0(Object obj, Map map) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.remove(obj);
        return k0(linkedHashMap);
    }

    public static LinkedHashMap j0(cpc... cpcVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(tta.d0(cpcVarArr.length));
        n0(linkedHashMap, cpcVarArr);
        return linkedHashMap;
    }

    public static final Map k0(LinkedHashMap linkedHashMap) {
        int size = linkedHashMap.size();
        if (size == 0) {
            return nm6.E;
        }
        if (size != 1) {
            return linkedHashMap;
        }
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static LinkedHashMap l0(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map m0(Map map, cpc cpcVar) {
        map.getClass();
        if (map.isEmpty()) {
            return tta.e0(cpcVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(cpcVar.E, cpcVar.F);
        return linkedHashMap;
    }

    public static final void n0(AbstractMap abstractMap, cpc[] cpcVarArr) {
        cpcVarArr.getClass();
        for (cpc cpcVar : cpcVarArr) {
            abstractMap.put(cpcVar.E, cpcVar.F);
        }
    }

    public static List o0(Map map) {
        map.getClass();
        int size = map.size();
        lm6 lm6Var = lm6.E;
        if (size == 0) {
            return lm6Var;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return lm6Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return x44.W(new cpc(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new cpc(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new cpc(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static Map p0(Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            s0(iterable, linkedHashMap);
            return k0(linkedHashMap);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return nm6.E;
        }
        if (size == 1) {
            return tta.e0((cpc) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(tta.d0(collection.size()));
        s0(iterable, linkedHashMap2);
        return linkedHashMap2;
    }

    public static Map q0(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            return nm6.E;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static Map r0(cpc[] cpcVarArr) {
        int length = cpcVarArr.length;
        if (length == 0) {
            return nm6.E;
        }
        if (length == 1) {
            return tta.e0(cpcVarArr[0]);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(tta.d0(cpcVarArr.length));
        n0(linkedHashMap, cpcVarArr);
        return linkedHashMap;
    }

    public static void s0(Iterable iterable, HashMap map) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            cpc cpcVar = (cpc) it.next();
            map.put(cpcVar.E, cpcVar.F);
        }
    }

    public static LinkedHashMap t0(Map map) {
        map.getClass();
        return new LinkedHashMap(map);
    }
}
