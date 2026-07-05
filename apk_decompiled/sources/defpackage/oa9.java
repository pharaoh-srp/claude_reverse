package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: loaded from: classes3.dex */
public final class oa9 extends AbstractOwnableSynchronizer implements Runnable {
    public final l8i E;

    public oa9(l8i l8iVar) {
        this.E = l8iVar;
    }

    public static void a(oa9 oa9Var, Thread thread) {
        oa9Var.setExclusiveOwnerThread(thread);
    }

    @Override // java.lang.Runnable
    public final void run() {
    }

    public final String toString() {
        return this.E.toString();
    }
}
