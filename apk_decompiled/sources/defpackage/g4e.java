package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import okio.RealBufferedSource;

/* JADX INFO: loaded from: classes.dex */
public final class g4e extends xr8 implements x47 {
    public final q7h b;
    public final fwe c;
    public final Socket d;
    public final Socket e;
    public final cf8 f;
    public final bvd g;
    public final fj0 h;
    public final int i;
    public zr8 j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public int p;
    public final ArrayList q;
    public long r;

    public g4e(q7h q7hVar, ak6 ak6Var, fwe fweVar, Socket socket, Socket socket2, cf8 cf8Var, bvd bvdVar, fj0 fj0Var, int i) {
        q7hVar.getClass();
        ak6Var.getClass();
        fweVar.getClass();
        socket.getClass();
        socket2.getClass();
        bvdVar.getClass();
        fj0Var.getClass();
        this.b = q7hVar;
        this.c = fweVar;
        this.d = socket;
        this.e = socket2;
        this.f = cf8Var;
        this.g = bvdVar;
        this.h = fj0Var;
        this.i = i;
        this.p = 1;
        this.q = new ArrayList();
        this.r = Long.MAX_VALUE;
    }

    public static void c(hdc hdcVar, fwe fweVar, IOException iOException) {
        hdcVar.getClass();
        fweVar.getClass();
        iOException.getClass();
        if (fweVar.b.type() != Proxy.Type.DIRECT) {
            cf cfVar = fweVar.a;
            cfVar.g.connectFailed(cfVar.h.j(), fweVar.b.address(), iOException);
        }
        fs5 fs5Var = hdcVar.C;
        synchronized (fs5Var) {
            fs5Var.a.add(fweVar);
        }
    }

    @Override // defpackage.xr8
    public final void a(zr8 zr8Var, dyf dyfVar) {
        dyfVar.getClass();
        synchronized (this) {
            this.p = (dyfVar.a & 8) != 0 ? dyfVar.b[3] : Integer.MAX_VALUE;
        }
    }

    @Override // defpackage.xr8
    public final void b(gs8 gs8Var) {
        gs8Var.c(xr6.REFUSED_STREAM, null);
    }

    @Override // defpackage.x47
    public final void cancel() {
        blj.d(this.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(defpackage.cf r9, java.util.List r10) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g4e.d(cf, java.util.List):boolean");
    }

    @Override // defpackage.x47
    public final void e() {
        synchronized (this) {
            this.k = true;
        }
    }

    @Override // defpackage.x47
    public final void f(f4e f4eVar, IOException iOException) {
        synchronized (this) {
            try {
                if (!(iOException instanceof StreamResetException)) {
                    if (!(this.j != null) || (iOException instanceof ConnectionShutdownException)) {
                        this.k = true;
                        if (this.n == 0) {
                            if (iOException != null) {
                                c(f4eVar.E, this.c, iOException);
                            }
                            this.m++;
                        }
                    }
                } else if (((StreamResetException) iOException).E == xr6.REFUSED_STREAM) {
                    int i = this.o + 1;
                    this.o = i;
                    if (i > 1) {
                        this.k = true;
                        this.m++;
                    }
                } else if (((StreamResetException) iOException).E != xr6.CANCEL || !f4eVar.V) {
                    this.k = true;
                    this.m++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean g(boolean z) {
        long j;
        TimeZone timeZone = blj.a;
        long jNanoTime = System.nanoTime();
        if (this.d.isClosed() || this.e.isClosed() || this.e.isInputShutdown() || this.e.isOutputShutdown()) {
            return false;
        }
        zr8 zr8Var = this.j;
        if (zr8Var != null) {
            synchronized (zr8Var) {
                if (zr8Var.J) {
                    return false;
                }
                if (zr8Var.S < zr8Var.R) {
                    if (jNanoTime >= zr8Var.T) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.r;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        Socket socket = this.e;
        RealBufferedSource realBufferedSource = (RealBufferedSource) this.h.F;
        socket.getClass();
        realBufferedSource.getClass();
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !realBufferedSource.F();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // defpackage.x47
    public final fwe h() {
        return this.c;
    }

    public final void i() throws SocketException {
        this.r = System.nanoTime();
        bvd bvdVar = this.g;
        if (bvdVar == bvd.HTTP_2 || bvdVar == bvd.H2_PRIOR_KNOWLEDGE) {
            this.e.setSoTimeout(0);
            efk efkVar = efk.F;
            mp7 mp7Var = mp7.a;
            q7h q7hVar = this.b;
            q7hVar.getClass();
            vr8 vr8Var = new vr8();
            vr8Var.b = q7hVar;
            vr8Var.e = xr8.a;
            vr8Var.f = mp7.a;
            fj0 fj0Var = this.h;
            String str = this.c.a.h.d;
            fj0Var.getClass();
            str.getClass();
            vr8Var.c = fj0Var;
            vr8Var.d = blj.b + ' ' + str;
            vr8Var.e = this;
            vr8Var.a = this.i;
            vr8Var.f = mp7Var;
            zr8 zr8Var = new zr8(vr8Var);
            this.j = zr8Var;
            dyf dyfVar = zr8.e0;
            this.p = (dyfVar.a & 8) != 0 ? dyfVar.b[3] : Integer.MAX_VALUE;
            hs8 hs8Var = zr8Var.b0;
            synchronized (hs8Var) {
                try {
                    if (hs8Var.H) {
                        throw new IOException("closed");
                    }
                    Logger logger = hs8.J;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(blj.e(">> CONNECTION " + rr8.a.f(), new Object[0]));
                    }
                    hs8Var.E.z0(rr8.a);
                    hs8Var.E.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
            hs8 hs8Var2 = zr8Var.b0;
            dyf dyfVar2 = zr8Var.V;
            hs8Var2.getClass();
            dyfVar2.getClass();
            synchronized (hs8Var2) {
                try {
                    if (hs8Var2.H) {
                        throw new IOException("closed");
                    }
                    hs8Var2.e(0, Integer.bitCount(dyfVar2.a) * 6, 4, 0);
                    for (int i = 0; i < 10; i++) {
                        boolean z = true;
                        if (((1 << i) & dyfVar2.a) == 0) {
                            z = false;
                        }
                        if (z) {
                            hs8Var2.E.writeShort(i);
                            hs8Var2.E.writeInt(dyfVar2.b[i]);
                        }
                    }
                    hs8Var2.E.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (zr8Var.V.a() != 65535) {
                zr8Var.b0.x(0, r7 - 65535);
            }
            m7h.b(zr8Var.K.d(), zr8Var.G, 0L, zr8Var.c0, 6);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        fwe fweVar = this.c;
        sb.append(fweVar.a.h.d);
        sb.append(':');
        sb.append(fweVar.a.h.e);
        sb.append(", proxy=");
        sb.append(fweVar.b);
        sb.append(" hostAddress=");
        sb.append(fweVar.c);
        sb.append(" cipherSuite=");
        cf8 cf8Var = this.f;
        sb.append(cf8Var != null ? cf8Var.b : "none");
        sb.append(" protocol=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }
}
