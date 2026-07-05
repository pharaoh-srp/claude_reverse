package defpackage;

import android.net.Uri;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class el4 implements j4f {
    public static final el4 E = new el4();
    public static final String F = csg.V("\n        (function() {\n           var originalLog = console.log;\n           console.log = function() {\n               if (window.__CLAUDE_MOBILE_IS_DEBUG_ENABLED) {\n                   var args = Array.prototype.slice.call(arguments);\n                   var message = args.map(function(arg) {\n                       return typeof arg === 'object' ? JSON.stringify(arg) : arg;\n                   }).join(' ');\n                   consoleLog.postMessage(message);\n                   originalLog.apply(console, arguments);\n               }\n           };\n       })();\n    ");

    @Override // defpackage.j4f
    public final String getName() {
        return "consoleLog";
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
            String strI = ij0.i("WebView Log: ", ep1Var.b());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((n30) ((zfa) it.next())).b(sfa.INFO, "ConsoleLogListener", strI);
            }
        }
    }
}
