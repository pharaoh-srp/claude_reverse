package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class hee implements Executor {
    public final /* synthetic */ Executor E;
    public final /* synthetic */ rl7 F;

    public hee(ExecutorService executorService, rl7 rl7Var) {
        this.E = executorService;
        this.F = rl7Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.E.execute(runnable);
    }
}
