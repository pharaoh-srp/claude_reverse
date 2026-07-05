package io.sentry.clientreport;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import io.sentry.y;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements m2 {
    public final String E;
    public final String F;
    public final Long G;
    public HashMap H;

    public f(String str, String str2, Long l) {
        this.E = str;
        this.F = str2;
        this.G = l;
    }

    public final String a() {
        return this.F;
    }

    public final Long b() {
        return this.G;
    }

    public final String c() {
        return this.E;
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) throws IOException {
        y yVar = (y) q3Var;
        yVar.n();
        yVar.r("reason");
        yVar.A(this.E);
        yVar.r("category");
        yVar.A(this.F);
        yVar.r("quantity");
        yVar.z(this.G);
        HashMap map = this.H;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.H, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }

    public final String toString() {
        return "DiscardedEvent{reason='" + this.E + "', category='" + this.F + "', quantity=" + this.G + '}';
    }
}
