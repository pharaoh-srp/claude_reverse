package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class e86 implements Executor {
    public final e45 E;

    public e86(e45 e45Var) {
        this.E = e45Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e45 e45Var = this.E;
        im6 im6Var = im6.E;
        if (a86.c(e45Var, im6Var)) {
            a86.b(e45Var, im6Var, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.E.toString();
    }
}
