package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class ej6 extends dj6 {
    @Override // defpackage.cj6
    public void b(e1h e1hVar, e1h e1hVar2, Window window, View view, boolean z, boolean z2) {
        e1hVar.getClass();
        e1hVar2.getClass();
        window.getClass();
        view.getClass();
        mbj.b(window, false);
        window.setStatusBarColor(e1hVar.a(z));
        window.setNavigationBarColor(e1hVar2.a(z2));
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(e1hVar2.c == 0);
        int i = Build.VERSION.SDK_INT;
        fdj edjVar = i >= 35 ? new edj(window) : i >= 30 ? new ddj(window) : new cdj(window);
        edjVar.d(!z);
        edjVar.c(!z2);
    }
}
