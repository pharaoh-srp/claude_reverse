package io.sentry.android.replay.capture;

import defpackage.bwb;
import defpackage.fjd;
import defpackage.h16;
import defpackage.hw1;
import defpackage.jce;
import defpackage.k2c;
import defpackage.kce;
import defpackage.u0h;
import defpackage.w44;
import defpackage.wn9;
import defpackage.x44;
import defpackage.z9i;
import io.sentry.android.replay.y;
import io.sentry.h1;
import io.sentry.p;
import io.sentry.protocol.w;
import io.sentry.t5;
import io.sentry.w6;
import io.sentry.x6;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final /* synthetic */ wn9[] s;
    public final w6 a;
    public final h1 b;
    public final io.sentry.transport.e c;
    public final ScheduledExecutorService d;
    public final u0h e;
    public final hw1 f;
    public final AtomicBoolean g;
    public io.sentry.android.replay.l h;
    public final b i;
    public final b j;
    public final AtomicLong k;
    public final b l;
    public final b m;
    public final b n;
    public final b o;
    public final ConcurrentLinkedDeque p;
    public final Object q;
    public final ArrayList r;

    static {
        bwb bwbVar = new bwb(c.class, "recorderConfig", "getRecorderConfig$sentry_android_replay_release()Lio/sentry/android/replay/ScreenshotRecorderConfig;", 0);
        kce kceVar = jce.a;
        s = new wn9[]{kceVar.e(bwbVar), kceVar.e(new bwb(c.class, "segmentTimestamp", "getSegmentTimestamp()Ljava/util/Date;", 0)), kceVar.e(new bwb(c.class, "screenAtStart", "getScreenAtStart()Ljava/lang/String;", 0)), kceVar.e(new bwb(c.class, "currentReplayId", "getCurrentReplayId()Lio/sentry/protocol/SentryId;", 0)), kceVar.e(new bwb(c.class, "currentSegment", "getCurrentSegment()I", 0)), kceVar.e(new bwb(c.class, "replayType", "getReplayType()Lio/sentry/SentryReplayEvent$ReplayType;", 0))};
    }

    public c(w6 w6Var, h1 h1Var, io.sentry.transport.e eVar, ScheduledExecutorService scheduledExecutorService) {
        w6Var.getClass();
        eVar.getClass();
        scheduledExecutorService.getClass();
        this.a = w6Var;
        this.b = h1Var;
        this.c = eVar;
        this.d = scheduledExecutorService;
        this.e = new u0h(new k2c(14, this));
        eVar.getClass();
        hw1 hw1Var = new hw1();
        hw1Var.G = eVar;
        hw1Var.H = new LinkedHashMap(10);
        this.f = hw1Var;
        this.g = new AtomicBoolean(false);
        this.i = new b(this, this, 3);
        this.j = new b(this, this, 4);
        this.k = new AtomicLong();
        this.l = new b(this, this, 5);
        this.m = new b(w.F, this, this);
        this.n = new b(this, this, 1);
        this.o = new b(this, this, 2);
        this.p = new ConcurrentLinkedDeque();
        this.q = new Object();
        this.r = new ArrayList();
    }

    public static k c(c cVar, long j, Date date, w wVar, int i, int i2, int i3, int i4, int i5) {
        List listP1;
        b bVar = cVar.o;
        wn9[] wn9VarArr = s;
        wn9 wn9Var = wn9VarArr[5];
        bVar.getClass();
        wn9Var.getClass();
        x6 x6Var = (x6) bVar.a.get();
        io.sentry.android.replay.l lVar = cVar.h;
        b bVar2 = cVar.l;
        wn9 wn9Var2 = wn9VarArr[2];
        bVar2.getClass();
        wn9Var2.getClass();
        String str = (String) bVar2.a.get();
        ConcurrentLinkedDeque concurrentLinkedDeque = cVar.p;
        wVar.getClass();
        x6Var.getClass();
        concurrentLinkedDeque.getClass();
        synchronized (cVar.q) {
            listP1 = w44.p1(cVar.r);
            cVar.r.clear();
        }
        return h.a(cVar.b, cVar.a, j, date, wVar, i, i2, i3, x6Var, lVar, i4, i5, str, null, concurrentLinkedDeque, listP1);
    }

    public abstract void a(boolean z, z9i z9iVar);

    public abstract c b();

    public final w d() {
        wn9 wn9Var = s[3];
        b bVar = this.m;
        bVar.getClass();
        wn9Var.getClass();
        return (w) bVar.a.get();
    }

    public final int e() {
        wn9 wn9Var = s[4];
        b bVar = this.n;
        bVar.getClass();
        wn9Var.getClass();
        return ((Number) bVar.a.get()).intValue();
    }

    public final y f() {
        wn9 wn9Var = s[0];
        b bVar = this.i;
        bVar.getClass();
        wn9Var.getClass();
        return (y) bVar.a.get();
    }

    public abstract void g(y yVar);

    public abstract void h(fjd fjdVar);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.capture.c.i(android.view.MotionEvent):void");
    }

    public abstract void j();

    public final void k(w wVar) {
        wVar.getClass();
        if (wVar.equals(w.F)) {
            return;
        }
        synchronized (this.q) {
            if (this.r.size() < 100) {
                String string = wVar.toString();
                string.getClass();
                if (!this.r.contains(string)) {
                    this.r.add(string);
                }
            }
        }
    }

    public final void l() {
        o(p.k());
    }

    public final void m(int i) {
        int i2 = 4;
        wn9 wn9Var = s[4];
        Integer numValueOf = Integer.valueOf(i);
        b bVar = this.n;
        bVar.getClass();
        wn9Var.getClass();
        Object andSet = bVar.a.getAndSet(numValueOf);
        if (x44.r(andSet, numValueOf)) {
            return;
        }
        h16 h16Var = new h16(andSet, numValueOf, bVar.c, i2);
        c cVar = bVar.b;
        w6 w6Var = cVar.a;
        if (w6Var.getThreadChecker().c()) {
            ((ScheduledExecutorService) cVar.e.getValue()).submit(new io.sentry.android.replay.util.e(new io.sentry.android.core.l(3, h16Var), "CaptureStrategy.runInBackground"));
            return;
        }
        try {
            h16Var.a();
        } catch (Throwable th) {
            w6Var.getLogger().d(t5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
        }
    }

    public final void n(y yVar) {
        wn9 wn9Var = s[0];
        b bVar = this.i;
        bVar.getClass();
        wn9Var.getClass();
        Object andSet = bVar.a.getAndSet(yVar);
        if (x44.r(andSet, yVar)) {
            return;
        }
        a aVar = new a(andSet, yVar, bVar.c, 1);
        c cVar = bVar.b;
        w6 w6Var = cVar.a;
        if (w6Var.getThreadChecker().c()) {
            ((ScheduledExecutorService) cVar.e.getValue()).submit(new io.sentry.android.replay.util.e(new io.sentry.android.core.l(5, aVar), "CaptureStrategy.runInBackground"));
            return;
        }
        try {
            aVar.a();
        } catch (Throwable th) {
            w6Var.getLogger().d(t5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
        }
    }

    public final void o(Date date) {
        wn9 wn9Var = s[1];
        b bVar = this.j;
        bVar.getClass();
        wn9Var.getClass();
        Object andSet = bVar.a.getAndSet(date);
        if (x44.r(andSet, date)) {
            return;
        }
        a aVar = new a(andSet, date, bVar.c, 2);
        c cVar = bVar.b;
        w6 w6Var = cVar.a;
        if (w6Var.getThreadChecker().c()) {
            ((ScheduledExecutorService) cVar.e.getValue()).submit(new io.sentry.android.replay.util.e(new io.sentry.android.core.l(6, aVar), "CaptureStrategy.runInBackground"));
            return;
        }
        try {
            aVar.a();
        } catch (Throwable th) {
            w6Var.getLogger().d(t5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
        }
    }

    public void p(int i, w wVar, x6 x6Var) {
        wVar.getClass();
        this.h = new io.sentry.android.replay.l(this.a, wVar);
        wn9[] wn9VarArr = s;
        wn9 wn9Var = wn9VarArr[3];
        b bVar = this.m;
        bVar.getClass();
        wn9Var.getClass();
        Object andSet = bVar.a.getAndSet(wVar);
        if (!x44.r(andSet, wVar)) {
            a aVar = new a(andSet, wVar, bVar.c, 0);
            c cVar = bVar.b;
            w6 w6Var = cVar.a;
            if (w6Var.getThreadChecker().c()) {
                ((ScheduledExecutorService) cVar.e.getValue()).submit(new io.sentry.android.replay.util.e(new io.sentry.android.core.l(2, aVar), "CaptureStrategy.runInBackground"));
            } else {
                try {
                    aVar.a();
                } catch (Throwable th) {
                    w6Var.getLogger().d(t5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                }
            }
        }
        m(i);
        if (x6Var == null) {
            x6Var = this instanceof n ? x6.SESSION : x6.BUFFER;
        }
        x6Var.getClass();
        int i2 = 5;
        wn9 wn9Var2 = wn9VarArr[5];
        b bVar2 = this.o;
        bVar2.getClass();
        wn9Var2.getClass();
        Object andSet2 = bVar2.a.getAndSet(x6Var);
        if (!x44.r(andSet2, x6Var)) {
            h16 h16Var = new h16(andSet2, x6Var, bVar2.c, i2);
            c cVar2 = bVar2.b;
            w6 w6Var2 = cVar2.a;
            if (w6Var2.getThreadChecker().c()) {
                ((ScheduledExecutorService) cVar2.e.getValue()).submit(new io.sentry.android.replay.util.e(new io.sentry.android.core.l(4, h16Var), "CaptureStrategy.runInBackground"));
            } else {
                try {
                    h16Var.a();
                } catch (Throwable th2) {
                    w6Var2.getLogger().d(t5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
                }
            }
        }
        o(p.k());
        this.k.set(this.c.a());
    }

    public abstract void q();
}
