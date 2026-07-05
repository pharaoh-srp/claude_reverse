package defpackage;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes.dex */
public final class cf {
    public final m96 a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final jg2 e;
    public final ql8 f;
    public final ProxySelector g;
    public final vs8 h;
    public final List i;
    public final List j;

    public cf(String str, int i, m96 m96Var, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, jg2 jg2Var, ql8 ql8Var, List list, List list2, ProxySelector proxySelector) {
        str.getClass();
        m96Var.getClass();
        socketFactory.getClass();
        ql8Var.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.a = m96Var;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = jg2Var;
        this.f = ql8Var;
        this.g = proxySelector;
        us8 us8Var = new us8();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            us8Var.c = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                sz6.p("unexpected scheme: ".concat(str2));
                throw null;
            }
            us8Var.c = "https";
        }
        us8Var.f(str);
        if (1 > i || i >= 65536) {
            mr9.q(grc.p(i, "unexpected port: "));
            throw null;
        }
        us8Var.b = i;
        this.h = us8Var.c();
        this.i = blj.k(list);
        this.j = blj.k(list2);
    }

    public final boolean a(cf cfVar) {
        cfVar.getClass();
        return x44.r(this.a, cfVar.a) && x44.r(this.f, cfVar.f) && x44.r(this.i, cfVar.i) && x44.r(this.j, cfVar.j) && x44.r(this.g, cfVar.g) && x44.r(this.c, cfVar.c) && x44.r(this.d, cfVar.d) && x44.r(this.e, cfVar.e) && this.h.e == cfVar.h.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cf)) {
            return false;
        }
        cf cfVar = (cf) obj;
        return x44.r(this.h, cfVar.h) && a(cfVar);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((this.g.hashCode() + kgh.m(kgh.m((this.f.hashCode() + ((this.a.hashCode() + kgh.l(527, 31, this.h.i)) * 31)) * 31, 31, this.i), 31, this.j)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        vs8 vs8Var = this.h;
        sb.append(vs8Var.d);
        sb.append(':');
        sb.append(vs8Var.e);
        sb.append(", ");
        sb.append("proxySelector=" + this.g);
        sb.append('}');
        return sb.toString();
    }
}
