package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes.dex */
public final class smh implements ekc {
    public final fk0 a;
    public final kw9 b;
    public final kw9 c;
    public String d;
    public String e;
    public bz7 f = new x2h(22);
    public bz7 g = new x2h(22);

    public smh(fk0 fk0Var, kw9 kw9Var, kw9 kw9Var2) {
        this.a = fk0Var;
        this.b = kw9Var;
        this.c = kw9Var2;
    }

    public final synchronized void a(boolean z) {
        Object hreVar;
        Object hreVar2;
        Object hreVar3;
        Object hreVar4;
        Object hreVar5;
        boolean z2 = !z;
        SharedPreferences.Editor editorEdit = this.a.a.edit();
        editorEdit.putBoolean("third_party_analytics_disabled_for_org", z);
        editorEdit.apply();
        try {
            kj5.a(null).h(!z ? l4i.E : l4i.F);
            hreVar = iei.a;
        } catch (Throwable th) {
            hreVar = new hre(th);
        }
        Throwable thA = jre.a(hreVar);
        if (thA != null) {
            Log.e("ThirdPartyAnalyticsGate", "Datadog consent change failed", thA);
        }
        try {
            gx gxVar = (gx) this.b.getValue();
            gxVar.J = z2;
            el5 el5Var = gxVar.F;
            gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new ax(gxVar, z2, (tp4) null), 2);
            hreVar2 = iei.a;
        } catch (Throwable th2) {
            hreVar2 = new hre(th2);
        }
        Throwable thA2 = jre.a(hreVar2);
        if (thA2 != null) {
            Log.e("ThirdPartyAnalyticsGate", "Segment enabled change failed", thA2);
        }
        try {
            j6k j6kVar = ((FirebaseAnalytics) this.c.getValue()).a;
            Boolean boolValueOf = Boolean.valueOf(z2);
            j6kVar.getClass();
            j6kVar.c(new zbk(j6kVar, boolValueOf));
            hreVar3 = iei.a;
        } catch (Throwable th3) {
            hreVar3 = new hre(th3);
        }
        Throwable thA3 = jre.a(hreVar3);
        if (thA3 != null) {
            Log.e("ThirdPartyAnalyticsGate", "Firebase collection change failed", thA3);
        }
        try {
            this.f.invoke(Boolean.valueOf(z2));
            hreVar4 = iei.a;
        } catch (Throwable th4) {
            hreVar4 = new hre(th4);
        }
        Throwable thA4 = jre.a(hreVar4);
        if (thA4 != null) {
            Log.e("ThirdPartyAnalyticsGate", "Sentry enabled change dispatch failed", thA4);
        }
        try {
            this.g.invoke(Boolean.valueOf(z2));
            hreVar5 = iei.a;
        } catch (Throwable th5) {
            hreVar5 = new hre(th5);
        }
        Throwable thA5 = jre.a(hreVar5);
        if (thA5 != null) {
            Log.e("ThirdPartyAnalyticsGate", "Sift enabled change dispatch failed", thA5);
        }
    }
}
