package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class bnf extends cnf {
    public static int T(ymf ymfVar) {
        Iterator it = ymfVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                x44.m0();
                throw null;
            }
        }
        return i;
    }

    public static ymf U(ymf ymfVar, int i) {
        if (i >= 0) {
            return i == 0 ? ymfVar : ymfVar instanceof kh6 ? ((kh6) ymfVar).b(i) : new fh6(ymfVar, i, 0);
        }
        mr9.q(grc.u("Requested element count ", i, " is less than zero."));
        return null;
    }

    public static bl7 V(ymf ymfVar, bz7 bz7Var) {
        ymfVar.getClass();
        bz7Var.getClass();
        return new bl7(ymfVar, true, bz7Var);
    }

    public static Object W(ymf ymfVar) {
        Iterator it = ymfVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static final rn7 X(ymf ymfVar) {
        d6f d6fVar = new d6f(9);
        return ymfVar instanceof l5i ? ((l5i) ymfVar).c(d6fVar) : new rn7(ymfVar, new d6f(10), d6fVar);
    }

    public static ymf Y(zy7 zy7Var) {
        return new kl4(new uj7(zy7Var, 1, new bg0(3, zy7Var)));
    }

    public static ymf Z(bz7 bz7Var, Object obj) {
        return obj == null ? tm6.a : new uj7(new pza(22, obj), 1, bz7Var);
    }

    public static String a0(ymf ymfVar, String str) throws IOException {
        ymfVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : ymfVar) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            csg.m(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static l5i b0(ymf ymfVar, bz7 bz7Var) {
        ymfVar.getClass();
        bz7Var.getClass();
        return new l5i(ymfVar, bz7Var);
    }

    public static bl7 c0(ymf ymfVar, bz7 bz7Var) {
        return new bl7(new l5i(ymfVar, bz7Var), false, new d6f(11));
    }

    public static ymf d0(ymf ymfVar, int i) {
        if (i >= 0) {
            return i == 0 ? tm6.a : ymfVar instanceof kh6 ? ((kh6) ymfVar).a(i) : new fh6(ymfVar, i, 1);
        }
        mr9.q(grc.u("Requested element count ", i, " is less than zero."));
        return null;
    }

    public static List e0(ymf ymfVar) {
        Iterator it = ymfVar.iterator();
        if (!it.hasNext()) {
            return lm6.E;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return x44.W(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static Set f0(l5i l5iVar) {
        k5i k5iVar = (k5i) l5iVar.iterator();
        if (!k5iVar.hasNext()) {
            return um6.E;
        }
        Object next = k5iVar.next();
        if (!k5iVar.hasNext()) {
            return sf5.f0(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (k5iVar.hasNext()) {
            linkedHashSet.add(k5iVar.next());
        }
        return linkedHashSet;
    }
}
