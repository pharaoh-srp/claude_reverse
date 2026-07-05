package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ug0 {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, ah0 ah0Var) {
        Objects.requireNonNull(ah0Var);
        pe0 pe0Var = new pe0(1, ah0Var);
        se0.k(obj).registerOnBackInvokedCallback(1000000, pe0Var);
        return pe0Var;
    }

    public static void c(Object obj, Object obj2) {
        se0.k(obj).unregisterOnBackInvokedCallback(se0.h(obj2));
    }
}
