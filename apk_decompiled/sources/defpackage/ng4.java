package defpackage;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import okio.Base64;
import okio.ByteString;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Timeout;

/* JADX INFO: loaded from: classes.dex */
public final class ng4 implements hwe, x47 {
    public final q7h a;
    public final ak6 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;
    public final f4e i;
    public final z4e j;
    public final fwe k;
    public final List l;
    public final kie m;
    public final int n;
    public final boolean o;
    public volatile boolean p;
    public Socket q;
    public Socket r;
    public cf8 s;
    public bvd t;
    public fj0 u;
    public g4e v;

    public ng4(q7h q7hVar, ak6 ak6Var, int i, int i2, int i3, int i4, int i5, boolean z, f4e f4eVar, z4e z4eVar, fwe fweVar, List list, kie kieVar, int i6, boolean z2) {
        q7hVar.getClass();
        ak6Var.getClass();
        fweVar.getClass();
        this.a = q7hVar;
        this.b = ak6Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = z;
        this.i = f4eVar;
        this.j = z4eVar;
        this.k = fweVar;
        this.l = list;
        this.m = kieVar;
        this.n = i6;
        this.o = z2;
    }

    @Override // defpackage.hwe
    public final boolean a() {
        return this.t != null;
    }

    @Override // defpackage.hwe
    public final hwe b() {
        return new ng4(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
    }

    @Override // defpackage.hwe
    public final g4e c() {
        fs5 fs5Var = this.i.E.C;
        fwe fweVar = this.k;
        synchronized (fs5Var) {
            fweVar.getClass();
            fs5Var.a.remove(fweVar);
        }
        g4e g4eVar = this.v;
        g4eVar.getClass();
        this.k.getClass();
        yre yreVarD = this.j.d(this, this.l);
        if (yreVarD != null) {
            return yreVarD.a;
        }
        synchronized (g4eVar) {
            ak6 ak6Var = this.b;
            ak6Var.getClass();
            TimeZone timeZone = blj.a;
            ((ConcurrentLinkedQueue) ak6Var.e).add(g4eVar);
            ((m7h) ak6Var.c).c((h4e) ak6Var.d, 0L);
            this.i.b(g4eVar);
        }
        this.i.I.j(this.i, g4eVar);
        return g4eVar;
    }

    @Override // defpackage.hwe
    public final void cancel() {
        this.p = true;
        Socket socket = this.q;
        if (socket != null) {
            blj.d(socket);
        }
    }

    @Override // defpackage.hwe
    public final gwe d() {
        Socket socket;
        Socket socket2;
        if (this.q != null) {
            sz6.j("TCP already connected");
            return null;
        }
        this.i.X.add(this);
        boolean z = false;
        try {
            try {
                tz6 tz6Var = this.i.I;
                f4e f4eVar = this.i;
                fwe fweVar = this.k;
                tz6Var.i(f4eVar, fweVar.c, fweVar.b);
                this.b.getClass();
                this.k.getClass();
                i();
                z = true;
                gwe gweVar = new gwe(this, (Throwable) null, 6);
                this.i.X.remove(this);
                return gweVar;
            } catch (IOException e) {
                fwe fweVar2 = this.k;
                cf cfVar = fweVar2.a;
                if (fweVar2.b.type() != Proxy.Type.DIRECT) {
                    cf cfVar2 = this.k.a;
                    cfVar2.g.connectFailed(cfVar2.h.j(), this.k.b.address(), e);
                }
                tz6 tz6Var2 = this.i.I;
                f4e f4eVar2 = this.i;
                fwe fweVar3 = this.k;
                tz6Var2.h(f4eVar2, fweVar3.c, fweVar3.b, e);
                this.b.getClass();
                this.k.getClass();
                gwe gweVar2 = new gwe(this, e, 2);
                this.i.X.remove(this);
                if (!z && (socket2 = this.q) != null) {
                    blj.d(socket2);
                }
                return gweVar2;
            }
        } catch (Throwable th) {
            this.i.X.remove(this);
            if (!z && (socket = this.q) != null) {
                blj.d(socket);
            }
            throw th;
        }
    }

    @Override // defpackage.x47
    public final void e() {
    }

    @Override // defpackage.x47
    public final void f(f4e f4eVar, IOException iOException) {
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x015a  */
    @Override // defpackage.hwe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.gwe g() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ng4.g():gwe");
    }

    @Override // defpackage.x47
    public final fwe h() {
        return this.k;
    }

    public final void i() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = this.k.b.type();
        int i = type == null ? -1 : mg4.a[type.ordinal()];
        if (i == 1 || i == 2) {
            socketCreateSocket = this.k.a.b.createSocket();
            socketCreateSocket.getClass();
        } else {
            socketCreateSocket = new Socket(this.k.b);
        }
        this.q = socketCreateSocket;
        if (this.p) {
            xh6.c("canceled");
            return;
        }
        socketCreateSocket.setSoTimeout(this.f);
        try {
            s4d s4dVar = s4d.a;
            s4d.a.e(socketCreateSocket, this.k.c, this.e);
            try {
                this.u = new fj0(new dpf(socketCreateSocket));
            } catch (NullPointerException e) {
                if (x44.r(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.k.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void j(SSLSocket sSLSocket, jh4 jh4Var) {
        bvd bvdVarV;
        cf cfVar = this.k.a;
        try {
            if (jh4Var.b) {
                s4d s4dVar = s4d.a;
                s4d.a.d(sSLSocket, cfVar.h.d, cfVar.i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            session.getClass();
            cf8 cf8VarY = fd9.Y(session);
            HostnameVerifier hostnameVerifier = cfVar.d;
            hostnameVerifier.getClass();
            if (hostnameVerifier.verify(cfVar.h.d, session)) {
                jg2 jg2Var = cfVar.e;
                jg2Var.getClass();
                this.s = new cf8(cf8VarY.a, cf8VarY.b, cf8VarY.c, new ka1(jg2Var, cf8VarY, cfVar, 14));
                cfVar.h.d.getClass();
                Iterator it = jg2Var.a.iterator();
                String strF = null;
                if (it.hasNext()) {
                    ij0.x(it.next());
                    throw null;
                }
                if (jh4Var.b) {
                    s4d s4dVar2 = s4d.a;
                    strF = s4d.a.f(sSLSocket);
                }
                this.r = sSLSocket;
                this.u = new fj0(new dpf(sSLSocket));
                if (strF != null) {
                    bvd.F.getClass();
                    bvdVarV = efk.v(strF);
                } else {
                    bvdVarV = bvd.HTTP_1_1;
                }
                this.t = bvdVarV;
                s4d s4dVar3 = s4d.a;
                s4d.a.getClass();
                return;
            }
            List listA = cf8VarY.a();
            if (listA.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + cfVar.h.d + " not verified (no certificates)");
            }
            Object obj = listA.get(0);
            obj.getClass();
            X509Certificate x509Certificate = (X509Certificate) obj;
            StringBuilder sb = new StringBuilder("\n            |Hostname ");
            sb.append(cfVar.h.d);
            sb.append(" not verified:\n            |    certificate: ");
            jg2 jg2Var2 = jg2.c;
            ByteString byteString = ByteString.H;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            encoded.getClass();
            sb.append("sha256/".concat(Base64.b(ByteString.Companion.c(encoded).d("SHA-256").E)));
            sb.append("\n            |    DN: ");
            sb.append(x509Certificate.getSubjectDN().getName());
            sb.append("\n            |    subjectAltNames: ");
            sb.append(w44.a1(ycc.a(x509Certificate, 7), ycc.a(x509Certificate, 2)));
            sb.append("\n            ");
            throw new SSLPeerUnverifiedException(csg.W(sb.toString()));
        } catch (Throwable th) {
            s4d s4dVar4 = s4d.a;
            s4d.a.getClass();
            blj.d(sSLSocket);
            throw th;
        }
    }

    public final gwe k() throws IOException {
        kie kieVar = this.m;
        kieVar.getClass();
        fwe fweVar = this.k;
        String str = "CONNECT " + blj.j(fweVar.a.h, true) + " HTTP/1.1";
        fj0 fj0Var = this.u;
        if (fj0Var == null) {
            x44.o0("socket");
            throw null;
        }
        qr8 qr8Var = new qr8(null, this, fj0Var);
        fj0 fj0Var2 = this.u;
        if (fj0Var2 == null) {
            x44.o0("socket");
            throw null;
        }
        Timeout e = ((RealBufferedSource) fj0Var2.F).E.getF();
        long j = this.c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        e.i(j, timeUnit);
        fj0 fj0Var3 = this.u;
        if (fj0Var3 == null) {
            x44.o0("socket");
            throw null;
        }
        ((RealBufferedSink) fj0Var3.G).E.getF().i(this.d, timeUnit);
        qr8Var.n(kieVar.c, str);
        qr8Var.c();
        nqe nqeVarG = qr8Var.g(false);
        nqeVarG.getClass();
        nqeVarG.a = kieVar;
        pqe pqeVarA = nqeVarG.a();
        int i = pqeVarA.H;
        qr8Var.m(pqeVarA);
        if (i == 200) {
            return new gwe(this, (Throwable) null, 6);
        }
        if (i != 407) {
            xh6.c(grc.p(i, "Unexpected response code for CONNECT: "));
            return null;
        }
        fweVar.a.f.getClass();
        xh6.c("Failed to authenticate with proxy");
        return null;
    }

    public final ng4 l(List list, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        list.getClass();
        int i = this.n;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            jh4 jh4Var = (jh4) list.get(i2);
            jh4Var.getClass();
            if (jh4Var.a && (((strArr = jh4Var.d) == null || zkj.f(strArr, sSLSocket.getEnabledProtocols(), cyb.E)) && ((strArr2 = jh4Var.c) == null || zkj.f(strArr2, sSLSocket.getEnabledCipherSuites(), zf3.c)))) {
                return new ng4(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, i2, i != -1);
            }
        }
        return null;
    }

    public final ng4 m(List list, SSLSocket sSLSocket) throws UnknownServiceException {
        list.getClass();
        if (this.n != -1) {
            return this;
        }
        ng4 ng4VarL = l(list, sSLSocket);
        if (ng4VarL != null) {
            return ng4VarL;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.o);
        sb.append(", modes=");
        sb.append(list);
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        enabledProtocols.getClass();
        String string = Arrays.toString(enabledProtocols);
        string.getClass();
        sb.append(", supported protocols=");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }
}
