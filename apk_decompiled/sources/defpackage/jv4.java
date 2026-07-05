package defpackage;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes2.dex */
public final class jv4 extends WebViewClient {
    public final vs8 a;
    public final nl1 b;
    public final ev4 c;
    public final ev4 d;

    public jv4(vs8 vs8Var, nl1 nl1Var, ev4 ev4Var, ev4 ev4Var2) {
        this.a = vs8Var;
        this.b = nl1Var;
        this.c = ev4Var;
        this.d = ev4Var2;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        webView.getClass();
        str.getClass();
        this.d.a();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        webView.evaluateJavascript("\n(function(){\n  function f(){var h=window.innerHeight+'px';document.documentElement.style.height=h;document.body.style.height=h;}\n  f();addEventListener('resize',f);\n})();\n", null);
        this.c.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:109:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r0.equals("https") == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r0.equals("http") == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        r0 = r8.getScheme();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r0 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        r0 = r0.toLowerCase(java.util.Locale.ROOT);
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        r7 = r7.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        if (defpackage.x44.r(r0, r7.a) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        r0 = r8.getHost();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
    
        r1 = r0.toLowerCase(java.util.Locale.ROOT);
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
    
        if (defpackage.x44.r(r1, r7.d) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        r0 = r8.getPort();
        r1 = r7.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
    
        if (r0 == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0087, code lost:
    
        if (r0 != (-1)) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:
    
        r0 = r7.a;
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0092, code lost:
    
        if (r0.equals("http") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0094, code lost:
    
        r3 = 80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009b, code lost:
    
        if (r0.equals("https") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009d, code lost:
    
        r3 = 443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009f, code lost:
    
        if (r1 == r3) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a3, code lost:
    
        r7 = r7.f;
        r0 = new java.util.ArrayList();
        r7 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b2, code lost:
    
        if (r7.hasNext() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b4, code lost:
    
        r1 = r7.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bf, code lost:
    
        if (((java.lang.String) r1).length() <= 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c1, code lost:
    
        r0.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c5, code lost:
    
        r7 = r8.getPathSegments();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c9, code lost:
    
        if (r7 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00cb, code lost:
    
        r7 = defpackage.lm6.E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cd, code lost:
    
        r1 = new java.util.ArrayList();
        r7 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00dc, code lost:
    
        if (r7.hasNext() == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00de, code lost:
    
        r3 = r7.next();
        r5 = (java.lang.String) r3;
        r5.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ec, code lost:
    
        if (r5.length() <= 0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ee, code lost:
    
        r1.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fa, code lost:
    
        if (r1.size() >= r0.size()) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fd, code lost:
    
        r7 = defpackage.x44.L(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0103, code lost:
    
        if ((r7 instanceof java.util.Collection) == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010c, code lost:
    
        if (((java.util.Collection) r7).isEmpty() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010f, code lost:
    
        r7 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0113, code lost:
    
        r3 = (defpackage.a79) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0118, code lost:
    
        if (r3.G == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x011a, code lost:
    
        r3 = r3.nextInt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x012a, code lost:
    
        if (defpackage.x44.r(r0.get(r3), r1.get(r3)) != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0130, code lost:
    
        if (r9.isForMainFrame() == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0132, code lost:
    
        r4.invoke(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0135, code lost:
    
        return true;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0165  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r8, android.webkit.WebResourceRequest r9) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jv4.shouldOverrideUrlLoading(android.webkit.WebView, android.webkit.WebResourceRequest):boolean");
    }
}
