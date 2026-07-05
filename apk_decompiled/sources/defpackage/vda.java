package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vda {
    public static final xe4 a = new xe4(new m99(20));

    public static xdc a(ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        xdc xdcVar = (xdc) e18Var.j(a);
        Object obj = null;
        if (xdcVar == null) {
            e18Var.a0(1208426157);
            View view = (View) e18Var.j(w00.f);
            view.getClass();
            while (true) {
                if (view == null) {
                    xdcVar = null;
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                xdc xdcVar2 = tag instanceof xdc ? (xdc) tag : null;
                if (xdcVar2 != null) {
                    xdcVar = xdcVar2;
                    break;
                }
                Object objA = bmk.a(view);
                view = objA instanceof View ? (View) objA : null;
            }
        } else {
            e18Var.a0(1208423708);
        }
        e18Var.p(false);
        if (xdcVar != null) {
            e18Var.a0(1208423789);
            e18Var.p(false);
            return xdcVar;
        }
        e18Var.a0(1208428160);
        Context baseContext = (Context) e18Var.j(w00.b);
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
            if (baseContext instanceof xdc) {
                obj = baseContext;
                break;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        xdc xdcVar3 = (xdc) obj;
        e18Var.p(false);
        return xdcVar3;
    }
}
