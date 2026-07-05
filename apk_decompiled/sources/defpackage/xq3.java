package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xq3 {
    public static final tkh a = new tkh(0, 0, null, null, xt7.H, 0, 0, 0, 0, 0, null, 16777183);
    public static final long b;
    public static final iqb c;
    public static final long d;

    static {
        long jB = d54.b(0.5f, d54.c);
        b = jB;
        c = yfd.p(fqb.E, jB, zni.b);
        d = eve.B(16);
    }

    public static final void a(cte cteVar, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        cteVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1957181635);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(cteVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i3 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            zq3 zq3Var = pte.c(pte.b(cteVar, e18Var)).e;
            zq3Var.getClass();
            tkh tkhVarF = bte.e(cteVar, e18Var).f(zq3Var.a);
            iqb iqbVar = zq3Var.b;
            iqbVar.getClass();
            cz5 cz5Var = (cz5) e18Var.j(ve4.h);
            clh clhVar = zq3Var.c;
            clhVar.getClass();
            float fD = cz5Var.D(clhVar.a);
            Boolean bool = zq3Var.d;
            bool.getClass();
            vlk.a(cteVar, bool.booleanValue(), fd9.q0(1968694299, new vq3(iqbVar, fD, tkhVarF, ta4Var), e18Var), e18Var, (i2 & 14) | 384);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new sr1(i, i3, ta4Var, cteVar);
        }
    }

    public static final void b(cte cteVar, String str, ld4 ld4Var, int i) {
        int i2;
        cteVar.getClass();
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1183188838);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(cteVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(str) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            a(cteVar, fd9.q0(1557188131, new pp(str, 6), e18Var), e18Var, ((i3 >> 3) & 112) | (i3 & 14) | 384);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new qq(cteVar, str, i, 9);
        }
    }
}
