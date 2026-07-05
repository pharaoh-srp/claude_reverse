package io.sentry;

import com.anthropic.claude.api.experience.ExperienceToggle;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class b6 implements m2 {
    public io.sentry.protocol.w E;
    public m7 F;
    public Double G;
    public String H;
    public String I;
    public String J;
    public Double K;
    public Map L;
    public HashMap M;

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) throws IOException {
        y yVar = (y) q3Var;
        yVar.n();
        yVar.r("timestamp");
        yVar.x(a1Var, p.f(this.G));
        yVar.r("type");
        yVar.A(this.J);
        yVar.r("name");
        yVar.A(this.H);
        yVar.r(ExperienceToggle.DEFAULT_PARAM_KEY);
        yVar.z(this.K);
        yVar.r("trace_id");
        yVar.x(a1Var, this.E);
        if (this.F != null) {
            yVar.r("span_id");
            yVar.x(a1Var, this.F);
        }
        if (this.I != null) {
            yVar.r("unit");
            yVar.x(a1Var, this.I);
        }
        if (this.L != null) {
            yVar.r("attributes");
            yVar.x(a1Var, this.L);
        }
        HashMap map = this.M;
        if (map != null) {
            for (String str : map.keySet()) {
                e.a(this.M, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
