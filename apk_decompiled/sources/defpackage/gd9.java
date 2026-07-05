package defpackage;

import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class gd9 extends fd9 {
    public final fy7 p;

    public gd9(cd9 cd9Var, View view, Window window) {
        super(cd9Var, view, window);
        ArrayList arrayList = this.c;
        arrayList.getClass();
        fy7 fy7Var = new fy7(arrayList);
        fy7Var.e = 0L;
        fy7Var.f = 0L;
        fy7Var.g = 0L;
        this.p = fy7Var;
    }

    @Override // defpackage.fd9
    public final long a0(FrameMetrics frameMetrics) {
        return frameMetrics.getMetric(13);
    }

    @Override // defpackage.fd9
    public final ey7 b0(long j, long j2, FrameMetrics frameMetrics) {
        long j3;
        long metric = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
        long j4 = j + metric;
        this.g = j4;
        rl rlVar = this.b.a;
        if (rlVar != null) {
            j3 = j;
            rlVar.D(j3, j4, this.c);
        } else {
            j3 = j;
        }
        boolean z = metric > j2;
        long metric2 = frameMetrics.getMetric(8);
        long metric3 = frameMetrics.getMetric(7) + (metric2 - frameMetrics.getMetric(12));
        long metric4 = metric2 - frameMetrics.getMetric(13);
        fy7 fy7Var = this.p;
        fy7Var.b = j3;
        fy7Var.c = metric;
        fy7Var.d = z;
        fy7Var.e = metric3;
        fy7Var.f = metric2;
        fy7Var.g = metric4;
        return fy7Var;
    }
}
