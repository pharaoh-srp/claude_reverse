package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes2.dex */
public final class wh0 extends eaa implements yh0 {
    public CharSequence g0;
    public th0 h0;
    public final Rect i0;
    public int j0;
    public final /* synthetic */ zh0 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh0(zh0 zh0Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.k0 = zh0Var;
        this.i0 = new Rect();
        this.S = zh0Var;
        this.c0 = true;
        this.d0.setFocusable(true);
        this.T = new uh0(0, this);
    }

    @Override // defpackage.yh0
    public final CharSequence f() {
        return this.g0;
    }

    @Override // defpackage.yh0
    public final void i(CharSequence charSequence) {
        this.g0 = charSequence;
    }

    @Override // defpackage.yh0
    public final void m(int i) {
        this.j0 = i;
    }

    @Override // defpackage.yh0
    public final void n(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        jh0 jh0Var = this.d0;
        boolean zIsShowing = jh0Var.isShowing();
        r();
        jh0Var.setInputMethodMode(2);
        g();
        dh6 dh6Var = this.G;
        dh6Var.setChoiceMode(1);
        dh6Var.setTextDirection(i);
        dh6Var.setTextAlignment(i2);
        zh0 zh0Var = this.k0;
        int selectedItemPosition = zh0Var.getSelectedItemPosition();
        dh6 dh6Var2 = this.G;
        if (jh0Var.isShowing() && dh6Var2 != null) {
            dh6Var2.setListSelectionHidden(false);
            dh6Var2.setSelection(selectedItemPosition);
            if (dh6Var2.getChoiceMode() != 0) {
                dh6Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = zh0Var.getViewTreeObserver()) == null) {
            return;
        }
        qh0 qh0Var = new qh0(1, this);
        viewTreeObserver.addOnGlobalLayoutListener(qh0Var);
        jh0Var.setOnDismissListener(new vh0(this, qh0Var));
    }

    @Override // defpackage.eaa, defpackage.yh0
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.h0 = (th0) listAdapter;
    }

    public final void r() {
        int i;
        jh0 jh0Var = this.d0;
        Drawable background = jh0Var.getBackground();
        zh0 zh0Var = this.k0;
        Rect rect = zh0Var.L;
        if (background != null) {
            background.getPadding(rect);
            boolean z = wyi.a;
            i = zh0Var.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = zh0Var.getPaddingLeft();
        int paddingRight = zh0Var.getPaddingRight();
        int width = zh0Var.getWidth();
        int i2 = zh0Var.K;
        if (i2 == -2) {
            int iA = zh0Var.a(this.h0, jh0Var.getBackground());
            int i3 = (zh0Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iA > i3) {
                iA = i3;
            }
            q(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            q((width - paddingLeft) - paddingRight);
        } else {
            q(i2);
        }
        boolean z2 = wyi.a;
        this.J = zh0Var.getLayoutDirection() == 1 ? (((width - paddingRight) - this.I) - this.j0) + i : paddingLeft + this.j0 + i;
    }
}
