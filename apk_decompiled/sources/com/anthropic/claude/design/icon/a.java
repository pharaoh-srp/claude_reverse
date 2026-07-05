package com.anthropic.claude.design.icon;

import android.content.res.Resources;
import defpackage.bpc;
import defpackage.cz5;
import defpackage.e18;
import defpackage.jd4;
import defpackage.kgh;
import defpackage.ld4;
import defpackage.p59;
import defpackage.u00;
import defpackage.ud0;
import defpackage.vd0;
import defpackage.ve4;
import defpackage.w00;
import defpackage.wd0;
import defpackage.xd0;
import defpackage.yd0;
import defpackage.zd0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final bpc a(ud0 ud0Var, ld4 ld4Var) {
        bpc bpcVarD;
        ud0Var.getClass();
        int i = ud0Var.b;
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(-1976919778);
        xd0 xd0Var = (xd0) e18Var.j(yd0.a);
        if (xd0Var == null) {
            xd0Var = ((Boolean) e18Var.j(p59.a)).booleanValue() ? xd0.F : (xd0) zd0.a.getValue();
        }
        int iOrdinal = xd0Var.ordinal();
        if (iOrdinal == 0) {
            e18Var.a0(-1825254910);
            bpcVarD = u00.D(i, 0, e18Var);
            e18Var.p(false);
        } else {
            if (iOrdinal != 1) {
                throw kgh.s(e18Var, -1444354196, false);
            }
            e18Var.a0(-1444350110);
            e18Var.p(false);
            vd0 vd0VarA = wd0.a(ud0Var);
            if (vd0VarA != null) {
                e18Var.a0(-1444349202);
                e18Var.p(false);
                Resources resources = (Resources) e18Var.j(w00.c);
                float fQ0 = ((cz5) e18Var.j(ve4.h)).q0(24.0f);
                boolean zG = e18Var.g(ud0Var.c) | e18Var.f(vd0VarA) | e18Var.c(fQ0);
                Object objN = e18Var.N();
                if (zG || objN == jd4.a) {
                    objN = new GlyphPainter(vd0VarA.a(), resources, fQ0, ud0Var.c, vd0VarA.b());
                    e18Var.k0(objN);
                }
                GlyphPainter glyphPainter = (GlyphPainter) objN;
                e18Var.p(false);
                return glyphPainter;
            }
            e18Var.a0(-1825138846);
            bpcVarD = u00.D(i, 0, e18Var);
            e18Var.p(false);
        }
        e18Var.p(false);
        return bpcVarD;
    }
}
