package defpackage;

import androidx.lifecycle.DefaultLifecycleObserver;

/* JADX INFO: loaded from: classes.dex */
public final class bj0 implements DefaultLifecycleObserver {
    public final mn5 E;
    public final amg F;
    public final amg G;
    public final aj0 H;
    public final lsc I;
    public final lsc J;

    public bj0(mn5 mn5Var) {
        this.E = mn5Var;
        amg amgVarA = bmg.a(new xi0());
        this.F = amgVarA;
        this.G = amgVarA;
        this.H = new aj0(0, amgVarA);
        this.I = mpk.P(Boolean.FALSE);
        this.J = mpk.P(new xi0());
    }

    public final xi0 a() {
        return (xi0) this.J.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.I.getValue()).booleanValue();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(m4a m4aVar) {
        Long l;
        Long l2;
        m4aVar.getClass();
        mn5 mn5Var = this.E;
        long jA = mn5Var.a();
        long jB = mn5Var.b();
        amg amgVar = this.F;
        xi0 xi0Var = (xi0) amgVar.getValue();
        Long lValueOf = Long.valueOf(jA);
        long j = xi0Var.d;
        boolean z = xi0Var.a;
        long jLongValue = 0;
        long jLongValue2 = j + ((z || (l2 = xi0Var.b) == null) ? 0L : jA - l2.longValue());
        long j2 = xi0Var.f;
        if (!z && (l = xi0Var.e) != null) {
            jLongValue = jB - l.longValue();
        }
        xi0 xi0VarA = xi0.a(xi0Var, true, null, lValueOf, jLongValue2, null, j2 + jLongValue, 18);
        this.I.setValue(Boolean.TRUE);
        this.J.setValue(xi0VarA);
        amgVar.n(null, xi0VarA);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(m4a m4aVar) {
        m4aVar.getClass();
        amg amgVar = this.F;
        xi0 xi0Var = (xi0) amgVar.getValue();
        mn5 mn5Var = this.E;
        xi0 xi0VarA = xi0.a(xi0Var, false, Long.valueOf(mn5Var.a()), null, 0L, Long.valueOf(mn5Var.b()), 0L, 44);
        this.I.setValue(Boolean.FALSE);
        this.J.setValue(xi0VarA);
        amgVar.n(null, xi0VarA);
    }
}
