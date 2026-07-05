package defpackage;

import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class h50 implements lcd, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    public static long L;
    public final View E;
    public boolean G;
    public boolean J;
    public long K;
    public final PriorityQueue F = new PriorityQueue(11, new f50(0));
    public final Choreographer H = Choreographer.getInstance();
    public final g50 I = new g50();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h50(android.view.View r5) {
        /*
            r4 = this;
            r4.<init>()
            r4.E = r5
            java.util.PriorityQueue r0 = new java.util.PriorityQueue
            f50 r1 = new f50
            r2 = 0
            r1.<init>(r2)
            r2 = 11
            r0.<init>(r2, r1)
            r4.F = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r4.H = r0
            g50 r0 = new g50
            r0.<init>()
            r4.I = r0
            long r0 = defpackage.h50.L
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L49
            android.view.Display r0 = r5.getDisplay()
            boolean r1 = r5.isInEditMode()
            if (r1 != 0) goto L40
            if (r0 == 0) goto L40
            float r0 = r0.getRefreshRate()
            r1 = 1106247680(0x41f00000, float:30.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L40
            goto L42
        L40:
            r0 = 1114636288(0x42700000, float:60.0)
        L42:
            r1 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r1 = r1 / r0
            long r0 = (long) r1
            defpackage.h50.L = r0
        L49:
            r5.addOnAttachStateChangeListener(r4)
            boolean r5 = r5.isAttachedToWindow()
            if (r5 == 0) goto L55
            r5 = 1
            r4.J = r5
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h50.<init>(android.view.View):void");
    }

    @Override // defpackage.lcd
    public final void a(kcd kcdVar) {
        this.F.add(new dgd(1, kcdVar));
        if (this.G) {
            return;
        }
        this.G = true;
        this.E.post(this);
    }

    public final boolean b() {
        g50 g50Var = this.I;
        long jA = g50Var.a();
        dgj.U(jA, "compose:lazy:prefetch:available_time_nanos");
        boolean z = true;
        if (jA > 0) {
            PriorityQueue priorityQueue = this.F;
            Object objPeek = priorityQueue.peek();
            objPeek.getClass();
            if (!((dgd) objPeek).b().c(g50Var)) {
                priorityQueue.poll();
                z = false;
            }
            g50Var.a = false;
        }
        return z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.J) {
            this.K = j;
            this.E.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.J = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.J = false;
        this.E.removeCallbacks(this);
        this.H.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.F;
        if (!priorityQueue.isEmpty() && this.G && this.J) {
            View view = this.E;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = System.nanoTime() > (2 * L) + nanos;
                g50 g50Var = this.I;
                g50Var.a = z;
                g50Var.b = Math.max(this.K, nanos) + L;
                boolean zB = false;
                while (!priorityQueue.isEmpty() && !zB) {
                    if (g50Var.a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            zB = b();
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        zB = b();
                    }
                }
                if (zB) {
                    this.H.postFrameCallback(this);
                } else {
                    this.G = false;
                }
                dgj.U(0L, "compose:lazy:prefetch:available_time_nanos");
                return;
            }
        }
        this.G = false;
    }
}
