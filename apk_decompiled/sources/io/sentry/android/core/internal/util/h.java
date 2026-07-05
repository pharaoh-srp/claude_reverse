package io.sentry.android.core.internal.util;

import android.view.View;
import android.view.Window;
import io.sentry.android.core.l0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ Window E;
    public final /* synthetic */ Window.Callback F;
    public final /* synthetic */ Runnable G;
    public final /* synthetic */ l0 H;

    public /* synthetic */ h(Window window, Window.Callback callback, Runnable runnable, l0 l0Var) {
        this.E = window;
        this.F = callback;
        this.G = runnable;
        this.H = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Window window = this.E;
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView != null) {
            window.setCallback(this.F);
            j jVar = new j(viewPeekDecorView, this.G);
            this.H.getClass();
            viewPeekDecorView.getViewTreeObserver().addOnDrawListener(jVar);
        }
    }
}
