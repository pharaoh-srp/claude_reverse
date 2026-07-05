package defpackage;

import android.net.Uri;
import android.webkit.WebView;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class j7j {
    public static final Uri a = Uri.parse("*");
    public static final Uri b = Uri.parse("");
    public static final WeakHashMap c = new WeakHashMap();

    public static void a(WebView webView, String str, Set set, i7j i7jVar) {
        c8j c8jVar;
        if (!t7j.c.b()) {
            pmf.n("This method is not supported by the current version of the framework and the current WebView APK");
            return;
        }
        if (t7j.g.b()) {
            WeakHashMap weakHashMap = c;
            c8jVar = (c8j) weakHashMap.get(webView);
            if (c8jVar == null) {
                c8jVar = new c8j(skk.f().createWebView(webView));
                weakHashMap.put(webView, c8jVar);
            }
        } else {
            c8jVar = new c8j(skk.f().createWebView(webView));
        }
        c8jVar.a(str, (String[]) set.toArray(new String[0]), i7jVar);
    }
}
