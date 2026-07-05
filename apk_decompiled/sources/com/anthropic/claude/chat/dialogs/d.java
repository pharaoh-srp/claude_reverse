package com.anthropic.claude.chat.dialogs;

import com.anthropic.claude.chat.ChatScreenParams;
import com.anthropic.claude.chat.dialogs.ChatScreenDialog;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.e18;
import defpackage.fd9;
import defpackage.fv;
import defpackage.jce;
import defpackage.jd4;
import defpackage.ld4;
import defpackage.lq0;
import defpackage.m7f;
import defpackage.mwa;
import defpackage.oa0;
import defpackage.p23;
import defpackage.r7e;
import defpackage.rwe;
import defpackage.sq6;
import defpackage.t53;
import defpackage.x53;
import defpackage.zy7;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final void a(ChatScreenParams chatScreenParams, t53 t53Var, rwe rweVar, zy7 zy7Var, lq0 lq0Var, ld4 ld4Var, int i) {
        int i2;
        zy7 zy7Var2;
        e18 e18Var;
        lq0 lq0Var2;
        lq0 lq0Var3;
        int i3;
        chatScreenParams.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1514538778);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(chatScreenParams) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.f(t53Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? e18Var2.f(rweVar) : e18Var2.h(rweVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            zy7Var2 = zy7Var;
            i2 |= e18Var2.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            zy7Var2 = zy7Var;
        }
        if ((i & 24576) == 0) {
            i2 |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if (e18Var2.Q(i2 & 1, (i2 & 9363) != 9362)) {
            e18Var2.V();
            if ((i & 1) == 0 || e18Var2.A()) {
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN = e18Var2.N();
                if (zF || objN == jd4.a) {
                    objN = m7fVarN.a(jce.a.b(lq0.class), null, null);
                    e18Var2.k0(objN);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                lq0Var3 = (lq0) objN;
                i3 = i2 & (-57345);
            } else {
                e18Var2.T();
                i3 = i2 & (-57345);
                lq0Var3 = lq0Var;
            }
            int i4 = i3;
            e18Var2.q();
            e18Var = e18Var2;
            mwa.l(rweVar, null, null, fd9.q0(-1368664389, new x53(chatScreenParams, rweVar, zy7Var2, t53Var, lq0Var3), e18Var2), e18Var, ((i4 >> 6) & 14) | 3072, 6);
            lq0Var2 = lq0Var3;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            lq0Var2 = lq0Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new oa0(chatScreenParams, t53Var, rweVar, zy7Var, lq0Var2, i, 1);
        }
    }

    public static final void b(rwe rweVar) {
        fv fvVar = new fv(13, new ChatScreenDialog[]{ChatScreenDialog.Dismissed.INSTANCE});
        p23 p23Var = new p23(8);
        rweVar.getClass();
        rweVar.E.m(fvVar, p23Var);
    }
}
