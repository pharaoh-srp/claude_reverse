package com.anthropic.claude.bell;

import android.app.NotificationManager;
import android.content.Context;
import android.view.View;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.model.ModelOption;
import com.anthropic.claude.bell.BellOverlayDestination;
import com.anthropic.claude.bell.b;
import com.anthropic.claude.models.organization.configtypes.SttSupportedLanguage;
import com.anthropic.claude.tool.model.MobileAppToolPreviewInfo;
import com.anthropic.claude.types.strings.ModelId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.a2g;
import defpackage.a6i;
import defpackage.a80;
import defpackage.axe;
import defpackage.b5j;
import defpackage.bo;
import defpackage.bsg;
import defpackage.bx;
import defpackage.bz7;
import defpackage.cd4;
import defpackage.ci;
import defpackage.cl1;
import defpackage.cxe;
import defpackage.cz5;
import defpackage.d4c;
import defpackage.d7;
import defpackage.dd4;
import defpackage.dl1;
import defpackage.ds0;
import defpackage.dw1;
import defpackage.e18;
import defpackage.el;
import defpackage.eo0;
import defpackage.ew0;
import defpackage.ez1;
import defpackage.fd9;
import defpackage.fm1;
import defpackage.fn;
import defpackage.fn1;
import defpackage.fp;
import defpackage.fq3;
import defpackage.fqb;
import defpackage.fv;
import defpackage.fxe;
import defpackage.gb9;
import defpackage.gid;
import defpackage.gj1;
import defpackage.gm3;
import defpackage.gp6;
import defpackage.hl;
import defpackage.hsc;
import defpackage.hyc;
import defpackage.ij0;
import defpackage.ij1;
import defpackage.ik1;
import defpackage.ikk;
import defpackage.il1;
import defpackage.iqb;
import defpackage.iuj;
import defpackage.jce;
import defpackage.jd4;
import defpackage.jm3;
import defpackage.jm9;
import defpackage.jwk;
import defpackage.k4g;
import defpackage.k5j;
import defpackage.kn;
import defpackage.ko0;
import defpackage.ku;
import defpackage.kw;
import defpackage.kxk;
import defpackage.l0;
import defpackage.lag;
import defpackage.ld4;
import defpackage.lja;
import defpackage.lm6;
import defpackage.lz1;
import defpackage.m1j;
import defpackage.m5j;
import defpackage.m7f;
import defpackage.mj1;
import defpackage.mp0;
import defpackage.mpk;
import defpackage.mwa;
import defpackage.nrk;
import defpackage.nt;
import defpackage.nw1;
import defpackage.nwb;
import defpackage.o5b;
import defpackage.ok1;
import defpackage.p6;
import defpackage.p64;
import defpackage.pk1;
import defpackage.pl1;
import defpackage.pl3;
import defpackage.pz7;
import defpackage.pzg;
import defpackage.q64;
import defpackage.qk1;
import defpackage.qq;
import defpackage.qvj;
import defpackage.r4g;
import defpackage.r7e;
import defpackage.re4;
import defpackage.rk1;
import defpackage.rwe;
import defpackage.rz7;
import defpackage.s51;
import defpackage.s64;
import defpackage.sk1;
import defpackage.sq;
import defpackage.sq6;
import defpackage.ta4;
import defpackage.tjh;
import defpackage.tk1;
import defpackage.tkh;
import defpackage.tn1;
import defpackage.tp4;
import defpackage.trk;
import defpackage.u4g;
import defpackage.uk1;
import defpackage.um1;
import defpackage.uo;
import defpackage.ve4;
import defpackage.vkc;
import defpackage.vo1;
import defpackage.w00;
import defpackage.wd6;
import defpackage.wh;
import defpackage.wk1;
import defpackage.x89;
import defpackage.xe;
import defpackage.xn5;
import defpackage.xo1;
import defpackage.yb;
import defpackage.ye;
import defpackage.yfd;
import defpackage.yk1;
import defpackage.z80;
import defpackage.zh4;
import defpackage.zk1;
import defpackage.zni;
import defpackage.zy7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static final Set a = mp0.Z0(new fm1[]{fm1.I, fm1.J});

    public static final void a(gj1 gj1Var, um1 um1Var, ld4 ld4Var, int i) {
        int i2;
        gj1 gj1Var2 = gj1Var;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1346497407);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? e18Var.f(gj1Var2) : e18Var.h(gj1Var2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var.f(um1Var) : e18Var.h(um1Var) ? 32 : 16;
        }
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            n("Adaptive Gain", null, e18Var, 6);
            fqb fqbVar = fqb.E;
            kxk.g(e18Var, androidx.compose.foundation.layout.b.e(fqbVar, 4.0f));
            tjh.b("Overrides project_bell_android_adaptive_gain. Applied live on the next mic buffer.", gb9.L(fqbVar, 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 54, 0, 131064);
            e18Var = e18Var;
            kxk.g(e18Var, androidx.compose.foundation.layout.b.e(fqbVar, 8.0f));
            gj1Var2 = gj1Var;
            pzg.a(gb9.L(androidx.compose.foundation.layout.b.c(fqbVar, 1.0f), 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), gm3.b(e18Var).f, gm3.a(e18Var).o, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, fd9.q0(-2008937188, new kn(gj1Var, 12, um1Var), e18Var), e18Var, 12582918, 120);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new qq(gj1Var2, um1Var, i, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0858  */
    /* JADX WARN: Removed duplicated region for block: B:355:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0118  */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v40 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.lang.String r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, boolean r51, defpackage.pz7 r52, defpackage.iqb r53, boolean r54, defpackage.o1j r55, defpackage.a6i r56, defpackage.mj1 r57, defpackage.ld4 r58, int r59, int r60) {
        /*
            Method dump skipped, instruction units count: 2168
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.bell.b.b(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, pz7, iqb, boolean, o1j, a6i, mj1, ld4, int, int):void");
    }

    public static final void c(s51 s51Var, List list, bz7 bz7Var, boolean z, boolean z2, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        boolean z3;
        boolean z4;
        bz7Var.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(357512268);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(s51Var) : e18Var.h(s51Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | ((i & 64) == 0 ? e18Var.f(list) : e18Var.h(list) ? 32 : 16);
        if ((i & 384) == 0) {
            i3 |= e18Var.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i3 |= e18Var.g(z) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i4 = i3 | (e18Var.f(iqbVar) ? FreeTypeConstants.FT_LOAD_COLOR : 524288);
        boolean z5 = true;
        if (e18Var.Q(i4 & 1, (599187 & i4) != 599186)) {
            cxe cxeVarA = axe.a(ko0.b, lja.Q, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVar);
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
            if (z) {
                e18Var.a0(-538128525);
                if (list.size() > 1) {
                    z4 = true;
                } else {
                    z4 = true;
                    z5 = false;
                }
                z3 = false;
                wd6.K(fxe.a, z5, null, gp6.g(null, MTTypesetterKt.kLineSkipLimitMultiplier, 7).a(gp6.e(null, 3)), gp6.h(null, MTTypesetterKt.kLineSkipLimitMultiplier, 7).a(gp6.f(null, 3)), null, fd9.q0(-1187027165, new ye((Object) s51Var, list, bz7Var, 9), e18Var), e18Var, 1600518, 18);
                e18Var = e18Var;
                e18Var.p(false);
            } else {
                z3 = false;
                z4 = true;
                e18Var.a0(-537729710);
                e18Var.p(false);
            }
            if (z2) {
                e18Var.a0(-537692541);
                ez1.e(zy7Var, null, false, null, null, qvj.i, e18Var, 1572870, 62);
                e18Var.p(z3);
            } else {
                e18Var.a0(-537370606);
                e18Var.p(z3);
            }
            e18Var.p(z4);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new wk1(s51Var, list, bz7Var, z, z2, zy7Var, iqbVar, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(fn1 fn1Var, mj1 mj1Var, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, pl3 pl3Var, bz7 bz7Var, iqb iqbVar, boolean z, a6i a6iVar, ld4 ld4Var, int i) {
        int i2;
        mj1 mj1Var2 = mj1Var;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(2061906425);
        int i3 = i | (e18Var.f(fn1Var) ? 4 : 2) | (e18Var.f(mj1Var2) ? 32 : 16) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(zy7Var3) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.f(pl3Var) ? 131072 : 65536) | (e18Var.f(iqbVar) ? 8388608 : 4194304) | (e18Var.g(z) ? 67108864 : 33554432) | (e18Var.f(a6iVar) ? 536870912 : 268435456);
        if (e18Var.Q(i3 & 1, (306783379 & i3) != 306783378)) {
            cz5 cz5Var = (cz5) e18Var.j(ve4.h);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, o5bVarD);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            s51 s51Var = fn1Var != null ? (s51) ((tn1) fn1Var).r.v.getValue() : null;
            List list = fn1Var != null ? (List) ((tn1) fn1Var).r.x.getValue() : null;
            if (list == null) {
                list = lm6.E;
            }
            List list2 = list;
            boolean z2 = (i3 & 14) == 4;
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (z2 || objN == lz1Var) {
                i2 = 0;
                objN = new sk1(fn1Var, i2);
                e18Var.k0(objN);
            } else {
                i2 = 0;
            }
            bz7 bz7Var2 = (bz7) objN;
            s51 s51Var2 = s51Var;
            boolean z3 = fn1Var != null ? 1 : i2;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new ew0(29);
                e18Var.k0(objN2);
            }
            zy7 zy7Var4 = (zy7) objN2;
            xo1 xo1Var = lja.H;
            nw1 nw1Var = nw1.a;
            fqb fqbVar = fqb.E;
            c(s51Var2, list2, bz7Var2, z3, false, zy7Var4, gb9.J(androidx.compose.foundation.layout.b.c(nw1Var.a(fqbVar, xo1Var), 1.0f), 8.0f), e18Var, 221192);
            iqb iqbVarN = gb9.N(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, z ? 8.0f : 20.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13);
            vo1 vo1Var = lja.S;
            eo0 eo0Var = ko0.c;
            q64 q64VarA = p64.a(eo0Var, vo1Var, e18Var, 0);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarN);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, q64VarA);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            s64 s64Var = s64.a;
            kxk.g(e18Var, s64Var.b(fqbVar, 1.0f, true));
            iqb iqbVarC = androidx.compose.foundation.layout.b.c(fqbVar, 1.0f);
            boolean zF = e18Var.f(cz5Var);
            Object objN3 = e18Var.N();
            if (zF || objN3 == lz1Var) {
                objN3 = new l0(bz7Var, 19, cz5Var);
                e18Var.k0(objN3);
            }
            iqb iqbVarN2 = gb9.N(wd6.v0(iqbVarC, (bz7) objN3), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, z ? 16.0f : 40.0f, 7);
            q64 q64VarA2 = p64.a(eo0Var, vo1Var, e18Var, 0);
            int iHashCode3 = Long.hashCode(e18Var.T);
            hyc hycVarL3 = e18Var.l();
            iqb iqbVarE3 = kxk.E(e18Var, iqbVarN2);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, q64VarA2);
            d4c.i0(e18Var, z80Var2, hycVarL3);
            ij0.t(iHashCode3, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE3);
            String str = fn1Var != null ? (String) ((tn1) fn1Var).x.i.getValue() : null;
            Object objN4 = e18Var.N();
            if (objN4 == lz1Var) {
                objN4 = mpk.P("");
                e18Var.k0(objN4);
            }
            nwb nwbVar = (nwb) objN4;
            if (str != null && !bsg.I0(str)) {
                nwbVar.setValue(str);
            }
            int i4 = 1;
            wd6.H(s64Var, !(str == null || bsg.I0(str)), null, gp6.e(null, 3), gp6.f(null, 3), null, fd9.q0(2133412207, new dl1(0, nwbVar), e18Var), e18Var, 1600518, 18);
            int i5 = i3 & 112;
            int i6 = i3 << 3;
            int i7 = i3 >> 3;
            int i8 = (i3 & 126) | ((i3 >> 9) & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | (29360128 & i7) | (234881024 & i7);
            boolean z4 = false;
            mj1Var2 = mj1Var;
            e18Var = e18Var;
            jwk.l(fn1Var, mj1Var2, pl3Var, zy7Var, zy7Var2, zy7Var3, null, z, a6iVar, e18Var, i8);
            e18Var.p(true);
            e18Var.p(true);
            if (i5 == 32) {
                z4 = true;
            }
            Object objN5 = e18Var.N();
            if (z4 || objN5 == lz1Var) {
                objN5 = new ij1(mj1Var2, i4);
                e18Var.k0(objN5);
            }
            mwa.d(mj1Var2, null, (bz7) objN5, e18Var, i7 & 14);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new il1(fn1Var, mj1Var2, zy7Var, zy7Var2, zy7Var3, pl3Var, bz7Var, iqbVar, z, a6iVar, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(String str, String str2, float f, fq3 fq3Var, String str3, bz7 bz7Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        int i3;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1570403064);
        if ((i & 384) == 0) {
            i2 = (e18Var2.c(f) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | (e18Var2.f(fq3Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if ((196608 & i) == 0) {
            i4 |= e18Var2.h(bz7Var) ? 131072 : 65536;
        }
        if (e18Var2.Q(i4 & 1, (74899 & i4) != 74898)) {
            Object[] objArr = (i4 & 896) == 256;
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (objArr != false || objN == lz1Var) {
                objN = new hsc(f);
                e18Var2.k0(objN);
            }
            hsc hscVar = (hsc) objN;
            iqb iqbVarC = androidx.compose.foundation.layout.b.c(fqb.E, 1.0f);
            cxe cxeVarA = axe.a(ko0.g, lja.P, e18Var2, 6);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarC);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, cxeVarA);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            tjh.b(str, null, gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, 6, 0, 131066);
            tjh.b(String.format(Locale.US, str3, Arrays.copyOf(new Object[]{Float.valueOf(hscVar.h())}, 1)), null, gm3.a(e18Var2).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, 0, 0, 131066);
            e18Var2.p(true);
            tjh.b(str2, null, gm3.a(e18Var2).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).k, e18Var2, 6, 0, 131066);
            float fH = hscVar.h();
            boolean zF = e18Var2.f(hscVar);
            Object objN2 = e18Var2.N();
            if (zF || objN2 == lz1Var) {
                i3 = 0;
                objN2 = new rk1(hscVar, i3);
                e18Var2.k0(objN2);
            } else {
                i3 = 0;
            }
            bz7 bz7Var2 = (bz7) objN2;
            int i5 = (e18Var2.f(hscVar) ? 1 : 0) | ((458752 & i4) == 131072 ? 1 : i3);
            Object objN3 = e18Var2.N();
            if (i5 != 0 || objN3 == lz1Var) {
                objN3 = new ik1(bz7Var, 2, hscVar);
                e18Var2.k0(objN3);
            }
            e18Var = e18Var2;
            lag.a(fH, bz7Var2, null, false, fq3Var, (zy7) objN3, null, null, e18Var, (i4 << 3) & 57344);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new tk1(str, str2, f, fq3Var, str3, bz7Var, i);
        }
    }

    public static final void f(s64 s64Var, fn1 fn1Var, ld4 ld4Var, int i) {
        int i2;
        r7e r7eVarS;
        uk1 uk1Var;
        s64Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(906605106);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(s64Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(fn1Var) ? 32 : 16;
        }
        int i3 = i2;
        int i4 = 0;
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
            boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                objN = m7fVarN.a(jce.a.b(x89.class), null, null);
                e18Var.k0(objN);
            }
            e18Var.p(false);
            e18Var.p(false);
            if (!((x89) objN).a()) {
                r7eVarS = e18Var.s();
                if (r7eVarS != null) {
                    uk1Var = new uk1(s64Var, fn1Var, i, i4);
                    r7eVarS.d = uk1Var;
                }
                return;
            }
            m7f m7fVarN2 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
            boolean zF2 = e18Var.f(null) | e18Var.f(m7fVarN2);
            Object objN2 = e18Var.N();
            if (zF2 || objN2 == lz1Var) {
                objN2 = m7fVarN2.a(jce.a.b(gj1.class), null, null);
                e18Var.k0(objN2);
            }
            e18Var.p(false);
            e18Var.p(false);
            gj1 gj1Var = (gj1) objN2;
            m7f m7fVarN3 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
            boolean zF3 = e18Var.f(null) | e18Var.f(m7fVarN3);
            Object objN3 = e18Var.N();
            if (zF3 || objN3 == lz1Var) {
                objN3 = m7fVarN3.a(jce.a.b(um1.class), null, null);
                e18Var.k0(objN3);
            }
            e18Var.p(false);
            e18Var.p(false);
            m5j m5jVar = m5j.a;
            fqb fqbVar = fqb.E;
            kxk.g(e18Var, androidx.compose.foundation.layout.b.e(fqbVar, 16.0f));
            iuj.e(gb9.L(fqbVar, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).v, e18Var, 0, 2);
            n(gid.p(16.0f, R.string.settings_title_developer, e18Var, e18Var, fqbVar), null, e18Var, 0);
            kxk.g(e18Var, androidx.compose.foundation.layout.b.e(fqbVar, 8.0f));
            a(gj1Var, (um1) objN3, e18Var, gj1.y | 64);
            k(s64Var, fn1Var, e18Var, i3 & 126);
        } else {
            e18Var.T();
        }
        r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            uk1Var = new uk1(s64Var, fn1Var, i, 1);
            r7eVarS.d = uk1Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(defpackage.s64 r16, defpackage.fn1 r17, defpackage.pl3 r18, defpackage.rz7 r19, defpackage.ld4 r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.bell.b.g(s64, fn1, pl3, rz7, ld4, int, int):void");
    }

    public static final void h(zy7 zy7Var, ld4 ld4Var, int i) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-762689795);
        int i2 = i | (e18Var2.h(zy7Var) ? 4 : 2);
        if (e18Var2.Q(i2 & 1, (i2 & 3) != 2)) {
            e18Var = e18Var2;
            trk.b(zy7Var, fd9.q0(2147229050, new fp(10, ((View) e18Var2.j(w00.f)).getContext()), e18Var2), null, fd9.q0(96820152, new wh(5, zy7Var), e18Var2), qvj.g, qvj.h, null, gm3.a(e18Var2).o, 0L, gm3.a(e18Var2).M, gm3.a(e18Var2).N, null, e18Var, (i2 & 14) | 1772592, 0, 12948);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new wh(i, 6, zy7Var);
        }
    }

    public static final void i(final s64 s64Var, final mj1 mj1Var, final fn1 fn1Var, final pl3 pl3Var, ld4 ld4Var, final int i) {
        int i2;
        e18 e18Var;
        r7e r7eVarS;
        pz7 pz7Var;
        Object next;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-664894346);
        if ((i & 48) == 0) {
            i2 = (e18Var2.f(mj1Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.f(fn1Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0 ? e18Var2.f(pl3Var) : e18Var2.h(pl3Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var2.Q(i2 & 1, (i2 & 1169) != 1168)) {
            View view = (View) e18Var2.j(w00.f);
            if (((Boolean) mj1Var.u.getValue()).booleanValue()) {
                r7eVarS = e18Var2.s();
                if (r7eVarS == null) {
                    return;
                }
                final int i3 = 0;
                pz7Var = new pz7() { // from class: bl1
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj, Object obj2) {
                        int i4 = i3;
                        iei ieiVar = iei.a;
                        int i5 = i;
                        switch (i4) {
                            case 0:
                                ((Integer) obj2).intValue();
                                int iP0 = x44.p0(i5 | 1);
                                b.i(s64Var, mj1Var, fn1Var, pl3Var, (ld4) obj, iP0);
                                break;
                            case 1:
                                ((Integer) obj2).intValue();
                                int iP02 = x44.p0(i5 | 1);
                                b.i(s64Var, mj1Var, fn1Var, pl3Var, (ld4) obj, iP02);
                                break;
                            case 2:
                                ((Integer) obj2).intValue();
                                int iP03 = x44.p0(i5 | 1);
                                b.i(s64Var, mj1Var, fn1Var, pl3Var, (ld4) obj, iP03);
                                break;
                            default:
                                ((Integer) obj2).intValue();
                                int iP04 = x44.p0(i5 | 1);
                                b.i(s64Var, mj1Var, fn1Var, pl3Var, (ld4) obj, iP04);
                                break;
                        }
                        return ieiVar;
                    }
                };
            } else if (((Boolean) mj1Var.m.u.getValue()).booleanValue() && fn1Var != null && ((tn1) fn1Var).e0) {
                List list = (List) mj1Var.g.a().k.getValue();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    String strM356getModeli4oh0I = ((ModelOption) next).m356getModeli4oh0I();
                    String strS = mj1Var.S();
                    if (strS == null ? false : ModelId.m1061equalsimpl0(strM356getModeli4oh0I, strS)) {
                        break;
                    }
                }
                ModelOption modelOption = (ModelOption) next;
                if (modelOption == null) {
                    r7eVarS = e18Var2.s();
                    if (r7eVarS == null) {
                        return;
                    }
                    final int i4 = 2;
                    pz7Var = new pz7() { // from class: bl1
                        @Override // defpackage.pz7
                        public final Object invoke(Object obj, Object obj2) {
                            int i42 = i4;
                            iei ieiVar = iei.a;
                            int i5 = i;
                            switch (i42) {
                                case 0:
                                    ((Integer) obj2).intValue();
                                    int iP0 = x44.p0(i5 | 1);
                                    b.i(s64Var, mj1Var, fn1Var, pl3Var, (ld4) obj, iP0);
                                    break;
                                case 1:
                                    ((Integer) obj2).intValue();
                                    int iP02 = x44.p0(i5 | 1);
                                    b.i(s64Var, mj1Var, fn1Var, pl3Var, (ld4) obj, iP02);
                                    break;
                                case 2:
                                    ((Integer) obj2).intValue();
                                    int iP03 = x44.p0(i5 | 1);
                                    b.i(s64Var, mj1Var, fn1Var, pl3Var, (ld4) obj, iP03);
                                    break;
                                default:
                                    ((Integer) obj2).intValue();
                                    int iP04 = x44.p0(i5 | 1);
                                    b.i(s64Var, mj1Var, fn1Var, pl3Var, (ld4) obj, iP04);
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                } else {
                    m5j m5jVar = m5j.a;
                    kxk.g(e18Var2, androidx.compose.foundation.layout.b.e(fqb.E, 16.0f));
                    e18Var = e18Var2;
                    m5jVar.a(null, fd9.q0(155034184, new xe((Object) modelOption, list, (Object) pl3Var, (Object) view, (Object) mj1Var, 6), e18Var2), e18Var, 432, 1);
                }
            } else {
                r7eVarS = e18Var2.s();
                if (r7eVarS == null) {
                    return;
                }
                final int i5 = 1;
                pz7Var = new pz7() { // from class: bl1
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj, Object obj2) {
                        int i42 = i5;
                        iei ieiVar = iei.a;
                        int i52 = i;
                        switch (i42) {
                            case 0:
                                ((Integer) obj2).intValue();
                                int iP0 = x44.p0(i52 | 1);
                                b.i(s64Var, mj1Var, fn1Var, pl3Var, (ld4) obj, iP0);
                                break;
                            case 1:
                                ((Integer) obj2).intValue();
                                int iP02 = x44.p0(i52 | 1);
                                b.i(s64Var, mj1Var, fn1Var, pl3Var, (ld4) obj, iP02);
                                break;
                            case 2:
                                ((Integer) obj2).intValue();
                                int iP03 = x44.p0(i52 | 1);
                                b.i(s64Var, mj1Var, fn1Var, pl3Var, (ld4) obj, iP03);
                                break;
                            default:
                                ((Integer) obj2).intValue();
                                int iP04 = x44.p0(i52 | 1);
                                b.i(s64Var, mj1Var, fn1Var, pl3Var, (ld4) obj, iP04);
                                break;
                        }
                        return ieiVar;
                    }
                };
            }
            r7eVarS.d = pz7Var;
        }
        e18Var = e18Var2;
        e18Var.T();
        r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final int i6 = 3;
            pz7Var = new pz7() { // from class: bl1
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = i6;
                    iei ieiVar = iei.a;
                    int i52 = i;
                    switch (i42) {
                        case 0:
                            ((Integer) obj2).intValue();
                            int iP0 = x44.p0(i52 | 1);
                            b.i(s64Var, mj1Var, fn1Var, pl3Var, (ld4) obj, iP0);
                            break;
                        case 1:
                            ((Integer) obj2).intValue();
                            int iP02 = x44.p0(i52 | 1);
                            b.i(s64Var, mj1Var, fn1Var, pl3Var, (ld4) obj, iP02);
                            break;
                        case 2:
                            ((Integer) obj2).intValue();
                            int iP03 = x44.p0(i52 | 1);
                            b.i(s64Var, mj1Var, fn1Var, pl3Var, (ld4) obj, iP03);
                            break;
                        default:
                            ((Integer) obj2).intValue();
                            int iP04 = x44.p0(i52 | 1);
                            b.i(s64Var, mj1Var, fn1Var, pl3Var, (ld4) obj, iP04);
                            break;
                    }
                    return ieiVar;
                }
            };
            r7eVarS.d = pz7Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void j(k5j k5jVar, pl3 pl3Var, final m1j m1jVar, iqb iqbVar, rz7 rz7Var, rz7 rz7Var2, ld4 ld4Var, int i) {
        int i2;
        final pl3 pl3Var2;
        final m1j m1jVar2;
        k5j k5jVar2;
        Object obj;
        e18 e18Var;
        z80 z80Var;
        bx bxVar;
        ArrayList arrayList;
        eo0 eo0Var;
        z80 z80Var2;
        int i3;
        zy7 zy7Var;
        Object obj2;
        vo1 vo1Var;
        z80 z80Var3;
        int i4;
        Object obj3;
        final View view;
        fqb fqbVar;
        final ?? r8;
        int i5;
        int i6;
        Object obj4;
        boolean z;
        Object obj5;
        Object obj6 = rz7Var2;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1570642107);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(k5jVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var2.f(pl3Var) : e18Var2.h(pl3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.f(m1jVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.f(iqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.h(rz7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((i & 196608) == 0) {
            i2 |= e18Var2.h(obj6) ? 131072 : 65536;
        }
        int i7 = i2;
        if (e18Var2.Q(i7 & 1, (i7 & 74899) != 74898)) {
            View view2 = (View) e18Var2.j(w00.f);
            vo1 vo1Var2 = lja.S;
            int i8 = i7 >> 9;
            eo0 eo0Var2 = ko0.c;
            q64 q64VarA = p64.a(eo0Var2, vo1Var2, e18Var2, 48);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVar);
            dd4.e.getClass();
            zy7 zy7Var2 = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(zy7Var2);
            } else {
                e18Var2.n0();
            }
            z80 z80Var4 = cd4.f;
            d4c.i0(e18Var2, z80Var4, q64VarA);
            z80 z80Var5 = cd4.e;
            d4c.i0(e18Var2, z80Var5, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var6 = cd4.g;
            d4c.i0(e18Var2, z80Var6, numValueOf);
            bx bxVar2 = cd4.h;
            d4c.h0(e18Var2, bxVar2);
            z80 z80Var7 = cd4.d;
            d4c.i0(e18Var2, z80Var7, iqbVarE);
            ArrayList arrayListF = k5jVar.F();
            String strA = k5jVar.a();
            int i9 = i7 & 14;
            boolean z2 = i9 == 4;
            Object objN = e18Var2.N();
            Object obj7 = jd4.a;
            if (z2 || objN == obj7) {
                z80Var = z80Var6;
                bxVar = bxVar2;
                arrayList = arrayListF;
                eo0Var = eo0Var2;
                z80Var2 = z80Var4;
                i3 = i9;
                zy7Var = zy7Var2;
                obj2 = obj7;
                vo1Var = vo1Var2;
                z80Var3 = z80Var5;
                i4 = 4;
                Object ybVar = new yb(1, k5jVar, k5j.class, "onVoiceSelected", "onVoiceSelected-XBV5zSM(Ljava/lang/String;)V", 0, 14);
                e18Var2.k0(ybVar);
                obj3 = ybVar;
            } else {
                obj2 = obj7;
                vo1Var = vo1Var2;
                z80Var3 = z80Var5;
                bxVar = bxVar2;
                z80Var = z80Var6;
                zy7Var = zy7Var2;
                arrayList = arrayListF;
                eo0Var = eo0Var2;
                z80Var2 = z80Var4;
                i3 = i9;
                i4 = 4;
                obj3 = objN;
            }
            bz7 bz7Var = (bz7) ((jm9) obj3);
            boolean z3 = i3 == i4;
            Object objN2 = e18Var2.N();
            Object obj8 = objN2;
            if (z3 || objN2 == obj2) {
                Object boVar = new bo(2, k5jVar, k5j.class, "playVoicePreview", "playVoicePreview(Lcom/anthropic/claude/bell/api/SpeechInputVoice;F)V", 0, 2);
                e18Var2.k0(boVar);
                obj8 = boVar;
            }
            pz7 pz7Var = (pz7) ((jm9) obj8);
            fqb fqbVar2 = fqb.E;
            b5j.c(arrayList, strA, bz7Var, pz7Var, pl3Var, gb9.N(androidx.compose.foundation.layout.b.c(fqbVar2, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 7), e18Var2, (57344 & (i7 << 9)) | 196608);
            e18 e18Var3 = e18Var2;
            pl3Var2 = pl3Var;
            List listX = k5jVar.x();
            int i10 = 10;
            tp4 tp4Var = null;
            if (listX.isEmpty()) {
                k5jVar2 = k5jVar;
                view = view2;
                fqbVar = fqbVar2;
                r8 = 0;
                i5 = 2;
                e18Var3.a0(-1386087097);
                e18Var3.p(false);
            } else {
                e18Var3.a0(-1387504572);
                long j = gm3.a(e18Var3).k;
                boolean zC = k5jVar.C();
                boolean z4 = i3 == i4;
                Object objN3 = e18Var3.N();
                Object obj9 = objN3;
                if (z4 || objN3 == obj2) {
                    Object d7Var = new d7(i10, k5jVar);
                    e18Var3.k0(d7Var);
                    obj9 = d7Var;
                }
                zy7 zy7Var3 = (zy7) obj9;
                Object objN4 = e18Var3.N();
                Object obj10 = objN4;
                if (objN4 == obj2) {
                    Object objA = zh4.a(MTTypesetterKt.kLineSkipLimitMultiplier);
                    e18Var3.k0(objA);
                    obj10 = objA;
                }
                a80 a80Var = (a80) obj10;
                Boolean boolValueOf = Boolean.valueOf(zC);
                boolean zG = e18Var3.g(zC) | e18Var3.h(a80Var) | e18Var3.f(zy7Var3);
                Object objN5 = e18Var3.N();
                if (zG || objN5 == obj2) {
                    objN5 = new ku(zC, a80Var, zy7Var3, tp4Var, 2);
                    e18Var3.k0(objN5);
                }
                fd9.i(e18Var3, (pz7) objN5, boolValueOf);
                boolean zH = e18Var3.h(a80Var);
                Object objN6 = e18Var3.N();
                Object obj11 = objN6;
                if (zH || objN6 == obj2) {
                    Object d7Var2 = new d7(11, a80Var);
                    e18Var3.k0(d7Var2);
                    obj11 = d7Var2;
                }
                zy7 zy7Var4 = (zy7) obj11;
                iqb iqbVarC = androidx.compose.foundation.layout.b.c(fqbVar2, 1.0f);
                m5j m5jVar = m5j.a;
                i5 = 2;
                int i11 = i3;
                iqb iqbVarP = yfd.p(xn5.V(gb9.L(iqbVarC, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), gm3.b(e18Var3).f), gm3.a(e18Var3).o, zni.b);
                boolean zE = e18Var3.e(j) | e18Var3.f(zy7Var4);
                Object objN7 = e18Var3.N();
                if (zE || objN7 == obj2) {
                    z = false;
                    Object yk1Var = new yk1(j, (Object) zy7Var4, (int) (false ? 1 : 0));
                    e18Var3.k0(yk1Var);
                    obj5 = yk1Var;
                } else {
                    z = false;
                    obj5 = objN7;
                }
                iqb iqbVarS = zni.s(iqbVarP, (bz7) obj5);
                q64 q64VarA2 = p64.a(eo0Var, vo1Var, e18Var3, z ? 1 : 0);
                int iHashCode2 = Long.hashCode(e18Var3.T);
                hyc hycVarL2 = e18Var3.l();
                iqb iqbVarE2 = kxk.E(e18Var3, iqbVarS);
                e18Var3.e0();
                if (e18Var3.S) {
                    e18Var3.k(zy7Var);
                } else {
                    e18Var3.n0();
                }
                d4c.i0(e18Var3, z80Var2, q64VarA2);
                d4c.i0(e18Var3, z80Var3, hycVarL2);
                ij0.t(iHashCode2, e18Var3, z80Var, e18Var3, bxVar);
                d4c.i0(e18Var3, z80Var7, iqbVarE2);
                String strJ0 = d4c.j0(R.string.settings_title_language, e18Var3);
                SttSupportedLanguage sttSupportedLanguageW = k5jVar.w();
                p6 p6Var = new p6(5);
                view = view2;
                boolean z5 = ((e18Var3.h(view) ? 1 : 0) | (((i7 & 112) == 32 || ((i7 & 64) != 0 && e18Var3.h(pl3Var2))) ? true : z ? 1 : 0) ? 1 : 0) | (i11 == 4 ? true : z ? 1 : 0);
                Object objN8 = e18Var3.N();
                Object obj12 = objN8;
                if (z5 != 0 || objN8 == obj2) {
                    Object zk1Var = new zk1(pl3Var2, view, k5jVar, z ? 1 : 0);
                    e18Var3.k0(zk1Var);
                    obj12 = zk1Var;
                }
                k5jVar2 = k5jVar;
                ikk.i(strJ0, sttSupportedLanguageW, listX, p6Var, (bz7) obj12, null, qvj.m, e18Var3, 1572864, 32);
                e18Var3.p(true);
                fqbVar = fqbVar2;
                kxk.g(e18Var3, androidx.compose.foundation.layout.b.e(fqbVar, 16.0f));
                e18Var3.p(z);
                r8 = z;
            }
            m5j m5jVar2 = m5j.a;
            m5jVar2.a(null, fd9.q0(-428046551, new ye(k5jVar2, pl3Var2, view, 10), e18Var3), e18Var3, 432, 1);
            Object objValueOf = Integer.valueOf((i8 & 112) | 6);
            s64 s64Var = s64.a;
            rz7Var.invoke(s64Var, e18Var3, objValueOf);
            if (((Boolean) m1jVar.g.getValue()).booleanValue()) {
                sq6.A(16.0f, -1385447691, e18Var3, e18Var3, fqbVar);
                n(d4c.j0(R.string.settings_title_help_improve_claude, e18Var3), null, e18Var3, r8);
                kxk.g(e18Var3, androidx.compose.foundation.layout.b.e(fqbVar, 8.0f));
                i6 = 6;
                m1jVar2 = m1jVar;
                m5jVar2.a(null, fd9.q0(1305153531, new rz7() { // from class: al1
                    @Override // defpackage.rz7
                    public final Object invoke(Object obj13, Object obj14, Object obj15) {
                        int i12 = r8;
                        iei ieiVar = iei.a;
                        lz1 lz1Var = jd4.a;
                        switch (i12) {
                            case 0:
                                ld4 ld4Var2 = (ld4) obj14;
                                int iIntValue = ((Integer) obj15).intValue();
                                ((s64) obj13).getClass();
                                e18 e18Var4 = (e18) ld4Var2;
                                if (!e18Var4.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    e18Var4.T();
                                } else {
                                    String strJ02 = d4c.j0(R.string.settings_voice_consent_toggle_title, e18Var4);
                                    String strJ03 = d4c.j0(R.string.settings_voice_consent_toggle_description, e18Var4);
                                    m1j m1jVar3 = m1jVar;
                                    boolean zA = m1jVar3.a();
                                    pl3 pl3Var3 = pl3Var2;
                                    boolean zH2 = e18Var4.h(pl3Var3);
                                    View view3 = view;
                                    boolean zH3 = zH2 | e18Var4.h(view3) | e18Var4.f(m1jVar3);
                                    Object objN9 = e18Var4.N();
                                    if (zH3 || objN9 == lz1Var) {
                                        objN9 = new gl1(0, pl3Var3, m1jVar3, view3);
                                        e18Var4.k0(objN9);
                                    }
                                    ikk.j(strJ02, strJ03, zA, (bz7) objN9, null, false, e18Var4, 0);
                                }
                                break;
                            default:
                                ld4 ld4Var3 = (ld4) obj14;
                                int iIntValue2 = ((Integer) obj15).intValue();
                                ((ia0) obj13).getClass();
                                e18 e18Var5 = (e18) ld4Var3;
                                if (!e18Var5.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    e18Var5.T();
                                } else {
                                    Object objN10 = e18Var5.N();
                                    m1j m1jVar4 = m1jVar;
                                    if (objN10 == lz1Var) {
                                        objN10 = mpk.P((uwc) m1jVar4.f.getValue());
                                        e18Var5.k0(objN10);
                                    }
                                    nwb nwbVar = (nwb) objN10;
                                    if (m1jVar4.a()) {
                                        nwbVar.setValue((uwc) m1jVar4.f.getValue());
                                    }
                                    m5j.a.a(gb9.N(fqb.E, MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), fd9.q0(1438552019, new bn(5, nwbVar, pl3Var2, view, m1jVar4), e18Var5), e18Var5, 432, 0);
                                }
                                break;
                        }
                        return ieiVar;
                    }
                }, e18Var3), e18Var3, 432, 1);
                final int i12 = 1;
                wd6.H(s64Var, m1jVar2.a(), null, null, null, null, fd9.q0(-784927387, new rz7() { // from class: al1
                    @Override // defpackage.rz7
                    public final Object invoke(Object obj13, Object obj14, Object obj15) {
                        int i122 = i12;
                        iei ieiVar = iei.a;
                        lz1 lz1Var = jd4.a;
                        switch (i122) {
                            case 0:
                                ld4 ld4Var2 = (ld4) obj14;
                                int iIntValue = ((Integer) obj15).intValue();
                                ((s64) obj13).getClass();
                                e18 e18Var4 = (e18) ld4Var2;
                                if (!e18Var4.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    e18Var4.T();
                                } else {
                                    String strJ02 = d4c.j0(R.string.settings_voice_consent_toggle_title, e18Var4);
                                    String strJ03 = d4c.j0(R.string.settings_voice_consent_toggle_description, e18Var4);
                                    m1j m1jVar3 = m1jVar2;
                                    boolean zA = m1jVar3.a();
                                    pl3 pl3Var3 = pl3Var2;
                                    boolean zH2 = e18Var4.h(pl3Var3);
                                    View view3 = view;
                                    boolean zH3 = zH2 | e18Var4.h(view3) | e18Var4.f(m1jVar3);
                                    Object objN9 = e18Var4.N();
                                    if (zH3 || objN9 == lz1Var) {
                                        objN9 = new gl1(0, pl3Var3, m1jVar3, view3);
                                        e18Var4.k0(objN9);
                                    }
                                    ikk.j(strJ02, strJ03, zA, (bz7) objN9, null, false, e18Var4, 0);
                                }
                                break;
                            default:
                                ld4 ld4Var3 = (ld4) obj14;
                                int iIntValue2 = ((Integer) obj15).intValue();
                                ((ia0) obj13).getClass();
                                e18 e18Var5 = (e18) ld4Var3;
                                if (!e18Var5.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    e18Var5.T();
                                } else {
                                    Object objN10 = e18Var5.N();
                                    m1j m1jVar4 = m1jVar2;
                                    if (objN10 == lz1Var) {
                                        objN10 = mpk.P((uwc) m1jVar4.f.getValue());
                                        e18Var5.k0(objN10);
                                    }
                                    nwb nwbVar = (nwb) objN10;
                                    if (m1jVar4.a()) {
                                        nwbVar.setValue((uwc) m1jVar4.f.getValue());
                                    }
                                    m5j.a.a(gb9.N(fqb.E, MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), fd9.q0(1438552019, new bn(5, nwbVar, pl3Var2, view, m1jVar4), e18Var5), e18Var5, 432, 0);
                                }
                                break;
                        }
                        return ieiVar;
                    }
                }, e18Var3), e18Var3, 1572870, 30);
                obj4 = s64Var;
                tjh.b(d4c.j0(R.string.settings_voice_consent_footer, e18Var3), gb9.N(gb9.L(fqbVar, 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, i5), MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), gm3.a(e18Var3).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var3).e.E).i, e18Var3, 48, 0, 131064);
                e18Var3.p(r8);
            } else {
                i6 = 6;
                obj4 = s64Var;
                m1jVar2 = m1jVar;
                e18Var3.a0(-1383062489);
                e18Var3.p(r8);
            }
            rz7 rz7Var3 = rz7Var2;
            rz7Var3.invoke(obj4, e18Var3, Integer.valueOf(i6 | ((i7 >> 12) & 112)));
            e18Var3.p(true);
            e18Var = e18Var3;
            obj = rz7Var3;
        } else {
            pl3Var2 = pl3Var;
            m1jVar2 = m1jVar;
            e18 e18Var4 = e18Var2;
            k5jVar2 = k5jVar;
            e18Var4.T();
            e18Var = e18Var4;
            obj = obj6;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new hl(k5jVar2, pl3Var2, m1jVar2, iqbVar, rz7Var, obj, i, 3);
        }
    }

    public static final void k(s64 s64Var, fn1 fn1Var, ld4 ld4Var, int i) {
        int i2;
        uk1 uk1Var;
        r7e r7eVarS;
        Map map;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1217087007);
        if ((i & 48) == 0) {
            i2 = (e18Var.f(fn1Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.c(16.0f) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.c(16.0f) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i3 = 0;
        if (e18Var.Q(i2 & 1, (i2 & 1169) != 1168)) {
            m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
            boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = m7fVarN.a(jce.a.b(x89.class), null, null);
                e18Var.k0(objN);
            }
            e18Var.p(false);
            e18Var.p(false);
            int i4 = 2;
            if (!((x89) objN).a() || fn1Var == null || (map = (Map) ((tn1) fn1Var).J.getValue()) == null || !(!map.isEmpty())) {
                r7eVarS = e18Var.s();
                if (r7eVarS != null) {
                    uk1Var = new uk1(s64Var, fn1Var, i, i4);
                    r7eVarS.d = uk1Var;
                }
                return;
            }
            fqb fqbVar = fqb.E;
            kxk.g(e18Var, androidx.compose.foundation.layout.b.e(fqbVar, 16.0f));
            n("Server Config", null, e18Var, 6);
            kxk.g(e18Var, androidx.compose.foundation.layout.b.e(fqbVar, 8.0f));
            pzg.a(gb9.L(androidx.compose.foundation.layout.b.c(fqbVar, 1.0f), 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), gm3.b(e18Var).f, gm3.a(e18Var).o, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, fd9.q0(705946044, new cl1(fn1Var, i3), e18Var), e18Var, 12582912, 120);
        } else {
            e18Var.T();
        }
        r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            uk1Var = new uk1(s64Var, fn1Var, i, 3);
            r7eVarS.d = uk1Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(defpackage.k5j r18, defpackage.pl3 r19, defpackage.iqb r20, defpackage.m1j r21, defpackage.rz7 r22, defpackage.rz7 r23, defpackage.ld4 r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.bell.b.l(k5j, pl3, iqb, m1j, rz7, rz7, ld4, int, int):void");
    }

    public static final void m(mj1 mj1Var, zy7 zy7Var, boolean z, pl3 pl3Var, ld4 ld4Var, int i) {
        zy7Var.getClass();
        pl3Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1074261013);
        int i2 = i | (e18Var.f(mj1Var) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16) | (e18Var.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.f(pl3Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        int i3 = 0;
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            nwb nwbVarU = mpk.u(mj1Var.K, e18Var);
            ta4 ta4VarQ0 = fd9.q0(660835432, new ok1(pl3Var, nwbVarU, mj1Var), e18Var);
            ta4 ta4VarQ02 = fd9.q0(1614370347, new pk1(i3, nwbVarU), e18Var);
            if (z) {
                e18Var.a0(1509135975);
                nt.d(zy7Var, androidx.compose.foundation.layout.b.v(yfd.p(mpk.b0(fqb.E, mpk.Y(e18Var), true), gm3.a(e18Var).p, gm3.b(e18Var).h), MTTypesetterKt.kLineSkipLimitMultiplier, 480.0f, 1), null, fd9.q0(276417620, new fn(mj1Var, pl3Var, ta4VarQ0, ta4VarQ02, 8), e18Var), e18Var, ((i2 >> 3) & 14) | 3072, 4);
                e18Var.p(false);
            } else {
                e18Var.a0(1509781333);
                r4g r4gVarS = gb9.S(null, null, null, zy7Var, e18Var, (i2 << 6) & 7168, 7);
                String strJ0 = d4c.j0(R.string.voice_settings_sheet_title, e18Var);
                k4g k4gVar = k4g.a;
                vkc.a(r4gVarS, strJ0, null, k4g.d(gm3.a(e18Var).p, e18Var, 14), false, true, null, null, null, null, null, null, fd9.q0(1976415212, new kw(mj1Var, pl3Var, ta4VarQ0, ta4VarQ02, 1), e18Var), e18Var, 196616, 3072, 8148);
                e18Var = e18Var;
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new sq(mj1Var, zy7Var, z, pl3Var, i);
        }
    }

    public static final void n(String str, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(245725839);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 432;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            tkh tkhVarB = tkh.b(((jm3) gm3.c(e18Var).e.E).h, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777214);
            iqbVar2 = fqb.E;
            nrk.b(str, null, gb9.L(androidx.compose.foundation.layout.b.c(iqbVar2, 1.0f), 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), tkhVarB, 0, 8.0f, e18Var, (i3 & 14) | 196656, 16);
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new el(str, iqbVar2, i, 3);
        }
    }

    public static final void o(boolean z, String str, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1910343442);
        if ((i & 6) == 0) {
            i2 = (e18Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (e18Var.f(str) ? 32 : 16) | (e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        int i4 = 0;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            wd6.M(z, iqbVar, gp6.e(null, 3), gp6.f(null, 3), null, fd9.q0(-1292021482, new qk1(z, str, i4), e18Var), e18Var, ((i3 >> 3) & 112) | (i3 & 14) | 200064, 16);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ds0(z, str, iqbVar, i, 2);
        }
    }

    public static final void p(MobileAppToolPreviewInfo mobileAppToolPreviewInfo, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, zy7 zy7Var4, ld4 ld4Var, int i) {
        mobileAppToolPreviewInfo.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        zy7Var3.getClass();
        zy7Var4.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-511286808);
        int i2 = i | (e18Var.f(mobileAppToolPreviewInfo) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16) | (e18Var.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(zy7Var3) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(zy7Var4) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        int i3 = 0;
        int i4 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            vkc.a(gb9.S(u4g.F, null, null, zy7Var, e18Var, ((i2 << 6) & 7168) | 6, 6), d4c.j0(R.string.voice_tool_approval_title, e18Var), null, null, false, false, null, null, null, null, fd9.q0(409129163, new pl1(zy7Var3, zy7Var4, zy7Var2, i3), e18Var), null, fd9.q0(499189453, new ci(i4, mobileAppToolPreviewInfo), e18Var), e18Var, 196616, 3120, 6108);
            e18Var = e18Var;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new uo((Object) mobileAppToolPreviewInfo, zy7Var, zy7Var2, zy7Var3, (Object) zy7Var4, i, 6);
        }
    }

    public static final void q(Context context) {
        Object systemService = context.getSystemService("notification");
        NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
        if (notificationManager != null) {
            notificationManager.cancel(9001);
        }
    }

    public static final void r(rwe rweVar) {
        rweVar.getClass();
        rweVar.E.m(new fv(9, new BellOverlayDestination[]{BellOverlayDestination.Closed.INSTANCE}), new a2g(17));
    }
}
