package io.sentry;

/* JADX INFO: loaded from: classes.dex */
public final class v implements m1 {
    public final /* synthetic */ int E;
    public final Object F;

    public /* synthetic */ v(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                w.a.set((h1) obj);
                break;
            default:
                ((io.sentry.util.a) obj).unlock();
                break;
        }
    }
}
