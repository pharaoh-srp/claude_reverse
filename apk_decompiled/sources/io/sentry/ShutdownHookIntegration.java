package io.sentry;

import defpackage.j01;
import defpackage.pya;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class ShutdownHookIntegration implements x1, Closeable {
    public final Runtime E;
    public Thread F;

    public ShutdownHookIntegration() {
        Runtime runtime = Runtime.getRuntime();
        p.v("Runtime is required", runtime);
        this.E = runtime;
    }

    @Override // io.sentry.x1
    public final void H(w6 w6Var) {
        if (!w6Var.isEnableShutdownHook()) {
            w6Var.getLogger().h(t5.INFO, "enableShutdownHook is disabled.", new Object[0]);
            return;
        }
        this.F = new Thread(new r4(w6Var, 3), "sentry-shutdownhook");
        try {
            new j01(this, 16, w6Var).run();
        } catch (IllegalStateException e) {
            String message = e.getMessage();
            if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                throw e;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.F != null) {
            try {
                new pya(14, this).run();
            } catch (IllegalStateException e) {
                String message = e.getMessage();
                if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                    throw e;
                }
            }
        }
    }
}
