package com.anthropic.claude.chat.bottomsheet.options;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.bz7;
import defpackage.e18;
import defpackage.f03;
import defpackage.fd9;
import defpackage.fqb;
import defpackage.g03;
import defpackage.gr9;
import defpackage.hi4;
import defpackage.hw2;
import defpackage.iqb;
import defpackage.j03;
import defpackage.jce;
import defpackage.jd4;
import defpackage.kce;
import defpackage.kx2;
import defpackage.ld4;
import defpackage.lz1;
import defpackage.m7f;
import defpackage.oq5;
import defpackage.qi3;
import defpackage.qwe;
import defpackage.r7e;
import defpackage.sq6;
import defpackage.t4g;
import defpackage.t53;
import defpackage.zy7;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final void a(t53 t53Var, hw2 hw2Var, t4g t4gVar, hi4 hi4Var, zy7 zy7Var, iqb iqbVar, f03 f03Var, qi3 qi3Var, ld4 ld4Var, int i) {
        iqb iqbVar2;
        f03 f03Var2;
        qi3 qi3Var2;
        int i2;
        qi3 qi3Var3;
        iqb iqbVar3;
        f03 f03Var3;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1084817009);
        int i3 = i | (e18Var.f(t53Var) ? 4 : 2) | (e18Var.h(hw2Var) ? 32 : 16) | (e18Var.f(t4gVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(hi4Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(zy7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | 4915200;
        if (e18Var.Q(i3 & 1, (4793491 & i3) != 4793490)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                m7f m7fVar = (m7f) e18Var.j(gr9.b);
                boolean zH = e18Var.h(m7fVar);
                Object objN = e18Var.N();
                lz1 lz1Var = jd4.a;
                if (zH || objN == lz1Var) {
                    objN = new g03(m7fVar, 0);
                    e18Var.k0(objN);
                }
                kce kceVar = jce.a;
                f03 f03Var4 = (f03) fd9.r0(kceVar.b(f03.class), oq5.B(kceVar.b(f03.class)), (bz7) objN, e18Var);
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN2 = e18Var.N();
                if (zF || objN2 == lz1Var) {
                    objN2 = m7fVarN.a(kceVar.b(qi3.class), null, null);
                    e18Var.k0(objN2);
                }
                e18Var.p(false);
                e18Var.p(false);
                i2 = i3 & (-33030145);
                qi3Var3 = (qi3) objN2;
                iqbVar3 = fqb.E;
                f03Var3 = f03Var4;
            } else {
                e18Var.T();
                i2 = i3 & (-33030145);
                iqbVar3 = iqbVar;
                f03Var3 = f03Var;
                qi3Var3 = qi3Var;
            }
            e18Var.q();
            qwe.a(t4gVar, iqbVar3, null, false, f03Var3.l, new kx2(t4gVar, f03Var3, t53Var, qi3Var3, hw2Var, zy7Var, hi4Var), e18Var, ((i2 >> 6) & 14) | 48, 12);
            iqbVar2 = iqbVar3;
            f03Var2 = f03Var3;
            qi3Var2 = qi3Var3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            f03Var2 = f03Var;
            qi3Var2 = qi3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new j03(t53Var, hw2Var, t4gVar, hi4Var, zy7Var, iqbVar2, f03Var2, qi3Var2, i, 0);
        }
    }
}
