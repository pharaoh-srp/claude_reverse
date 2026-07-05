package io.sentry.protocol;

import com.anthropic.claude.api.experience.ExperienceToggle;
import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class v implements m2 {
    public String E;
    public String F;
    public String G;
    public Long H;
    public c0 I;
    public o J;
    public HashMap K;

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) throws IOException {
        io.sentry.y yVar = (io.sentry.y) q3Var;
        yVar.n();
        if (this.E != null) {
            yVar.r("type");
            yVar.A(this.E);
        }
        if (this.F != null) {
            yVar.r(ExperienceToggle.DEFAULT_PARAM_KEY);
            yVar.A(this.F);
        }
        if (this.G != null) {
            yVar.r("module");
            yVar.A(this.G);
        }
        if (this.H != null) {
            yVar.r("thread_id");
            yVar.z(this.H);
        }
        if (this.I != null) {
            yVar.r("stacktrace");
            yVar.x(a1Var, this.I);
        }
        if (this.J != null) {
            yVar.r("mechanism");
            yVar.x(a1Var, this.J);
        }
        HashMap map = this.K;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.K, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
