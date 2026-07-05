package io.sentry;

import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c5 implements m2 {
    public final io.sentry.protocol.w E;
    public final io.sentry.protocol.u F;
    public final p7 G;
    public Date H;
    public HashMap I;

    public c5(io.sentry.protocol.w wVar, io.sentry.protocol.u uVar, p7 p7Var) {
        this.E = wVar;
        this.F = uVar;
        this.G = p7Var;
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        y yVar = (y) q3Var;
        yVar.n();
        io.sentry.protocol.w wVar = this.E;
        if (wVar != null) {
            yVar.r("event_id");
            yVar.x(a1Var, wVar);
        }
        io.sentry.protocol.u uVar = this.F;
        if (uVar != null) {
            yVar.r("sdk");
            yVar.x(a1Var, uVar);
        }
        p7 p7Var = this.G;
        if (p7Var != null) {
            yVar.r("trace");
            yVar.x(a1Var, p7Var);
        }
        if (this.H != null) {
            yVar.r("sent_at");
            yVar.x(a1Var, p.o(this.H));
        }
        HashMap map = this.I;
        if (map != null) {
            for (String str : map.keySet()) {
                e.a(this.I, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
