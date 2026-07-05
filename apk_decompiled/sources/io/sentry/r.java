package io.sentry;

import defpackage.lf5;
import java.util.Iterator;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends TimerTask {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ r(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                Iterator it = ((u) obj).d.iterator();
                while (it.hasNext()) {
                    ((d1) it.next()).c();
                }
                break;
            case 1:
                io.sentry.android.core.a1 a1Var = (io.sentry.android.core.a1) obj;
                n4 n4Var = a1Var.J;
                if (a1Var.K) {
                    n4Var.u();
                }
                n4Var.r().getReplayController().stop();
                n4Var.r().getContinuousProfiler().a(false);
                break;
            default:
                lf5 lf5Var = (lf5) obj;
                Iterator it2 = ((CopyOnWriteArrayList) lf5Var.I).iterator();
                while (it2.hasNext()) {
                    ((io.sentry.transport.n) it2.next()).d(lf5Var);
                }
                break;
        }
    }
}
