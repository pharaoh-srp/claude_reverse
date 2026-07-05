package defpackage;

import android.os.Build;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public abstract class mbj {
    public static svi a(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("id").m();
            bh9 bh9VarS = qh9Var.s("current_locale");
            String strM2 = bh9VarS != null ? bh9VarS.m() : null;
            strM.getClass();
            return new svi(strM, strM2);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Application", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Application", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Application", e3);
            return null;
        }
    }

    public static void b(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            c6.d(window, z);
        } else if (i >= 30) {
            zu8.b(window, z);
        } else {
            elk.g(window, z);
        }
    }
}
