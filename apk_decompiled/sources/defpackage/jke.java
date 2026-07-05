package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.anthropic.claude.core.telemetry.SilentException;
import io.sentry.a0;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.FeedbackShakeIntegration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.SentryPerformanceProvider;
import io.sentry.android.core.f0;
import io.sentry.android.core.l;
import io.sentry.android.core.o1;
import io.sentry.android.replay.capture.n;
import io.sentry.android.replay.util.e;
import io.sentry.c5;
import io.sentry.e4;
import io.sentry.f1;
import io.sentry.h0;
import io.sentry.hints.c;
import io.sentry.hints.f;
import io.sentry.j4;
import io.sentry.m;
import io.sentry.n5;
import io.sentry.r1;
import io.sentry.t5;
import io.sentry.transport.a;
import io.sentry.util.b;
import io.sentry.util.g;
import io.sentry.w6;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jke implements cec, ehe, gm4, ldc, t0h, zdc, b, j4, g, o1, e4 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ jke(ActivityLifecycleIntegration activityLifecycleIntegration, r1 r1Var) {
        this.E = 14;
        this.F = r1Var;
    }

    @Override // io.sentry.android.core.o1
    public void a() {
        FeedbackShakeIntegration feedbackShakeIntegration = (FeedbackShakeIntegration) this.F;
        WeakReference weakReference = feedbackShakeIntegration.H;
        Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
        Boolean bool = f0.I.H;
        if (activity == null || feedbackShakeIntegration.G == null || feedbackShakeIntegration.I || Boolean.TRUE.equals(bool)) {
            return;
        }
        activity.runOnUiThread(new tui(feedbackShakeIntegration, 10, activity));
    }

    @Override // defpackage.gm4
    public void accept(Object obj) {
        int i = this.E;
        Object obj2 = this.F;
        switch (i) {
            case 3:
                ((hz8) obj2).b((hd5) obj);
                break;
            case 13:
                h0 h0Var = (h0) obj2;
                if (!((f) obj).d()) {
                    h0Var.g.h(t5.WARNING, "Timed out waiting for envelope submission.", new Object[0]);
                }
                break;
            case 21:
                a0 a0Var = (a0) obj;
                a0Var.K.add(a0Var.J);
                ((io.sentry.transport.b) obj2).G.getLogger().h(t5.DEBUG, "Envelope enqueued", new Object[0]);
                break;
            case androidx.health.platform.client.proto.g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                a aVar = (a) obj2;
                c cVar = (c) obj;
                w6 w6Var = aVar.I.G;
                if (!cVar.f(((c5) aVar.E.F).E)) {
                    w6Var.getLogger().h(t5.DEBUG, "Not firing envelope flush as there's an ongoing transaction", new Object[0]);
                } else {
                    cVar.E.countDown();
                    w6Var.getLogger().h(t5.DEBUG, "Disk flush envelope fired", new Object[0]);
                }
                break;
            default:
                lf5 lf5Var = (lf5) obj2;
                lf5Var.getClass();
                ((c) obj).E.countDown();
                ((w6) lf5Var.G).getLogger().h(t5.DEBUG, "Disk flush envelope fired due to rate limit", new Object[0]);
                break;
        }
    }

    public void b(f8j f8jVar) {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 8:
                ((mvd) obj).m(f8jVar);
                break;
            default:
                new Handler(Looper.getMainLooper()).post(new tui((jke) obj, 5, f8jVar));
                break;
        }
    }

    @Override // defpackage.ehe
    public void d(long j, ssc sscVar) {
        int i = this.E;
        vff vffVar = (vff) this.F;
        switch (i) {
            case 2:
                fik.g(j, sscVar, vffVar.c);
                break;
            default:
                fik.h(j, sscVar, vffVar.c);
                break;
        }
    }

    @Override // defpackage.t0h
    public Object execute() {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 5:
                sze szeVar = (sze) ((wk) obj).i;
                SQLiteDatabase sQLiteDatabaseC = szeVar.c();
                sQLiteDatabaseC.beginTransaction();
                try {
                    sQLiteDatabaseC.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseC.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + szeVar.F.a()).execute();
                    sQLiteDatabaseC.setTransactionSuccessful();
                    return null;
                } finally {
                    sQLiteDatabaseC.endTransaction();
                }
            default:
                dpf dpfVar = (dpf) obj;
                Iterator it = ((Iterable) ((sze) dpfVar.G).e(new mr9())).iterator();
                while (it.hasNext()) {
                    ((fj0) dpfVar.H).I((g91) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // io.sentry.util.g
    public Object f() {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case androidx.health.platform.client.proto.g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return ((SentryAndroidOptions) obj).getExecutorService();
            default:
                n5 n5Var = (n5) obj;
                int i2 = SentryPerformanceProvider.J;
                return n5Var;
        }
    }

    @Override // io.sentry.e4
    public void g(m mVar) {
        ((f1) this.F).B(new m());
    }

    @Override // io.sentry.j4
    public void i(f1 f1Var) {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 14:
                f1Var.O(new u95((r1) obj, 24, f1Var));
                break;
            case androidx.health.platform.client.proto.g.AVG_FIELD_NUMBER /* 18 */:
                f1Var.O(new u95((io.sentry.android.core.internal.gestures.g) obj, 28, f1Var));
                break;
            case androidx.health.platform.client.proto.g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                f1Var.getClass();
                f1Var.q(((io.sentry.android.replay.capture.f) obj).d());
                break;
            default:
                n nVar = (n) obj;
                f1Var.getClass();
                f1Var.q(nVar.d());
                String strN = f1Var.N();
                String strD1 = strN != null ? bsg.d1('.', strN, strN) : null;
                io.sentry.android.replay.capture.b bVar = nVar.l;
                wn9 wn9Var = io.sentry.android.replay.capture.c.s[2];
                bVar.getClass();
                wn9Var.getClass();
                Object andSet = bVar.a.getAndSet(strD1);
                if (!x44.r(andSet, strD1)) {
                    io.sentry.android.replay.capture.a aVar = new io.sentry.android.replay.capture.a(andSet, strD1, bVar.c, 3);
                    io.sentry.android.replay.capture.c cVar = bVar.b;
                    w6 w6Var = cVar.a;
                    if (w6Var.getThreadChecker().c()) {
                        ((ScheduledExecutorService) cVar.e.getValue()).submit(new e(new l(7, aVar), "CaptureStrategy.runInBackground"));
                    } else {
                        try {
                            aVar.a();
                        } catch (Throwable th) {
                            w6Var.getLogger().d(t5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                        }
                    }
                }
                break;
        }
    }

    @Override // defpackage.ldc
    public bdj j(View view, bdj bdjVar) {
        d1h d1hVar = (d1h) this.F;
        ArrayList arrayList = d1hVar.b;
        xcj xcjVar = bdjVar.a;
        f59 f59VarB = f59.b(xcjVar.i(519), xcjVar.i(64));
        f59 f59VarB2 = f59.b(xcjVar.j(519), xcjVar.j(64));
        if (!f59VarB.equals(d1hVar.c) || !f59VarB2.equals(d1hVar.d)) {
            d1hVar.c = f59VarB;
            d1hVar.d = f59VarB2;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                trd trdVar = (trd) arrayList.get(size);
                trdVar.c = f59VarB;
                trdVar.d = f59VarB2;
                trdVar.c();
            }
        }
        return bdjVar;
    }

    @Override // defpackage.zdc
    public void onComplete(d5h d5hVar) {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 7:
                thk.g((Intent) obj);
                break;
            case 10:
                ((mfj) obj).b.d(null);
                break;
            default:
                ((ScheduledFuture) obj).cancel(false);
                break;
        }
    }

    @Override // defpackage.cec
    public void onFailure(Exception exc) {
        au2 au2Var = (au2) this.F;
        SilentException.a(new SilentException("completeUpdate() failed", exc), ozf.F, false, 2);
        au2Var.invoke(exc);
    }

    public /* synthetic */ jke(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }
}
