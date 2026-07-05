package io.sentry;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 implements ThreadFactory {
    public final /* synthetic */ int a;
    public int b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("SentryHostnameCache-");
                int i = this.b;
                this.b = i + 1;
                sb.append(i);
                Thread thread = new Thread(runnable, sb.toString());
                thread.setDaemon(true);
                return thread;
            case 1:
                runnable.getClass();
                StringBuilder sb2 = new StringBuilder("SentryReplayIntegration-");
                int i2 = this.b;
                this.b = i2 + 1;
                sb2.append(i2);
                Thread thread2 = new Thread(runnable, sb2.toString());
                thread2.setDaemon(true);
                return thread2;
            default:
                runnable.getClass();
                StringBuilder sb3 = new StringBuilder("SentryReplayPersister-");
                int i3 = this.b;
                this.b = i3 + 1;
                sb3.append(i3);
                Thread thread3 = new Thread(runnable, sb3.toString());
                thread3.setDaemon(true);
                return thread3;
        }
    }
}
