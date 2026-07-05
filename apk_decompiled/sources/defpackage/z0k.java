package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class z0k {
    public static final z0k d = new z0k();
    public final Runnable a;
    public final Executor b;
    public z0k c;

    public z0k() {
        this.a = null;
        this.b = null;
    }

    public z0k(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
