package defpackage;

import android.app.Activity;
import android.os.PowerManager;
import android.view.Window;
import androidx.core.app.FrameMetricsAggregator;
import androidx.webkit.WebViewStartupException;
import com.anthropic.claude.core.telemetry.SilentException;
import io.sentry.android.core.AnrIntegration;
import io.sentry.android.core.FeedbackShakeIntegration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.anr.AnrProfilingIntegration;
import io.sentry.android.core.anr.e;
import io.sentry.android.core.c;
import io.sentry.android.core.internal.util.d;
import io.sentry.android.core.internal.util.p;
import io.sentry.android.core.u1;
import io.sentry.android.replay.capture.f;
import io.sentry.cache.g;
import io.sentry.l1;
import io.sentry.m4;
import io.sentry.protocol.w;
import io.sentry.t5;
import io.sentry.v;
import io.sentry.w6;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tui implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ tui(g gVar, List list) {
        this.E = 19;
        this.F = gVar;
        this.G = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock;
        switch (this.E) {
            case 0:
                dke dkeVar = (dke) this.F;
                yui yuiVar = (yui) this.G;
                r77 r77Var = (r77) dkeVar.F;
                String str = tpi.a;
                v77 v77Var = r77Var.E;
                v77Var.b0 = yuiVar;
                v77Var.m.e(25, new fp5(yuiVar));
                return;
            case 1:
                dke dkeVar2 = (dke) this.F;
                qo5 qo5Var = (qo5) this.G;
                synchronized (qo5Var) {
                }
                r77 r77Var2 = (r77) dkeVar2.F;
                String str2 = tpi.a;
                hp5 hp5Var = r77Var2.E.s;
                kx kxVarD = hp5Var.D((z7b) hp5Var.d.f);
                hp5Var.H(kxVarD, 1020, new do0(kxVarD, (Object) qo5Var, 14));
                return;
            case 2:
                t6g t6gVar = (t6g) this.F;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.G;
                ire ireVar = (ire) t6gVar.c;
                ireVar.getClass();
                if (atomicBoolean.get()) {
                    new Thread(new tui(ireVar, 3, atomicBoolean), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            case 3:
                ire ireVar2 = (ire) this.F;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.G;
                synchronized (ireVar2) {
                    if (atomicBoolean2.get() && (wakeLock = (PowerManager.WakeLock) ireVar2.G) != null) {
                        wakeLock.release();
                    }
                    break;
                }
                return;
            case 4:
                mvd mvdVar = (mvd) this.F;
                SilentException.a(new SilentException("startUpWebView failed", (WebViewStartupException) this.G), ozf.F, false, 2);
                ql8.m((AtomicBoolean) mvdVar.F, (ua2) mvdVar.G);
                return;
            case 5:
                ((jke) this.F).b((f8j) this.G);
                return;
            case 6:
                ((mvd) this.F).m((l8j) this.G);
                return;
            case 7:
                ((l1) this.G).a(((m4) this.F).r().getShutdownTimeoutMillis());
                return;
            case 8:
                c cVar = (c) this.F;
                Activity activity = (Activity) this.G;
                o5l o5lVar = ((FrameMetricsAggregator) cVar.a.a()).a;
                ArrayList arrayList = (ArrayList) o5lVar.H;
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        WeakReference weakReference = (WeakReference) it.next();
                        if (weakReference.get() == activity) {
                            arrayList.remove(weakReference);
                        }
                    }
                }
                activity.getWindow().removeOnFrameMetricsAvailableListener((gy7) o5lVar.I);
                return;
            case 9:
                AnrIntegration anrIntegration = (AnrIntegration) this.F;
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.G;
                v vVarA = anrIntegration.G.a();
                try {
                    if (!anrIntegration.F) {
                        anrIntegration.c(sentryAndroidOptions);
                        break;
                    }
                    vVarA.close();
                    return;
                } catch (Throwable th) {
                    try {
                        vVarA.close();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 10:
                FeedbackShakeIntegration feedbackShakeIntegration = (FeedbackShakeIntegration) this.F;
                Activity activity2 = (Activity) this.G;
                if (feedbackShakeIntegration.I || activity2.isFinishing() || activity2.isDestroyed()) {
                    return;
                }
                try {
                    feedbackShakeIntegration.I = true;
                    Runnable runnable = feedbackShakeIntegration.G.getFeedbackOptions().h;
                    feedbackShakeIntegration.J = runnable;
                    feedbackShakeIntegration.G.getFeedbackOptions().h = new tui(feedbackShakeIntegration, 11, runnable);
                    new u1(activity2).show();
                    return;
                } catch (Throwable th3) {
                    feedbackShakeIntegration.I = false;
                    feedbackShakeIntegration.G.getFeedbackOptions().h = feedbackShakeIntegration.J;
                    feedbackShakeIntegration.J = null;
                    feedbackShakeIntegration.G.getLogger().d(t5.ERROR, "Failed to show feedback dialog on shake.", th3);
                    return;
                }
            case 11:
                FeedbackShakeIntegration feedbackShakeIntegration2 = (FeedbackShakeIntegration) this.F;
                Runnable runnable2 = (Runnable) this.G;
                feedbackShakeIntegration2.I = false;
                feedbackShakeIntegration2.G.getFeedbackOptions().h = runnable2;
                if (runnable2 != null) {
                    runnable2.run();
                }
                feedbackShakeIntegration2.J = null;
                return;
            case 12:
                u1 u1Var = (u1) this.F;
                Activity activity3 = (Activity) this.G;
                if (activity3.isFinishing() || activity3.isDestroyed()) {
                    return;
                }
                u1Var.show();
                return;
            case 13:
                AnrProfilingIntegration anrProfilingIntegration = (AnrProfilingIntegration) this.F;
                e eVar = (e) this.G;
                if (eVar == null) {
                    return;
                }
                try {
                    eVar.close();
                    return;
                } catch (IOException unused) {
                    anrProfilingIntegration.M.h(t5.WARNING, "Failed to close AnrProfileManager", new Object[0]);
                    return;
                }
            case 14:
                p pVar = (p) this.F;
                Window window = (Window) this.G;
                try {
                    if (pVar.F.remove(window)) {
                        d dVar = pVar.L;
                        ed9 ed9Var = pVar.M;
                        dVar.getClass();
                        if (ed9Var == null) {
                            return;
                        }
                        window.removeOnFrameMetricsAvailableListener(ed9Var);
                        return;
                    }
                    return;
                } catch (Throwable th4) {
                    pVar.G.d(t5.ERROR, "Failed to remove frameMetricsAvailableListener", th4);
                    return;
                }
            case androidx.health.platform.client.proto.g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                File file = (File) this.F;
                f fVar = (f) this.G;
                io.sentry.p.e(file);
                fVar.m(-1);
                return;
            case 16:
                pya pyaVar = (pya) this.F;
                w6 w6Var = (w6) this.G;
                try {
                    pyaVar.run();
                    return;
                } catch (Throwable th5) {
                    w6Var.getLogger().d(t5.ERROR, "Failed to execute task ReplayIntegration.finalize_previous_replay", th5);
                    return;
                }
            case androidx.health.platform.client.proto.g.MAX_FIELD_NUMBER /* 17 */:
                Runnable runnable3 = (Runnable) this.F;
                io.sentry.android.replay.util.d dVar2 = (io.sentry.android.replay.util.d) this.G;
                try {
                    runnable3.run();
                    return;
                } catch (Throwable th6) {
                    dVar2.F.getLogger().d(t5.ERROR, "Failed to execute task ".concat(runnable3 instanceof io.sentry.android.replay.util.e ? ((io.sentry.android.replay.util.e) runnable3).E : ""), th6);
                    return;
                }
            case androidx.health.platform.client.proto.g.AVG_FIELD_NUMBER /* 18 */:
                ((g) this.F).d("extras.json", (Map) this.G);
                return;
            case androidx.health.platform.client.proto.g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((g) this.F).d("fingerprint.json", (List) this.G);
                return;
            case androidx.health.platform.client.proto.g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ((g) this.F).d("replay.json", (w) this.G);
                return;
            default:
                g gVar = (g) this.F;
                t5 t5Var = (t5) this.G;
                if (t5Var == null) {
                    gVar.a("level.json");
                    return;
                } else {
                    gVar.d("level.json", t5Var);
                    return;
                }
        }
    }

    public /* synthetic */ tui(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }
}
