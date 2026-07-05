package io.sentry;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class j7 implements m2 {
    public final io.sentry.protocol.w E;
    public final m7 F;
    public final m7 G;
    public transient r7 H;
    public final String I;
    public String J;
    public n7 K;
    public ConcurrentHashMap L;
    public String M;
    public Map N;
    public ConcurrentHashMap O;
    public w1 P;
    public c Q;
    public final y R;
    public final io.sentry.protocol.w S;

    public j7(io.sentry.protocol.w wVar, m7 m7Var, m7 m7Var2, String str, String str2, r7 r7Var, n7 n7Var, String str3) {
        this.L = new ConcurrentHashMap();
        this.M = "manual";
        this.N = new ConcurrentHashMap();
        this.P = w1.SENTRY;
        this.R = new y();
        this.S = io.sentry.protocol.w.F;
        p.v("traceId is required", wVar);
        this.E = wVar;
        p.v("spanId is required", m7Var);
        this.F = m7Var;
        p.v("operation is required", str);
        this.I = str;
        this.G = m7Var2;
        this.J = str2;
        this.K = n7Var;
        this.M = str3;
        a(r7Var);
        io.sentry.util.thread.a threadChecker = t4.g().r().getThreadChecker();
        this.N.put("thread.id", String.valueOf(threadChecker.b()));
        this.N.put("thread.name", threadChecker.a());
    }

    public final void a(r7 r7Var) {
        this.H = r7Var;
        c cVar = this.Q;
        if (cVar == null || r7Var == null) {
            return;
        }
        Boolean bool = r7Var.a;
        Charset charset = io.sentry.util.o.a;
        cVar.c("sentry-sampled", bool == null ? null : bool.toString());
        Double d = r7Var.c;
        if (d != null && cVar.f) {
            cVar.d = d;
        }
        Double d2 = r7Var.b;
        if (d2 != null) {
            cVar.c = d2;
        }
    }

    public final void b(String str, String str2) {
        ConcurrentHashMap concurrentHashMap = this.L;
        if (str2 == null) {
            concurrentHashMap.remove(str);
        } else {
            concurrentHashMap.put(str, str2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7)) {
            return false;
        }
        j7 j7Var = (j7) obj;
        return this.E.equals(j7Var.E) && this.F.equals(j7Var.F) && p.h(this.G, j7Var.G) && this.I.equals(j7Var.I) && p.h(this.J, j7Var.J) && this.K == j7Var.K;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, this.F, this.G, this.I, this.J, this.K});
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        y yVar = (y) q3Var;
        yVar.n();
        yVar.r("trace_id");
        this.E.serialize(yVar, a1Var);
        yVar.r("span_id");
        this.F.serialize(yVar, a1Var);
        m7 m7Var = this.G;
        if (m7Var != null) {
            yVar.r("parent_span_id");
            m7Var.serialize(yVar, a1Var);
        }
        yVar.r("op");
        yVar.A(this.I);
        if (this.J != null) {
            yVar.r("description");
            yVar.A(this.J);
        }
        if (this.K != null) {
            yVar.r("status");
            yVar.x(a1Var, this.K);
        }
        if (this.M != null) {
            yVar.r("origin");
            yVar.x(a1Var, this.M);
        }
        if (!this.L.isEmpty()) {
            yVar.r("tags");
            yVar.x(a1Var, this.L);
        }
        if (!this.N.isEmpty()) {
            yVar.r("data");
            yVar.x(a1Var, this.N);
        }
        ConcurrentHashMap concurrentHashMap = this.O;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                e.b(this.O, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }

    public j7(io.sentry.protocol.w wVar, m7 m7Var, String str, m7 m7Var2) {
        this(wVar, m7Var, m7Var2, str, null, null, null, "manual");
    }

    public j7(j7 j7Var) {
        this.L = new ConcurrentHashMap();
        this.M = "manual";
        this.N = new ConcurrentHashMap();
        this.P = w1.SENTRY;
        this.R = new y();
        this.S = io.sentry.protocol.w.F;
        this.E = j7Var.E;
        this.F = j7Var.F;
        this.G = j7Var.G;
        a(j7Var.H);
        this.I = j7Var.I;
        this.J = j7Var.J;
        this.K = j7Var.K;
        ConcurrentHashMap concurrentHashMapR = p.r(j7Var.L);
        if (concurrentHashMapR != null) {
            this.L = concurrentHashMapR;
        }
        ConcurrentHashMap concurrentHashMapR2 = p.r(j7Var.O);
        if (concurrentHashMapR2 != null) {
            this.O = concurrentHashMapR2;
        }
        this.Q = j7Var.Q;
        ConcurrentHashMap concurrentHashMapR3 = p.r(j7Var.N);
        if (concurrentHashMapR3 != null) {
            this.N = concurrentHashMapR3;
        }
    }
}
