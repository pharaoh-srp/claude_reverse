package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qmk implements Runnable {
    public final /* synthetic */ int E;
    public /* synthetic */ jsk F;

    public /* synthetic */ qmk(jsk jskVar, int i) {
        this.E = i;
        this.F = jskVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.E) {
            case 0:
                this.F.j1();
                break;
            case 1:
                jsk jskVar = this.F;
                jskVar.K0();
                if (jskVar.I0().Y.b()) {
                    jskVar.b0().Q.b("Deferred Deep Link already retrieved. Not fetching again.");
                } else {
                    long jA = jskVar.I0().Z.a();
                    jskVar.I0().Z.b(1 + jA);
                    int i = 1;
                    if (jA >= 5) {
                        jskVar.b0().M.b("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        jskVar.I0().Y.a(true);
                    } else {
                        if (jskVar.W == null) {
                            jskVar.W = new cuk(jskVar, (umk) jskVar.E, i);
                        }
                        jskVar.W.b(0L);
                    }
                }
                break;
            case 2:
                w9h w9hVar = this.F.U;
                umk umkVar = (umk) w9hVar.E;
                wlk wlkVar = umkVar.N;
                jsk jskVar2 = umkVar.T;
                vik vikVar = umkVar.L;
                umk.d(wlkVar);
                wlkVar.K0();
                if (w9hVar.j()) {
                    if (w9hVar.l()) {
                        umk.c(vikVar);
                        vikVar.b0.h(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        umk.b(jskVar2);
                        jskVar2.p1("auto", "_cmpx", bundle);
                    } else {
                        umk.c(vikVar);
                        bm7 bm7Var = vikVar.b0;
                        String strD = bm7Var.d();
                        if (TextUtils.isEmpty(strD)) {
                            qgk qgkVar = umkVar.M;
                            umk.d(qgkVar);
                            qgkVar.K.b("Cache still valid but referrer not found");
                        } else {
                            long jA2 = ((vikVar.c0.a() / 3600000) - 1) * 3600000;
                            Uri uri = Uri.parse(strD);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle2);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle2.putString(str, uri.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong("_cc", jA2);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            umk.b(jskVar2);
                            jskVar2.p1(str2, "_cmp", (Bundle) pair.second);
                        }
                        bm7Var.h(null);
                    }
                    umk.c(vikVar);
                    vikVar.c0.b(0L);
                    break;
                }
                break;
            default:
                this.F.j1();
                break;
        }
    }

    public /* synthetic */ qmk() {
        this.E = 3;
    }
}
