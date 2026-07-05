package io.sentry.okhttp;

import defpackage.bvd;
import defpackage.f4e;
import defpackage.g4e;
import defpackage.j40;
import defpackage.kie;
import defpackage.pqe;
import defpackage.tz6;
import defpackage.v82;
import defpackage.vs8;
import io.sentry.a5;
import io.sentry.n7;
import io.sentry.p1;
import io.sentry.t4;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g extends tz6 {
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    @Override // defpackage.tz6
    public final void A(v82 v82Var) {
        a aVar;
        if (C() && (aVar = (a) b.get(v82Var)) != null) {
            aVar.b("http.connect.secure_connect_ms", null);
        }
    }

    @Override // defpackage.tz6
    public final void B(v82 v82Var) {
        a aVar;
        if (C() && (aVar = (a) b.get(v82Var)) != null) {
            aVar.c("http.connect.secure_connect_ms");
        }
    }

    public final boolean C() {
        return !"io.sentry.android.okhttp.SentryOkHttpEventListener".equals(null);
    }

    @Override // defpackage.tz6
    public final void a(f4e f4eVar, pqe pqeVar) {
        pqeVar.getClass();
    }

    @Override // defpackage.tz6
    public final void b(f4e f4eVar, pqe pqeVar) {
    }

    @Override // defpackage.tz6
    public final void c(f4e f4eVar) {
        a aVar = (a) b.remove(f4eVar);
        if (aVar == null) {
            return;
        }
        aVar.a(null);
    }

    @Override // defpackage.tz6
    public final void d(f4e f4eVar, IOException iOException) {
        a aVar;
        if (C() && (aVar = (a) b.remove(f4eVar)) != null) {
            aVar.d(iOException.getMessage());
            aVar.a(new b(iOException, 0));
        }
    }

    @Override // defpackage.tz6
    public final void e(f4e f4eVar) {
        if (C()) {
            b.put(f4eVar, new a(f4eVar.F));
        }
    }

    @Override // defpackage.tz6
    public final void f(f4e f4eVar) {
    }

    @Override // defpackage.tz6
    public final void g(v82 v82Var, InetSocketAddress inetSocketAddress, Proxy proxy, bvd bvdVar) {
        a aVar;
        inetSocketAddress.getClass();
        if (C() && (aVar = (a) b.get(v82Var)) != null) {
            String strName = bvdVar != null ? bvdVar.name() : null;
            if (strName != null) {
                aVar.c.c("protocol", strName);
                p1 p1Var = aVar.d;
                if (p1Var != null) {
                    p1Var.f("protocol", strName);
                }
            }
            aVar.b("http.connect_ms", null);
        }
    }

    @Override // defpackage.tz6
    public final void h(v82 v82Var, InetSocketAddress inetSocketAddress, Proxy proxy, IOException iOException) {
        a aVar;
        inetSocketAddress.getClass();
        if (C() && (aVar = (a) b.get(v82Var)) != null) {
            aVar.d(iOException.getMessage());
            p1 p1Var = aVar.d;
            a5 a5Var = (a5) aVar.b.remove("http.connect_ms");
            if (a5Var == null || p1Var == null) {
                return;
            }
            p1Var.k(iOException);
            p1Var.a(n7.INTERNAL_ERROR);
            p1Var.f("http.connect_ms", Long.valueOf(t4.g().r().getDateProvider().c().b(a5Var) / 1000000));
        }
    }

    @Override // defpackage.tz6
    public final void i(v82 v82Var, InetSocketAddress inetSocketAddress, Proxy proxy) {
        a aVar;
        inetSocketAddress.getClass();
        if (C() && (aVar = (a) b.get(v82Var)) != null) {
            aVar.c("http.connect_ms");
        }
    }

    @Override // defpackage.tz6
    public final void j(v82 v82Var, g4e g4eVar) {
        a aVar;
        g4eVar.getClass();
        if (C() && (aVar = (a) b.get(v82Var)) != null) {
            aVar.c("http.connection_ms");
        }
    }

    @Override // defpackage.tz6
    public final void k(v82 v82Var, g4e g4eVar) {
        a aVar;
        g4eVar.getClass();
        if (C() && (aVar = (a) b.get(v82Var)) != null) {
            aVar.b("http.connection_ms", null);
        }
    }

    @Override // defpackage.tz6
    public final void l(f4e f4eVar, String str, List list) {
        a aVar;
        if (C() && (aVar = (a) b.get(f4eVar)) != null) {
            aVar.b("http.client.resolve_dns_ms", new j40(str, 11, list));
        }
    }

    @Override // defpackage.tz6
    public final void m(f4e f4eVar, String str) {
        a aVar;
        if (C() && (aVar = (a) b.get(f4eVar)) != null) {
            aVar.c("http.client.resolve_dns_ms");
        }
    }

    @Override // defpackage.tz6
    public final void n(f4e f4eVar, vs8 vs8Var, List list) {
        a aVar;
        vs8Var.getClass();
        list.getClass();
        if (C() && (aVar = (a) b.get(f4eVar)) != null) {
            aVar.b("http.client.proxy_select_ms", new d(0, list));
        }
    }

    @Override // defpackage.tz6
    public final void o(f4e f4eVar, vs8 vs8Var) {
        a aVar;
        vs8Var.getClass();
        if (C() && (aVar = (a) b.get(f4eVar)) != null) {
            aVar.c("http.client.proxy_select_ms");
        }
    }

    @Override // defpackage.tz6
    public final void p(v82 v82Var, long j) {
        a aVar;
        if (C() && (aVar = (a) b.get(v82Var)) != null) {
            aVar.b("http.connection.request_body_ms", new e(j));
            if (j > -1) {
                aVar.c.c("request_content_length", Long.valueOf(j));
                p1 p1Var = aVar.d;
                if (p1Var != null) {
                    p1Var.f("http.request_content_length", Long.valueOf(j));
                }
            }
        }
    }

    @Override // defpackage.tz6
    public final void q(v82 v82Var) {
        a aVar;
        if (C() && (aVar = (a) b.get(v82Var)) != null) {
            aVar.c("http.connection.request_body_ms");
        }
    }

    @Override // defpackage.tz6
    public final void r(v82 v82Var, IOException iOException) {
        a aVar;
        iOException.getClass();
        if (C() && (aVar = (a) b.get(v82Var)) != null) {
            aVar.d(iOException.getMessage());
            aVar.b("http.connection.request_headers_ms", new b(iOException, 1));
            p1 p1Var = aVar.d;
            a5 a5Var = (a5) aVar.b.remove("http.connection.request_body_ms");
            if (a5Var == null || p1Var == null) {
                return;
            }
            p1Var.a(n7.INTERNAL_ERROR);
            p1Var.k(iOException);
            p1Var.f("http.connection.request_body_ms", Long.valueOf(t4.g().r().getDateProvider().c().b(a5Var) / 1000000));
        }
    }

    @Override // defpackage.tz6
    public final void s(v82 v82Var, kie kieVar) {
        a aVar;
        kieVar.getClass();
        if (C() && (aVar = (a) b.get(v82Var)) != null) {
            aVar.b("http.connection.request_headers_ms", null);
        }
    }

    @Override // defpackage.tz6
    public final void t(v82 v82Var) {
        a aVar;
        if (C() && (aVar = (a) b.get(v82Var)) != null) {
            aVar.c("http.connection.request_headers_ms");
        }
    }

    @Override // defpackage.tz6
    public final void u(v82 v82Var, long j) {
        a aVar;
        if (C() && (aVar = (a) b.get(v82Var)) != null) {
            if (j > -1) {
                aVar.c.c("response_content_length", Long.valueOf(j));
                p1 p1Var = aVar.d;
                if (p1Var != null) {
                    p1Var.f("http.response_content_length", Long.valueOf(j));
                }
            }
            aVar.b("http.connection.response_body_ms", new f(j));
        }
    }

    @Override // defpackage.tz6
    public final void v(v82 v82Var) {
        a aVar;
        if (C() && (aVar = (a) b.get(v82Var)) != null) {
            aVar.c("http.connection.response_body_ms");
        }
    }

    @Override // defpackage.tz6
    public final void w(v82 v82Var, IOException iOException) {
        a aVar;
        iOException.getClass();
        if (C() && (aVar = (a) b.get(v82Var)) != null) {
            aVar.d(iOException.getMessage());
            aVar.b("http.connection.response_headers_ms", new b(iOException, 2));
            p1 p1Var = aVar.d;
            a5 a5Var = (a5) aVar.b.remove("http.connection.response_body_ms");
            if (a5Var == null || p1Var == null) {
                return;
            }
            p1Var.a(n7.INTERNAL_ERROR);
            p1Var.k(iOException);
            p1Var.f("http.connection.response_body_ms", Long.valueOf(t4.g().r().getDateProvider().c().b(a5Var) / 1000000));
        }
    }

    @Override // defpackage.tz6
    public final void x(v82 v82Var, pqe pqeVar) {
        a aVar;
        if (C() && (aVar = (a) b.get(v82Var)) != null) {
            aVar.e = pqeVar;
            io.sentry.g gVar = aVar.c;
            bvd bvdVar = pqeVar.F;
            gVar.c("protocol", bvdVar.name());
            int i = pqeVar.H;
            gVar.c("status_code", Integer.valueOf(i));
            p1 p1Var = aVar.d;
            if (p1Var != null) {
                p1Var.f("protocol", bvdVar.name());
            }
            if (p1Var != null) {
                p1Var.f("http.response.status_code", Integer.valueOf(i));
            }
            aVar.b("http.connection.response_headers_ms", new d(1, pqeVar));
        }
    }

    @Override // defpackage.tz6
    public final void y(v82 v82Var) {
        a aVar;
        if (C() && (aVar = (a) b.get(v82Var)) != null) {
            aVar.c("http.connection.response_headers_ms");
        }
    }

    @Override // defpackage.tz6
    public final void z(f4e f4eVar, pqe pqeVar) {
    }
}
