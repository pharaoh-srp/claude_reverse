package defpackage;

import com.anthropic.claude.analytics.events.WebViewEvents$WebViewKind;

/* JADX INFO: loaded from: classes.dex */
public final class n3f {
    public final qi3 a;
    public final bj0 b;

    public n3f(qi3 qi3Var, bj0 bj0Var) {
        this.a = qi3Var;
        this.b = bj0Var;
    }

    public final o3f a(WebViewEvents$WebViewKind webViewEvents$WebViewKind) {
        webViewEvents$WebViewKind.getClass();
        return new o3f(webViewEvents$WebViewKind, this.a, this.b);
    }
}
