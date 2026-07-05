package io.sentry.protocol;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements m2 {
    public Long E;
    public Double F;
    public Long G;
    public Double H;
    public Long I;
    public Double J;
    public Long K;
    public Long L;
    public Long M;
    public Long N;
    public Long O;
    public ConcurrentHashMap P;

    public c(c cVar) {
        this.E = cVar.E;
        this.F = cVar.F;
        this.G = cVar.G;
        this.H = cVar.H;
        this.I = cVar.I;
        this.J = cVar.J;
        this.K = cVar.K;
        this.L = cVar.L;
        this.M = cVar.M;
        this.N = cVar.N;
        this.O = cVar.O;
        this.P = io.sentry.p.r(cVar.P);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (io.sentry.p.h(this.E, cVar.E) && io.sentry.p.h(this.F, cVar.F) && io.sentry.p.h(this.G, cVar.G) && io.sentry.p.h(this.H, cVar.H) && io.sentry.p.h(this.I, cVar.I) && io.sentry.p.h(this.J, cVar.J) && io.sentry.p.h(this.K, cVar.K) && io.sentry.p.h(this.L, cVar.L) && io.sentry.p.h(this.M, cVar.M) && io.sentry.p.h(this.N, cVar.N) && io.sentry.p.h(this.O, cVar.O)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O});
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) throws IOException {
        io.sentry.y yVar = (io.sentry.y) q3Var;
        yVar.n();
        if (this.E != null) {
            yVar.r("gc.total_count");
            yVar.z(this.E);
        }
        if (this.F != null) {
            yVar.r("gc.total_time");
            yVar.z(this.F);
        }
        if (this.G != null) {
            yVar.r("gc.blocking_count");
            yVar.z(this.G);
        }
        if (this.H != null) {
            yVar.r("gc.blocking_time");
            yVar.z(this.H);
        }
        if (this.I != null) {
            yVar.r("gc.pre_oome_count");
            yVar.z(this.I);
        }
        if (this.J != null) {
            yVar.r("gc.waiting_time");
            yVar.z(this.J);
        }
        if (this.K != null) {
            yVar.r("memory.free");
            yVar.z(this.K);
        }
        if (this.L != null) {
            yVar.r("memory.free_until_gc");
            yVar.z(this.L);
        }
        if (this.M != null) {
            yVar.r("memory.free_until_oome");
            yVar.z(this.M);
        }
        if (this.N != null) {
            yVar.r("memory.total");
            yVar.z(this.N);
        }
        if (this.O != null) {
            yVar.r("memory.max");
            yVar.z(this.O);
        }
        ConcurrentHashMap concurrentHashMap = this.P;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.P, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
