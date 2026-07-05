package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class wp5 implements bb1 {
    public Set a;
    public i49 b;
    public Set c;
    public boolean d;
    public final a2 e;

    public wp5() {
        um6 um6Var = um6.E;
        this.a = um6Var;
        this.c = um6Var;
        this.e = new a2(23, this);
    }

    @Override // defpackage.bb1
    public final void a(wa1 wa1Var) {
        wa1Var.getClass();
        if (this.a.contains(wa1Var)) {
            sz6.j("Callback is already registered");
            return;
        }
        this.a = dxf.q0(this.a, wa1Var);
        wa1Var.b = dxf.q0(wa1Var.b, this.e);
        f();
    }

    @Override // defpackage.bb1
    public final boolean b(xa1 xa1Var) {
        xa1Var.getClass();
        return this.a.contains(xa1Var);
    }

    @Override // defpackage.bb1
    public final void c(wa1 wa1Var) {
        wa1Var.getClass();
        if (!this.a.contains(wa1Var)) {
            sz6.j("Callback is not registered");
            return;
        }
        this.a = dxf.n0(this.a, wa1Var);
        wa1Var.b = dxf.n0(wa1Var.b, this.e);
        i49 i49Var = this.b;
        if (wa1Var.equals(i49Var != null ? i49Var.B0() : null)) {
            i49 i49Var2 = this.b;
            if (i49Var2 != null) {
                i49Var2.Z0(null);
            }
            wa1Var.b();
        }
        f();
    }

    public final void d() {
        wa1 wa1VarF;
        i49 i49Var = this.b;
        if (i49Var == null || (wa1VarF = i49Var.B0()) == null) {
            wa1VarF = uuj.f(this.a);
        }
        this.b = null;
        if (wa1VarF != null) {
            wa1VarF.a();
        }
    }

    public final boolean e() {
        Set set = this.a;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                va1 va1Var = ((wa1) it.next()).c;
                wa1.d[0].getClass();
                if (((Boolean) va1Var.a).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void f() {
        boolean zE = e();
        if (this.d != zE) {
            this.d = zE;
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((bz7) it.next()).invoke(Boolean.valueOf(zE));
            }
        }
    }

    public final void g(za1 za1Var) {
        za1Var.getClass();
        i49 i49Var = this.b;
        if (i49Var == null) {
            return;
        }
        if (i49Var.B0() == null) {
            i49Var.Z0(uuj.f(this.a));
            wa1 wa1VarB0 = i49Var.B0();
            if (wa1VarB0 != null) {
                wa1VarB0.d(i49Var.N0());
            }
        }
        wa1 wa1VarB02 = i49Var.B0();
        if (wa1VarB02 != null) {
            wa1VarB02.c(za1Var);
        }
    }
}
