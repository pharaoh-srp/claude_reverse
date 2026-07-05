package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class vr5 extends j57 implements Executor {
    public static final vr5 G = new vr5();
    public static final e45 H;

    static {
        dfi dfiVar = dfi.G;
        int i = u1h.a;
        if (64 >= i) {
            i = 64;
        }
        H = dfiVar.R0(yb5.O(i, 12, "kotlinx.coroutines.io.parallelism"), null);
    }

    @Override // defpackage.e45
    public final void O0(c45 c45Var, Runnable runnable) {
        H.O0(c45Var, runnable);
    }

    @Override // defpackage.e45
    public final void P0(c45 c45Var, Runnable runnable) {
        H.P0(c45Var, runnable);
    }

    @Override // defpackage.e45
    public final e45 R0(int i, String str) {
        return dfi.G.R0(i, str);
    }

    @Override // defpackage.j57
    public final Executor S0() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        O0(im6.E, runnable);
    }

    @Override // defpackage.e45
    public final String toString() {
        return "Dispatchers.IO";
    }
}
