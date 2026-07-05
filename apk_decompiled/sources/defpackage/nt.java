package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nt {
    public static final qnc a;
    public static final qnc b;
    public static final qnc c;
    public static final qnc d;
    public static final xe4 e;

    static {
        lsc lscVar = vad.a;
        float f = ((Boolean) lscVar.getValue()).booleanValue() ? 20.0f : 24.0f;
        float f2 = ((Boolean) lscVar.getValue()).booleanValue() ? 16.0f : 24.0f;
        a = new qnc(f, f, f, f);
        b = gb9.d(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 7);
        c = gb9.d(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 7);
        d = gb9.d(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, f2, 7);
        e = new xe4(new b5(14));
    }

    public static final void a(final ta4 ta4Var, iqb iqbVar, final pz7 pz7Var, final pz7 pz7Var2, final pz7 pz7Var3, final e0g e0gVar, final long j, final long j2, final long j3, final long j4, final long j5, ld4 ld4Var, final int i) {
        final iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1378716401);
        int i2 = i | 48 | (e18Var.h(pz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(pz7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(pz7Var3) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.f(e0gVar) ? 131072 : 65536) | (e18Var.e(j) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var.c(MTTypesetterKt.kLineSkipLimitMultiplier) ? 8388608 : 4194304) | (e18Var.e(j2) ? 67108864 : 33554432) | (e18Var.e(j3) ? 536870912 : 268435456);
        if (e18Var.Q(i2 & 1, ((306783379 & i2) == 306783378 && (((e18Var.e(j4) ? (char) 4 : (char) 2) | (e18Var.e(j5) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            ta4 ta4VarQ0 = fd9.q0(-652798794, new pz7() { // from class: lt
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    tkh tkhVarA;
                    z80 z80Var;
                    ld4 ld4Var2 = (ld4) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i3 = 1;
                    byte b2 = 0;
                    int i4 = 2;
                    e18 e18Var2 = (e18) ld4Var2;
                    if (e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        iqb iqbVarI = gb9.I(fqb.E, nt.a);
                        q64 q64VarA = p64.a(ko0.c, lja.S, e18Var2, 0);
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
                        z80 z80Var2 = cd4.f;
                        d4c.i0(e18Var2, z80Var2, q64VarA);
                        z80 z80Var3 = cd4.e;
                        d4c.i0(e18Var2, z80Var3, hycVarL);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        z80 z80Var4 = cd4.g;
                        d4c.i0(e18Var2, z80Var4, numValueOf);
                        bx bxVar = cd4.h;
                        d4c.h0(e18Var2, bxVar);
                        z80 z80Var5 = cd4.d;
                        d4c.i0(e18Var2, z80Var5, iqbVarE);
                        pz7 pz7Var4 = pz7Var;
                        if (pz7Var4 == null) {
                            e18Var2.a0(346092326);
                            e18Var2.p(false);
                        } else {
                            e18Var2.a0(346092327);
                            j8.c(sq6.m(j3, on4.a), fd9.q0(-1128150638, new dt(pz7Var4, i3, b2), e18Var2), e18Var2, 56);
                            e18Var2.p(false);
                        }
                        pz7 pz7Var5 = pz7Var2;
                        if (pz7Var5 == null) {
                            e18Var2.a0(346408309);
                            e18Var2.p(false);
                            z80Var = z80Var5;
                        } else {
                            e18Var2.a0(346408310);
                            if (((Boolean) vad.a.getValue()).booleanValue()) {
                                e18Var2.a0(1812109189);
                                tkhVarA = tkh.b(((gwa) e18Var2.j(jwa.a)).b.f, 0L, eve.B(20), null, null, null, 0L, null, 0, eve.B(26), null, 0, 16646141);
                                e18Var2.p(false);
                            } else {
                                e18Var2.a0(1812321322);
                                tkhVarA = bci.a(qwk.f, e18Var2);
                                e18Var2.p(false);
                            }
                            ta4 ta4VarQ02 = fd9.q0(71284337, new kn(pz7Var4, i4, pz7Var5), e18Var2);
                            z80Var = z80Var5;
                            zh4.h(j4, tkhVarA, ta4VarQ02, e18Var2, 384);
                            e18Var2.p(false);
                        }
                        pz7 pz7Var6 = pz7Var3;
                        if (pz7Var6 == null) {
                            e18Var2.a0(347550969);
                            e18Var2.p(false);
                        } else {
                            e18Var2.a0(347550970);
                            zh4.h(j5, bci.a(qwk.h, e18Var2), fd9.q0(705583346, new dt(pz7Var6, b2, b2), e18Var2), e18Var2, 384);
                            e18Var2.p(false);
                        }
                        ko8 ko8Var = new ko8(lja.U);
                        o5b o5bVarD = dw1.d(lja.G, false);
                        int iHashCode2 = Long.hashCode(e18Var2.T);
                        hyc hycVarL2 = e18Var2.l();
                        iqb iqbVarE2 = kxk.E(e18Var2, ko8Var);
                        e18Var2.e0();
                        if (e18Var2.S) {
                            e18Var2.k(re4Var);
                        } else {
                            e18Var2.n0();
                        }
                        d4c.i0(e18Var2, z80Var2, o5bVarD);
                        d4c.i0(e18Var2, z80Var3, hycVarL2);
                        ij0.t(iHashCode2, e18Var2, z80Var4, e18Var2, bxVar);
                        d4c.i0(e18Var2, z80Var, iqbVarE2);
                        zh4.h(j2, bci.a(qwk.b, e18Var2), ta4Var, e18Var2, 0);
                        e18Var2.p(true);
                        e18Var2.p(true);
                    } else {
                        e18Var2.T();
                    }
                    return iei.a;
                }
            }, e18Var);
            int i3 = i2 >> 12;
            int i4 = (i3 & 896) | (i3 & 112) | 12582918 | ((i2 >> 9) & 57344);
            fqb fqbVar = fqb.E;
            pzg.a(fqbVar, e0gVar, j, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, ta4VarQ0, e18Var, i4, 104);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(iqbVar2, pz7Var, pz7Var2, pz7Var3, e0gVar, j, j2, j3, j4, j5, i) { // from class: mt
                public final /* synthetic */ iqb F;
                public final /* synthetic */ pz7 G;
                public final /* synthetic */ pz7 H;
                public final /* synthetic */ pz7 I;
                public final /* synthetic */ e0g J;
                public final /* synthetic */ long K;
                public final /* synthetic */ long L;
                public final /* synthetic */ long M;
                public final /* synthetic */ long N;
                public final /* synthetic */ long O;

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(7);
                    nt.a(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    public static final void b(final float f, final float f2, final ta4 ta4Var, ld4 ld4Var, final int i) {
        fu9 fu9Var;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-917637668);
        int i2 = (e18Var.c(f2) ? 32 : 16) | i;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            umg umgVar = ve4.n;
            final fu9 fu9Var2 = (fu9) e18Var.j(umgVar);
            int iOrdinal = fu9Var2.ordinal();
            if (iOrdinal == 0) {
                fu9Var = fu9.F;
            } else {
                if (iOrdinal != 1) {
                    wg6.i();
                    return;
                }
                fu9Var = fu9.E;
            }
            j8.c(umgVar.a(fu9Var), fd9.q0(-1986402020, new pz7() { // from class: ft
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ld4 ld4Var2 = (ld4) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    e18 e18Var2 = (e18) ld4Var2;
                    if (e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        unk.c(null, new ho0(f, true, new sz6(1)), new ho0(f2, true, new sz6(1)), null, 0, 0, fd9.q0(879927511, new ii(fu9Var2, 5, ta4Var), e18Var2), e18Var2, 1572864, 57);
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
            r7eVarS.d = new pz7(f, f2, ta4Var, i) { // from class: gt
                public final /* synthetic */ float E;
                public final /* synthetic */ float F;
                public final /* synthetic */ ta4 G;

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(391);
                    nt.b(this.E, this.F, this.G, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    public static final void c(final zy7 zy7Var, final ta4 ta4Var, final iqb iqbVar, final pz7 pz7Var, final pz7 pz7Var2, final pz7 pz7Var3, final pz7 pz7Var4, final e0g e0gVar, final long j, final long j2, final long j3, final long j4, final c36 c36Var, ld4 ld4Var, final int i, final int i2) {
        int i3;
        ta4 ta4Var2;
        pz7 pz7Var5;
        int i4;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-867616355);
        if ((i & 6) == 0) {
            i3 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            ta4Var2 = ta4Var;
            i3 |= e18Var.h(ta4Var2) ? 32 : 16;
        } else {
            ta4Var2 = ta4Var;
        }
        if ((i & 384) == 0) {
            i3 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            pz7Var5 = pz7Var;
            i3 |= e18Var.h(pz7Var5) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            pz7Var5 = pz7Var;
        }
        if ((i & 24576) == 0) {
            i3 |= e18Var.h(pz7Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((i & 196608) == 0) {
            i3 |= e18Var.h(pz7Var3) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= e18Var.h(pz7Var4) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= e18Var.f(e0gVar) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= e18Var.e(j) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= e18Var.e(j2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (e18Var.e(j3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= e18Var.e(j4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= e18Var.c(MTTypesetterKt.kLineSkipLimitMultiplier) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i2 & 3072) == 0) {
            i4 |= e18Var.f(c36Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i5 = i4;
        if (e18Var.Q(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 1171) == 1170) ? false : true)) {
            final ta4 ta4Var3 = ta4Var2;
            final pz7 pz7Var6 = pz7Var5;
            d(zy7Var, iqbVar, c36Var, fd9.q0(527420759, new pz7() { // from class: ht
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ld4 ld4Var2 = (ld4) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i6 = 0;
                    e18 e18Var2 = (e18) ld4Var2;
                    if (e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        nt.a(fd9.q0(1367541877, new kt(ta4Var3, pz7Var6, i6), e18Var2), null, pz7Var2, pz7Var3, pz7Var4, e0gVar, j, p54.d(qwk.a, e18Var2), j2, j3, j4, e18Var2, 6);
                    } else {
                        e18Var2.T();
                    }
                    return iei.a;
                }
            }, e18Var), e18Var, (i3 & 14) | 3072 | ((i3 >> 3) & 112) | ((i5 >> 3) & 896), 0);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: jt
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(i | 1);
                    int iP02 = x44.p0(i2);
                    nt.c(zy7Var, ta4Var, iqbVar, pz7Var, pz7Var2, pz7Var3, pz7Var4, e0gVar, j, j2, j3, j4, c36Var, (ld4) obj, iP0, iP02);
                    return iei.a;
                }
            };
        }
    }

    public static final void d(zy7 zy7Var, iqb iqbVar, c36 c36Var, ta4 ta4Var, ld4 ld4Var, int i, int i2) {
        int i3;
        c36 c36Var2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(24925658);
        if ((i & 6) == 0) {
            i3 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= e18Var.f(c36Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i3 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            if (i4 != 0) {
                c36Var = new c36(7);
            }
            c36 c36Var3 = c36Var;
            ((zp5) e18Var.j(e)).a(new c61(zy7Var, iqbVar, c36Var3, ta4Var, 1), e18Var, 0);
            c36Var2 = c36Var3;
        } else {
            e18Var.T();
            c36Var2 = c36Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new et(zy7Var, iqbVar, c36Var2, ta4Var, i, i2, 0);
        }
    }
}
