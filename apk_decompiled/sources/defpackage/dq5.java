package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class dq5 implements u82 {
    public final Executor E;
    public final u82 F;

    public dq5(Executor executor, u82 u82Var) {
        this.E = executor;
        this.F = u82Var;
    }

    @Override // defpackage.u82
    public final void cancel() {
        this.F.cancel();
    }

    @Override // defpackage.u82
    public final u82 clone() {
        return new dq5(this.E, this.F.clone());
    }

    @Override // defpackage.u82
    public final void e(h92 h92Var) {
        this.F.e(new epk(this, h92Var));
    }

    @Override // defpackage.u82
    public final boolean isCanceled() {
        return this.F.isCanceled();
    }

    @Override // defpackage.u82
    public final kie l0() {
        return this.F.l0();
    }
}
