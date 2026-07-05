package io.sentry.android.replay;

import android.content.Context;
import android.graphics.Bitmap;
import defpackage.bsg;
import defpackage.csg;
import defpackage.dae;
import defpackage.fjd;
import defpackage.isg;
import defpackage.lf5;
import defpackage.mdj;
import defpackage.pya;
import defpackage.u0h;
import defpackage.x44;
import defpackage.z9i;
import io.sentry.a4;
import io.sentry.a7;
import io.sentry.b3;
import io.sentry.b4;
import io.sentry.l1;
import io.sentry.n4;
import io.sentry.r5;
import io.sentry.s0;
import io.sentry.t0;
import io.sentry.t4;
import io.sentry.t5;
import io.sentry.w6;
import io.sentry.x1;
import java.io.Closeable;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lio/sentry/android/replay/ReplayIntegration;", "Lio/sentry/x1;", "Ljava/io/Closeable;", "Lio/sentry/b4;", "Lio/sentry/t0;", "Lio/sentry/transport/n;", "io/sentry/android/replay/o", "io/sentry/p0", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = mdj.f)
public final class ReplayIntegration implements x1, Closeable, b4, t0, io.sentry.transport.n {
    public static final /* synthetic */ int V = 0;
    public final Context E;
    public final io.sentry.transport.c F;
    public volatile s0 G;
    public w6 H;
    public n4 I;
    public h0 J;
    public io.sentry.android.replay.gestures.b K;
    public final u0h L;
    public final u0h M;
    public final u0h N;
    public final AtomicBoolean O;
    public final AtomicBoolean P;
    public io.sentry.android.replay.capture.c Q;
    public a4 R;
    public final io.sentry.d S;
    public final io.sentry.util.a T;
    public final r U;

    static {
        r5.d().b("maven:io.sentry:sentry-android-replay", "8.43.1");
    }

    public ReplayIntegration(Context context) {
        io.sentry.transport.c cVar = io.sentry.transport.c.E;
        Context applicationContext = context.getApplicationContext();
        this.E = applicationContext != null ? applicationContext : context;
        this.F = cVar;
        this.G = s0.UNKNOWN;
        this.L = new u0h(a.H);
        this.M = new u0h(a.I);
        this.N = new u0h(new p(this));
        this.O = new AtomicBoolean(false);
        this.P = new AtomicBoolean(false);
        this.R = b3.a;
        this.S = new io.sentry.d(4, false);
        this.T = new io.sentry.util.a();
        r rVar = new r();
        rVar.a = s.INITIAL;
        this.U = rVar;
    }

    @Override // io.sentry.x1
    public final void H(w6 w6Var) {
        Double d;
        this.H = w6Var;
        Double d2 = w6Var.getSessionReplay().d;
        if ((d2 == null || d2.doubleValue() <= 0.0d) && ((d = w6Var.getSessionReplay().e) == null || d.doubleValue() <= 0.0d)) {
            w6Var.getLogger().h(t5.INFO, "Session replay is disabled, no sample rate specified", new Object[0]);
            return;
        }
        n4 n4Var = n4.a;
        this.I = n4Var;
        this.J = new h0(w6Var, this, this, this.S, (io.sentry.android.replay.util.d) this.N.getValue());
        this.K = new io.sentry.android.replay.gestures.b(w6Var, this);
        this.O.set(true);
        w6Var.getConnectionStatusProvider().h0(this);
        lf5 lf5VarG = n4Var.g();
        if (lf5VarG != null) {
            ((CopyOnWriteArrayList) lf5VarG.I).add(this);
        }
        io.sentry.p.a("Replay");
        w6 w6Var2 = this.H;
        if (w6Var2 == null) {
            x44.o0("options");
            throw null;
        }
        l1 executorService = w6Var2.getExecutorService();
        executorService.getClass();
        w6 w6Var3 = this.H;
        if (w6Var3 != null) {
            io.sentry.config.a.I(executorService, w6Var3, new pya(24, this));
        } else {
            x44.o0("options");
            throw null;
        }
    }

