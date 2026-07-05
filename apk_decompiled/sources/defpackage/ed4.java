package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ed4 extends a1 {
    public final lsc N;
    public boolean O;

    public ed4(Context context) {
        super(context);
        this.N = mpk.P(null);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // defpackage.a1
    public final void a(int i, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(420213850);
        int i2 = (e18Var.h(this) ? 4 : 2) | i;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            pz7 pz7Var = (pz7) this.N.getValue();
            if (pz7Var == null) {
                e18Var.a0(-1238823553);
            } else {
                e18Var.a0(98585282);
                pz7Var.invoke(e18Var, 0);
            }
            e18Var.p(false);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new z0(this, i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return ed4.class.getName();
    }

    @Override // defpackage.a1
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.O;
    }

    public final void setContent(pz7 pz7Var) {
        this.O = true;
        this.N.setValue(pz7Var);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            d();
        }
    }
}
