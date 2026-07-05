package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qx3 {
    public static final List a;
    public static final Set b;
    public static final lqa c;
    public static final lqa d;

    static {
        List<ox3> list = px3.a;
        a = list;
        b = bnf.f0(bnf.b0(bnf.V(w44.E0(list), new it2(20)), new it2(21)));
        lqa lqaVar = new lqa();
        for (ox3 ox3Var : list) {
            Iterator it = ox3Var.c.iterator();
            while (it.hasNext()) {
                lqaVar.put((String) it.next(), ox3Var);
            }
        }
        c = lqaVar.c();
        lqa lqaVar2 = new lqa();
        for (ox3 ox3Var2 : a) {
            lqaVar2.put(ox3Var2.a, ox3Var2);
            Iterator it2 = ox3Var2.d.iterator();
            while (it2.hasNext()) {
                lqaVar2.put((String) it2.next(), ox3Var2);
            }
        }
        d = lqaVar2.c();
    }

    public static String a(String str) {
        String str2;
        ox3 ox3Var = (ox3) c.get(ikb.a(str));
        if (ox3Var == null) {
            return "plaintext";
        }
        if (!ox3Var.e) {
            ox3Var = null;
        }
        return (ox3Var == null || (str2 = ox3Var.a) == null) ? "plaintext" : str2;
    }
}
