package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eij extends hqb implements pu9 {
    public e56 S;
    public boolean T;
    public pz7 U;

    @Override // defpackage.pu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        e56 e56Var = this.S;
        e56 e56Var2 = e56.E;
        int iJ = e56Var != e56Var2 ? 0 : rl4.j(j);
        e56 e56Var3 = this.S;
        e56 e56Var4 = e56.F;
        c3d c3dVarU = h5bVar.u(sl4.a(iJ, (this.S == e56Var2 || !this.T) ? rl4.h(j) : Integer.MAX_VALUE, e56Var3 == e56Var4 ? rl4.i(j) : 0, (this.S == e56Var4 || !this.T) ? rl4.g(j) : Integer.MAX_VALUE));
        int iE0 = wd6.e0(c3dVarU.E, rl4.j(j), rl4.h(j));
        int iE02 = wd6.e0(c3dVarU.F, rl4.i(j), rl4.g(j));
        return q5bVar.U(iE0, iE02, nm6.E, new bxe(this, iE0, c3dVarU, iE02, q5bVar));
    }
}
