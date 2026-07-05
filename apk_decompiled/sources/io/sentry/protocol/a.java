package io.sentry.protocol;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a implements m2 {
    public String E;
    public Date F;
    public String G;
    public String H;
    public String I;
    public String J;
    public String K;
    public AbstractMap L;
    public List M;
    public String N;
    public Boolean O;
    public Boolean P;
    public List Q;
    public ConcurrentHashMap R;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return io.sentry.p.h(this.E, aVar.E) && io.sentry.p.h(this.F, aVar.F) && io.sentry.p.h(this.G, aVar.G) && io.sentry.p.h(this.H, aVar.H) && io.sentry.p.h(this.I, aVar.I) && io.sentry.p.h(this.J, aVar.J) && io.sentry.p.h(this.K, aVar.K) && io.sentry.p.h(this.L, aVar.L) && io.sentry.p.h(this.O, aVar.O) && io.sentry.p.h(this.M, aVar.M) && io.sentry.p.h(this.N, aVar.N) && io.sentry.p.h(this.P, aVar.P) && io.sentry.p.h(this.Q, aVar.Q);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.O, this.M, this.N, this.P, this.Q});
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) throws IOException {
        io.sentry.y yVar = (io.sentry.y) q3Var;
        yVar.n();
        if (this.E != null) {
            yVar.r("app_identifier");
            yVar.A(this.E);
        }
        if (this.F != null) {
            yVar.r("app_start_time");
            yVar.x(a1Var, this.F);
        }
        if (this.G != null) {
            yVar.r("device_app_hash");
            yVar.A(this.G);
        }
        if (this.H != null) {
            yVar.r("build_type");
            yVar.A(this.H);
        }
        if (this.I != null) {
            yVar.r("app_name");
            yVar.A(this.I);
        }
        if (this.J != null) {
            yVar.r("app_version");
            yVar.A(this.J);
        }
        if (this.K != null) {
            yVar.r("app_build");
            yVar.A(this.K);
        }
        AbstractMap abstractMap = this.L;
        if (abstractMap != null && !abstractMap.isEmpty()) {
            yVar.r("permissions");
            yVar.x(a1Var, this.L);
        }
        if (this.O != null) {
            yVar.r("in_foreground");
            yVar.y(this.O);
        }
        if (this.M != null) {
            yVar.r("view_names");
            yVar.x(a1Var, this.M);
        }
        if (this.N != null) {
            yVar.r("start_type");
            yVar.A(this.N);
        }
        if (this.P != null) {
            yVar.r("is_split_apks");
            yVar.y(this.P);
        }
        List list = this.Q;
        if (list != null && !list.isEmpty()) {
            yVar.r("split_names");
            yVar.x(a1Var, this.Q);
        }
        ConcurrentHashMap concurrentHashMap = this.R;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.R, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
