package io.sentry.android.core.performance;

import android.os.MessageQueue;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements MessageQueue.IdleHandler {
    public final /* synthetic */ h a;

    public e(h hVar) {
        this.a = hVar;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        this.a.G = SystemClock.uptimeMillis();
        h.a(this.a);
        return false;
    }
}
