package defpackage;

import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class c8j {
    public final WebViewProviderBoundaryInterface a;

    public c8j(WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.a = webViewProviderBoundaryInterface;
    }

    public final void a(String str, String[] strArr, i7j i7jVar) {
        this.a.addWebMessageListener(str, strArr, new mv1(new xzd(19, i7jVar)));
    }
}
