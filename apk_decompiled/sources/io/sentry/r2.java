package io.sentry;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class r2 implements Runnable {
    public final w6 E;

    public r2(w6 w6Var) {
        this.E = w6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w6 w6Var = this.E;
        String cacheDirPath = w6Var.getCacheDirPath();
        if (cacheDirPath == null) {
            w6Var.getLogger().h(t5.INFO, "Cache dir is not set, not moving the previous session.", new Object[0]);
            return;
        }
        io.sentry.cache.d envelopeDiskCache = w6Var.getEnvelopeDiskCache();
        if (envelopeDiskCache instanceof io.sentry.cache.c) {
            int i = io.sentry.cache.c.N;
            io.sentry.cache.c cVar = (io.sentry.cache.c) envelopeDiskCache;
            cVar.e(new File(cacheDirPath, "session.json"), new File(cacheDirPath, "previous_session.json"));
            cVar.I.countDown();
        }
    }
}
