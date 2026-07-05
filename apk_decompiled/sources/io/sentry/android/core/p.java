package io.sentry.android.core;

import io.sentry.t5;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements io.sentry.util.g {
    public final /* synthetic */ int E;
    public final /* synthetic */ SentryAndroidOptions F;

    public /* synthetic */ p(SentryAndroidOptions sentryAndroidOptions, int i) {
        this.E = i;
        this.F = sentryAndroidOptions;
    }

    @Override // io.sentry.util.g
    public Object f() {
        int i = this.E;
        SentryAndroidOptions sentryAndroidOptions = this.F;
        switch (i) {
            case 0:
                return sentryAndroidOptions.getExecutorService();
            default:
                List list = io.sentry.android.core.cache.b.P;
                String outboxPath = sentryAndroidOptions.getOutboxPath();
                boolean z = false;
                if (outboxPath != null) {
                    File file = new File(outboxPath, "startup_crash");
                    try {
                        boolean zExists = file.exists();
                        if (zExists && !file.delete()) {
                            sentryAndroidOptions.getLogger().h(t5.ERROR, "Failed to delete the startup crash marker file. %s.", file.getAbsolutePath());
                        }
                        z = zExists;
                    } catch (Throwable th) {
                        sentryAndroidOptions.getLogger().d(t5.ERROR, "Error reading/deleting the startup crash marker file on the disk", th);
                    }
                    break;
                } else {
                    sentryAndroidOptions.getLogger().h(t5.DEBUG, "Outbox path is null, the startup crash marker file does not exist", new Object[0]);
                }
                return Boolean.valueOf(z);
        }
    }
}
