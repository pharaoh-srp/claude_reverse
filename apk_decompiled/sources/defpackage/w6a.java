package defpackage;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class w6a extends WebViewClient {
    public volatile rz7 a;

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String lowerCase;
        webView.getClass();
        webResourceRequest.getClass();
        Uri url = webResourceRequest.getUrl();
        String scheme = url.getScheme();
        if (scheme != null) {
            lowerCase = scheme.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        } else {
            lowerCase = null;
        }
        if (lowerCase == null) {
            return true;
        }
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != -1081572750) {
            if (iHashCode != 3213448) {
                if (iHashCode != 99617003 || !lowerCase.equals("https")) {
                    return true;
                }
            } else if (!lowerCase.equals("http")) {
                return true;
            }
        } else if (!lowerCase.equals("mailto")) {
            return true;
        }
        rz7 rz7Var = this.a;
        if (rz7Var == null) {
            return true;
        }
        rz7Var.invoke(url, null, null);
        return true;
    }
}
