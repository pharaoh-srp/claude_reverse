package defpackage;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bya implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ WebView F;

    public /* synthetic */ bya(WebView webView, int i) {
        this.E = i;
        this.F = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        WebView webView = this.F;
        switch (i) {
            case 0:
                webView.setLayerType(2, null);
                break;
            default:
                webView.evaluateJavascript("window.dispatchEvent(new Event('resize'))", null);
                break;
        }
    }
}
