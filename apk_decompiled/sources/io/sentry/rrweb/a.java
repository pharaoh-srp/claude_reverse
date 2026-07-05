package io.sentry.rrweb;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import io.sentry.t5;
import io.sentry.y;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b implements m2 {
    public String G;
    public double H;
    public String I;
    public String J;
    public String K;
    public t5 L;
    public ConcurrentHashMap M;
    public HashMap N;
    public ConcurrentHashMap O;
    public ConcurrentHashMap P;

    public a() {
        super(c.Custom);
        this.G = "breadcrumb";
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        y yVar = (y) q3Var;
        yVar.n();
        io.sentry.config.a.F(this, yVar, a1Var);
        yVar.r("data");
        yVar.n();
        yVar.r("tag");
        yVar.A(this.G);
        yVar.r("payload");
        yVar.n();
        if (this.I != null) {
            yVar.r("type");
            yVar.A(this.I);
        }
        yVar.r("timestamp");
        yVar.x(a1Var, BigDecimal.valueOf(this.H));
        if (this.J != null) {
            yVar.r("category");
            yVar.A(this.J);
        }
        if (this.K != null) {
            yVar.r("message");
            yVar.A(this.K);
        }
        if (this.L != null) {
            yVar.r("level");
            yVar.x(a1Var, this.L);
        }
        if (this.M != null) {
            yVar.r("data");
            yVar.x(a1Var, this.M);
        }
        ConcurrentHashMap concurrentHashMap = this.O;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.O, str, yVar, str, a1Var);
            }
        }
        yVar.p();
        ConcurrentHashMap concurrentHashMap2 = this.P;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                io.sentry.e.b(this.P, str2, yVar, str2, a1Var);
            }
        }
        yVar.p();
        HashMap map = this.N;
        if (map != null) {
            for (String str3 : map.keySet()) {
                io.sentry.e.a(this.N, str3, yVar, str3, a1Var);
            }
        }
        yVar.p();
    }
}
