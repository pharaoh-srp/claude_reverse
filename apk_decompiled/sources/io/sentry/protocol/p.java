package io.sentry.protocol;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class p implements m2 {
    public String E;
    public String F;
    public List G;
    public ConcurrentHashMap H;

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        io.sentry.y yVar = (io.sentry.y) q3Var;
        yVar.n();
        if (this.E != null) {
            yVar.r("formatted");
            yVar.A(this.E);
        }
        if (this.F != null) {
            yVar.r("message");
            yVar.A(this.F);
        }
        List list = this.G;
        if (list != null && !list.isEmpty()) {
            yVar.r("params");
            yVar.x(a1Var, this.G);
        }
        ConcurrentHashMap concurrentHashMap = this.H;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.H, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
