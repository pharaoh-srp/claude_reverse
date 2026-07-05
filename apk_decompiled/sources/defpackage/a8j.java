package defpackage;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes3.dex */
public final class a8j implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ WebView F;

    public /* synthetic */ a8j(WebView webView, int i) {
        this.E = i;
        this.F = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        WebView webView = this.F;
        switch (i) {
            case 0:
                webView.destroy();
                break;
            default:
                webView.destroy();
                break;
        }
    }
}
