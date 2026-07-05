package defpackage;

import com.anthropic.claude.analytics.health.HealthMetricAction;
import com.anthropic.claude.analytics.health.HealthMetricReport;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class hl8 {
    public final uk8 a;
    public final smi b;

    public hl8(uk8 uk8Var, smi smiVar) {
        this.a = uk8Var;
        this.b = smiVar;
    }

    public static /* synthetic */ void b(hl8 hl8Var, HealthMetricAction healthMetricAction, bne bneVar, String str, Long l, int i) {
        if ((i & 16) != 0) {
            l = null;
        }
        hl8Var.a(healthMetricAction, bneVar, str, null, l);
    }

    public static hi6 c(hl8 hl8Var, HealthMetricAction healthMetricAction, l45 l45Var, String str, String str2, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        String str3 = (i & 8) != 0 ? null : str2;
        hl8Var.getClass();
        healthMetricAction.getClass();
        l45Var.getClass();
        return new hi6(healthMetricAction, hl8Var, l45Var, str, str3);
    }

    public final void a(HealthMetricAction healthMetricAction, bne bneVar, String str, String str2, Long l) {
        healthMetricAction.getClass();
        String strB = null;
        if (healthMetricAction == HealthMetricAction.UNSPECIFIED) {
            List list = xah.a;
            xah.f(new IllegalArgumentException("reportHealthMetric called with UNSPECIFIED action"), null, null, null, 30);
            return;
        }
        boolean z = bneVar instanceof yme;
        yme ymeVar = z ? (yme) bneVar : null;
        String strA = ymeVar != null ? ymeVar.a() : null;
        if (strA == null || !this.b.a().contains(strA)) {
            yme ymeVar2 = z ? (yme) bneVar : null;
            if (ymeVar2 != null) {
                strB = ymeVar2.b();
            }
        } else {
            strB = "user_error";
        }
        String str3 = strB;
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
                String str4 = healthMetricAction + " → " + bneVar + " (error_type=" + (str3 == null ? "-" : str3) + ")";
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfa.DEBUG, "HealthMetricReporter", str4);
                }
            }
        }
        this.a.g(new HealthMetricReport(bok.n(bneVar), str, str3, strA, str2, l, healthMetricAction));
    }
}
