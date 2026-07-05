package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tu5 {
    public static final tu5 a = new tu5();

    public final void a(g5c g5cVar, ld4 ld4Var, int i) {
        kqc kqcVar = (kqc) g5cVar.G;
        moh mohVar = (moh) g5cVar.O;
        hoh hohVar = (hoh) g5cVar.I;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-59484306);
        int i2 = (e18Var.h(g5cVar) ? 4 : 2) | i;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            fu9 fu9Var = (fu9) e18Var.j(ve4.n);
            ue7 ue7Var = mohVar.f;
            fj0 fj0Var = (fj0) g5cVar.H;
            boolean zF = e18Var.f(hohVar) | e18Var.d(fu9Var.ordinal());
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                if (fu9Var == fu9.F) {
                    hohVar = new hoh(hohVar.b, hohVar.a);
                }
                e18Var.k0(hohVar);
                objN = hohVar;
            }
            hoh hohVar2 = (hoh) objN;
            toh tohVarX = fj0Var.x();
            ta4 ta4Var = (ta4) g5cVar.J;
            ta4 ta4Var2 = (ta4) g5cVar.K;
            pz7 pz7Var = (pz7) g5cVar.L;
            if (pz7Var == null) {
                pz7Var = gvk.a;
            }
            int i3 = 4;
            List listX = x44.X(ta4Var, ta4Var2, pz7Var, fd9.q0(-1040725425, new a21(9, g5cVar), e18Var), fd9.q0(-2077735826, new a21(10, tohVarX), e18Var));
            boolean zF2 = e18Var.f((vpc) g5cVar.M);
            Object objN2 = e18Var.N();
            if (zF2 || objN2 == lz1Var) {
                foh fohVar = new foh(kqcVar, tohVarX, (vpc) g5cVar.M, hohVar2, mohVar);
                e18Var.k0(fohVar);
                objN2 = fohVar;
            }
            foh fohVar2 = (foh) objN2;
            fohVar2.c.setValue(kqcVar);
            fohVar2.d.setValue(tohVarX);
            fohVar2.e.setValue(hohVar2);
            kxk.a(fj0Var, ue7Var, e18Var, 0);
            iqb iqbVarI0 = xn5.i0((iqb) g5cVar.F, new tz9(15, ue7Var));
            ta4 ta4Var3 = new ta4(1271844412, true, new z0(i3, listX));
            boolean zF3 = e18Var.f(fohVar2);
            Object objN3 = e18Var.N();
            if (zF3 || objN3 == lz1Var) {
                objN3 = new mtb(fohVar2);
                e18Var.k0(objN3);
            }
            o5b o5bVar = (o5b) objN3;
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarI0);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVar);
            d4c.i0(e18Var, cd4.e, hycVarL);
            z80 z80Var = cd4.g;
            if (e18Var.S || !x44.r(e18Var.N(), Integer.valueOf(iHashCode))) {
                e18Var.k0(Integer.valueOf(iHashCode));
                e18Var.b(z80Var, Integer.valueOf(iHashCode));
            }
            d4c.i0(e18Var, cd4.d, iqbVarE);
            vb7.y(0, ta4Var3, e18Var, true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ow1(this, g5cVar, i, 23);
        }
    }
}
