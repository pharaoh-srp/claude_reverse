package defpackage;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;

/* JADX INFO: loaded from: classes3.dex */
public final class k7j {
    public final WebResourceRequest a;
    public final WebResourceError b;

    public k7j(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.a = webResourceRequest;
        this.b = webResourceError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7j)) {
            return false;
        }
        k7j k7jVar = (k7j) obj;
        return x44.r(this.a, k7jVar.a) && this.b.equals(k7jVar.b);
    }

    public final int hashCode() {
        WebResourceRequest webResourceRequest = this.a;
        return this.b.hashCode() + ((webResourceRequest == null ? 0 : webResourceRequest.hashCode()) * 31);
    }

    public final String toString() {
        return "WebViewError(request=" + this.a + ", error=" + this.b + ")";
    }
}
