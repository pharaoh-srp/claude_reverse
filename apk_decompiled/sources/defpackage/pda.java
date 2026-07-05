package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class pda {
    public static final xe4 a = new xe4(new q59(14));

    public static yy7 a(ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        yy7 yy7Var = (yy7) e18Var.j(a);
        Object obj = null;
        if (yy7Var == null) {
            e18Var.a0(-571362883);
            View view = (View) e18Var.j(w00.f);
            view.getClass();
            while (true) {
                if (view == null) {
                    yy7Var = null;
                    break;
                }
                Object tag = view.getTag(R.id.report_drawn);
                yy7 yy7Var2 = tag instanceof yy7 ? (yy7) tag : null;
                if (yy7Var2 != null) {
                    yy7Var = yy7Var2;
                    break;
                }
                Object objA = bmk.a(view);
                view = objA instanceof View ? (View) objA : null;
            }
        } else {
            e18Var.a0(-571365177);
        }
        e18Var.p(false);
        if (yy7Var != null) {
            e18Var.a0(-571365101);
            e18Var.p(false);
            return yy7Var;
        }
        e18Var.a0(-571361040);
        Context baseContext = (Context) e18Var.j(w00.b);
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
            if (baseContext instanceof yy7) {
                obj = baseContext;
                break;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        yy7 yy7Var3 = (yy7) obj;
        e18Var.p(false);
        return yy7Var3;
    }
}
