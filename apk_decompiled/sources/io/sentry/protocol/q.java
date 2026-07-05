package io.sentry.protocol;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class q implements m2 {
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;
    public Boolean J;
    public ConcurrentHashMap K;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (io.sentry.p.h(this.E, qVar.E) && io.sentry.p.h(this.F, qVar.F) && io.sentry.p.h(this.G, qVar.G) && io.sentry.p.h(this.H, qVar.H) && io.sentry.p.h(this.I, qVar.I) && io.sentry.p.h(this.J, qVar.J)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, this.F, this.G, this.H, this.I, this.J});
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
            yVar.r("version");
            yVar.A(this.F);
        }
        if (this.G != null) {
            yVar.r("raw_description");
            yVar.A(this.G);
        }
        if (this.H != null) {
            yVar.r("build");
            yVar.A(this.H);
        }
        if (this.I != null) {
            yVar.r("kernel_version");
            yVar.A(this.I);
        }
        if (this.J != null) {
            yVar.r("rooted");
            yVar.y(this.J);
        }
        ConcurrentHashMap concurrentHashMap = this.K;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.K, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
