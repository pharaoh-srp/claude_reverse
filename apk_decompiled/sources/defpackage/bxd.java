package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class bxd {
    public static final bxd a = new bxd();
    public static final vve b = xve.a;
    public static final float c = 80.0f;
    public static final float d = 80.0f;
    public static final float e = 3.0f;

    public final void a(final mxd mxdVar, final boolean z, final iqb iqbVar, long j, long j2, float f, ld4 ld4Var, final int i) {
        final long j3;
        final long j4;
        final float f2;
        int i2;
        float f3;
        long j5;
        long j6;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1076870256);
        int i3 = i | (e18Var.f(mxdVar) ? 4 : 2) | (e18Var.g(z) ? 32 : 16) | (e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 74752;
        if (e18Var.Q(i3 & 1, (599187 & i3) != 599186)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                umg umgVar = jwa.a;
                long j7 = ((gwa) e18Var.j(umgVar)).a.G;
                long j8 = ((gwa) e18Var.j(umgVar)).a.s;
                i2 = i3 & (-523265);
                f3 = d;
                j5 = j8;
                j6 = j7;
            } else {
                e18Var.T();
                i2 = i3 & (-523265);
                j6 = j;
                j5 = j2;
                f3 = f;
            }
            e18Var.q();
            b(mxdVar, z, iqbVar, f3, null, j6, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(298232649, new bf7(z, j5, mxdVar), e18Var), e18Var, (i2 & 896) | (i2 & 14) | 12582912 | (i2 & 112) | 100663296);
            f2 = f3;
            j3 = j6;
            j4 = j5;
        } else {
            e18Var.T();
            j3 = j;
            j4 = j2;
            f2 = f;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(mxdVar, z, iqbVar, j3, j4, f2, i) { // from class: vwd
                public final /* synthetic */ mxd F;
                public final /* synthetic */ boolean G;
                public final /* synthetic */ iqb H;
                public final /* synthetic */ long I;
                public final /* synthetic */ long J;
                public final /* synthetic */ float K;

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(1572865);
                    this.E.a(this.F, this.G, this.H, this.I, this.J, this.K, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    public final void b(final mxd mxdVar, final boolean z, final iqb iqbVar, final float f, e0g e0gVar, final long j, float f2, final ta4 ta4Var, ld4 ld4Var, final int i) {
        final mxd mxdVar2;
        int i2;
        bxd bxdVar;
        final e0g e0gVar2;
        final float f3;
        int i3;
        e0g e0gVar3;
        final e0g e0gVar4;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1341144489);
        if ((i & 6) == 0) {
            mxdVar2 = mxdVar;
            i2 = (e18Var.f(mxdVar2) ? 4 : 2) | i;
        } else {
            mxdVar2 = mxdVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.c(f) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.e(j) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= e18Var.h(ta4Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            bxdVar = this;
            i2 |= e18Var.f(bxdVar) ? 67108864 : 33554432;
        } else {
            bxdVar = this;
        }
        if (e18Var.Q(i2 & 1, (38347923 & i2) != 38347922)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                i3 = i2 & (-3727361);
                e0gVar3 = b;
                f3 = e;
            } else {
                e18Var.T();
                i3 = i2 & (-3727361);
                e0gVar3 = e0gVar;
                f3 = f2;
            }
            int i4 = i3;
            e18Var.q();
            int i5 = fxd.a;
            iqb iqbVarO = b.o(iqbVar, 40.0f);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new f9c(25);
                e18Var.k0(objN);
            }
            iqb iqbVarU = zni.u(iqbVarO, (bz7) objN);
            boolean zC = ((i4 & 112) == 32) | ((i4 & 14) == 4) | ((((i4 & 7168) ^ 3072) > 2048 && e18Var.c(f)) || (i4 & 3072) == 2048) | e18Var.c(f3) | e18Var.f(e0gVar3);
            Object objN2 = e18Var.N();
            if (zC || objN2 == lz1Var) {
                e0gVar4 = e0gVar3;
                rz7 rz7Var = new rz7() { // from class: xwd
                    @Override // defpackage.rz7
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        final c3d c3dVarU = ((h5b) obj2).u(((rl4) obj3).a);
                        int i6 = c3dVarU.E;
                        int i7 = c3dVarU.F;
                        final mxd mxdVar3 = mxdVar2;
                        final boolean z2 = z;
                        final float f4 = f;
                        final float f5 = f3;
                        final e0g e0gVar5 = e0gVar4;
                        return ((q5b) obj).U(i6, i7, nm6.E, new bz7() { // from class: zwd
                            @Override // defpackage.bz7
                            public final Object invoke(Object obj4) {
                                final mxd mxdVar4 = mxdVar3;
                                final boolean z3 = z2;
                                final float f6 = f4;
                                final float f7 = f5;
                                final e0g e0gVar6 = e0gVar5;
                                b3d.n((b3d) obj4, c3dVarU, 0, 0, new bz7() { // from class: axd
                                    @Override // defpackage.bz7
                                    public final Object invoke(Object obj5) {
                                        xre xreVar = (xre) obj5;
                                        mxd mxdVar5 = mxdVar4;
                                        float fA = mxdVar5.a();
                                        float density = MTTypesetterKt.kLineSkipLimitMultiplier;
                                        boolean z4 = fA > MTTypesetterKt.kLineSkipLimitMultiplier || z3;
                                        xreVar.w((mxdVar5.a() * xreVar.M0(f6)) - Float.intBitsToFloat((int) (xreVar.V & 4294967295L)));
                                        if (z4) {
                                            density = xreVar.W.getDensity() * f7;
                                        }
                                        xreVar.n(density);
                                        xreVar.o(e0gVar6);
                                        xreVar.d(true);
                                        return iei.a;
                                    }
                                }, 4);
                                return iei.a;
                            }
                        });
                    }
                };
                e18Var.k0(rz7Var);
                objN2 = rz7Var;
            } else {
                e0gVar4 = e0gVar3;
            }
            iqb iqbVarP = yfd.p(fd9.h0(iqbVarU, (rz7) objN2), j, e0gVar4);
            int i6 = ((i4 >> 12) & 7168) | 48;
            o5b o5bVarD = dw1.d(lja.K, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarP);
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
            ta4Var.invoke(nw1.a, e18Var, Integer.valueOf(((i6 >> 6) & 112) | 6));
            e18Var.p(true);
            e0gVar2 = e0gVar4;
        } else {
            e18Var.T();
            e0gVar2 = e0gVar;
            f3 = f2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final bxd bxdVar2 = bxdVar;
            r7eVarS.d = new pz7() { // from class: ywd
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.E.b(mxdVar, z, iqbVar, f, e0gVar2, j, f3, ta4Var, (ld4) obj, x44.p0(i | 1));
                    return iei.a;
                }
            };
        }
    }
}
