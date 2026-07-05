package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xk6 implements qk6 {
    public q68 a = o68.a;

    @Override // defpackage.qk6
    public final qk6 a() {
        xk6 xk6Var = new xk6();
        xk6Var.a = this.a;
        return xk6Var;
    }

    @Override // defpackage.qk6
    public final q68 b() {
        return this.a;
    }

    @Override // defpackage.qk6
    public final void c(q68 q68Var) {
        this.a = q68Var;
    }

    public final String toString() {
        return "EmittableSpacer(modifier=" + this.a + ')';
    }
}
