package defpackage;

import android.R;
import android.content.res.ColorStateList;

/* JADX INFO: loaded from: classes2.dex */
public final class awa extends kh0 {
    public static final int[][] K = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList I;
    public boolean J;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.I == null) {
            int iK = cmk.k(this, com.anthropic.claude.R.attr.colorControlActivated);
            int iK2 = cmk.k(this, com.anthropic.claude.R.attr.colorOnSurface);
            int iK3 = cmk.k(this, com.anthropic.claude.R.attr.colorSurface);
            this.I = new ColorStateList(K, new int[]{cmk.s(1.0f, iK3, iK), cmk.s(0.54f, iK3, iK2), cmk.s(0.38f, iK3, iK2), cmk.s(0.38f, iK3, iK2)});
        }
        return this.I;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.J && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.J = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
