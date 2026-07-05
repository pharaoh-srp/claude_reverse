package io.sentry.android.core.performance;

import android.view.Window;
import io.sentry.android.core.internal.gestures.k;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends k {
    public final io.sentry.android.core.internal.util.h F;

    public j(Window.Callback callback, io.sentry.android.core.internal.util.h hVar) {
        super(callback);
        this.F = hVar;
    }

    @Override // io.sentry.android.core.internal.gestures.k, android.view.Window.Callback
    public final void onContentChanged() {
        super.onContentChanged();
        this.F.run();
    }
}
