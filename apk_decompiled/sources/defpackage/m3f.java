package defpackage;

import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.anthropic.claude.analytics.events.WebViewEvents$WebViewRenderProcessGone;
import com.anthropic.claude.core.telemetry.SilentException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m3f extends WebViewClient {
    public static final /* synthetic */ int c = 0;
    public final o3f a;
    public pz7 b;

    public m3f(o3f o3fVar) {
        o3fVar.getClass();
        this.a = o3fVar;
    }

    public WebResourceResponse a(Uri uri) {
        return null;
    }

    public abstract boolean b(Uri uri);

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean zDidCrash = renderProcessGoneDetail != null ? renderProcessGoneDetail.didCrash() : false;
        o3f o3fVar = this.a;
        boolean zB = o3fVar.c.b();
        o3fVar.b.e(new WebViewEvents$WebViewRenderProcessGone(o3fVar.a, renderProcessGoneDetail != null ? renderProcessGoneDetail.didCrash() : false, renderProcessGoneDetail != null ? Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()) : null, o3fVar.c.b()), WebViewEvents$WebViewRenderProcessGone.Companion.serializer());
        if (zDidCrash || zB) {
            SilentException.a(new SilentException("WebView render process gone: didCrash=" + zDidCrash + ", rendererPriority=" + (renderProcessGoneDetail != null ? Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()) : null)), zDidCrash ? ozf.G : ozf.F, false, 2);
        }
        if (webView != null) {
            webView.destroy();
        }
        pz7 pz7Var = this.b;
        if (pz7Var == null) {
            return true;
        }
        pz7Var.invoke(webView, Boolean.valueOf(zDidCrash));
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest != null) {
            Uri url = webResourceRequest.getUrl();
            url.getClass();
            WebResourceResponse webResourceResponseA = a(url);
            if (webResourceResponseA != null) {
                return webResourceResponseA;
            }
        }
        if (webResourceRequest != null) {
            Uri url2 = webResourceRequest.getUrl();
            url2.getClass();
            if (b(url2)) {
                return null;
            }
        }
        return new WebResourceResponse("text/plain", "UTF-8", null);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return true;
    }
}
