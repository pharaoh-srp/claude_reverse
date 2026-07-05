package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class k1 {
    public static final k1 d = new k1();
    public final Runnable a;
    public final Executor b;
    public k1 c;

    public k1() {
        this.a = null;
        this.b = null;
    }

    public k1(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
