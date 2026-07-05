package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes2.dex */
public final class le2 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int E;
    public final /* synthetic */ mdb F;

    public /* synthetic */ le2(mdb mdbVar, int i) {
        this.E = i;
        this.F = mdbVar;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.E;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.E;
        mdb mdbVar = this.F;
        switch (i) {
            case 0:
                oe2 oe2Var = (oe2) mdbVar;
                ViewTreeObserver viewTreeObserver = oe2Var.b0;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        oe2Var.b0 = view.getViewTreeObserver();
                    }
                    oe2Var.b0.removeGlobalOnLayoutListener(oe2Var.M);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                nkg nkgVar = (nkg) mdbVar;
                ViewTreeObserver viewTreeObserver2 = nkgVar.S;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        nkgVar.S = view.getViewTreeObserver();
                    }
                    nkgVar.S.removeGlobalOnLayoutListener(nkgVar.M);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}
