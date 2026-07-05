package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes2.dex */
public final class yb7 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    public boolean E;
    public final /* synthetic */ View F;
    public final /* synthetic */ zy7 G;

    public yb7(View view, zy7 zy7Var) {
        this.F = view;
        this.G = zy7Var;
        view.addOnAttachStateChangeListener(this);
        if (this.E || !view.isAttachedToWindow()) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.E = true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.G.a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.E) {
            return;
        }
        View view2 = this.F;
        if (view2.isAttachedToWindow()) {
            view2.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.E = true;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.E) {
            this.F.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.E = false;
        }
    }
}
