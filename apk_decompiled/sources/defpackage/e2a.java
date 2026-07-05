package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e2a extends hqb implements t5d, oe4, r78 {
    public y20 S;
    public m2a T;
    public zhh U;
    public final lsc V = mpk.P(null);

    public e2a(y20 y20Var, m2a m2aVar, zhh zhhVar) {
        this.S = y20Var;
        this.T = m2aVar;
        this.U = zhhVar;
    }

    @Override // defpackage.hqb
    public final void h1() {
        y20 y20Var = this.S;
        if (y20Var.a != null) {
            e39.c("Expected textInputModifierNode to be null");
        }
        y20Var.a = this;
    }

    @Override // defpackage.hqb
    public final void i1() {
        this.S.k(this);
    }

    @Override // defpackage.r78
    public final void o0(m5c m5cVar) {
        this.V.setValue(m5cVar);
    }
}
