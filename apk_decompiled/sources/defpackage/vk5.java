package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class vk5 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final String b;
    public final Object c;

    public vk5(String str, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = Executors.defaultThreadFactory();
                this.b = str;
                break;
            default:
                this.b = str;
                this.c = new AtomicInteger(1);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        String str = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                Thread thread = new Thread(runnable, "datadog-" + str + "-thread-" + ((AtomicInteger) obj).getAndIncrement());
                thread.setPriority(5);
                thread.setDaemon(false);
                return thread;
            default:
                Thread threadNewThread = ((ThreadFactory) obj).newThread(new i3f(runnable, 2));
                threadNewThread.setName(str);
                return threadNewThread;
        }
    }
}
