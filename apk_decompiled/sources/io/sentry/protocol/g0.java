package io.sentry.protocol;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements m2 {
    public final String E;
    public ConcurrentHashMap F;

    public g0(String str) {
        this.E = str;
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        io.sentry.y yVar = (io.sentry.y) q3Var;
        yVar.n();
        String str = this.E;
        if (str != null) {
            yVar.r("source");
            yVar.x(a1Var, str);
        }
        ConcurrentHashMap concurrentHashMap = this.F;
        if (concurrentHashMap != null) {
            for (String str2 : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.F, str2, yVar, str2, a1Var);
            }
        }
        yVar.p();
    }
}
