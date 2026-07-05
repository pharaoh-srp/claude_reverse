package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class j8j implements Executor {
    public final /* synthetic */ Executor E;
    public final /* synthetic */ AtomicBoolean F;
    public final /* synthetic */ ua2 G;

    public j8j(Executor executor, AtomicBoolean atomicBoolean, ua2 ua2Var) {
        this.E = executor;
        this.F = atomicBoolean;
        this.G = ua2Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.E.execute(new ije(runnable, this.F, this.G, 2));
    }
}
