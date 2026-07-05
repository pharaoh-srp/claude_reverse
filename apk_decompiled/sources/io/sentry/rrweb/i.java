package io.sentry.rrweb;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import io.sentry.y;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i extends e implements m2 {
    public int H;
    public List I;
    public HashMap J;
    public HashMap K;

    public i() {
        super(d.TouchMove);
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        y yVar = (y) q3Var;
        yVar.n();
        io.sentry.config.a.F(this, yVar, a1Var);
        yVar.r("data");
        yVar.n();
        io.sentry.config.a.G(this, yVar, a1Var);
        List list = this.I;
        if (list != null && !list.isEmpty()) {
            yVar.r("positions");
            yVar.x(a1Var, this.I);
        }
        yVar.r("pointerId");
        yVar.w(this.H);
        HashMap map = this.K;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.K, str, yVar, str, a1Var);
            }
        }
        yVar.p();
        HashMap map2 = this.J;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                io.sentry.e.a(this.J, str2, yVar, str2, a1Var);
            }
        }
        yVar.p();
    }
}
