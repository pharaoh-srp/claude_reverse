package io.sentry.android.core;

import android.os.Debug;
import io.sentry.s3;

/* JADX INFO: loaded from: classes.dex */
public final class n implements io.sentry.d1 {
    @Override // io.sentry.d1
    public final void a(s3 s3Var) {
        long jFreeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long nativeHeapSize = Debug.getNativeHeapSize() - Debug.getNativeHeapFreeSize();
        s3Var.f(Long.valueOf(jFreeMemory));
        s3Var.g(Long.valueOf(nativeHeapSize));
    }

    @Override // io.sentry.d1
    public final void c() {
    }
}