    @Override // io.sentry.b4
    public final void K() throws Exception {
        io.sentry.android.replay.capture.c fVar;
        r rVar = this.U;
        io.sentry.v vVarA = this.T.a();
        try {
            if (!this.O.get()) {
                csg.o(vVarA, null);
                return;
            }
            s sVar = s.STARTED;
            if (!rVar.a(sVar)) {
                w6 w6Var = this.H;
                if (w6Var == null) {
                    x44.o0("options");
                    throw null;
                }
                w6Var.getLogger().h(t5.DEBUG, "Session replay is already being recorded, not starting a new one", new Object[0]);
                csg.o(vVarA, null);
                return;
            }
            io.sentry.util.l lVar = (io.sentry.util.l) this.L.getValue();
            w6 w6Var2 = this.H;
            if (w6Var2 == null) {
                x44.o0("options");
                throw null;
            }
            boolean zD = io.sentry.config.a.D(lVar, w6Var2.getSessionReplay().d);
            if (!zD) {
                w6 w6Var3 = this.H;
                if (w6Var3 == null) {
                    x44.o0("options");
                    throw null;
                }
                Double d = w6Var3.getSessionReplay().e;
                if (!(d != null && d.doubleValue() > 0.0d)) {
                    w6 w6Var4 = this.H;
                    if (w6Var4 == null) {
                        x44.o0("options");
                        throw null;
                    }
                    w6Var4.getLogger().h(t5.INFO, "Session replay is not started, full session was not sampled and onErrorSampleRate is not specified", new Object[0]);
                    csg.o(vVarA, null);
                    return;
                }
            }
            rVar.a = sVar;
            if (zD) {
                w6 w6Var5 = this.H;
                if (w6Var5 == null) {
                    x44.o0("options");
                    throw null;
                }
                fVar = new io.sentry.android.replay.capture.n(w6Var5, this.I, this.F, (io.sentry.android.replay.util.d) this.N.getValue());
            } else {
                w6 w6Var6 = this.H;
                if (w6Var6 == null) {
                    x44.o0("options");
                    throw null;
                }
                fVar = new io.sentry.android.replay.capture.f(w6Var6, this.I, this.F, (io.sentry.util.l) this.L.getValue(), (io.sentry.android.replay.util.d) this.N.getValue());
            }
            this.Q = fVar;
            h0 h0Var = this.J;
            if (h0Var != null) {
                h0Var.n();
            }
            io.sentry.android.replay.capture.c cVar = this.Q;
            if (cVar != null) {
                cVar.p(0, new io.sentry.protocol.w(), null);
            }
            if (this.J != null) {
                u uVarC = ((v) this.M.getValue()).c();
                h0 h0Var2 = this.J;
                h0Var2.getClass();
                uVarC.add(h0Var2);
            }
            ((v) this.M.getValue()).c().add(this.K);
            csg.o(vVarA, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                csg.o(vVarA, th);
                throw th2;
            }
        }
    }

    @Override // io.sentry.b4
    /* JADX INFO: renamed from: P, reason: from getter */
    public final a4 getR() {
        return this.R;
    }

