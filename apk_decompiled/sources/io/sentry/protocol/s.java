package io.sentry.protocol;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements m2 {
    public String E;
    public ConcurrentHashMap F;
    public Integer G;
    public Long H;
    public Object I;
    public ConcurrentHashMap J;

    public s(s sVar) {
        this.E = sVar.E;
        this.F = io.sentry.p.r(sVar.F);
        this.J = io.sentry.p.r(sVar.J);
        this.G = sVar.G;
        this.H = sVar.H;
        this.I = sVar.I;
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        io.sentry.y yVar = (io.sentry.y) q3Var;
        yVar.n();
        if (this.E != null) {
            yVar.r("cookies");
            yVar.A(this.E);
        }
        if (this.F != null) {
            yVar.r("headers");
            yVar.x(a1Var, this.F);
        }
        if (this.G != null) {
            yVar.r("status_code");
            yVar.x(a1Var, this.G);
        }
        if (this.H != null) {
            yVar.r("body_size");
            yVar.x(a1Var, this.H);
        }
        if (this.I != null) {
            yVar.r("data");
            yVar.x(a1Var, this.I);
        }
        ConcurrentHashMap concurrentHashMap = this.J;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.J, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
