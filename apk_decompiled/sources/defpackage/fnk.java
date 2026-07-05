package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fnk implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ Runnable F;

    public /* synthetic */ fnk(Runnable runnable, int i) {
        this.E = i;
        this.F = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        Runnable runnable = this.F;
        switch (i) {
            case 0:
                xkb.F.set(new ArrayDeque());
                runnable.run();
                break;
            default:
                Deque deque = (Deque) xkb.F.get();
                dgj.v(deque);
                deque.add(runnable);
                if (deque.size() <= 1) {
                    do {
                        runnable.run();
                        deque.removeFirst();
                        runnable = (Runnable) deque.peekFirst();
                    } while (runnable != null);
                }
                break;
        }
    }
}
