package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ht7 extends qw5 implements lbc, oe4 {
    public final jt7 U;
    public sz9 V;

    public ht7() {
        jt7 jt7Var = new jt7(0, 9, new bo(2, this, ht7.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 19));
        p1(jt7Var);
        this.U = jt7Var;
    }

    @Override // defpackage.lbc
    public final void F0() {
        dae daeVar = new dae();
        d4c.a0(this, new xz(daeVar, 9, this));
        sz9 sz9Var = (sz9) daeVar.E;
        if (this.U.u1().b()) {
            sz9 sz9Var2 = this.V;
            if (sz9Var2 != null) {
                sz9Var2.b();
            }
            if (sz9Var != null) {
                sz9Var.a();
            } else {
                sz9Var = null;
            }
            this.V = sz9Var;
        }
    }
}
