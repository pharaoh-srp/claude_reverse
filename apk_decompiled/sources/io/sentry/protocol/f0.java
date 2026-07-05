package io.sentry.protocol;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements m2 {
    public String[] E;
    public ConcurrentHashMap F;

    public f0(f0 f0Var) {
        this.E = f0Var.E;
        this.F = io.sentry.p.r(f0Var.F);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f0.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.E, ((f0) obj).E);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.E);
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        io.sentry.y yVar = (io.sentry.y) q3Var;
        yVar.n();
        if (this.E != null) {
            yVar.r("active_profiles");
            yVar.x(a1Var, this.E);
        }
        ConcurrentHashMap concurrentHashMap = this.F;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.F, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
