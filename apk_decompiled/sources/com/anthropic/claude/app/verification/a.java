package com.anthropic.claude.app.verification;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.e18;
import defpackage.fd9;
import defpackage.fqb;
import defpackage.iqb;
import defpackage.ld4;
import defpackage.olh;
import defpackage.r7e;
import defpackage.v40;
import defpackage.xh;
import defpackage.xsi;
import defpackage.zy7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static final void a(int i, ld4 ld4Var, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar) {
        zy7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-173839638);
        int i2 = (e18Var.h(zy7Var) ? 4 : 2) | i | (e18Var.h(zy7Var2) ? 32 : 16) | (e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            olh.a(false, null, null, fd9.q0(-1459526169, new xsi(zy7Var, iqbVar, zy7Var2), e18Var), e18Var, 3072, 7);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xsi(i, zy7Var, zy7Var2, iqbVar);
        }
    }

    public static final void b(zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        zy7 zy7Var2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2141682332);
        int i2 = (e18Var.h(zy7Var) ? 4 : 2) | i | 48;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            fqb fqbVar = fqb.E;
            zy7Var2 = zy7Var;
            v40.d(true, zy7Var2, null, false, fqbVar, null, e18Var, ((i2 << 3) & 112) | 27654, 36);
            iqbVar = fqbVar;
        } else {
            zy7Var2 = zy7Var;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xh(zy7Var2, iqbVar, i, 20);
        }
    }
}
