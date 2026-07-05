package defpackage;

import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes3.dex */
public final class vvc extends WebViewClient {
    public static final /* synthetic */ int d = 0;
    public final m3f a;
    public final hdc b;
    public final String c;

    public vvc(m3f m3fVar, hdc hdcVar, ze0 ze0Var, String str) {
        m3fVar.getClass();
        hdcVar.getClass();
        ze0Var.getClass();
        str.getClass();
        this.a = m3fVar;
        this.b = hdcVar;
        String strA = ze0Var.a();
        strA.getClass();
        us8 us8Var = new us8();
        us8Var.h(null, strA);
        vs8 vs8VarI = us8Var.c().i(str);
        if (vs8VarI != null) {
            this.c = vs8VarI.i;
        } else {
            sz6.p("Required value was null.");
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        this.a.onRenderProcessGone(webView, renderProcessGoneDetail);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        String string;
        m3f m3fVar = this.a;
        return (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (string = url.toString()) == null) ? m3fVar.shouldInterceptRequest(webView, webResourceRequest) : string.equals("https://pdfproxy.local/document.pdf") ? ulk.i(this.b, this.c, "application/pdf", null) : m3fVar.shouldInterceptRequest(webView, webResourceRequest);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r4, android.webkit.WebResourceRequest r5) {
        /*
            r3 = this;
            r3 = 0
            if (r5 == 0) goto L8
            android.net.Uri r0 = r5.getUrl()
            goto L9
        L8:
            r0 = r3
        L9:
            r1 = 1
            if (r5 == 0) goto L4c
            boolean r5 = r5.isForMainFrame()
            if (r5 != r1) goto L4c
            if (r0 == 0) goto L19
            java.lang.String r5 = r0.getScheme()
            goto L1a
        L19:
            r5 = r3
        L1a:
            java.lang.String r2 = "http"
            boolean r5 = defpackage.x44.r(r5, r2)
            if (r5 != 0) goto L32
            if (r0 == 0) goto L29
            java.lang.String r5 = r0.getScheme()
            goto L2a
        L29:
            r5 = r3
        L2a:
            java.lang.String r2 = "https"
            boolean r5 = defpackage.x44.r(r5, r2)
            if (r5 == 0) goto L4c
        L32:
            if (r4 == 0) goto L4c
            android.content.Context r4 = r4.getContext()     // Catch: java.lang.Exception -> L45
            if (r4 == 0) goto L4c
            android.content.Intent r5 = new android.content.Intent     // Catch: java.lang.Exception -> L45
            java.lang.String r2 = "android.intent.action.VIEW"
            r5.<init>(r2, r0)     // Catch: java.lang.Exception -> L45
            r4.startActivity(r5)     // Catch: java.lang.Exception -> L45
            return r1
        L45:
            r4 = 0
            r5 = 3
            java.lang.String r0 = "No activity found to handle URL in PDF WebView"
            defpackage.ebh.A(r0, r3, r4, r5)
        L4c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vvc.shouldOverrideUrlLoading(android.webkit.WebView, android.webkit.WebResourceRequest):boolean");
    }
}
