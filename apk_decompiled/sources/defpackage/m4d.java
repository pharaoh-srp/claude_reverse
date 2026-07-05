package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m4d {
    public static final vve a = xve.b(8.0f);

    public static final void a(String str, iqb iqbVar, z74 z74Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        z74 z74Var2;
        z74 z74Var3;
        int i3;
        Object hreVar;
        z74 z74Var4;
        boolean z;
        str.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-272642453);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.f(iqbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i4 = 0;
        if (e18Var2.Q(i2 & 1, (i2 & 147) != 146)) {
            e18Var2.V();
            int i5 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i5 == 0 || e18Var2.A()) {
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN = e18Var2.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(z74.class), null, null);
                    e18Var2.k0(objN);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                z74Var3 = (z74) objN;
                i3 = i2 & (-897);
            } else {
                e18Var2.T();
                i3 = i2 & (-897);
                z74Var3 = z74Var;
            }
            e18Var2.q();
            jl3 jl3VarA = gm3.a(e18Var2);
            int i6 = i3 & 14;
            boolean z2 = i6 == 4;
            Object objN2 = e18Var2.N();
            if (z2 || objN2 == lz1Var) {
                try {
                    hreVar = z74Var3.a(str);
                } catch (Throwable th) {
                    hreVar = new hre(th);
                }
                if (hreVar instanceof hre) {
                    hreVar = null;
                }
                objN2 = (jz0) hreVar;
                e18Var2.k0(objN2);
            }
            jz0 jz0Var = (jz0) objN2;
            iqb iqbVarC = b.c(gb9.N(iqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 20.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), 1.0f);
            long j = jl3VarA.v;
            vve vveVar = a;
            iqb iqbVarJ = gb9.J(yfd.p(ez1.t(iqbVarC, 1.0f, j, vveVar), jl3VarA.n, vveVar), 12.0f);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var2, 0);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarJ);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, q64VarA);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            if (jz0Var != null) {
                e18Var2.a0(2134898374);
                xvk.c(null, fd9.q0(20599607, new l4d(jz0Var, i4), e18Var2), e18Var2, 48, 1);
                e18Var2.p(false);
                e18Var = e18Var2;
                z74Var4 = z74Var3;
                z = true;
            } else {
                e18Var2.a0(2135022467);
                z74Var4 = z74Var3;
                tjh.b(str, null, gm3.a(e18Var2).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (tkh) ((wk) gm3.c(e18Var2).e.F).f, e18Var2, i6, 0, 131066);
                e18Var = e18Var2;
                e18Var.p(false);
                z = true;
            }
            e18Var.p(z);
            z74Var2 = z74Var4;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            z74Var2 = z74Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v76(str, iqbVar, z74Var2, i, 21);
        }
    }
}
