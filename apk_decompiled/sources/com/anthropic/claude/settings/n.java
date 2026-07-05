package com.anthropic.claude.settings;

import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.bz7;
import defpackage.ce8;
import defpackage.csg;
import defpackage.cz2;
import defpackage.d4c;
import defpackage.di;
import defpackage.e18;
import defpackage.fd9;
import defpackage.gm3;
import defpackage.gr9;
import defpackage.hm;
import defpackage.iuj;
import defpackage.izf;
import defpackage.jce;
import defpackage.jd4;
import defpackage.jo8;
import defpackage.kce;
import defpackage.ld4;
import defpackage.lxf;
import defpackage.lz1;
import defpackage.m7f;
import defpackage.ml3;
import defpackage.nwb;
import defpackage.oq5;
import defpackage.qf2;
import defpackage.qi3;
import defpackage.qnc;
import defpackage.r7e;
import defpackage.rn;
import defpackage.rrk;
import defpackage.rwe;
import defpackage.sq6;
import defpackage.ssj;
import defpackage.su;
import defpackage.t24;
import defpackage.ta4;
import defpackage.tp4;
import defpackage.ybg;
import defpackage.ztf;
import defpackage.zy7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n {
    public static final qnc a = new qnc(24.0f, 8.0f, 28.0f, 8.0f);

    public static final void a(rwe rweVar, ml3 ml3Var, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, boolean z, izf izfVar, qi3 qi3Var, ld4 ld4Var, int i) {
        izf izfVar2;
        qi3 qi3Var2;
        int i2;
        izf izfVar3;
        qi3 qi3Var3;
        nwb nwbVar;
        e18 e18Var;
        tp4 tp4Var;
        zy7Var.getClass();
        zy7Var2.getClass();
        zy7Var3.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(24868668);
        int i3 = i | (e18Var2.f(rweVar) ? 4 : 2) | (e18Var2.f(ml3Var) ? 32 : 16) | (e18Var2.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var2.h(zy7Var3) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var2.g(z) ? 131072 : 65536) | 4718592;
        if (e18Var2.Q(i3 & 1, (4793491 & i3) != 4793490)) {
            e18Var2.V();
            int i4 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i4 == 0 || e18Var2.A()) {
                m7f m7fVar = (m7f) e18Var2.j(gr9.b);
                boolean zH = e18Var2.h(m7fVar);
                Object objN = e18Var2.N();
                if (zH || objN == lz1Var) {
                    objN = new di(m7fVar, 29);
                    e18Var2.k0(objN);
                }
                kce kceVar = jce.a;
                izf izfVar4 = (izf) fd9.r0(kceVar.b(izf.class), oq5.B(kceVar.b(izf.class)), (bz7) objN, e18Var2);
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN2 = e18Var2.N();
                if (zF || objN2 == lz1Var) {
                    objN2 = m7fVarN.a(kceVar.b(qi3.class), null, null);
                    e18Var2.k0(objN2);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                i2 = i3 & (-33030145);
                izfVar3 = izfVar4;
                qi3Var3 = (qi3) objN2;
            } else {
                e18Var2.T();
                i2 = i3 & (-33030145);
                izfVar3 = izfVar;
                qi3Var3 = qi3Var;
            }
            int i5 = i2;
            e18Var2.q();
            Object[] objArr = new Object[0];
            int i6 = i5 & 458752;
            boolean z2 = i6 == 131072;
            Object objN3 = e18Var2.N();
            if (z2 || objN3 == lz1Var) {
                objN3 = new cz2(z, 3);
                e18Var2.k0(objN3);
            }
            nwb nwbVar2 = (nwb) iuj.I(objArr, (zy7) objN3, e18Var2, 0);
            Object[] objArr2 = new Object[0];
            boolean z3 = i6 == 131072;
            Object objN4 = e18Var2.N();
            if (z3 || objN4 == lz1Var) {
                objN4 = new cz2(z, 4);
                e18Var2.k0(objN4);
            }
            nwb nwbVar3 = (nwb) iuj.I(objArr2, (zy7) objN4, e18Var2, 0);
            if (((Boolean) nwbVar2.getValue()).booleanValue()) {
                e18Var2.a0(2128782551);
                ce8 ce8Var = (ce8) nwbVar3.getValue();
                boolean zF2 = e18Var2.f(nwbVar2);
                Object objN5 = e18Var2.N();
                if (zF2 || objN5 == lz1Var) {
                    objN5 = new lxf(2, nwbVar2);
                    e18Var2.k0(objN5);
                }
                nwbVar = nwbVar2;
                tp4Var = null;
                rrk.c(ce8Var, (zy7) objN5, null, null, null, e18Var2, 0);
                e18Var = e18Var2;
                e18Var.p(false);
            } else {
                nwbVar = nwbVar2;
                e18Var = e18Var2;
                tp4Var = null;
                e18Var.a0(2128919974);
                e18Var.p(false);
            }
            boolean zF3 = e18Var.f(izfVar3);
            Object objN6 = e18Var.N();
            if (zF3 || objN6 == lz1Var) {
                objN6 = new hm(izfVar3, tp4Var, 5);
                e18Var.k0(objN6);
            }
            csg.g((bz7) objN6, e18Var, 0, 1);
            Object[] objArr3 = new Object[0];
            Object objN7 = e18Var.N();
            int i7 = 23;
            if (objN7 == lz1Var) {
                objN7 = new ztf(i7);
                e18Var.k0(objN7);
            }
            nwb nwbVar4 = (nwb) iuj.I(objArr3, (zy7) objN7, e18Var, 48);
            Object objN8 = e18Var.N();
            if (objN8 == lz1Var) {
                objN8 = sq6.p(e18Var);
            }
            ybg ybgVar = (ybg) objN8;
            String strJ0 = d4c.j0(R.string.title_settings, e18Var);
            ta4 ta4VarQ0 = fd9.q0(-2129691285, new jo8(rweVar, 2), e18Var);
            ta4 ta4VarQ02 = fd9.q0(-586193614, new rn(ybgVar, 23), e18Var);
            qnc qncVar = qf2.a;
            long j = gm3.a(e18Var).o;
            e18 e18Var3 = e18Var;
            qi3 qi3Var4 = qi3Var3;
            izf izfVar5 = izfVar3;
            ta4 ta4VarQ03 = fd9.q0(-976001523, new t24(izfVar5, ybgVar, nwbVar4, nwbVar3, nwbVar, qi3Var4, zy7Var, rweVar, zy7Var2, zy7Var3), e18Var3);
            int i8 = ml3.f;
            ssj.b(strJ0, ml3Var, null, ta4VarQ0, ta4VarQ02, j, ta4VarQ03, e18Var3, 1600512 | (i5 & 112));
            e18Var2 = e18Var3;
            izfVar2 = izfVar5;
            qi3Var2 = qi3Var4;
        } else {
            e18Var2.T();
            izfVar2 = izfVar;
            qi3Var2 = qi3Var;
        }
        r7e r7eVarS = e18Var2.s();
        if (r7eVarS != null) {
            r7eVarS.d = new su(rweVar, ml3Var, zy7Var, zy7Var2, zy7Var3, z, izfVar2, qi3Var2, i);
        }
    }
}
