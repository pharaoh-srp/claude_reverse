package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class vc4 extends eb1 {
    public final l45 c;
    public pz7 d;
    public zy1 e;
    public fkg f;
    public boolean g;

    public vc4(l45 l45Var, obd obdVar) {
        super(obdVar);
        this.c = l45Var;
        int i = 2;
        this.d = new ml0(i, null, i);
    }

    @Override // defpackage.eb1
    public final void c() {
        zy1 zy1Var = this.e;
        if (zy1Var != null) {
            zy1Var.i(new CancellationException("onBack cancelled"), true);
        }
        fkg fkgVar = this.f;
        if (fkgVar != null) {
            fkgVar.d(null);
        }
        this.e = null;
        this.f = null;
        this.g = false;
    }

    @Override // defpackage.eb1
    public final void d() {
        if (this.e != null && !this.g) {
            c();
        }
        if (this.e == null) {
            this.g = false;
            this.e = wd6.P(-2, 4, py1.E);
            this.f = gb9.D(this.c, null, null, new ed3(this, null, 14), 3);
        }
        zy1 zy1Var = this.e;
        if (zy1Var != null) {
            zy1Var.m(null);
        }
        this.g = false;
    }

    @Override // defpackage.eb1
    public final void e(ab1 ab1Var) {
        zy1 zy1Var = this.e;
        if (zy1Var != null) {
            zy1Var.r(ab1Var);
        }
    }

    @Override // defpackage.eb1
    public final void f() {
        c();
        if (super.b()) {
            this.g = true;
            this.e = wd6.P(-2, 4, py1.E);
            this.f = gb9.D(this.c, null, null, new ed3(this, null, 14), 3);
        }
    }

    public final void l(boolean z) {
        fkg fkgVar;
        if (!z && super.b() && (fkgVar = this.f) != null && !fkgVar.c()) {
            c();
        }
        ((db1) this.a).f(z);
        ((cb1) this.b).f(z);
    }
}
