package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes3.dex */
public final class m4f extends m3f {
    public final String d;
    public final pwf e;
    public final /* synthetic */ t4f f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4f(t4f t4fVar, String str, String str2, o3f o3fVar) {
        super(o3fVar);
        this.f = t4fVar;
        this.d = rtk.d("text/html");
        pwf pwfVar = new pwf();
        pwfVar.add("cdnjs.cloudflare.com");
        pwfVar.add("cdn.jsdelivr.net");
        pwfVar.add("www.google.com");
        pwfVar.add("www.gstatic.com");
        String authority = Uri.parse(t4fVar.E.a()).getAuthority();
        if (authority != null) {
            pwfVar.add(authority);
        }
        String authority2 = Uri.parse(str).getAuthority();
        if (authority2 != null) {
            pwfVar.add(authority2);
        }
        String authority3 = Uri.parse(str2).getAuthority();
        if (authority3 != null) {
            pwfVar.add(authority3);
        }
        this.e = sf5.k(pwfVar);
        this.b = new ska(21, t4fVar);
    }

    @Override // defpackage.m3f
    public final boolean b(Uri uri) {
        String host;
        String string = uri.toString();
        string.getClass();
        if (!string.equals(this.d)) {
            if (this.f.H) {
                if (URLUtil.isHttpsUrl(string)) {
                    String host2 = uri.getHost();
                    if ((host2 == null || !isg.h0(host2, ".anthropic.com", false)) && ((host = uri.getHost()) == null || !isg.h0(host, ".claude.ai", false))) {
                        return w44.G0(this.e, uri.getAuthority());
                    }
                }
                return false;
            }
            if (!URLUtil.isHttpsUrl(string)) {
                return false;
            }
        }
        return true;
    }

    public final boolean c(WebResourceRequest webResourceRequest) {
        String scheme = webResourceRequest.getUrl().getScheme();
        t4f t4fVar = this.f;
        Uri uri = t4fVar.M;
        if (x44.r(scheme, uri.getScheme()) && x44.r(webResourceRequest.getUrl().getAuthority(), uri.getAuthority())) {
            String encodedPath = webResourceRequest.getUrl().getEncodedPath();
            if (x44.r(encodedPath != null ? bsg.n1(encodedPath, '/') : null, t4fVar.N)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (webView == null) {
            return;
        }
        webView.evaluateJavascript(el4.F, null);
        webView.evaluateJavascript(zf9.F, null);
        t4f t4fVar = this.f;
        webView.evaluateJavascript((String) t4fVar.V.F, null);
        webView.evaluateJavascript((String) t4fVar.W.E, null);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        rz7 sandboxLoadErrorListener;
        if (webResourceRequest != null && c(webResourceRequest) && webResourceError != null && (sandboxLoadErrorListener = this.f.getSandboxLoadErrorListener()) != null) {
            sandboxLoadErrorListener.invoke(Boolean.FALSE, Integer.valueOf(webResourceError.getErrorCode()), "Sandbox runtime load error code=" + webResourceError.getErrorCode());
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        rz7 sandboxLoadErrorListener;
        if (webResourceRequest != null && c(webResourceRequest) && webResourceResponse != null && (sandboxLoadErrorListener = this.f.getSandboxLoadErrorListener()) != null) {
            sandboxLoadErrorListener.invoke(Boolean.TRUE, Integer.valueOf(webResourceResponse.getStatusCode()), "Sandbox runtime load HTTP " + webResourceResponse.getStatusCode());
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }
}
