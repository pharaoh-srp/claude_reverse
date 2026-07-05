package com.anthropic.claude.settings;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.bz7;
import defpackage.csg;
import defpackage.e18;
import defpackage.eve;
import defpackage.fd9;
import defpackage.iv1;
import defpackage.jce;
import defpackage.jd4;
import defpackage.kce;
import defpackage.ld4;
import defpackage.ml3;
import defpackage.mwa;
import defpackage.oq5;
import defpackage.pz7;
import defpackage.qz7;
import defpackage.r7e;
import defpackage.rwe;
import defpackage.we;
import defpackage.ws5;
import defpackage.x44;
import defpackage.zd8;
import defpackage.zy7;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final void a(List list, ml3 ml3Var, zy7 zy7Var, zy7 zy7Var2, bz7 bz7Var, pz7 pz7Var, zy7 zy7Var3, zy7 zy7Var4, ld4 ld4Var, int i) {
        int i2;
        zy7Var.getClass();
        zy7Var2.getClass();
        bz7Var.getClass();
        pz7Var.getClass();
        zy7Var3.getClass();
        zy7Var4.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1658989189);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(list) : e18Var.h(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var.f(ml3Var) : e18Var.h(ml3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.h(bz7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.h(pz7Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var.h(zy7Var3) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= e18Var.h(zy7Var4) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (e18Var.Q(i3 & 1, (4793491 & i3) != 4793490)) {
            e18Var.V();
            if ((i & 1) != 0 && !e18Var.A()) {
                e18Var.T();
            }
            e18Var.q();
            boolean z = (((i3 & 14) ^ 6) > 4 && e18Var.h(list)) || (i3 & 6) == 4;
            Object objN = e18Var.N();
            if (z || objN == jd4.a) {
                objN = new ws5(list, 4);
                e18Var.k0(objN);
            }
            zy7 zy7Var5 = (zy7) objN;
            kce kceVar = jce.a;
            rwe rweVarP = eve.P(kceVar.b(SettingsAppScreen.class), oq5.B(kceVar.b(SettingsAppScreen.class)), true, iv1.M(kceVar.b(SettingsAppScreen.class)), zy7Var5, e18Var);
            x44.q0(rweVarP, e18Var);
            int i4 = ml3.f;
            b(rweVarP, ml3Var, zy7Var, zy7Var2, bz7Var, pz7Var, zy7Var3, zy7Var4, e18Var, 33554416 & i3);
            e18Var = e18Var;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new we((Object) list, (Object) ml3Var, zy7Var, (Object) zy7Var2, (qz7) bz7Var, (qz7) pz7Var, (Object) zy7Var3, (Object) zy7Var4, i, 4);
        }
    }

    public static final void b(rwe rweVar, ml3 ml3Var, zy7 zy7Var, zy7 zy7Var2, bz7 bz7Var, pz7 pz7Var, zy7 zy7Var3, zy7 zy7Var4, ld4 ld4Var, int i) {
        int i2;
        zy7 zy7Var5;
        zy7 zy7Var6;
        zy7 zy7Var7;
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1716847757);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var2.f(rweVar) : e18Var2.h(rweVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var2.f(ml3Var) : e18Var2.h(ml3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            zy7Var5 = zy7Var;
            i2 |= e18Var2.h(zy7Var5) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            zy7Var5 = zy7Var;
        }
        if ((i & 3072) == 0) {
            zy7Var6 = zy7Var2;
            i2 |= e18Var2.h(zy7Var6) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            zy7Var6 = zy7Var2;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.h(bz7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var2.h(pz7Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var2.h(zy7Var3) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            zy7Var7 = zy7Var4;
            i2 |= e18Var2.h(zy7Var7) ? 8388608 : 4194304;
        } else {
            zy7Var7 = zy7Var4;
        }
        if (e18Var2.Q(i2 & 1, (4793491 & i2) != 4793490)) {
            int i3 = i2 & 14;
            zy7 zy7Var8 = zy7Var7;
            zy7 zy7Var9 = zy7Var6;
            e18Var = e18Var2;
            mwa.l(rweVar, null, csg.q(rweVar, e18Var2, i3 | 384), fd9.q0(-2065389730, new zd8(rweVar, ml3Var, zy7Var5, zy7Var8, zy7Var9, pz7Var, zy7Var3, bz7Var, 2), e18Var2), e18Var, i3 | 3072, 2);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new we((Object) rweVar, (Object) ml3Var, zy7Var, (Object) zy7Var2, (qz7) bz7Var, (qz7) pz7Var, (Object) zy7Var3, (Object) zy7Var4, i, 5);
        }
    }
}
