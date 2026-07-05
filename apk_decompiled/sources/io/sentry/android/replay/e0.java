package io.sentry.android.replay;

import android.os.Handler;
import defpackage.vb7;
import io.sentry.a1;
import io.sentry.t5;
import io.sentry.w6;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements Runnable {
    public final w6 E;
    public final io.sentry.d F;
    public x G;
    public y H;
    public final AtomicBoolean I;

    public e0(w6 w6Var, io.sentry.d dVar) {
        dVar.getClass();
        this.E = w6Var;
        this.F = dVar;
        this.I = new AtomicBoolean(true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.I.get();
        w6 w6Var = this.E;
        if (!z) {
            if (w6Var.getSessionReplay().m) {
                w6Var.getLogger().h(t5.DEBUG, "Not capturing frames, recording is not running.", new Object[0]);
                return;
            }
            return;
        }
        try {
            if (w6Var.getSessionReplay().m) {
                w6Var.getLogger().h(t5.DEBUG, "Capturing a frame.", new Object[0]);
            }
            x xVar = this.G;
            if (xVar != null) {
                xVar.b();
            }
        } catch (Throwable th) {
            w6Var.getLogger().d(t5.ERROR, "Failed to capture a frame", th);
        }
        if (w6Var.getSessionReplay().m) {
            a1 logger = w6Var.getLogger();
            t5 t5Var = t5.DEBUG;
            StringBuilder sb = new StringBuilder("Posting the capture runnable again, frame rate is ");
            y yVar = this.H;
            logger.h(t5Var, vb7.l(yVar != null ? yVar.e : 1, " fps.", sb), new Object[0]);
        }
        y yVar2 = this.H;
        if (((Handler) this.F.E).postDelayed(this, 1000 / ((long) (yVar2 != null ? yVar2.e : 1)))) {
            return;
        }
        w6Var.getLogger().h(t5.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
    }
}
