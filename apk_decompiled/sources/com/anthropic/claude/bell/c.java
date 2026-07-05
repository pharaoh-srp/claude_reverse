package com.anthropic.claude.bell;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.bn;
import defpackage.e18;
import defpackage.fqb;
import defpackage.iqb;
import defpackage.jd4;
import defpackage.jm9;
import defpackage.ld4;
import defpackage.lz1;
import defpackage.mj1;
import defpackage.pl3;
import defpackage.qwe;
import defpackage.r7e;
import defpackage.t4g;
import defpackage.xd;
import defpackage.xn;
import defpackage.zy7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    public static final void a(mj1 mj1Var, t4g t4gVar, pl3 pl3Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        iqb iqbVar2;
        Object objN;
        t4gVar.getClass();
        pl3Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-231734113);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(mj1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var2.f(t4gVar) : e18Var2.h(t4gVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? e18Var2.f(pl3Var) : e18Var2.h(pl3Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i3 = i2 | 3072;
        boolean z = true;
        if (e18Var2.Q(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zBooleanValue = ((Boolean) mj1Var.m.w.getValue()).booleanValue();
            lz1 lz1Var = jd4.a;
            if (zBooleanValue) {
                e18Var2.a0(-1578256332);
                if ((i3 & 112) != 32 && ((i3 & 64) == 0 || !e18Var2.h(t4gVar))) {
                    z = false;
                }
                objN = e18Var2.N();
                if (z || objN == lz1Var) {
                    objN = new xn(0, t4gVar, t4g.class, "dismiss", "dismiss()V", 0, 15);
                    e18Var2.k0(objN);
                }
                e18Var2.p(false);
                fqb fqbVar = fqb.E;
                e18Var = e18Var2;
                qwe.a(t4gVar, fqbVar, null, false, null, new bn((Object) mj1Var, (Object) t4gVar, (Object) pl3Var, (zy7) ((jm9) objN), 6), e18Var, ((i3 >> 3) & 14) | ((i3 >> 6) & 112), 28);
                iqbVar2 = fqbVar;
            } else {
                e18Var2.a0(-1578235624);
                if ((i3 & 112) != 32 && ((i3 & 64) == 0 || !e18Var2.h(t4gVar))) {
                    z = false;
                }
                objN = e18Var2.N();
                if (z || objN == lz1Var) {
                    objN = new xn(0, t4gVar, t4g.class, "pop", "pop()V", 0, 16);
                    e18Var2.k0(objN);
                }
                e18Var2.p(false);
                fqb fqbVar2 = fqb.E;
                e18Var = e18Var2;
                qwe.a(t4gVar, fqbVar2, null, false, null, new bn((Object) mj1Var, (Object) t4gVar, (Object) pl3Var, (zy7) ((jm9) objN), 6), e18Var, ((i3 >> 3) & 14) | ((i3 >> 6) & 112), 28);
                iqbVar2 = fqbVar2;
            }
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xd(mj1Var, t4gVar, pl3Var, iqbVar2, i, 8);
        }
    }
}
