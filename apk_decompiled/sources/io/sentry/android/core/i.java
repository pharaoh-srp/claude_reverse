package io.sentry.android.core;

import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import io.sentry.s3;
import io.sentry.t5;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class i implements io.sentry.d1 {
    public final io.sentry.a1 g;
    public long a = 0;
    public long b = 0;
    public long c = 1;
    public long d = 1;
    public double e = 1.0E9d;
    public final File f = new File("/proc/self/stat");
    public boolean h = false;
    public final Pattern i = Pattern.compile("[\n\t\r ]");

    public i(io.sentry.a1 a1Var) {
        io.sentry.p.v("Logger is required.", a1Var);
        this.g = a1Var;
    }

    @Override // io.sentry.d1
    public final void a(s3 s3Var) {
        if (this.h) {
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j = jElapsedRealtimeNanos - this.a;
            this.a = jElapsedRealtimeNanos;
            long jB = b();
            long j2 = jB - this.b;
            this.b = jB;
            s3Var.e(Double.valueOf(((j2 / j) / this.d) * 100.0d));
        }
    }

    public final long b() {
        String strU;
        io.sentry.a1 a1Var = this.g;
        try {
            strU = io.sentry.p.u(this.f);
        } catch (IOException e) {
            this.h = false;
            a1Var.d(t5.WARNING, "Unable to read /proc/self/stat file. Disabling cpu collection.", e);
            strU = null;
        }
        if (strU != null) {
            String[] strArrSplit = this.i.split(strU.trim());
            try {
                long j = Long.parseLong(strArrSplit[13]);
                long j2 = Long.parseLong(strArrSplit[14]);
                return (long) ((j + j2 + Long.parseLong(strArrSplit[15]) + Long.parseLong(strArrSplit[16])) * this.e);
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e2) {
                a1Var.d(t5.ERROR, "Error parsing /proc/self/stat file.", e2);
            }
        }
        return 0L;
    }

    @Override // io.sentry.d1
    public final void c() {
        this.h = true;
        this.c = Os.sysconf(OsConstants._SC_CLK_TCK);
        this.d = Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
        this.e = 1.0E9d / this.c;
        this.b = b();
    }
}
