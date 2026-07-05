package defpackage;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: loaded from: classes3.dex */
public interface d8j {
    WebViewProviderBoundaryInterface createWebView(WebView webView);

    StaticsBoundaryInterface getStatics();

    String[] i();

    void m(g8j g8jVar, jke jkeVar);

    void o(g8j g8jVar, mvd mvdVar);
}
