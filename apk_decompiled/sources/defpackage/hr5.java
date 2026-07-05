package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class hr5 {
    public LinkedHashMap a;

    public hr5(int i) {
        switch (i) {
            case 1:
                this.a = new LinkedHashMap();
                break;
            default:
                int iD0 = tta.d0(x44.y(um6.E, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iD0 < 16 ? 16 : iD0);
                km6.E.getClass();
                this.a = linkedHashMap;
                break;
        }
    }

    public boolean a(String str) {
        str.getClass();
        vs8 vs8VarC = null;
        try {
            us8 us8Var = new us8();
            us8Var.h(null, str);
            vs8VarC = us8Var.c();
        } catch (IllegalArgumentException unused) {
        }
        if (vs8VarC == null) {
            return false;
        }
        String str2 = vs8VarC.d;
        Set<String> setKeySet = this.a.keySet();
        if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
            return false;
        }
        for (String str3 : setKeySet) {
            if (!x44.r(str3, "*") && !x44.r(str2, str3)) {
                if (isg.h0(str2, "." + str3, false)) {
                }
            }
            return true;
        }
        return false;
    }

    public List b(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = this.a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (x44.r(((xfj) entry.getKey()).b(), str)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap2.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap.remove((xfj) it.next());
        }
        return w44.p1(linkedHashMap2.values());
    }

    public hlg c(xfj xfjVar) {
        LinkedHashMap linkedHashMap = this.a;
        Object hlgVar = linkedHashMap.get(xfjVar);
        if (hlgVar == null) {
            hlgVar = new hlg(xfjVar);
            linkedHashMap.put(xfjVar, hlgVar);
        }
        return (hlg) hlgVar;
    }
}
