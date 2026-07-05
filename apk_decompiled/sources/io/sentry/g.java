package io.sentry;

import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import defpackage.sz6;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g implements m2, Comparable {
    public final Long E;
    public Date F;
    public final Long G;
    public String H;
    public String I;
    public ConcurrentHashMap J;
    public String K;
    public String L;
    public t5 M;
    public ConcurrentHashMap N;

    public g(g gVar) {
        this.J = new ConcurrentHashMap();
        this.G = Long.valueOf(System.nanoTime());
        this.F = gVar.F;
        this.E = gVar.E;
        this.H = gVar.H;
        this.I = gVar.I;
        this.K = gVar.K;
        this.L = gVar.L;
        ConcurrentHashMap concurrentHashMapR = p.r(gVar.J);
        if (concurrentHashMapR != null) {
            this.J = concurrentHashMapR;
        }
        this.N = p.r(gVar.N);
        this.M = gVar.M;
    }

    public static boolean a(g gVar, g gVar2) {
        return gVar.b().getTime() == gVar2.b().getTime() && p.h(gVar.H, gVar2.H) && p.h(gVar.I, gVar2.I) && p.h(gVar.K, gVar2.K) && p.h(gVar.L, gVar2.L) && gVar.M == gVar2.M;
    }

    public final Date b() {
        Date date = this.F;
        if (date != null) {
            return (Date) date.clone();
        }
        Long l = this.E;
        if (l == null) {
            sz6.j("No timestamp set for breadcrumb");
            return null;
        }
        Date dateL = p.l(l.longValue());
        this.F = dateL;
        return dateL;
    }

    public final void c(String str, Object obj) {
        if (str == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.J;
        if (obj == null) {
            concurrentHashMap.remove(str);
        } else {
            concurrentHashMap.put(str, obj);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.G.compareTo(((g) obj).G);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return "http".equals(this.I) ? a(this, gVar) && p.h(this.J.get("status_code"), gVar.J.get("status_code")) && p.h(this.J.get("url"), gVar.J.get("url")) && p.h(this.J.get(VerifyMagicLinkRequest.Credentials.DISCRIMINATOR), gVar.J.get(VerifyMagicLinkRequest.Credentials.DISCRIMINATOR)) && p.h(this.J.get("http.fragment"), gVar.J.get("http.fragment")) && p.h(this.J.get("http.query"), gVar.J.get("http.query")) : a(this, gVar);
    }

    public final int hashCode() {
        return "http".equals(this.I) ? Arrays.hashCode(new Object[]{Long.valueOf(b().getTime()), this.H, this.I, this.K, this.L, this.M, this.J.get("status_code"), this.J.get("url"), this.J.get(VerifyMagicLinkRequest.Credentials.DISCRIMINATOR), this.J.get("http.fragment"), this.J.get("http.query")}) : Arrays.hashCode(new Object[]{Long.valueOf(b().getTime()), this.H, this.I, this.K, this.L, this.M});
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        y yVar = (y) q3Var;
        yVar.n();
        yVar.r("timestamp");
        yVar.x(a1Var, b());
        if (this.H != null) {
            yVar.r("message");
            yVar.A(this.H);
        }
        if (this.I != null) {
            yVar.r("type");
            yVar.A(this.I);
        }
        yVar.r("data");
        yVar.x(a1Var, this.J);
        if (this.K != null) {
            yVar.r("category");
            yVar.A(this.K);
        }
        if (this.L != null) {
            yVar.r("origin");
            yVar.A(this.L);
        }
        if (this.M != null) {
            yVar.r("level");
            yVar.x(a1Var, this.M);
        }
        ConcurrentHashMap concurrentHashMap = this.N;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                e.b(this.N, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }

    public g(long j) {
        this.J = new ConcurrentHashMap();
        this.G = Long.valueOf(System.nanoTime());
        this.E = Long.valueOf(j);
        this.F = null;
    }

    public g(Date date) {
        this.J = new ConcurrentHashMap();
        this.G = Long.valueOf(System.nanoTime());
        this.F = date;
        this.E = null;
    }

    public g() {
        this(System.currentTimeMillis());
    }
}
