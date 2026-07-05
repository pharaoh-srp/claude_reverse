package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lag {
    public static final float a = bwj.q;
    public static final float b;
    public static final long c;
    public static final float d;
    public static final float e;
    public static final uti f;
    public static final float g;

    static {
        float f2 = bwj.o;
        b = f2;
        float f3 = bwj.m;
        c = mpk.d(f2, f3);
        mpk.d(f3, f2);
        d = 6.0f;
        e = 2.0f;
        f = new uti(gag.E);
        g = 8.0f;
    }

    public static final void a(float f2, bz7 bz7Var, iqb iqbVar, boolean z, fq3 fq3Var, zy7 zy7Var, v9g v9gVar, zub zubVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        iqb iqbVar2;
        boolean z2;
        v9g v9gVar2;
        zub zubVar2;
        int i3;
        zub zubVar3;
        v9g v9gVar3;
        boolean z3;
        iqb iqbVar3;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-202044027);
        if ((i & 6) == 0) {
            i2 = (e18Var2.c(f2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.h(bz7Var) ? 32 : 16;
        }
        int i4 = i2 | 3456;
        if ((i & 24576) == 0) {
            i4 |= e18Var2.f(fq3Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        int i5 = i4 | 196608;
        if ((1572864 & i) == 0) {
            i5 |= e18Var2.h(zy7Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            i5 |= 4194304;
        }
        int i6 = i5 | 100663296;
        int i7 = 0;
        if (e18Var2.Q(i6 & 1, (38347923 & i6) != 38347922)) {
            e18Var2.V();
            if ((i & 1) == 0 || e18Var2.A()) {
                aag aagVar = aag.a;
                v9g v9gVarD = aag.d(e18Var2);
                i3 = i6 & (-29360129);
                Object objN = e18Var2.N();
                if (objN == jd4.a) {
                    objN = vb7.f(e18Var2);
                }
                zubVar3 = (zub) objN;
                v9gVar3 = v9gVarD;
                z3 = true;
                iqbVar3 = fqb.E;
            } else {
                e18Var2.T();
                i3 = i6 & (-29360129);
                iqbVar3 = iqbVar;
                z3 = z;
                v9gVar3 = v9gVar;
                zubVar3 = zubVar;
            }
            e18Var2.q();
            int i8 = i3 >> 6;
            e18Var = e18Var2;
            zub zubVar4 = zubVar3;
            b(f2, bz7Var, iqbVar3, z3, zy7Var, v9gVar3, zubVar4, 0, fd9.q0(308249025, new tw(zubVar3, v9gVar3, z3, 11), e18Var2), fd9.q0(-1843234110, new cag(z3, v9gVar3, i7), e18Var2), fq3Var, e18Var, (i3 & 14) | 905969664 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i8) | (i8 & 3670016) | (29360128 & (i3 << 6)), (i3 >> 12) & 14, 0);
            iqbVar2 = iqbVar3;
            z2 = z3;
            v9gVar2 = v9gVar3;
            zubVar2 = zubVar4;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
            z2 = z;
            v9gVar2 = v9gVar;
            zubVar2 = zubVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new dag(f2, bz7Var, iqbVar2, z2, fq3Var, zy7Var, v9gVar2, zubVar2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final float r25, final defpackage.bz7 r26, final defpackage.iqb r27, boolean r28, defpackage.zy7 r29, final defpackage.v9g r30, defpackage.zub r31, final int r32, final defpackage.ta4 r33, defpackage.rz7 r34, final defpackage.fq3 r35, defpackage.ld4 r36, final int r37, final int r38, final int r39) {
        /*
            Method dump skipped, instruction units count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lag.b(float, bz7, iqb, boolean, zy7, v9g, zub, int, ta4, rz7, fq3, ld4, int, int, int):void");
    }

    public static final void c(mag magVar, iqb iqbVar, boolean z, v9g v9gVar, zub zubVar, ta4 ta4Var, rz7 rz7Var, ld4 ld4Var, int i) {
        int i2;
        v9g v9gVar2;
        int i3;
        v9g v9gVarD;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(409861960);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(magVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.f(zubVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.h(ta4Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var.h(rz7Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if (e18Var.Q(i2 & 1, (599187 & i2) != 599186)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                aag aagVar = aag.a;
                i3 = i2 & (-7169);
                v9gVarD = aag.d(e18Var);
            } else {
                e18Var.T();
                i3 = i2 & (-7169);
                v9gVarD = v9gVar;
            }
            e18Var.q();
            if (magVar.a < 0) {
                sz6.p("steps should be >= 0");
                return;
            } else {
                int i4 = i3 >> 3;
                d(iqbVar, magVar, z, zubVar, ta4Var, rz7Var, e18Var, (i3 & 896) | (i4 & 14) | ((i3 << 3) & 112) | (i4 & 7168) | (57344 & i4) | (i4 & 458752));
                v9gVar2 = v9gVarD;
            }
        } else {
            e18Var.T();
            v9gVar2 = v9gVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new de3(magVar, iqbVar, z, v9gVar2, zubVar, ta4Var, rz7Var, i);
        }
    }

    public static final void d(iqb iqbVar, mag magVar, boolean z, zub zubVar, ta4 ta4Var, rz7 rz7Var, ld4 ld4Var, int i) {
        int i2;
        ta4 ta4Var2;
        e18 e18Var;
        rz7 rz7Var2;
        mag magVar2;
        ukc ukcVar;
        iqb iqbVarJ;
        bz7 bz7Var;
        boolean z2;
        hsc hscVar = magVar.d;
        fq3 fq3Var = magVar.c;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(898172835);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(iqbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.h(magVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.f(zubVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.h(ta4Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var2.h(rz7Var) ? 131072 : 65536;
        }
        int i3 = i2;
        if (e18Var2.Q(i3 & 1, (i3 & 74899) != 74898)) {
            boolean z3 = e18Var2.j(ve4.n) == fu9.F;
            magVar.j = z3;
            ukc ukcVar2 = magVar.m;
            boolean z4 = ukcVar2 == ukc.F && z3;
            int i4 = 6;
            fqb fqbVar = fqb.E;
            iqb iqbVarB = z ? a0h.b(fqbVar, magVar, zubVar, new c35(zubVar, i4, magVar)) : fqbVar;
            ukc ukcVar3 = magVar.m;
            boolean zBooleanValue = ((Boolean) magVar.n.getValue()).booleanValue();
            boolean zH = e18Var2.h(magVar);
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (zH || objN == lz1Var) {
                ukcVar = ukcVar3;
                objN = new uc4(magVar, null, 2);
                e18Var2.k0(objN);
            } else {
                ukcVar = ukcVar3;
            }
            e18Var = e18Var2;
            iqb iqbVar2 = iqbVarB;
            boolean z5 = z4;
            iqb iqbVarA = nd6.a(fqbVar, magVar, ukcVar, z, zubVar, zBooleanValue, null, (rz7) objN, z5, 32);
            w9g w9gVar = w9g.E;
            ukc ukcVar4 = ukc.E;
            iqb iqbVarW = ukcVar2 == ukcVar4 ? b.w(zni.L(fqbVar, w9gVar), lja.Q, false) : b.z(zni.L(fqbVar, w9gVar));
            if (x44.r(e18Var.j(due.a), aue.b)) {
                e18Var.a0(-177990493);
                iqbVarJ = gb9.J(d19.a(fqbVar, zubVar, due.a(false, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, k1g.b(bwj.n, e18Var), true, 7)), g);
                e18Var.p(false);
            } else {
                e18Var.a0(-177433857);
                e18Var.p(false);
                iqbVarJ = fqbVar;
            }
            mo8 mo8Var = z79.a;
            iqb iqbVarB2 = iqbVar.B(pkb.E);
            float f2 = b;
            float f3 = a;
            iqb iqbVarB3 = tjf.b(b.l(iqbVarB2, ukcVar2 == ukcVar4 ? f3 : f2, ukcVar2 == ukcVar4 ? f2 : f3, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 12), false, new xu0(z, magVar, 6)).B(ukcVar2 == ukcVar4 ? s6.b : s6.a);
            final float fH = hscVar.h();
            iqb iqbVar3 = iqbVarW;
            final fq3 fq3Var2 = new fq3(Float.valueOf(fq3Var.E).floatValue(), Float.valueOf(fq3Var.F).floatValue());
            final int i5 = magVar.a;
            iqb iqbVarB4 = ez1.B(tjf.b(iqbVarB3, true, new bz7() { // from class: wjd
                @Override // defpackage.bz7
                public final Object invoke(Object obj) {
                    Float fValueOf = Float.valueOf(fH);
                    fq3 fq3Var3 = fq3Var2;
                    ckf.r((ekf) obj, new mjd(((Number) wd6.i0(fValueOf, fq3Var3)).floatValue(), fq3Var3, i5));
                    return iei.a;
                }
            }), z, zubVar);
            int i6 = magVar.a;
            float fH2 = hscVar.h();
            boolean zH2 = e18Var.h(magVar);
            Object objN2 = e18Var.N();
            if (zH2 || objN2 == lz1Var) {
                objN2 = new bag(magVar, 1);
                e18Var.k0(objN2);
            }
            bz7 bz7Var2 = (bz7) objN2;
            zy7 zy7Var = magVar.b;
            if (ukcVar2 == ukcVar4) {
                bz7Var = bz7Var2;
                z2 = true;
            } else {
                bz7Var = bz7Var2;
                z2 = false;
            }
            if (i6 < 0) {
                sz6.p("steps should be >= 0");
                return;
            }
            iqb iqbVar4 = iqbVarJ;
            magVar2 = magVar;
            iqb iqbVarB5 = dch.M(iqbVarB4, new jag(z, fq3Var, i6, z5, bz7Var, z2, fH2, zy7Var)).B(iqbVar2).B(iqbVarA);
            boolean zH3 = e18Var.h(magVar2);
            Object objN3 = e18Var.N();
            if (zH3 || objN3 == lz1Var) {
                objN3 = new iag(magVar2);
                e18Var.k0(objN3);
            }
            o5b o5bVar = (o5b) objN3;
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarB5);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, o5bVar);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            boolean zH4 = e18Var.h(magVar2);
            Object objN4 = e18Var.N();
            if (zH4 || objN4 == lz1Var) {
                objN4 = new bag(magVar2, 2);
                e18Var.k0(objN4);
            }
            iqb iqbVarB6 = iqbVar4.B(wd6.v0(iqbVar3, (bz7) objN4));
            xo1 xo1Var = lja.G;
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarB6);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, o5bVarD);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            int i7 = (i3 >> 3) & 14;
            ta4Var2 = ta4Var;
            ta4Var2.invoke(magVar2, e18Var, Integer.valueOf(((i3 >> 9) & 112) | i7));
            e18Var.p(true);
            iqb iqbVarL = zni.L(fqbVar, w9g.F);
            o5b o5bVarD2 = dw1.d(xo1Var, false);
            int iHashCode3 = Long.hashCode(e18Var.T);
            hyc hycVarL3 = e18Var.l();
            iqb iqbVarE3 = kxk.E(e18Var, iqbVarL);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, o5bVarD2);
            d4c.i0(e18Var, z80Var2, hycVarL3);
            ij0.t(iHashCode3, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE3);
            rz7Var2 = rz7Var;
            rz7Var2.invoke(magVar2, e18Var, Integer.valueOf(i7 | ((i3 >> 12) & 112)));
            e18Var.p(true);
            e18Var.p(true);
        } else {
            ta4Var2 = ta4Var;
            e18Var = e18Var2;
            rz7Var2 = rz7Var;
            magVar2 = magVar;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pg1(iqbVar, magVar2, z, zubVar, ta4Var2, rz7Var2, i);
        }
    }

    public static final void e(final zub zubVar, final iqb iqbVar, final v9g v9gVar, final boolean z, final long j, ld4 ld4Var, final int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(2115331054);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(zubVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(v9gVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.g(z) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.e(j) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.g(false) ? 131072 : 65536;
        }
        if (e18Var.Q(i2 & 1, (74899 & i2) != 74898)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new kdg();
                e18Var.k0(objN);
            }
            kdg kdgVar = (kdg) objN;
            boolean z2 = (i2 & 14) == 4;
            Object objN2 = e18Var.N();
            if (z2 || objN2 == lz1Var) {
                objN2 = new o6e(zubVar, kdgVar, null, 20);
                e18Var.k0(objN2);
            }
            fd9.i(e18Var, (pz7) objN2, zubVar);
            iqb iqbVarT = x44.T(b.p(!kdgVar.isEmpty() ? za6.a(j, za6.d(j) / 2.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2) : j, iqbVar), zubVar);
            x7d.a.getClass();
            kxk.g(e18Var, yfd.p(eve.O(iqbVarT, csg.i), z ? v9gVar.a : v9gVar.f, k1g.b(bwj.n, e18Var)));
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: fag
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lag.e(zubVar, iqbVar, v9gVar, z, j, (ld4) obj, x44.p0(i | 1));
                    return iei.a;
                }
            };
        }
    }

    public static final float f(float f2, float[] fArr, float f3, float f4) {
        Float fValueOf;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float f5 = fArr[0];
            int i = 1;
            int length = fArr.length - 1;
            if (length == 0) {
                fValueOf = Float.valueOf(f5);
            } else {
                float fAbs = Math.abs(d4c.W(f3, f4, f5) - f2);
                if (1 <= length) {
                    while (true) {
                        float f6 = fArr[i];
                        float fAbs2 = Math.abs(d4c.W(f3, f4, f6) - f2);
                        if (Float.compare(fAbs, fAbs2) > 0) {
                            f5 = f6;
                            fAbs = fAbs2;
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
                fValueOf = Float.valueOf(f5);
            }
        }
        return fValueOf != null ? d4c.W(f3, f4, fValueOf.floatValue()) : f2;
    }
}
