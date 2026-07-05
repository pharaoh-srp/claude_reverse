package io.sentry;

/* JADX INFO: loaded from: classes.dex */
public final class w implements i1 {
    public static final ThreadLocal a = new ThreadLocal();

    @Override // io.sentry.i1
    public final m1 a(h1 h1Var) {
        h1 h1Var2 = get();
        a.set(h1Var);
        return new v(0, h1Var2);
    }

    @Override // io.sentry.i1
    public final void close() {
        a.remove();
    }

    @Override // io.sentry.i1
    public final h1 get() {
        return (h1) a.get();
    }
}
