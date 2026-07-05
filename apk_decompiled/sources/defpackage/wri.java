package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: loaded from: classes2.dex */
public final class wri extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public wri(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        xri xriVar = new xri();
        xriVar.E = (VectorDrawable) this.a.newDrawable();
        return xriVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        xri xriVar = new xri();
        xriVar.E = (VectorDrawable) this.a.newDrawable(resources);
        return xriVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        xri xriVar = new xri();
        xriVar.E = (VectorDrawable) this.a.newDrawable(resources, theme);
        return xriVar;
    }
}
