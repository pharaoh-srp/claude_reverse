package io.sentry;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class w5 implements m2 {
    public io.sentry.protocol.w E;
    public m7 F;
    public Double G;
    public String H;
    public z5 I;
    public Integer J;
    public Map K;
    public HashMap L;

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        y yVar = (y) q3Var;
        yVar.n();
        yVar.r("timestamp");
        yVar.x(a1Var, p.f(this.G));
        yVar.r("trace_id");
        yVar.x(a1Var, this.E);
        if (this.F != null) {
            yVar.r("span_id");
            yVar.x(a1Var, this.F);
        }
        yVar.r("body");
        yVar.A(this.H);
        yVar.r("level");
        yVar.x(a1Var, this.I);
        if (this.J != null) {
            yVar.r("severity_number");
            yVar.x(a1Var, this.J);
        }
        if (this.K != null) {
            yVar.r("attributes");
            yVar.x(a1Var, this.K);
        }
        HashMap map = this.L;
        if (map != null) {
            for (String str : map.keySet()) {
                e.a(this.L, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
