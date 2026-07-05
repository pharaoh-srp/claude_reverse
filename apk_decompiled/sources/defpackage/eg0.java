package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class eg0 {
    public static final xe4 a = new xe4(new j7(14));
    public static final xe4 b = new xe4(new j7(15));
    public static final ad5 c = new ad5(0.8f, MTTypesetterKt.kLineSkipLimitMultiplier, 0.8f, 0.15f);
    public static final float d = 24.0f;
    public static final float e = 4.0f;
    public static final float f = 12.0f;

    /* JADX WARN: Removed duplicated region for block: B:122:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.pz7 r25, defpackage.iqb r26, defpackage.pz7 r27, defpackage.rz7 r28, float r29, defpackage.wbj r30, final defpackage.m2i r31, defpackage.mnc r32, defpackage.ld4 r33, final int r34, final int r35) {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eg0.a(pz7, iqb, pz7, rz7, float, wbj, m2i, mnc, ld4, int, int):void");
    }

    public static final void b(ta4 ta4Var, iqb iqbVar, ta4 ta4Var2, rz7 rz7Var, float f2, float f3, wbj wbjVar, m2i m2iVar, q2i q2iVar, ld4 ld4Var, int i) {
        e18 e18Var;
        wbj wbjVar2;
        int i2;
        wbj wbjVarC;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1378129383);
        int i3 = i | (e18Var2.f(iqbVar) ? 32 : 16) | (e18Var2.h(ta4Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.h(rz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var2.c(f2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var2.c(f3) ? 131072 : 65536) | 524288 | (e18Var2.f(m2iVar) ? 8388608 : 4194304) | (e18Var2.f(q2iVar) ? 67108864 : 33554432);
        if (e18Var2.Q(i3 & 1, (38347923 & i3) != 38347922)) {
            e18Var2.V();
            if ((i & 1) == 0 || e18Var2.A()) {
                i2 = i3 & (-3670017);
                wbjVarC = n2i.c(e18Var2);
            } else {
                e18Var2.T();
                i2 = i3 & (-3670017);
                wbjVarC = wbjVar;
            }
            e18Var2.q();
            tkh tkhVarA = bci.a(x44.a, e18Var2);
            tkh tkhVarA2 = bci.a(mwa.a, e18Var2);
            tkh tkhVar = tkh.d;
            int i4 = i2 >> 3;
            e18Var = e18Var2;
            f(iqbVar, ta4Var, tkhVarA, d, ta4Var, tkhVarA2, tkhVar, tkhVar, ta4Var2, rz7Var, (va6.b(f2, Float.NaN) || va6.b(f2, Float.POSITIVE_INFINITY)) ? n2i.c : f2, (va6.b(f3, Float.NaN) || va6.b(f3, Float.POSITIVE_INFINITY)) ? n2i.d : f3, wbjVarC, m2iVar, q2iVar, e18Var, (i4 & 14) | 920153136, (i4 & 112) | 6 | (i4 & 896) | (3670016 & i4) | (i4 & 29360128));
            wbjVar2 = wbjVarC;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            wbjVar2 = wbjVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new yf0(ta4Var, iqbVar, ta4Var2, rz7Var, f2, f3, wbjVar2, m2iVar, q2iVar, i);
        }
    }

    public static final void c(final iqb iqbVar, final pz7 pz7Var, final tkh tkhVar, final tkh tkhVar2, final vo1 vo1Var, final pz7 pz7Var2, final rz7 rz7Var, final float f2, final mnc mncVar, final wbj wbjVar, final m2i m2iVar, ld4 ld4Var, final int i, final int i2) {
        int i3;
        pz7 pz7Var3;
        tkh tkhVar3;
        tkh tkhVar4;
        int i4;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(703932376);
        if ((i & 6) == 0) {
            i3 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            pz7Var3 = pz7Var;
            i3 |= e18Var.h(pz7Var3) ? 32 : 16;
        } else {
            pz7Var3 = pz7Var;
        }
        if ((i & 384) == 0) {
            tkhVar3 = tkhVar;
            i3 |= e18Var.f(tkhVar3) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            tkhVar3 = tkhVar;
        }
        if ((i & 3072) == 0) {
            i3 |= e18Var.h(null) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            tkhVar4 = tkhVar2;
            i3 |= e18Var.f(tkhVar4) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        } else {
            tkhVar4 = tkhVar2;
        }
        if ((196608 & i) == 0) {
            i3 |= e18Var.f(vo1Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= e18Var.h(pz7Var2) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= e18Var.h(rz7Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= e18Var.c(f2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= e18Var.f(mncVar) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (e18Var.f(wbjVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= e18Var.f(m2iVar) ? 32 : 16;
        }
        int i5 = i3;
        if ((i2 & 384) == 0) {
            i4 |= e18Var.f(null) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i5 & 1, ((i5 & 306783379) == 306783378 && (i4 & 147) == 146) ? false : true)) {
            ((lt5) e18Var.j(a)).a(new a8g(iqbVar, pz7Var3, tkhVar3, tkhVar4, vo1Var, pz7Var2, rz7Var, f2, mncVar, wbjVar, m2iVar), e18Var, 0);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: ag0
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(i | 1);
                    int iP02 = x44.p0(i2);
                    eg0.c(iqbVar, pz7Var, tkhVar, tkhVar2, vo1Var, pz7Var2, rz7Var, f2, mncVar, wbjVar, m2iVar, (ld4) obj, iP0, iP02);
                    return iei.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.ta4 r24, defpackage.iqb r25, final defpackage.ta4 r26, defpackage.rz7 r27, float r28, defpackage.wbj r29, final defpackage.m2i r30, defpackage.mnc r31, defpackage.ld4 r32, final int r33, final int r34) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eg0.d(ta4, iqb, ta4, rz7, float, wbj, m2i, mnc, ld4, int, int):void");
    }

    public static final void e(final iqb iqbVar, final to7 to7Var, final long j, final long j2, final long j3, long j4, final pz7 pz7Var, final tkh tkhVar, final tkh tkhVar2, zy7 zy7Var, final jo0 jo0Var, final vo1 vo1Var, final int i, final boolean z, pz7 pz7Var2, ta4 ta4Var, final float f2, final mnc mncVar, ld4 ld4Var, final int i2, final int i3) {
        int i4;
        e18 e18Var;
        final zy7 zy7Var2;
        long j5;
        pz7 pz7Var3;
        ta4 ta4Var2;
        iqb iqbVarA;
        boolean z2;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(239553141);
        int i5 = i2 | (e18Var2.f(iqbVar) ? 4 : 2) | (e18Var2.f(to7Var) ? 32 : 16);
        boolean zE = e18Var2.e(j);
        int i6 = FreeTypeConstants.FT_LOAD_PEDANTIC;
        int i7 = i5 | (zE ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : 128);
        boolean zE2 = e18Var2.e(j2);
        int i8 = FreeTypeConstants.FT_LOAD_NO_RECURSE;
        int i9 = i7 | (zE2 ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : 1024);
        boolean zE3 = e18Var2.e(j3);
        int i10 = FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        int i11 = i9 | (zE3 ? 16384 : 8192) | (e18Var2.e(j4) ? 131072 : 65536) | (e18Var2.h(pz7Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var2.f(tkhVar) ? 8388608 : 4194304) | (e18Var2.h(null) ? 67108864 : 33554432) | (e18Var2.f(tkhVar2) ? 536870912 : 268435456);
        if ((i3 & 6) == 0) {
            i4 = i3 | (e18Var2.h(zy7Var) ? 4 : 2);
        } else {
            i4 = i3;
        }
        if (e18Var2.f(vo1Var)) {
            i6 = FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
        }
        int i12 = i4 | i6;
        if ((i3 & 3072) == 0) {
            if (e18Var2.d(i)) {
                i8 = FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
            }
            i12 |= i8;
        }
        if ((i3 & 24576) == 0) {
            if (e18Var2.g(z)) {
                i10 = 16384;
            }
            i12 |= i10;
        }
        if ((196608 & i3) == 0) {
            i12 |= e18Var2.h(pz7Var2) ? 131072 : 65536;
        }
        int i13 = i12 | (e18Var2.c(f2) ? 8388608 : 4194304);
        if ((i3 & 100663296) == 0) {
            i13 |= e18Var2.f(mncVar) ? 67108864 : 33554432;
        }
        int i14 = i13;
        if (e18Var2.Q(i11 & 1, ((i11 & 306783379) == 306783378 && (38347923 & i14) == 38347922) ? false : true)) {
            boolean z3 = ((i11 & 112) == 32) | ((i14 & 896) == 256) | ((i14 & 7168) == 2048) | ((29360128 & i14) == 8388608);
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (z3 || objN == lz1Var) {
                p2i p2iVar = new p2i(to7Var, jo0Var, vo1Var, i, f2, mncVar);
                e18Var2.k0(p2iVar);
                objN = p2iVar;
            }
            p2i p2iVar2 = (p2i) objN;
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var2, z80Var, p2iVar2);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var2, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var2, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var2, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var2, z80Var4, iqbVarE);
            fqb fqbVar = fqb.E;
            iqb iqbVarL = zni.L(fqbVar, "navigationIcon");
            float f3 = e;
            iqb iqbVarN = gb9.N(iqbVarL, f3, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 14);
            xo1 xo1Var = lja.G;
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode2 = Long.hashCode(e18Var2.T);
            hyc hycVarL2 = e18Var2.l();
            iqb iqbVarE2 = kxk.E(e18Var2, iqbVarN);
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
            xe4 xe4Var = on4.a;
            pz7Var3 = pz7Var2;
            j8.c(sq6.m(j, xe4Var), pz7Var3, e18Var2, ((i14 >> 12) & 112) | 8);
            e18Var2.p(true);
            e18Var2.a0(408520308);
            iqb iqbVarL2 = gb9.L(zni.L(fqbVar, "title"), f3, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            if (z) {
                e18Var2.a0(-402453739);
                Object objN2 = e18Var2.N();
                if (objN2 == lz1Var) {
                    objN2 = new b8(18);
                    e18Var2.k0(objN2);
                }
                iqbVarA = tjf.a(fqbVar, (bz7) objN2);
                e18Var2.p(false);
            } else {
                e18Var2.a0(-402451802);
                e18Var2.p(false);
                iqbVarA = fqbVar;
            }
            iqb iqbVarB = iqbVarL2.B(iqbVarA);
            boolean z4 = (i14 & 14) == 4;
            Object objN3 = e18Var2.N();
            if (z4 || objN3 == lz1Var) {
                zy7Var2 = zy7Var;
                z2 = false;
                objN3 = new bg0(0, zy7Var2);
                e18Var2.k0(objN3);
            } else {
                zy7Var2 = zy7Var;
                z2 = false;
            }
            iqb iqbVarI0 = xn5.i0(iqbVarB, (bz7) objN3);
            o5b o5bVarD2 = dw1.d(xo1Var, z2);
            int iHashCode3 = Long.hashCode(e18Var2.T);
            hyc hycVarL3 = e18Var2.l();
            iqb iqbVarE3 = kxk.E(e18Var2, iqbVarI0);
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, z80Var, o5bVarD2);
            d4c.i0(e18Var2, z80Var2, hycVarL3);
            ij0.t(iHashCode3, e18Var2, z80Var3, e18Var2, bxVar);
            d4c.i0(e18Var2, z80Var4, iqbVarE3);
            zh4.h(j2, tkhVar, pz7Var, e18Var2, ((i11 >> 9) & 14) | ((i11 >> 18) & 112) | ((i11 >> 12) & 896));
            e18Var = e18Var2;
            e18Var.p(true);
            e18Var.p(false);
            iqb iqbVarN2 = gb9.N(zni.L(fqbVar, "actionIcons"), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, f3, MTTypesetterKt.kLineSkipLimitMultiplier, 11);
            o5b o5bVarD3 = dw1.d(xo1Var, false);
            int iHashCode4 = Long.hashCode(e18Var.T);
            hyc hycVarL4 = e18Var.l();
            iqb iqbVarE4 = kxk.E(e18Var, iqbVarN2);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, o5bVarD3);
            d4c.i0(e18Var, z80Var2, hycVarL4);
            ij0.t(iHashCode4, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE4);
            j5 = j4;
            ta4Var2 = ta4Var;
            j8.c(xe4Var.a(new d54(j5)), ta4Var2, e18Var, 56);
            e18Var.p(true);
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            zy7Var2 = zy7Var;
            j5 = j4;
            pz7Var3 = pz7Var2;
            ta4Var2 = ta4Var;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final ta4 ta4Var3 = ta4Var2;
            final pz7 pz7Var4 = pz7Var3;
            final long j6 = j5;
            r7eVarS.d = new pz7(to7Var, j, j2, j3, j6, pz7Var, tkhVar, tkhVar2, zy7Var2, jo0Var, vo1Var, i, z, pz7Var4, ta4Var3, f2, mncVar, i2, i3) { // from class: cg0
                public final /* synthetic */ to7 F;
                public final /* synthetic */ long G;
                public final /* synthetic */ long H;
                public final /* synthetic */ long I;
                public final /* synthetic */ long J;
                public final /* synthetic */ pz7 K;
                public final /* synthetic */ tkh L;
                public final /* synthetic */ tkh M;
                public final /* synthetic */ zy7 N;
                public final /* synthetic */ jo0 O;
                public final /* synthetic */ vo1 P;
                public final /* synthetic */ int Q;
                public final /* synthetic */ boolean R;
                public final /* synthetic */ pz7 S;
                public final /* synthetic */ ta4 T;
                public final /* synthetic */ float U;
                public final /* synthetic */ mnc V;
                public final /* synthetic */ int W;

                {
                    this.W = i3;
                }

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(1);
                    int iP02 = x44.p0(this.W);
                    eg0.e(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, (ld4) obj, iP0, iP02);
                    return iei.a;
                }
            };
        }
    }

    public static final void f(final iqb iqbVar, final ta4 ta4Var, final tkh tkhVar, final float f2, final ta4 ta4Var2, final tkh tkhVar2, final tkh tkhVar3, final tkh tkhVar4, final ta4 ta4Var3, final rz7 rz7Var, final float f3, final float f4, final wbj wbjVar, final m2i m2iVar, final q2i q2iVar, ld4 ld4Var, final int i, final int i2) {
        int i3;
        tkh tkhVar5;
        float f5;
        ta4 ta4Var4;
        tkh tkhVar6;
        int i4;
        rz7 rz7Var2;
        float f6;
        vo1 vo1Var = lja.S;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1092180406);
        if ((i & 6) == 0) {
            i3 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= e18Var.h(ta4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            tkhVar5 = tkhVar;
            i3 |= e18Var.f(tkhVar5) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            tkhVar5 = tkhVar;
        }
        int i5 = i & 3072;
        int i6 = FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
        if (i5 == 0) {
            f5 = f2;
            i3 |= e18Var.c(f5) ? 2048 : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            f5 = f2;
        }
        int i7 = i & 24576;
        int i8 = FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        if (i7 == 0) {
            ta4Var4 = ta4Var2;
            i3 |= e18Var.h(ta4Var4) ? 16384 : 8192;
        } else {
            ta4Var4 = ta4Var2;
        }
        if ((i & 196608) == 0) {
            i3 |= e18Var.f(tkhVar2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= e18Var.h(null) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= e18Var.f(tkhVar3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= e18Var.h(null) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            tkhVar6 = tkhVar4;
            i3 |= e18Var.f(tkhVar6) ? 536870912 : 268435456;
        } else {
            tkhVar6 = tkhVar4;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (e18Var.f(vo1Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= e18Var.h(ta4Var3) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            rz7Var2 = rz7Var;
            i4 |= e18Var.h(rz7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            rz7Var2 = rz7Var;
        }
        if ((i2 & 3072) == 0) {
            f6 = f3;
            if (!e18Var.c(f6)) {
                i6 = FreeTypeConstants.FT_LOAD_NO_RECURSE;
            }
            i4 |= i6;
        } else {
            f6 = f3;
        }
        if ((i2 & 24576) == 0) {
            if (e18Var.c(f4)) {
                i8 = 16384;
            }
            i4 |= i8;
        }
        if ((i2 & 196608) == 0) {
            i4 |= e18Var.f(wbjVar) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= e18Var.f(m2iVar) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= e18Var.f(q2iVar) ? 8388608 : 4194304;
        }
        if (e18Var.Q(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 4793491) == 4793490) ? false : true)) {
            ((lv5) e18Var.j(b)).a(new b9i(iqbVar, ta4Var, tkhVar5, f5, ta4Var4, tkhVar2, tkhVar3, tkhVar6, ta4Var3, rz7Var2, f6, f4, wbjVar, m2iVar, q2iVar), e18Var, 0);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: zf0
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(i | 1);
                    int iP02 = x44.p0(i2);
                    eg0.f(iqbVar, ta4Var, tkhVar, f2, ta4Var2, tkhVar2, tkhVar3, tkhVar4, ta4Var3, rz7Var, f3, f4, wbjVar, m2iVar, q2iVar, (ld4) obj, iP0, iP02);
                    return iei.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(defpackage.s2i r10, float r11, defpackage.zn5 r12, defpackage.yig r13, defpackage.vp4 r14) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eg0.g(s2i, float, zn5, yig, vp4):java.lang.Object");
    }

    public static final s2i h(ld4 ld4Var) {
        Object[] objArr = new Object[0];
        y5f y5fVar = s2i.d;
        y5f y5fVarF = xuk.f();
        boolean zC = ((e18) ld4Var).c(-3.4028235E38f) | ((e18) ld4Var).c(MTTypesetterKt.kLineSkipLimitMultiplier) | ((e18) ld4Var).c(MTTypesetterKt.kLineSkipLimitMultiplier);
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        if (zC || objN == jd4.a) {
            objN = new b5(22);
            e18Var.k0(objN);
        }
        return (s2i) iuj.K(objArr, y5fVarF, (zy7) objN, e18Var, 0);
    }
}
