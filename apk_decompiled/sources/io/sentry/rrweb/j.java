package io.sentry.rrweb;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.p;
import io.sentry.q3;
import io.sentry.y;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class j extends b implements m2 {
    public String G;
    public int H;
    public int I;
    public HashMap J;

    public j() {
        super(c.Meta);
        this.G = "";
    }

    @Override // io.sentry.rrweb.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        j jVar = (j) obj;
        return this.H == jVar.H && this.I == jVar.I && p.h(this.G, jVar.G);
    }

    @Override // io.sentry.rrweb.b
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.G, Integer.valueOf(this.H), Integer.valueOf(this.I)});
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        y yVar = (y) q3Var;
        yVar.n();
        io.sentry.config.a.F(this, yVar, a1Var);
        yVar.r("data");
        yVar.n();
        yVar.r("href");
        yVar.A(this.G);
        yVar.r("height");
        yVar.w(this.H);
        yVar.r("width");
        yVar.w(this.I);
        HashMap map = this.J;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.J, str, yVar, str, a1Var);
            }
        }
        yVar.p();
        yVar.p();
    }
}
