package defpackage;

import android.os.Build;
import android.view.FrameMetrics;
import android.view.Window;
import io.sentry.android.core.internal.util.n;
import io.sentry.android.core.internal.util.o;
import io.sentry.android.core.internal.util.p;
import io.sentry.android.core.l0;
import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ed9 implements Window.OnFrameMetricsAvailableListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ed9(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        int i2 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                fd9 fd9Var = (fd9) obj2;
                cd9 cd9Var = (cd9) obj;
                frameMetrics.getClass();
                long jMax = Math.max(frameMetrics.getMetric(10), fd9Var.g);
                if (jMax >= fd9Var.f && jMax != fd9Var.e) {
                    ey7 ey7VarB0 = fd9Var.b0(jMax, (long) (fd9Var.a0(frameMetrics) * cd9Var.d), frameMetrics);
                    ey7VarB0.getClass();
                    cd9Var.a.a(ey7VarB0);
                    fd9Var.e = jMax;
                    break;
                }
                break;
            default:
                p pVar = (p) obj2;
                ConcurrentSkipListSet concurrentSkipListSet = pVar.R;
                long jNanoTime = System.nanoTime();
                ((l0) obj).getClass();
                float refreshRate = Build.VERSION.SDK_INT >= 30 ? window.getContext().getDisplay().getRefreshRate() : window.getWindowManager().getDefaultDisplay().getRefreshRate();
                long metric = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
                long jMax2 = Math.max(0L, metric - ((long) (1.0E9f / refreshRate)));
                pVar.E.getClass();
                long metric2 = frameMetrics.getMetric(10);
                if (metric2 < 0) {
                    metric2 = jNanoTime - metric;
                }
                long jMax3 = Math.max(metric2, pVar.Q);
                if (jMax3 != pVar.P) {
                    pVar.P = jMax3;
                    long j = jMax3 + metric;
                    pVar.Q = j;
                    boolean z = metric > ((long) (1.0E9f / (refreshRate - 1.0f)));
                    boolean z2 = z && metric > 700000000;
                    if (jMax2 > 0) {
                        concurrentSkipListSet.headSet(new n(j - 300000000000L)).clear();
                        if (concurrentSkipListSet.size() < 3600) {
                            concurrentSkipListSet.add(new n(jMax3, pVar.Q));
                        }
                    }
                    Iterator it = pVar.J.values().iterator();
                    while (it.hasNext()) {
                        ((o) it.next()).b(jMax3, pVar.Q, metric, jMax2, z, z2, refreshRate);
                    }
                    break;
                }
                break;
        }
    }
}
