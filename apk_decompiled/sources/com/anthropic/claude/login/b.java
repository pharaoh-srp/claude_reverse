package com.anthropic.claude.login;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.login.LoginScreens;
import com.anthropic.claude.login.b;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.bu2;
import defpackage.e18;
import defpackage.fd9;
import defpackage.fqb;
import defpackage.hx2;
import defpackage.iqb;
import defpackage.jce;
import defpackage.jd4;
import defpackage.ld4;
import defpackage.m7f;
import defpackage.mpk;
import defpackage.mr9;
import defpackage.pz7;
import defpackage.r7e;
import defpackage.sq6;
import defpackage.ta4;
import defpackage.v40;
import defpackage.x89;
import defpackage.xh;
import defpackage.y63;
import defpackage.ybg;
import defpackage.zy7;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    /* JADX WARN: Removed duplicated region for block: B:79:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.rz7 r24, defpackage.zy7 r25, defpackage.iqb r26, com.anthropic.claude.login.WelcomeNotice r27, defpackage.zy7 r28, defpackage.hj r29, defpackage.ld4 r30, int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.login.b.a(rz7, zy7, iqb, com.anthropic.claude.login.WelcomeNotice, zy7, hj, ld4, int, int):void");
    }

    public static final void b(zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        zy7 zy7Var2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1965856566);
        int i2 = (e18Var.h(zy7Var) ? 4 : 2) | i | 48;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            fqb fqbVar = fqb.E;
            zy7Var2 = zy7Var;
            v40.d(true, zy7Var2, null, false, androidx.compose.foundation.layout.b.c(fqbVar, 1.0f), null, e18Var, ((i2 << 3) & 112) | 3078, 36);
            iqbVar = fqbVar;
        } else {
            zy7Var2 = zy7Var;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xh(zy7Var2, iqbVar, i, 9);
        }
    }

    public static final void c(final ta4 ta4Var, final iqb iqbVar, boolean z, final ta4 ta4Var2, ld4 ld4Var, final int i, final int i2) {
        boolean z2;
        int i3;
        e18 e18Var;
        final boolean z3;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(679495494);
        int i4 = i | (e18Var2.f(iqbVar) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
            z2 = z;
        } else {
            z2 = z;
            i3 = i4 | (e18Var2.g(z2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        }
        if (e18Var2.Q(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z4 = i5 != 0 ? true : z2;
            Object objN = e18Var2.N();
            if (objN == jd4.a) {
                objN = sq6.p(e18Var2);
            }
            ybg ybgVar = (ybg) objN;
            iqb iqbVarB = iqbVar.B(androidx.compose.foundation.layout.b.c);
            iqb iqbVarK0 = fqb.E;
            if (z4) {
                iqbVarK0 = mpk.k0(iqbVarK0, mpk.n);
            }
            e18Var = e18Var2;
            v40.b(iqbVarB.B(iqbVarK0), null, ta4Var, null, fd9.q0(-1667881589, new y63(ybgVar, 2), e18Var2), null, 0, 0L, 0L, null, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(-364394756, new bu2(ta4Var2, 4, ybgVar), e18Var2), e18Var, 24960, 2026);
            z3 = z4;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            z3 = z2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(iqbVar, z3, ta4Var2, i, i2) { // from class: vga
                public final /* synthetic */ iqb F;
                public final /* synthetic */ boolean G;
                public final /* synthetic */ ta4 H;
                public final /* synthetic */ int I;

                {
                    this.I = i2;
                }

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(3079);
                    b.c(this.E, this.F, this.G, this.H, (ld4) obj, iP0, this.I);
                    return iei.a;
                }
            };
        }
    }

    public static final void d(LoginScreens loginScreens, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar, ta4 ta4Var, zy7 zy7Var3, x89 x89Var, ld4 ld4Var, int i) {
        iqb iqbVar2;
        x89 x89Var2;
        x89 x89Var3;
        int i2;
        iqb iqbVar3;
        boolean z;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2137699373);
        int i3 = i | (e18Var.f(loginScreens) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16) | (e18Var.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 3072 | (e18Var.h(zy7Var3) ? 131072 : 65536) | 524288;
        if (e18Var.Q(i3 & 1, (599187 & i3) != 599186)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == jd4.a) {
                    objN = m7fVarN.a(jce.a.b(x89.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                x89Var3 = (x89) objN;
                i2 = i3 & (-3670017);
                iqbVar3 = fqb.E;
            } else {
                e18Var.T();
                i2 = i3 & (-3670017);
                iqbVar3 = iqbVar;
                x89Var3 = x89Var;
            }
            e18Var.q();
            if (loginScreens instanceof LoginScreens.Welcome) {
                z = zy7Var3 != null;
            } else {
                if (!(loginScreens instanceof LoginScreens.MagicLinkSent)) {
                    if (!(loginScreens instanceof LoginScreens.MinorBlocked)) {
                        mr9.b();
                        return;
                    }
                }
            }
            v40.d(z, zy7Var, zy7Var2, x89Var3.a(), androidx.compose.foundation.layout.b.c(iqbVar3, 1.0f), ta4Var, e18Var, (i2 & 1008) | 196608, 0);
            x89Var2 = x89Var3;
            iqbVar2 = iqbVar3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            x89Var2 = x89Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new hx2(loginScreens, zy7Var, zy7Var2, iqbVar2, ta4Var, zy7Var3, x89Var2, i);
        }
    }
}
