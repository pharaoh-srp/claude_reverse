package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes3.dex */
public final class m8i extends rr7 implements RunnableFuture {
    public volatile l8i L;

    public m8i(Callable callable) {
        this.L = new l8i(this, callable);
    }

    @Override // defpackage.w1
    public final void d() {
        l8i l8iVar;
        Object obj = this.E;
        if ((obj instanceof j1) && ((j1) obj).a && (l8iVar = this.L) != null) {
            wmj wmjVar = l8i.H;
            wmj wmjVar2 = l8i.G;
            Runnable runnable = (Runnable) l8iVar.get();
            if (runnable instanceof Thread) {
                oa9 oa9Var = new oa9(l8iVar);
                oa9.a(oa9Var, Thread.currentThread());
                if (l8iVar.compareAndSet(runnable, oa9Var)) {
                    try {
                        ((Thread) runnable).interrupt();
                    } finally {
                        if (((Runnable) l8iVar.getAndSet(wmjVar2)) == wmjVar) {
                            LockSupport.unpark((Thread) runnable);
                        }
                    }
                }
            }
        }
        this.L = null;
    }

    @Override // defpackage.w1
    public final String j() {
        l8i l8iVar = this.L;
        if (l8iVar == null) {
            return super.j();
        }
        return "task=[" + l8iVar + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        l8i l8iVar = this.L;
        if (l8iVar != null) {
            l8iVar.run();
        }
        this.L = null;
    }
}
