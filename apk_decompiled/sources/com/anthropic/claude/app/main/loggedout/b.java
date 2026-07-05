package com.anthropic.claude.app.main.loggedout;

import com.anthropic.claude.login.WelcomeNotice;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.e18;
import defpackage.f73;
import defpackage.fd9;
import defpackage.ld4;
import defpackage.lz9;
import defpackage.q7f;
import defpackage.r7e;
import defpackage.rz7;
import defpackage.x44;
import defpackage.zy7;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final void a(zy7 zy7Var, zy7 zy7Var2, rz7 rz7Var, WelcomeNotice welcomeNotice, ld4 ld4Var, int i) {
        zy7Var.getClass();
        zy7Var2.getClass();
        rz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1744503558);
        int i2 = (e18Var.h(zy7Var) ? 4 : 2) | i | (e18Var.h(zy7Var2) ? 32 : 16) | (e18Var.h(rz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.d(welcomeNotice == null ? -1 : welcomeNotice.ordinal()) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            q7f q7fVar = q7f.a;
            x44.d(fd9.q0(228699758, new lz9(zy7Var, rz7Var, zy7Var2, welcomeNotice, 1), e18Var), e18Var);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new f73(zy7Var, zy7Var2, rz7Var, welcomeNotice, i, 5);
        }
    }
}
