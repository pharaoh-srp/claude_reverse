package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.compose.ui.node.Owner;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class js7 extends hqb implements ys7, ViewTreeObserver.OnGlobalFocusChangeListener {
    public ViewTreeObserver S;
    public final is7 T = new is7(this, 0);
    public final is7 U = new is7(this, 1);

    @Override // defpackage.ys7
    public final void K(us7 us7Var) {
        us7Var.b(false);
        us7Var.c(this.T);
        us7Var.d(this.U);
    }

    @Override // defpackage.hqb
    public final void h1() {
        ViewTreeObserver viewTreeObserver = eve.Q(this).getViewTreeObserver();
        this.S = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // defpackage.hqb
    public final void i1() {
        ViewTreeObserver viewTreeObserver = this.S;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.S = null;
        eve.Q(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z;
        if (yfd.W(this).S == null) {
            return;
        }
        View viewD = xnk.d(this);
        rs7 focusOwner = yfd.X(this).getFocusOwner();
        Owner ownerX = yfd.X(this);
        boolean z2 = true;
        if (view == null || view.equals(ownerX)) {
            z = false;
        } else {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                if (parent == viewD.getParent()) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (view2 == null || view2.equals(ownerX)) {
            z2 = false;
        } else {
            for (ViewParent parent2 = view2.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                if (parent2 == viewD.getParent()) {
                    break;
                }
            }
            z2 = false;
        }
        if (z && z2) {
            return;
        }
        if (z2) {
            jt7 jt7VarP1 = p1();
            if (jt7VarP1.u1().a()) {
                return;
            }
            sf5.S(jt7VarP1);
            return;
        }
        if (z && p1().u1().b()) {
            ((ts7) focusOwner).d(8, false, false);
        }
    }

    public final jt7 p1() {
        boolean z;
        if (!this.E.R) {
            b39.c("visitLocalDescendants called on an unattached node");
        }
        hqb hqbVar = this.E;
        if ((hqbVar.H & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
            boolean z2 = false;
            for (hqb hqbVar2 = hqbVar.J; hqbVar2 != null; hqbVar2 = hqbVar2.J) {
                if ((hqbVar2.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
                    hqb hqbVarJ = hqbVar2;
                    wwb wwbVar = null;
                    while (hqbVarJ != null) {
                        if (hqbVarJ instanceof jt7) {
                            jt7 jt7Var = (jt7) hqbVarJ;
                            if (z2) {
                                return jt7Var;
                            }
                            z = false;
                            z2 = true;
                        } else {
                            z = true;
                        }
                        if (z && (hqbVarJ.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 && (hqbVarJ instanceof qw5)) {
                            int i = 0;
                            for (hqb hqbVar3 = ((qw5) hqbVarJ).T; hqbVar3 != null; hqbVar3 = hqbVar3.J) {
                                if ((hqbVar3.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
                                    i++;
                                    if (i == 1) {
                                        hqbVarJ = hqbVar3;
                                    } else {
                                        if (wwbVar == null) {
                                            wwbVar = new wwb(0, new hqb[16]);
                                        }
                                        if (hqbVarJ != null) {
                                            wwbVar.b(hqbVarJ);
                                            hqbVarJ = null;
                                        }
                                        wwbVar.b(hqbVar3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        hqbVarJ = yfd.j(wwbVar);
                    }
                }
            }
        }
        sz6.j("Could not find focus target of embedded view wrapper");
        return null;
    }
}
