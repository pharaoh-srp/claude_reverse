package io.sentry.android.core;

import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import defpackage.gkg;
import defpackage.pya;
import defpackage.u15;
import io.sentry.s3;
import io.sentry.t5;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class s {
    public final File b;
    public final int c;
    public String f;
    public final io.sentry.android.core.internal.util.p g;
    public final io.sentry.util.g l;
    public final io.sentry.a1 m;
    public long a = 0;
    public Future d = null;
    public File e = null;
    public final ArrayDeque h = new ArrayDeque();
    public final ArrayDeque i = new ArrayDeque();
    public final ArrayDeque j = new ArrayDeque();
    public final HashMap k = new HashMap();
    public volatile boolean n = false;
    public final io.sentry.util.a o = new io.sentry.util.a();

    public s(String str, int i, io.sentry.android.core.internal.util.p pVar, io.sentry.util.g gVar, io.sentry.a1 a1Var) {
        io.sentry.p.v("TracesFilesDirPath is required", str);
        this.b = new File(str);
        this.c = i;
        io.sentry.p.v("Logger is required", a1Var);
        this.m = a1Var;
        this.l = gVar;
        io.sentry.p.v("SentryFrameMetricsCollector is required", pVar);
        this.g = pVar;
    }

    public final gkg a(List list, boolean z) {
        io.sentry.v vVarA = this.o.a();
        try {
            if (!this.n) {
                this.m.h(t5.WARNING, "Profiler not running", new Object[0]);
                vVarA.close();
                return null;
            }
            try {
                Debug.stopMethodTracing();
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            this.n = false;
            this.g.a(this.f);
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            if (this.e == null) {
                this.m.h(t5.ERROR, "Trace file does not exists", new Object[0]);
                vVarA.close();
                return null;
            }
            if (!this.i.isEmpty()) {
                this.k.put("slow_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.i));
            }
            if (!this.j.isEmpty()) {
                this.k.put("frozen_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.j));
            }
            if (!this.h.isEmpty()) {
                this.k.put("screen_frame_rates", new io.sentry.profilemeasurements.a("hz", this.h));
            }
            b(list);
            Future future = this.d;
            if (future != null) {
                future.cancel(true);
                this.d = null;
            }
            gkg gkgVar = new gkg(jElapsedRealtimeNanos, elapsedCpuTime, z, this.e, this.k);
            vVarA.close();
            return gkgVar;
        } finally {
        }
    }

    public final void b(List list) {
        long jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - this.a) - TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (list != null) {
            ArrayDeque arrayDeque = new ArrayDeque(list.size());
            ArrayDeque arrayDeque2 = new ArrayDeque(list.size());
            ArrayDeque arrayDeque3 = new ArrayDeque(list.size());
            synchronized (list) {
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        s3 s3Var = (s3) it.next();
                        long jB = s3Var.b();
                        long j = jB + jElapsedRealtimeNanos;
                        Double dA = s3Var.a();
                        Long lC = s3Var.c();
                        Long lD = s3Var.d();
                        if (dA != null) {
                            arrayDeque3.add(new io.sentry.profilemeasurements.b(Long.valueOf(j), dA, jB));
                        }
                        if (lC != null) {
                            arrayDeque.add(new io.sentry.profilemeasurements.b(Long.valueOf(j), lC, jB));
                        }
                        if (lD != null) {
                            arrayDeque2.add(new io.sentry.profilemeasurements.b(Long.valueOf(j), lD, jB));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!arrayDeque3.isEmpty()) {
                this.k.put("cpu_usage", new io.sentry.profilemeasurements.a("percent", arrayDeque3));
            }
            if (!arrayDeque.isEmpty()) {
                this.k.put("memory_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque));
            }
            if (arrayDeque2.isEmpty()) {
                return;
            }
            this.k.put("memory_native_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque2));
        }
    }

    public final u15 c() {
        String strI;
        io.sentry.v vVarA = this.o.a();
        try {
            int i = this.c;
            if (i == 0) {
                this.m.h(t5.WARNING, "Disabling profiling because intervaUs is set to %d", Integer.valueOf(i));
                vVarA.close();
                return null;
            }
            if (this.n) {
                this.m.h(t5.WARNING, "Profiling has already started...", new Object[0]);
                vVarA.close();
                return null;
            }
            this.e = new File(this.b, io.sentry.p.i().concat(".trace"));
            this.k.clear();
            this.h.clear();
            this.i.clear();
            this.j.clear();
            io.sentry.android.core.internal.util.p pVar = this.g;
            r rVar = new r(this);
            if (pVar.K) {
                strI = io.sentry.p.i();
                pVar.J.put(strI, rVar);
                pVar.b();
            } else {
                strI = null;
            }
            this.f = strI;
            try {
                io.sentry.util.g gVar = this.l;
                if (gVar != null) {
                    this.d = ((io.sentry.l1) gVar.f()).c(new pya(18, this), 30000L);
                }
            } catch (RejectedExecutionException e) {
                this.m.d(t5.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e);
            }
            this.a = SystemClock.elapsedRealtimeNanos();
            Date dateK = io.sentry.p.k();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            try {
                Debug.startMethodTracingSampling(this.e.getPath(), 3000000, this.c);
                this.n = true;
                u15 u15Var = new u15(this.a, elapsedCpuTime, dateK);
                vVarA.close();
                return u15Var;
            } catch (Throwable th) {
                a(null, false);
                this.m.d(t5.ERROR, "Unable to start a profile: ", th);
                this.n = false;
                vVarA.close();
                return null;
            }
        } finally {
        }
    }
}
