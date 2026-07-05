package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z42 extends hqb implements lbc, gz1, vd6 {
    public final b52 S;
    public boolean T;
    public bz7 U;

    public z42(b52 b52Var, bz7 bz7Var) {
        this.S = b52Var;
        this.U = bz7Var;
        b52Var.E = this;
    }

    @Override // defpackage.lbc
    public final void F0() {
        p1();
    }

    @Override // defpackage.vd6
    public final void I0(cv9 cv9Var) {
        boolean z = this.T;
        b52 b52Var = this.S;
        if (!z) {
            b52Var.F = null;
            d4c.a0(this, new mx1(this, 1, b52Var));
            if (b52Var.F == null) {
                throw sq6.z("DrawResult not defined, did you forget to call onDraw?");
            }
            this.T = true;
        }
        ax5 ax5Var = b52Var.F;
        ax5Var.getClass();
        ((bz7) ax5Var.F).invoke(cv9Var);
    }

    @Override // defpackage.vd6
    public final void Y() {
        p1();
    }

    @Override // defpackage.nw5
    public final void f() {
        p1();
    }

    @Override // defpackage.nw5
    public final void f0() {
        p1();
    }

    @Override // defpackage.gz1
    public final long g() {
        return csg.T(yfd.U(this, 4).G);
    }

    @Override // defpackage.gz1
    public final cz5 getDensity() {
        return yfd.W(this).d0;
    }

    @Override // defpackage.gz1
    public final fu9 getLayoutDirection() {
        return yfd.W(this).e0;
    }

    @Override // defpackage.hqb
    public final void i1() {
    }

    @Override // defpackage.hqb
    public final void j1() {
        p1();
    }

    public final void p1() {
        this.T = false;
        this.S.F = null;
        wd6.t0(this);
    }
}
