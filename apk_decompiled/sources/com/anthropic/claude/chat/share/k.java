package com.anthropic.claude.chat.share;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.b2g;
import defpackage.bz7;
import defpackage.csg;
import defpackage.d2g;
import defpackage.dch;
import defpackage.e18;
import defpackage.eg0;
import defpackage.eli;
import defpackage.eve;
import defpackage.fd9;
import defpackage.fqb;
import defpackage.gm3;
import defpackage.gr9;
import defpackage.iei;
import defpackage.im6;
import defpackage.io8;
import defpackage.iqb;
import defpackage.iv1;
import defpackage.jce;
import defpackage.jd4;
import defpackage.jm9;
import defpackage.jp;
import defpackage.jy5;
import defpackage.kce;
import defpackage.kg3;
import defpackage.kl1;
import defpackage.l45;
import defpackage.l6b;
import defpackage.ld4;
import defpackage.lxf;
import defpackage.lz1;
import defpackage.m7f;
import defpackage.mpk;
import defpackage.ngf;
import defpackage.nwb;
import defpackage.op3;
import defpackage.oq5;
import defpackage.pz7;
import defpackage.r7e;
import defpackage.rn;
import defpackage.rwe;
import defpackage.skk;
import defpackage.sq6;
import defpackage.sxa;
import defpackage.t24;
import defpackage.ta4;
import defpackage.tfe;
import defpackage.tp4;
import defpackage.tu;
import defpackage.ufe;
import defpackage.v40;
import defpackage.ve4;
import defpackage.w1g;
import defpackage.w4d;
import defpackage.x1d;
import defpackage.x44;
import defpackage.xah;
import defpackage.y1g;
import defpackage.yb5;
import defpackage.ybg;
import defpackage.zh4;
import defpackage.zy1;
import defpackage.zy7;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k {
    public static final void a(String str, pz7 pz7Var, iqb iqbVar, w1g w1gVar, zy7 zy7Var, ld4 ld4Var, int i) {
        iqb iqbVar2;
        w1g w1gVar2;
        w1g w1gVar3;
        int i2;
        iqb iqbVar3;
        d2g d2gVar;
        int i3;
        w1g w1gVar4;
        str.getClass();
        pz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1745011049);
        int i4 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.h(pz7Var) ? 32 : 16) | 1408 | (e18Var.h(zy7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        if (e18Var.Q(i4 & 1, (i4 & 9363) != 9362)) {
            e18Var.V();
            int i5 = i & 1;
            int i6 = 9;
            lz1 lz1Var = jd4.a;
            if (i5 == 0 || e18Var.A()) {
                m7f m7fVar = (m7f) e18Var.j(gr9.b);
                boolean zH = ((((i4 & 14) ^ 6) > 4 && e18Var.f(str)) || (i4 & 6) == 4) | e18Var.h(m7fVar);
                Object objN = e18Var.N();
                if (zH || objN == lz1Var) {
                    objN = new jy5(str, m7fVar, i6);
                    e18Var.k0(objN);
                }
                kce kceVar = jce.a;
                w1gVar3 = (w1g) fd9.r0(kceVar.b(w1g.class), oq5.B(kceVar.b(w1g.class)), (bz7) objN, e18Var);
                i2 = i4 & (-7169);
                iqbVar3 = fqb.E;
            } else {
                e18Var.T();
                w1gVar3 = w1gVar;
                i2 = i4 & (-7169);
                iqbVar3 = iqbVar;
            }
            e18Var.q();
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = fd9.O(im6.E, e18Var);
                e18Var.k0(objN2);
            }
            l45 l45Var = (l45) objN2;
            d2g d2gVar2 = (d2g) w1gVar3.l.getValue();
            boolean zF = e18Var.f(w1gVar3);
            Object objN3 = e18Var.N();
            tp4 tp4Var = null;
            if (zF || objN3 == lz1Var) {
                objN3 = new jp(w1gVar3, tp4Var, 8);
                e18Var.k0(objN3);
            }
            csg.g((bz7) objN3, e18Var, 0, 1);
            boolean zF2 = e18Var.f(w1gVar3);
            Object objN4 = e18Var.N();
            int i7 = 10;
            if (zF2 || objN4 == lz1Var) {
                objN4 = new l6b(w1gVar3, tp4Var, i7);
                e18Var.k0(objN4);
            }
            fd9.i(e18Var, (pz7) objN4, iei.a);
            boolean z = (57344 & i2) == 16384;
            Object objN5 = e18Var.N();
            if (z || objN5 == lz1Var) {
                objN5 = new kl1(26, zy7Var);
                e18Var.k0(objN5);
            }
            yb5.c(0, 1, e18Var, (zy7) objN5, false);
            Object objN6 = e18Var.N();
            if (objN6 == lz1Var) {
                objN6 = mpk.P(Boolean.FALSE);
                e18Var.k0(objN6);
            }
            nwb nwbVar = (nwb) objN6;
            zy1 zy1Var = w1gVar3.i;
            Object objN7 = e18Var.N();
            if (objN7 == lz1Var) {
                objN7 = new x1d(nwbVar, (tp4) null, 9);
                e18Var.k0(objN7);
            }
            x44.b(zy1Var, (pz7) objN7, e18Var, 0);
            Object objN8 = e18Var.N();
            if (objN8 == lz1Var) {
                objN8 = new y1g(6);
                e18Var.k0(objN8);
            }
            zy7 zy7Var2 = (zy7) objN8;
            kce kceVar2 = jce.a;
            rwe rweVarP = eve.P(kceVar2.b(SharedChatModalBottomSheetDestination.class), oq5.B(kceVar2.b(SharedChatModalBottomSheetDestination.class)), true, iv1.M(kceVar2.b(SharedChatModalBottomSheetDestination.class)), zy7Var2, e18Var);
            x44.q0(rweVarP, e18Var);
            eli eliVar = (eli) e18Var.j(ve4.t);
            Object objN9 = e18Var.N();
            if (objN9 == lz1Var) {
                objN9 = mpk.P(null);
                e18Var.k0(objN9);
            }
            nwb nwbVar2 = (nwb) objN9;
            String str2 = (String) nwbVar2.getValue();
            if (str2 == null) {
                e18Var.a0(661125091);
                e18Var.p(false);
            } else {
                e18Var.a0(661125092);
                Object objN10 = e18Var.N();
                if (objN10 == lz1Var) {
                    objN10 = new lxf(7, nwbVar2);
                    e18Var.k0(objN10);
                }
                skk.a(str2, (zy7) objN10, e18Var, 48);
                e18Var.p(false);
            }
            Object objN11 = e18Var.N();
            if (objN11 == lz1Var) {
                objN11 = new ufe(eliVar, 5, nwbVar2);
                e18Var.k0(objN11);
            }
            pz7 pz7Var2 = (pz7) objN11;
            j.a(rweVarP, w1gVar3, pz7Var2, e18Var, 384);
            op3 op3Var = (op3) e18Var.j(ve4.f);
            boolean zH2 = e18Var.h(rweVarP);
            Object objN12 = e18Var.N();
            if (zH2 || objN12 == lz1Var) {
                objN12 = new io8(rweVarP, 3);
                e18Var.k0(objN12);
            }
            pz7 pz7Var3 = (pz7) objN12;
            boolean zH3 = e18Var.h(rweVarP);
            Object objN13 = e18Var.N();
            if (zH3 || objN13 == lz1Var) {
                objN13 = new io8(rweVarP, 4);
                e18Var.k0(objN13);
            }
            pz7 pz7Var4 = (pz7) objN13;
            boolean zF3 = e18Var.f(w1gVar3);
            Object objN14 = e18Var.N();
            if (zF3 || objN14 == lz1Var) {
                d2gVar = d2gVar2;
                w1g w1gVar5 = w1gVar3;
                i3 = 10;
                b2g b2gVar = new b2g(1, w1gVar5, w1g.class, "getCitation", "getCitation$chat(Ljava/lang/String;)Lcom/anthropic/claude/api/chat/citation/Citation;", 0, 0);
                w1gVar4 = w1gVar5;
                e18Var.k0(b2gVar);
                objN14 = b2gVar;
            } else {
                w1gVar4 = w1gVar3;
                d2gVar = d2gVar2;
                i3 = 10;
            }
            kg3 kg3VarO = dch.O(pz7Var2, pz7Var3, pz7Var4, (bz7) ((jm9) objN14), e18Var);
            Object objN15 = e18Var.N();
            if (objN15 == lz1Var) {
                objN15 = sq6.p(e18Var);
            }
            ybg ybgVar = (ybg) objN15;
            ta4 ta4VarQ0 = fd9.q0(-1804851430, new tfe(d2gVar, w1gVar4, zy7Var, i3), e18Var);
            ta4 ta4VarQ02 = fd9.q0(1082389916, new rn(ybgVar, 24), e18Var);
            w1g w1gVar6 = w1gVar4;
            ta4 ta4VarQ03 = fd9.q0(-744194867, new t24(w1gVar4, ybgVar, zy7Var, d2gVar, l45Var, op3Var, rweVarP, pz7Var, kg3VarO, nwbVar), e18Var);
            iqb iqbVar4 = iqbVar3;
            v40.b(iqbVar4, null, ta4VarQ0, null, ta4VarQ02, null, 0, 0L, 0L, null, MTTypesetterKt.kLineSkipLimitMultiplier, ta4VarQ03, e18Var, 24966, 2026);
            e18Var = e18Var;
            iqbVar2 = iqbVar4;
            w1gVar2 = w1gVar6;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            w1gVar2 = w1gVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new w4d(str, pz7Var, iqbVar2, w1gVar2, zy7Var, i, 5);
        }
    }

    public static final void b(String str, zy7 zy7Var, zy7 zy7Var2, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(512146586);
        int i2 = (e18Var.f(str) ? 4 : 2) | i | (e18Var.h(zy7Var) ? 32 : 16) | (e18Var.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        byte b = 0;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            eg0.a(fd9.q0(-971134251, new ngf(str, 3), e18Var), null, fd9.q0(2000654099, new sxa(zy7Var2, 25, b), e18Var), fd9.q0(245140106, new tu(21, zy7Var), e18Var), MTTypesetterKt.kLineSkipLimitMultiplier, null, zh4.n(gm3.a(e18Var).p, e18Var, 0), null, e18Var, 3462, 434);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new tfe(zy7Var, str, zy7Var2, i, 9);
        }
    }

    public static final void c(String str) {
        List list = xah.a;
        xah.e(6, "Unsupported from : ".concat(str), null, null);
    }
}
