package defpackage;

import android.content.Context;
import androidx.test.platform.app.InstrumentationRegistry;
import org.jetbrains.compose.resources.AndroidContextProvider;

/* JADX INFO: loaded from: classes.dex */
public abstract class f10 {
    public static final void a(int i, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1587247798);
        if (!e18Var.Q(i & 1, i != 0)) {
            e18Var.T();
        } else if (((Boolean) e18Var.j(p59.a)).booleanValue()) {
            e18Var.a0(-1890697985);
            Context context = AndroidContextProvider.E;
            AndroidContextProvider.E = (Context) e18Var.j(w00.b);
            e18Var.p(false);
        } else {
            e18Var.a0(-1890623988);
            e18Var.p(false);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new te(i, 3);
        }
    }

    public static final Context b() {
        return InstrumentationRegistry.getInstrumentation().getContext();
    }
}
