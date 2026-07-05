package defpackage;

import com.google.common.util.concurrent.a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public final class i4 extends rr7 implements Runnable {
    public exf L;
    public do0 M;

    @Override // defpackage.w1
    public final void d() {
        exf exfVar = this.L;
        boolean z = false;
        if ((exfVar != null) & (this.E instanceof j1)) {
            Object obj = this.E;
            if ((obj instanceof j1) && ((j1) obj).a) {
                z = true;
            }
            exfVar.cancel(z);
        }
        this.L = null;
        this.M = null;
    }

    @Override // defpackage.w1
    public final String j() {
        String str;
        exf exfVar = this.L;
        do0 do0Var = this.M;
        String strJ = super.j();
        if (exfVar != null) {
            str = "inputFuture=[" + exfVar + "], ";
        } else {
            str = "";
        }
        if (do0Var == null) {
            if (strJ != null) {
                return str.concat(strJ);
            }
            return null;
        }
        return str + "function=[" + do0Var + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar;
        exf exfVar = this.L;
        do0 do0Var = this.M;
        if (((this.E instanceof j1) | (exfVar == null)) || (do0Var == null)) {
            return;
        }
        this.L = null;
        if (exfVar.E instanceof j1) {
            Object obj = this.E;
            if (obj == null) {
                if (exfVar.isDone()) {
                    if (w1.J.c(this, null, w1.i(exfVar))) {
                        w1.f(this, false);
                        return;
                    }
                    return;
                }
                m1 m1Var = new m1(this, exfVar);
                if (w1.J.c(this, null, m1Var)) {
                    try {
                        exfVar.a(m1Var, y46.E);
                        return;
                    } catch (Throwable th) {
                        try {
                            aVar = new a(th);
                        } catch (Error | Exception unused) {
                            aVar = a.b;
                        }
                        w1.J.c(this, m1Var, aVar);
                        return;
                    }
                }
                obj = this.E;
            }
            if (obj instanceof j1) {
                exfVar.cancel(((j1) obj).a);
                return;
            }
            return;
        }
        try {
            if (!exfVar.isDone()) {
                throw new IllegalStateException(iik.g("Future was expected to be done: %s", exfVar));
            }
            try {
                Object objApply = do0Var.apply(x41.n(exfVar));
                this.M = null;
                l(objApply);
            } catch (Throwable th2) {
                try {
                    if (th2 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    m(th2);
                } finally {
                    this.M = null;
                }
            }
        } catch (Error e) {
            m(e);
        } catch (CancellationException unused2) {
            cancel(false);
        } catch (ExecutionException e2) {
            m(e2.getCause());
        } catch (Exception e3) {
            m(e3);
        }
    }
}
