package defpackage;

import android.content.Context;
import android.view.Window;

/* JADX INFO: loaded from: classes3.dex */
public final class anb extends a1 implements d36 {
    public final Window N;
    public final lsc O;
    public boolean P;

    public anb(Context context, Window window) {
        super(context);
        this.N = window;
        this.O = mpk.P(xpk.a);
    }

    @Override // defpackage.a1
    public final void a(int i, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(576708319);
        int i2 = (e18Var.h(this) ? 4 : 2) | i;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            ((pz7) this.O.getValue()).invoke(e18Var, 0);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ska(this, i, 8);
        }
    }

    @Override // defpackage.a1
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.P;
    }

    @Override // defpackage.d36
    public final Window getWindow() {
        return this.N;
    }
}
