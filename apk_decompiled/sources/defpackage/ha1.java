package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ha1 extends hqb {
    public uoh S;
    public final /* synthetic */ ia1 T;

    public ha1(ia1 ia1Var) {
        this.T = ia1Var;
    }

    @Override // defpackage.hqb
    public final void h1() {
        ia1 ia1Var = this.T;
        ia1Var.E = this;
        if (ia1Var.F != null) {
            this.S = kvk.l(this, new l0(this, 17, ia1Var));
        }
    }

    @Override // defpackage.hqb
    public final void i1() {
        ia1 ia1Var = this.T;
        if (ia1Var.E == this) {
            ia1Var.E = null;
        }
        uoh uohVar = this.S;
        if (uohVar != null) {
            uohVar.b();
        }
        this.S = null;
    }
}
