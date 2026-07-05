package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l7k implements Executor {
    public static final /* synthetic */ l7k F = new l7k(0);
    public static final /* synthetic */ l7k G = new l7k(1);
    public final /* synthetic */ int E;

    public /* synthetic */ l7k(int i) {
        this.E = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.E) {
            case 0:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
