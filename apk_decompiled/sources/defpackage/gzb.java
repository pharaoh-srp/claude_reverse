package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class gzb {
    public static final /* synthetic */ int a = 0;

    static {
        if ((6 & 4) != 0) {
            ad5 ad5Var = wi6.a;
        }
    }

    public static final void a(of6 of6Var, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        nf6 nf6Var;
        Object dzbVar;
        lz1 lz1Var;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-383087355);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(of6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(ta4Var) ? 32 : 16;
        }
        int i3 = i2;
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            Object objN = e18Var.N();
            lz1 lz1Var2 = jd4.a;
            if (objN == lz1Var2) {
                objN = new nf6();
                e18Var.k0(objN);
            }
            nf6 nf6Var2 = (nf6) objN;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var2) {
                objN2 = fd9.O(im6.E, e18Var);
                e18Var.k0(objN2);
            }
            l45 l45Var = (l45) objN2;
            boolean z = e18Var.j(ve4.n) == fu9.F;
            aae aaeVar = new aae();
            aae aaeVar2 = new aae();
            aae aaeVar3 = new aae();
            cz5 cz5Var = (cz5) e18Var.j(ve4.h);
            aaeVar.E = cz5Var.q0(12.0f);
            aaeVar2.E = cz5Var.q0(24.0f);
            aaeVar3.E = cz5Var.q0(48.0f);
            boolean zB = of6Var.b();
            int i4 = i3 & 14;
            boolean zG = e18Var.g(z) | e18Var.c(aaeVar.E) | e18Var.c(aaeVar2.E) | e18Var.c(aaeVar3.E) | e18Var.h(l45Var) | (i4 == 4);
            Object objN3 = e18Var.N();
            if (zG || objN3 == lz1Var2) {
                nf6Var = nf6Var2;
                lz1Var = lz1Var2;
                dzbVar = new dzb(nf6Var, l45Var, of6Var, z, aaeVar, aaeVar2, aaeVar3, null);
                e18Var.k0(dzbVar);
            } else {
                nf6Var = nf6Var2;
                dzbVar = objN3;
                lz1Var = lz1Var2;
            }
            zni.h(zB, (pz7) dzbVar, e18Var, 0);
            Boolean boolValueOf = Boolean.valueOf(((og6) of6Var.b.p()) == og6.E);
            boolean z2 = i4 == 4;
            Object objN4 = e18Var.N();
            if (z2 || objN4 == lz1Var) {
                objN4 = new ab0(of6Var, nf6Var, null, 14);
                e18Var.k0(objN4);
            }
            fd9.i(e18Var, (pz7) objN4, boolValueOf);
            ta4Var.invoke(nf6Var, e18Var, Integer.valueOf((i3 & 112) | 6));
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new kb2(of6Var, ta4Var, i, 11);
        }
    }

    public static final void b(final nf6 nf6Var, final wbj wbjVar, final iqb iqbVar, final e0g e0gVar, final long j, final long j2, final to7 to7Var, final ta4 ta4Var, ld4 ld4Var, final int i) {
        int i2;
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1560288494);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(nf6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.f(wbjVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.f(e0gVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.e(j) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var2.e(j2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var2.c(MTTypesetterKt.kLineSkipLimitMultiplier) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= (16777216 & i) == 0 ? e18Var2.f(to7Var) : e18Var2.h(to7Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= e18Var2.h(ta4Var) ? 67108864 : 33554432;
        }
        int i3 = i2;
        int i4 = 1;
        if (e18Var2.Q(i3 & 1, (38347923 & i3) != 38347922)) {
            e18Var2.V();
            if ((i & 1) != 0 && !e18Var2.A()) {
                e18Var2.T();
            }
            e18Var2.q();
            cz5 cz5Var = (cz5) e18Var2.j(ve4.h);
            float f = ez1.l;
            float fQ0 = cz5Var.q0(f);
            boolean z = e18Var2.j(ve4.n) == fu9.F;
            iqb iqbVarI0 = fqb.E;
            if (nf6Var != null) {
                iqbVarI0 = xn5.i0(iqbVarI0, new yyb(nf6Var, z, i4));
            }
            iqb iqbVarB = xn5.i0(b.s(iqbVar, 240.0f, MTTypesetterKt.kLineSkipLimitMultiplier, f, 10), new xyb(to7Var, fQ0, z, 1)).B(iqbVarI0).B(b.b);
            ta4 ta4VarQ0 = fd9.q0(-315420087, new fv2(nf6Var, z, f, to7Var, fQ0, wbjVar, ta4Var), e18Var2);
            int i5 = i3 >> 6;
            e18Var = e18Var2;
            pzg.a(iqbVarB, e0gVar, j, j2, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, ta4VarQ0, e18Var, (i5 & 112) | 12582912 | (i5 & 896) | (i5 & 7168) | (i5 & 57344), 96);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: wyb
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gzb.b(nf6Var, wbjVar, iqbVar, e0gVar, j, j2, to7Var, ta4Var, (ld4) obj, x44.p0(i | 1));
                    return iei.a;
                }
            };
        }
    }

    public static final void c(final of6 of6Var, final iqb iqbVar, e0g e0gVar, final long j, final long j2, final wbj wbjVar, final ta4 ta4Var, ld4 ld4Var, final int i) {
        int i2;
        final wbj wbjVar2;
        final e0g e0gVarB;
        int i3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1620540727);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(of6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.e(j) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.e(j2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        int i4 = i2 | 196608;
        if ((1572864 & i) == 0) {
            wbjVar2 = wbjVar;
            i4 |= e18Var.f(wbjVar2) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        } else {
            wbjVar2 = wbjVar;
        }
        if ((12582912 & i) == 0) {
            i4 |= e18Var.h(ta4Var) ? 8388608 : 4194304;
        }
        if (e18Var.Q(i4 & 1, (4793491 & i4) != 4793490)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                float f = qe6.a;
                e0gVarB = k1g.b(ez1.k, e18Var);
                i3 = i4 & (-897);
            } else {
                e18Var.T();
                i3 = i4 & (-897);
                e0gVarB = e0gVar;
            }
            int i5 = i3;
            e18Var.q();
            a(of6Var, fd9.q0(797187326, new rz7() { // from class: tyb
                @Override // defpackage.rz7
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    nf6 nf6Var = (nf6) obj;
                    ld4 ld4Var2 = (ld4) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((e18) ld4Var2).f(nf6Var) ? 4 : 2;
                    }
                    e18 e18Var2 = (e18) ld4Var2;
                    if (e18Var2.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        of6 of6Var2 = of6Var;
                        boolean zF = e18Var2.f(of6Var2);
                        Object objN = e18Var2.N();
                        if (zF || objN == jd4.a) {
                            objN = new vyb(0, of6Var2);
                            e18Var2.k0(objN);
                        }
                        gzb.b(nf6Var, wbjVar2, iqbVar, e0gVarB, j, j2, (to7) objN, ta4Var, e18Var2, iIntValue & 14);
                    } else {
                        e18Var2.T();
                    }
                    return iei.a;
                }
            }, e18Var), e18Var, (i5 & 14) | 48);
        } else {
            e18Var.T();
            e0gVarB = e0gVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: uyb
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gzb.c(of6Var, iqbVar, e0gVarB, j, j2, wbjVar, ta4Var, (ld4) obj, x44.p0(i | 1));
                    return iei.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0300 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0337 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0366 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0397 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.ta4 r33, defpackage.iqb r34, defpackage.of6 r35, final boolean r36, long r37, final defpackage.ta4 r39, defpackage.ld4 r40, final int r41) {
        /*
            Method dump skipped, instruction units count: 1033
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gzb.d(ta4, iqb, of6, boolean, long, ta4, ld4, int):void");
    }

    public static final void e(ta4 ta4Var, final boolean z, zy7 zy7Var, iqb iqbVar, final pz7 pz7Var, pz7 pz7Var2, e0g e0gVar, final yq5 yq5Var, ld4 ld4Var, int i) {
        ta4 ta4Var2;
        int i2;
        final pz7 pz7Var3;
        e0g e0gVar2;
        e0g e0gVarB;
        int i3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-583709666);
        if ((i & 6) == 0) {
            ta4Var2 = ta4Var;
            i2 = (e18Var.h(ta4Var2) ? 4 : 2) | i;
        } else {
            ta4Var2 = ta4Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.h(pz7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            pz7Var3 = pz7Var2;
            i2 |= e18Var.h(pz7Var3) ? 131072 : 65536;
        } else {
            pz7Var3 = pz7Var2;
        }
        if ((1572864 & i) == 0) {
            i2 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= e18Var.f(yq5Var) ? 8388608 : 4194304;
        }
        int i4 = i2 | 100663296;
        if (e18Var.Q(i4 & 1, (38347923 & i4) != 38347922)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                e0gVarB = k1g.b(ez1.i, e18Var);
                i3 = i4 & (-3670017);
            } else {
                e18Var.T();
                i3 = i4 & (-3670017);
                e0gVarB = e0gVar;
            }
            e18Var.q();
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new xga(17);
                e18Var.k0(objN);
            }
            iqb iqbVarC = b.c(b.g(tjf.b(iqbVar, false, (bz7) objN), ez1.h, MTTypesetterKt.kLineSkipLimitMultiplier, 2), 1.0f);
            int i5 = i3 >> 3;
            e18Var.a0(-433512770);
            nwb nwbVarZ = mpk.Z(new d54(z ? yq5Var.e : yq5Var.f), e18Var);
            e18Var.p(false);
            final ta4 ta4Var3 = ta4Var2;
            e0g e0gVar3 = e0gVarB;
            pzg.b(z, zy7Var, iqbVarC, false, e0gVar3, ((d54) nwbVarZ.getValue()).a, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, fd9.q0(-1173018444, new pz7() { // from class: zyb
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ld4 ld4Var2 = (ld4) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    e18 e18Var2 = (e18) ld4Var2;
                    if (e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        fqb fqbVar = fqb.E;
                        iqb iqbVarN = gb9.N(fqbVar, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 10);
                        cxe cxeVarA = axe.a(ko0.a, lja.Q, e18Var2, 48);
                        int iHashCode = Long.hashCode(e18Var2.T);
                        hyc hycVarL = e18Var2.l();
                        iqb iqbVarE = kxk.E(e18Var2, iqbVarN);
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
                        pz7 pz7Var4 = pz7Var;
                        yq5 yq5Var2 = yq5Var;
                        boolean z2 = z;
                        if (pz7Var4 != null) {
                            e18Var2.a0(-2013920011);
                            e18Var2.a0(1141354218);
                            nwb nwbVarZ2 = mpk.Z(new d54(z2 ? yq5Var2.a : yq5Var2.b), e18Var2);
                            e18Var2.p(false);
                            j8.c(sq6.m(((d54) nwbVarZ2.getValue()).a, on4.a), pz7Var4, e18Var2, 8);
                            vb7.A(fqbVar, 12.0f, e18Var2, false);
                        } else {
                            e18Var2.a0(-2013707630);
                            e18Var2.p(false);
                        }
                        hw9 hw9Var = new hw9(1.0f, true);
                        o5b o5bVarD = dw1.d(lja.G, false);
                        int iHashCode2 = Long.hashCode(e18Var2.T);
                        hyc hycVarL2 = e18Var2.l();
                        iqb iqbVarE2 = kxk.E(e18Var2, hw9Var);
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
                        e18Var2.a0(1275109558);
                        nwb nwbVarZ3 = mpk.Z(new d54(z2 ? yq5Var2.c : yq5Var2.d), e18Var2);
                        e18Var2.p(false);
                        long j = ((d54) nwbVarZ3.getValue()).a;
                        xe4 xe4Var = on4.a;
                        j8.c(sq6.m(j, xe4Var), ta4Var3, e18Var2, 8);
                        e18Var2.p(true);
                        pz7 pz7Var5 = pz7Var3;
                        if (pz7Var5 != null) {
                            ij0.r(12.0f, -2013454639, e18Var2, e18Var2, fqbVar);
                            e18Var2.a0(-561675044);
                            nwb nwbVarZ4 = mpk.Z(new d54(z2 ? yq5Var2.g : yq5Var2.h), e18Var2);
                            e18Var2.p(false);
                            j8.c(sq6.m(((d54) nwbVarZ4.getValue()).a, xe4Var), pz7Var5, e18Var2, 8);
                            e18Var2.p(false);
                        } else {
                            e18Var2.a0(-2013238414);
                            e18Var2.p(false);
                        }
                        e18Var2.p(true);
                    } else {
                        e18Var2.T();
                    }
                    return iei.a;
                }
            }, e18Var), e18Var, i5 & 126, 968);
            e0gVar2 = e0gVar3;
        } else {
            e18Var.T();
            e0gVar2 = e0gVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new gga(ta4Var, z, zy7Var, iqbVar, pz7Var, pz7Var2, e0gVar2, yq5Var, i);
        }
    }

    public static final float f(xre xreVar, nf6 nf6Var) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (xreVar.V >> 32));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == MTTypesetterKt.kLineSkipLimitMultiplier) {
            return 1.0f;
        }
        return ((nf6Var.b.h() * (nf6Var.a() ? 1 : -1)) / fIntBitsToFloat) + 1.0f;
    }

    public static final float g(xre xreVar, nf6 nf6Var) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (xreVar.V & 4294967295L));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == MTTypesetterKt.kLineSkipLimitMultiplier) {
            return 1.0f;
        }
        return 1.0f - (nf6Var.c.h() / fIntBitsToFloat);
    }

    public static final of6 h(ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        int i = 16;
        lz1 lz1Var = jd4.a;
        if (objN == lz1Var) {
            objN = new xga(i);
            e18Var.k0(objN);
        }
        bz7 bz7Var = (bz7) objN;
        Object[] objArr = new Object[0];
        y5f y5fVar = new y5f(new da3(2, bz7Var), new z35(i));
        boolean zF = ((e18) ld4Var).f(bz7Var);
        e18 e18Var2 = (e18) ld4Var;
        Object objN2 = e18Var2.N();
        if (zF || objN2 == lz1Var) {
            objN2 = new dg8(bz7Var);
            e18Var2.k0(objN2);
        }
        return (of6) iuj.K(objArr, y5fVar, (zy7) objN2, e18Var2, 0);
    }
}
