package defpackage;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t94 implements i4a {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ t94(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // defpackage.i4a
    public final void d(m4a m4aVar, y3a y3aVar) {
        Window window;
        View viewPeekDecorView;
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                ba4 ba4Var = (ba4) obj;
                if (y3aVar == y3a.ON_STOP && (window = ba4Var.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                    viewPeekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                ba4 ba4Var2 = (ba4) obj;
                if (y3aVar == y3a.ON_DESTROY) {
                    ba4Var2.F.G = null;
                    if (!ba4Var2.isChangingConfigurations()) {
                        ba4Var2.f().a();
                    }
                    x94 x94Var = ba4Var2.J;
                    ba4 ba4Var3 = x94Var.H;
                    ba4Var3.getWindow().getDecorView().removeCallbacks(x94Var);
                    ba4Var3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(x94Var);
                }
                break;
            default:
                t5f t5fVar = (t5f) obj;
                if (y3aVar == y3a.ON_START) {
                    t5fVar.h = true;
                } else if (y3aVar == y3a.ON_STOP) {
                    t5fVar.h = false;
                }
                break;
        }
    }
}
