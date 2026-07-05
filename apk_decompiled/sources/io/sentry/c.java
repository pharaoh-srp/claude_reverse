package io.sentry;

import defpackage.w60;
import java.text.DecimalFormat;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final w60 i = new w60(3);
    public final ConcurrentHashMap a;
    public final io.sentry.util.a b;
    public Double c;
    public Double d;
    public final String e;
    public boolean f;
    public final boolean g;
    public final a1 h;

    public c(ConcurrentHashMap concurrentHashMap, Double d, Double d2, String str, boolean z, a1 a1Var) {
        this.b = new io.sentry.util.a();
        this.a = concurrentHashMap;
        this.c = d;
        this.d = d2;
        this.h = a1Var;
        this.e = str;
        this.f = true;
        this.g = z;
    }

    public static String b(Double d) {
        if (p.q(d, false)) {
            return ((DecimalFormat) i.get()).format(d);
        }
        return null;
    }

    public final String a(String str) {
        return (String) this.a.get(str);
    }

    public final void c(String str, String str2) {
        if (this.f) {
            ConcurrentHashMap concurrentHashMap = this.a;
            if (str2 == null) {
                concurrentHashMap.remove(str);
            } else {
                concurrentHashMap.put(str, str2);
            }
        }
    }

    public final void d(io.sentry.protocol.w wVar, io.sentry.protocol.w wVar2, w6 w6Var, r7 r7Var, String str, io.sentry.protocol.h0 h0Var) {
        c("sentry-trace_id", wVar.toString());
        c("sentry-public_key", w6Var.retrieveParsedDsn().b);
        c("sentry-release", w6Var.getRelease());
        c("sentry-environment", w6Var.getEnvironment());
        if (h0Var == null || io.sentry.protocol.h0.URL.equals(h0Var)) {
            str = null;
        }
        c("sentry-transaction", str);
        if (wVar2 != null && !io.sentry.protocol.w.F.equals(wVar2)) {
            c("sentry-replay_id", wVar2.toString());
        }
        c("sentry-org_id", w6Var.getEffectiveOrgId());
        Double d = r7Var == null ? null : r7Var.b;
        if (this.f) {
            this.c = d;
        }
        Boolean bool = r7Var == null ? null : r7Var.a;
        c("sentry-sampled", bool == null ? null : bool.toString());
        Double d2 = r7Var != null ? r7Var.c : null;
        if (this.f) {
            this.d = d2;
        }
    }

    public final p7 e() {
        String strA = a("sentry-trace_id");
        String strA2 = a("sentry-replay_id");
        String strA3 = a("sentry-public_key");
        if (strA == null || strA3 == null) {
            return null;
        }
        p7 p7Var = new p7(new io.sentry.protocol.w(strA), strA3, a("sentry-release"), a("sentry-environment"), a("sentry-user_id"), a("sentry-transaction"), b(this.c), a("sentry-sampled"), strA2 != null ? new io.sentry.protocol.w(strA2) : null, b(this.d));
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        v vVarA = this.b.a();
        try {
            for (Map.Entry entry : this.a.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!b.a.contains(str) && str2 != null) {
                    concurrentHashMap.put(str.replaceFirst("sentry-", ""), str2);
                }
            }
            vVarA.close();
            p7Var.O = concurrentHashMap;
            return p7Var;
        } finally {
        }
    }

    public c(a1 a1Var) {
        this(new ConcurrentHashMap(), null, null, null, false, a1Var);
    }
}
