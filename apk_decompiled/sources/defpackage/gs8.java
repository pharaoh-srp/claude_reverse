package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;
import okhttp3.internal.http2.StreamResetException;
import okio.Sink;
import okio.Socket;
import okio.Source;

/* JADX INFO: loaded from: classes.dex */
public final class gs8 implements Socket {
    public final int E;
    public final zr8 F;
    public final nbj G;
    public long H;
    public long I;
    public final ArrayDeque J;
    public boolean K;
    public final es8 L;
    public final ds8 M;
    public final fs8 N;
    public final fs8 O;
    public xr6 P;
    public IOException Q;

    public gs8(int i, zr8 zr8Var, boolean z, boolean z2, wg8 wg8Var) {
        zr8Var.getClass();
        this.E = i;
        this.F = zr8Var;
        this.G = new nbj(i);
        this.I = zr8Var.W.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.J = arrayDeque;
        this.L = new es8(this, zr8Var.V.a(), z2);
        this.M = new ds8(this, z);
        this.N = new fs8(this);
        this.O = new fs8(this);
        if (wg8Var == null) {
            if (h()) {
                return;
            }
            sz6.j("remotely-initiated streams should have headers");
            throw null;
        }
        if (h()) {
            sz6.j("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(wg8Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r2 = this;
            java.util.TimeZone r0 = defpackage.blj.a
            monitor-enter(r2)
            es8 r0 = r2.L     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.F     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1c
            boolean r0 = r0.J     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            ds8 r0 = r2.M     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.E     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1a
            boolean r0 = r0.G     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            goto L1a
        L18:
            r0 = move-exception
            goto L35
        L1a:
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            boolean r1 = r2.i()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            if (r0 == 0) goto L2b
            xr6 r0 = defpackage.xr6.CANCEL
            r1 = 0
            r2.c(r0, r1)
            return
        L2b:
            if (r1 != 0) goto L34
            zr8 r0 = r2.F
            int r2 = r2.E
            r0.e(r2)
        L34:
            return
        L35:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gs8.a():void");
    }

    public final void b() throws IOException {
        ds8 ds8Var = this.M;
        if (ds8Var.G) {
            xh6.c("stream closed");
            return;
        }
        if (ds8Var.E) {
            xh6.c("stream finished");
            return;
        }
        if (g() != null) {
            IOException iOException = this.Q;
            if (iOException != null) {
                throw iOException;
            }
            xr6 xr6VarG = g();
            xr6VarG.getClass();
            throw new StreamResetException(xr6VarG);
        }
    }

    public final void c(xr6 xr6Var, IOException iOException) {
        if (e(xr6Var, iOException)) {
            zr8 zr8Var = this.F;
            zr8Var.getClass();
            zr8Var.b0.n(this.E, xr6Var);
        }
    }

    @Override // okio.Socket
    public final void cancel() {
        f(xr6.CANCEL);
    }

    @Override // okio.Socket
    public final Source d() {
        return this.L;
    }

    public final boolean e(xr6 xr6Var, IOException iOException) {
        TimeZone timeZone = blj.a;
        synchronized (this) {
            if (g() != null) {
                return false;
            }
            this.P = xr6Var;
            this.Q = iOException;
            notifyAll();
            if (this.L.F) {
                if (this.M.E) {
                    return false;
                }
            }
            this.F.e(this.E);
            return true;
        }
    }

    public final void f(xr6 xr6Var) {
        if (e(xr6Var, null)) {
            this.F.n(this.E, xr6Var);
        }
    }

    public final xr6 g() {
        xr6 xr6Var;
        synchronized (this) {
            xr6Var = this.P;
        }
        return xr6Var;
    }

    public final boolean h() {
        boolean z = (this.E & 1) == 1;
        this.F.getClass();
        return true == z;
    }

    public final boolean i() {
        synchronized (this) {
            try {
                if (g() != null) {
                    return false;
                }
                es8 es8Var = this.L;
                if (es8Var.F || es8Var.J) {
                    ds8 ds8Var = this.M;
                    if (ds8Var.E || ds8Var.G) {
                        if (this.K) {
                            return false;
                        }
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(wg8 wg8Var, boolean z) {
        boolean zI;
        wg8Var.getClass();
        TimeZone timeZone = blj.a;
        synchronized (this) {
            try {
                if (this.K && wg8Var.a(":status") == null && wg8Var.a(":method") == null) {
                    this.L.I = wg8Var;
                } else {
                    this.K = true;
                    this.J.add(wg8Var);
                }
                if (z) {
                    this.L.F = true;
                }
                zI = i();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zI) {
            return;
        }
        this.F.e(this.E);
    }

    @Override // okio.Socket
    public final Sink n() {
        return this.M;
    }
}
