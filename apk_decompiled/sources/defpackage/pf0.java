package defpackage;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class pf0 implements u82 {
    public final u82 E;
    public final Type F;
    public final cj3 G;
    public final q61 H;

    public pf0(u82 u82Var, Type type, cj3 cj3Var, q61 q61Var) {
        this.E = u82Var;
        this.F = type;
        this.G = cj3Var;
        this.H = q61Var;
    }

    @Override // defpackage.u82
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final pf0 clone() {
        u82 u82VarClone = this.E.clone();
        u82VarClone.getClass();
        return new pf0(u82VarClone, this.F, this.G, this.H);
    }

    @Override // defpackage.u82
    public final void cancel() {
        this.E.cancel();
    }

    @Override // defpackage.u82
    public final void e(h92 h92Var) {
        this.E.e(new nyj(this, 6, h92Var));
    }

    @Override // defpackage.u82
    public final boolean isCanceled() {
        return this.E.isCanceled();
    }

    @Override // defpackage.u82
    public final kie l0() {
        kie kieVarL0 = this.E.l0();
        kieVarL0.getClass();
        return kieVarL0;
    }
}
