package defpackage;

import com.google.android.gms.internal.play_billing.e;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class u4l implements x3k {
    public final WeakReference E;
    public final p4l F = new p4l(this);

    public u4l(e eVar) {
        this.E = new WeakReference(eVar);
    }

    @Override // defpackage.x3k
    public final void c(Runnable runnable, Executor executor) {
        this.F.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        e eVar = (e) this.E.get();
        boolean zCancel = this.F.cancel(z);
        if (!zCancel || eVar == null) {
            return zCancel;
        }
        eVar.a = null;
        eVar.b = null;
        eVar.c.i(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.F.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.F.E instanceof z6k;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.F.isDone();
    }

    public final String toString() {
        return this.F.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.F.get(j, timeUnit);
    }
}
