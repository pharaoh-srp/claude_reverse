package io.sentry.android.replay.capture;

import android.view.MotionEvent;
import defpackage.fjd;
import defpackage.g4;
import defpackage.jke;
import defpackage.tui;
import defpackage.uui;
import defpackage.wn9;
import defpackage.x44;
import defpackage.z9i;
import io.sentry.android.replay.y;
import io.sentry.h1;
import io.sentry.n4;
import io.sentry.protocol.w;
import io.sentry.t5;
import io.sentry.w6;
import io.sentry.x6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends c {
    public final w6 t;
    public final h1 u;
    public final io.sentry.transport.e v;
    public final io.sentry.util.l w;
    public final ArrayList x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(w6 w6Var, n4 n4Var, io.sentry.transport.c cVar, io.sentry.util.l lVar, io.sentry.android.replay.util.d dVar) {
        super(w6Var, n4Var, cVar, dVar);
        w6Var.getClass();
        cVar.getClass();
        lVar.getClass();
        dVar.getClass();
        this.t = w6Var;
        this.u = n4Var;
        this.v = cVar;
        this.w = lVar;
        this.x = new ArrayList();
    }

    @Override // io.sentry.android.replay.capture.c
    public final void a(boolean z, z9i z9iVar) throws Exception {
        w6 w6Var = this.t;
        if (!io.sentry.config.a.D(this.w, w6Var.getSessionReplay().e)) {
            w6Var.getLogger().h(t5.INFO, "Replay wasn't sampled by onErrorSampleRate, not capturing for event", new Object[0]);
            return;
        }
        h1 h1Var = this.u;
        if (h1Var != null) {
            h1Var.C(new jke(19, this));
        }
        if (!z) {
            r("capture_replay", new g4(this, 17, z9iVar));
        } else {
            this.g.set(true);
            w6Var.getLogger().h(t5.DEBUG, "Not capturing replay for crashed event, will be captured on next launch", new Object[0]);
        }
    }

    @Override // io.sentry.android.replay.capture.c
    public final c b() {
        boolean z = this.g.get();
        w6 w6Var = this.t;
        if (z) {
            w6Var.getLogger().h(t5.DEBUG, "Not converting to session mode, because the process is about to terminate", new Object[0]);
            return this;
        }
        n nVar = new n(w6Var, this.u, this.v, this.d);
        nVar.n(f());
        nVar.p(e(), d(), x6.BUFFER);
        return nVar;
    }

    @Override // io.sentry.android.replay.capture.c
    public final void g(y yVar) throws Exception {
        r("configuration_changed", new e(this, 0));
        n(yVar);
    }

    @Override // io.sentry.android.replay.capture.c
    public final void h(fjd fjdVar) {
        this.d.submit(new io.sentry.android.replay.util.e(new uui(this, fjdVar, this.v.a(), 2), "BufferCaptureStrategy.add_frame"));
    }

    @Override // io.sentry.android.replay.capture.c
    public final void i(MotionEvent motionEvent) {
        super.i(motionEvent);
        long jA = this.v.a() - this.t.getSessionReplay().h;
        ConcurrentLinkedDeque concurrentLinkedDeque = this.p;
        concurrentLinkedDeque.getClass();
        Iterator it = concurrentLinkedDeque.iterator();
        it.getClass();
        while (it.hasNext()) {
            if (((io.sentry.rrweb.b) it.next()).F < jA) {
                it.remove();
            }
        }
    }

    @Override // io.sentry.android.replay.capture.c
    public final void j() throws Exception {
        r("pause", new e(this, 1));
    }

    @Override // io.sentry.android.replay.capture.c
    public final void q() {
        io.sentry.android.replay.l lVar = this.h;
        this.d.submit(new io.sentry.android.replay.util.e(new tui(lVar != null ? lVar.e() : null, 15, this), "BufferCaptureStrategy.stop"));
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

    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(java.lang.String r11, defpackage.bz7 r12) throws java.lang.Exception {
        /*
            r10 = this;
            io.sentry.android.replay.y r6 = r10.f()
            io.sentry.w6 r0 = r10.t
            if (r6 != 0) goto L1b
            io.sentry.a1 r10 = r0.getLogger()
            io.sentry.t5 r12 = io.sentry.t5.DEBUG
            java.lang.String r0 = "Recorder config is not set, not creating segment for task: "
            java.lang.String r11 = r0.concat(r11)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r10.h(r12, r11, r0)
            return
        L1b:
            io.sentry.a7 r0 = r0.getSessionReplay()
            long r0 = r0.h
            io.sentry.transport.e r2 = r10.v
            long r2 = r2.a()
            io.sentry.android.replay.l r4 = r10.h
            if (r4 == 0) goto L5e
            io.sentry.util.a r5 = r4.J
            io.sentry.v r5 = r5.a()
            java.util.ArrayList r4 = r4.M     // Catch: java.lang.Throwable -> L43
            java.lang.Object r4 = defpackage.w44.N0(r4)     // Catch: java.lang.Throwable -> L43
            io.sentry.android.replay.m r4 = (io.sentry.android.replay.m) r4     // Catch: java.lang.Throwable -> L43
            r7 = 0
            if (r4 == 0) goto L46
            long r8 = r4.b     // Catch: java.lang.Throwable -> L43
            java.lang.Long r4 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L43
            goto L47
        L43:
            r0 = move-exception
            r10 = r0
            goto L57
        L46:
            r4 = r7
        L47:
            defpackage.csg.o(r5, r7)
            if (r4 == 0) goto L5e
            long r4 = r4.longValue()
            java.util.Date r4 = io.sentry.p.l(r4)
            if (r4 != 0) goto L64
            goto L5e
        L57:
            throw r10     // Catch: java.lang.Throwable -> L58
        L58:
            r0 = move-exception
            r11 = r0
            defpackage.csg.o(r5, r10)
            throw r11
        L5e:
            long r0 = r2 - r0
            java.util.Date r4 = io.sentry.p.l(r0)
        L64:
            r4.getClass()
            long r0 = r4.getTime()
            long r2 = r2 - r0
            io.sentry.protocol.w r5 = r10.d()
            io.sentry.android.replay.util.e r9 = new io.sentry.android.replay.util.e
            java.lang.String r0 = "BufferCaptureStrategy."
            java.lang.String r11 = r0.concat(r11)
            io.sentry.android.replay.capture.d r0 = new io.sentry.android.replay.capture.d
            r8 = 0
            r1 = r10
            r7 = r12
            r0.<init>(r1, r2, r4, r5, r6, r7, r8)
            r9.<init>(r0, r11)
            java.util.concurrent.ScheduledExecutorService r10 = r1.d
            r10.submit(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.capture.f.r(java.lang.String, bz7):void");
    }
}
