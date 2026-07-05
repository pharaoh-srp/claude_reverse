package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tf3 {
    public static final nf3 a = new nf3(ayg.a);
    public static final float b = 1000.0f;

    public static final void a(final ta4 ta4Var, final tkh tkhVar, final long j, final long j2, final long j3, final float f, final go0 go0Var, final mnc mncVar, final yig yigVar, final yig yigVar2, final yig yigVar3, final yig yigVar4, ld4 ld4Var, final int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1255048750);
        int i2 = i | (e18Var.h(ta4Var) ? 4 : 2) | (e18Var.f(tkhVar) ? 32 : 16) | (e18Var.e(j) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(null) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(null) ? 16384 : 8192) | (e18Var.h(null) ? 131072 : 65536) | (e18Var.e(j2) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var.e(j3) ? 8388608 : 4194304) | (e18Var.c(f) ? 67108864 : 33554432) | (e18Var.f(go0Var) ? 536870912 : 268435456);
        if (e18Var.Q(i2 & 1, ((i2 & 306783379) == 306783378 && ((((((e18Var.f(mncVar) ? (char) 4 : (char) 2) | (e18Var.h(yigVar) ? ' ' : (char) 16)) | (e18Var.h(yigVar2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC)) | (e18Var.h(yigVar3) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE)) | (e18Var.h(yigVar4) ? (char) 16384 : (char) 8192)) & 9363) == 9362) ? false : true)) {
            j8.d(new hvd[]{sq6.m(j, on4.a), tjh.a.a(tkhVar)}, fd9.q0(-881676654, new pz7() { // from class: rf3
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ld4 ld4Var2 = (ld4) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    e18 e18Var2 = (e18) ld4Var2;
                    if (e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        float f2 = tf3.b;
                        fqb fqbVar = fqb.E;
                        iqb iqbVarI = gb9.I(b.b(b.v(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, f2, 1), MTTypesetterKt.kLineSkipLimitMultiplier, f, 1), mncVar);
                        wo1 wo1Var = lja.Q;
                        cxe cxeVarA = axe.a(go0Var, wo1Var, e18Var2, 48);
                        int iHashCode = Long.hashCode(e18Var2.T);
                        hyc hycVarL = e18Var2.l();
                        iqb iqbVarE = kxk.E(e18Var2, iqbVarI);
                        dd4.e.getClass();
                        re4 re4Var = cd4.b;
                        e18Var2.e0();
                        if (e18Var2.S) {
                            e18Var2.k(re4Var);
                        } else {
                            e18Var2.n0();
                        }
                        z80 z80Var = cd4.f;
                        d4c.i0(e18Var2, z80Var, cxeVarA);
                        z80 z80Var2 = cd4.e;
                        d4c.i0(e18Var2, z80Var2, hycVarL);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        z80 z80Var3 = cd4.g;
                        d4c.i0(e18Var2, z80Var3, numValueOf);
                        bx bxVar = cd4.h;
                        d4c.h0(e18Var2, bxVar);
                        z80 z80Var4 = cd4.d;
                        d4c.i0(e18Var2, z80Var4, iqbVarE);
                        xo1 xo1Var = lja.G;
                        o5b o5bVarD = dw1.d(xo1Var, false);
                        int iHashCode2 = Long.hashCode(e18Var2.T);
                        hyc hycVarL2 = e18Var2.l();
                        iqb iqbVarE2 = kxk.E(e18Var2, fqbVar);
                        e18Var2.e0();
                        if (e18Var2.S) {
                            e18Var2.k(re4Var);
                        } else {
                            e18Var2.n0();
                        }
                        d4c.i0(e18Var2, z80Var, o5bVarD);
                        d4c.i0(e18Var2, z80Var2, hycVarL2);
                        ij0.t(iHashCode2, e18Var2, z80Var3, e18Var2, bxVar);
                        d4c.i0(e18Var2, z80Var4, iqbVarE2);
                        vo1 vo1Var = lja.S;
                        yig yigVar5 = yigVar3;
                        wp6 wp6VarA = gp6.a(yigVar5, vo1Var, 12);
                        yig yigVar6 = yigVar;
                        wp6 wp6VarA2 = wp6VarA.a(gp6.e(yigVar6, 2));
                        yig yigVar7 = yigVar4;
                        d77 d77VarI = gp6.i(yigVar7, vo1Var, 12);
                        yig yigVar8 = yigVar2;
                        d77 d77VarA = d77VarI.a(gp6.f(yigVar8, 2));
                        ta4 ta4VarQ0 = fd9.q0(-181659180, new p6(j2, 11), e18Var2);
                        fxe fxeVar = fxe.a;
                        wd6.K(fxeVar, false, null, wp6VarA2, d77VarA, null, ta4VarQ0, e18Var2, 1572870, 18);
                        ij0.r(MTTypesetterKt.kLineSkipLimitMultiplier, -37113233, e18Var2, e18Var2, fqbVar);
                        e18Var2.p(false);
                        e18Var2.p(true);
                        iqb iqbVarA = fxeVar.a(fqbVar, 1.0f, false);
                        cxe cxeVarA2 = axe.a(ko0.a, wo1Var, e18Var2, 54);
                        int iHashCode3 = Long.hashCode(e18Var2.T);
                        hyc hycVarL3 = e18Var2.l();
                        iqb iqbVarE3 = kxk.E(e18Var2, iqbVarA);
                        e18Var2.e0();
                        if (e18Var2.S) {
                            e18Var2.k(re4Var);
                        } else {
                            e18Var2.n0();
                        }
                        d4c.i0(e18Var2, z80Var, cxeVarA2);
                        d4c.i0(e18Var2, z80Var2, hycVarL3);
                        ij0.t(iHashCode3, e18Var2, z80Var3, e18Var2, bxVar);
                        d4c.i0(e18Var2, z80Var4, iqbVarE3);
                        vb7.y(0, ta4Var, e18Var2, true);
                        o5b o5bVarD2 = dw1.d(xo1Var, false);
                        int iHashCode4 = Long.hashCode(e18Var2.T);
                        hyc hycVarL4 = e18Var2.l();
                        iqb iqbVarE4 = kxk.E(e18Var2, fqbVar);
                        e18Var2.e0();
                        if (e18Var2.S) {
                            e18Var2.k(re4Var);
                        } else {
                            e18Var2.n0();
                        }
                        d4c.i0(e18Var2, z80Var, o5bVarD2);
                        d4c.i0(e18Var2, z80Var2, hycVarL4);
                        ij0.t(iHashCode4, e18Var2, z80Var3, e18Var2, bxVar);
                        d4c.i0(e18Var2, z80Var4, iqbVarE4);
                        vo1 vo1Var2 = lja.U;
                        wd6.K(fxeVar, false, null, gp6.a(yigVar5, vo1Var2, 12).a(gp6.e(yigVar6, 2)), gp6.i(yigVar7, vo1Var2, 12).a(gp6.f(yigVar8, 2)), null, fd9.q0(-1090690805, new p6(j3, 12), e18Var2), e18Var2, 1572870, 18);
                        ij0.r(MTTypesetterKt.kLineSkipLimitMultiplier, -1514776840, e18Var2, e18Var2, fqbVar);
                        ij0.w(e18Var2, false, true, true);
                    } else {
                        e18Var2.T();
                    }
                    return iei.a;
                }
            }, e18Var), e18Var, 56);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(tkhVar, j, j2, j3, f, go0Var, mncVar, yigVar, yigVar2, yigVar3, yigVar4, i) { // from class: sf3
                public final /* synthetic */ tkh F;
                public final /* synthetic */ long G;
                public final /* synthetic */ long H;
                public final /* synthetic */ long I;
                public final /* synthetic */ float J;
                public final /* synthetic */ go0 K;
                public final /* synthetic */ mnc L;
                public final /* synthetic */ yig M;
                public final /* synthetic */ yig N;
                public final /* synthetic */ yig O;
                public final /* synthetic */ yig P;

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(1);
                    tf3.a(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    public static final void b(final boolean z, final zy7 zy7Var, final ta4 ta4Var, iqb iqbVar, boolean z2, final e0g e0gVar, final pgf pgfVar, qgf qgfVar, go0 go0Var, mnc mncVar, ld4 ld4Var, final int i) {
        final iqb iqbVar2;
        final boolean z3;
        final qgf qgfVar2;
        final go0 go0Var2;
        final mnc mncVar2;
        int i2;
        mnc mncVar3;
        iqb iqbVar3;
        go0 go0Var3;
        qgf qgfVar3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1397270225);
        int i3 = i | (e18Var.g(z) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16) | 1797120 | (e18Var.f(e0gVar) ? 8388608 : 4194304) | (e18Var.f(pgfVar) ? 67108864 : 33554432) | 268435456;
        boolean z4 = true;
        if (e18Var.Q(i3 & 1, (306783379 & i3) != 306783378)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                float f = yk7.a;
                qgf qgfVar4 = new qgf(ne5.j, ne5.o, ne5.m, ne5.n, ne5.i);
                i2 = i3 & (-1879048193);
                mncVar3 = yk7.b;
                iqbVar3 = fqb.E;
                go0Var3 = a;
                qgfVar3 = qgfVar4;
            } else {
                e18Var.T();
                i2 = i3 & (-1879048193);
                iqbVar3 = iqbVar;
                z4 = z2;
                qgfVar3 = qgfVar;
                go0Var3 = go0Var;
                mncVar3 = mncVar;
            }
            e18Var.q();
            tkh tkhVarA = bci.a(ne5.r, e18Var);
            float f2 = yk7.a;
            c(z, iqbVar3, zy7Var, z4, ta4Var, tkhVarA, e0gVar, pgfVar, qgfVar3, 32.0f, go0Var3, mncVar3, e18Var, (i2 & 14) | 12582960 | ((i2 << 3) & 896) | 102263808 | ((i2 << 6) & 1879048192), ((i2 >> 24) & 14) | 1772928);
            iqbVar2 = iqbVar3;
            z3 = z4;
            qgfVar2 = qgfVar3;
            go0Var2 = go0Var3;
            mncVar2 = mncVar3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            z3 = z2;
            qgfVar2 = qgfVar;
            go0Var2 = go0Var;
            mncVar2 = mncVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(z, zy7Var, ta4Var, iqbVar2, z3, e0gVar, pgfVar, qgfVar2, go0Var2, mncVar2, i) { // from class: of3
                public final /* synthetic */ boolean E;
                public final /* synthetic */ zy7 F;
                public final /* synthetic */ ta4 G;
                public final /* synthetic */ iqb H;
                public final /* synthetic */ boolean I;
                public final /* synthetic */ e0g J;
                public final /* synthetic */ pgf K;
                public final /* synthetic */ qgf L;
                public final /* synthetic */ go0 M;
                public final /* synthetic */ mnc N;

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(385);
                    tf3.b(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    public static final void c(final boolean z, final iqb iqbVar, final zy7 zy7Var, final boolean z2, final ta4 ta4Var, final tkh tkhVar, final e0g e0gVar, final pgf pgfVar, final qgf qgfVar, final float f, final go0 go0Var, final mnc mncVar, ld4 ld4Var, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        zub zubVar;
        nwb nwbVar;
        a80 a80Var;
        boolean z3;
        qu1 qu1Var;
        nb0 nb0Var;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(400616238);
        if ((i & 6) == 0) {
            i3 = (e18Var.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i6 = i & 3072;
        int i7 = FreeTypeConstants.FT_LOAD_NO_RECURSE;
        if (i6 == 0) {
            i3 |= e18Var.g(z2) ? 2048 : 1024;
        }
        int i8 = i & 24576;
        int i9 = FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        if (i8 == 0) {
            i3 |= e18Var.h(ta4Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= e18Var.f(tkhVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= e18Var.h(null) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= e18Var.h(null) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= e18Var.h(null) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= e18Var.f(e0gVar) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (e18Var.f(pgfVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= e18Var.f(qgfVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= e18Var.f(null) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i2 & 3072) == 0) {
            if (e18Var.c(f)) {
                i7 = 2048;
            }
            i4 |= i7;
        }
        if ((i2 & 24576) == 0) {
            if (e18Var.f(go0Var)) {
                i9 = 16384;
            }
            i4 |= i9;
        }
        if ((i2 & 196608) == 0) {
            i4 |= e18Var.f(mncVar) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= e18Var.f(null) ? 1048576 : 524288;
        }
        int i10 = i3;
        if (e18Var.Q(i10 & 1, ((306783379 & i3) == 306783378 && (i4 & 599187) == 599186) ? false : true)) {
            e18Var.V();
            if ((i & 1) != 0 && !e18Var.A()) {
                e18Var.T();
            }
            e18Var.q();
            e18Var.a0(-955061811);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = vb7.f(e18Var);
            }
            zub zubVar2 = (zub) objN;
            e18Var.p(false);
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new it2(16);
                e18Var.k0(objN2);
            }
            iqb iqbVarB = tjf.b(iqbVar, false, (bz7) objN2);
            long j = !z2 ? z ? pgfVar.j : pgfVar.e : !z ? pgfVar.a : pgfVar.i;
            float f2 = MTTypesetterKt.kLineSkipLimitMultiplier;
            if (qgfVar == null) {
                e18Var.a0(-954746232);
                e18Var.p(false);
                zubVar = zubVar2;
                nb0Var = null;
                qu1Var = null;
            } else {
                e18Var.a0(-1554818919);
                int i11 = ((i10 >> 9) & 14) | ((i4 << 3) & 896);
                Object objN3 = e18Var.N();
                if (objN3 == lz1Var) {
                    objN3 = new kdg();
                    e18Var.k0(objN3);
                }
                kdg kdgVar = (kdg) objN3;
                Object objN4 = e18Var.N();
                if (objN4 == lz1Var) {
                    objN4 = mpk.P(null);
                    e18Var.k0(objN4);
                }
                nwb nwbVar2 = (nwb) objN4;
                boolean zF = e18Var.f(zubVar2);
                Object objN5 = e18Var.N();
                if (zF || objN5 == lz1Var) {
                    i5 = i11;
                    objN5 = new pc2(zubVar2, kdgVar, null, 1);
                    e18Var.k0(objN5);
                } else {
                    i5 = i11;
                }
                fd9.i(e18Var, (pz7) objN5, zubVar2);
                v79 v79Var = (v79) w44.V0(kdgVar);
                float f3 = !z2 ? 0.0f : v79Var instanceof odd ? qgfVar.b : v79Var instanceof lp8 ? qgfVar.d : v79Var instanceof ks7 ? qgfVar.c : v79Var instanceof ad6 ? qgfVar.e : qgfVar.a;
                Object objN6 = e18Var.N();
                if (objN6 == lz1Var) {
                    zubVar = zubVar2;
                    nwbVar = nwbVar2;
                    objN6 = new a80(new va6(f3), dgj.h, null, 12);
                    e18Var.k0(objN6);
                } else {
                    zubVar = zubVar2;
                    nwbVar = nwbVar2;
                }
                a80 a80Var2 = (a80) objN6;
                va6 va6Var = new va6(f3);
                boolean zH = e18Var.h(a80Var2) | e18Var.c(f3) | ((((i5 & 14) ^ 6) > 4 && e18Var.g(z2)) || (i5 & 6) == 4) | e18Var.h(v79Var);
                Object objN7 = e18Var.N();
                if (zH || objN7 == lz1Var) {
                    a80Var = a80Var2;
                    z3 = false;
                    qu1Var = null;
                    qc2 qc2Var = new qc2(a80Var, f3, z2, v79Var, nwbVar, (tp4) null);
                    e18Var.k0(qc2Var);
                    objN7 = qc2Var;
                } else {
                    a80Var = a80Var2;
                    z3 = false;
                    qu1Var = null;
                }
                fd9.i(e18Var, (pz7) objN7, va6Var);
                nb0Var = a80Var.c;
                e18Var.p(z3);
            }
            if (nb0Var != null) {
                f2 = ((va6) nb0Var.F.getValue()).E;
            }
            pzg.b(z, zy7Var, iqbVarB, z2, e0gVar, j, 0L, f2, qu1Var, zubVar, fd9.q0(-1320468520, new pz7() { // from class: pf3
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ld4 ld4Var2 = (ld4) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    e18 e18Var2 = (e18) ld4Var2;
                    if (e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        pgf pgfVar2 = pgfVar;
                        boolean z4 = z2;
                        boolean z5 = z;
                        tf3.a(ta4Var, tkhVar, !z4 ? pgfVar2.f : !z5 ? pgfVar2.b : pgfVar2.k, !z4 ? pgfVar2.g : !z5 ? pgfVar2.c : pgfVar2.l, !z4 ? pgfVar2.h : !z5 ? pgfVar2.d : pgfVar2.m, f, go0Var, mncVar, u00.P(asb.I, e18Var2), u00.P(asb.H, e18Var2), u00.P(asb.F, e18Var2), u00.P(asb.G, e18Var2), e18Var2, 0);
                    } else {
                        e18Var2.T();
                    }
                    return iei.a;
                }
            }, e18Var), e18Var, (i10 & 14) | ((i10 >> 3) & 112) | (i10 & 7168) | ((i10 >> 15) & 57344) | ((i4 << 21) & 1879048192), 192);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: qf3
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(i | 1);
                    int iP02 = x44.p0(i2);
                    tf3.c(z, iqbVar, zy7Var, z2, ta4Var, tkhVar, e0gVar, pgfVar, qgfVar, f, go0Var, mncVar, (ld4) obj, iP0, iP02);
                    return iei.a;
                }
            };
        }
    }
}
