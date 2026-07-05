package defpackage;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class yr1 extends d1 {
    public final Thread J;
    public final vz6 K;

    public yr1(c45 c45Var, Thread thread, vz6 vz6Var) {
        super(c45Var, true);
        this.J = thread;
        this.K = vz6Var;
    }

    @Override // defpackage.vf9
    public final void t(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.J;
        if (x44.r(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
