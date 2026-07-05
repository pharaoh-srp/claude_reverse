package io.sentry.protocol.profiling;

import io.sentry.a1;
import io.sentry.e;
import io.sentry.m2;
import io.sentry.q3;
import io.sentry.y;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements m2 {
    public String E;
    public int F;
    public HashMap G;

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        y yVar = (y) q3Var;
        yVar.n();
        if (this.E != null) {
            yVar.r("name");
            yVar.x(a1Var, this.E);
        }
        yVar.r("priority");
        yVar.x(a1Var, Integer.valueOf(this.F));
        HashMap map = this.G;
        if (map != null) {
            for (String str : map.keySet()) {
                e.a(this.G, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
