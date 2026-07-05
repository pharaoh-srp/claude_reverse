package io.sentry.protocol;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class m implements m2 {
    public String E;
    public Integer F;
    public String G;
    public String H;
    public Integer I;
    public String J;
    public Boolean K;
    public String L;
    public String M;
    public ConcurrentHashMap N;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (io.sentry.p.h(this.E, mVar.E) && io.sentry.p.h(this.F, mVar.F) && io.sentry.p.h(this.G, mVar.G) && io.sentry.p.h(this.H, mVar.H) && io.sentry.p.h(this.I, mVar.I) && io.sentry.p.h(this.J, mVar.J) && io.sentry.p.h(this.K, mVar.K) && io.sentry.p.h(this.L, mVar.L) && io.sentry.p.h(this.M, mVar.M)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M});
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) throws IOException {
        io.sentry.y yVar = (io.sentry.y) q3Var;
        yVar.n();
        if (this.E != null) {
            yVar.r("name");
            yVar.A(this.E);
        }
        if (this.F != null) {
            yVar.r("id");
            yVar.z(this.F);
        }
        if (this.G != null) {
            yVar.r("vendor_id");
            yVar.A(this.G);
        }
        if (this.H != null) {
            yVar.r("vendor_name");
            yVar.A(this.H);
        }
        if (this.I != null) {
            yVar.r("memory_size");
            yVar.z(this.I);
        }
        if (this.J != null) {
            yVar.r("api_type");
            yVar.A(this.J);
        }
        if (this.K != null) {
            yVar.r("multi_threaded_rendering");
            yVar.y(this.K);
        }
        if (this.L != null) {
            yVar.r("version");
            yVar.A(this.L);
        }
        if (this.M != null) {
            yVar.r("npot_support");
            yVar.A(this.M);
        }
        ConcurrentHashMap concurrentHashMap = this.N;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.N, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
