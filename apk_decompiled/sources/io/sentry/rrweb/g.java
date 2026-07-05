package io.sentry.rrweb;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import io.sentry.y;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g extends e implements m2 {
    public f H;
    public int I;
    public float J;
    public float K;
    public int L;
    public int M;
    public HashMap N;
    public HashMap O;

    public g() {
        super(d.MouseInteraction);
        this.L = 2;
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) throws IOException {
        y yVar = (y) q3Var;
        yVar.n();
        io.sentry.config.a.F(this, yVar, a1Var);
        yVar.r("data");
        yVar.n();
        io.sentry.config.a.G(this, yVar, a1Var);
        yVar.r("type");
        yVar.x(a1Var, this.H);
        yVar.r("id");
        yVar.w(this.I);
        yVar.r("x");
        yVar.v(this.J);
        yVar.r("y");
        yVar.v(this.K);
        yVar.r("pointerType");
        yVar.w(this.L);
        yVar.r("pointerId");
        yVar.w(this.M);
        HashMap map = this.O;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.O, str, yVar, str, a1Var);
            }
        }
        yVar.p();
        HashMap map2 = this.N;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                io.sentry.e.a(this.N, str2, yVar, str2, a1Var);
            }
        }
        yVar.p();
    }
}
