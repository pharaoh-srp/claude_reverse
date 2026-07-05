package io.sentry;

import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class z3 implements m2 {
    public String E;
    public String F;
    public String G;
    public Long H;
    public Long I;
    public Long J;
    public Long K;
    public ConcurrentHashMap L;

    public z3(r1 r1Var, Long l, Long l2) {
        this.E = r1Var.t().toString();
        this.F = r1Var.y().E.toString();
        this.G = r1Var.getName().isEmpty() ? "unknown" : r1Var.getName();
        this.H = l;
        this.J = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z3.class != obj.getClass()) {
            return false;
        }
        z3 z3Var = (z3) obj;
        return this.E.equals(z3Var.E) && this.F.equals(z3Var.F) && this.G.equals(z3Var.G) && this.H.equals(z3Var.H) && this.J.equals(z3Var.J) && p.h(this.K, z3Var.K) && p.h(this.I, z3Var.I) && p.h(this.L, z3Var.L);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L});
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        y yVar = (y) q3Var;
        yVar.n();
        yVar.r("id");
        yVar.x(a1Var, this.E);
        yVar.r("trace_id");
        yVar.x(a1Var, this.F);
        yVar.r("name");
        yVar.x(a1Var, this.G);
        yVar.r("relative_start_ns");
        yVar.x(a1Var, this.H);
        yVar.r("relative_end_ns");
        yVar.x(a1Var, this.I);
        yVar.r("relative_cpu_start_ms");
        yVar.x(a1Var, this.J);
        yVar.r("relative_cpu_end_ms");
        yVar.x(a1Var, this.K);
        ConcurrentHashMap concurrentHashMap = this.L;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                e.b(this.L, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
