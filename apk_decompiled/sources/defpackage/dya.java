package defpackage;

import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class dya extends WebChromeClient {
    public final /* synthetic */ zy7 a;

    public dya(zy7 zy7Var) {
        this.a = zy7Var;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        consoleMessage.getClass();
        ConsoleMessage.MessageLevel messageLevel = consoleMessage.messageLevel();
        int i = messageLevel == null ? -1 : cya.a[messageLevel.ordinal()];
        sfa sfaVar = i != 1 ? i != 2 ? i != 3 ? i != 4 ? sfa.VERBOSE : sfa.DEBUG : sfa.INFO : sfa.WARN : sfa.ERROR;
        zfa.a.getClass();
        if (yfa.b()) {
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                if (sfaVar.E >= 2) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                zfa.a.getClass();
                String str = consoleMessage.message() + " [" + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber() + "]";
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfaVar, "McpAppJS", str);
                }
            }
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        pz7 pz7Var = ((kxa) this.a.a()).n;
        if (pz7Var == null || valueCallback == null || fileChooserParams == null) {
            return false;
        }
        pz7Var.invoke(valueCallback, fileChooserParams);
        return true;
    }
}
