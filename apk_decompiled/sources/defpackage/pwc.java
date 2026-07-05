package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class pwc extends swc {
    public final Thread F;
    public final ql8 G;
    public final wka J;
    public volatile boolean H = false;
    public final AtomicInteger I = new AtomicInteger(0);
    public final etb E = new etb(FreeTypeConstants.FT_LOAD_MONOCHROME);

    public pwc(ql8 ql8Var, vf4 vf4Var) {
        m mVar = new m(4, this);
        ThreadGroup threadGroup = dr.a;
        Thread thread = new Thread(dr.a, mVar, "dd-trace-monitor");
        thread.setDaemon(true);
        thread.setContextClassLoader(null);
        thread.setUncaughtExceptionHandler(new cr());
        this.F = thread;
        this.G = ql8Var;
        this.J = vf4Var.F1 ? new wka(vf4Var) : null;
    }

    @Override // defpackage.swc
    public final void c(rwc rwcVar) {
        if (!rwcVar.e(true) || this.E.offer(rwcVar)) {
            return;
        }
        rwcVar.e(false);
        if (rwcVar.f()) {
            rwcVar.a();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        owc owcVar = owc.a;
        if (this.F.isAlive()) {
            int i = this.I.get();
            boolean zOffer = this.E.offer(owcVar);
            int i2 = 1;
            while (!this.H && !zOffer) {
                int i3 = i2 + 1;
                if (i2 <= 3) {
                    Thread.yield();
                } else {
                    try {
                        Thread.sleep(10L);
                    } catch (Throwable unused) {
                    }
                }
                i2 = i3;
                zOffer = this.E.offer(owcVar);
            }
            int i4 = this.I.get();
            while (!this.H && i >= i4) {
                int i5 = i2 + 1;
                if (i2 <= 3) {
                    Thread.yield();
                } else {
                    try {
                        Thread.sleep(10L);
                    } catch (Throwable unused2) {
                    }
                }
                i2 = i5;
                i4 = this.I.get();
            }
        }
        this.H = true;
        this.F.interrupt();
        try {
            this.F.join(800L);
        } catch (InterruptedException unused3) {
        }
    }

    @Override // defpackage.swc
    public final boolean d() {
        return this.J != null;
    }

    @Override // defpackage.swc
    public final void f() {
        this.F.start();
    }
}
