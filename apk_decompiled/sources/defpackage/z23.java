package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class z23 {
    public static final xe4 a = new xe4(new rc1(29));
    public static final float b = 120.0f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:285:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015c  */
    /* JADX WARN: Type inference failed for: r15v1, types: [e18, ld4] */
    /* JADX WARN: Type inference failed for: r33v0, types: [e18, ld4] */
    /* JADX WARN: Type inference failed for: r3v11, types: [e18] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v34, types: [e18, ld4] */
    /* JADX WARN: Type inference failed for: r3v36, types: [e18, ld4] */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38, types: [e18] */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r5v21, types: [e18, ld4] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v8, types: [e18] */
    /* JADX WARN: Type inference failed for: r5v9, types: [e18] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.lc3 r40, final defpackage.t53 r41, final defpackage.hw2 r42, defpackage.x0a r43, final defpackage.ta4 r44, final defpackage.rwe r45, final defpackage.rwe r46, final defpackage.kg3 r47, final defpackage.bl2 r48, final defpackage.lvh r49, final defpackage.bz7 r50, defpackage.iqb r51, boolean r52, defpackage.iqb r53, boolean r54, final defpackage.qnc r55, defpackage.ld4 r56, int r57, int r58, int r59) {
        /*
            Method dump skipped, instruction units count: 1649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z23.a(lc3, t53, hw2, x0a, ta4, rwe, rwe, kg3, bl2, lvh, bz7, iqb, boolean, iqb, boolean, qnc, ld4, int, int, int):void");
    }

    public static final void b(boolean z, x0a x0aVar, int i, zy7 zy7Var, ld4 ld4Var, int i2) {
        int i3;
        int i4;
        Object bb0Var;
        Boolean bool;
        int i5;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1162186028);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.f(x0aVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 = i;
            i3 |= e18Var.d(i4) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            i4 = i;
        }
        if ((i2 & 3072) == 0) {
            i3 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            nwb nwbVarZ = mpk.Z(Integer.valueOf(i4), e18Var);
            Boolean boolValueOf = Boolean.valueOf(z);
            int i6 = i3 & 14;
            int i7 = i3 & 112;
            boolean zF = (i6 == 4) | (i7 == 32) | e18Var.f(nwbVarZ);
            Object objN = e18Var.N();
            tp4 tp4Var = null;
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                bool = boolValueOf;
                i5 = i6;
                bb0Var = new bb0(z, x0aVar, nwbVarZ, tp4Var, 1);
                e18Var.k0(bb0Var);
            } else {
                bool = boolValueOf;
                bb0Var = objN;
                i5 = i6;
            }
            fd9.i(e18Var, (pz7) bb0Var, bool);
            Boolean boolValueOf2 = Boolean.valueOf(z);
            boolean z2 = (i5 == 4) | (i7 == 32) | ((i3 & 7168) == 2048);
            Object objN2 = e18Var.N();
            if (z2 || objN2 == lz1Var) {
                bb0 bb0Var2 = new bb0(z, x0aVar, zy7Var, tp4Var, 2);
                e18Var.k0(bb0Var2);
                objN2 = bb0Var2;
            }
            fd9.i(e18Var, (pz7) objN2, boolValueOf2);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new e23(z, x0aVar, i4, zy7Var, i2);
        }
    }

    public static final void c(final x0a x0aVar, boolean z, int i, final int i2, iqb iqbVar, ld4 ld4Var, int i3) {
        int i4;
        boolean z2;
        final int i5;
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-538633085);
        int i6 = 2;
        if ((i3 & 6) == 0) {
            i4 = (e18Var.f(x0aVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            z2 = z;
            i4 |= e18Var.g(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i3 & 384) == 0) {
            i5 = i;
            i4 |= e18Var.d(i5) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            i5 = i;
        }
        if ((i3 & 3072) == 0) {
            i4 |= e18Var.d(i2) ? 2048 : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i3 & 24576) == 0) {
            iqbVar2 = iqbVar;
            i4 |= e18Var.f(iqbVar2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        } else {
            iqbVar2 = iqbVar;
        }
        int i7 = i4;
        if (e18Var.Q(i7 & 1, (i7 & 9363) != 9362)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = fd9.O(im6.E, e18Var);
                e18Var.k0(objN);
            }
            final l45 l45Var = (l45) objN;
            boolean z3 = (i7 & 7168) == 2048;
            Object objN2 = e18Var.N();
            if (z3 || objN2 == lz1Var) {
                objN2 = mpk.w(new t51(x0aVar, i2, i6));
                e18Var.k0(objN2);
            }
            final boolean z4 = z2;
            wd6.M(((Boolean) ((wlg) objN2).getValue()).booleanValue(), iqbVar2, gp6.e(null, 3).a(gp6.g(null, MTTypesetterKt.kLineSkipLimitMultiplier, 7)), gp6.f(null, 3).a(gp6.h(null, MTTypesetterKt.kLineSkipLimitMultiplier, 7)), null, fd9.q0(449466539, new rz7() { // from class: q13
                @Override // defpackage.rz7
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ld4 ld4Var2 = (ld4) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((ia0) obj).getClass();
                    e18 e18Var2 = (e18) ld4Var2;
                    if (e18Var2.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        final l45 l45Var2 = l45Var;
                        boolean zH = e18Var2.h(l45Var2);
                        final boolean z5 = z4;
                        boolean zG = zH | e18Var2.g(z5);
                        final x0a x0aVar2 = x0aVar;
                        boolean zF = zG | e18Var2.f(x0aVar2);
                        final int i8 = i2;
                        boolean zD = zF | e18Var2.d(i8);
                        final int i9 = i5;
                        boolean zD2 = e18Var2.d(i9) | zD;
                        Object objN3 = e18Var2.N();
                        if (zD2 || objN3 == jd4.a) {
                            zy7 zy7Var = new zy7() { // from class: s13
                                @Override // defpackage.zy7
                                public final Object a() {
                                    gb9.D(l45Var2, null, null, new y23(z5, x0aVar2, i8, i9, null), 3);
                                    return iei.a;
                                }
                            };
                            e18Var2.k0(zy7Var);
                            objN3 = zy7Var;
                        }
                        z23.d((zy7) objN3, fqb.E, e18Var2, 0);
                    } else {
                        e18Var2.T();
                    }
                    return iei.a;
                }
            }, e18Var), e18Var, ((i7 >> 9) & 112) | 200064, 16);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new r13(x0aVar, z, i, i2, iqbVar, i3);
        }
    }

    public static final void d(zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        long j;
        long j2;
        iqb iqbVarA0;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(405302938);
        int i2 = i | (e18Var.h(zy7Var) ? 4 : 2) | (e18Var.f(iqbVar) ? 32 : 16);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            um2 um2Var = (um2) e18Var.j(vm2.a);
            mo8 mo8Var = z79.a;
            iqb iqbVarO = b.o(iqbVar.B(pkb.E), 40.0f);
            vve vveVar = xve.a;
            um2Var.getClass();
            d54 d54Var = um2Var.c;
            vveVar.getClass();
            tzf tzfVar = um2Var.b;
            iqb iqbVar2 = fqb.E;
            if (tzfVar != null && (iqbVarA0 = xn5.a0(iqbVar2, vveVar, tzfVar)) != null) {
                iqbVar2 = iqbVarA0;
            }
            iqb iqbVarB = zni.t(iqbVarO.B(iqbVar2), new v0(24, vveVar)).B((iqb) um2Var.d.invoke(vveVar));
            o5b o5bVarD = dw1.d(lja.K, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarB);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            if (d54Var == null) {
                e18Var.a0(-1099595911);
                j = gm3.a(e18Var).n;
                e18Var.p(false);
            } else {
                e18Var.a0(-1099597461);
                e18Var.p(false);
                j = d54Var.a;
            }
            if (d54Var != null) {
                e18Var.a0(-1099592901);
                j2 = gm3.a(e18Var).M;
            } else {
                e18Var.a0(-1099591877);
                j2 = gm3.a(e18Var).O;
            }
            e18Var.p(false);
            qu1 qu1Var = um2Var.a;
            FillElement fillElement = b.c;
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new it2(6);
                e18Var.k0(objN);
            }
            pzg.c(zy7Var, tjf.b(fillElement, false, (bz7) objN), false, vveVar, j, j2, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, qu1Var, null, xwj.a, e18Var, i2 & 14, 708);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xh(zy7Var, iqbVar, i, 5);
        }
    }
}
