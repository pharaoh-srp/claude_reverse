package com.anthropic.claude.conway;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.conway.ConwayAppScreen;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.dx4;
import defpackage.e18;
import defpackage.eve;
import defpackage.f44;
import defpackage.fd9;
import defpackage.fr4;
import defpackage.gm3;
import defpackage.iqb;
import defpackage.ir4;
import defpackage.iuj;
import defpackage.iv1;
import defpackage.j44;
import defpackage.jce;
import defpackage.jd4;
import defpackage.kce;
import defpackage.ld4;
import defpackage.lnk;
import defpackage.lsc;
import defpackage.lz1;
import defpackage.nwb;
import defpackage.oq5;
import defpackage.pk;
import defpackage.pz7;
import defpackage.r7e;
import defpackage.rwe;
import defpackage.t74;
import defpackage.tp4;
import defpackage.us4;
import defpackage.v40;
import defpackage.vi4;
import defpackage.yb5;
import defpackage.zy1;
import defpackage.zy7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static final void a(iqb iqbVar, us4 us4Var, dx4 dx4Var, zy7 zy7Var, zy7 zy7Var2, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1939042279);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var.f(us4Var) : e18Var.h(us4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? e18Var.f(dx4Var) : e18Var.h(dx4Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.h(zy7Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        int i3 = i2;
        if (e18Var.Q(i3 & 1, (i3 & 9363) != 9362)) {
            e18Var.V();
            if ((i & 1) != 0 && !e18Var.A()) {
                e18Var.T();
            }
            e18Var.q();
            us4 us4Var2 = us4.e;
            f fVarE = g.e(us4Var, e18Var, (i3 >> 3) & 14);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new fr4(0);
                e18Var.k0(objN);
            }
            zy7 zy7Var3 = (zy7) objN;
            kce kceVar = jce.a;
            rwe rweVarP = eve.P(kceVar.b(ConwayAppScreen.class), oq5.B(kceVar.b(ConwayAppScreen.class)), true, iv1.M(kceVar.b(ConwayAppScreen.class)), zy7Var3, e18Var);
            lsc lscVar = rweVarP.F;
            nwb nwbVarF = lnk.f(fVarE.D, e18Var);
            nwb nwbVarF2 = lnk.f(fVarE.z, e18Var);
            Object[] objArr = new Object[0];
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new fr4(1);
                e18Var.k0(objN2);
            }
            nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN2, e18Var, 48);
            zy1 zy1Var = fVarE.E;
            boolean zF = e18Var.f(fVarE) | e18Var.f(nwbVar);
            Object objN3 = e18Var.N();
            if (zF || objN3 == lz1Var) {
                objN3 = new t74(fVarE, nwbVar, (tp4) null);
                e18Var.k0(objN3);
            }
            fd9.i(e18Var, (pz7) objN3, zy1Var);
            ConwayAppScreen.Extension extension = (ConwayAppScreen.Extension) nwbVarF.getValue();
            boolean z = extension != null && ((ir4) nwbVar.getValue()) == ir4.E;
            boolean zF2 = e18Var.f(nwbVar);
            Object objN4 = e18Var.N();
            int i4 = 8;
            if (zF2 || objN4 == lz1Var) {
                objN4 = new vi4(8, nwbVar);
                e18Var.k0(objN4);
            }
            yb5.c(0, 0, e18Var, (zy7) objN4, z);
            long j = gm3.a(e18Var).o;
            e18Var = e18Var;
            v40.b(iqbVar, null, null, fd9.q0(657318365, new f44(extension, nwbVar, lscVar, i4), e18Var), null, null, 0, j, 0L, null, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(-509126321, new j44(z, extension, rweVarP, us4Var, fVarE, dx4Var, zy7Var, zy7Var2, nwbVarF2), e18Var), e18Var, (i3 & 14) | 3072, 1910);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pk(iqbVar, us4Var, dx4Var, zy7Var, zy7Var2, i);
        }
    }
}
