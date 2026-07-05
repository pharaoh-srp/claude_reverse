package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class m59 extends h59 implements pu9 {
    public wbj U;

    public m59(wbj wbjVar) {
        this.U = wbjVar;
    }

    @Override // defpackage.pu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        int iD = this.T.d(q5bVar, q5bVar.getLayoutDirection()) - this.S.d(q5bVar, q5bVar.getLayoutDirection());
        int iA = this.T.a(q5bVar) - this.S.a(q5bVar);
        int iB = (this.T.b(q5bVar, q5bVar.getLayoutDirection()) - this.S.b(q5bVar, q5bVar.getLayoutDirection())) + iD;
        int iC = (this.T.c(q5bVar) - this.S.c(q5bVar)) + iA;
        c3d c3dVarU = h5bVar.u(sl4.i(-iB, -iC, j));
        return q5bVar.U(sl4.g(c3dVarU.E + iB, j), sl4.f(c3dVarU.F + iC, j), nm6.E, new l59(c3dVarU, iD, iA, 0));
    }

    @Override // defpackage.h59
    public final wbj p1(wbj wbjVar) {
        return new fei(wbjVar, this.U);
    }

    @Override // defpackage.h59
    public final void q1() {
        super.q1();
        yfd.W(this).T();
    }
}
