package defpackage;

import android.content.res.Configuration;
import io.sentry.android.core.AppComponentsBreadcrumbsIntegration;
import io.sentry.android.replay.capture.b;
import io.sentry.android.replay.capture.c;
import io.sentry.android.replay.capture.f;
import io.sentry.android.replay.capture.i;
import io.sentry.android.replay.k;
import io.sentry.android.replay.l;
import io.sentry.android.replay.util.e;
import io.sentry.config.a;
import io.sentry.n0;
import io.sentry.protocol.g;
import io.sentry.rrweb.m;
import io.sentry.t5;
import io.sentry.w6;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uui implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ long F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ uui(AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration, long j, Configuration configuration) {
        this.E = 1;
        this.G = appComponentsBreadcrumbsIntegration;
        this.F = j;
        this.H = configuration;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        long j = this.F;
        Object obj = this.H;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                r77 r77Var = (r77) ((dke) obj2).F;
                String str = tpi.a;
                v77 v77Var = r77Var.E;
                hp5 hp5Var = v77Var.s;
                kx kxVarG = hp5Var.G();
                hp5Var.H(kxVarG, 26, new do0(kxVarG, obj, j));
                if (v77Var.O == obj) {
                    v77Var.m.e(26, new ep5(27));
                    return;
                }
                return;
            case 1:
                AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration = (AppComponentsBreadcrumbsIntegration) obj2;
                Configuration configuration = (Configuration) obj;
                if (appComponentsBreadcrumbsIntegration.F != null) {
                    g gVarR = a.r(appComponentsBreadcrumbsIntegration.E.getResources().getConfiguration().orientation);
                    String lowerCase = gVarR != null ? gVarR.name().toLowerCase(Locale.ROOT) : "undefined";
                    io.sentry.g gVar = new io.sentry.g(j);
                    gVar.I = "navigation";
                    gVar.K = "device.orientation";
                    gVar.c("position", lowerCase);
                    gVar.M = t5.INFO;
                    n0 n0Var = new n0();
                    n0Var.d("android:configuration", configuration);
                    appComponentsBreadcrumbsIntegration.F.j(gVar, n0Var);
                    return;
                }
                return;
            default:
                f fVar = (f) obj2;
                fjd fjdVar = (fjd) obj;
                l lVar = fVar.h;
                if (lVar != null) {
                    fjdVar.invoke(lVar, Long.valueOf(j));
                }
                long jA = fVar.v.a() - fVar.t.getSessionReplay().h;
                l lVar2 = fVar.h;
                String strI = lVar2 != null ? lVar2.i(jA) : null;
                b bVar = fVar.l;
                wn9 wn9Var = c.s[2];
                bVar.getClass();
                wn9Var.getClass();
                Object andSet = bVar.a.getAndSet(strI);
                if (!x44.r(andSet, strI)) {
                    io.sentry.android.replay.capture.a aVar = new io.sentry.android.replay.capture.a(andSet, strI, bVar.c, 3);
                    c cVar = bVar.b;
                    w6 w6Var = cVar.a;
                    if (w6Var.getThreadChecker().c()) {
                        ((ScheduledExecutorService) cVar.e.getValue()).submit(new e(new io.sentry.android.core.l(7, aVar), "CaptureStrategy.runInBackground"));
                    } else {
                        try {
                            aVar.a();
                        } catch (Throwable th) {
                            w6Var.getLogger().d(t5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                        }
                    }
                    break;
                }
                ArrayList arrayList = fVar.x;
                z9e z9eVar = new z9e();
                b54.w0(new k(jA, fVar, z9eVar, 1), arrayList);
                if (z9eVar.E) {
                    int i2 = 0;
                    for (Object obj3 : arrayList) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            x44.n0();
                            throw null;
                        }
                        i iVar = (i) obj3;
                        iVar.a.X = i2;
                        List<io.sentry.rrweb.b> list = iVar.b.F;
                        if (list != null) {
                            for (io.sentry.rrweb.b bVar2 : list) {
                                if (bVar2 instanceof m) {
                                    ((m) bVar2).H = i2;
                                }
                            }
                        }
                        i2 = i3;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ uui(Object obj, Object obj2, long j, int i) {
        this.E = i;
        this.G = obj;
        this.H = obj2;
        this.F = j;
    }
}
