package io.sentry.android.replay;

import android.graphics.Point;
import android.view.View;
import android.view.ViewTreeObserver;
import defpackage.w44;
import defpackage.x44;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ h0 E;
    public final /* synthetic */ View F;

    public f0(h0 h0Var, View view) {
        this.E = h0Var;
        this.F = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        h0 h0Var = this.E;
        Point point = h0Var.L;
        WeakReference weakReference = (WeakReference) w44.V0(h0Var.K);
        View view = weakReference != null ? (View) weakReference.get() : null;
        View view2 = this.F;
        if (x44.r(view2, view)) {
            view2.getClass();
            if (view2.getWidth() > 0 && view2.getHeight() > 0) {
                if (view2.getViewTreeObserver() != null && view2.getViewTreeObserver().isAlive()) {
                    try {
                        view2.getViewTreeObserver().removeOnPreDrawListener(this);
                    } catch (IllegalStateException unused) {
                    }
                }
                if (view2.getWidth() != point.x || view2.getHeight() != point.y) {
                    point.set(view2.getWidth(), view2.getHeight());
                    h0Var.G.b0(view2.getWidth(), view2.getHeight());
                }
            }
        } else if (view2 != null && view2.getViewTreeObserver() != null && view2.getViewTreeObserver().isAlive()) {
            try {
                view2.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            } catch (IllegalStateException unused2) {
            }
        }
        return true;
    }
}
