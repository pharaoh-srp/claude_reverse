package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class zh0 extends Spinner {
    public static final int[] M = {R.attr.spinnerMode};
    public final ig0 E;
    public final Context F;
    public final ph0 G;
    public SpinnerAdapter H;
    public final boolean I;
    public final yh0 J;
    public int K;
    public final Rect L;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zh0(android.content.Context r13, android.util.AttributeSet r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zh0.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.L;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ig0 ig0Var = this.E;
        if (ig0Var != null) {
            ig0Var.e();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        yh0 yh0Var = this.J;
        return yh0Var != null ? yh0Var.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        yh0 yh0Var = this.J;
        return yh0Var != null ? yh0Var.o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.J != null ? this.K : super.getDropDownWidth();
    }

    public final yh0 getInternalPopup() {
        return this.J;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        yh0 yh0Var = this.J;
        return yh0Var != null ? yh0Var.h() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.F;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        yh0 yh0Var = this.J;
        return yh0Var != null ? yh0Var.f() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        ig0 ig0Var = this.E;
        if (ig0Var != null) {
            return ig0Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        ig0 ig0Var = this.E;
        if (ig0Var != null) {
            return ig0Var.i();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yh0 yh0Var = this.J;
        if (yh0Var == null || !yh0Var.b()) {
            return;
        }
        yh0Var.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.J == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        xh0 xh0Var = (xh0) parcelable;
        super.onRestoreInstanceState(xh0Var.getSuperState());
        if (!xh0Var.E || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new qh0(0, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        xh0 xh0Var = new xh0(super.onSaveInstanceState());
        yh0 yh0Var = this.J;
        xh0Var.E = yh0Var != null && yh0Var.b();
        return xh0Var;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ph0 ph0Var = this.G;
        if (ph0Var == null || !ph0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        yh0 yh0Var = this.J;
        if (yh0Var == null) {
            return super.performClick();
        }
        if (yh0Var.b()) {
            return true;
        }
        yh0Var.n(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.I) {
            this.H = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        yh0 yh0Var = this.J;
        if (yh0Var != null) {
            Context context = this.F;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            th0 th0Var = new th0();
            th0Var.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                th0Var.b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                rh0.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            yh0Var.p(th0Var);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ig0 ig0Var = this.E;
        if (ig0Var != null) {
            ig0Var.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ig0 ig0Var = this.E;
        if (ig0Var != null) {
            ig0Var.n(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        yh0 yh0Var = this.J;
        if (yh0Var == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            yh0Var.m(i);
            yh0Var.e(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        yh0 yh0Var = this.J;
        if (yh0Var != null) {
            yh0Var.l(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.J != null) {
            this.K = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        yh0 yh0Var = this.J;
        if (yh0Var != null) {
            yh0Var.k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(xn5.c0(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        yh0 yh0Var = this.J;
        if (yh0Var != null) {
            yh0Var.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        ig0 ig0Var = this.E;
        if (ig0Var != null) {
            ig0Var.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        ig0 ig0Var = this.E;
        if (ig0Var != null) {
            ig0Var.t(mode);
        }
    }
}
