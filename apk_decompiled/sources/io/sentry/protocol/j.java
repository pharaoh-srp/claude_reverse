package io.sentry.protocol;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements m2 {
    public final List E;
    public ConcurrentHashMap F;

    public j(List list) {
        this.E = list;
    }

    public final List a() {
        return this.E;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        return io.sentry.p.h(this.E, ((j) obj).E);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E});
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        io.sentry.y yVar = (io.sentry.y) q3Var;
        yVar.n();
        yVar.r("values");
        yVar.x(a1Var, this.E);
        ConcurrentHashMap concurrentHashMap = this.F;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.F, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
