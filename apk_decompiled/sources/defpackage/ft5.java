package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ft5 extends j57 {
    public static final ft5 H;
    public k45 G;

    static {
        int i = x9h.c;
        int i2 = x9h.d;
        long j = x9h.e;
        String str = x9h.a;
        ft5 ft5Var = new ft5();
        ft5Var.G = new k45(i, i2, j, str);
        H = ft5Var;
    }

    @Override // defpackage.e45
    public final void O0(c45 c45Var, Runnable runnable) {
        k45.e(this.G, runnable, 6);
    }

    @Override // defpackage.e45
    public final void P0(c45 c45Var, Runnable runnable) {
        k45.e(this.G, runnable, 2);
    }

    @Override // defpackage.e45
    public final e45 R0(int i, String str) {
        eve.o(i);
        return i >= x9h.c ? str != null ? new xxb(this, str) : this : super.R0(i, str);
    }

    @Override // defpackage.j57
    public final Executor S0() {
        return this.G;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.e45
    public final String toString() {
        return "Dispatchers.Default";
    }
}
