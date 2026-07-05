package io.sentry.protocol;

import io.sentry.a1;
import io.sentry.i7;
import io.sentry.j7;
import io.sentry.m2;
import io.sentry.m7;
import io.sentry.n7;
import io.sentry.q3;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class z implements m2 {
    public final Double E;
    public final Double F;
    public final w G;
    public final m7 H;
    public final m7 I;
    public final String J;
    public final String K;
    public final n7 L;
    public final String M;
    public final Map N;
    public Map O;
    public final Map P;
    public ConcurrentHashMap Q;

    public z(i7 i7Var) {
        ConcurrentHashMap concurrentHashMap = i7Var.k;
        j7 j7Var = i7Var.c;
        this.K = j7Var.J;
        this.J = j7Var.I;
        this.H = j7Var.F;
        this.I = j7Var.G;
        this.G = j7Var.E;
        this.L = j7Var.K;
        this.M = j7Var.M;
        ConcurrentHashMap concurrentHashMapR = io.sentry.p.r(j7Var.L);
        this.N = concurrentHashMapR == null ? new ConcurrentHashMap() : concurrentHashMapR;
        ConcurrentHashMap concurrentHashMapR2 = io.sentry.p.r(i7Var.l);
        this.P = concurrentHashMapR2 == null ? new ConcurrentHashMap() : concurrentHashMapR2;
        this.F = i7Var.b == null ? null : Double.valueOf(i7Var.a.c(r2) / 1.0E9d);
        this.E = Double.valueOf(i7Var.a.d() / 1.0E9d);
        this.O = concurrentHashMap;
        j jVarK = j7Var.R.k();
        if (jVarK != null) {
            if (this.O == null) {
                this.O = new HashMap();
            }
            for (i iVar : jVarK.a()) {
                this.O.put("flag.evaluation." + iVar.a(), iVar.b());
            }
        }
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        io.sentry.y yVar = (io.sentry.y) q3Var;
        yVar.n();
        yVar.r("start_timestamp");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.E.doubleValue());
        RoundingMode roundingMode = RoundingMode.DOWN;
        yVar.x(a1Var, bigDecimalValueOf.setScale(6, roundingMode));
        Double d = this.F;
        if (d != null) {
            yVar.r("timestamp");
            yVar.x(a1Var, BigDecimal.valueOf(d.doubleValue()).setScale(6, roundingMode));
        }
        yVar.r("trace_id");
        yVar.x(a1Var, this.G);
        yVar.r("span_id");
        yVar.x(a1Var, this.H);
        m7 m7Var = this.I;
        if (m7Var != null) {
            yVar.r("parent_span_id");
            yVar.x(a1Var, m7Var);
        }
        yVar.r("op");
        yVar.A(this.J);
        String str = this.K;
        if (str != null) {
            yVar.r("description");
            yVar.A(str);
        }
        n7 n7Var = this.L;
        if (n7Var != null) {
            yVar.r("status");
            yVar.x(a1Var, n7Var);
        }
        String str2 = this.M;
        if (str2 != null) {
            yVar.r("origin");
            yVar.x(a1Var, str2);
        }
        Map map = this.N;
        if (!map.isEmpty()) {
            yVar.r("tags");
            yVar.x(a1Var, map);
        }
        if (this.O != null) {
            yVar.r("data");
            yVar.x(a1Var, this.O);
        }
        Map map2 = this.P;
        if (!map2.isEmpty()) {
            yVar.r("measurements");
            yVar.x(a1Var, map2);
        }
        ConcurrentHashMap concurrentHashMap = this.Q;
        if (concurrentHashMap != null) {
            for (String str3 : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.Q, str3, yVar, str3, a1Var);
            }
        }
        yVar.p();
    }

    public z(Double d, Double d2, w wVar, m7 m7Var, m7 m7Var2, String str, String str2, n7 n7Var, String str3, Map map, Map map2, Map map3) {
        this.E = d;
        this.F = d2;
        this.G = wVar;
        this.H = m7Var;
        this.I = m7Var2;
        this.J = str;
        this.K = str2;
        this.L = n7Var;
        this.M = str3;
        this.N = map;
        this.P = map2;
        this.O = map3;
    }
}
