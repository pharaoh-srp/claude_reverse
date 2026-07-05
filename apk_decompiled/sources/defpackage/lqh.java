package defpackage;

import com.segment.analytics.kotlin.core.BaseEvent;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class lqh {
    public final Map a = sta.h0(new cpc(m7d.E, new s8b()), new cpc(m7d.F, new s8b()), new cpc(m7d.G, new s8b()), new cpc(m7d.H, new s8b()), new cpc(m7d.I, new s8b()));
    public gx b;

    public final void a(n7d n7dVar) {
        gx gxVar;
        tp4 tp4Var = null;
        try {
            gxVar = this.b;
        } catch (Throwable th) {
            gx gxVar2 = this.b;
            if (gxVar2 == null) {
                x44.o0("analytics");
                throw null;
            }
            bjk.e(gxVar2, th, "Caught Exception while setting up plugin " + n7dVar, "analytics_mobile.integration.invoke.error", mwa.N(th), new j70(th, n7dVar, this, 6));
        }
        if (gxVar == null) {
            x44.o0("analytics");
            throw null;
        }
        n7dVar.b(gxVar);
        s8b s8bVar = (s8b) this.a.get(n7dVar.getType());
        if (s8bVar != null) {
            s8bVar.a.add(n7dVar);
        }
        gx gxVar3 = this.b;
        if (gxVar3 == null) {
            x44.o0("analytics");
            throw null;
        }
        el5 el5Var = gxVar3.F;
        gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new rrb(gxVar3, n7dVar, tp4Var, 16), 2);
        wah.E.c("analytics_mobile.integration.invoke", new r1g(2, n7dVar));
    }

    public final void b(bz7 bz7Var) {
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            s8b s8bVar = (s8b) ((Map.Entry) it.next()).getValue();
            s8bVar.getClass();
            for (n7d n7dVar : s8bVar.a) {
                try {
                    n7dVar.getClass();
                    bz7Var.invoke(n7dVar);
                } catch (Throwable th) {
                    bjk.e(null, th, "Caught Exception applying closure to plugin: " + n7dVar, "analytics_mobile.integration.invoke.error", mwa.N(th), new r8b(th, n7dVar, 0));
                }
            }
        }
    }

    public final BaseEvent c(m7d m7dVar, BaseEvent baseEvent) {
        s8b s8bVar = (s8b) this.a.get(m7dVar);
        if (baseEvent == null) {
            return baseEvent;
        }
        if (s8bVar == null) {
            return null;
        }
        for (n7d n7dVar : s8bVar.a) {
            if (baseEvent != null) {
                BaseEvent baseEventCopy = baseEvent.copy();
                try {
                    wah.E.c("analytics_mobile.integration.invoke", new j40(baseEvent, 7, n7dVar));
                    if (n7dVar instanceof w16) {
                        ((w16) n7dVar).a(baseEventCopy);
                    } else {
                        baseEvent = n7dVar.a(baseEventCopy);
                    }
                } catch (Throwable th) {
                    dch.P(gx.Companion, "Skipping plugin due to Exception: " + n7dVar, 2);
                    bjk.e(null, th, "Caught Exception in plugin", "analytics_mobile.integration.invoke.error", mwa.N(th), new r8b(th, n7dVar, 1));
                }
            }
        }
        return baseEvent;
    }
}
