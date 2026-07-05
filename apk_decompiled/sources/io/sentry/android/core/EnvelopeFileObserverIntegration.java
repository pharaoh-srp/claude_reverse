package io.sentry.android.core;

import io.sentry.n4;
import io.sentry.r3;
import io.sentry.t5;
import io.sentry.w6;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public abstract class EnvelopeFileObserverIntegration implements io.sentry.x1, Closeable {
    public x0 E;
    public io.sentry.a1 F;
    public boolean G = false;
    public final io.sentry.util.a H = new io.sentry.util.a();

    public static final class OutboxEnvelopeFileObserverIntegration extends EnvelopeFileObserverIntegration {
    }

    @Override // io.sentry.x1
    public final void H(w6 w6Var) {
        this.F = w6Var.getLogger();
        String outboxPath = w6Var.getOutboxPath();
        io.sentry.a1 a1Var = this.F;
        if (outboxPath == null) {
            a1Var.h(t5.WARNING, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered.", new Object[0]);
            return;
        }
        a1Var.h(t5.DEBUG, "Registering EnvelopeFileObserverIntegration for path: %s", outboxPath);
        try {
            w6Var.getExecutorService().submit(new i1(this, w6Var, outboxPath, 1));
        } catch (Throwable th) {
            this.F.d(t5.DEBUG, "Failed to start EnvelopeFileObserverIntegration on executor thread.", th);
        }
    }

    public final void c(w6 w6Var, String str) {
        x0 x0Var = new x0(str, new r3(n4.a, w6Var.getEnvelopeReader(), w6Var.getSerializer(), w6Var.getLogger(), w6Var.getFlushTimeoutMillis(), w6Var.getMaxQueueSize()), w6Var.getLogger(), w6Var.getFlushTimeoutMillis());
        this.E = x0Var;
        try {
            x0Var.startWatching();
            w6Var.getLogger().h(t5.DEBUG, "EnvelopeFileObserverIntegration installed.", new Object[0]);
            io.sentry.p.a("EnvelopeFileObserver");
        } catch (Throwable th) {
            w6Var.getLogger().d(t5.ERROR, "Failed to initialize EnvelopeFileObserverIntegration.", th);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.v vVarA = this.H.a();
        try {
            this.G = true;
            vVarA.close();
            x0 x0Var = this.E;
            if (x0Var != null) {
                x0Var.stopWatching();
                io.sentry.a1 a1Var = this.F;
                if (a1Var != null) {
                    a1Var.h(t5.DEBUG, "EnvelopeFileObserverIntegration removed.", new Object[0]);
                }
            }
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
