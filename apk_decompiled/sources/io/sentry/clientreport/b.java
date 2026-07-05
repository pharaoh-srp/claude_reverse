package io.sentry.clientreport;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.p;
import io.sentry.q3;
import io.sentry.y;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b implements m2 {
    public final Date E;
    public final ArrayList F;
    public HashMap G;

    public b(Date date, ArrayList arrayList) {
        this.E = date;
        this.F = arrayList;
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        y yVar = (y) q3Var;
        yVar.n();
        yVar.r("timestamp");
        yVar.A(p.o(this.E));
        yVar.r("discarded_events");
        yVar.x(a1Var, this.F);
        HashMap map = this.G;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.G, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
