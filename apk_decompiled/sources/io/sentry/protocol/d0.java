package io.sentry.protocol;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements m2 {
    public Long E;
    public Integer F;
    public String G;
    public String H;
    public Boolean I;
    public Boolean J;
    public Boolean K;
    public Boolean L;
    public c0 M;
    public Map N;
    public ConcurrentHashMap O;

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) throws IOException {
        io.sentry.y yVar = (io.sentry.y) q3Var;
        yVar.n();
        if (this.E != null) {
            yVar.r("id");
            yVar.z(this.E);
        }
        if (this.F != null) {
            yVar.r("priority");
            yVar.z(this.F);
        }
        if (this.G != null) {
            yVar.r("name");
            yVar.A(this.G);
        }
        if (this.H != null) {
            yVar.r("state");
            yVar.A(this.H);
        }
        if (this.I != null) {
            yVar.r("crashed");
            yVar.y(this.I);
        }
        if (this.J != null) {
            yVar.r("current");
            yVar.y(this.J);
        }
        if (this.K != null) {
            yVar.r("daemon");
            yVar.y(this.K);
        }
        if (this.L != null) {
            yVar.r("main");
            yVar.y(this.L);
        }
        if (this.M != null) {
            yVar.r("stacktrace");
            yVar.x(a1Var, this.M);
        }
        if (this.N != null) {
            yVar.r("held_locks");
            yVar.x(a1Var, this.N);
        }
        ConcurrentHashMap concurrentHashMap = this.O;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.O, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
