package defpackage;

import com.anthropic.claude.chatlist.all.bottomsheet.AllChatsListBottomSheetDestination;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gv {
    public static final void a(lu luVar, mnc mncVar, x0a x0aVar, f77 f77Var, pz7 pz7Var, bz7 bz7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        x0a x0aVar2;
        pz7 pz7Var2;
        e18 e18Var;
        iqb iqbVar2;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1147603861);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(luVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.f(mncVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            x0aVar2 = x0aVar;
            i2 |= e18Var2.f(x0aVar2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            x0aVar2 = x0aVar;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0 ? e18Var2.f(f77Var) : e18Var2.h(f77Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            pz7Var2 = pz7Var;
            i2 |= e18Var2.h(pz7Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        } else {
            pz7Var2 = pz7Var;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var2.h(bz7Var) ? 131072 : 65536;
        }
        int i3 = 1572864 | i2;
        if (e18Var2.Q(i3 & 1, (599187 & i3) != 599186)) {
            mxd mxdVarD = fxd.d(e18Var2);
            boolean zBooleanValue = ((Boolean) luVar.d.i.getValue()).booleanValue();
            boolean z = (i3 & 14) == 4;
            Object objN = e18Var2.N();
            if (z || objN == jd4.a) {
                objN = new gu(luVar, 7);
                e18Var2.k0(objN);
            }
            e18Var = e18Var2;
            fqb fqbVar = fqb.E;
            iuj.c(zBooleanValue, (zy7) objN, fqbVar, mxdVarD, fd9.q0(307767014, new ye(luVar, mncVar, mxdVarD, 3), e18Var2), null, fd9.q0(-1468308060, new gn((Object) luVar, (Object) f77Var, (Object) x0aVar2, (Object) pz7Var2, bz7Var, (Object) mncVar, 2), e18Var2), e18Var, ((i3 >> 12) & 896) | 1597440, 32);
            iqbVar2 = fqbVar;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new yu(luVar, mncVar, x0aVar, f77Var, pz7Var, bz7Var, iqbVar2, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(ml3 ml3Var, boolean z, pz7 pz7Var, zy7 zy7Var, bz7 bz7Var, iqb iqbVar, lu luVar, qi3 qi3Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        lu luVar2;
        qi3 qi3Var2;
        qi3 qi3Var3;
        lu luVar3;
        jse jseVar;
        pz7Var.getClass();
        zy7Var.getClass();
        bz7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(508665024);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var2.f(ml3Var) : e18Var2.h(ml3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.h(pz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.h(bz7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var2.f(iqbVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= 4194304;
        }
        int i3 = 0;
        if (e18Var2.Q(i2 & 1, (4793491 & i2) != 4793490)) {
            e18Var2.V();
            int i4 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i4 == 0 || e18Var2.A()) {
                yn8 yn8VarK = u00.K(e18Var2);
                m7f m7fVar = (m7f) e18Var2.j(gr9.b);
                boolean zF = e18Var2.f(yn8VarK) | e18Var2.h(m7fVar);
                Object objN = e18Var2.N();
                if (zF || objN == lz1Var) {
                    objN = new l0(yn8VarK, 9, m7fVar);
                    e18Var2.k0(objN);
                }
                kce kceVar = jce.a;
                lu luVar4 = (lu) fd9.r0(kceVar.b(lu.class), oq5.B(kceVar.b(lu.class)), (bz7) objN, e18Var2);
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF2 = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN2 = e18Var2.N();
                if (zF2 || objN2 == lz1Var) {
                    objN2 = m7fVarN.a(kceVar.b(qi3.class), null, null);
                    e18Var2.k0(objN2);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                qi3Var3 = (qi3) objN2;
                luVar3 = luVar4;
            } else {
                e18Var2.T();
                luVar3 = luVar;
                qi3Var3 = qi3Var;
            }
            e18Var2.q();
            Object objN3 = e18Var2.N();
            if (objN3 == lz1Var) {
                objN3 = new b5(17);
                e18Var2.k0(objN3);
            }
            zy7 zy7Var2 = (zy7) objN3;
            kce kceVar2 = jce.a;
            rwe rweVarP = eve.P(kceVar2.b(AllChatsListBottomSheetDestination.class), oq5.B(kceVar2.b(AllChatsListBottomSheetDestination.class)), true, iv1.M(kceVar2.b(AllChatsListBottomSheetDestination.class)), zy7Var2, e18Var2);
            x44.q0(rweVarP, e18Var2);
            boolean zH = e18Var2.h(qi3Var3) | e18Var2.f(luVar3);
            Object objN4 = e18Var2.N();
            if (zH || objN4 == lz1Var) {
                jseVar = null;
                objN4 = new dv((Object) qi3Var3, (Object) luVar3, (tp4) (0 == true ? 1 : 0), i3);
                e18Var2.k0(objN4);
            } else {
                jseVar = null;
            }
            int i5 = 1;
            csg.g((bz7) objN4, e18Var2, 0, 1);
            tnk.c(jseVar, e18Var2, 0);
            boolean zF3 = e18Var2.f(luVar3);
            Object objN5 = e18Var2.N();
            if (zF3 || objN5 == lz1Var) {
                objN5 = new zu(luVar3, i5);
                e18Var2.k0(objN5);
            }
            mwa.d(luVar3, null, (bz7) objN5, e18Var2, 0);
            lu luVar5 = luVar3;
            qi3 qi3Var4 = qi3Var3;
            e18Var = e18Var2;
            olh.a(false, null, null, fd9.q0(2026578723, new g7(luVar5, iqbVar, rweVarP, ml3Var, z, qi3Var4, zy7Var, pz7Var, bz7Var), e18Var), e18Var, 3072, 7);
            qi3Var2 = qi3Var4;
            luVar2 = luVar5;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            luVar2 = luVar;
            qi3Var2 = qi3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pq(ml3Var, z, pz7Var, zy7Var, bz7Var, iqbVar, luVar2, qi3Var2, i);
        }
    }
}
