package defpackage;

import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes3.dex */
public final class lfa extends WebViewClient {
    public static final /* synthetic */ int c = 0;
    public m8j a;
    public z7j b;

    public final m8j a() {
        m8j m8jVar = this.a;
        if (m8jVar != null) {
            return m8jVar;
        }
        x44.o0("state");
        throw null;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        webView.getClass();
        super.doUpdateVisitedHistory(webView, str, z);
        z7j z7jVar = this.b;
        if (z7jVar == null) {
            x44.o0("navigator");
            throw null;
        }
        z7jVar.b.setValue(Boolean.valueOf(webView.canGoBack()));
        z7j z7jVar2 = this.b;
        if (z7jVar2 == null) {
            x44.o0("navigator");
            throw null;
        }
        z7jVar2.c.setValue(Boolean.valueOf(webView.canGoForward()));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getClass();
        super.onPageFinished(webView, str);
        m8j m8jVarA = a();
        m8jVarA.c.setValue(pca.c);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        webView.getClass();
        super.onPageStarted(webView, str, bitmap);
        m8j m8jVarA = a();
        m8jVarA.c.setValue(rca.c);
        a().d.clear();
        a().a.setValue(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        webView.getClass();
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceError != null) {
            a().d.add(new k7j(webResourceRequest, webResourceError));
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return true;
    }
}
