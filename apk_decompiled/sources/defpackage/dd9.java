package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.view.Window;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dd9 implements Runnable {
    public final /* synthetic */ boolean E;
    public final /* synthetic */ fd9 F;

    public /* synthetic */ dd9(boolean z, fd9 fd9Var) {
        this.E = z;
        this.F = fd9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.E;
        fd9 fd9Var = this.F;
        if (!z) {
            Window window = fd9Var.d;
            ed9 ed9Var = fd9Var.i;
            window.getClass();
            ed9Var.getClass();
            pw5 pw5Var = (pw5) window.getDecorView().getTag(R.id.metricsDelegator);
            if (pw5Var != null) {
                synchronized (pw5Var) {
                    pw5Var.a.remove(ed9Var);
                }
                if (pw5Var.a.isEmpty()) {
                    try {
                        window.removeOnFrameMetricsAvailableListener(pw5Var);
                    } catch (IllegalArgumentException unused) {
                    }
                    window.getDecorView().setTag(R.id.metricsDelegator, null);
                }
            }
            fd9Var.f = 0L;
            return;
        }
        if (fd9Var.f == 0) {
            Window window2 = fd9Var.d;
            ed9 ed9Var2 = fd9Var.i;
            window2.getClass();
            ed9Var2.getClass();
            if (window2.getDecorView().isHardwareAccelerated()) {
                pw5 pw5Var2 = (pw5) window2.getDecorView().getTag(R.id.metricsDelegator);
                if (pw5Var2 == null) {
                    pw5 pw5Var3 = new pw5(x44.a0(ed9Var2));
                    if (pw5.b == null) {
                        HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                        handlerThread.start();
                        pw5.b = new Handler(handlerThread.getLooper());
                    }
                    window2.getDecorView().setTag(R.id.metricsDelegator, pw5Var3);
                    window2.addOnFrameMetricsAvailableListener(pw5Var3, pw5.b);
                } else {
                    synchronized (pw5Var2) {
                        pw5Var2.a.add(ed9Var2);
                    }
                }
                fd9Var.f = System.nanoTime();
            }
        }
    }
}
