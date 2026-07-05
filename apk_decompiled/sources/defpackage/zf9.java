package defpackage;

import android.net.Uri;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zf9 implements j4f {
    public static final zf9 E = new zf9();
    public static final String F = csg.V("\n        window.onerror = function(message, source, lineno, colno, error) {\n            if (window.__CLAUDE_MOBILE_IS_DEBUG_ENABLED) {\n                jsError.postMessage({\n                    message: message,\n                    source: source,\n                    lineno: lineno,\n                    colno: colno,\n                    error: JSON.stringify(error)\n                });\n            }\n            return true;\n        };\n    ");

    @Override // defpackage.j4f
    public final String getName() {
        return "jsError";
    }

    @Override // defpackage.i7j
    public final void o0(WebView webView, ep1 ep1Var, Uri uri, boolean z, oe9 oe9Var) {
        webView.getClass();
        uri.getClass();
        oe9Var.getClass();
        zfa.a.getClass();
        if (yfa.b()) {
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (arrayList.isEmpty()) {
                return;
            }
            zfa.a.getClass();
            String strI = ij0.i("JavaScript Error: ", ep1Var.b());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((n30) ((zfa) it.next())).b(sfa.ERROR, "JsErrorListener", strI);
            }
        }
    }
}
