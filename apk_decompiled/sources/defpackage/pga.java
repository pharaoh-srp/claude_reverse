package defpackage;

import io.sentry.a1;
import io.sentry.b2;
import io.sentry.cache.d;
import io.sentry.hints.h;
import io.sentry.hints.k;
import io.sentry.n0;
import io.sentry.t5;
import io.sentry.transport.a;
import io.sentry.util.c;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pga implements RejectedExecutionHandler {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pga(pb1 pb1Var, h99 h99Var, String str) {
        this.b = h99Var;
        this.c = str;
    }

    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                h99 h99Var = (h99) obj2;
                String str = (String) obj;
                if (runnable != null) {
                    List listX = x44.X(g99.F, g99.G);
                    v01 v01Var = new v01(28, runnable);
                    Map mapSingletonMap = Collections.singletonMap("executor.context", str);
                    mapSingletonMap.getClass();
                    ((rl) h99Var).M(5, listX, v01Var, null, false, mapSingletonMap);
                }
                break;
            default:
                d dVar = (d) obj2;
                a1 a1Var = (a1) obj;
                if (runnable instanceof a) {
                    a aVar = (a) runnable;
                    if (!c.e(aVar.F, io.sentry.hints.d.class)) {
                        dVar.H(aVar.E, aVar.F);
                    }
                    n0 n0Var = aVar.F;
                    c.i(n0Var, k.class, new b2(8));
                    c.i(n0Var, h.class, new b2(9));
                    a1Var.h(t5.WARNING, "Envelope rejected", new Object[0]);
                }
                break;
        }
    }

    public /* synthetic */ pga(d dVar, a1 a1Var) {
        this.b = dVar;
        this.c = a1Var;
    }
}
