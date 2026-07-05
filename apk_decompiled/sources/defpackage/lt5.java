package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes.dex */
public final class lt5 {
    public static final lt5 a = new lt5();

    public final void a(a8g a8gVar, ld4 ld4Var, int i) {
        float f = a8gVar.h;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(2137486921);
        int i2 = 2;
        int i3 = i | (e18Var.f(a8gVar) ? 4 : 2);
        if (e18Var.Q(i3 & 1, (i3 & 3) != 2)) {
            m2i m2iVar = a8gVar.k;
            if (Float.isNaN(f) || (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) >= 2139095040) {
                sz6.p("The expandedHeight is expected to be specified and finite");
                return;
            }
            boolean zF = e18Var.f(m2iVar) | e18Var.f(null);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                objN = mpk.w(new im(1, a8gVar));
                e18Var.k0(objN);
            }
            wlg wlgVarA = f8g.a(((d54) ((wlg) objN).getValue()).a, u00.P(asb.G, e18Var), null, e18Var, 0, 12);
            ta4 ta4VarQ0 = fd9.q0(-1658896622, new a21(8, a8gVar), e18Var);
            e18Var.a0(690075377);
            e18Var.p(false);
            iqb iqbVar = a8gVar.a;
            fqb fqbVar = fqb.E;
            iqb iqbVarB = iqbVar.B(fqbVar);
            boolean zF2 = e18Var.f(wlgVarA);
            Object objN2 = e18Var.N();
            if (zF2 || objN2 == lz1Var) {
                objN2 = new ma0(wlgVarA, i2);
                e18Var.k0(objN2);
            }
            iqb iqbVarS = zni.s(iqbVarB, (bz7) objN2);
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = new xg5(5);
                e18Var.k0(objN3);
            }
            iqb iqbVarB2 = tjf.b(iqbVarS, false, (bz7) objN3);
            Object objN4 = e18Var.N();
            if (objN4 == lz1Var) {
                objN4 = kt5.F;
                e18Var.k0(objN4);
            }
            iqb iqbVarA = a0h.a(iqbVarB2, iei.a, (PointerInputEventHandler) objN4);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarA);
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
            iqb iqbVarW = xn5.W(knk.M(fqbVar, a8gVar.j));
            xe4 xe4Var = eg0.a;
            boolean z = (i3 & 14) == 4;
            Object objN5 = e18Var.N();
            if (z || objN5 == lz1Var) {
                objN5 = new jt5();
                e18Var.k0(objN5);
            }
            to7 to7Var = (to7) objN5;
            long j = m2iVar.c;
            long j2 = m2iVar.d;
            long j3 = m2iVar.e;
            long j4 = m2iVar.f;
            pz7 pz7Var = a8gVar.b;
            tkh tkhVar = a8gVar.c;
            tkh tkhVar2 = a8gVar.d;
            vo1 vo1Var = a8gVar.e;
            pz7 pz7Var2 = a8gVar.f;
            float f2 = a8gVar.h;
            mnc mncVar = a8gVar.i;
            Object objN6 = e18Var.N();
            if (objN6 == lz1Var) {
                objN6 = new rk3(17);
                e18Var.k0(objN6);
            }
            eg0.e(iqbVarW, to7Var, j, j2, j4, j3, pz7Var, tkhVar, tkhVar2, (zy7) objN6, ko0.e, vo1Var, 0, false, pz7Var2, ta4VarQ0, f2, mncVar, e18Var, 0, 1600566);
            e18Var = e18Var;
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ow1(this, a8gVar, i, 22);
        }
    }
}
