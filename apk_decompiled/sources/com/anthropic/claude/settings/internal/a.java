package com.anthropic.claude.settings.internal;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.csg;
import defpackage.e18;
import defpackage.eve;
import defpackage.fd9;
import defpackage.ij8;
import defpackage.iv1;
import defpackage.jce;
import defpackage.jd4;
import defpackage.kce;
import defpackage.ld4;
import defpackage.mwa;
import defpackage.oq5;
import defpackage.r7e;
import defpackage.rwe;
import defpackage.v56;
import defpackage.v76;
import defpackage.wd;
import defpackage.x44;
import defpackage.zy7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final void a(zy7 zy7Var, zy7 zy7Var2, ld4 ld4Var, int i) {
        zy7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(710951281);
        int i2 = 4;
        int i3 = (e18Var.h(zy7Var) ? 4 : 2) | i | (e18Var.h(zy7Var2) ? 32 : 16);
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new ij8(26);
                e18Var.k0(objN);
            }
            zy7 zy7Var3 = (zy7) objN;
            kce kceVar = jce.a;
            rwe rweVarP = eve.P(kceVar.b(InternalSettingsAppScreen.class), oq5.B(kceVar.b(InternalSettingsAppScreen.class)), true, iv1.M(kceVar.b(InternalSettingsAppScreen.class)), zy7Var3, e18Var);
            x44.q0(rweVarP, e18Var);
            b(rweVarP, zy7Var, zy7Var2, e18Var, (i3 << 3) & 1008);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v56(i, i2, zy7Var, zy7Var2);
        }
    }

    public static final void b(rwe rweVar, zy7 zy7Var, zy7 zy7Var2, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(735827653);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(rweVar) : e18Var.h(rweVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            mwa.l(rweVar, null, csg.q(rweVar, e18Var, i3 | 384), fd9.q0(-1967115075, new wd(rweVar, zy7Var, zy7Var2, 7), e18Var), e18Var, i3 | 3072, 2);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v76(rweVar, i, zy7Var, zy7Var2, 8);
        }
    }
}
