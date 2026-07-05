package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oxk implements Runnable {
    public final /* synthetic */ int E = 0;
    public /* synthetic */ int F;
    public /* synthetic */ Object G;
    public /* synthetic */ Object H;
    public /* synthetic */ Cloneable I;

    public /* synthetic */ oxk(w9h w9hVar, int i, qgk qgkVar, Intent intent) {
        this.G = w9hVar;
        this.F = i;
        this.H = qgkVar;
        this.I = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.E) {
            case 0:
                ije ijeVar = (ije) this.G;
                int i = this.F;
                Exception exc = (Exception) this.H;
                byte[] bArr = (byte[]) this.I;
                umk umkVar = (umk) ((fnf) ijeVar.G).F;
                h1l h1lVar = umkVar.P;
                vqj vqjVar = umkVar.K;
                qgk qgkVar = umkVar.M;
                if ((i == 200 || i == 204 || i == 304) && exc == null) {
                    vik vikVar = umkVar.L;
                    umk.c(vikVar);
                    vikVar.Y.a(true);
                    if (bArr == null || bArr.length == 0) {
                        umk.d(qgkVar);
                        qgkVar.Q.b("Deferred Deep Link response empty.");
                    } else {
                        try {
                            JSONObject jSONObject = new JSONObject(new String(bArr));
                            String strOptString = jSONObject.optString("deeplink", "");
                            if (!TextUtils.isEmpty(strOptString)) {
                                String strOptString2 = jSONObject.optString("gclid", "");
                                String strOptString3 = jSONObject.optString("gbraid", "");
                                String strOptString4 = jSONObject.optString("gad_source", "");
                                double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                                Bundle bundle = new Bundle();
                                c3l.a();
                                yek yekVar = zvj.R0;
                                if (!vqjVar.X0(null, yekVar)) {
                                    umk.c(h1lVar);
                                    if (!h1lVar.S1(strOptString)) {
                                        umk.d(qgkVar);
                                        qgkVar.M.a(strOptString2, strOptString, "Deferred Deep Link validation failed. gclid, deep link");
                                    }
                                } else {
                                    umk.c(h1lVar);
                                    if (!h1lVar.S1(strOptString)) {
                                        umk.d(qgkVar);
                                        qgkVar.M.d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                                    } else {
                                        if (!TextUtils.isEmpty(strOptString3)) {
                                            bundle.putString("gbraid", strOptString3);
                                        }
                                        if (!TextUtils.isEmpty(strOptString4)) {
                                            bundle.putString("gad_source", strOptString4);
                                        }
                                    }
                                }
                                c3l.a();
                                vqjVar.X0(null, yekVar);
                                bundle.putString("gclid", strOptString2);
                                bundle.putString("_cis", "ddp");
                                umkVar.T.p1("auto", "_cmp", bundle);
                                umk.c(h1lVar);
                                if (!TextUtils.isEmpty(strOptString) && h1lVar.q1(dOptDouble, strOptString)) {
                                    ((umk) h1lVar.E).E.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                    break;
                                }
                            } else {
                                umk.d(qgkVar);
                                qgkVar.Q.b("Deferred Deep Link is empty.");
                            }
                        } catch (JSONException e) {
                            umk.d(qgkVar);
                            qgkVar.J.c("Failed to parse the Deferred Deep Link response. exception", e);
                            return;
                        }
                    }
                } else {
                    umk.d(qgkVar);
                    qgkVar.M.a(Integer.valueOf(i), exc, "Network Request for Deferred Deep Link failed. response, exception");
                }
                break;
            default:
                w9h w9hVar = (w9h) this.G;
                int i2 = this.F;
                qgk qgkVar2 = (qgk) this.H;
                Intent intent = (Intent) this.I;
                mzk mzkVar = (mzk) ((Service) w9hVar.E);
                if (mzkVar.d(i2)) {
                    qgkVar2.R.c("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i2));
                    w9hVar.i().R.b("Completed wakeful intent.");
                    mzkVar.a(intent);
                }
                break;
        }
    }

    public /* synthetic */ oxk() {
    }
}
