package io.sentry.android.replay;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements Closeable {
    public final AtomicBoolean E = new AtomicBoolean(false);
    public final io.sentry.util.a F = new io.sentry.util.a();
    public final u G = new u(this);
    public final t H = new t(this);

    public final u c() {
        return this.G;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.E.set(true);
        this.G.clear();
    }
}
