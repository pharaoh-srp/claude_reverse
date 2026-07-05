package com.anthropic.claude.chat.share;

import com.anthropic.claude.chat.share.SharedChatModalBottomSheetDestination;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.e18;
import defpackage.fd9;
import defpackage.hyf;
import defpackage.im6;
import defpackage.jd4;
import defpackage.jga;
import defpackage.l45;
import defpackage.ld4;
import defpackage.mn;
import defpackage.mwa;
import defpackage.op3;
import defpackage.pz7;
import defpackage.r7e;
import defpackage.rwe;
import defpackage.v76;
import defpackage.ve4;
import defpackage.w1g;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {
    public static final void a(rwe rweVar, w1g w1gVar, pz7 pz7Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        pz7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-765882924);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var2.f(rweVar) : e18Var2.h(rweVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.f(w1gVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.h(pz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i3 = i2;
        if (e18Var2.Q(i3 & 1, (i3 & 147) != 146)) {
            op3 op3Var = (op3) e18Var2.j(ve4.f);
            Object objN = e18Var2.N();
            if (objN == jd4.a) {
                objN = fd9.O(im6.E, e18Var2);
                e18Var2.k0(objN);
            }
            e18Var = e18Var2;
            mwa.l(rweVar, null, null, fd9.q0(-27043361, new mn(op3Var, (l45) objN, pz7Var, rweVar, w1gVar, 6), e18Var2), e18Var, (i3 & 14) | 3072, 6);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v76(rweVar, i, w1gVar, pz7Var, 29);
        }
    }

    public static final void b(rwe rweVar) {
        rweVar.getClass();
        rweVar.E.m(new jga(28, new SharedChatModalBottomSheetDestination[]{SharedChatModalBottomSheetDestination.Closed.INSTANCE}), new hyf(20));
    }
}
