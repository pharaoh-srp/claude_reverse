package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class fq1 implements Executor {
    public final /* synthetic */ int E;
    public final Handler F;

    public fq1(int i) {
        this.E = i;
        switch (i) {
            case 1:
                this.F = new Handler(Looper.getMainLooper());
                break;
            default:
                this.F = new Handler(Looper.getMainLooper());
                break;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.E;
        Handler handler = this.F;
        switch (i) {
            case 0:
                handler.post(runnable);
                return;
            case 1:
                handler.post(runnable);
                return;
            case 2:
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            default:
                handler.post(runnable);
                return;
        }
    }

    public /* synthetic */ fq1(Handler handler, int i) {
        this.E = i;
        this.F = handler;
    }
}
