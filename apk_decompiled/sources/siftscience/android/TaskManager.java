package siftscience.android;

import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
class TaskManager {
    private static final String TAG = "siftscience.android.TaskManager";
    private final ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

    public void schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            this.executor.schedule(runnable, j, timeUnit);
        } catch (RejectedExecutionException unused) {
        }
    }

    public void shutdown() {
        this.executor.shutdown();
        try {
            this.executor.awaitTermination(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e(TAG, "Interrupted when awaiting executor termination", e);
        }
    }

    public void submit(Runnable runnable) {
        try {
            this.executor.submit(runnable);
        } catch (RejectedExecutionException unused) {
        }
    }
}
