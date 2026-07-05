package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class lu5 implements ThreadFactory {
    public final /* synthetic */ int a;
    public Object b;

    public lu5(int i) {
        this.a = i;
        switch (i) {
            case 1:
                break;
            default:
                this.b = new AtomicInteger(0);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) this.b).getAndIncrement());
                return thread;
            default:
                Thread threadNewThread = ((ThreadFactory) this.b).newThread(runnable);
                threadNewThread.setName("ScionFrontendApi");
                return threadNewThread;
        }
    }
}
