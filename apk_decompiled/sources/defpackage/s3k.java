package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
public final class s3k implements x3k {
    public static final b1a F = new b1a(1, s3k.class);
    public final Object E;

    public s3k(Object obj) {
        this.E = obj;
    }

    @Override // defpackage.x3k
    public final void c(Runnable runnable, Executor executor) {
        if (executor == null) {
            mr9.h("Executor was null.");
            return;
        }
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            F.b().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", ij0.k("RuntimeException while executing runnable ", runnable.toString(), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.E;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return kgh.p(super.toString(), "[status=SUCCESS, result=[", this.E.toString(), "]]");
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.E;
    }
}
