package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q3g extends hqb implements pu9, lbc, vd6, oe4 {
    public k3g S;

    @Override // defpackage.lbc
    public final void F0() {
        this.S.e();
        d4c.a0(this, this.S.H);
    }

    @Override // defpackage.vd6
    public final void I0(cv9 cv9Var) {
        l9e l9eVarC;
        fj0 fj0Var;
        cv9Var.a();
        k3g k3gVar = this.S;
        ib2 ib2Var = cv9Var.E;
        kdg kdgVar = k3gVar.K;
        if (kdgVar.size() > 1) {
            a54.s0(kdgVar, new iec(7));
        }
        int size = kdgVar.size();
        for (int i = 0; i < size; i++) {
            h2g h2gVar = (h2g) kdgVar.get(i);
            ja8 ja8Var = (ja8) h2gVar.Q.getValue();
            if (ja8Var != null && (l9eVarC = h2gVar.d().c.a().c()) != null && h2gVar.f()) {
                long jH = l9eVarC.h();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (jH >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jH & 4294967295L));
                c40 c40Var = h2gVar.N;
                if (c40Var != null) {
                    fj0 fj0Var2 = ib2Var.F;
                    fj0Var = ib2Var.F;
                    long jW = fj0Var2.w();
                    fj0Var2.p().g();
                    try {
                        ((efe) fj0Var2.E).j(c40Var);
                        ((efe) fj0Var.E).G(fIntBitsToFloat, fIntBitsToFloat2);
                        try {
                            csg.t(cv9Var, ja8Var);
                        } finally {
                        }
                    } finally {
                        grc.y(fj0Var2, jW);
                    }
                } else {
                    fj0 fj0Var3 = ib2Var.F;
                    fj0Var = ib2Var.F;
                    ((efe) fj0Var3.E).G(fIntBitsToFloat, fIntBitsToFloat2);
                    try {
                        csg.t(cv9Var, ja8Var);
                    } finally {
                    }
                }
            }
        }
    }

    @Override // defpackage.pu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        c3d c3dVarU = h5bVar.u(j);
        return q5bVar.U(c3dVarU.E, c3dVarU.F, nm6.E, new v80(q5bVar, this, c3dVarU, 6));
    }

    @Override // defpackage.hqb
    public final void h1() {
        d4c.a0(this, this.S.H);
        this.S.getClass();
    }

    @Override // defpackage.hqb
    public final void i1() {
        this.S.getClass();
    }
}
