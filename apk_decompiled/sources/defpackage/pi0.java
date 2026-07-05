package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: loaded from: classes2.dex */
public final class pi0 extends ToggleButton {
    public final ig0 E;
    public final fi0 F;
    public fh0 G;

    public pi0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        qlh.a(this, getContext());
        ig0 ig0Var = new ig0(this);
        this.E = ig0Var;
        ig0Var.l(attributeSet, R.attr.buttonStyleToggle);
        fi0 fi0Var = new fi0(this);
        this.F = fi0Var;
        fi0Var.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyleToggle);
    }

    private fh0 getEmojiTextViewHelper() {
        if (this.G == null) {
            this.G = new fh0(this);
        }
        return this.G;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
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

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((ovj) getEmojiTextViewHelper().b.F).f(inputFilterArr));
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
}
