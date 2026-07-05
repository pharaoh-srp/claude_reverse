package defpackage;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class pe9 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public pe9(zo1 zo1Var) {
        this.a = 2;
        this.c = Executors.defaultThreadFactory();
        this.b = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return new Thread(runnable, "JavaScriptSandbox Thread #" + ((AtomicInteger) obj2).getAndIncrement());
            case 1:
                Thread threadNewThread = ((ThreadFactory) obj2).newThread(runnable);
                Objects.requireNonNull(threadNewThread);
                AtomicLong atomicLong = (AtomicLong) obj;
                Objects.requireNonNull(atomicLong);
                long andIncrement = atomicLong.getAndIncrement();
                Locale locale = Locale.ROOT;
                threadNewThread.setName("HealthData-HealthDataSdkService-" + andIncrement);
                return threadNewThread;
            default:
                Thread threadNewThread2 = ((ThreadFactory) obj).newThread(runnable);
                threadNewThread2.setName("PlayBillingLibrary-" + ((AtomicInteger) obj2).getAndIncrement());
                return threadNewThread2;
        }
    }

    public pe9(re9 re9Var) {
        this.a = 0;
        this.c = re9Var;
        this.b = new AtomicInteger(1);
    }

    public pe9(ThreadFactory threadFactory, AtomicLong atomicLong) {
        this.a = 1;
        this.b = threadFactory;
        this.c = atomicLong;
    }
}
