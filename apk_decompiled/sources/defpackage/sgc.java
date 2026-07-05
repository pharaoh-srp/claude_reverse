package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes2.dex */
public final class sgc implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View E;
    public ViewTreeObserver F;
    public final Runnable G;

    public sgc(View view, Runnable runnable) {
        this.E = view;
        this.F = view.getViewTreeObserver();
        this.G = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            mr9.h("view == null");
            return;
        }
        sgc sgcVar = new sgc(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(sgcVar);
        view.addOnAttachStateChangeListener(sgcVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.F.isAlive();
        View view = this.E;
        if (zIsAlive) {
            this.F.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.G.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.F = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.F.isAlive();
        View view2 = this.E;
        if (zIsAlive) {
            this.F.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
