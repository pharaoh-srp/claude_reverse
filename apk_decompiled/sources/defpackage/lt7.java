package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class lt7 extends hqb implements ys7 {
    @Override // defpackage.ys7
    public final void K(us7 us7Var) {
        View viewD = xnk.d(this);
        us7Var.b(this.E.R && xnk.d(this).hasFocusable());
        View viewFindFocus = viewD.findFocus();
        if (viewFindFocus != null) {
            us7Var.e(ms7.a(viewFindFocus, viewD));
        }
    }
}
