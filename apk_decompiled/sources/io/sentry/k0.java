package io.sentry;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 {
    public Boolean B;
    public Boolean C;
    public Boolean D;
    public Boolean E;
    public Boolean F;
    public String G;
    public List H;
    public List I;
    public Boolean J;
    public Boolean K;
    public Boolean L;
    public Boolean M;
    public Boolean N;
    public Boolean O;
    public Boolean P;
    public Boolean Q;
    public Boolean R;
    public Double S;
    public String T;
    public x3 U;
    public Boolean V;
    public String W;
    public m6 X;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Boolean f;
    public Boolean g;
    public Boolean h;
    public Double i;
    public Double j;
    public Double k;
    public u6 l;
    public t6 n;
    public String s;
    public Long t;
    public Long u;
    public Long v;
    public List x;
    public Boolean y;
    public Boolean z;
    public final ConcurrentHashMap m = new ConcurrentHashMap();
    public final CopyOnWriteArrayList o = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList p = new CopyOnWriteArrayList();
    public CopyOnWriteArrayList q = null;
    public final CopyOnWriteArrayList r = new CopyOnWriteArrayList();
    public final CopyOnWriteArraySet w = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet A = new CopyOnWriteArraySet();

    public static k0 a(io.sentry.config.b bVar, a1 a1Var) {
        Double dValueOf;
        Double dValueOf2;
        Double dValueOf3;
        k0 k0Var = new k0();
        k0Var.a = bVar.getProperty("dsn");
        k0Var.b = bVar.getProperty("environment");
        k0Var.c = bVar.getProperty(BuildConfig.BUILD_TYPE);
        k0Var.d = bVar.getProperty("dist");
        k0Var.e = bVar.getProperty("servername");
        k0Var.f = bVar.a("uncaught.handler.enabled");
        k0Var.y = bVar.a("uncaught.handler.print-stacktrace");
        String property = bVar.getProperty("sample-rate");
        Double dValueOf4 = null;
        if (property != null) {
            try {
                dValueOf = Double.valueOf(property);
            } catch (NumberFormatException unused) {
                dValueOf = null;
            }
        } else {
            dValueOf = null;
        }
        k0Var.i = dValueOf;
        String property2 = bVar.getProperty("traces-sample-rate");
        if (property2 != null) {
            try {
                dValueOf2 = Double.valueOf(property2);
            } catch (NumberFormatException unused2) {
                dValueOf2 = null;
            }
        } else {
            dValueOf2 = null;
        }
        k0Var.j = dValueOf2;
        String property3 = bVar.getProperty("profiles-sample-rate");
        if (property3 != null) {
            try {
                dValueOf3 = Double.valueOf(property3);
            } catch (NumberFormatException unused3) {
                dValueOf3 = null;
            }
        } else {
            dValueOf3 = null;
        }
        k0Var.k = dValueOf3;
        k0Var.g = bVar.a("debug");
        k0Var.h = bVar.a("enable-deduplication");
        k0Var.z = bVar.a("send-client-reports");
        k0Var.Q = bVar.a("force-init");
        String property4 = bVar.getProperty("max-request-body-size");
        if (property4 != null) {
            k0Var.l = u6.valueOf(property4.toUpperCase(Locale.ROOT));
        }
        for (Map.Entry entry : ((ConcurrentHashMap) bVar.c()).entrySet()) {
            k0Var.m.put((String) entry.getKey(), (String) entry.getValue());
        }
        String property5 = bVar.getProperty("proxy.host");
        String property6 = bVar.getProperty("proxy.user");
        String property7 = bVar.getProperty("proxy.pass");
        String property8 = bVar.getProperty("proxy.port");
        if (property8 == null) {
            property8 = "80";
        }
        if (property5 != null) {
            t6 t6Var = new t6();
            t6Var.a = property5;
            t6Var.b = property8;
            t6Var.c = property6;
            t6Var.d = property7;
            k0Var.n = t6Var;
        }
        Iterator it = bVar.d("in-app-includes").iterator();
        while (it.hasNext()) {
            k0Var.p.add((String) it.next());
        }
        Iterator it2 = bVar.d("in-app-excludes").iterator();
        while (it2.hasNext()) {
            k0Var.o.add((String) it2.next());
        }
        List<String> listD = bVar.getProperty("trace-propagation-targets") != null ? bVar.d("trace-propagation-targets") : null;
        if (listD == null && bVar.getProperty("tracing-origins") != null) {
            listD = bVar.d("tracing-origins");
        }
        if (listD != null) {
            for (String str : listD) {
                if (k0Var.q == null) {
                    k0Var.q = new CopyOnWriteArrayList();
                }
                if (!str.isEmpty()) {
                    k0Var.q.add(str);
                }
            }
        }
        Iterator it3 = bVar.d("context-tags").iterator();
        while (it3.hasNext()) {
            k0Var.r.add((String) it3.next());
        }
        k0Var.s = bVar.getProperty("proguard-uuid");
        Iterator it4 = bVar.d("bundle-ids").iterator();
        while (it4.hasNext()) {
            k0Var.A.add((String) it4.next());
        }
        k0Var.t = bVar.b("idle-timeout");
        k0Var.u = bVar.b("shutdown-timeout-millis");
        k0Var.v = bVar.b("session-flush-timeout-millis");
        String property9 = bVar.getProperty("ignored-errors");
        k0Var.x = property9 != null ? Arrays.asList(property9.split(",")) : null;
        k0Var.B = bVar.a("enabled");
        k0Var.C = bVar.a("enable-pretty-serialization-output");
        k0Var.J = bVar.a("send-modules");
        k0Var.K = bVar.a("send-default-pii");
        String property10 = bVar.getProperty("ignored-checkins");
        k0Var.H = property10 != null ? Arrays.asList(property10.split(",")) : null;
        String property11 = bVar.getProperty("ignored-transactions");
        k0Var.I = property11 != null ? Arrays.asList(property11.split(",")) : null;
        k0Var.L = bVar.a("enable-backpressure-handling");
        k0Var.M = bVar.a("enable-database-transaction-tracing");
        k0Var.N = bVar.a("enable-cache-tracing");
        k0Var.O = bVar.a("enable-queue-tracing");
        k0Var.P = bVar.a("global-hub-mode");
        k0Var.R = bVar.a("capture-open-telemetry-events");
        k0Var.E = bVar.a("logs.enabled");
        k0Var.F = bVar.a("metrics.enabled");
        for (String str2 : bVar.d("ignored-exceptions-for-type")) {
            try {
                Class<?> cls = Class.forName(str2);
                if (Throwable.class.isAssignableFrom(cls)) {
                    k0Var.w.add(cls);
                } else {
                    a1Var.h(t5.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s does not extend Throwable", str2, str2);
                }
            } catch (ClassNotFoundException unused4) {
                a1Var.h(t5.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s class is not found", str2, str2);
            }
        }
        Long lB = bVar.b("cron.default-checkin-margin");
        Long lB2 = bVar.b("cron.default-max-runtime");
        String property12 = bVar.getProperty("cron.default-timezone");
        Long lB3 = bVar.b("cron.default-failure-issue-threshold");
        Long lB4 = bVar.b("cron.default-recovery-threshold");
        if (lB != null || lB2 != null || property12 != null || lB3 != null || lB4 != null) {
            m6 m6Var = new m6();
            m6Var.a = lB;
            m6Var.b = lB2;
            m6Var.c = property12;
            m6Var.d = lB3;
            m6Var.e = lB4;
            k0Var.X = m6Var;
        }
        k0Var.V = bVar.a("enable-strict-trace-continuation");
        k0Var.W = bVar.getProperty("org-id");
        k0Var.D = bVar.a("enable-spotlight");
        k0Var.G = bVar.getProperty("spotlight-connection-url");
        String property13 = bVar.getProperty("profile-session-sample-rate");
        if (property13 != null) {
            try {
                dValueOf4 = Double.valueOf(property13);
            } catch (NumberFormatException unused5) {
            }
        }
        k0Var.S = dValueOf4;
        k0Var.T = bVar.getProperty("profiling-traces-dir-path");
        String property14 = bVar.getProperty("profile-lifecycle");
        if (property14 != null && !property14.isEmpty()) {
            k0Var.U = x3.valueOf(property14.toUpperCase());
        }
        return k0Var;
    }

    public final String A() {
        return this.c;
    }

    public final Double B() {
        return this.i;
    }

    public final Boolean C() {
        return this.z;
    }

    public final String D() {
        return this.e;
    }

    public final Long E() {
        return this.v;
    }

    public final Long F() {
        return this.u;
    }

    public final String G() {
        return this.G;
    }

    public final ConcurrentHashMap H() {
        return this.m;
    }

    public final List I() {
        return this.q;
    }

    public final Double J() {
        return this.j;
    }

    public final Boolean K() {
        return this.R;
    }

    public final Boolean L() {
        return this.L;
    }

    public final Boolean M() {
        return this.N;
    }

    public final Boolean N() {
        return this.M;
    }

    public final Boolean O() {
        return this.E;
    }

    public final Boolean P() {
        return this.F;
    }

    public final Boolean Q() {
        return this.C;
    }

    public final Boolean R() {
        return this.O;
    }

    public final Boolean S() {
        return this.D;
    }

    public final Boolean T() {
        return this.B;
    }

    public final Boolean U() {
        return this.Q;
    }

    public final Boolean V() {
        return this.P;
    }

    public final Boolean W() {
        return this.K;
    }

    public final Boolean X() {
        return this.J;
    }

    public final Boolean Y() {
        return this.V;
    }

    public final CopyOnWriteArraySet b() {
        return this.A;
    }

    public final CopyOnWriteArrayList c() {
        return this.r;
    }

    public final m6 d() {
        return this.X;
    }

    public final Boolean e() {
        return this.g;
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.a;
    }

    public final Boolean h() {
        return this.h;
    }

    public final Boolean i() {
        return this.f;
    }

    public final String j() {
        return this.b;
    }

    public final Long k() {
        return this.t;
    }

    public final List l() {
        return this.H;
    }

    public final List m() {
        return this.x;
    }

    public final CopyOnWriteArraySet n() {
        return this.w;
    }

    public final List o() {
        return this.I;
    }

    public final CopyOnWriteArrayList p() {
        return this.o;
    }

    public final CopyOnWriteArrayList q() {
        return this.p;
    }

    public final u6 r() {
        return this.l;
    }

    public final String s() {
        return this.W;
    }

    public final Boolean t() {
        return this.y;
    }

    public final x3 u() {
        return this.U;
    }

    public final Double v() {
        return this.S;
    }

    public final Double w() {
        return this.k;
    }

    public final String x() {
        return this.T;
    }

    public final String y() {
        return this.s;
    }

    public final t6 z() {
        return this.n;
    }
}
