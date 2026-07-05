package io.sentry;

import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class w3 implements m2 {
    public io.sentry.protocol.w E;
    public ConcurrentHashMap F;

    public w3(io.sentry.protocol.w wVar) {
        this.E = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w3) {
            return this.E.equals(((w3) obj).E);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E});
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        y yVar = (y) q3Var;
        yVar.n();
        yVar.r("profiler_id");
        yVar.x(a1Var, this.E);
        ConcurrentHashMap concurrentHashMap = this.F;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                e.b(this.F, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
