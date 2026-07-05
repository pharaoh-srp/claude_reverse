package io.sentry.transport;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/* JADX INFO: loaded from: classes.dex */
public final class o extends AbstractQueuedSynchronizer {
    public static final /* synthetic */ int E = 0;

    public o() {
        setState(0);
    }

    public static int a(o oVar) {
        return oVar.getState();
    }

    public static void b(o oVar) {
        int state;
        do {
            state = oVar.getState();
        } while (!oVar.compareAndSetState(state, state + 1));
    }

    @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
    public final int tryAcquireShared(int i) {
        return getState() == 0 ? 1 : -1;
    }

    @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
    public final boolean tryReleaseShared(int i) {
        int state;
        int i2;
        do {
            state = getState();
            if (state == 0) {
                return false;
            }
            i2 = state - 1;
        } while (!compareAndSetState(state, i2));
        return i2 == 0;
    }
}
