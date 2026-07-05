package io.sentry.protocol;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements m2 {
    public List E;
    public AbstractMap F;
    public Boolean G;
    public b0 H;
    public ConcurrentHashMap I;

    public c0(List list) {
        this.E = list;
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) throws IOException {
        io.sentry.y yVar = (io.sentry.y) q3Var;
        yVar.n();
        if (this.E != null) {
            yVar.r("frames");
            yVar.x(a1Var, this.E);
        }
        if (this.F != null) {
            yVar.r("registers");
            yVar.x(a1Var, this.F);
        }
        if (this.G != null) {
            yVar.r("snapshot");
            yVar.y(this.G);
        }
        if (this.H != null) {
            yVar.r("instruction_addr_adjustment");
            yVar.x(a1Var, this.H);
        }
        ConcurrentHashMap concurrentHashMap = this.I;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.I, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
