package io.sentry.protocol;

import com.anthropic.claude.api.experience.ExperienceToggle;
import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class n implements m2 {
    public final Number E;
    public final String F;
    public ConcurrentHashMap G;

    public n(Number number, String str) {
        this.E = number;
        this.F = str;
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) throws IOException {
        io.sentry.y yVar = (io.sentry.y) q3Var;
        yVar.n();
        yVar.r(ExperienceToggle.DEFAULT_PARAM_KEY);
        yVar.z(this.E);
        String str = this.F;
        if (str != null) {
            yVar.r("unit");
            yVar.A(str);
        }
        ConcurrentHashMap concurrentHashMap = this.G;
        if (concurrentHashMap != null) {
            for (String str2 : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.G, str2, yVar, str2, a1Var);
            }
        }
        yVar.p();
    }
}
