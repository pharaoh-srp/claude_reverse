package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ur1 {
    public static final rr1 a = new rr1();

    public static final void a(cte cteVar, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        cteVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(917212583);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(cteVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(ta4Var) ? 32 : 16;
        }
        int i3 = 0;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            int i4 = i2 & 14;
            rr1 rr1Var = pte.c(pte.b(cteVar, e18Var)).d;
            rr1Var.getClass();
            e18Var.a0(973002064);
            cz5 cz5Var = (cz5) e18Var.j(ve4.h);
            clh clhVar = pte.c(pte.b(cteVar, e18Var)).a;
            clhVar.getClass();
            float fD = cz5Var.D(clhVar.a) / 2.0f;
            e18Var.p(false);
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = t10.e;
                e18Var.k0(objN);
            }
            o5b o5bVar = (o5b) objN;
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            fqb fqbVar = fqb.E;
            iqb iqbVarE = kxk.E(e18Var, fqbVar);
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
            e18Var.a0(1403188091);
            rr1Var.a(cteVar, e18Var, i4);
            e18Var.p(false);
            xvk.a(gb9.N(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, fD, MTTypesetterKt.kLineSkipLimitMultiplier, fD, 5), null, ta4Var, e18Var, (i2 << 6) & 7168, 6);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new sr1(i, i3, ta4Var, cteVar);
        }
    }
}
