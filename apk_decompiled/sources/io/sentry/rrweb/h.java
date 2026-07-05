package io.sentry.rrweb;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import io.sentry.y;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements m2 {
    public int E;
    public float F;
    public float G;
    public long H;
    public HashMap I;

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) throws IOException {
        y yVar = (y) q3Var;
        yVar.n();
        yVar.r("id");
        yVar.w(this.E);
        yVar.r("x");
        yVar.v(this.F);
        yVar.r("y");
        yVar.v(this.G);
        yVar.r("timeOffset");
        yVar.w(this.H);
        HashMap map = this.I;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.I, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
