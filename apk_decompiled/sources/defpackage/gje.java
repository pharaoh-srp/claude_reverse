package defpackage;

import android.os.Process;

/* JADX INFO: loaded from: classes2.dex */
public final class gje extends Thread {
    public final int E;

    public gje(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.E = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.E);
        super.run();
    }
}
