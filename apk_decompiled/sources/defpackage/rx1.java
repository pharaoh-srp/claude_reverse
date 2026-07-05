package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rx1 extends hqb {
    public qx1 S;

    public rx1(qx1 qx1Var) {
        this.S = qx1Var;
    }

    @Override // defpackage.hqb
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.hqb
    public final void h1() {
        p1(this.S);
    }

    @Override // defpackage.hqb
    public final void i1() {
        qx1 qx1Var = this.S;
        if (qx1Var instanceof qx1) {
            qx1Var.a.l(this);
        }
    }

    public final void p1(qx1 qx1Var) {
        qx1 qx1Var2 = this.S;
        if (qx1Var2 instanceof qx1) {
            qx1Var2.a.l(this);
        }
        if (qx1Var instanceof qx1) {
            qx1Var.a.b(this);
        }
        this.S = qx1Var;
    }
}
