package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f93 {
    public final h86 a;

    public f93(h86 h86Var) {
        this.a = h86Var;
    }

    public static d8a a(List list) {
        d8a d8aVarE = x44.E();
        int size = 0;
        while (size < list.size()) {
            mtc mtcVar = (mtc) list.get(size);
            if (c0l.q(mtcVar) != null) {
                int i = 11;
                List listE0 = bnf.e0(new bl7(new m4h(bnf.b0(w44.E0(list.subList(size, list.size())), new it2(i)), new it2(12)), false, new d6f(i)));
                d8aVarE.add(new xhb(listE0));
                size += listE0.size();
            } else {
                d8aVarE.add(new yhb(mtcVar));
                size++;
            }
        }
        return x44.v(d8aVarE);
    }
}
