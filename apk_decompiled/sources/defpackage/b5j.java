package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b5j {
    public static final vve a = xve.b(32.0f);
    public static final float b = 12.0f;
    public static final long c;
    public static final long d;

    static {
        long j = d54.b;
        c = d54.b(0.1f, j);
        d = d54.b(0.25f, j);
    }

    public static final void a(int i, int i2, int i3, ld4 ld4Var, iqb iqbVar) {
        long j;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(57144121);
        int i4 = (e18Var.d(i) ? 4 : 2) | i3 | (e18Var.d(i2) ? 32 : 16) | 384;
        if (e18Var.Q(i4 & 1, (i4 & 147) != 146)) {
            cxe cxeVarA = axe.a(new ho0(8.0f, true, new sz6(1)), lja.P, e18Var, 6);
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
            d4c.i0(e18Var, cd4.f, cxeVarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            e18Var.a0(19617766);
            for (int i5 = 0; i5 < i; i5++) {
                if (i5 == i2) {
                    e18Var.a0(-1184766420);
                    j = gm3.a(e18Var).N;
                } else {
                    e18Var.a0(-1184765394);
                    j = gm3.a(e18Var).v;
                }
                e18Var.p(false);
                dw1.a(yfd.p(b.o(fqbVar, 6.0f), ((d54) f8g.a(j, null, "page-dot", e18Var, 384, 10).getValue()).a, xve.a), e18Var, 0);
            }
            e18Var.p(false);
            e18Var.p(true);
            iqbVar = fqbVar;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new wx8(i, i2, i3, iqbVar);
        }
    }

    public static final void b(dhg dhgVar, boolean z, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        long j;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-722305510);
        int i2 = i | (e18Var2.f(dhgVar) ? 4 : 2) | (e18Var2.g(z) ? 32 : 16) | (e18Var2.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var2.f(iqbVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        if (e18Var2.Q(i2 & 1, (i2 & 9363) != 9362)) {
            if (d4c.Z(gm3.a(e18Var2).o) < 0.5f) {
                e18Var2.a0(1649117215);
                j = gm3.a(e18Var2).p;
            } else {
                e18Var2.a0(1649118175);
                j = gm3.a(e18Var2).q;
            }
            e18Var2.p(false);
            long j2 = j;
            qu1 qu1VarA = sf5.a(MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var2).t);
            long j3 = d;
            vve vveVar = a;
            e18Var = e18Var2;
            pzg.c(zy7Var2, xn5.t0(iqbVar, 2.0f, vveVar, c, j3, 4), false, vveVar, j2, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, qu1VarA, null, fd9.q0(1784158255, new wvg(z, zy7Var, dhgVar), e18Var2), e18Var, ((i2 >> 9) & 14) | 3072, 740);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bv(dhgVar, z, zy7Var, zy7Var2, iqbVar, i, 12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(java.util.List r27, java.lang.String r28, defpackage.bz7 r29, defpackage.pz7 r30, defpackage.pl3 r31, defpackage.iqb r32, defpackage.ld4 r33, int r34) {
        /*
            Method dump skipped, instruction units count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b5j.c(java.util.List, java.lang.String, bz7, pz7, pl3, iqb, ld4, int):void");
    }
}
