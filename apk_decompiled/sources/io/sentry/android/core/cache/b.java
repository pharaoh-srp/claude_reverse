package io.sentry.android.core.cache;

import android.os.SystemClock;
import defpackage.et5;
import defpackage.ij0;
import io.sentry.a1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.a2;
import io.sentry.android.core.internal.util.d;
import io.sentry.android.core.performance.h;
import io.sentry.android.core.performance.i;
import io.sentry.android.core.x;
import io.sentry.cache.c;
import io.sentry.e0;
import io.sentry.n0;
import io.sentry.p;
import io.sentry.t5;
import io.sentry.u7;
import io.sentry.w6;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {
    public static final List P = Arrays.asList(new a(x.class, "ANR", "last_anr_report", new e0(16)), new a(a2.class, "Tombstone", "last_tombstone_report", new e0(17)));
    public final d O;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(SentryAndroidOptions sentryAndroidOptions) {
        String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
        p.v("cacheDirPath must not be null", cacheDirPath);
        super(sentryAndroidOptions, cacheDirPath, sentryAndroidOptions.getMaxCacheItems());
        this.O = d.E;
    }

    public static Long m(w6 w6Var, String str, String str2) {
        String cacheDirPath = w6Var.getCacheDirPath();
        p.v("Cache dir path should be set for getting " + str2 + "s reported", cacheDirPath);
        File file = new File(cacheDirPath, str);
        try {
            String strU = p.u(file);
            if (strU != null && !strU.equals("null")) {
                return Long.valueOf(Long.parseLong(strU.trim()));
            }
            return null;
        } catch (Throwable th) {
            if (th instanceof FileNotFoundException) {
                w6Var.getLogger().h(t5.DEBUG, ij0.j("Last ", str2, " marker does not exist. %s."), file.getAbsolutePath());
                return null;
            }
            w6Var.getLogger().d(t5.ERROR, ij0.j("Error reading last ", str2, " marker"), th);
            return null;
        }
    }

    @Override // io.sentry.cache.c, io.sentry.cache.d
    public final boolean H(io.sentry.internal.debugmeta.c cVar, n0 n0Var) {
        boolean zH = super.H(cVar, n0Var);
        w6 w6Var = this.E;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) w6Var;
        i iVar = h.c().I;
        if (io.sentry.util.c.e(n0Var, u7.class) && iVar.b()) {
            this.O.getClass();
            long jUptimeMillis = SystemClock.uptimeMillis() - iVar.G;
            if (jUptimeMillis <= sentryAndroidOptions.getStartupCrashDurationThresholdMillis()) {
                a1 logger = sentryAndroidOptions.getLogger();
                t5 t5Var = t5.DEBUG;
                logger.h(t5Var, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", Long.valueOf(jUptimeMillis));
                String outboxPath = w6Var.getOutboxPath();
                if (outboxPath == null) {
                    w6Var.getLogger().h(t5Var, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
                } else {
                    try {
                        new File(outboxPath, "startup_crash").createNewFile();
                    } catch (Throwable th) {
                        w6Var.getLogger().d(t5.ERROR, "Error writing the startup crash marker file to the disk", th);
                    }
                }
            }
        }
        for (a aVar : P) {
            io.sentry.util.c.i(n0Var, aVar.a, new et5(aVar, sentryAndroidOptions, this, 10));
        }
        return zH;
    }
}
