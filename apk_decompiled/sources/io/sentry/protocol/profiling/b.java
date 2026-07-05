package io.sentry.protocol.profiling;

import io.sentry.a1;
import io.sentry.e;
import io.sentry.m2;
import io.sentry.q3;
import io.sentry.y;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements m2 {
    public double E;
    public int F;
    public String G;
    public HashMap H;

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        y yVar = (y) q3Var;
        yVar.n();
        yVar.r("timestamp");
        yVar.x(a1Var, BigDecimal.valueOf(this.E).setScale(6, RoundingMode.DOWN));
        yVar.r("stack_id");
        yVar.x(a1Var, Integer.valueOf(this.F));
        if (this.G != null) {
            yVar.r("thread_id");
            yVar.x(a1Var, this.G);
        }
        HashMap map = this.H;
        if (map != null) {
            for (String str : map.keySet()) {
                e.a(this.H, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
