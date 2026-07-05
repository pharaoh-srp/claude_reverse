package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class gvi {
    public static bdj a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        bdj bdjVarC = bdj.c(rootWindowInsets, null);
        xcj xcjVar = bdjVarC.a;
        xcjVar.y(bdjVarC);
        View rootView = view.getRootView();
        xcjVar.d(rootView);
        xcjVar.p(rootView);
        xcjVar.q();
        return bdjVarC;
    }
}
