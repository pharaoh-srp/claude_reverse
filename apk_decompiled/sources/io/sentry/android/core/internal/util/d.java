package io.sentry.android.core.internal.util;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class d implements io.sentry.transport.e {
    public static final d E = new d();

    @Override // io.sentry.transport.e
    public long a() {
        return SystemClock.uptimeMillis();
    }
}
