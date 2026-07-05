package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g50 {
    public boolean a;
    public long b;

    public final long a() {
        if (this.a) {
            return Long.MAX_VALUE;
        }
        return Math.max(0L, this.b - System.nanoTime());
    }
}
