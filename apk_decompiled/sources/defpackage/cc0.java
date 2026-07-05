package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class cc0 {
    public static final cpc a;

    static {
        lm6 lm6Var = lm6.E;
        a = new cpc(lm6Var, lm6Var);
    }

    public static final void a(zb0 zb0Var, List list, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1794596951);
        int i2 = (i & 6) == 0 ? (e18Var.f(zb0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= e18Var.h(list) ? 32 : 16;
        }
        int i3 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                yb0 yb0Var = (yb0) list.get(i4);
                rz7 rz7Var = (rz7) yb0Var.a;
                int i5 = yb0Var.b;
                int i6 = yb0Var.c;
                Object objN = e18Var.N();
                if (objN == jd4.a) {
                    objN = t10.d;
                    e18Var.k0(objN);
                }
                o5b o5bVar = (o5b) objN;
                int iHashCode = Long.hashCode(e18Var.T);
                hyc hycVarL = e18Var.l();
                iqb iqbVarE = kxk.E(e18Var, fqb.E);
                dd4.e.getClass();
                re4 re4Var = cd4.b;
                e18Var.e0();
                if (e18Var.S) {
                    e18Var.k(re4Var);
                } else {
                    e18Var.n0();
                }
                d4c.i0(e18Var, cd4.f, o5bVar);
                d4c.i0(e18Var, cd4.e, hycVarL);
                d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
                d4c.h0(e18Var, cd4.h);
                d4c.i0(e18Var, cd4.d, iqbVarE);
                rz7Var.invoke(zb0Var.subSequence(i5, i6).F, e18Var, 0);
                e18Var.p(true);
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new qq(zb0Var, list, i, i3);
        }
    }
}
