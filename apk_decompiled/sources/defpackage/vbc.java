package defpackage;

import android.webkit.JavascriptInterface;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class vbc {
    public final /* synthetic */ nwb a;
    public final /* synthetic */ nwb b;

    public vbc(gj7 gj7Var, nwb nwbVar, nwb nwbVar2) {
        this.a = nwbVar;
        this.b = nwbVar2;
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
        boolean zR = x44.r(strOptString, "loaded");
        nwb nwbVar = this.a;
        if (zR) {
            nwbVar.setValue(Boolean.TRUE);
        } else if (x44.r(strOptString, "error")) {
            nwbVar.setValue(Boolean.TRUE);
            ((zy7) this.b.getValue()).a();
        }
    }
}
