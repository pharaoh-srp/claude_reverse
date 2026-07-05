package defpackage;

import android.os.CancellationSignal;
import android.os.Handler;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.a;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.anthropic.claude.core.telemetry.SilentException;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class b8j extends WebViewClient {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ PrintAttributes d;
    public final /* synthetic */ File e;
    public final /* synthetic */ Handler f;
    public final /* synthetic */ ua2 g;
    public final /* synthetic */ WebView h;

    public b8j(AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, String str, PrintAttributes printAttributes, File file, Handler handler, ua2 ua2Var, WebView webView) {
        this.a = atomicBoolean;
        this.b = atomicBoolean2;
        this.c = str;
        this.d = printAttributes;
        this.e = file;
        this.f = handler;
        this.g = ua2Var;
        this.h = webView;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        AtomicBoolean atomicBoolean = this.a;
        if (atomicBoolean.get() || !this.b.compareAndSet(false, true)) {
            return;
        }
        PrintDocumentAdapter printDocumentAdapterCreatePrintDocumentAdapter = webView.createPrintDocumentAdapter(this.c);
        printDocumentAdapterCreatePrintDocumentAdapter.getClass();
        PrintAttributes printAttributes = this.d;
        Handler handler = this.f;
        ua2 ua2Var = this.g;
        WebView webView2 = this.h;
        x04 x04Var = new x04(atomicBoolean, handler, ua2Var, webView2, 3);
        jo3 jo3Var = new jo3(atomicBoolean, handler, ua2Var, webView2, 4);
        File file = this.e;
        file.getClass();
        h80 h80Var = new h80();
        h80Var.E = printDocumentAdapterCreatePrintDocumentAdapter;
        h80Var.F = file;
        h80Var.G = x04Var;
        h80Var.H = jo3Var;
        try {
            printDocumentAdapterCreatePrintDocumentAdapter.onStart();
            printDocumentAdapterCreatePrintDocumentAdapter.onLayout(null, printAttributes, new CancellationSignal(), new a(h80Var), null);
        } catch (Throwable th) {
            h80Var.e("layout threw: " + jce.a.b(th.getClass()).f());
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        SilentException.a(new SilentException("PDF WebView render process gone: didCrash=" + (renderProcessGoneDetail != null ? Boolean.valueOf(renderProcessGoneDetail.didCrash()) : null)), ozf.F, false, 2);
        t5h.d(this.a, this.f, this.g, this.h, false);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        webView.getClass();
        webResourceRequest.getClass();
        return true;
    }
}
