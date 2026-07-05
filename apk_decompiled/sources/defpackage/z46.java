package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class z46 implements Executor {
    public static final z46 F = new z46(0);
    public static final /* synthetic */ z46 G = new z46(1);
    public final /* synthetic */ int E;

    public /* synthetic */ z46(int i) {
        this.E = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.E) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
