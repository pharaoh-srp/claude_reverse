package defpackage;

import android.app.Activity;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintManager;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.anthropic.claude.R;
import com.anthropic.claude.core.telemetry.SilentException;

/* JADX INFO: loaded from: classes3.dex */
public final class gu0 extends WebViewClient {
    public final /* synthetic */ tp0 a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ PrintManager c;

    public gu0(tp0 tp0Var, Activity activity, PrintManager printManager) {
        this.a = tp0Var;
        this.b = activity;
        this.c = printManager;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        String title = this.a.b.getTitle();
        if (title == null) {
            title = this.b.getString(R.string.artifact_default_title);
            title.getClass();
        }
        PrintDocumentAdapter printDocumentAdapterCreatePrintDocumentAdapter = webView.createPrintDocumentAdapter(title);
        printDocumentAdapterCreatePrintDocumentAdapter.getClass();
        PrintAttributes printAttributesBuild = new PrintAttributes.Builder().build();
        printAttributesBuild.getClass();
        this.c.print(title, printDocumentAdapterCreatePrintDocumentAdapter, printAttributesBuild);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean zDidCrash = renderProcessGoneDetail != null ? renderProcessGoneDetail.didCrash() : false;
        SilentException.a(new SilentException("Print WebView render process gone: didCrash=" + zDidCrash + ", rendererPriority=" + (renderProcessGoneDetail != null ? Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()) : null)), zDidCrash ? ozf.G : ozf.F, false, 2);
        if (webView == null) {
            return true;
        }
        webView.destroy();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        webView.getClass();
        webResourceRequest.getClass();
        return false;
    }
}
