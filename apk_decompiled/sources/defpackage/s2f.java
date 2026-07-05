package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s2f extends hqb implements qn0 {
    public zy7 S;
    public bz7 T;
    public mma U;
    public boolean V;
    public final el5 W;

    public s2f(zy7 zy7Var, kl7 kl7Var, bz7 bz7Var, mma mmaVar, boolean z) {
        kl7Var.getClass();
        mmaVar.getClass();
        this.S = zy7Var;
        this.T = bz7Var;
        this.U = mmaVar;
        this.V = z;
        this.W = new el5(kl7Var);
    }

    @Override // defpackage.qn0
    public final p5b D0(rn0 rn0Var, h5b h5bVar, long j) {
        rn0Var.getClass();
        h5bVar.getClass();
        boolean z = this.V;
        nm6 nm6Var = nm6.E;
        if (!z) {
            c3d c3dVarU = h5bVar.u(j);
            return rn0Var.U(c3dVarU.E, c3dVarU.F, nm6Var, new mf1(c3dVarU, 4));
        }
        c79 c79VarJ = this.W.J(((Number) this.S.a()).floatValue());
        int iF = c79VarJ.f();
        if (iF < 0) {
            iF = 0;
        }
        int iC = c79VarJ.c();
        if (iC < 0) {
            iC = 0;
        }
        if (!((iC >= 0) & (iF >= 0))) {
            d39.a("width and height must be >= 0");
        }
        c3d c3dVarU2 = h5bVar.u(sl4.h(iF, iF, iC, iC));
        return rn0Var.U(c3dVarU2.E, c3dVarU2.F, nm6Var, new nf1(this, c79VarJ, c3dVarU2, 19));
    }

    @Override // defpackage.qn0
    public final boolean Q() {
        return this.V && ((Number) this.S.a()).floatValue() != 1.0f;
    }

    @Override // defpackage.qn0, defpackage.pu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        h5bVar.getClass();
        c3d c3dVarU = h5bVar.u(j);
        long j2 = (((long) c3dVarU.F) & 4294967295L) | (((long) c3dVarU.E) << 32);
        el5 el5Var = this.W;
        qv1 qv1Var = (qv1) el5Var.G;
        if (!g79.b(qv1Var.b, j2)) {
            ((qv1) el5Var.F).b = !((c79) el5Var.H).equals(dgj.d) ? ((c79) el5Var.H).d() : j2;
            qv1Var.b = j2;
        }
        return q5bVar.U(c3dVarU.E, c3dVarU.F, nm6.E, new vk3(this, 29, c3dVarU));
    }

    @Override // defpackage.qn0
    public final boolean z(gma gmaVar, cu9 cu9Var) {
        gmaVar.getClass();
        cu9Var.getClass();
        return this.V && ((Number) this.S.a()).floatValue() != 1.0f;
    }
}
