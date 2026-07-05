package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hrb extends p1 implements Runnable {
    public final Runnable L;

    public hrb(Runnable runnable) {
        runnable.getClass();
        this.L = runnable;
    }

    @Override // defpackage.w1
    public final String j() {
        return "task=[" + this.L + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.L.run();
        } catch (Throwable th) {
            m(th);
            throw th;
        }
    }
}
