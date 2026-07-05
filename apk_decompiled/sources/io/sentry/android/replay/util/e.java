package io.sentry.android.replay.util;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements Runnable {
    public final String E;
    public final /* synthetic */ Runnable F;

    public e(Runnable runnable, String str) {
        runnable.getClass();
        this.E = str;
        this.F = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.F.run();
    }
}
