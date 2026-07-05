package defpackage;

import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class qza extends m3f {
    public final /* synthetic */ sza d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qza(sza szaVar, o3f o3fVar) {
        super(o3fVar);
        this.d = szaVar;
        this.b = new ska(4, szaVar);
    }

    @Override // defpackage.m3f
    public final boolean b(Uri uri) {
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        zfa.a.getClass();
        if (yfa.b()) {
            String strE = iuj.E(this);
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (!arrayList.isEmpty()) {
                String strM = ebh.m(zfa.a, "Page finished loading: ", str);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfa.INFO, strE, strM);
                }
            }
        }
        super.onPageFinished(webView, str);
        if (webView != null) {
            webView.evaluateJavascript("(function() {\n    function fixHeights() {\n        var h = window.innerHeight + 'px';\n        document.documentElement.style.height = h;\n        document.body.style.height = h;\n    }\n    fixHeights();\n    window.addEventListener('resize', fixHeights);\n})()", null);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        rz7 rz7Var;
        zfa.a.getClass();
        if (yfa.b()) {
            String strE = iuj.E(this);
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (!arrayList.isEmpty()) {
                zfa.a.getClass();
                String str = "WebView error loading " + (webResourceRequest != null ? webResourceRequest.getUrl() : null) + ": code=" + (webResourceError != null ? Integer.valueOf(webResourceError.getErrorCode()) : null) + ", description=" + ((Object) (webResourceError != null ? webResourceError.getDescription() : null));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfa.ERROR, strE, str);
                }
            }
        }
        if (webResourceRequest != null && webResourceRequest.isForMainFrame() && webResourceError != null && (rz7Var = this.d.getCallbacks().m) != null) {
            rz7Var.invoke("WebViewError", Integer.valueOf(webResourceError.getErrorCode()), "Sandbox load error code=" + webResourceError.getErrorCode());
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        rz7 rz7Var;
        zfa.a.getClass();
        if (yfa.b()) {
            String strE = iuj.E(this);
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (!arrayList.isEmpty()) {
                zfa.a.getClass();
                String str = "HTTP error loading " + (webResourceRequest != null ? webResourceRequest.getUrl() : null) + ": status=" + (webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null) + ", mimeType=" + (webResourceResponse != null ? webResourceResponse.getMimeType() : null);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfa.ERROR, strE, str);
                }
            }
        }
        if (webResourceRequest != null && webResourceRequest.isForMainFrame() && webResourceResponse != null && (rz7Var = this.d.getCallbacks().m) != null) {
            rz7Var.invoke("WebViewHttpError", Integer.valueOf(webResourceResponse.getStatusCode()), "Sandbox load HTTP " + webResourceResponse.getStatusCode());
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }
}
