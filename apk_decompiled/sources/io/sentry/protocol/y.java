package io.sentry.protocol;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class y implements m2 {
    public String E;
    public String F;
    public String G;
    public ConcurrentHashMap H;

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        io.sentry.y yVar = (io.sentry.y) q3Var;
        yVar.n();
        if (this.E != null) {
            yVar.r("name");
            yVar.A(this.E);
        }
        if (this.F != null) {
            yVar.r("version");
            yVar.A(this.F);
        }
        if (this.G != null) {
            yVar.r("raw_description");
            yVar.A(this.G);
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
