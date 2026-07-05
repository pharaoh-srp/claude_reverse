package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ryb {
    public static final float a = ttj.l;
    public static final float b = 8.0f;
    public static final float c = 4.0f;
    public static final float d = 16.0f;
    public static final float e = 4.0f;
    public static final float f = 12.0f;
    public static final float g = 44.0f;
    public static final xe4 h = new xe4(new ulb(28));

    public static final void a(long j, long j2, wbj wbjVar, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        wbj a5aVar;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1054099326);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(fqb.E) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.e(j2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 = i2 | 11264;
        }
        if ((196608 & i) == 0) {
            i3 |= e18Var.h(ta4Var) ? 131072 : 65536;
        }
        if (e18Var.Q(i3 & 1, (74899 & i3) != 74898)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                a5aVar = new a5a(kxk.y(e18Var), 15 | 32);
            } else {
                e18Var.T();
                a5aVar = wbjVar;
            }
            e18Var.q();
            ss5 ss5Var = (ss5) e18Var.j(h);
            hw1 hw1Var = new hw1();
            hw1Var.E = j;
            hw1Var.F = j2;
            hw1Var.G = a5aVar;
            hw1Var.H = ta4Var;
            ss5Var.a(hw1Var, e18Var, 0);
        } else {
            e18Var.T();
            a5aVar = wbjVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new oyb(j, j2, a5aVar, ta4Var, i);
        }
    }

    public static final void b(dxe dxeVar, boolean z, zy7 zy7Var, ta4 ta4Var, iqb iqbVar, boolean z2, pz7 pz7Var, boolean z3, kyb kybVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        kyb kybVar2;
        iqb iqbVar2;
        boolean z4;
        boolean z5;
        iqb iqbVar3;
        boolean z6;
        boolean z7;
        boolean z8;
        ta4 ta4VarQ0;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(974293026);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(dxeVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.h(ta4Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i3 = i2 | 221184;
        if ((1572864 & i) == 0) {
            i3 |= e18Var2.h(pz7Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        int i4 = i3 | 12582912;
        if ((100663296 & i) == 0) {
            i4 |= e18Var2.f(kybVar) ? 67108864 : 33554432;
        }
        int i5 = i4 | 805306368;
        if (e18Var2.Q(i5 & 1, (306783379 & i5) != 306783378)) {
            e18Var2.V();
            if ((i & 1) == 0 || e18Var2.A()) {
                iqbVar3 = fqb.E;
                z6 = true;
                z7 = true;
            } else {
                e18Var2.T();
                iqbVar3 = iqbVar;
                z6 = z2;
                z7 = z3;
            }
            e18Var2.q();
            e18Var2.a0(-224975399);
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = vb7.f(e18Var2);
            }
            zub zubVar = (zub) objN;
            e18Var2.p(false);
            asb asbVar = asb.G;
            yig yigVarP = u00.P(asbVar, e18Var2);
            boolean z9 = z7;
            ta4 ta4VarQ02 = fd9.q0(-876637252, new pyb(kybVar, z, z6, yigVarP, pz7Var, z7, ta4Var), e18Var2);
            if (pz7Var == null) {
                e18Var2.a0(-224048562);
                e18Var2.p(false);
                ta4VarQ0 = null;
                z8 = z9;
                kybVar2 = kybVar;
            } else {
                e18Var2.a0(-224048561);
                z8 = z9;
                kybVar2 = kybVar;
                ta4VarQ0 = fd9.q0(802208206, new iw0(kybVar, z, z6, yigVarP, pz7Var), e18Var2);
                e18Var2.p(false);
            }
            ta4 ta4Var2 = ta4VarQ0;
            Object objN2 = e18Var2.N();
            if (objN2 == lz1Var) {
                objN2 = vb7.g(0, e18Var2);
            }
            isc iscVar = (isc) objN2;
            boolean z10 = z6;
            iqb iqbVar4 = iqbVar3;
            iqb iqbVarD0 = j8.d0(iqbVar4, z, zubVar, null, z10, new vue(4), zy7Var);
            iqbVar2 = iqbVar4;
            float f2 = a;
            float f3 = MTTypesetterKt.kLineSkipLimitMultiplier;
            iqb iqbVarA = dxeVar.a(b.b(iqbVarD0, MTTypesetterKt.kLineSkipLimitMultiplier, f2, 1), 1.0f, true);
            Object objN3 = e18Var2.N();
            if (objN3 == lz1Var) {
                objN3 = new tn(iscVar, 6);
                e18Var2.k0(objN3);
            }
            iqb iqbVarV0 = wd6.v0(iqbVarA, (bz7) objN3);
            o5b o5bVarD = dw1.d(lja.K, true);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarV0);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, o5bVarD);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            float f4 = z ? 1.0f : 0.0f;
            yig yigVarP2 = u00.P(asbVar, e18Var2);
            e18Var = e18Var2;
            int i6 = 1;
            wlg wlgVarB = n80.b(f4, yigVarP2, null, e18Var, 0, 28);
            if (z) {
                f3 = 1.0f;
            }
            wlg wlgVarB2 = n80.b(f3, u00.P(asb.F, e18Var), null, e18Var, 0, 28);
            cz5 cz5Var = (cz5) e18Var.j(ve4.h);
            boolean zF = e18Var.f(cz5Var);
            Object objN4 = e18Var.N();
            if (zF || objN4 == lz1Var) {
                objN4 = new ft9(cz5Var, 26, iscVar);
                e18Var.k0(objN4);
            }
            zy7 zy7Var2 = (zy7) objN4;
            boolean zF2 = e18Var.f(zubVar) | e18Var.f(zy7Var2);
            Object objN5 = e18Var.N();
            if (zF2 || objN5 == lz1Var) {
                objN5 = new ota(zubVar, zy7Var2);
                e18Var.k0(objN5);
            }
            ta4 ta4VarQ03 = fd9.q0(-2082182507, new ska(10, (ota) objN5), e18Var);
            ta4 ta4VarQ04 = fd9.q0(-799524251, new lpa(wlgVarB, 11, kybVar2), e18Var);
            boolean zF3 = e18Var.f(wlgVarB);
            Object objN6 = e18Var.N();
            if (zF3 || objN6 == lz1Var) {
                objN6 = new cnb(wlgVarB, 2);
                e18Var.k0(objN6);
            }
            zy7 zy7Var3 = (zy7) objN6;
            boolean zF4 = e18Var.f(wlgVarB2);
            Object objN7 = e18Var.N();
            if (zF4 || objN7 == lz1Var) {
                objN7 = new cnb(wlgVarB2, i6);
                e18Var.k0(objN7);
            }
            boolean z11 = z8;
            c(ta4VarQ03, ta4VarQ04, ta4VarQ02, ta4Var2, z11, zy7Var3, (zy7) objN7, e18Var, ((i5 >> 9) & 57344) | 438);
            e18Var.p(true);
            z4 = z10;
            z5 = z11;
        } else {
            e18Var = e18Var2;
            kybVar2 = kybVar;
            e18Var.T();
            iqbVar2 = iqbVar;
            z4 = z2;
            z5 = z3;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ss(dxeVar, z, zy7Var, ta4Var, iqbVar2, z4, pz7Var, z5, kybVar2, i);
        }
    }

    public static final void c(ta4 ta4Var, ta4 ta4Var2, ta4 ta4Var3, pz7 pz7Var, boolean z, zy7 zy7Var, zy7 zy7Var2, ld4 ld4Var, int i) {
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        pz7 pz7Var2 = pz7Var;
        zy7 zy7Var3 = zy7Var;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1019541078);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (e18Var.h(ta4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(ta4Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(ta4Var3) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(pz7Var2) ? 2048 : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.g(z) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.h(zy7Var3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var.h(zy7Var2) ? 1048576 : 524288;
        }
        if (e18Var.Q(i2 & 1, (599187 & i2) != 599186)) {
            p6 p6Var = new p6(i3);
            fqb fqbVar = fqb.E;
            iqb iqbVarH0 = fd9.h0(fqbVar, p6Var);
            int i4 = 57344 & i2;
            boolean z5 = ((i2 & 7168) == 2048) | ((3670016 & i2) == 1048576) | (i4 == 16384);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (z5 || objN == lz1Var) {
                objN = new qyb(zy7Var2, pz7Var2, z);
                e18Var.k0(objN);
            }
            o5b o5bVar = (o5b) objN;
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarH0);
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
            int i5 = i2;
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            ta4Var.invoke(e18Var, Integer.valueOf(i5 & 14));
            ta4Var2.invoke(e18Var, Integer.valueOf((i5 >> 3) & 14));
            iqb iqbVarL = zni.L(fqbVar, "icon");
            xo1 xo1Var = lja.G;
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarL);
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
            vb7.y((i5 >> 6) & 14, ta4Var3, e18Var, true);
            if (pz7Var != null) {
                e18Var.a0(-660471321);
                iqb iqbVarL2 = zni.L(fqbVar, "label");
                boolean z6 = (i4 == 16384) | ((i5 & 458752) == 131072);
                Object objN2 = e18Var.N();
                if (z6 || objN2 == lz1Var) {
                    z2 = z;
                    zy7Var3 = zy7Var;
                    z4 = false;
                    objN2 = new lyb(z2, zy7Var3, 0);
                    e18Var.k0(objN2);
                } else {
                    z2 = z;
                    zy7Var3 = zy7Var;
                    z4 = false;
                }
                iqb iqbVarI0 = xn5.i0(iqbVarL2, (bz7) objN2);
                o5b o5bVarD2 = dw1.d(xo1Var, z4);
                int iHashCode3 = Long.hashCode(e18Var.T);
                hyc hycVarL3 = e18Var.l();
                iqb iqbVarE3 = kxk.E(e18Var, iqbVarI0);
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
                pz7Var2 = pz7Var;
                z3 = true;
                vb7.z((i5 >> 9) & 14, pz7Var2, e18Var, true, false);
            } else {
                pz7Var2 = pz7Var;
                z2 = z;
                zy7Var3 = zy7Var;
                z3 = true;
                e18Var.a0(-660200319);
                e18Var.p(false);
            }
            e18Var.p(z3);
        } else {
            z2 = z;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new de3(ta4Var, ta4Var2, ta4Var3, pz7Var2, z2, zy7Var3, zy7Var2, i);
        }
    }
}
