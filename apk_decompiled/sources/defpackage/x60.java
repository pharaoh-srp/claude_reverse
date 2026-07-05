package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class x60 implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ y60 E;

    public x60(y60 y60Var) {
        this.E = y60Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.E.H.removeCallbacks(this);
        y60.S0(this.E);
        y60 y60Var = this.E;
        synchronized (y60Var.I) {
            if (y60Var.N) {
                y60Var.N = false;
                ArrayList arrayList = y60Var.K;
                y60Var.K = y60Var.L;
                y60Var.L = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        y60.S0(this.E);
        y60 y60Var = this.E;
        synchronized (y60Var.I) {
            if (y60Var.K.isEmpty()) {
                y60Var.G.removeFrameCallback(this);
                y60Var.N = false;
            }
        }
    }
}
