package io.sentry.logger;

import defpackage.pya;
import io.sentry.android.core.l;
import io.sentry.c5;
import io.sentry.h5;
import io.sentry.n5;
import io.sentry.t5;
import io.sentry.transport.o;
import io.sentry.v;
import io.sentry.w5;
import io.sentry.w6;
import io.sentry.y4;
import io.sentry.y5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class c implements a {
    public final w6 E;
    public final y4 F;
    public final ConcurrentLinkedQueue G;
    public final n5 H;
    public final io.sentry.util.a I;
    public final io.sentry.d J;

    public c(w6 w6Var, y4 y4Var) {
        n5 n5Var = new n5(w6Var);
        this.I = new io.sentry.util.a();
        this.J = new io.sentry.d(7, false);
        this.E = w6Var;
        this.F = y4Var;
        this.G = new ConcurrentLinkedQueue();
        this.H = n5Var;
    }

    @Override // io.sentry.logger.a
    public void a(boolean z) {
        n5 n5Var = this.H;
        if (z) {
            d(true);
            n5Var.submit(new pya(27, this));
        } else {
            n5Var.a(this.E.getShutdownTimeoutMillis());
            while (!this.G.isEmpty()) {
                c();
            }
        }
    }

    @Override // io.sentry.logger.a
    public final void b(long j) {
        d(true);
        try {
            ((o) this.J.E).tryAcquireSharedNanos(1, TimeUnit.MILLISECONDS.toNanos(j));
        } catch (InterruptedException e) {
            this.E.getLogger().d(t5.ERROR, "Failed to flush log events", e);
            Thread.currentThread().interrupt();
        }
    }

    public final void c() {
        ArrayList arrayList = new ArrayList(100);
        do {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.G;
            w5 w5Var = (w5) concurrentLinkedQueue.poll();
            if (w5Var != null) {
                arrayList.add(w5Var);
            }
            if (concurrentLinkedQueue.isEmpty()) {
                break;
            }
        } while (arrayList.size() < 100);
        if (arrayList.isEmpty()) {
            return;
        }
        y5 y5Var = new y5(arrayList);
        y4 y4Var = this.F;
        w6 w6Var = (w6) y4Var.b;
        try {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(h5.e(w6Var.getSerializer(), y5Var));
            y4Var.s(new io.sentry.internal.debugmeta.c(new c5(null, w6Var.getSdkVersion(), null), arrayList2), null);
        } catch (IOException e) {
            w6Var.getLogger().b(t5.WARNING, e, "Capturing logs failed.", new Object[0]);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            o oVar = (o) this.J.E;
            int i2 = o.E;
            oVar.releaseShared(1);
        }
    }

    public final void d(boolean z) {
        v vVarA = this.I.a();
        try {
            try {
                this.H.c(new l(8, this), z ? 0 : 5000);
            } catch (RejectedExecutionException e) {
                this.E.getLogger().d(t5.WARNING, "Logs batch processor flush task rejected", e);
            }
            vVarA.close();
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
