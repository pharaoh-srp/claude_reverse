package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xz6 extends yz6 {
    public final Runnable G;

    public xz6(Runnable runnable, long j) {
        super(j);
        this.G = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.G.run();
    }

    @Override // defpackage.yz6
    public final String toString() {
        return super.toString() + this.G;
    }
}
