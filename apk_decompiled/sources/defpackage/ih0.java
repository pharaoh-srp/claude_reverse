package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;

/* JADX INFO: loaded from: classes2.dex */
public final class ih0 extends MultiAutoCompleteTextView {
    public static final int[] H = {R.attr.popupBackground};
    public final ig0 E;
    public final fi0 F;
    public final i49 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.anthropic.claude.R.attr.autoCompleteTextViewStyle);
        jrh.a(context);
        qlh.a(this, getContext());
        lrb lrbVarP = lrb.P(getContext(), attributeSet, H, com.anthropic.claude.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) lrbVarP.G).hasValue(0)) {
            setDropDownBackgroundDrawable(lrbVarP.y(0));
        }
        lrbVarP.S();
        ig0 ig0Var = new ig0(this);
        this.E = ig0Var;
        ig0Var.l(attributeSet, com.anthropic.claude.R.attr.autoCompleteTextViewStyle);
        fi0 fi0Var = new fi0(this);
        this.F = fi0Var;
        fi0Var.f(attributeSet, com.anthropic.claude.R.attr.autoCompleteTextViewStyle);
        fi0Var.b();
        i49 i49Var = new i49((EditText) this);
        this.G = i49Var;
        i49Var.O0(attributeSet, com.anthropic.claude.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerF0 = i49Var.F0(keyListener);
        if (keyListenerF0 == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerF0);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ig0 ig0Var = this.E;
        if (ig0Var != null) {
            ig0Var.e();
        }
        fi0 fi0Var = this.F;
        if (fi0Var != null) {
            fi0Var.b();
        }
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

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.F.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.F.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        lsk.d(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.G.W0(inputConnectionOnCreateInputConnection, editorInfo);
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

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        fi0 fi0Var = this.F;
        if (fi0Var != null) {
            fi0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        fi0 fi0Var = this.F;
        if (fi0Var != null) {
            fi0Var.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(xn5.c0(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.G.b1(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.G.F0(keyListener));
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

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        fi0 fi0Var = this.F;
        fi0Var.k(colorStateList);
        fi0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        fi0 fi0Var = this.F;
        fi0Var.l(mode);
        fi0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        fi0 fi0Var = this.F;
        if (fi0Var != null) {
            fi0Var.g(context, i);
        }
    }
}
