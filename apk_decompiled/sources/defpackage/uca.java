package defpackage;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: loaded from: classes.dex */
public abstract class uca {
    public static final xe4 a = new xe4(new q59(12));

    public static ed a(ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        ed edVar = (ed) e18Var.j(a);
        if (edVar == null) {
            e18Var.a0(1213380307);
            Object baseContext = (Context) e18Var.j(w00.b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof ed) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            edVar = (ed) baseContext;
        } else {
            e18Var.a0(1213379439);
        }
        e18Var.p(false);
        return edVar;
    }
}
