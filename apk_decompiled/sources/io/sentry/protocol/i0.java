package io.sentry.protocol;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements m2 {
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;
    public l J;
    public ConcurrentHashMap K;
    public ConcurrentHashMap L;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i0.class == obj.getClass()) {
            i0 i0Var = (i0) obj;
            if (io.sentry.p.h(this.E, i0Var.E) && io.sentry.p.h(this.F, i0Var.F) && io.sentry.p.h(this.G, i0Var.G) && io.sentry.p.h(this.H, i0Var.H)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, this.F, this.G, this.H});
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        io.sentry.y yVar = (io.sentry.y) q3Var;
        yVar.n();
        if (this.E != null) {
            yVar.r("email");
            yVar.A(this.E);
        }
        if (this.F != null) {
            yVar.r("id");
            yVar.A(this.F);
        }
        if (this.G != null) {
            yVar.r("username");
            yVar.A(this.G);
        }
        if (this.H != null) {
            yVar.r("ip_address");
            yVar.A(this.H);
        }
        if (this.I != null) {
            yVar.r("name");
            yVar.A(this.I);
        }
        if (this.J != null) {
            yVar.r("geo");
            this.J.serialize(yVar, a1Var);
        }
        if (this.K != null) {
            yVar.r("data");
            yVar.x(a1Var, this.K);
        }
        ConcurrentHashMap concurrentHashMap = this.L;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.L, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
