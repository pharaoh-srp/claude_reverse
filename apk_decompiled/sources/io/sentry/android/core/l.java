package io.sentry.android.core;

import defpackage.h16;
import defpackage.rl;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ l(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                ((m) obj).b(5000L);
                return;
            case 1:
                ((o) obj).b(5000L);
                return;
            case 2:
                ((io.sentry.android.replay.capture.a) obj).a();
                return;
            case 3:
                ((h16) obj).a();
                return;
            case 4:
                ((h16) obj).a();
                return;
            case 5:
                ((io.sentry.android.replay.capture.a) obj).a();
                return;
            case 6:
                ((io.sentry.android.replay.capture.a) obj).a();
                return;
            case 7:
                ((io.sentry.android.replay.capture.a) obj).a();
                return;
            case 8:
                io.sentry.logger.c cVar = (io.sentry.logger.c) obj;
                do {
                    cVar.c();
                } while (cVar.G.size() >= 100);
                io.sentry.v vVarA = cVar.I.a();
                try {
                    if (!cVar.G.isEmpty()) {
                        cVar.d(false);
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
            default:
                rl rlVar = (rl) obj;
                do {
                    rlVar.B();
                } while (((ConcurrentLinkedQueue) rlVar.H).size() >= 1000);
                io.sentry.v vVarA2 = ((io.sentry.util.a) rlVar.E).a();
                try {
                    if (!((ConcurrentLinkedQueue) rlVar.H).isEmpty()) {
                        rlVar.P(false);
                        break;
                    }
                    vVarA2.close();
                    return;
                } catch (Throwable th3) {
                    try {
                        vVarA2.close();
                        break;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
        }
    }
}
