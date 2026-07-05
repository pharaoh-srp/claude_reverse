package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class ouj extends Thread {
    public final WeakReference E;
    public final long F;
    public final CountDownLatch G = new CountDownLatch(1);
    public boolean H = false;

    public ouj(kf kfVar, long j) {
        this.E = new WeakReference(kfVar);
        this.F = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        kf kfVar;
        WeakReference weakReference = this.E;
        try {
            if (this.G.await(this.F, TimeUnit.MILLISECONDS) || (kfVar = (kf) weakReference.get()) == null) {
                return;
            }
            kfVar.b();
            this.H = true;
        } catch (InterruptedException unused) {
            kf kfVar2 = (kf) weakReference.get();
            if (kfVar2 != null) {
                kfVar2.b();
                this.H = true;
            }
        }
    }
}
