package io.sentry.okhttp;

import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import defpackage.bz7;
import defpackage.kie;
import defpackage.pqe;
import defpackage.vs8;
import io.sentry.a5;
import io.sentry.j7;
import io.sentry.m;
import io.sentry.n0;
import io.sentry.n4;
import io.sentry.p;
import io.sentry.p1;
import io.sentry.t4;
import io.sentry.util.k;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final kie a;
    public final ConcurrentHashMap b;
    public final io.sentry.g c;
    public final p1 d;
    public pqe e;
    public io.sentry.util.network.e f;
    public final AtomicBoolean g;
    public String h;
    public String i;

    public a(kie kieVar) {
        kieVar.getClass();
        this.a = kieVar;
        this.b = new ConcurrentHashMap();
        this.g = new AtomicBoolean(false);
        String str = (String) p.s(kieVar.a.i).b;
        this.h = str == null ? "unknown" : str;
        this.i = kieVar.b;
        p1 p1VarS = k.a ? t4.g().s() : t4.g().c();
        p1 p1VarC = p1VarS != null ? p1VarS.C() : null;
        this.d = p1VarC;
        j7 j7VarY = p1VarC != null ? p1VarC.y() : null;
        if (j7VarY != null) {
            j7VarY.M = "auto.http.okhttp";
        }
        io.sentry.g gVar = new io.sentry.g();
        gVar.I = "http";
        gVar.K = "http";
        gVar.c("http.start_timestamp", Long.valueOf(System.currentTimeMillis()));
        this.c = gVar;
        e(kieVar);
    }

    public final void a(b bVar) {
        if (this.g.getAndSet(true)) {
            return;
        }
        this.b.clear();
        n0 n0Var = new n0();
        n0Var.d("okHttp:request", this.a);
        pqe pqeVar = this.e;
        if (pqeVar != null) {
            n0Var.d("okHttp:response", pqeVar);
        }
        io.sentry.util.network.e eVar = this.f;
        if (eVar != null) {
            n0Var.d("sentry:replayNetworkDetails", eVar);
        }
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        io.sentry.g gVar = this.c;
        gVar.c("http.end_timestamp", lValueOf);
        n4.a.j(gVar, n0Var);
        p1 p1Var = this.d;
        if (p1Var != null && bVar != null) {
            bVar.invoke(p1Var);
        }
        if (p1Var != null) {
            p1Var.p();
        }
    }

    public final void b(String str, bz7 bz7Var) {
        p1 p1Var;
        a5 a5Var = (a5) this.b.remove(str);
        if (a5Var == null || (p1Var = this.d) == null) {
            return;
        }
        if (bz7Var != null) {
            bz7Var.invoke(p1Var);
        }
        p1Var.f(str, Long.valueOf(t4.g().r().getDateProvider().c().b(a5Var) / 1000000));
    }

    public final void c(String str) {
        if (this.d == null) {
            return;
        }
        a5 a5VarC = t4.g().r().getDateProvider().c();
        a5VarC.getClass();
        this.b.put(str, a5VarC);
    }

    public final void d(String str) {
        if (str != null) {
            this.c.c("error_message", str);
            p1 p1Var = this.d;
            if (p1Var != null) {
                p1Var.f("error_message", str);
            }
        }
    }

    public final void e(kie kieVar) {
        kieVar.getClass();
        vs8 vs8Var = kieVar.a;
        m mVarS = p.s(vs8Var.i);
        String str = (String) mVarS.d;
        String str2 = (String) mVarS.c;
        String str3 = (String) mVarS.b;
        this.h = str3 == null ? "unknown" : str3;
        String str4 = vs8Var.d;
        String strB = vs8Var.b();
        this.i = kieVar.b;
        p1 p1Var = this.d;
        if (p1Var != null) {
            p1Var.s(this.i + ' ' + this.h);
        }
        if (p1Var != null) {
            if (str2 != null) {
                p1Var.f("http.query", str2);
            }
            if (str != null) {
                p1Var.f("http.fragment", str);
            }
        }
        io.sentry.g gVar = this.c;
        gVar.c("host", str4);
        gVar.c("path", strB);
        if (str3 != null) {
            gVar.c("url", str3);
        }
        String str5 = this.i;
        Locale locale = Locale.ROOT;
        String upperCase = str5.toUpperCase(locale);
        upperCase.getClass();
        gVar.c(VerifyMagicLinkRequest.Credentials.DISCRIMINATOR, upperCase);
        if (str2 != null) {
            gVar.c("http.query", str2);
        }
        if (str != null) {
            gVar.c("http.fragment", str);
        }
        if (p1Var != null) {
            p1Var.f("url", this.h);
        }
        if (p1Var != null) {
            p1Var.f("host", str4);
        }
        if (p1Var != null) {
            p1Var.f("path", strB);
        }
        if (p1Var != null) {
            String upperCase2 = this.i.toUpperCase(locale);
            upperCase2.getClass();
            p1Var.f("http.request.method", upperCase2);
        }
    }
}
