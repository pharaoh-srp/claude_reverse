package io.sentry.util;

import io.sentry.v;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ReentrantLock {
    public final v a() {
        lock();
        return new v(1, this);
    }
}
