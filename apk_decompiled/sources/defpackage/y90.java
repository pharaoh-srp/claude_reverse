package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class y90 extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public y90(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        z90 z90Var = new z90(null);
        Drawable drawableNewDrawable = this.a.newDrawable();
        z90Var.E = drawableNewDrawable;
        drawableNewDrawable.setCallback(z90Var.J);
        return z90Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        z90 z90Var = new z90(null);
        Drawable drawableNewDrawable = this.a.newDrawable(resources);
        z90Var.E = drawableNewDrawable;
        drawableNewDrawable.setCallback(z90Var.J);
        return z90Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        z90 z90Var = new z90(null);
        Drawable drawableNewDrawable = this.a.newDrawable(resources, theme);
        z90Var.E = drawableNewDrawable;
        drawableNewDrawable.setCallback(z90Var.J);
        return z90Var;
    }
}
