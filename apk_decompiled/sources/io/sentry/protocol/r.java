package io.sentry.protocol;

import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class r implements m2 {
    public String E;
    public String F;
    public String G;
    public Object H;
    public String I;
    public ConcurrentHashMap J;
    public ConcurrentHashMap K;
    public Long L;
    public ConcurrentHashMap M;
    public String N;
    public String O;
    public ConcurrentHashMap P;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return io.sentry.p.h(this.E, rVar.E) && io.sentry.p.h(this.F, rVar.F) && io.sentry.p.h(this.G, rVar.G) && io.sentry.p.h(this.I, rVar.I) && io.sentry.p.h(this.J, rVar.J) && io.sentry.p.h(this.K, rVar.K) && io.sentry.p.h(this.L, rVar.L) && io.sentry.p.h(this.N, rVar.N) && io.sentry.p.h(this.O, rVar.O);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, this.F, this.G, this.I, this.J, this.K, this.L, this.N, this.O});
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        io.sentry.y yVar = (io.sentry.y) q3Var;
        yVar.n();
        if (this.E != null) {
            yVar.r("url");
            yVar.A(this.E);
        }
        if (this.F != null) {
            yVar.r(VerifyMagicLinkRequest.Credentials.DISCRIMINATOR);
            yVar.A(this.F);
        }
        if (this.G != null) {
            yVar.r("query_string");
            yVar.A(this.G);
        }
        if (this.H != null) {
            yVar.r("data");
            yVar.x(a1Var, this.H);
        }
        if (this.I != null) {
            yVar.r("cookies");
            yVar.A(this.I);
        }
        if (this.J != null) {
            yVar.r("headers");
            yVar.x(a1Var, this.J);
        }
        if (this.K != null) {
            yVar.r("env");
            yVar.x(a1Var, this.K);
        }
        if (this.M != null) {
            yVar.r("other");
            yVar.x(a1Var, this.M);
        }
        if (this.N != null) {
            yVar.r("fragment");
            yVar.x(a1Var, this.N);
        }
        if (this.L != null) {
            yVar.r("body_size");
            yVar.x(a1Var, this.L);
        }
        if (this.O != null) {
            yVar.r("api_target");
            yVar.x(a1Var, this.O);
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
