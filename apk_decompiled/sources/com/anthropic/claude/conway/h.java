package com.anthropic.claude.conway;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.axe;
import defpackage.bv;
import defpackage.bz7;
import defpackage.cd4;
import defpackage.cv8;
import defpackage.cxe;
import defpackage.d4c;
import defpackage.dd4;
import defpackage.do0;
import defpackage.dtj;
import defpackage.e18;
import defpackage.fd9;
import defpackage.fqb;
import defpackage.gb9;
import defpackage.gm3;
import defpackage.ho0;
import defpackage.hw9;
import defpackage.hyc;
import defpackage.iqb;
import defpackage.jd4;
import defpackage.jm3;
import defpackage.kxk;
import defpackage.ld4;
import defpackage.lja;
import defpackage.lz1;
import defpackage.mx3;
import defpackage.p64;
import defpackage.q64;
import defpackage.qe;
import defpackage.qy4;
import defpackage.r50;
import defpackage.r7e;
import defpackage.re4;
import defpackage.sz6;
import defpackage.tjd;
import defpackage.tjf;
import defpackage.tjh;
import defpackage.ud0;
import defpackage.vo1;
import defpackage.w43;
import defpackage.wo1;
import defpackage.xn5;
import defpackage.y02;
import defpackage.yfd;
import defpackage.zy7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h {
    public static final void a(int i, ld4 ld4Var, zy7 zy7Var, iqb iqbVar, String str, boolean z) {
        int i2;
        zy7 zy7Var2;
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1595524183);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            zy7Var2 = zy7Var;
            i2 |= e18Var.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            zy7Var2 = zy7Var;
        }
        int i3 = i2 | 3072;
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            wo1 wo1Var = lja.Q;
            ho0 ho0Var = new ho0(12.0f, true, new sz6(1));
            fqb fqbVar = fqb.E;
            iqb iqbVarJ = gb9.J(yfd.p(gb9.K(androidx.compose.foundation.layout.b.c(fqbVar, 1.0f), 16.0f, 8.0f), gm3.a(e18Var).q, gm3.b(e18Var).d), 12.0f);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new qy4(1);
                e18Var.k0(objN);
            }
            iqb iqbVarB = tjf.b(iqbVarJ, true, (bz7) objN);
            cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarB);
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
            fqb fqbVar2 = fqbVar;
            cv8.b(com.anthropic.claude.design.icon.a.a(ud0.I1, e18Var), null, null, gm3.a(e18Var).y, e18Var, 56, 4);
            tjh.b(str, new hw9(1.0f, true), gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 2, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, i3 & 14, 24576, 114680);
            if (z) {
                e18Var.a0(-297713095);
                String strJ0 = d4c.j0(R.string.conway_status_reconnecting, e18Var);
                long j = gm3.a(e18Var).c;
                iqb iqbVarO = androidx.compose.foundation.layout.b.o(fqbVar2, 16.0f);
                boolean zF = e18Var.f(strJ0);
                Object objN2 = e18Var.N();
                if (zF || objN2 == lz1Var) {
                    objN2 = new w43(strJ0, 27);
                    e18Var.k0(objN2);
                }
                fqbVar2 = fqbVar2;
                tjd.a(tjf.b(iqbVarO, false, (bz7) objN2), j, 2.0f, 0L, 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, 384, 56);
                e18Var = e18Var;
                e18Var.p(false);
            } else {
                e18Var.a0(-297188296);
                dtj.a(d4c.j0(R.string.conway_retry, e18Var), null, false, null, null, y02.a, 0L, zy7Var2, e18Var, ((i3 << 15) & 29360128) | 196608, 94);
                e18Var = e18Var;
                e18Var.p(false);
            }
            e18Var.p(true);
            iqbVar2 = fqbVar2;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mx3(str, z, zy7Var, iqbVar2, i, 3);
        }
    }

    public static final void b(String str, boolean z, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1297162367);
        int i2 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.g(z) ? 32 : 16) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | 24576;
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            xn5.H(androidx.compose.foundation.layout.b.c, null, false, fd9.q0(-95355691, new qe(str, z, zy7Var, zy7Var2, 3), e18Var), e18Var, 3072, 6);
            iqbVar2 = fqb.E;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bv(str, z, zy7Var, zy7Var2, iqbVar2, i, 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0367 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0634  */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v69 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.iqb r48, defpackage.us4 r49, com.anthropic.claude.conway.f r50, defpackage.dx4 r51, defpackage.zy7 r52, defpackage.zy7 r53, defpackage.ld4 r54, int r55) {
        /*
            Method dump skipped, instruction units count: 1773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.conway.h.c(iqb, us4, com.anthropic.claude.conway.f, dx4, zy7, zy7, ld4, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.ls4 r28, final boolean r29, final boolean r30, defpackage.iqb r31, defpackage.ld4 r32, final int r33) {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.conway.h.d(ls4, boolean, boolean, iqb, ld4, int):void");
    }

    public static final void e(int i, ld4 ld4Var, zy7 zy7Var, iqb iqbVar, boolean z) {
        int i2;
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1744783356);
        if ((i & 6) == 0) {
            i2 = i | (e18Var.g(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            ho0 ho0Var = new ho0(16.0f, false, new do0(0, lja.Q));
            vo1 vo1Var = lja.T;
            iqb iqbVarJ = gb9.J(androidx.compose.foundation.layout.b.c, 24.0f);
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new qy4(0);
                e18Var.k0(objN);
            }
            iqb iqbVarB = tjf.b(iqbVarJ, true, (bz7) objN);
            q64 q64VarA = p64.a(ho0Var, vo1Var, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarB);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            tjd.a(null, gm3.a(e18Var).c, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, 0, 61);
            tjh.b(d4c.j0(z ? R.string.conway_waking_slow : R.string.conway_waking_title, e18Var), null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 0, 131066);
            e18Var = e18Var;
            if (z) {
                e18Var.a0(346296985);
                dtj.a(d4c.j0(R.string.conway_retry, e18Var), null, false, null, null, y02.a, 0L, zy7Var, e18Var, ((i3 << 18) & 29360128) | 196608, 94);
                e18Var = e18Var;
                e18Var.p(false);
            } else {
                e18Var.a0(346472848);
                e18Var.p(false);
            }
            e18Var.p(true);
            iqbVar2 = fqb.E;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new r50(i, 2, zy7Var, iqbVar2, z);
        }
    }
}
