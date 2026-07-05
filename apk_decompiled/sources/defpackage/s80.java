package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s80 extends hqb implements qn0 {
    public p3f S;
    public qoh T;
    public boolean U;
    public long V;
    public long W;
    public a5h X;

    @Override // defpackage.qn0
    public final p5b D0(rn0 rn0Var, h5b h5bVar, long j) {
        float fFloatValue = ((Number) this.X.f((long) (r0.b() * ((Number) this.S.a()).floatValue()))).floatValue();
        c3d c3dVarU = h5bVar.u(j);
        return rn0Var.U(c3dVarU.E, c3dVarU.F, nm6.E, new k10(c3dVarU, fFloatValue, this, 1));
    }

    @Override // defpackage.qn0
    public final boolean Q() {
        return false;
    }

    @Override // defpackage.qn0
    public final boolean z(gma gmaVar, cu9 cu9Var) {
        qoh qohVar = this.T;
        cu9 cu9VarJ = qohVar.j(gmaVar);
        cu9 cu9VarC = gmaVar.c();
        cu9VarC.getClass();
        long jA0 = yfd.a0(qohVar.f(cu9VarJ, cu9VarC));
        if (!y69.b(this.W, jA0)) {
            this.V = this.W;
            this.W = jA0;
        }
        return (!this.U || y69.b(this.V, -9223372034707292160L) || y69.b(this.V, this.W) || ((Number) this.S.a()).floatValue() == 1.0f) ? false : true;
    }
}
