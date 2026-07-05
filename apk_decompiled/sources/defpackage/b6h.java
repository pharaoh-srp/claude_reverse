package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b6h extends b5h {
    public final Runnable G;

    public b6h(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.G = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.G.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.G;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(xn5.d0(runnable));
        sb.append(", ");
        sb.append(this.E);
        sb.append(", ");
        return vb7.s(sb, this.F ? "Blocking" : "Non-blocking", ']');
    }
}
