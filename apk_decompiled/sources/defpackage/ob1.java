package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class ob1 extends ThreadPoolExecutor implements AutoCloseable, ExecutorService {
    public final h99 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob1(h99 h99Var, String str, pb1 pb1Var, iuj iujVar) {
        super(1, 1, 5000L, TimeUnit.MILLISECONDS, new sb1(h99Var, str, FreeTypeConstants.FT_LOAD_NO_RECURSE, FreeTypeConstants.FT_LOAD_NO_RECURSE, re4.L, bx.Z, 2, iujVar), new vk5(str, 0));
        h99Var.getClass();
        iujVar.getClass();
        this.E = h99Var;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        dch.K(runnable, th, this.E);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }
}
