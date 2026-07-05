package defpackage;

import android.webkit.JavascriptInterface;
import com.anthropic.claude.core.telemetry.SilentException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class xvc {
    public final /* synthetic */ bz7 a;
    public final /* synthetic */ bz7 b;
    public final /* synthetic */ nwb c;

    public xvc(gj7 gj7Var, bz7 bz7Var, bz7 bz7Var2, nwb nwbVar) {
        this.a = bz7Var;
        this.b = bz7Var2;
        this.c = nwbVar;
    }

    @JavascriptInterface
    public final void postMessage(String str) {
        Object hreVar;
        str.getClass();
        try {
            hreVar = new JSONObject(str);
        } catch (Throwable th) {
            hreVar = new hre(th);
        }
        if (hreVar instanceof hre) {
            hreVar = null;
        }
        JSONObject jSONObject = (JSONObject) hreVar;
        if (jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("type");
        if (!x44.r(strOptString, "loaded")) {
            if (x44.r(strOptString, "error")) {
                String strOptString2 = jSONObject.optString("message", "Unknown error");
                SilentException.a(new SilentException(ij0.i("PDF.js error: ", strOptString2)), null, false, 3);
                strOptString2.getClass();
                this.b.invoke(strOptString2);
                return;
            }
            return;
        }
        int iOptInt = jSONObject.optInt("pageCount");
        zfa.a.getClass();
        if (yfa.b()) {
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (!arrayList.isEmpty()) {
                zfa.a.getClass();
                String str2 = "PDF.js: first page rendered (" + iOptInt + " pages)";
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfa.DEBUG, "PdfWebView", str2);
                }
            }
        }
        this.c.setValue(Boolean.TRUE);
        this.a.invoke(Integer.valueOf(iOptInt));
    }
}
