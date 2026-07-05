package defpackage;

import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public final class orh implements Runnable {
    public final /* synthetic */ int E;
    public final saa F;
    public final ua2 G;

    public /* synthetic */ orh(saa saaVar, ua2 ua2Var, int i) {
        this.E = i;
        this.F = saaVar;
        this.G = ua2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        ua2 ua2Var = this.G;
        saa saaVar = this.F;
        switch (i) {
            case 0:
                if (saaVar.isCancelled()) {
                    ua2Var.q(null);
                    return;
                }
                boolean z = false;
                while (true) {
                    try {
                        try {
                            Object obj = saaVar.get();
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            ua2Var.resumeWith(obj);
                            return;
                        } catch (ExecutionException e) {
                            Throwable cause = e.getCause();
                            cause.getClass();
                            ua2Var.resumeWith(new hre(cause));
                            return;
                        }
                    } catch (InterruptedException unused) {
                        z = true;
                    } catch (Throwable th) {
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
                break;
            default:
                if (saaVar.isCancelled()) {
                    ua2Var.q(null);
                    return;
                }
                try {
                    ua2Var.resumeWith(z3.h(saaVar));
                    return;
                } catch (ExecutionException e2) {
                    Throwable cause2 = e2.getCause();
                    cause2.getClass();
                    ua2Var.resumeWith(new hre(cause2));
                    return;
                }
        }
    }
}
