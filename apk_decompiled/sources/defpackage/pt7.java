package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pt7 extends qw5 implements ujf, r78, oe4, lbc, p6i {
    public static final a5 a0 = new a5(19);
    public zub U;
    public final bz7 V;
    public ks7 W;
    public sz9 X;
    public m5c Y;
    public final jt7 Z;

    public pt7(zub zubVar, int i, bz7 bz7Var) {
        this.U = zubVar;
        this.V = bz7Var;
        jt7 jt7Var = new jt7(i, 10, new ot7(2, this, pt7.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0));
        p1(jt7Var);
        this.Z = jt7Var;
    }

    @Override // defpackage.lbc
    public final void F0() {
        dae daeVar = new dae();
        d4c.a0(this, new l80(daeVar, 29, this));
        sz9 sz9Var = (sz9) daeVar.E;
        if (this.Z.u1().b()) {
            sz9 sz9Var2 = this.X;
            if (sz9Var2 != null) {
                sz9Var2.b();
            }
            if (sz9Var != null) {
                sz9Var.a();
            } else {
                sz9Var = null;
            }
            this.X = sz9Var;
        }
    }

    @Override // defpackage.ujf
    public final void X0(ekf ekfVar) {
        boolean zB = this.Z.u1().b();
        wn9[] wn9VarArr = ckf.a;
        dkf dkfVar = akf.l;
        wn9 wn9Var = ckf.a[4];
        ekfVar.a(dkfVar, Boolean.valueOf(zB));
        ekfVar.a(ojf.w, new e5(null, new dm(0, this, pt7.class, "requestFocus", "requestFocus()Z", 0, 12)));
    }

    @Override // defpackage.hqb
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.hqb
    public final void j1() {
        sz9 sz9Var = this.X;
        if (sz9Var != null) {
            sz9Var.b();
        }
        this.X = null;
    }

    @Override // defpackage.p6i
    public final Object o() {
        return a0;
    }

    @Override // defpackage.r78
    public final void o0(m5c m5cVar) {
        this.Y = m5cVar;
        if (this.Z.u1().b()) {
            boolean z = m5cVar.h1().R;
            cm4 cm4Var = qt7.S;
            if (!z) {
                if (this.R) {
                    j8.F(this, cm4Var);
                }
            } else {
                m5c m5cVar2 = this.Y;
                if (m5cVar2 != null && m5cVar2.h1().R && this.R) {
                    j8.F(this, cm4Var);
                }
            }
        }
    }

    public final void s1(zub zubVar, v79 v79Var) {
        if (!this.R) {
            zubVar.c(v79Var);
            return;
        }
        lf9 lf9Var = (lf9) ((mp4) d1()).E.x0(dd8.J);
        gb9.D(d1(), null, null, new cx(zubVar, v79Var, lf9Var != null ? lf9Var.D0(new vk3(zubVar, 5, v79Var)) : null, (tp4) null, 18), 3);
    }

    public final void t1(zub zubVar) {
        ks7 ks7Var;
        if (x44.r(this.U, zubVar)) {
            return;
        }
        zub zubVar2 = this.U;
        if (zubVar2 != null && (ks7Var = this.W) != null) {
            zubVar2.c(new ls7(ks7Var));
        }
        this.W = null;
        this.U = zubVar;
    }

    public /* synthetic */ pt7(zub zubVar, rfh rfhVar, int i) {
        this(zubVar, 1, (i & 4) != 0 ? null : rfhVar);
    }
}
