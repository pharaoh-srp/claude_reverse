package io.sentry.protocol;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class d implements m2 {
    public String E;
    public String F;
    public ConcurrentHashMap G;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (io.sentry.p.h(this.E, dVar.E) && io.sentry.p.h(this.F, dVar.F)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, this.F});
    }

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
        ConcurrentHashMap concurrentHashMap = this.G;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.G, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
