package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class p80 extends hqb implements qn0 {
    public zy7 S;
    public bz7 T;
    public mma U;
    public boolean V;
    public final h80 W;

    public p80(zy7 zy7Var, kl7 kl7Var, bz7 bz7Var, mma mmaVar, boolean z) {
        this.S = zy7Var;
        this.T = bz7Var;
        this.U = mmaVar;
        this.V = z;
        h80 h80Var = new h80();
        h80Var.E = kl7Var;
        h80Var.F = new rv1(0);
        h80Var.G = new rv1(0);
        h80Var.H = sf5.a;
        this.W = h80Var;
    }

    @Override // defpackage.qn0
    public final p5b D0(rn0 rn0Var, h5b h5bVar, long j) {
        boolean z = this.V;
        nm6 nm6Var = nm6.E;
        if (!z) {
            c3d c3dVarU = h5bVar.u(j);
            return rn0Var.U(c3dVarU.E, c3dVarU.F, nm6Var, new b1(c3dVarU, 1));
        }
        c79 c79VarO = this.W.o(((Number) this.S.a()).floatValue());
        int iF = c79VarO.f();
        int iC = c79VarO.c();
        if (!((iC >= 0) & (iF >= 0))) {
            d39.a("width and height must be >= 0");
        }
        c3d c3dVarU2 = h5bVar.u(sl4.h(iF, iF, iC, iC));
        return rn0Var.U(c3dVarU2.E, c3dVarU2.F, nm6Var, new l6(this, c79VarO, c3dVarU2, 4));
    }

    @Override // defpackage.qn0
    public final boolean Q() {
        return this.V && ((Number) this.S.a()).floatValue() != 1.0f;
    }

    @Override // defpackage.qn0, defpackage.pu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        c3d c3dVarU = h5bVar.u(j);
        long j2 = (((long) c3dVarU.F) & 4294967295L) | (((long) c3dVarU.E) << 32);
        h80 h80Var = this.W;
        rv1 rv1Var = (rv1) h80Var.G;
        if (!g79.b(rv1Var.b, j2)) {
            ((rv1) h80Var.F).b = !((c79) h80Var.H).equals(sf5.a) ? ((c79) h80Var.H).d() : j2;
            rv1Var.b = j2;
        }
        return q5bVar.U(c3dVarU.E, c3dVarU.F, nm6.E, new l0(this, 12, c3dVarU));
    }

    @Override // defpackage.qn0
    public final boolean z(gma gmaVar, cu9 cu9Var) {
        return this.V && ((Number) this.S.a()).floatValue() != 1.0f;
    }
}
