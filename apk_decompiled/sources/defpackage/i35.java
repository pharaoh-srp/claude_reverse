package defpackage;

import com.datadog.android.rum.internal.domain.scope.RumRawEvent;
import com.datadog.android.rum.internal.monitor.DatadogRumMonitor;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public final class i35 extends ts9 implements pz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i35(Object obj, int i, Object obj2) {
        super(2);
        this.F = i;
        this.G = obj;
        this.H = obj2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        lj5 lj5Var;
        int i = this.F;
        iei ieiVar = iei.a;
        Object obj4 = this.H;
        Object obj5 = this.G;
        switch (i) {
            case 0:
                lj5 lj5Var2 = (lj5) obj;
                bz7 bz7Var = (bz7) obj2;
                j35 j35Var = (j35) obj4;
                lj5Var2.getClass();
                bz7Var.getClass();
                ArrayList<cf5> arrayList = new ArrayList();
                for (Object obj6 : (ArrayList) obj5) {
                    if (!w44.G0(j35.K, ((cf5) obj6).c())) {
                        arrayList.add(obj6);
                    }
                }
                ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
                for (cf5 cf5Var : arrayList) {
                    n78 n78Var = j35Var.J;
                    cf5Var.getClass();
                    n78Var.getClass();
                    Object objB = cf5Var.b("_dd.datadog_initial_context");
                    if (!(objB instanceof Future)) {
                        objB = null;
                    }
                    Future future = (Future) objB;
                    if (future != null) {
                        if (future.isDone()) {
                            try {
                                obj3 = future.get();
                            } catch (Exception unused) {
                                n78Var.M("Unable to get datadog context.");
                                obj3 = null;
                            }
                            lj5Var = (lj5) obj3;
                        } else {
                            n78Var.M("Initial span creation Datadog context is not available at the write time.");
                            lj5Var = null;
                        }
                        if (lj5Var != null) {
                            Map map = (Map) lj5Var.q.get("rum");
                            if (map == null) {
                                map = nm6.E;
                            }
                            n78.U(cf5Var, "application_id", map.get("application_id"));
                            n78.U(cf5Var, "session_id", map.get("session_id"));
                            n78.U(cf5Var, "view.id", map.get("view_id"));
                            n78.U(cf5Var, "user_action.id", map.get("action_id"));
                            n78.U(cf5Var, "user_id", lj5Var.n.b);
                            n78.U(cf5Var, "account_id", null);
                        }
                        n78.U(cf5Var, "_dd.datadog_initial_context", null);
                        break;
                    }
                    arrayList2.add(cf5Var);
                }
                bz7Var.invoke(new v80(arrayList2, j35Var, lj5Var2, 2));
                break;
            case 1:
                lj5 lj5Var3 = (lj5) obj;
                bz7 bz7Var2 = (bz7) obj2;
                RumRawEvent rumRawEvent = (RumRawEvent) obj4;
                lj5Var3.getClass();
                bz7Var2.getClass();
                DatadogRumMonitor datadogRumMonitor = (DatadogRumMonitor) obj5;
                ExecutorService executorService = datadogRumMonitor.e;
                k99 k99Var = datadogRumMonitor.a;
                if (!executorService.isShutdown()) {
                    k99Var.p(new e0(14, (sxe) v40.B(v40.P(executorService, "Rum event handling", k99Var.t(), new vxb(String.valueOf(jce.a.b(rumRawEvent.getClass()).f()), new ok5(datadogRumMonitor, rumRawEvent, lj5Var3, bz7Var2))), "Rum get context", k99Var.t())), "rum", false);
                }
                break;
            default:
                fb2 fb2Var = (fb2) obj;
                ja8 ja8Var = (ja8) obj2;
                m5c m5cVar = (m5c) obj5;
                av9 av9Var = m5cVar.S;
                if (av9Var.Y()) {
                    m5cVar.n0 = fb2Var;
                    m5cVar.m0 = ja8Var;
                    omc snapshotObserver = dv9.a(av9Var).getSnapshotObserver();
                    xre xreVar = m5c.t0;
                    snapshotObserver.a.d(m5cVar, j06.Z, (j5c) obj4);
                    m5cVar.q0 = false;
                } else {
                    m5cVar.q0 = true;
                }
                break;
        }
        return ieiVar;
    }
}
