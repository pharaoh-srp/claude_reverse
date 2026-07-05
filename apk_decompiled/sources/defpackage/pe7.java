package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pe7 {
    public static final LinkedHashMap a;
    public static final Map b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a = linkedHashMap;
        b(ikg.q, a("java.util.ArrayList", "java.util.LinkedList"));
        b(ikg.r, a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b(ikg.s, a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        b(gh3.j(new ww7("java.util.function.Function")), a("java.util.function.UnaryOperator"));
        b(gh3.j(new ww7("java.util.function.BiFunction")), a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new cpc(((gh3) entry.getKey()).b(), ((gh3) entry.getValue()).b()));
        }
        b = sta.p0(arrayList);
    }

    public static ArrayList a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(gh3.j(new ww7(str)));
        }
        return arrayList;
    }

    public static void b(gh3 gh3Var, ArrayList arrayList) {
        for (Object obj : arrayList) {
            a.put(obj, gh3Var);
        }
    }
}
