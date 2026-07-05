package io.sentry.android.core.internal.util;

import android.os.Process;
import io.sentry.android.ndk.SentryNdk;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int E;

    public /* synthetic */ e(int i) {
        this.E = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.E) {
            case 0:
                f.b = Process.myTid();
                break;
            default:
                SentryNdk.lambda$static$0();
                break;
        }
    }
}
