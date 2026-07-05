package io.sentry.rrweb;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import io.sentry.y;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class l extends b implements m2 {
    public String G;
    public String H;
    public String I;
    public double J;
    public double K;
    public ConcurrentHashMap L;
    public HashMap M;
    public ConcurrentHashMap N;
    public ConcurrentHashMap O;

    public l() {
        super(c.Custom);
        this.G = "performanceSpan";
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        y yVar = (y) q3Var;
        yVar.n();
        io.sentry.config.a.F(this, yVar, a1Var);
        yVar.r("data");
        yVar.n();
        yVar.r("tag");
        yVar.A(this.G);
        yVar.r("payload");
        yVar.n();
        if (this.H != null) {
            yVar.r("op");
            yVar.A(this.H);
        }
        if (this.I != null) {
            yVar.r("description");
            yVar.A(this.I);
        }
        yVar.r("startTimestamp");
        yVar.x(a1Var, BigDecimal.valueOf(this.J));
        yVar.r("endTimestamp");
        yVar.x(a1Var, BigDecimal.valueOf(this.K));
        if (this.L != null) {
            yVar.r("data");
            yVar.x(a1Var, this.L);
        }
        ConcurrentHashMap concurrentHashMap = this.N;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.N, str, yVar, str, a1Var);
            }
        }
        yVar.p();
        ConcurrentHashMap concurrentHashMap2 = this.O;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                io.sentry.e.b(this.O, str2, yVar, str2, a1Var);
            }
        }
        yVar.p();
        HashMap map = this.M;
        if (map != null) {
            for (String str3 : map.keySet()) {
                io.sentry.e.a(this.M, str3, yVar, str3, a1Var);
            }
        }
        yVar.p();
    }
}
