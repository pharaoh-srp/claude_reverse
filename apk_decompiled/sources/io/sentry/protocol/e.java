package io.sentry.protocol;

import io.sentry.a1;
import io.sentry.j7;
import io.sentry.m2;
import io.sentry.q3;
import io.sentry.w3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class e implements m2 {
    public final ConcurrentHashMap E = new ConcurrentHashMap();
    public final io.sentry.util.a F = new io.sentry.util.a();

    public e(e eVar) {
        for (Map.Entry entry : eVar.b()) {
            if (entry != null) {
                Object value = entry.getValue();
                if ("app".equals(entry.getKey()) && (value instanceof a)) {
                    a aVar = (a) value;
                    a aVar2 = new a();
                    aVar2.K = aVar.K;
                    aVar2.E = aVar.E;
                    aVar2.I = aVar.I;
                    aVar2.F = aVar.F;
                    aVar2.J = aVar.J;
                    aVar2.H = aVar.H;
                    aVar2.G = aVar.G;
                    aVar2.L = io.sentry.p.r(aVar.L);
                    aVar2.O = aVar.O;
                    List list = aVar.M;
                    aVar2.M = list != null ? new ArrayList(list) : null;
                    aVar2.N = aVar.N;
                    aVar2.P = aVar.P;
                    aVar2.Q = aVar.Q;
                    aVar2.R = io.sentry.p.r(aVar.R);
                    m(aVar2);
                } else if ("browser".equals(entry.getKey()) && (value instanceof d)) {
                    d dVar = (d) value;
                    d dVar2 = new d();
                    dVar2.E = dVar.E;
                    dVar2.F = dVar.F;
                    dVar2.G = io.sentry.p.r(dVar.G);
                    n(dVar2);
                } else if ("device".equals(entry.getKey()) && (value instanceof h)) {
                    h hVar = (h) value;
                    h hVar2 = new h();
                    hVar2.E = hVar.E;
                    hVar2.F = hVar.F;
                    hVar2.G = hVar.G;
                    hVar2.H = hVar.H;
                    hVar2.I = hVar.I;
                    hVar2.J = hVar.J;
                    hVar2.M = hVar.M;
                    hVar2.N = hVar.N;
                    hVar2.O = hVar.O;
                    hVar2.P = hVar.P;
                    hVar2.Q = hVar.Q;
                    hVar2.R = hVar.R;
                    hVar2.S = hVar.S;
                    hVar2.T = hVar.T;
                    hVar2.U = hVar.U;
                    hVar2.V = hVar.V;
                    hVar2.W = hVar.W;
                    hVar2.X = hVar.X;
                    hVar2.Y = hVar.Y;
                    hVar2.Z = hVar.Z;
                    hVar2.a0 = hVar.a0;
                    hVar2.b0 = hVar.b0;
                    hVar2.c0 = hVar.c0;
                    hVar2.e0 = hVar.e0;
                    hVar2.g0 = hVar.g0;
                    hVar2.h0 = hVar.h0;
                    hVar2.L = hVar.L;
                    String[] strArr = hVar.K;
                    hVar2.K = strArr != null ? (String[]) strArr.clone() : null;
                    hVar2.f0 = hVar.f0;
                    TimeZone timeZone = hVar.d0;
                    hVar2.d0 = timeZone != null ? (TimeZone) timeZone.clone() : null;
                    hVar2.i0 = hVar.i0;
                    hVar2.j0 = hVar.j0;
                    hVar2.k0 = hVar.k0;
                    hVar2.l0 = hVar.l0;
                    hVar2.m0 = io.sentry.p.r(hVar.m0);
                    o(hVar2);
                } else if ("os".equals(entry.getKey()) && (value instanceof q)) {
                    q qVar = (q) value;
                    q qVar2 = new q();
                    qVar2.E = qVar.E;
                    qVar2.F = qVar.F;
                    qVar2.G = qVar.G;
                    qVar2.H = qVar.H;
                    qVar2.I = qVar.I;
                    qVar2.J = qVar.J;
                    qVar2.K = io.sentry.p.r(qVar.K);
                    r(qVar2);
                } else if ("runtime".equals(entry.getKey()) && (value instanceof y)) {
                    y yVar = (y) value;
                    y yVar2 = new y();
                    yVar2.E = yVar.E;
                    yVar2.F = yVar.F;
                    yVar2.G = yVar.G;
                    yVar2.H = io.sentry.p.r(yVar.H);
                    t(yVar2);
                } else if ("feedback".equals(entry.getKey()) && (value instanceof k)) {
                    k kVar = (k) value;
                    k kVar2 = new k();
                    kVar2.E = kVar.E;
                    kVar2.F = kVar.F;
                    kVar2.G = kVar.G;
                    kVar2.H = kVar.H;
                    kVar2.I = kVar.I;
                    kVar2.J = kVar.J;
                    kVar2.K = io.sentry.p.r(kVar.K);
                    k("feedback", kVar2);
                } else if ("gpu".equals(entry.getKey()) && (value instanceof m)) {
                    m mVar = (m) value;
                    m mVar2 = new m();
                    mVar2.E = mVar.E;
                    mVar2.F = mVar.F;
                    mVar2.G = mVar.G;
                    mVar2.H = mVar.H;
                    mVar2.I = mVar.I;
                    mVar2.J = mVar.J;
                    mVar2.K = mVar.K;
                    mVar2.L = mVar.L;
                    mVar2.M = mVar.M;
                    mVar2.N = io.sentry.p.r(mVar.N);
                    q(mVar2);
                } else if ("trace".equals(entry.getKey()) && (value instanceof j7)) {
                    v(new j7((j7) value));
                } else if ("profile".equals(entry.getKey()) && (value instanceof w3)) {
                    w3 w3Var = (w3) value;
                    w3 w3Var2 = new w3();
                    w3Var2.E = w3Var.E;
                    ConcurrentHashMap concurrentHashMapR = io.sentry.p.r(w3Var.F);
                    if (concurrentHashMapR != null) {
                        w3Var2.F = concurrentHashMapR;
                    }
                    k("profile", w3Var2);
                } else if ("response".equals(entry.getKey()) && (value instanceof s)) {
                    s(new s((s) value));
                } else if ("spring".equals(entry.getKey()) && (value instanceof f0)) {
                    u(new f0((f0) value));
                } else if ("art".equals(entry.getKey()) && (value instanceof c)) {
                    k("art", new c((c) value));
                } else {
                    k((String) entry.getKey(), value);
                }
            }
        }
    }

    public boolean a(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.E.containsKey(obj);
    }

    public Set b() {
        return this.E.entrySet();
    }

    public Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        return this.E.get(obj);
    }

    public a d() {
        return (a) w(a.class, "app");
    }

    public h e() {
        return (h) w(h.class, "device");
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof e)) {
            return false;
        }
        return this.E.equals(((e) obj).E);
    }

    public j f() {
        return (j) w(j.class, "flags");
    }

    public q g() {
        return (q) w(q.class, "os");
    }

    public y h() {
        return (y) w(y.class, "runtime");
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    public j7 i() {
        return (j7) w(j7.class, "trace");
    }

    public Enumeration j() {
        return this.E.keys();
    }

    public Object k(String str, Object obj) {
        if (str == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.E;
        return obj == null ? concurrentHashMap.remove(str) : concurrentHashMap.put(str, obj);
    }

    public void l(e eVar) {
        if (eVar == null) {
            return;
        }
        this.E.putAll(eVar.E);
    }

    public void m(a aVar) {
        k("app", aVar);
    }

    public void n(d dVar) {
        k("browser", dVar);
    }

    public void o(h hVar) {
        k("device", hVar);
    }

    public void p(j jVar) {
        k("flags", jVar);
    }

    public void q(m mVar) {
        k("gpu", mVar);
    }

    public void r(q qVar) {
        k("os", qVar);
    }

    public void s(s sVar) {
        io.sentry.v vVarA = this.F.a();
        try {
            k("response", sVar);
            vVarA.close();
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.m2
    public void serialize(q3 q3Var, a1 a1Var) {
        io.sentry.y yVar = (io.sentry.y) q3Var;
        yVar.n();
        ArrayList<String> list = Collections.list(j());
        Collections.sort(list);
        for (String str : list) {
            Object objC = c(str);
            if (objC != null) {
                yVar.r(str);
                yVar.x(a1Var, objC);
            }
        }
        yVar.p();
    }

    public void t(y yVar) {
        k("runtime", yVar);
    }

    public void u(f0 f0Var) {
        k("spring", f0Var);
    }

    public void v(j7 j7Var) {
        io.sentry.p.v("traceContext is required", j7Var);
        k("trace", j7Var);
    }

    public final Object w(Class cls, String str) {
        Object objC = c(str);
        if (cls.isInstance(objC)) {
            return cls.cast(objC);
        }
        return null;
    }

    public e() {
    }
}