    public final void R(String str) {
        File[] fileArrListFiles;
        w6 w6Var = this.H;
        if (w6Var == null) {
            x44.o0("options");
            throw null;
        }
        String cacheDirPath = w6Var.getCacheDirPath();
        if (cacheDirPath == null || (fileArrListFiles = new File(cacheDirPath).listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            String name = file.getName();
            name.getClass();
            if (isg.q0(name, "replay_", false)) {
                String string = n().toString();
                string.getClass();
                if (!bsg.u0(name, string, false) && (bsg.I0(str) || !bsg.u0(name, str, false))) {
                    io.sentry.p.e(file);
                }
            }
        }
    }

    public final boolean S() {
        return this.U.a.compareTo(s.STARTED) >= 0 && this.U.a.compareTo(s.STOPPED) < 0;
    }

    public final void T(Bitmap bitmap) throws Exception {
        n4 n4Var;
        n4 n4Var2;
        lf5 lf5VarG;
        lf5 lf5VarG2;
        bitmap.getClass();
        dae daeVar = new dae();
        if (this.I != null) {
            t4.e(new n(0, daeVar));
        }
        io.sentry.android.replay.capture.c cVar = this.Q;
        int i = 1;
        if (cVar != null) {
            cVar.h(new fjd(this, bitmap, daeVar, i));
        }
        if (this.Q instanceof io.sentry.android.replay.capture.n) {
            if (this.G == s0.DISCONNECTED || !(((n4Var = this.I) == null || (lf5VarG2 = n4Var.g()) == null || !lf5VarG2.d(io.sentry.o.All)) && ((n4Var2 = this.I) == null || (lf5VarG = n4Var2.g()) == null || !lf5VarG.d(io.sentry.o.Replay)))) {
                l0();
            }
        }
    }

    public final void b0(int i, int i2) {
        h0 h0Var;
        if (this.O.get() && S()) {
            w6 w6Var = this.H;
            if (w6Var == null) {
                x44.o0("options");
                throw null;
            }
            if (w6Var.getSessionReplay().k) {
                Context context = this.E;
                w6 w6Var2 = this.H;
                if (w6Var2 == null) {
                    x44.o0("options");
                    throw null;
                }
                a7 sessionReplay = w6Var2.getSessionReplay();
                sessionReplay.getClass();
                y yVarN = io.sentry.config.a.n(context, sessionReplay, i, i2);
                if (this.O.get() && S()) {
                    io.sentry.android.replay.capture.c cVar = this.Q;
                    if (cVar != null) {
                        cVar.g(yVarN);
                    }
                    h0 h0Var2 = this.J;
                    if (h0Var2 != null) {
                        h0Var2.f(yVarN);
                    }
                    if (this.U.a != s.PAUSED || (h0Var = this.J) == null) {
                        return;
                    }
                    h0Var.i();
                }
            }
        }
    }

    @Override // io.sentry.b4
    public final void c(Boolean bool) {
        if (this.O.get() && S()) {
            io.sentry.protocol.w wVar = io.sentry.protocol.w.F;
            io.sentry.android.replay.capture.c cVar = this.Q;
            if (wVar.equals(cVar != null ? cVar.d() : null)) {
                w6 w6Var = this.H;
                if (w6Var != null) {
                    w6Var.getLogger().h(t5.DEBUG, "Replay id is not set, not capturing for event", new Object[0]);
                    return;
                } else {
                    x44.o0("options");
                    throw null;
                }
            }
            io.sentry.android.replay.capture.c cVar2 = this.Q;
            if (cVar2 != null) {
                cVar2.a(bool.equals(Boolean.TRUE), new z9i(3, this));
            }
            io.sentry.android.replay.capture.c cVar3 = this.Q;
            this.Q = cVar3 != null ? cVar3.b() : null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Exception {
        lf5 lf5VarG;
        r rVar = this.U;
        io.sentry.v vVarA = this.T.a();
        try {
            if (this.O.get()) {
                s sVar = s.CLOSED;
                if (rVar.a(sVar)) {
                    w6 w6Var = this.H;
                    if (w6Var == null) {
                        x44.o0("options");
                        throw null;
                    }
                    w6Var.getConnectionStatusProvider().y0(this);
                    n4 n4Var = this.I;
                    if (n4Var != null && (lf5VarG = n4Var.g()) != null) {
                        ((CopyOnWriteArrayList) lf5VarG.I).remove(this);
                    }
                    stop();
                    h0 h0Var = this.J;
                    if (h0Var != null) {
                        h0Var.close();
                    }
                    this.J = null;
                    ((v) this.M.getValue()).close();
                    ((io.sentry.android.replay.util.d) this.N.getValue()).shutdown();
                    rVar.a = sVar;
                    csg.o(vVarA, null);
                    return;
                }
            }
            csg.o(vVarA, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                csg.o(vVarA, th);
                throw th2;
            }
        }
    }

    @Override // io.sentry.transport.n
    public final void d(lf5 lf5Var) throws Exception {
        if (this.Q instanceof io.sentry.android.replay.capture.n) {
            if (lf5Var.d(io.sentry.o.All) || lf5Var.d(io.sentry.o.Replay)) {
                l0();
            } else {
                r0();
            }
        }
    }

    @Override // io.sentry.t0
    public final void e(s0 s0Var) throws Exception {
        s0Var.getClass();
        this.G = s0Var;
        if (this.Q instanceof io.sentry.android.replay.capture.n) {
            if (s0Var == s0.DISCONNECTED) {
                l0();
            } else {
                r0();
            }
        }
    }

    @Override // io.sentry.b4
    public final void f() throws Exception {
        this.P.set(false);
        r0();
    }

    @Override // io.sentry.b4
    public final void i(io.sentry.protocol.w wVar) {
        io.sentry.android.replay.capture.c cVar;
        wVar.getClass();
        if (this.O.get() && S() && (cVar = this.Q) != null) {
            cVar.k(wVar);
        }
    }

    @Override // io.sentry.b4
    public final void j(d dVar) {
        this.R = dVar;
    }

    public final void l0() throws Exception {
        r rVar = this.U;
        io.sentry.v vVarA = this.T.a();
        try {
            if (this.O.get()) {
                s sVar = s.PAUSED;
                if (rVar.a(sVar)) {
                    h0 h0Var = this.J;
                    if (h0Var != null) {
                        h0Var.i();
                    }
                    io.sentry.android.replay.capture.c cVar = this.Q;
                    if (cVar != null) {
                        cVar.j();
                    }
                    rVar.a = sVar;
                    csg.o(vVarA, null);
                    return;
                }
            }
            csg.o(vVarA, null);
        } finally {
        }
    }

    @Override // io.sentry.b4
    public final io.sentry.protocol.w n() {
        io.sentry.protocol.w wVarD;
        io.sentry.android.replay.capture.c cVar = this.Q;
        if (cVar != null && (wVarD = cVar.d()) != null) {
            return wVarD;
        }
        io.sentry.protocol.w wVar = io.sentry.protocol.w.F;
        wVar.getClass();
        return wVar;
    }

    public final void r0() throws Exception {
        n4 n4Var;
        n4 n4Var2;
        lf5 lf5VarG;
        lf5 lf5VarG2;
        io.sentry.v vVarA = this.T.a();
        try {
            if (this.O.get()) {
                r rVar = this.U;
                s sVar = s.RESUMED;
                if (rVar.a(sVar)) {
                    if (!this.P.get() && this.G != s0.DISCONNECTED && (((n4Var = this.I) == null || (lf5VarG2 = n4Var.g()) == null || !lf5VarG2.d(io.sentry.o.All)) && ((n4Var2 = this.I) == null || (lf5VarG = n4Var2.g()) == null || !lf5VarG.d(io.sentry.o.Replay)))) {
                        r rVar2 = this.U;
                        rVar2.getClass();
                        rVar2.a = sVar;
                        io.sentry.android.replay.capture.c cVar = this.Q;
                        if (cVar != null) {
                            cVar.l();
                        }
                        h0 h0Var = this.J;
                        if (h0Var != null) {
                            h0Var.j();
                        }
                        csg.o(vVarA, null);
                        return;
                    }
                    csg.o(vVarA, null);
                    return;
                }
            }
            csg.o(vVarA, null);
        } finally {
        }
    }

    @Override // io.sentry.b4
    public final void stop() throws Exception {
        r rVar = this.U;
        io.sentry.v vVarA = this.T.a();
        try {
            if (this.O.get()) {
                s sVar = s.STOPPED;
                if (rVar.a(sVar)) {
                    if (this.J != null) {
                        u uVarC = ((v) this.M.getValue()).c();
                        h0 h0Var = this.J;
                        h0Var.getClass();
                        uVarC.remove(h0Var);
                    }
                    ((v) this.M.getValue()).c().remove(this.K);
                    h0 h0Var2 = this.J;
                    if (h0Var2 != null) {
                        h0Var2.reset();
                    }
                    h0 h0Var3 = this.J;
                    if (h0Var3 != null) {
                        h0Var3.x();
                    }
                    io.sentry.android.replay.gestures.b bVar = this.K;
                    if (bVar != null) {
                        bVar.b();
                    }
                    io.sentry.android.replay.capture.c cVar = this.Q;
                    if (cVar != null) {
                        cVar.q();
                    }
                    this.Q = null;
                    rVar.a = sVar;
                    csg.o(vVarA, null);
                    return;
                }
            }
            csg.o(vVarA, null);
        } finally {
        }
    }

    @Override // io.sentry.b4
    public final void x() throws Exception {
        this.P.set(true);
        l0();
    }
}
