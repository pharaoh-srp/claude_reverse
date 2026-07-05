package io.sentry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class q implements i0 {
    public final /* synthetic */ int E;
    public final Map F;
    public final w6 G;

    public q(w6 w6Var, int i) {
        this.E = i;
        switch (i) {
            case 1:
                this.F = Collections.synchronizedMap(new WeakHashMap());
                this.G = w6Var;
                break;
            default:
                this.F = Collections.synchronizedMap(new HashMap());
                this.G = w6Var;
                break;
        }
    }

    @Override // io.sentry.i0
    public final j5 d(j5 j5Var, n0 n0Var) {
        io.sentry.protocol.v vVarG;
        String str;
        Long l;
        int i = this.E;
        w6 w6Var = this.G;
        Map map = this.F;
        switch (i) {
            case 0:
                if (io.sentry.util.c.e(n0Var, u7.class) && (vVarG = j5Var.g()) != null && (str = vVarG.E) != null && (l = vVarG.H) != null) {
                    Long l2 = (Long) map.get(str);
                    if (l2 == null || l2.equals(l)) {
                        map.put(str, l);
                    } else {
                        w6Var.getLogger().h(t5.INFO, "Event %s has been dropped due to multi-threaded deduplication", j5Var.E);
                        io.sentry.util.c.k(n0Var, io.sentry.hints.e.MULTITHREADED_DEDUPLICATION);
                    }
                }
                break;
            default:
                if (w6Var.isEnableDeduplication()) {
                    Throwable thB = j5Var.b();
                    if (thB != null) {
                        if (!map.containsKey(thB)) {
                            ArrayList arrayList = new ArrayList();
                            for (Throwable cause = thB; cause.getCause() != null; cause = cause.getCause()) {
                                arrayList.add(cause.getCause());
                            }
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (map.containsKey(it.next())) {
                                }
                            }
                            map.put(thB, null);
                        }
                        w6Var.getLogger().h(t5.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", j5Var.E);
                    }
                } else {
                    w6Var.getLogger().h(t5.DEBUG, "Event deduplication is disabled.", new Object[0]);
                }
                break;
        }
        return j5Var;
    }
}
