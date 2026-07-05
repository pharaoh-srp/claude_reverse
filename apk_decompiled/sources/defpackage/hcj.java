package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class hcj extends ncj {
    public final WindowInsets.Builder e;

    public hcj(bdj bdjVar) {
        super(bdjVar);
        WindowInsets windowInsetsB = bdjVar.b();
        this.e = windowInsetsB != null ? mdh.h(windowInsetsB) : pa8.j();
    }

    @Override // defpackage.ncj
    public bdj b() {
        a();
        bdj bdjVarC = bdj.c(this.e.build(), null);
        f59[] f59VarArr = this.b;
        xcj xcjVar = bdjVarC.a;
        xcjVar.w(f59VarArr);
        xcjVar.v(null);
        xcjVar.B(this.c);
        xcjVar.C(this.d);
        return bdjVarC;
    }

    @Override // defpackage.ncj
    public void e(f59 f59Var) {
        this.e.setMandatorySystemGestureInsets(f59Var.e());
    }

    @Override // defpackage.ncj
    public void f(f59 f59Var) {
        this.e.setStableInsets(f59Var.e());
    }

    @Override // defpackage.ncj
    public void g(f59 f59Var) {
        this.e.setSystemGestureInsets(f59Var.e());
    }

    @Override // defpackage.ncj
    public void h(f59 f59Var) {
        this.e.setSystemWindowInsets(f59Var.e());
    }

    @Override // defpackage.ncj
    public void i(f59 f59Var) {
        this.e.setTappableElementInsets(f59Var.e());
    }

    public hcj() {
        this.e = pa8.j();
    }
}
