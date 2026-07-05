package defpackage;

import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class rza {
    public final /* synthetic */ sza a;

    public rza(sza szaVar) {
        this.a = szaVar;
    }

    @JavascriptInterface
    public final void postMessage(String str) {
        str.getClass();
        this.a.E.a(str);
    }
}
