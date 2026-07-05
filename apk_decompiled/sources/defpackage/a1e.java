package defpackage;

import android.content.Context;
import android.net.Uri;
import android.print.PrintDocumentAdapter;
import android.print.PrintManager;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.anthropic.claude.tool.model.RecipeDisplayV0Input;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class a1e extends WebViewClient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a1e(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((nwb) obj).setValue(Boolean.TRUE);
                break;
            default:
                webView.getClass();
                Object systemService = ((Context) obj).getSystemService("print");
                PrintManager printManager = systemService instanceof PrintManager ? (PrintManager) systemService : null;
                if (printManager == null) {
                    webView.destroy();
                } else {
                    String title = ((RecipeDisplayV0Input) this.c).getTitle();
                    PrintDocumentAdapter printDocumentAdapterCreatePrintDocumentAdapter = webView.createPrintDocumentAdapter(title);
                    printDocumentAdapterCreatePrintDocumentAdapter.getClass();
                    printManager.print(title, new p7e(printDocumentAdapterCreatePrintDocumentAdapter, webView), null).getClass();
                }
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        switch (this.a) {
            case 0:
                if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                    ((zy7) this.c).a();
                    break;
                }
                break;
            default:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        switch (this.a) {
            case 0:
                if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                    ((zy7) this.c).a();
                    break;
                }
                break;
            default:
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        String host;
        switch (this.a) {
            case 0:
                if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null && (host = url.getHost()) != null) {
                    String lowerCase = host.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    Set<String> set = b1e.a;
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        for (String str : set) {
                            if (!lowerCase.equals(str)) {
                                if (isg.h0(lowerCase, "." + str, false)) {
                                }
                            }
                            String path = url.getPath();
                            if (path == null) {
                                path = "";
                            }
                            if (isg.q0(path, "/embed/", false)) {
                                return false;
                            }
                        }
                    }
                }
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }
}
