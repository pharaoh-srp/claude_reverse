package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class crk implements ThreadFactory {
    public final /* synthetic */ int a;
    public final ThreadFactory b;

    public /* synthetic */ crk() {
        this.a = 1;
        this.b = Executors.defaultThreadFactory();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        ThreadFactory threadFactory = this.b;
        switch (i) {
            case 0:
                return threadFactory.newThread(new fnk(runnable, 0));
            default:
                Thread threadNewThread = threadFactory.newThread(runnable);
                if (threadNewThread != null) {
                    threadNewThread.setName("punch".concat(String.valueOf(threadNewThread.getName())));
                    return threadNewThread;
                }
                mr9.h("Default ThreadFactory returned null thread");
                return null;
        }
    }

    public /* synthetic */ crk(ThreadFactory threadFactory) {
        this.a = 0;
        this.b = threadFactory;
    }
}
