package defpackage;

import android.view.FrameMetrics;
import android.view.Window;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jy7 implements Window.OnFrameMetricsAvailableListener {
    public final /* synthetic */ ly7 a;

    public jy7(ly7 ly7Var) {
        this.a = ly7Var;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        window.getClass();
        frameMetrics.getClass();
        ly7 ly7Var = this.a;
        List list = ly7Var.E;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            iy7 iy7Var = (iy7) list.get(i2);
            hy7 hy7Var = ly7Var.M;
            jz1 jz1Var = ly7Var.H;
            hy7Var.p = ly7Var.K != null ? r6.getRefreshRate() : 60.0d;
            hz1 hz1Var = (hz1) jz1Var;
            if (hz1Var.c) {
                hy7Var.a = i;
                hy7Var.b = frameMetrics.getMetric(0);
                hy7Var.c = frameMetrics.getMetric(1);
                hy7Var.d = frameMetrics.getMetric(2);
                hy7Var.e = frameMetrics.getMetric(3);
                hy7Var.f = frameMetrics.getMetric(4);
                hy7Var.g = frameMetrics.getMetric(5);
                hy7Var.h = frameMetrics.getMetric(6);
                hy7Var.i = frameMetrics.getMetric(7);
                hy7Var.j = frameMetrics.getMetric(8);
                hy7Var.k = frameMetrics.getMetric(9) == 1;
            }
            if (hz1Var.d) {
                hy7Var.l = frameMetrics.getMetric(10);
                hy7Var.m = frameMetrics.getMetric(11);
            }
            if (hz1Var.h) {
                hy7Var.n = frameMetrics.getMetric(12);
                hy7Var.o = frameMetrics.getMetric(13);
            }
            iy7Var.b(hy7Var);
        }
    }
}
