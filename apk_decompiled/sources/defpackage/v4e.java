package defpackage;

import java.net.ProxySelector;
import java.util.ArrayList;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class v4e {
    public final f4e a;
    public final ArrayList b;
    public final int c;
    public final w47 d;
    public final kie e;
    public final int f;
    public final int g;
    public final int h;
    public final ql8 i;
    public final jg2 j;
    public final gmf k;
    public final i25 l;
    public final m96 m;
    public final HostnameVerifier n;
    public final ql8 o;
    public final ProxySelector p;
    public final boolean q;
    public final SocketFactory r;
    public final SSLSocketFactory s;
    public final X509TrustManager t;
    public final zh4 u;
    public int v;

    public v4e(f4e f4eVar, ArrayList arrayList, int i, w47 w47Var, kie kieVar, int i2, int i3, int i4, ql8 ql8Var, jg2 jg2Var, gmf gmfVar, i25 i25Var, m96 m96Var, HostnameVerifier hostnameVerifier, ql8 ql8Var2, ProxySelector proxySelector, boolean z, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager, zh4 zh4Var) {
        kieVar.getClass();
        ql8Var.getClass();
        jg2Var.getClass();
        gmfVar.getClass();
        i25Var.getClass();
        m96Var.getClass();
        hostnameVerifier.getClass();
        ql8Var2.getClass();
        proxySelector.getClass();
        socketFactory.getClass();
        this.a = f4eVar;
        this.b = arrayList;
        this.c = i;
        this.d = w47Var;
        this.e = kieVar;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = ql8Var;
        this.j = jg2Var;
        this.k = gmfVar;
        this.l = i25Var;
        this.m = m96Var;
        this.n = hostnameVerifier;
        this.o = ql8Var2;
        this.p = proxySelector;
        this.q = z;
        this.r = socketFactory;
        this.s = sSLSocketFactory;
        this.t = x509TrustManager;
        this.u = zh4Var;
    }

    public static v4e a(v4e v4eVar, int i, w47 w47Var, kie kieVar, int i2) {
        int i3 = (i2 & 1) != 0 ? v4eVar.c : i;
        w47 w47Var2 = (i2 & 2) != 0 ? v4eVar.d : w47Var;
        kie kieVar2 = (i2 & 4) != 0 ? v4eVar.e : kieVar;
        int i4 = v4eVar.f;
        int i5 = v4eVar.g;
        int i6 = v4eVar.h;
        ql8 ql8Var = v4eVar.i;
        jg2 jg2Var = v4eVar.j;
        gmf gmfVar = v4eVar.k;
        i25 i25Var = v4eVar.l;
        m96 m96Var = v4eVar.m;
        HostnameVerifier hostnameVerifier = v4eVar.n;
        ql8 ql8Var2 = v4eVar.o;
        ProxySelector proxySelector = v4eVar.p;
        boolean z = v4eVar.q;
        SocketFactory socketFactory = v4eVar.r;
        SSLSocketFactory sSLSocketFactory = v4eVar.s;
        X509TrustManager x509TrustManager = v4eVar.t;
        zh4 zh4Var = v4eVar.u;
        kieVar2.getClass();
        ql8Var.getClass();
        jg2Var.getClass();
        gmfVar.getClass();
        i25Var.getClass();
        m96Var.getClass();
        hostnameVerifier.getClass();
        ql8Var2.getClass();
        proxySelector.getClass();
        socketFactory.getClass();
        return new v4e(v4eVar.a, v4eVar.b, i3, w47Var2, kieVar2, i4, i5, i6, ql8Var, jg2Var, gmfVar, i25Var, m96Var, hostnameVerifier, ql8Var2, proxySelector, z, socketFactory, sSLSocketFactory, x509TrustManager, zh4Var);
    }

    public final pqe b(kie kieVar) {
        kieVar.getClass();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = this.c;
        if (i >= size) {
            sz6.j("Check failed.");
            return null;
        }
        this.v++;
        w47 w47Var = this.d;
        if (w47Var != null) {
            z4e z4eVarC = ((z47) w47Var.d).c();
            vs8 vs8Var = kieVar.a;
            z4eVarC.getClass();
            vs8Var.getClass();
            vs8 vs8Var2 = z4eVarC.j.h;
            if (vs8Var.e != vs8Var2.e || !x44.r(vs8Var.d, vs8Var2.d)) {
                sz6.o(arrayList.get(i - 1), " must retain the same host and port", "network interceptor ");
                return null;
            }
            if (this.v != 1) {
                sz6.o(arrayList.get(i - 1), " must call proceed() exactly once", "network interceptor ");
                return null;
            }
        }
        int i2 = i + 1;
        v4e v4eVarA = a(this, i2, null, kieVar, 2097146);
        f89 f89Var = (f89) arrayList.get(i);
        pqe pqeVarC = f89Var.c(v4eVarA);
        if (pqeVarC == null) {
            throw new NullPointerException("interceptor " + f89Var + " returned null");
        }
        if (w47Var == null || i2 >= arrayList.size() || v4eVarA.v == 1) {
            return pqeVarC;
        }
        sz6.o(f89Var, " must call proceed() exactly once", "network interceptor ");
        return null;
    }
}
