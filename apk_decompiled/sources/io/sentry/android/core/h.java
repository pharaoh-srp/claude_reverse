package io.sentry.android.core;

import defpackage.f60;
import defpackage.gkg;
import defpackage.lf5;
import defpackage.pya;
import io.sentry.a5;
import io.sentry.d3;
import io.sentry.d6;
import io.sentry.q7;
import io.sentry.t4;
import io.sentry.t5;
import io.sentry.u3;
import io.sentry.w6;
import io.sentry.x3;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class h implements io.sentry.v0, io.sentry.transport.n {
    public final io.sentry.a1 E;
    public final String F;
    public final int G;
    public final io.sentry.util.g H;
    public final l0 I;
    public final io.sentry.android.core.internal.util.p K;
    public io.sentry.h1 N;
    public Future O;
    public io.sentry.n P;
    public io.sentry.protocol.w R;
    public io.sentry.protocol.w S;
    public final AtomicBoolean T;
    public a5 U;
    public volatile boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public final io.sentry.util.a Z;
    public final io.sentry.util.a a0;
    public boolean J = false;
    public s L = null;
    public boolean M = false;
    public final ArrayList Q = new ArrayList();

    public h(l0 l0Var, io.sentry.android.core.internal.util.p pVar, io.sentry.a1 a1Var, String str, int i, io.sentry.util.g gVar) {
        io.sentry.protocol.w wVar = io.sentry.protocol.w.F;
        this.R = wVar;
        this.S = wVar;
        this.T = new AtomicBoolean(false);
        this.U = new d6();
        this.V = true;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = new io.sentry.util.a();
        this.a0 = new io.sentry.util.a();
        this.E = a1Var;
        this.K = pVar;
        this.I = l0Var;
        this.F = str;
        this.G = i;
        this.H = gVar;
    }

    @Override // io.sentry.v0
    public final void a(boolean z) {
        io.sentry.v vVarA = this.Z.a();
        try {
            this.Y = 0;
            this.W = true;
            if (z) {
                i(false);
                this.T.set(true);
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

    @Override // io.sentry.v0
    public final void b(x3 x3Var) {
        io.sentry.v vVarA = this.Z.a();
        try {
            int i = g.a[x3Var.ordinal()];
            if (i == 1) {
                int i2 = this.Y - 1;
                this.Y = i2;
                if (i2 > 0) {
                    vVarA.close();
                    return;
                } else {
                    if (i2 < 0) {
                        this.Y = 0;
                    }
                    this.W = true;
                }
            } else if (i == 2) {
                this.W = true;
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

    @Override // io.sentry.v0
    public final void c(x3 x3Var, q7 q7Var) {
        io.sentry.v vVarA = this.Z.a();
        try {
            if (this.V) {
                double dC = io.sentry.util.m.a().c();
                Double profileSessionSampleRate = q7Var.a.getProfileSessionSampleRate();
                this.X = profileSessionSampleRate != null && profileSessionSampleRate.doubleValue() >= dC;
                this.V = false;
            }
            if (!this.X) {
                this.E.h(t5.DEBUG, "Profiler was not started due to sampling decision.", new Object[0]);
                vVarA.close();
                return;
            }
            int i = g.a[x3Var.ordinal()];
            if (i == 1) {
                if (this.Y < 0) {
                    this.Y = 0;
                }
                this.Y++;
            } else if (i == 2 && this.M) {
                this.E.h(t5.DEBUG, "Profiler is already running.", new Object[0]);
                vVarA.close();
                return;
            }
            if (!this.M) {
                this.E.h(t5.DEBUG, "Started Profiler.", new Object[0]);
                h();
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

    @Override // io.sentry.transport.n
    public final void d(lf5 lf5Var) {
        if (lf5Var.d(io.sentry.o.All) || lf5Var.d(io.sentry.o.ProfileChunkUi)) {
            this.E.h(t5.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
            i(false);
        }
    }

    @Override // io.sentry.v0
    public final void e() {
        this.V = true;
    }

    @Override // io.sentry.v0
    public final io.sentry.protocol.w f() {
        return this.R;
    }

    public final void g() {
        io.sentry.h1 h1Var = this.N;
        if ((h1Var == null || h1Var == d3.b) && t4.g() != d3.b) {
            this.N = t4.g();
            this.P = t4.g().r().getCompositePerformanceCollector();
            lf5 lf5VarG = this.N.g();
            if (lf5VarG != null) {
                ((CopyOnWriteArrayList) lf5VarG.I).add(this);
            }
        }
    }

    public final void h() {
        g();
        this.I.getClass();
        if (!this.J) {
            this.J = true;
            io.sentry.a1 a1Var = this.E;
            String str = this.F;
            if (str == null) {
                a1Var.h(t5.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            } else {
                int i = this.G;
                if (i <= 0) {
                    a1Var.h(t5.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i));
                } else {
                    this.L = new s(str, 1000000 / i, this.K, null, a1Var);
                }
            }
        }
        if (this.L == null) {
            return;
        }
        io.sentry.h1 h1Var = this.N;
        io.sentry.a1 a1Var2 = this.E;
        if (h1Var != null) {
            lf5 lf5VarG = h1Var.g();
            if (lf5VarG != null && (lf5VarG.d(io.sentry.o.All) || lf5VarG.d(io.sentry.o.ProfileChunkUi))) {
                a1Var2.h(t5.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
                i(false);
                return;
            } else {
                if (this.N.r().getConnectionStatusProvider().e0() == io.sentry.s0.DISCONNECTED) {
                    a1Var2.h(t5.WARNING, "Device is offline. Stopping profiler.", new Object[0]);
                    i(false);
                    return;
                }
                this.U = this.N.r().getDateProvider().c();
            }
        } else {
            this.U = new d6();
        }
        if (this.L.c() == null) {
            return;
        }
        this.M = true;
        io.sentry.protocol.w wVar = this.R;
        io.sentry.protocol.w wVar2 = io.sentry.protocol.w.F;
        if (wVar.equals(wVar2)) {
            this.R = new io.sentry.protocol.w();
        }
        if (this.S.equals(wVar2)) {
            this.S = new io.sentry.protocol.w();
        }
        io.sentry.n nVar = this.P;
        if (nVar != null) {
            nVar.b(this.S.toString());
        }
        try {
            this.O = ((io.sentry.l1) this.H.f()).c(new pya(17, this), 60000L);
        } catch (RejectedExecutionException e) {
            a1Var2.d(t5.ERROR, "Failed to schedule profiling chunk finish. Did you call Sentry.close()?", e);
            this.W = true;
        }
    }

    public final void i(boolean z) {
        g();
        io.sentry.v vVarA = this.Z.a();
        try {
            Future future = this.O;
            if (future != null) {
                future.cancel(true);
            }
            if (this.L != null && this.M) {
                this.I.getClass();
                io.sentry.n nVar = this.P;
                gkg gkgVarA = this.L.a(nVar != null ? nVar.a(this.S.toString()) : null, false);
                io.sentry.a1 a1Var = this.E;
                if (gkgVarA == null) {
                    a1Var.h(t5.ERROR, "An error occurred while collecting a profile chunk, and it won't be sent.", new Object[0]);
                } else {
                    io.sentry.v vVarA2 = this.a0.a();
                    try {
                        this.Q.add(new u3(this.R, this.S, (Map) gkgVarA.I, (File) gkgVarA.H, this.U));
                        vVarA2.close();
                    } finally {
                    }
                }
                this.M = false;
                this.S = io.sentry.protocol.w.F;
                io.sentry.h1 h1Var = this.N;
                if (h1Var != null) {
                    w6 w6VarR = h1Var.r();
                    try {
                        w6VarR.getExecutorService().submit(new f60(this, w6VarR, h1Var, 13));
                    } catch (Throwable th) {
                        w6VarR.getLogger().d(t5.DEBUG, "Failed to send profile chunks.", th);
                    }
                }
                if (!z || this.W) {
                    this.R = io.sentry.protocol.w.F;
                    a1Var.h(t5.DEBUG, "Profile chunk finished.", new Object[0]);
                } else {
                    a1Var.h(t5.DEBUG, "Profile chunk finished. Starting a new one.", new Object[0]);
                    h();
                }
                vVarA.close();
                return;
            }
            io.sentry.protocol.w wVar = io.sentry.protocol.w.F;
            this.R = wVar;
            this.S = wVar;
            vVarA.close();
        } finally {
        }
    }
}
