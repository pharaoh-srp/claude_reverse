package io.sentry.protocol;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements m2 {
    public final String E;
    public final boolean F;
    public ConcurrentHashMap G;

    public i(String str, boolean z) {
        this.E = str;
        this.F = z;
    }

    public final String a() {
        return this.E;
    }

    public final Boolean b() {
        return Boolean.valueOf(this.F);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (io.sentry.p.h(this.E, iVar.E) && io.sentry.p.h(Boolean.valueOf(this.F), Boolean.valueOf(iVar.F))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, Boolean.valueOf(this.F)});
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) throws IOException {
        io.sentry.y yVar = (io.sentry.y) q3Var;
        yVar.n();
        yVar.r("flag");
        yVar.A(this.E);
        yVar.r("result");
        yVar.B(this.F);
        ConcurrentHashMap concurrentHashMap = this.G;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.G, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
