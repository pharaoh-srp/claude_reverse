package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class y60 extends e45 {
    public static final u0h Q = new u0h(v00.N);
    public static final w60 R = new w60(0);
    public final Choreographer G;
    public final Handler H;
    public boolean M;
    public boolean N;
    public final a70 P;
    public final Object I = new Object();
    public final qo0 J = new qo0();
    public ArrayList K = new ArrayList();
    public ArrayList L = new ArrayList();
    public final x60 O = new x60(this);

    public y60(Choreographer choreographer, Handler handler) {
        this.G = choreographer;
        this.H = handler;
        this.P = new a70(choreographer, this);
    }

    public static final void S0(y60 y60Var) {
        Runnable runnable;
        boolean z;
        do {
            synchronized (y60Var.I) {
                qo0 qo0Var = y60Var.J;
                runnable = (Runnable) (qo0Var.isEmpty() ? null : qo0Var.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (y60Var.I) {
                    qo0 qo0Var2 = y60Var.J;
                    runnable = (Runnable) (qo0Var2.isEmpty() ? null : qo0Var2.removeFirst());
                }
            }
            synchronized (y60Var.I) {
                if (y60Var.J.isEmpty()) {
                    z = false;
                    y60Var.M = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // defpackage.e45
    public final void O0(c45 c45Var, Runnable runnable) {
        synchronized (this.I) {
            this.J.addLast(runnable);
            if (!this.M) {
                this.M = true;
                this.H.post(this.O);
                if (!this.N) {
                    this.N = true;
                    this.G.postFrameCallback(this.O);
                }
            }
        }
    }
}
