package defpackage;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class i3f implements Runnable {
    public final /* synthetic */ int E;
    public final Runnable F;

    public /* synthetic */ i3f(Runnable runnable, int i) {
        this.E = i;
        this.F = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        Runnable runnable = this.F;
        switch (i) {
            case 0:
                try {
                    runnable.run();
                } catch (Exception e) {
                    j8.C("Executor", "Background execution failure.", e);
                    return;
                }
                break;
            case 1:
                runnable.run();
                break;
            default:
                Process.setThreadPriority(0);
                runnable.run();
                break;
        }
    }

    public String toString() {
        switch (this.E) {
            case 1:
                return this.F.toString();
            default:
                return super.toString();
        }
    }
}
