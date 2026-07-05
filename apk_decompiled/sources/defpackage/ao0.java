package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ao0 implements Executor {
    public final /* synthetic */ int E;

    public /* synthetic */ ao0(int i) {
        this.E = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.E) {
            case 0:
                bo0.T().f.g.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
