package io.sentry;

import com.anthropic.claude.api.experience.ExperienceToggle;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class x5 implements m2 {
    public String E;
    public Object F;
    public HashMap G;

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        y yVar = (y) q3Var;
        yVar.n();
        yVar.r("type");
        yVar.x(a1Var, this.E);
        yVar.r(ExperienceToggle.DEFAULT_PARAM_KEY);
        yVar.x(a1Var, this.F);
        HashMap map = this.G;
        if (map != null) {
            for (String str : map.keySet()) {
                e.a(this.G, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
