package defpackage;

import androidx.compose.foundation.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class pzg {
    public static final xe4 a = new xe4(new wof(13));

    public static final void a(iqb iqbVar, e0g e0gVar, long j, long j2, float f, float f2, qu1 qu1Var, final pz7 pz7Var, ld4 ld4Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            iqbVar = fqb.E;
        }
        if ((i2 & 2) != 0) {
            e0gVar = zni.b;
        }
        if ((i2 & 4) != 0) {
            j = ((gwa) ((e18) ld4Var).j(jwa.a)).a.p;
        }
        if ((i2 & 8) != 0) {
            j2 = p54.b(j, ld4Var);
        }
        if ((i2 & 16) != 0) {
            f = 0.0f;
        }
        if ((i2 & 32) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 64) != 0) {
            qu1Var = null;
        }
        e18 e18Var = (e18) ld4Var;
        xe4 xe4Var = a;
        final float f3 = f + ((va6) e18Var.j(xe4Var)).E;
        hvd[] hvdVarArr = {sq6.m(j2, on4.a), xe4Var.a(new va6(f3))};
        final long j3 = j;
        final e0g e0gVar2 = e0gVar;
        final qu1 qu1Var2 = qu1Var;
        final float f4 = f2;
        final iqb iqbVar2 = iqbVar;
        j8.d(hvdVarArr, fd9.q0(421772006, new pz7() { // from class: ozg
            @Override // defpackage.pz7
            public final Object invoke(Object obj, Object obj2) {
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                boolean zQ = e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2);
                iei ieiVar = iei.a;
                if (!zQ) {
                    e18Var2.T();
                    return ieiVar;
                }
                iqb iqbVarD = pzg.d(iqbVar2, e0gVar2, pzg.e(j3, f3, e18Var2), qu1Var2, ((cz5) e18Var2.j(ve4.h)).q0(f4));
                Object objN = e18Var2.N();
                lz1 lz1Var = jd4.a;
                if (objN == lz1Var) {
                    objN = new yeg(4);
                    e18Var2.k0(objN);
                }
                iqb iqbVarB = tjf.b(iqbVarD, false, (bz7) objN);
                Object objN2 = e18Var2.N();
                if (objN2 == lz1Var) {
                    objN2 = kt5.H;
                    e18Var2.k0(objN2);
                }
                iqb iqbVarA = a0h.a(iqbVarB, ieiVar, (PointerInputEventHandler) objN2);
                o5b o5bVarD = dw1.d(lja.G, true);
                int iHashCode = Long.hashCode(e18Var2.T);
                hyc hycVarL = e18Var2.l();
                iqb iqbVarE = kxk.E(e18Var2, iqbVarA);
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
                sq6.B(0, pz7Var, e18Var2, true);
                return ieiVar;
            }
        }, e18Var), e18Var, 56);
    }

    public static final void b(final boolean z, final zy7 zy7Var, final iqb iqbVar, boolean z2, final e0g e0gVar, final long j, long j2, float f, qu1 qu1Var, zub zubVar, final ta4 ta4Var, ld4 ld4Var, int i, int i2) {
        final boolean z3 = (i2 & 8) != 0 ? true : z2;
        long jB = (i2 & 64) != 0 ? p54.b(j, ld4Var) : j2;
        final float f2 = (i2 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? 0.0f : f;
        final qu1 qu1Var2 = (i2 & 512) != 0 ? null : qu1Var;
        zub zubVar2 = (i2 & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0 ? zubVar : null;
        e18 e18Var = (e18) ld4Var;
        if (zubVar2 == null) {
            e18Var.a0(1528105640);
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = vb7.f(e18Var);
            }
            zubVar2 = (zub) objN;
        } else {
            e18Var.a0(-227801585);
        }
        e18Var.p(false);
        e18 e18Var2 = (e18) ld4Var;
        xe4 xe4Var = a;
        final float f3 = ((va6) e18Var2.j(xe4Var)).E + MTTypesetterKt.kLineSkipLimitMultiplier;
        final zub zubVar3 = zubVar2;
        j8.d(new hvd[]{sq6.m(jB, on4.a), xe4Var.a(new va6(f3))}, fd9.q0(1508735219, new pz7() { // from class: mzg
            @Override // defpackage.pz7
            public final Object invoke(Object obj, Object obj2) {
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var2;
                if (e18Var3.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mo8 mo8Var = z79.a;
                    iqb iqbVarB = iqbVar.B(pkb.E);
                    boolean z4 = ((tue) e18Var3.j(due.a)).a instanceof rue;
                    iqb iqbVarA = fqb.E;
                    zub zubVar4 = zubVar3;
                    e0g e0gVar2 = e0gVar;
                    if (z4) {
                        iqbVarA = d19.a(iqbVarA, zubVar4, due.a(false, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, e0gVar2, true, 7));
                    }
                    iqb iqbVarO = kxk.o(j8.d0(pzg.d(iqbVarB.B(iqbVarA), e0gVar2, pzg.e(j, f3, e18Var3), qu1Var2, ((cz5) e18Var3.j(ve4.h)).q0(f2)), z, zubVar4, due.a(false, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, e0gVar2, !(((tue) e18Var3.j(r3)).a instanceof rue), 215), z3, null, zy7Var));
                    o5b o5bVarD = dw1.d(lja.G, true);
                    int iHashCode = Long.hashCode(e18Var3.T);
                    hyc hycVarL = e18Var3.l();
                    iqb iqbVarE = kxk.E(e18Var3, iqbVarO);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var3.e0();
                    if (e18Var3.S) {
                        e18Var3.k(re4Var);
                    } else {
                        e18Var3.n0();
                    }
                    d4c.i0(e18Var3, cd4.f, o5bVarD);
                    d4c.i0(e18Var3, cd4.e, hycVarL);
                    d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var3, cd4.h);
                    d4c.i0(e18Var3, cd4.d, iqbVarE);
                    vb7.y(0, ta4Var, e18Var3, true);
                } else {
                    e18Var3.T();
                }
                return iei.a;
            }
        }, e18Var2), e18Var2, 56);
    }

    public static final void c(final zy7 zy7Var, iqb iqbVar, boolean z, final e0g e0gVar, final long j, long j2, float f, float f2, qu1 qu1Var, zub zubVar, final ta4 ta4Var, ld4 ld4Var, int i, int i2) {
        final iqb iqbVar2 = (i2 & 2) != 0 ? fqb.E : iqbVar;
        final boolean z2 = (i2 & 4) != 0 ? true : z;
        long jB = (i2 & 32) != 0 ? p54.b(j, ld4Var) : j2;
        float f3 = (i2 & 64) != 0 ? 0.0f : f;
        final float f4 = (i2 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? 0.0f : f2;
        final qu1 qu1Var2 = (i2 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : qu1Var;
        zub zubVar2 = (i2 & 512) == 0 ? zubVar : null;
        e18 e18Var = (e18) ld4Var;
        if (zubVar2 == null) {
            e18Var.a0(-1701074900);
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = vb7.f(e18Var);
            }
            zubVar2 = (zub) objN;
        } else {
            e18Var.a0(2023335947);
        }
        e18Var.p(false);
        e18 e18Var2 = (e18) ld4Var;
        xe4 xe4Var = a;
        final float f5 = ((va6) e18Var2.j(xe4Var)).E + f3;
        final zub zubVar3 = zubVar2;
        j8.d(new hvd[]{sq6.m(jB, on4.a), xe4Var.a(new va6(f5))}, fd9.q0(849208527, new pz7() { // from class: nzg
            @Override // defpackage.pz7
            public final Object invoke(Object obj, Object obj2) {
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var2;
                if (e18Var3.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mo8 mo8Var = z79.a;
                    iqb iqbVarB = iqbVar2.B(pkb.E);
                    boolean z3 = ((tue) e18Var3.j(due.a)).a instanceof rue;
                    iqb iqbVarA = fqb.E;
                    zub zubVar4 = zubVar3;
                    e0g e0gVar2 = e0gVar;
                    if (z3) {
                        iqbVarA = d19.a(iqbVarA, zubVar4, due.a(false, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, e0gVar2, true, 7));
                    }
                    iqb iqbVarO = kxk.o(b.b(pzg.d(iqbVarB.B(iqbVarA), e0gVar2, pzg.e(j, f5, e18Var3), qu1Var2, ((cz5) e18Var3.j(ve4.h)).q0(f4)), zubVar4, due.a(false, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, e0gVar2, !(((tue) e18Var3.j(r3)).a instanceof rue), 215), z2, null, null, zy7Var, 24));
                    o5b o5bVarD = dw1.d(lja.G, true);
                    int iHashCode = Long.hashCode(e18Var3.T);
                    hyc hycVarL = e18Var3.l();
                    iqb iqbVarE = kxk.E(e18Var3, iqbVarO);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var3.e0();
                    if (e18Var3.S) {
                        e18Var3.k(re4Var);
                    } else {
                        e18Var3.n0();
                    }
                    d4c.i0(e18Var3, cd4.f, o5bVarD);
                    d4c.i0(e18Var3, cd4.e, hycVarL);
                    d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var3, cd4.h);
                    d4c.i0(e18Var3, cd4.d, iqbVarE);
                    vb7.y(0, ta4Var, e18Var3, true);
                } else {
                    e18Var3.T();
                }
                return iei.a;
            }
        }, e18Var2), e18Var2, 56);
    }

    public static final iqb d(iqb iqbVar, e0g e0gVar, long j, qu1 qu1Var, float f) {
        iqb iqbVarU = fqb.E;
        iqb iqbVarB = iqbVar.B(f > MTTypesetterKt.kLineSkipLimitMultiplier ? xn5.j0(iqbVarU, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, f, MTTypesetterKt.kLineSkipLimitMultiplier, e0gVar, false, 518111) : iqbVarU);
        if (qu1Var != null) {
            iqbVarU = ez1.u(iqbVarU, qu1Var.a, qu1Var.b, e0gVar);
        }
        return xn5.V(yfd.p(iqbVarB.B(iqbVarU), j, e0gVar), e0gVar);
    }

    public static final long e(long j, float f, e18 e18Var) {
        n54 n54Var = ((gwa) e18Var.j(jwa.a)).a;
        boolean zBooleanValue = ((Boolean) e18Var.j(p54.a)).booleanValue();
        long j2 = n54Var.p;
        return (d54.c(j, j2) && zBooleanValue) ? va6.b(f, MTTypesetterKt.kLineSkipLimitMultiplier) ? j2 : d4c.I(d54.b(((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f, n54Var.t), j2) : j;
    }
}
