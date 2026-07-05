package defpackage;

import android.view.View;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class uda {
    public static final xe4 a = new xe4(new q59(16));

    public static izb a(ld4 ld4Var) {
        izb izbVar;
        e18 e18Var = (e18) ld4Var;
        izb izbVar2 = (izb) e18Var.j(a);
        if (izbVar2 != null) {
            e18Var.a0(950834231);
            e18Var.p(false);
            return izbVar2;
        }
        e18Var.a0(950836184);
        View view = (View) e18Var.j(w00.f);
        view.getClass();
        while (true) {
            izbVar = null;
            if (view == null) {
                break;
            }
            Object tag = view.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
            izb izbVar3 = tag instanceof izb ? (izb) tag : null;
            if (izbVar3 != null) {
                izbVar = izbVar3;
                break;
            }
            Object objA = bmk.a(view);
            view = objA instanceof View ? (View) objA : null;
        }
        e18Var.p(false);
        return izbVar;
    }
}
