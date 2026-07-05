package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z50 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ g60 F;

    public /* synthetic */ z50(g60 g60Var, int i) {
        this.E = i;
        this.F = g60Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        g60 g60Var = this.F;
        switch (i) {
            case 0:
                zy7 zy7Var = (zy7) obj;
                View view = g60Var.a;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    zy7Var.a();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new b60(0, zy7Var));
                    }
                }
                return ieiVar;
            case 1:
                ActionMode actionMode = g60Var.h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return ieiVar;
            case 2:
                ActionMode actionMode2 = g60Var.h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return ieiVar;
            default:
                g60Var.e.e();
                return new o10(2, g60Var);
        }
    }
}
