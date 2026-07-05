package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class gg4 implements ThreadFactory {
    public final AtomicInteger a = new AtomicInteger(0);
    public final /* synthetic */ boolean b;

    public gg4(boolean z) {
        this.b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        runnable.getClass();
        StringBuilder sbO = ij0.o(this.b ? "WM.task-" : "androidx.work-");
        sbO.append(this.a.incrementAndGet());
        return new Thread(runnable, sbO.toString());
    }
}
