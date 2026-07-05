package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* JADX INFO: loaded from: classes2.dex */
public class jg0 extends Button {
    public final ig0 E;
    public final fi0 F;
    public fh0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        jrh.a(context);
        qlh.a(this, getContext());
        ig0 ig0Var = new ig0(this);
        this.E = ig0Var;
        ig0Var.l(attributeSet, i);
        fi0 fi0Var = new fi0(this);
        this.F = fi0Var;
        fi0Var.f(attributeSet, i);
        fi0Var.b();
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private fh0 getEmojiTextViewHelper() {
        if (this.G == null) {
            this.G = new fh0(this);
        }
        return this.G;
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

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (wyi.c) {
            return super.getAutoSizeMaxTextSize();
        }
        fi0 fi0Var = this.F;
        if (fi0Var != null) {
            return Math.round(fi0Var.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (wyi.c) {
            return super.getAutoSizeMinTextSize();
        }
        fi0 fi0Var = this.F;
        if (fi0Var != null) {
            return Math.round(fi0Var.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (wyi.c) {
            return super.getAutoSizeStepGranularity();
        }
        fi0 fi0Var = this.F;
        if (fi0Var != null) {
            return Math.round(fi0Var.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (wyi.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        fi0 fi0Var = this.F;
        return fi0Var != null ? fi0Var.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (wyi.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        fi0 fi0Var = this.F;
        if (fi0Var != null) {
            return fi0Var.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof elh ? ((elh) customSelectionActionModeCallback).a : customSelectionActionModeCallback;
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

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        fi0 fi0Var = this.F;
        if (fi0Var == null || wyi.c) {
            return;
        }
        fi0Var.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        fi0 fi0Var = this.F;
        if (fi0Var != null) {
            oi0 oi0Var = fi0Var.i;
            if (wyi.c || !oi0Var.f()) {
                return;
            }
            oi0Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (wyi.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        fi0 fi0Var = this.F;
        if (fi0Var != null) {
            fi0Var.h(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (wyi.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        fi0 fi0Var = this.F;
        if (fi0Var != null) {
            fi0Var.i(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (wyi.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        fi0 fi0Var = this.F;
        if (fi0Var != null) {
            fi0Var.j(i);
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(grk.l(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((ovj) getEmojiTextViewHelper().b.F).f(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        fi0 fi0Var = this.F;
        if (fi0Var != null) {
            fi0Var.a.setAllCaps(z);
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

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = wyi.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        fi0 fi0Var = this.F;
        if (fi0Var != null) {
            oi0 oi0Var = fi0Var.i;
            if (z || oi0Var.f()) {
                return;
            }
            oi0Var.g(i, f);
        }
    }
}
