package io.sentry.android.core;

import android.app.Activity;
import android.view.View;
import defpackage.sd6;
import io.sentry.t5;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class ScreenshotEventProcessor implements io.sentry.i0 {
    public final SentryAndroidOptions E;
    public final l0 F;
    public final sd6 G;
    public final boolean H;
    public final AtomicBoolean I = new AtomicBoolean(false);

    public ScreenshotEventProcessor(SentryAndroidOptions sentryAndroidOptions, l0 l0Var, boolean z) {
        io.sentry.p.v("SentryAndroidOptions is required", sentryAndroidOptions);
        this.E = sentryAndroidOptions;
        this.F = l0Var;
        this.G = new sd6(2000L, 3);
        this.H = z;
        if (sentryAndroidOptions.isAttachScreenshot()) {
            io.sentry.p.a("Screenshot");
        }
    }

    public final io.sentry.android.replay.viewhierarchy.g a(Activity activity) {
        SentryAndroidOptions sentryAndroidOptions = this.E;
        try {
            View rootView = (activity.getWindow() == null || activity.getWindow().peekDecorView() == null || activity.getWindow().peekDecorView().getRootView() == null) ? null : activity.getWindow().peekDecorView().getRootView();
            if (rootView == null) {
                return null;
            }
            io.sentry.android.replay.viewhierarchy.g gVarO = io.sentry.config.a.o(rootView, null, sentryAndroidOptions.getScreenshot());
            io.sentry.config.a.J(rootView, gVarO, sentryAndroidOptions.getScreenshot(), sentryAndroidOptions.getLogger(), null);
            return gVarO;
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().d(t5.ERROR, "Failed to build view hierarchy", th);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0173  */
    /* JADX WARN: Type inference failed for: r6v10, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // io.sentry.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.sentry.j5 d(io.sentry.j5 r14, io.sentry.n0 r15) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.ScreenshotEventProcessor.d(io.sentry.j5, io.sentry.n0):io.sentry.j5");
    }

    @Override // io.sentry.i0
    public final io.sentry.protocol.e0 e(io.sentry.protocol.e0 e0Var, io.sentry.n0 n0Var) {
        return e0Var;
    }
}
