package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dvi {
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        int i = oxi.a;
        return view.dispatchApplyWindowInsets(windowInsets);
    }
}
