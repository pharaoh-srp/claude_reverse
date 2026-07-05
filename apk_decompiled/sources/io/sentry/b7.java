package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class b7 implements i0 {
    public final String E;
    public final String F;

    public b7() {
        String property = System.getProperty("java.version");
        String property2 = System.getProperty("java.vendor");
        this.E = property;
        this.F = property2;
    }

    public final void a(w4 w4Var) {
        io.sentry.protocol.e eVar = w4Var.F;
        if (eVar.h() == null) {
            eVar.t(new io.sentry.protocol.y());
        }
        io.sentry.protocol.y yVarH = eVar.h();
        if (yVarH != null && yVarH.E == null && yVarH.F == null) {
            yVarH.E = this.F;
            yVarH.F = this.E;
        }
    }

    @Override // io.sentry.i0
    public final j5 d(j5 j5Var, n0 n0Var) {
        a(j5Var);
        return j5Var;
    }

    @Override // io.sentry.i0
    public final io.sentry.protocol.e0 e(io.sentry.protocol.e0 e0Var, n0 n0Var) {
        a(e0Var);
        return e0Var;
    }
}
