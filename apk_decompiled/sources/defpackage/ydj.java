package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class ydj implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View E;
    public final /* synthetic */ x7e F;

    public ydj(View view, x7e x7eVar) {
        this.E = view;
        this.F = x7eVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.E.removeOnAttachStateChangeListener(this);
        this.F.x();
    }
}
