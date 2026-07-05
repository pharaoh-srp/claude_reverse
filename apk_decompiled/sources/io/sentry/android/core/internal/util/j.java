package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import io.sentry.android.core.l0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class j implements ViewTreeObserver.OnDrawListener {
    public final Handler E = new Handler(Looper.getMainLooper());
    public final AtomicReference F;
    public final Runnable G;

    public j(View view, Runnable runnable) {
        this.F = new AtomicReference(view);
        this.G = runnable;
    }

    public static void a(Activity activity, Runnable runnable, l0 l0Var) {
        Window window = activity.getWindow();
        if (window != null) {
            View viewPeekDecorView = window.peekDecorView();
            if (viewPeekDecorView == null) {
                Window.Callback callback = window.getCallback();
                window.setCallback(new io.sentry.android.core.performance.j(callback != null ? callback : new io.sentry.android.core.internal.gestures.b(), new h(window, callback, runnable, l0Var)));
            } else {
                j jVar = new j(viewPeekDecorView, runnable);
                l0Var.getClass();
                viewPeekDecorView.getViewTreeObserver().addOnDrawListener(jVar);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        final View view = (View) this.F.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.sentry.android.core.internal.util.i
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                view.getViewTreeObserver().removeOnDrawListener(this.E);
            }
        });
        this.E.postAtFrontOfQueue(this.G);
    }
}
