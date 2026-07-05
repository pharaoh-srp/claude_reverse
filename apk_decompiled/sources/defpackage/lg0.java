package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes2.dex */
public final class lg0 extends CheckedTextView {
    public final mg0 E;
    public final ig0 F;
    public final fi0 G;
    public fh0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg0(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        jrh.a(context);
        qlh.a(this, getContext());
        fi0 fi0Var = new fi0(this);
        this.G = fi0Var;
        fi0Var.f(attributeSet, R.attr.checkedTextViewStyle);
        fi0Var.b();
        ig0 ig0Var = new ig0(this);
        this.F = ig0Var;
        ig0Var.l(attributeSet, R.attr.checkedTextViewStyle);
        this.E = new mg0(this);
        Context context2 = getContext();
        int[] iArr = t0e.l;
        lrb lrbVarP = lrb.P(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) lrbVarP.G;
        mvi.g(this, getContext(), iArr, attributeSet, (TypedArray) lrbVarP.G, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(xn5.c0(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(xn5.c0(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(xn5.c0(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(lrbVarP.w(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(je6.b(typedArray.getInt(3, -1), null));
            }
            lrbVarP.S();
            getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            lrbVarP.S();
            throw th;
        }
    }

    private fh0 getEmojiTextViewHelper() {
        if (this.H == null) {
            this.H = new fh0(this);
        }
        return this.H;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        fi0 fi0Var = this.G;
        if (fi0Var != null) {
            fi0Var.b();
        }
        ig0 ig0Var = this.F;
        if (ig0Var != null) {
            ig0Var.e();
        }
        mg0 mg0Var = this.E;
        if (mg0Var != null) {
            mg0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof elh ? ((elh) customSelectionActionModeCallback).a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        ig0 ig0Var = this.F;
        if (ig0Var != null) {
            return ig0Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        ig0 ig0Var = this.F;
        if (ig0Var != null) {
            return ig0Var.i();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        mg0 mg0Var = this.E;
        if (mg0Var != null) {
            return mg0Var.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        mg0 mg0Var = this.E;
        if (mg0Var != null) {
            return mg0Var.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.G.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.G.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        lsk.d(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ig0 ig0Var = this.F;
        if (ig0Var != null) {
            ig0Var.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ig0 ig0Var = this.F;
        if (ig0Var != null) {
            ig0Var.n(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        mg0 mg0Var = this.E;
        if (mg0Var != null) {
            if (mg0Var.e) {
                mg0Var.e = false;
            } else {
                mg0Var.e = true;
                mg0Var.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        fi0 fi0Var = this.G;
        if (fi0Var != null) {
            fi0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        fi0 fi0Var = this.G;
        if (fi0Var != null) {
            fi0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(grk.l(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        ig0 ig0Var = this.F;
        if (ig0Var != null) {
            ig0Var.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        ig0 ig0Var = this.F;
        if (ig0Var != null) {
            ig0Var.t(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        mg0 mg0Var = this.E;
        if (mg0Var != null) {
            mg0Var.a = colorStateList;
            mg0Var.c = true;
            mg0Var.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        mg0 mg0Var = this.E;
        if (mg0Var != null) {
            mg0Var.b = mode;
            mg0Var.d = true;
            mg0Var.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        fi0 fi0Var = this.G;
        fi0Var.k(colorStateList);
        fi0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        fi0 fi0Var = this.G;
        fi0Var.l(mode);
        fi0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        fi0 fi0Var = this.G;
        if (fi0Var != null) {
            fi0Var.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(xn5.c0(getContext(), i));
    }
}
