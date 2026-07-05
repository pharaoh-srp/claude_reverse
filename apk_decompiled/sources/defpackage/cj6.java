package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class cj6 {
    public void a(Window window) {
    }

    public void b(e1h e1hVar, e1h e1hVar2, Window window, View view, boolean z, boolean z2) {
        e1hVar.getClass();
        e1hVar2.getClass();
        window.getClass();
        view.getClass();
        mbj.b(window, false);
        window.setStatusBarColor(z ? e1hVar.b : e1hVar.a);
        window.setNavigationBarColor(z2 ? e1hVar2.b : e1hVar2.a);
        int i = Build.VERSION.SDK_INT;
        fdj edjVar = i >= 35 ? new edj(window) : i >= 30 ? new ddj(window) : new cdj(window);
        edjVar.d(!z);
        edjVar.c(!z2);
    }
}
