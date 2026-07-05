package defpackage;

import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class hdc implements t82 {
    public static final List F = blj.l(new bvd[]{bvd.HTTP_2, bvd.HTTP_1_1});
    public static final List G = blj.l(new jh4[]{jh4.f, jh4.g});
    public final int A;
    public final long B;
    public final fs5 C;
    public final q7h D;
    public final gmf E;
    public final dpf a;
    public final List b;
    public final List c;
    public final cd d;
    public final boolean e;
    public final boolean f;
    public final ql8 g;
    public final boolean h;
    public final boolean i;
    public final i25 j;
    public final m96 k;
    public final ProxySelector l;
    public final ql8 m;
    public final SocketFactory n;
    public final SSLSocketFactory o;
    public final X509TrustManager p;
    public final List q;
    public final List r;
    public final ycc s;
    public final jg2 t;
    public final zh4 u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public hdc(gdc gdcVar) throws NoSuchAlgorithmException, KeyStoreException {
        this.a = gdcVar.a;
        this.b = blj.k(gdcVar.c);
        this.c = blj.k(gdcVar.d);
        this.d = gdcVar.e;
        this.e = gdcVar.f;
        this.f = gdcVar.g;
        this.g = gdcVar.h;
        this.h = gdcVar.i;
        this.i = gdcVar.j;
        this.j = gdcVar.k;
        this.k = gdcVar.l;
        ProxySelector proxySelector = gdcVar.m;
        if (proxySelector == null && (proxySelector = ProxySelector.getDefault()) == null) {
            proxySelector = i9c.a;
        }
        this.l = proxySelector;
        this.m = gdcVar.n;
        this.n = gdcVar.o;
        List list = gdcVar.r;
        this.q = list;
        this.r = gdcVar.s;
        this.s = gdcVar.t;
        this.v = gdcVar.w;
        this.w = gdcVar.x;
        this.x = gdcVar.y;
        this.y = gdcVar.z;
        this.z = gdcVar.A;
        this.A = gdcVar.B;
        this.B = gdcVar.C;
        fs5 fs5Var = gdcVar.D;
        this.C = fs5Var == null ? new fs5(1) : fs5Var;
        q7h q7hVar = gdcVar.E;
        this.D = q7hVar == null ? q7h.l : q7hVar;
        gmf gmfVar = gdcVar.b;
        if (gmfVar == null) {
            gmfVar = new gmf(9);
            gdcVar.b = gmfVar;
        }
        this.E = gmfVar;
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            this.o = null;
            this.u = null;
            this.p = null;
            this.t = jg2.c;
        } else {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((jh4) it.next()).a) {
                    SSLSocketFactory sSLSocketFactory = gdcVar.p;
                    if (sSLSocketFactory == null) {
                        s4d s4dVar = s4d.a;
                        s4d.a.getClass();
                        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        trustManagerFactory.init((KeyStore) null);
                        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                        trustManagers.getClass();
                        if (trustManagers.length == 1) {
                            TrustManager trustManager = trustManagers[0];
                            if (trustManager instanceof X509TrustManager) {
                                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                                this.p = x509TrustManager;
                                s4d s4dVar2 = s4d.a;
                                s4dVar2.getClass();
                                try {
                                    SSLContext sSLContextK = s4dVar2.k();
                                    sSLContextK.init(null, new TrustManager[]{x509TrustManager}, null);
                                    SSLSocketFactory socketFactory = sSLContextK.getSocketFactory();
                                    socketFactory.getClass();
                                    this.o = socketFactory;
                                    zh4 zh4VarC = s4d.a.c(x509TrustManager);
                                    this.u = zh4VarC;
                                    jg2 jg2Var = gdcVar.u;
                                    jg2Var.getClass();
                                    this.t = x44.r(jg2Var.b, zh4VarC) ? jg2Var : new jg2(jg2Var.a, zh4VarC);
                                } catch (GeneralSecurityException e) {
                                    throw new AssertionError("No System TLS: " + e, e);
                                }
                            }
                        }
                        String string = Arrays.toString(trustManagers);
                        string.getClass();
                        mr9.f("Unexpected default trust managers: ".concat(string));
                        throw null;
                    }
                    this.o = sSLSocketFactory;
                    zh4 zh4Var = gdcVar.v;
                    zh4Var.getClass();
                    this.u = zh4Var;
                    X509TrustManager x509TrustManager2 = gdcVar.q;
                    x509TrustManager2.getClass();
                    this.p = x509TrustManager2;
                    jg2 jg2Var2 = gdcVar.u;
                    jg2Var2.getClass();
                    this.t = x44.r(jg2Var2.b, zh4Var) ? jg2Var2 : new jg2(jg2Var2.a, zh4Var);
                }
            }
            this.o = null;
            this.u = null;
            this.p = null;
            this.t = jg2.c;
        }
        X509TrustManager x509TrustManager3 = this.p;
        zh4 zh4Var2 = this.u;
        SSLSocketFactory sSLSocketFactory2 = this.o;
        List list3 = this.c;
        List list4 = this.b;
        list4.getClass();
        if (list4.contains(null)) {
            mr9.k("Null interceptor: ", list4);
            throw null;
        }
        list3.getClass();
        if (list3.contains(null)) {
            mr9.k("Null network interceptor: ", list3);
            throw null;
        }
        List list5 = this.q;
        if (!(list5 instanceof Collection) || !list5.isEmpty()) {
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                if (((jh4) it2.next()).a) {
                    if (sSLSocketFactory2 == null) {
                        sz6.j("sslSocketFactory == null");
                        throw null;
                    }
                    if (zh4Var2 == null) {
                        sz6.j("certificateChainCleaner == null");
                        throw null;
                    }
                    if (x509TrustManager3 != null) {
                        return;
                    }
                    sz6.j("x509TrustManager == null");
                    throw null;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            sz6.j("Check failed.");
            throw null;
        }
        if (zh4Var2 != null) {
            sz6.j("Check failed.");
            throw null;
        }
        if (x509TrustManager3 != null) {
            sz6.j("Check failed.");
            throw null;
        }
        if (x44.r(this.t, jg2.c)) {
            return;
        }
        sz6.j("Check failed.");
        throw null;
    }

    @Override // defpackage.t82
    public final v82 a(kie kieVar) {
        kieVar.getClass();
        return new f4e(this, kieVar, false);
    }

    public final gdc b() {
        gdc gdcVar = new gdc();
        gdcVar.a = this.a;
        gdcVar.b = this.E;
        b54.t0(gdcVar.c, this.b);
        b54.t0(gdcVar.d, this.c);
        gdcVar.e = this.d;
        gdcVar.f = this.e;
        gdcVar.g = this.f;
        gdcVar.h = this.g;
        gdcVar.i = this.h;
        gdcVar.j = this.i;
        gdcVar.k = this.j;
        gdcVar.l = this.k;
        gdcVar.m = this.l;
        gdcVar.n = this.m;
        gdcVar.o = this.n;
        gdcVar.p = this.o;
        gdcVar.q = this.p;
        gdcVar.r = this.q;
        gdcVar.s = this.r;
        gdcVar.t = this.s;
        gdcVar.u = this.t;
        gdcVar.v = this.u;
        gdcVar.w = this.v;
        gdcVar.x = this.w;
        gdcVar.y = this.x;
        gdcVar.z = this.y;
        gdcVar.A = this.z;
        gdcVar.B = this.A;
        gdcVar.C = this.B;
        gdcVar.D = this.C;
        gdcVar.E = this.D;
        return gdcVar;
    }

    public final p5e c(kie kieVar, rkk rkkVar) {
        kieVar.getClass();
        rkkVar.getClass();
        p5e p5eVar = new p5e(this.D, kieVar, rkkVar, new Random(), this.z, this.B, this.A);
        p5eVar.d(this);
        return p5eVar;
    }

    public hdc() {
        this(new gdc());
    }
}
