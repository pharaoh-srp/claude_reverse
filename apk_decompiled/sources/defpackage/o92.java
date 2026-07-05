package defpackage;

import androidx.concurrent.futures.b;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class o92 implements saa {
    public final WeakReference E;
    public final n92 F = new n92(this);

    public o92(b bVar) {
        this.E = new WeakReference(bVar);
    }

    @Override // defpackage.saa
    public final void a(Runnable runnable, Executor executor) {
        this.F.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        b bVar = (b) this.E.get();
        boolean zCancel = this.F.cancel(z);
        if (zCancel && bVar != null) {
            bVar.a = null;
            bVar.b = null;
            bVar.c.k(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.F.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.F.E instanceof u3;
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
