package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class tz extends hqb implements lx1, ujf, wo9, pu9, p6i {
    public final e0 S = new e0(5, this);
    public final /* synthetic */ AndroidComposeView T;

    public tz(AndroidComposeView androidComposeView) {
        this.T = androidComposeView;
    }

    @Override // defpackage.wo9
    public final boolean L(KeyEvent keyEvent) {
        wr7 wr7Var;
        int[] iArr = ms7.a;
        long jI = ssj.i(keyEvent);
        int i = no9.O;
        if (no9.a(jI, t9e.l())) {
            wr7Var = new wr7(2);
        } else if (no9.a(jI, t9e.k())) {
            wr7Var = new wr7(1);
        } else if (no9.a(jI, t9e.q())) {
            wr7Var = new wr7(ssj.n(keyEvent) ? 2 : 1);
        } else {
            wr7Var = no9.a(jI, t9e.g()) ? new wr7(4) : no9.a(jI, t9e.f()) ? new wr7(3) : (no9.a(jI, t9e.h()) || no9.a(jI, t9e.o())) ? new wr7(5) : (no9.a(jI, t9e.e()) || no9.a(jI, t9e.n())) ? new wr7(6) : (no9.a(jI, t9e.d()) || no9.a(jI, t9e.i()) || no9.a(jI, t9e.m())) ? new wr7(7) : (no9.a(jI, t9e.b()) || no9.a(jI, t9e.j())) ? new wr7(8) : null;
        }
        if (wr7Var == null) {
            return false;
        }
        int i2 = wr7Var.a;
        if (!rkj.g(ssj.j(keyEvent), 2)) {
            return false;
        }
        AndroidComposeView androidComposeView = this.T;
        jt7 jt7VarH = ((ts7) androidComposeView.getFocusOwner()).h();
        if (jt7VarH == null || !jt7VarH.S || !androidComposeView.w(i2)) {
            Boolean boolG = ((ts7) androidComposeView.getFocusOwner()).g(i2, androidComposeView.getEmbeddedViewFocusRect(), new h4(2, wr7Var));
            if (!(boolG != null ? boolG.booleanValue() : true)) {
                if (!aok.f(i2)) {
                    return false;
                }
                Integer numC = ms7.c(i2);
                int iIntValue = numC != null ? numC.intValue() : 2;
                FocusFinder focusFinder = FocusFinder.getInstance();
                View rootView = androidComposeView.getRootView();
                rootView.getClass();
                View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, androidComposeView.getView(), iIntValue);
                if (viewFindNextFocus == null || viewFindNextFocus.equals(androidComposeView)) {
                    return ((ts7) androidComposeView.getFocusOwner()).j(i2);
                }
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ujf
    public final void X0(ekf ekfVar) {
    }

    @Override // defpackage.lx1
    public final Object a0(m5c m5cVar, mx1 mx1Var, vp4 vp4Var) {
        long jK = m5cVar.K(0L);
        l9e l9eVar = (l9e) mx1Var.a();
        l9e l9eVarM = l9eVar != null ? l9eVar.m(jK) : null;
        if (l9eVarM != null) {
            this.T.requestRectangleOnScreen(new Rect((int) l9eVarM.a, (int) l9eVarM.b, (int) l9eVarM.c, (int) l9eVarM.d), false);
        }
        return iei.a;
    }

    @Override // defpackage.pu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        c3d c3dVarU = h5bVar.u(j);
        return q5bVar.J0(c3dVarU.E, c3dVarU.F, nm6.E, this.S, new sz(c3dVarU, 0));
    }

    @Override // defpackage.wo9
    public final boolean l(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.p6i
    public final Object o() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }
}
