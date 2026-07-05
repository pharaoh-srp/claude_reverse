package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import okio.BufferedSource;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Sink;
import okio.Socket;
import okio.Source;

/* JADX INFO: loaded from: classes3.dex */
public final class qr8 implements y47 {
    public static final wg8 g;
    public final hdc a;
    public final x47 b;
    public final fj0 c;
    public int d;
    public final xg8 e;
    public wg8 f;

    static {
        wg8 wg8Var = wg8.F;
        g = kxk.F("OkHttp-Response-Body", "Truncated");
    }

    public qr8(hdc hdcVar, x47 x47Var, fj0 fj0Var) {
        fj0Var.getClass();
        this.a = hdcVar;
        this.b = x47Var;
        this.c = fj0Var;
        RealBufferedSource realBufferedSource = (RealBufferedSource) fj0Var.F;
        realBufferedSource.getClass();
        xg8 xg8Var = new xg8();
        xg8Var.F = realBufferedSource;
        xg8Var.E = 262144L;
        this.e = xg8Var;
    }

    @Override // defpackage.y47
    public final Source a(pqe pqeVar) {
        kie kieVar = pqeVar.E;
        if (!js8.a(pqeVar)) {
            return l(kieVar.a, 0L);
        }
        String strA = pqeVar.J.a("Transfer-Encoding");
        if (strA == null) {
            strA = null;
        }
        if ("chunked".equalsIgnoreCase(strA)) {
            vs8 vs8Var = kieVar.a;
            if (this.d == 4) {
                this.d = 5;
                return new nr8(this, vs8Var);
            }
            mr9.v(this.d, "state: ");
            return null;
        }
        long jF = blj.f(pqeVar);
        if (jF != -1) {
            return l(kieVar.a, jF);
        }
        vs8 vs8Var2 = kieVar.a;
        if (this.d != 4) {
            mr9.v(this.d, "state: ");
            return null;
        }
        this.d = 5;
        this.b.e();
        vs8Var2.getClass();
        return new pr8(this, vs8Var2);
    }

    @Override // defpackage.y47
    public final void b(kie kieVar) {
        kieVar.getClass();
        Proxy.Type type = this.b.h().b.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(kieVar.b);
        sb.append(' ');
        vs8 vs8Var = kieVar.a;
        if (x44.r(vs8Var.a, "https") || type != Proxy.Type.HTTP) {
            String strB = vs8Var.b();
            String strD = vs8Var.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb.append(strB);
        } else {
            sb.append(vs8Var);
        }
        sb.append(" HTTP/1.1");
        n(kieVar.c, sb.toString());
    }

    @Override // defpackage.y47
    public final void c() {
        ((RealBufferedSink) this.c.G).flush();
    }

    @Override // defpackage.y47
    public final void cancel() {
        this.b.cancel();
    }

    @Override // defpackage.y47
    public final boolean d() {
        return this.d == 6;
    }

    @Override // defpackage.y47
    public final long e(pqe pqeVar) {
        if (!js8.a(pqeVar)) {
            return 0L;
        }
        String strA = pqeVar.J.a("Transfer-Encoding");
        if (strA == null) {
            strA = null;
        }
        if ("chunked".equalsIgnoreCase(strA)) {
            return -1L;
        }
        return blj.f(pqeVar);
    }

    @Override // defpackage.y47
    public final Sink f(kie kieVar, long j) throws ProtocolException {
        kieVar.getClass();
        tie tieVar = kieVar.d;
        if (tieVar != null && tieVar.isDuplex()) {
            mr9.s("Duplex connections are not supported for HTTP/1");
            return null;
        }
        if ("chunked".equalsIgnoreCase(kieVar.c.a("Transfer-Encoding"))) {
            if (this.d == 1) {
                this.d = 2;
                return new mr8(this);
            }
            mr9.v(this.d, "state: ");
            return null;
        }
        if (j == -1) {
            sz6.j("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        }
        if (this.d == 1) {
            this.d = 2;
            return new xe7(this);
        }
        mr9.v(this.d, "state: ");
        return null;
    }

    @Override // defpackage.y47
    public final nqe g(boolean z) {
        xg8 xg8Var = this.e;
        int i = this.d;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            mr9.v(this.d, "state: ");
            return null;
        }
        try {
            String strO = ((BufferedSource) xg8Var.F).O(xg8Var.E);
            xg8Var.E -= (long) strO.length();
            l94 l94VarO = sf5.O(strO);
            int i2 = l94VarO.b;
            nqe nqeVar = new nqe();
            nqeVar.b = (bvd) l94VarO.c;
            nqeVar.c = i2;
            nqeVar.d = (String) l94VarO.d;
            nqeVar.f = xg8Var.v().g();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.d = 3;
                return nqeVar;
            }
            if (102 > i2 || i2 >= 200) {
                this.d = 4;
                return nqeVar;
            }
            this.d = 3;
            return nqeVar;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.b.h().a.h.h()), e);
        }
    }

    @Override // defpackage.y47
    public final wg8 h() throws IOException {
        wg8 wg8Var = this.f;
        if (wg8Var == g) {
            xh6.c("Trailers cannot be read because the response body was truncated");
            return null;
        }
        int i = this.d;
        if (i == 5 || i == 6) {
            return wg8Var;
        }
        mr9.v(this.d, "Trailers cannot be read because the state is ");
        return null;
    }

    @Override // defpackage.y47
    public final void i() {
        ((RealBufferedSink) this.c.G).flush();
    }

    @Override // defpackage.y47
    public final Socket j() {
        return this.c;
    }

    @Override // defpackage.y47
    public final x47 k() {
        return this.b;
    }

    public final or8 l(vs8 vs8Var, long j) {
        if (this.d == 4) {
            this.d = 5;
            return new or8(this, vs8Var, j);
        }
        mr9.v(this.d, "state: ");
        return null;
    }

    public final void m(pqe pqeVar) {
        long jF = blj.f(pqeVar);
        if (jF == -1) {
            return;
        }
        or8 or8VarL = l(pqeVar.E.a, jF);
        blj.h(or8VarL, Integer.MAX_VALUE);
        or8VarL.close();
    }

    public final void n(wg8 wg8Var, String str) {
        wg8Var.getClass();
        if (this.d != 0) {
            mr9.v(this.d, "state: ");
            return;
        }
        fj0 fj0Var = this.c;
        RealBufferedSink realBufferedSink = (RealBufferedSink) fj0Var.G;
        realBufferedSink.W(str);
        realBufferedSink.W("\r\n");
        int size = wg8Var.size();
        int i = 0;
        while (true) {
            RealBufferedSink realBufferedSink2 = (RealBufferedSink) fj0Var.G;
            if (i >= size) {
                realBufferedSink2.W("\r\n");
                this.d = 1;
                return;
            } else {
                realBufferedSink2.W(wg8Var.e(i));
                realBufferedSink2.W(": ");
                realBufferedSink2.W(wg8Var.k(i));
                realBufferedSink2.W("\r\n");
                i++;
            }
        }
    }
}
