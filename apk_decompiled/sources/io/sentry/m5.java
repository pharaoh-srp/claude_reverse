package io.sentry;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final class m5 implements ThreadFactory {
    public final /* synthetic */ int a;
    public int b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("SentryExecutorServiceThreadFactory-");
                int i = this.b;
                this.b = i + 1;
                sb.append(i);
                Thread thread = new Thread(runnable, sb.toString());
                thread.setDaemon(true);
                return thread;
            default:
                StringBuilder sb2 = new StringBuilder("SentryAsyncConnection-");
                int i2 = this.b;
                this.b = i2 + 1;
                sb2.append(i2);
                Thread thread2 = new Thread(runnable, sb2.toString());
                thread2.setDaemon(true);
                return thread2;
        }
    }
}
