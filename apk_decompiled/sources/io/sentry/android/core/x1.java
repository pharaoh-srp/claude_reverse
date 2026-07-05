package io.sentry.android.core;

import io.sentry.a5;
import io.sentry.d6;
import io.sentry.k3;
import io.sentry.m3;
import java.util.Date;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

/* JADX INFO: loaded from: classes.dex */
public final class x1 implements io.sentry.android.core.internal.util.o, io.sentry.c1 {
    public static final d6 h = new d6(new Date(0), 0);
    public final boolean a;
    public final io.sentry.android.core.internal.util.p c;
    public volatile String d;
    public final io.sentry.util.a b = new io.sentry.util.a();
    public final TreeSet e = new TreeSet(new v1());
    public final ConcurrentSkipListSet f = new ConcurrentSkipListSet();
    public long g = 16666666;

    public x1(SentryAndroidOptions sentryAndroidOptions, io.sentry.android.core.internal.util.p pVar) {
        this.c = pVar;
        this.a = sentryAndroidOptions.isEnablePerformanceV2() && sentryAndroidOptions.isEnableFramesTracking();
    }

    public static long g(a5 a5Var) {
        if (a5Var instanceof d6) {
            return a5Var.b(h);
        }
        return System.nanoTime() - ((System.currentTimeMillis() * 1000000) - a5Var.d());
    }

    @Override // io.sentry.android.core.internal.util.o
    public final void b(long j, long j2, long j3, long j4, boolean z, boolean z2, float f) {
        ConcurrentSkipListSet concurrentSkipListSet = this.f;
        if (concurrentSkipListSet.size() > 3600) {
            return;
        }
        long j5 = (long) (1.0E9d / ((double) f));
        this.g = j5;
        if (z || z2) {
            concurrentSkipListSet.add(new w1(j, j2, j3, j4, z, z2, j5));
        }
    }

    public final void d() {
        io.sentry.v vVarA = this.b.a();
        try {
            if (this.d != null) {
                this.c.a(this.d);
                this.d = null;
            }
            this.f.clear();
            this.e.clear();
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

    /* JADX WARN: Removed duplicated region for block: B:69:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e3 A[Catch: all -> 0x00bb, TRY_LEAVE, TryCatch #4 {all -> 0x00bb, blocks: (B:17:0x002c, B:21:0x003d, B:24:0x0044, B:27:0x0059, B:29:0x006d, B:30:0x007a, B:32:0x0080, B:35:0x0092, B:37:0x009a, B:39:0x00a2, B:60:0x012d, B:43:0x00bf, B:45:0x00c7, B:51:0x00df, B:59:0x012a, B:47:0x00cf, B:49:0x00d7, B:61:0x0137, B:63:0x0147, B:65:0x014b, B:67:0x0153, B:73:0x0162, B:82:0x017a, B:84:0x018a, B:86:0x0197, B:87:0x01a1, B:88:0x01a3, B:90:0x01e3), top: B:126:0x002c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(io.sentry.p1 r32) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.x1.e(io.sentry.p1):void");
    }

    public final void f(io.sentry.p1 p1Var) {
        String str;
        if (!this.a || (p1Var instanceof k3) || (p1Var instanceof m3)) {
            return;
        }
        io.sentry.v vVarA = this.b.a();
        try {
            this.e.add(p1Var);
            if (this.d == null) {
                io.sentry.android.core.internal.util.p pVar = this.c;
                if (pVar.K) {
                    String strI = io.sentry.p.i();
                    pVar.J.put(strI, this);
                    pVar.b();
                    str = strI;
                } else {
                    str = null;
                }
                this.d = str;
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
