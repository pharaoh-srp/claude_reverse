package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class bf8 implements Executor {
    public final /* synthetic */ int E = 0;
    public final Object F;

    public bf8(Looper looper) {
        this.F = new xnj(looper, 4);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                ((xnj) obj).post(runnable);
                break;
            default:
                ((jsk) obj).O().T0(runnable);
                break;
        }
    }

    public bf8(jsk jskVar) {
        this.F = jskVar;
    }
}
