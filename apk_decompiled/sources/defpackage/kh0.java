package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes2.dex */
public class kh0 extends RadioButton implements mrh {
    public final mg0 E;
    public final ig0 F;
    public final fi0 G;
    public fh0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        jrh.a(context);
        qlh.a(this, getContext());
        mg0 mg0Var = new mg0(this);
        this.E = mg0Var;
        mg0Var.c(attributeSet, R.attr.radioButtonStyle);
        ig0 ig0Var = new ig0(this);
        this.F = ig0Var;
        ig0Var.l(attributeSet, R.attr.radioButtonStyle);
        fi0 fi0Var = new fi0(this);
        this.G = fi0Var;
        fi0Var.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.radioButtonStyle);
    }

    private fh0 getEmojiTextViewHelper() {
        if (this.H == null) {
            this.H = new fh0(this);
        }
        return this.H;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ig0 ig0Var = this.F;
        if (ig0Var != null) {
            ig0Var.e();
        }
        fi0 fi0Var = this.G;
        if (fi0Var != null) {
            fi0Var.b();
        }
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

    @Override // defpackage.mrh
    public ColorStateList getSupportButtonTintList() {
        mg0 mg0Var = this.E;
        if (mg0Var != null) {
            return mg0Var.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
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

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        mg0 mg0Var = this.E;
        if (mg0Var != null) {
            if (mg0Var.e) {
                mg0Var.e = false;
            } else {
                mg0Var.e = true;
                mg0Var.a();
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

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((ovj) getEmojiTextViewHelper().b.F).f(inputFilterArr));
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

    @Override // defpackage.mrh
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        mg0 mg0Var = this.E;
        if (mg0Var != null) {
            mg0Var.a = colorStateList;
            mg0Var.c = true;
            mg0Var.a();
        }
    }

    @Override // defpackage.mrh
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        mg0 mg0Var = this.E;
        if (mg0Var != null) {
            mg0Var.b = mode;
            mg0Var.d = true;
            mg0Var.a();
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

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(xn5.c0(getContext(), i));
    }
}
