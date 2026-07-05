package io.sentry.android.core;

import android.content.Context;
import android.os.Build;
import com.anthropic.claude.api.tasks.TaskSessionEvent;
import defpackage.gkg;
import defpackage.jke;
import defpackage.u15;
import io.sentry.f7;
import io.sentry.t4;
import io.sentry.t5;
import io.sentry.w6;
import io.sentry.y3;
import io.sentry.z3;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements io.sentry.s1 {
    public final Context E;
    public final io.sentry.a1 F;
    public final String G;
    public final boolean H;
    public final int I;
    public final io.sentry.util.g J;
    public final l0 K;
    public boolean L;
    public final AtomicBoolean M;
    public final io.sentry.android.core.internal.util.p N;
    public volatile z3 O;
    public volatile s P;
    public long Q;
    public long R;
    public Date S;
    public final io.sentry.util.a T;

    public u(Context context, l0 l0Var, io.sentry.android.core.internal.util.p pVar, io.sentry.a1 a1Var, String str, boolean z, int i, io.sentry.util.g gVar) {
        this.L = false;
        this.M = new AtomicBoolean(false);
        this.P = null;
        this.T = new io.sentry.util.a();
        Context applicationContext = context.getApplicationContext();
        this.E = applicationContext != null ? applicationContext : context;
        io.sentry.p.v("ILogger is required", a1Var);
        this.F = a1Var;
        this.N = pVar;
        io.sentry.p.v("The BuildInfoProvider is required.", l0Var);
        this.K = l0Var;
        this.G = str;
        this.H = z;
        this.I = i;
        this.J = gVar;
        this.S = io.sentry.p.k();
    }

    public final y3 a(String str, String str2, String str3, boolean z, List list, w6 w6Var) {
        this.K.getClass();
        int i = Build.VERSION.SDK_INT;
        if (this.P != null) {
            io.sentry.v vVarA = this.T.a();
            try {
                z3 z3Var = this.O;
                if (z3Var == null || !z3Var.E.equals(str2)) {
                    this.F.h(t5.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", str, str3);
                    vVarA.close();
                    return null;
                }
                this.O = null;
                vVarA.close();
                this.F.h(t5.DEBUG, "Transaction %s (%s) finished.", str, str3);
                gkg gkgVarA = this.P.a(list, false);
                this.M.set(false);
                if (gkgVarA != null) {
                    long j = gkgVarA.E - this.Q;
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(z3Var);
                    long j2 = gkgVarA.E;
                    long j3 = this.Q;
                    long j4 = gkgVarA.F;
                    long j5 = this.R;
                    if (z3Var.I == null) {
                        z3Var.I = Long.valueOf(j2 - j3);
                        z3Var.H = Long.valueOf(z3Var.H.longValue() - j3);
                        z3Var.K = Long.valueOf(j4 - j5);
                        z3Var.J = Long.valueOf(z3Var.J.longValue() - j5);
                    }
                    Long l = w6Var instanceof SentryAndroidOptions ? u0.c(this.E, (SentryAndroidOptions) w6Var).h : null;
                    String string = l != null ? Long.toString(l.longValue()) : TaskSessionEvent.REPLAY_FROM_START;
                    String[] strArr = Build.SUPPORTED_ABIS;
                    File file = (File) gkgVarA.H;
                    Date date = this.S;
                    String string2 = Long.toString(j);
                    this.K.getClass();
                    String str4 = (strArr == null || strArr.length <= 0) ? "" : strArr[0];
                    io.sentry.o0 o0Var = new io.sentry.o0(3);
                    this.K.getClass();
                    String str5 = Build.MANUFACTURER;
                    this.K.getClass();
                    String str6 = Build.MODEL;
                    this.K.getClass();
                    return new y3(file, date, arrayList, str, str2, str3, string2, i, str4, o0Var, str5, str6, Build.VERSION.RELEASE, this.K.a(), string, w6Var.getProguardUuid(), w6Var.getRelease(), w6Var.getEnvironment(), (gkgVarA.G || z) ? "timeout" : "normal", (Map) gkgVarA.I);
                }
            } finally {
            }
        }
        return null;
    }

    @Override // io.sentry.s1
    public final void b(io.sentry.r1 r1Var) {
        if (this.M.get() && this.O == null) {
            io.sentry.v vVarA = this.T.a();
            try {
                if (this.M.get() && this.O == null) {
                    this.O = new z3(r1Var, Long.valueOf(this.Q), Long.valueOf(this.R));
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

    @Override // io.sentry.s1
    public final void close() {
        u uVar;
        z3 z3Var = this.O;
        if (z3Var != null) {
            uVar = this;
            uVar.a(z3Var.G, z3Var.E, z3Var.F, true, null, t4.g().r());
        } else {
            uVar = this;
        }
        uVar.M.set(false);
        if (uVar.P == null) {
            return;
        }
        s sVar = uVar.P;
        io.sentry.v vVarA = sVar.o.a();
        try {
            Future future = sVar.d;
            if (future != null) {
                future.cancel(true);
                sVar.d = null;
            }
            if (sVar.n) {
                sVar.a(null, true);
            }
            vVarA.close();
        } finally {
        }
    }

    @Override // io.sentry.s1
    public final y3 d(f7 f7Var, List list, w6 w6Var) {
        return a(f7Var.e, f7Var.a.toString(), f7Var.b.c.E.toString(), false, list, w6Var);
    }

    @Override // io.sentry.s1
    public final boolean isRunning() {
        return this.M.get();
    }

    @Override // io.sentry.s1
    public final void start() {
        u15 u15VarC;
        this.K.getClass();
        if (this.M.getAndSet(true)) {
            return;
        }
        if (!this.L) {
            this.L = true;
            if (this.H) {
                String str = this.G;
                if (str == null) {
                    this.F.h(t5.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
                } else {
                    int i = this.I;
                    if (i <= 0) {
                        this.F.h(t5.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i));
                    } else {
                        this.P = new s(str, 1000000 / i, this.N, this.J, this.F);
                    }
                }
            } else {
                this.F.h(t5.INFO, "Profiling is disabled in options.", new Object[0]);
            }
        }
        if (this.P != null && (u15VarC = this.P.c()) != null) {
            this.Q = u15VarC.E;
            this.R = u15VarC.F;
            this.S = (Date) u15VarC.G;
            this.F.h(t5.DEBUG, "Profiler started.", new Object[0]);
            return;
        }
        if (this.P != null && this.P.n) {
            this.F.h(t5.WARNING, "A profile is already running. This profile will be ignored.", new Object[0]);
            return;
        }
        io.sentry.v vVarA = this.T.a();
        try {
            this.O = null;
            vVarA.close();
            this.M.set(false);
        } finally {
        }
    }

    public u(Context context, SentryAndroidOptions sentryAndroidOptions, l0 l0Var, io.sentry.android.core.internal.util.p pVar) {
        this(context, l0Var, pVar, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.isProfilingEnabled(), sentryAndroidOptions.getProfilingTracesHz(), new jke(15, sentryAndroidOptions));
    }
}
