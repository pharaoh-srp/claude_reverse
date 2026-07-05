package defpackage;

import io.sentry.e0;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eai {
    public static final xc0 a;
    public static final xc0 b;

    static {
        ww7 ww7Var = mj9.p;
        ww7Var.getClass();
        a = new xc0(ww7Var);
        ww7 ww7Var2 = mj9.q;
        ww7Var2.getClass();
        b = new xc0(ww7Var2);
    }

    public static final wc0 a(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? new xc0(w44.p1(list), 1) : (wc0) w44.e1(list);
        }
        sz6.j("At least one Annotations object expected");
        return null;
    }

    public static final qqb b(xh3 xh3Var, df9 df9Var, int i) {
        if (wvk.m(i) && (xh3Var instanceof qqb)) {
            if (df9Var.b == jub.E && i == 1) {
                qqb qqbVar = (qqb) xh3Var;
                String str = ue9.a;
                xw7 xw7VarG = m06.g(qqbVar);
                HashMap map = ue9.j;
                if (map.containsKey(xw7VarG)) {
                    ww7 ww7Var = (ww7) map.get(m06.g(qqbVar));
                    if (ww7Var != null) {
                        return o06.e(qqbVar).i(ww7Var);
                    }
                    e0.d(qqbVar, " is not a mutable collection", "Given class ");
                    return null;
                }
            }
            if (df9Var.b == jub.F && i == 2) {
                qqb qqbVar2 = (qqb) xh3Var;
                String str2 = ue9.a;
                if (ue9.k.containsKey(m06.g(qqbVar2))) {
                    return zp3.l(qqbVar2);
                }
            }
        }
        return null;
    }

    public static final Boolean d(df9 df9Var, int i) {
        if (!wvk.m(i)) {
            return null;
        }
        p9c p9cVar = df9Var.a;
        int i2 = p9cVar == null ? -1 : dai.a[p9cVar.ordinal()];
        if (i2 == 1) {
            return Boolean.TRUE;
        }
        if (i2 != 2) {
            return null;
        }
        return Boolean.FALSE;
    }

    public static final xc0 e() {
        return a;
    }
}
