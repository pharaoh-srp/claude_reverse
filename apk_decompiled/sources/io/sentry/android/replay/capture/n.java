package io.sentry.android.replay.capture;

import defpackage.bz7;
import defpackage.fjd;
import defpackage.g4;
import defpackage.jke;
import defpackage.wn9;
import defpackage.x44;
import defpackage.z9i;
import io.sentry.android.replay.y;
import io.sentry.b2;
import io.sentry.h1;
import io.sentry.n0;
import io.sentry.protocol.w;
import io.sentry.t5;
import io.sentry.w6;
import io.sentry.x6;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends c {
    public final w6 t;
    public final h1 u;
    public final io.sentry.transport.e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(w6 w6Var, h1 h1Var, io.sentry.transport.e eVar, ScheduledExecutorService scheduledExecutorService) {
        super(w6Var, h1Var, eVar, scheduledExecutorService);
        w6Var.getClass();
        eVar.getClass();
        scheduledExecutorService.getClass();
        this.t = w6Var;
        this.u = h1Var;
        this.v = eVar;
    }

    @Override // io.sentry.android.replay.capture.c
    public final void a(boolean z, z9i z9iVar) {
        w6 w6Var = this.t;
        if (w6Var.getSessionReplay().m) {
            w6Var.getLogger().h(t5.DEBUG, "Replay is already running in 'session' mode, not capturing for event", new Object[0]);
        }
        this.g.set(z);
    }

    @Override // io.sentry.android.replay.capture.c
    public final c b() {
        return this;
    }

    @Override // io.sentry.android.replay.capture.c
    public final void g(y yVar) {
        r("onConfigurationChanged", new m(this, 0));
        n(yVar);
    }

    @Override // io.sentry.android.replay.capture.c
    public final void h(final fjd fjdVar) {
        final y yVarF = f();
        final long jA = this.v.a();
        this.d.submit(new io.sentry.android.replay.util.e(new Runnable() { // from class: io.sentry.android.replay.capture.l
            @Override // java.lang.Runnable
            public final void run() {
                n nVar = this.E;
                io.sentry.android.replay.l lVar = nVar.h;
                w6 w6Var = nVar.t;
                if (lVar != null) {
                    fjdVar.invoke(lVar, Long.valueOf(jA));
                }
                b bVar = nVar.j;
                wn9 wn9Var = c.s[1];
                bVar.getClass();
                wn9Var.getClass();
                Date date = (Date) bVar.a.get();
                if (date == null) {
                    w6Var.getLogger().h(t5.DEBUG, "Segment timestamp is not set, not recording frame", new Object[0]);
                    return;
                }
                if (nVar.g.get()) {
                    w6Var.getLogger().h(t5.DEBUG, "Not capturing segment, because the app is terminating, will be captured on next launch", new Object[0]);
                    return;
                }
                y yVar = yVarF;
                if (yVar == null) {
                    w6Var.getLogger().h(t5.DEBUG, "Recorder config is not set, not capturing a segment", new Object[0]);
                    return;
                }
                long jA2 = nVar.v.a();
                if (jA2 - date.getTime() >= w6Var.getSessionReplay().i) {
                    k kVarC = c.c(nVar, w6Var.getSessionReplay().i, date, nVar.d(), nVar.e(), yVar.b, yVar.a, yVar.e, yVar.f);
                    if (kVarC instanceof i) {
                        i iVar = (i) kVarC;
                        iVar.a(nVar.u, new n0());
                        nVar.m(nVar.e() + 1);
                        nVar.o(iVar.a.Y);
                    }
                }
                if (jA2 - nVar.k.get() >= w6Var.getSessionReplay().j) {
                    w6Var.getReplayController().stop();
                    w6Var.getLogger().h(t5.INFO, "Session replay deadline exceeded (1h), stopping recording", new Object[0]);
                }
            }
        }, "SessionCaptureStrategy.add_frame"));
    }

    @Override // io.sentry.android.replay.capture.c
    public final void j() {
        r("pause", new m(this, 1));
    }

    @Override // io.sentry.android.replay.capture.c
    public final void p(int i, w wVar, x6 x6Var) {
        wVar.getClass();
        super.p(i, wVar, x6Var);
        h1 h1Var = this.u;
        if (h1Var != null) {
            h1Var.C(new jke(20, this));
        }
    }

    @Override // io.sentry.android.replay.capture.c
    public final void q() {
        io.sentry.android.replay.l lVar = this.h;
        r("stop", new g4(this, 18, lVar != null ? lVar.e() : null));
        h1 h1Var = this.u;
        if (h1Var != null) {
            h1Var.w(new b2(7));
        }
        io.sentry.android.replay.l lVar2 = this.h;
        if (lVar2 != null) {
            lVar2.close();
        }
        this.k.set(0L);
        o(null);
        w wVar = w.F;
        wVar.getClass();
        wn9 wn9Var = c.s[3];
        b bVar = this.m;
        bVar.getClass();
        wn9Var.getClass();
        Object andSet = bVar.a.getAndSet(wVar);
        if (x44.r(andSet, wVar)) {
            return;
        }
        a aVar = new a(andSet, wVar, bVar.c, 0);
        c cVar = bVar.b;
        w6 w6Var = cVar.a;
        if (w6Var.getThreadChecker().c()) {
            ((ScheduledExecutorService) cVar.e.getValue()).submit(new io.sentry.android.replay.util.e(new io.sentry.android.core.l(2, aVar), "CaptureStrategy.runInBackground"));
            return;
        }
        try {
            aVar.a();
        } catch (Throwable th) {
            w6Var.getLogger().d(t5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
        }
    }

    public final void r(String str, bz7 bz7Var) {
        y yVarF = f();
        if (yVarF == null) {
            this.t.getLogger().h(t5.DEBUG, "Recorder config is not set, not creating segment for task: ".concat(str), new Object[0]);
            return;
        }
        long jA = this.v.a();
        wn9 wn9Var = c.s[1];
        b bVar = this.j;
        bVar.getClass();
        wn9Var.getClass();
        Date date = (Date) bVar.a.get();
        if (date == null) {
            return;
        }
        long time = jA - date.getTime();
        w wVarD = d();
        this.d.submit(new io.sentry.android.replay.util.e(new d(this, time, date, wVarD, yVarF, bz7Var, 1), "SessionCaptureStrategy.".concat(str)));
    }
}
