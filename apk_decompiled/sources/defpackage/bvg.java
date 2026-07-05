package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class bvg {
    public static final k2e a = new k2e(28);
    public static final Object b = new Object();

    public static final void a(int i, int i2, ld4 ld4Var, pz7 pz7Var, iqb iqbVar) {
        int i3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1298353104);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= e18Var.h(pz7Var) ? 32 : 16;
        }
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                iqbVar = fqb.E;
            }
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new fvg(unb.K);
                e18Var.k0(objN);
            }
            b((fvg) objN, iqbVar, pz7Var, e18Var, (i3 << 3) & 1008);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new zug(iqbVar, pz7Var, i, i2);
        }
    }

    public static final void b(fvg fvgVar, iqb iqbVar, pz7 pz7Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-511989831);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(fvgVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(pz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            int iHashCode = Long.hashCode(e18Var.T);
            c18 c18VarF = iuj.F(e18Var);
            iqb iqbVarE = kxk.E(e18Var, iqbVar);
            hyc hycVarL = e18Var.l();
            re4 re4Var = re4.U;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, fvgVar.c, fvgVar);
            d4c.i0(e18Var, fvgVar.d, c18VarF);
            d4c.i0(e18Var, fvgVar.e, pz7Var);
            dd4.e.getClass();
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            e18Var.p(true);
            if (e18Var.C()) {
                e18Var.a0(-1259187287);
                e18Var.p(false);
            } else {
                e18Var.a0(-1259245908);
                boolean zH = e18Var.h(fvgVar);
                Object objN = e18Var.N();
                if (zH || objN == jd4.a) {
                    objN = new x7f(3, fvgVar);
                    e18Var.k0(objN);
                }
                fd9.s((zy7) objN, e18Var);
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new avg(fvgVar, iqbVar, pz7Var, i);
        }
    }
}
