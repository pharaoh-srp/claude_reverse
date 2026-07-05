package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes2.dex */
public final class vh0 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ qh0 E;
    public final /* synthetic */ wh0 F;

    public vh0(wh0 wh0Var, qh0 qh0Var) {
        this.F = wh0Var;
        this.E = qh0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.F.k0.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.E);
        }
    }
}
