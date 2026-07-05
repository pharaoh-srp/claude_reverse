package defpackage;

import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class gm8 {
    public volatile l6 a;

    @JavascriptInterface
    public final void onHeight(int i) {
        l6 l6Var = this.a;
        if (l6Var != null) {
            l6Var.invoke(Integer.valueOf(i));
        }
    }
}
