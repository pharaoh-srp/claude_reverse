package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.jsoup.helper.ValidationException;

/* JADX INFO: loaded from: classes3.dex */
public final class x3f {
    public static final v3f f = v3f.a(":all");
    public final HashSet a = new HashSet();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean e = false;

    public final void a(String str, String... strArr) {
        pqi.n(str);
        pqi.l("No attribute names supplied.", strArr.length > 0);
        c(str);
        v3f v3fVarA = v3f.a(str);
        HashSet hashSet = new HashSet();
        for (String str2 : strArr) {
            pqi.n(str2);
            hashSet.add(new s3f(ouk.g(str2)));
        }
        ((Set) this.b.computeIfAbsent(v3fVarA, new a41(4))).addAll(hashSet);
    }

    public final void b(String str, String str2, String... strArr) {
        pqi.n(str);
        pqi.n(str2);
        Set set = (Set) ((Map) this.d.computeIfAbsent(v3f.a(str), new a41(5))).computeIfAbsent(new s3f(ouk.g(str2)), new a41(6));
        for (String str3 : strArr) {
            pqi.n(str3);
            set.add(new u3f(str3));
        }
    }

    public final void c(String... strArr) {
        for (String str : strArr) {
            pqi.n(str);
            if (str.equalsIgnoreCase("noscript")) {
                throw new ValidationException("noscript is unsupported in Safelists, due to incompatibilities between parsers with and without script-mode enabled");
            }
            this.a.add(v3f.a(str));
        }
    }

    public final boolean d(String str, yj6 yj6Var, l31 l31Var) {
        v3f v3fVarA = v3f.a(str);
        s3f s3fVar = new s3f(ouk.g(l31Var.E));
        Set set = (Set) this.b.get(v3fVarA);
        if (set == null || !set.contains(s3fVar)) {
            Map map = (Map) this.c.get(v3fVarA);
            return (map == null || !map.containsKey(s3fVar)) ? !str.equals(":all") && d(":all", yj6Var, l31Var) : ((t3f) map.get(s3fVar)).equals(new t3f(n31.h(l31Var.F)));
        }
        HashMap map2 = this.d;
        if (!map2.containsKey(v3fVarA)) {
            return true;
        }
        Map map3 = (Map) map2.get(v3fVarA);
        if (!map3.containsKey(s3fVar)) {
            return true;
        }
        String strA = yj6Var.a(l31Var.E);
        if (strA.isEmpty()) {
            strA = n31.h(l31Var.F);
        }
        Iterator it = ((Set) map3.get(s3fVar)).iterator();
        while (it.hasNext()) {
            String str2 = ((u3f) it.next()).a;
            if (!str2.equals("#")) {
                if (ouk.g(strA).startsWith(str2.concat(":"))) {
                    return true;
                }
            } else if (strA.startsWith("#") && !strA.matches(".*\\s.*")) {
                return true;
            }
        }
        return false;
    }

    public final boolean e(v3f v3fVar, s3f s3fVar) {
        Set set = (Set) this.b.get(v3fVar);
        if (set != null && set.contains(s3fVar)) {
            Map map = (Map) this.d.get(v3fVar);
            return map != null && map.containsKey(s3fVar);
        }
        Map map2 = (Map) this.c.get(v3fVar);
        if (map2 != null && map2.containsKey(s3fVar)) {
            return false;
        }
        v3f v3fVar2 = f;
        return !v3fVar.equals(v3fVar2) && e(v3fVar2, s3fVar);
    }
}
