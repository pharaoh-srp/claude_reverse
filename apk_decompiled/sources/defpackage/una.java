package defpackage;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class una extends FutureTask {
    public final /* synthetic */ int E = 1;
    public Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public una(f11 f11Var, eqb eqbVar) {
        super(eqbVar);
        this.F = f11Var;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        switch (this.E) {
            case 0:
                try {
                    if (!isCancelled()) {
                        try {
                            ((vna) this.F).d((tna) get());
                        } catch (InterruptedException | ExecutionException e) {
                            ((vna) this.F).d(new tna(e));
                        }
                        break;
                    }
                    return;
                } finally {
                    this.F = null;
                }
            default:
                f11 f11Var = (f11) this.F;
                AtomicBoolean atomicBoolean = f11Var.H;
                try {
                    Object obj = get();
                    if (atomicBoolean.get()) {
                        return;
                    }
                    f11Var.a(obj);
                    return;
                } catch (InterruptedException e2) {
                    Log.w("AsyncTask", e2);
                    return;
                } catch (CancellationException unused) {
                    if (atomicBoolean.get()) {
                        return;
                    }
                    f11Var.a(null);
                    return;
                } catch (ExecutionException e3) {
                    xh6.f("An error occurred while executing doInBackground()", e3.getCause());
                    return;
                } catch (Throwable th) {
                    xh6.f("An error occurred while executing doInBackground()", th);
                    return;
                }
        }
    }

    public /* synthetic */ una(Callable callable) {
        super(callable);
    }
}
