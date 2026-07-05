package io.sentry.android.core;

import android.app.Activity;
import android.app.ApplicationExitInfo;
import android.os.Handler;
import android.os.Looper;
import io.sentry.j2;
import io.sentry.j5;
import io.sentry.t5;
import io.sentry.w6;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class q0 implements io.sentry.transport.g, i0 {
    public static final q0 b = new q0();
    public Object a;

    public q0() {
        this.a = new Handler(Looper.getMainLooper());
    }

    @Override // io.sentry.transport.g
    public boolean a() {
        int i = v.a[((w6) this.a).getConnectionStatusProvider().e0().ordinal()];
        return i == 1 || i == 2 || i == 3;
    }

    @Override // io.sentry.android.core.i0
    public int b() {
        return 6;
    }

    public void c(Activity activity) {
        WeakReference weakReference = (WeakReference) this.a;
        if (weakReference == null || weakReference.get() != activity) {
            this.a = new WeakReference(activity);
        }
    }

    @Override // io.sentry.android.core.i0
    public Long g() {
        return io.sentry.android.core.cache.b.m((SentryAndroidOptions) this.a, "last_anr_report", "ANR");
    }

    @Override // io.sentry.android.core.i0
    public String h() {
        return "ANR";
    }

    @Override // io.sentry.android.core.i0
    public boolean l() {
        return ((SentryAndroidOptions) this.a).isReportHistoricalAnrs();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [io.sentry.android.core.z] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.io.InputStream] */
    @Override // io.sentry.android.core.i0
    public j0 m(ApplicationExitInfo applicationExitInfo, boolean z) {
        a0 a0Var;
        byte[] bArr;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.a;
        long timestamp = applicationExitInfo.getTimestamp();
        boolean z2 = applicationExitInfo.getImportance() != 100;
        try {
            ?? traceInputStream = applicationExitInfo.getTraceInputStream();
            try {
                if (traceInputStream == 0) {
                    a0Var = new a0(z.NO_DUMP);
                    if (traceInputStream != 0) {
                        traceInputStream.close();
                    }
                } else {
                    byte[] bArrC = io.sentry.config.a.C(traceInputStream);
                    traceInputStream.close();
                    try {
                        traceInputStream = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArrC)));
                        try {
                            io.sentry.android.core.internal.threaddump.b bVarB = io.sentry.android.core.internal.threaddump.b.b(traceInputStream);
                            io.sentry.android.core.internal.threaddump.c cVar = new io.sentry.android.core.internal.threaddump.c(sentryAndroidOptions, z2);
                            cVar.g(bVarB);
                            ArrayList arrayListE = cVar.e();
                            ArrayList arrayListC = cVar.c();
                            io.sentry.protocol.c cVarB = cVar.b();
                            if (arrayListE.isEmpty()) {
                                a0Var = new a0(z.NO_DUMP);
                                traceInputStream.close();
                            } else {
                                a0 a0Var2 = new a0(z.DUMP, bArrC, arrayListE, arrayListC, cVarB);
                                traceInputStream.close();
                                a0Var = a0Var2;
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        sentryAndroidOptions.getLogger().d(t5.WARNING, "Failed to parse ANR thread dump", th);
                        traceInputStream = z.ERROR;
                        a0Var = new a0(traceInputStream, bArrC);
                    }
                }
            } finally {
            }
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().d(t5.WARNING, "Failed to read ANR thread dump", th2);
            a0Var = new a0(z.NO_DUMP);
        }
        z zVar = z.NO_DUMP;
        z zVar2 = a0Var.a;
        if (zVar2 == zVar) {
            sentryAndroidOptions.getLogger().h(t5.WARNING, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo.toString());
            return null;
        }
        x xVar = new x(sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getLogger(), timestamp, z, z2);
        io.sentry.n0 n0VarA = io.sentry.util.c.a(xVar);
        j5 j5Var = new j5();
        if (zVar2 == z.ERROR) {
            io.sentry.protocol.p pVar = new io.sentry.protocol.p();
            pVar.E = "Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.";
            j5Var.U = pVar;
        } else if (zVar2 == z.DUMP) {
            j5Var.W = new j2(a0Var.c);
            ArrayList arrayList = a0Var.d;
            if (arrayList != null) {
                io.sentry.protocol.f fVar = new io.sentry.protocol.f();
                fVar.F = new ArrayList(arrayList);
                j5Var.R = fVar;
            }
            io.sentry.protocol.c cVar2 = a0Var.e;
            if (cVar2 != null) {
                j5Var.F.k("art", cVar2);
            }
        }
        j5Var.Y = t5.FATAL;
        j5Var.T = io.sentry.p.l(timestamp);
        if (sentryAndroidOptions.isAttachAnrThreadDump() && (bArr = a0Var.b) != null) {
            n0VarA.f = new io.sentry.a(bArr, "thread-dump.txt", "text/plain");
        }
        return new j0(j5Var, n0VarA, xVar, 0);
    }

    public /* synthetic */ q0(w6 w6Var) {
        this.a = w6Var;
    }
}
