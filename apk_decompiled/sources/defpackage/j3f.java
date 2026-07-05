package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class j3f implements Executor {
    public final /* synthetic */ int E;
    public final Object F;

    public j3f() {
        this.E = 2;
        xnj xnjVar = new xnj(Looper.getMainLooper());
        Looper.getMainLooper();
        this.F = xnjVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                ((Executor) obj).execute(new i3f(runnable, 0));
                break;
            case 1:
                ((ggj) obj).c.post(runnable);
                break;
            default:
                ((xnj) obj).post(runnable);
                break;
        }
    }

    public /* synthetic */ j3f(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }
}
