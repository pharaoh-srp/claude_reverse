package io.sentry.protocol;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k0 implements m2 {
    public final String E;
    public final List F;
    public HashMap G;

    public k0(String str, List list) {
        this.E = str;
        this.F = list;
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        io.sentry.y yVar = (io.sentry.y) q3Var;
        yVar.n();
        String str = this.E;
        if (str != null) {
            yVar.r("rendering_system");
            yVar.A(str);
        }
        List list = this.F;
        if (list != null) {
            yVar.r("windows");
            yVar.x(a1Var, list);
        }
        HashMap map = this.G;
        if (map != null) {
            for (String str2 : map.keySet()) {
                io.sentry.e.a(this.G, str2, yVar, str2, a1Var);
            }
        }
        yVar.p();
    }
}
