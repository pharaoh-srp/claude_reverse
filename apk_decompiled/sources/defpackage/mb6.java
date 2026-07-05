package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mb6 extends hqb implements p6i, nb6, yt9 {
    public final bz7 S;
    public mb6 T;
    public nb6 U;
    public long V;

    public mb6(j40 j40Var, int i) {
        this.S = (i & 2) != 0 ? null : j40Var;
        this.V = 0L;
    }

    @Override // defpackage.nb6
    public final void G0(gb6 gb6Var) {
        nb6 nb6Var = this.U;
        if (nb6Var != null) {
            nb6Var.G0(gb6Var);
            return;
        }
        mb6 mb6Var = this.T;
        if (mb6Var != null) {
            mb6Var.G0(gb6Var);
        }
    }

    @Override // defpackage.nb6
    public final void H0(gb6 gb6Var) {
        p6i p6iVar;
        mb6 mb6Var;
        mb6 mb6Var2 = this.T;
        if (mb6Var2 == null || !kxk.i(mb6Var2, ttj.i(gb6Var))) {
            if (this.E.R) {
                dae daeVar = new dae();
                j8.p0(this, new j70(daeVar, this, gb6Var, 2));
                p6iVar = (p6i) daeVar.E;
            } else {
                p6iVar = null;
            }
            mb6Var = (mb6) p6iVar;
        } else {
            mb6Var = mb6Var2;
        }
        if (mb6Var != null && mb6Var2 == null) {
            mb6Var.u(gb6Var);
            mb6Var.H0(gb6Var);
            nb6 nb6Var = this.U;
            if (nb6Var != null) {
                nb6Var.s0(gb6Var);
            }
        } else if (mb6Var == null && mb6Var2 != null) {
            nb6 nb6Var2 = this.U;
            if (nb6Var2 != null) {
                nb6Var2.u(gb6Var);
                nb6Var2.H0(gb6Var);
            }
            mb6Var2.s0(gb6Var);
        } else if (!x44.r(mb6Var, mb6Var2)) {
            if (mb6Var != null) {
                mb6Var.u(gb6Var);
                mb6Var.H0(gb6Var);
            }
            if (mb6Var2 != null) {
                mb6Var2.s0(gb6Var);
            }
        } else if (mb6Var != null) {
            mb6Var.H0(gb6Var);
        } else {
            nb6 nb6Var3 = this.U;
            if (nb6Var3 != null) {
                nb6Var3.H0(gb6Var);
            }
        }
        this.T = mb6Var;
    }

    @Override // defpackage.nb6
    public final void J(gb6 gb6Var) {
        h4 h4Var = new h4(16, gb6Var);
        if (h4Var.invoke(this) != o6i.E) {
            return;
        }
        j8.p0(this, h4Var);
    }

    @Override // defpackage.nb6
    public final boolean a1(gb6 gb6Var) {
        mb6 mb6Var = this.T;
        if (mb6Var != null) {
            return mb6Var.a1(gb6Var);
        }
        nb6 nb6Var = this.U;
        if (nb6Var != null) {
            return nb6Var.a1(gb6Var);
        }
        return false;
    }

    @Override // defpackage.yt9, defpackage.s5b
    public final void c(long j) {
        this.V = j;
    }

    @Override // defpackage.hqb
    public final void i1() {
        this.U = null;
        this.T = null;
    }

    @Override // defpackage.p6i
    public final Object o() {
        return k2e.G;
    }

    @Override // defpackage.nb6
    public final void s0(gb6 gb6Var) {
        nb6 nb6Var = this.U;
        if (nb6Var != null) {
            nb6Var.s0(gb6Var);
        }
        mb6 mb6Var = this.T;
        if (mb6Var != null) {
            mb6Var.s0(gb6Var);
        }
        this.T = null;
    }

    @Override // defpackage.nb6
    public final void u(gb6 gb6Var) {
        nb6 nb6Var = this.U;
        if (nb6Var != null) {
            nb6Var.u(gb6Var);
            return;
        }
        mb6 mb6Var = this.T;
        if (mb6Var != null) {
            mb6Var.u(gb6Var);
        }
    }
}
