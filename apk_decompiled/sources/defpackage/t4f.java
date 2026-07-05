package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import anthropic.claude.usercontent.sandbox.OpenExternal;
import anthropic.claude.usercontent.sandbox.wire_format.Request;
import com.anthropic.claude.analytics.events.WebViewEvents$WebViewKind;
import com.squareup.wire.AnyMessage;
import com.squareup.wire.ProtoAdapter;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public class t4f extends WebView {
    public static final /* synthetic */ int a0 = 0;
    public final ze0 E;
    public final h86 F;
    public final prb G;
    public final boolean H;
    public n4f I;
    public bz7 J;
    public bz7 K;
    public rz7 L;
    public final Uri M;
    public final String N;
    public final e45 O;
    public final LinkedHashMap P;
    public final v84 Q;
    public boolean R;
    public boolean S;
    public final Uri T;
    public final String U;
    public final mvd V;
    public final dke W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4f(Context context, String str, ze0 ze0Var, String str2, x4f x4fVar, String str3, h86 h86Var, prb prbVar, n3f n3fVar, WebViewEvents$WebViewKind webViewEvents$WebViewKind, boolean z) {
        super(context);
        context.getClass();
        str3.getClass();
        webViewEvents$WebViewKind.getClass();
        this.E = ze0Var;
        this.F = h86Var;
        this.G = prbVar;
        this.H = z;
        Uri uri = Uri.parse(str);
        this.M = uri;
        String encodedPath = uri.getEncodedPath();
        this.N = encodedPath != null ? bsg.n1(encodedPath, '/') : null;
        this.O = h86Var.getDefault().R0(1, "Sandbox message processor");
        this.P = new LinkedHashMap();
        this.Q = zni.c();
        Uri uriBuild = new Uri.Builder().scheme(uri.getScheme()).encodedAuthority(uri.getAuthority()).build();
        uriBuild.getClass();
        this.T = uriBuild;
        StringBuilder sbR = kgh.r("\n        <!DOCTYPE html>\n        <html lang=\"en\">\n        <head>\n            <meta charset=\"UTF-8\">\n            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n            <title>", str3, "</title>\n            ", "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n<style>\n  html, body {\n      margin: 0;\n      padding: 0;\n      height: 100%;\n      width: 100%;\n      background: transparent;\n  }\n  /* fixed+inset — html→body→100% resolves to 0 when loaded before measure (inline MCP path). */\n  iframe {\n      position: fixed;\n      inset: 0;\n      display: block;\n      width: 100%;\n      height: 100%;\n      border: none;\n      background: transparent;\n  }\n</style>", "\n        </head>\n        <body> \n            <iframe id=\"contentIframe\" sandbox=\"allow-scripts allow-same-origin\" title=\"Claude content\"></iframe>\n            <script>\n                const iframe = document.getElementById('contentIframe');\n                iframe.onload = function() {\n                    this.contentWindow.postMessage('iframeLoaded', '*');\n                };\n                iframe.src = '");
        sbR.append(str);
        sbR.append("';\n                iframe.loading = 'eager';\n                function reloadIframe() {\n                    iframe.src = '");
        sbR.append(str);
        sbR.append("';\n                }\n                // Receives WebViewCompat.postWebMessage from native and forwards into the\n                // sandbox iframe. Messages posted from the app arrive with event.origin === ''.\n                window.addEventListener('message', function(event) {\n                    if (event.origin === ''\n                            && typeof event.data === 'string'\n                            && iframe.contentWindow) {\n                        iframe.contentWindow.postMessage(JSON.parse(event.data), '*');\n                    }\n                });\n            </script>\n        </body>\n        </html>\n    ");
        this.U = csg.V(sbR.toString());
        mvd mvdVar = new mvd(this);
        this.V = mvdVar;
        dke dkeVar = new dke();
        dkeVar.F = this;
        dkeVar.E = csg.V("\n            window.addEventListener('message', function(event) {\n                var cf = document.getElementById('contentIframe');\n                if (!cf || event.source !== cf.contentWindow) { return; }\n                if (event.data && event.data.channel === 'response') {\n                    console.log(\"Received RPC response:\", event.data.request_id, event.data.status);\n                    rpcResponse.postMessage(JSON.stringify(event.data));\n                }\n            });\n        ");
        this.W = dkeVar;
        setVisibility(0);
        WebSettings settings = getSettings();
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        g25 g25VarC = k25.c(x4fVar);
        if (g25VarC != null) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setCookie(ze0Var.a(), g25VarC.toString());
            cookieManager.setCookie(str, !x44.r(uri.getHost(), Uri.parse(ze0Var.a()).getHost()) ? kgh.p(g25VarC.a, "=", g25VarC.b, "; Path=/") : g25VarC.toString());
        } else {
            ij0.y("SandboxWebView: No sessionKey cookie found", null, false, 3);
        }
        setWebViewClient(new m4f(this, str, str2, n3fVar.a(webViewEvents$WebViewKind)));
        LinkedHashSet linkedHashSetQ0 = dxf.q0(ze0Var.e, uriBuild.toString());
        el4.E.Z(this, linkedHashSetQ0);
        zf9.E.Z(this, linkedHashSetQ0);
        mvdVar.Z(this, linkedHashSetQ0);
        dkeVar.Z(this, linkedHashSetQ0);
        new Handler(Looper.getMainLooper()).post(new pya(7, this));
    }

    public static final void e(t4f t4fVar, Request request) {
        AnyMessage payload = request.getPayload();
        if (payload != null) {
            String typeUrl = payload.getTypeUrl();
            ProtoAdapter<OpenExternal> protoAdapter = OpenExternal.ADAPTER;
            if (x44.r(typeUrl, protoAdapter.getTypeUrl())) {
                OpenExternal openExternal = (OpenExternal) payload.unpack(protoAdapter);
                bz7 bz7Var = t4fVar.J;
                if (bz7Var != null) {
                    bz7Var.invoke(openExternal.getHref());
                } else {
                    gb9.D(mwa.G(t4fVar.F), null, null, new p4f(t4fVar, request, null, 0), 3);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0098, code lost:
    
        if (defpackage.gb9.c0(r12, r0, r1) == r8) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(defpackage.t4f r10, java.lang.String r11, defpackage.vp4 r12) {
        /*
            h86 r0 = r10.F
            boolean r1 = r12 instanceof defpackage.q4f
            if (r1 == 0) goto L15
            r1 = r12
            q4f r1 = (defpackage.q4f) r1
            int r2 = r1.H
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.H = r2
            goto L1a
        L15:
            q4f r1 = new q4f
            r1.<init>(r10, r12)
        L1a:
            java.lang.Object r12 = r1.F
            int r2 = r1.H
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            m45 r8 = defpackage.m45.E
            if (r2 == 0) goto L3f
            if (r2 == r6) goto L39
            if (r2 == r5) goto L2d
            if (r2 != r4) goto L33
        L2d:
            defpackage.sf5.h0(r12)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L31
            goto L9b
        L31:
            r10 = move-exception
            goto L9d
        L33:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r10)
            return r7
        L39:
            java.lang.String r11 = r1.E
            defpackage.sf5.h0(r12)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L31
            goto L4f
        L3f:
            defpackage.sf5.h0(r12)
            v84 r12 = r10.Q     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L31
            r1.E = r11     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L31
            r1.H = r6     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L31
            java.lang.Object r12 = defpackage.vtk.h(r12, r1)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L31
            if (r12 != r8) goto L4f
            goto L9a
        L4f:
            java.lang.String r12 = "POST_WEB_MESSAGE"
            boolean r12 = defpackage.q7j.a(r12)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L31
            if (r12 == 0) goto L6b
            e45 r12 = r0.a()     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L31
            r4f r0 = new r4f     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L31
            r0.<init>(r10, r11, r7, r3)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L31
            r1.E = r7     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L31
            r1.H = r5     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L31
            java.lang.Object r10 = defpackage.gb9.c0(r12, r0, r1)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L31
            if (r10 != r8) goto L9b
            goto L9a
        L6b:
            java.lang.String r12 = "if (iframe && iframe.contentWindow) { iframe.contentWindow.postMessage("
            java.lang.String r2 = ", '*'); }"
            int r5 = r11.length()     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L31
            int r5 = r5 + 80
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L31
            r9.<init>(r5)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L31
            r9.append(r12)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L31
            r9.append(r11)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L31
            r9.append(r2)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L31
            java.lang.String r11 = r9.toString()     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L31
            e45 r12 = r0.a()     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L31
            r4f r0 = new r4f     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L31
            r0.<init>(r10, r11, r7, r6)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L31
            r1.E = r7     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L31
            r1.H = r4     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L31
            java.lang.Object r10 = defpackage.gb9.c0(r12, r0, r1)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L31
            if (r10 != r8) goto L9b
        L9a:
            return r8
        L9b:
            r3 = r6
            goto La8
        L9d:
            java.util.List r11 = defpackage.xah.a
            ozf r11 = defpackage.ozf.E
            r12 = 24
            java.lang.String r0 = "SandboxWebView: Timed out while awaiting readyForContent"
            defpackage.xah.f(r10, r0, r11, r7, r12)
        La8:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t4f.f(t4f, java.lang.String, vp4):java.lang.Object");
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        this.S = true;
        super.destroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable g(java.lang.String r5, defpackage.vp4 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.o4f
            if (r0 == 0) goto L13
            r0 = r6
            o4f r0 = (defpackage.o4f) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            o4f r0 = new o4f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.F
            int r1 = r0.H
            r2 = 1
            java.util.LinkedHashMap r4 = r4.P
            r3 = 0
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2e
            java.lang.String r5 = r0.E
            defpackage.sf5.h0(r6)     // Catch: java.lang.Throwable -> L2a kotlinx.coroutines.TimeoutCancellationException -> L2c
            goto L4b
        L2a:
            r6 = move-exception
            goto L5e
        L2c:
            r6 = move-exception
            goto L51
        L2e:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r3
        L34:
            defpackage.sf5.h0(r6)
            v84 r6 = defpackage.zni.c()
            r4.put(r5, r6)
            r0.E = r5     // Catch: java.lang.Throwable -> L2a kotlinx.coroutines.TimeoutCancellationException -> L2c
            r0.H = r2     // Catch: java.lang.Throwable -> L2a kotlinx.coroutines.TimeoutCancellationException -> L2c
            java.lang.Object r6 = defpackage.vtk.h(r6, r0)     // Catch: java.lang.Throwable -> L2a kotlinx.coroutines.TimeoutCancellationException -> L2c
            m45 r0 = defpackage.m45.E
            if (r6 != r0) goto L4b
            return r0
        L4b:
            anthropic.claude.usercontent.sandbox.wire_format.Response r6 = (anthropic.claude.usercontent.sandbox.wire_format.Response) r6     // Catch: java.lang.Throwable -> L2a kotlinx.coroutines.TimeoutCancellationException -> L2c
            r4.remove(r5)
            return r6
        L51:
            java.util.List r0 = defpackage.xah.a     // Catch: java.lang.Throwable -> L2a
            java.lang.String r0 = "SandboxWebView: Timed out while awaiting response"
            r1 = 28
            defpackage.xah.f(r6, r0, r3, r3, r1)     // Catch: java.lang.Throwable -> L2a
            r4.remove(r5)
            return r3
        L5e:
            r4.remove(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t4f.g(java.lang.String, vp4):java.io.Serializable");
    }

    public final n4f getClientRpcListener() {
        return this.I;
    }

    public final bz7 getExternalUrlHandler() {
        return this.J;
    }

    public final bz7 getRenderProcessGoneListener() {
        return this.K;
    }

    public final rz7 getSandboxLoadErrorListener() {
        return this.L;
    }

    public final Object h(Request request, vp4 vp4Var) {
        return gb9.c0(this.O, new p4f(this, request, null, 1), vp4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(anthropic.claude.usercontent.sandbox.wire_format.Response r5, defpackage.vp4 r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.s4f
            if (r0 == 0) goto L13
            r0 = r6
            s4f r0 = (defpackage.s4f) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            s4f r0 = new s4f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.sf5.h0(r6)
            goto L43
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L2c:
            defpackage.sf5.h0(r6)
            o6e r6 = new o6e
            r1 = 8
            r6.<init>(r4, r5, r2, r1)
            r0.G = r3
            e45 r4 = r4.O
            java.lang.Object r4 = defpackage.gb9.c0(r4, r6, r0)
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L43
            return r5
        L43:
            iei r4 = defpackage.iei.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t4f.i(anthropic.claude.usercontent.sandbox.wire_format.Response, vp4):java.lang.Object");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        motionEvent.getClass();
        int action = motionEvent.getAction();
        if (action == 0) {
            ViewParent parent2 = getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(true);
            }
        } else if ((action == 1 || action == 3) && (parent = getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setClientRpcListener(n4f n4fVar) {
        this.I = n4fVar;
    }

    public final void setExternalUrlHandler(bz7 bz7Var) {
        this.J = bz7Var;
    }

    public final void setRenderProcessGoneListener(bz7 bz7Var) {
        this.K = bz7Var;
    }

    public final void setSandboxLoadErrorListener(rz7 rz7Var) {
        this.L = rz7Var;
    }
}
