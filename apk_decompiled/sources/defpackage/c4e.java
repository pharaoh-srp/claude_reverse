package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class c4e implements Runnable {
    public final i92 E;
    public volatile AtomicInteger F;
    public final /* synthetic */ f4e G;

    public c4e(f4e f4eVar, i92 i92Var) {
        i92Var.getClass();
        this.G = f4eVar;
        this.E = i92Var;
        this.F = new AtomicInteger(0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        dpf dpfVar;
        String strConcat = "OkHttp ".concat(this.G.F.a.h());
        f4e f4eVar = this.G;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            f4eVar.J.k();
            boolean z = false;
            try {
                try {
                    try {
                        this.E.onResponse(f4eVar, f4eVar.h());
                        dpfVar = f4eVar.E.a;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            s4d s4dVar = s4d.a;
                            s4d.a.i("Callback failure for ".concat(f4e.a(f4eVar)), 4, e);
                        } else {
                            this.E.onFailure(f4eVar, e);
                        }
                        dpfVar = f4eVar.E.a;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        f4eVar.cancel();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.initCause(th);
                            this.E.onFailure(f4eVar, iOException);
                        }
                        if (!(th instanceof InterruptedException)) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        dpfVar = f4eVar.E.a;
                    }
                } catch (Throwable th2) {
                    dpf dpfVar2 = f4eVar.E.a;
                    dpfVar2.getClass();
                    dpf.T(dpfVar2, null, null, this, 3);
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
            dpfVar.getClass();
            dpf.T(dpfVar, null, null, this, 3);
        } finally {
            threadCurrentThread.setName(name);
        }
    }
}
