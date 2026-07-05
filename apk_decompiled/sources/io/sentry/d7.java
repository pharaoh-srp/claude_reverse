package io.sentry;

import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public final class d7 extends TimerTask {
    public final /* synthetic */ int E;
    public final /* synthetic */ f7 F;

    public /* synthetic */ d7(f7 f7Var, int i) {
        this.E = i;
        this.F = f7Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        int i = this.E;
        f7 f7Var = this.F;
        switch (i) {
            case 0:
                n7 n7VarE = f7Var.e();
                if (n7VarE == null) {
                    n7VarE = n7.OK;
                }
                f7Var.A(n7VarE, null);
                f7Var.l.set(false);
                break;
            default:
                n7 n7VarE2 = f7Var.e();
                if (n7VarE2 == null) {
                    n7VarE2 = n7.DEADLINE_EXCEEDED;
                }
                f7Var.i(n7VarE2, f7Var.r.i != null, null);
                f7Var.m.set(false);
                break;
        }
    }
}
