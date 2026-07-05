package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public class gh0 extends ImageButton {
    public final ig0 E;
    public final s20 F;
    public boolean G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        jrh.a(context);
        this.G = false;
        qlh.a(this, getContext());
        ig0 ig0Var = new ig0(this);
        this.E = ig0Var;
        ig0Var.l(attributeSet, i);
        s20 s20Var = new s20(this);
        this.F = s20Var;
        s20Var.k(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ig0 ig0Var = this.E;
        if (ig0Var != null) {
            ig0Var.e();
        }
        s20 s20Var = this.F;
        if (s20Var != null) {
            s20Var.a();
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

    public ColorStateList getSupportImageTintList() {
        krh krhVar;
        s20 s20Var = this.F;
        if (s20Var == null || (krhVar = (krh) s20Var.G) == null) {
            return null;
        }
        return krhVar.a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        krh krhVar;
        s20 s20Var = this.F;
        if (s20Var == null || (krhVar = (krh) s20Var.G) == null) {
            return null;
        }
        return krhVar.b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.F.F).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
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

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        s20 s20Var = this.F;
        if (s20Var != null) {
            s20Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        s20 s20Var = this.F;
        if (s20Var != null && drawable != null && !this.G) {
            s20Var.E = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (s20Var != null) {
            s20Var.a();
            if (this.G) {
                return;
            }
            ImageView imageView = (ImageView) s20Var.F;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(s20Var.E);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.G = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        s20 s20Var = this.F;
        ImageView imageView = (ImageView) s20Var.F;
        if (i != 0) {
            Drawable drawableC0 = xn5.c0(imageView.getContext(), i);
            if (drawableC0 != null) {
                je6.a(drawableC0);
            }
            imageView.setImageDrawable(drawableC0);
        } else {
            imageView.setImageDrawable(null);
        }
        s20Var.a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        s20 s20Var = this.F;
        if (s20Var != null) {
            s20Var.a();
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

    public void setSupportImageTintList(ColorStateList colorStateList) {
        s20 s20Var = this.F;
        if (s20Var != null) {
            if (((krh) s20Var.G) == null) {
                s20Var.G = new krh();
            }
            krh krhVar = (krh) s20Var.G;
            krhVar.a = colorStateList;
            krhVar.d = true;
            s20Var.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        s20 s20Var = this.F;
        if (s20Var != null) {
            if (((krh) s20Var.G) == null) {
                s20Var.G = new krh();
            }
            krh krhVar = (krh) s20Var.G;
            krhVar.b = mode;
            krhVar.c = true;
            s20Var.a();
        }
    }
}
