package io.sentry.rrweb;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import io.sentry.y;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends b implements m2 {
    public String G;
    public HashMap H;

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        y yVar = (y) q3Var;
        yVar.n();
        yVar.r("type");
        yVar.x(a1Var, this.E);
        yVar.r("timestamp");
        yVar.w(this.F);
        yVar.r("data");
        yVar.n();
        yVar.r("tag");
        yVar.A(this.G);
        yVar.r("payload");
        yVar.n();
        HashMap map = this.H;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                yVar.r(str);
                yVar.x(a1Var, obj);
            }
        }
        yVar.p();
        yVar.p();
        yVar.p();
    }
}
