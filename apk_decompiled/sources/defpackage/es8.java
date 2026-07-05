package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.TimeZone;
import okhttp3.internal.http2.StreamResetException;
import okio.Buffer;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: classes.dex */
public final class es8 implements Source {
    public final long E;
    public boolean F;
    public final Buffer G = new Buffer();
    public final Buffer H = new Buffer();
    public wg8 I;
    public boolean J;
    public final /* synthetic */ gs8 K;

    public es8(gs8 gs8Var, long j, boolean z) {
        this.K = gs8Var;
        this.E = j;
        this.F = z;
    }

    @Override // okio.Source
    public final long A0(Buffer buffer, long j) throws Throwable {
        boolean z;
        Throwable streamResetException;
        long j2;
        long jA0;
        buffer.getClass();
        long j3 = 0;
        if (j < 0) {
            mr9.q(vb7.m(j, "byteCount < 0: "));
            return 0L;
        }
        while (true) {
            gs8 gs8Var = this.K;
            synchronized (gs8Var) {
                gs8Var.F.getClass();
                ds8 ds8Var = gs8Var.M;
                z = true;
                boolean z2 = ds8Var.G || ds8Var.E;
                if (z2) {
                    gs8Var.N.k();
                }
                try {
                    if (gs8Var.g() == null || this.F) {
                        streamResetException = null;
                    } else {
                        streamResetException = gs8Var.Q;
                        if (streamResetException == null) {
                            xr6 xr6VarG = gs8Var.g();
                            xr6VarG.getClass();
                            streamResetException = new StreamResetException(xr6VarG);
                        }
                    }
                    if (this.J) {
                        throw new IOException("stream closed");
                    }
                    Buffer buffer2 = this.H;
                    long j4 = buffer2.F;
                    if (j4 > j3) {
                        jA0 = buffer2.A0(buffer, Math.min(j, j4));
                        nbj.b(gs8Var.G, jA0, 0L, 2);
                        long jA = gs8Var.G.a();
                        if (streamResetException == null) {
                            j2 = j3;
                            if (jA >= gs8Var.F.V.a() / 2) {
                                gs8Var.F.x(gs8Var.E, jA);
                                nbj.b(gs8Var.G, 0L, jA, 1);
                            }
                        } else {
                            j2 = j3;
                        }
                        z = false;
                    } else {
                        j2 = j3;
                        if (this.F || streamResetException != null) {
                            z = false;
                        } else {
                            try {
                                gs8Var.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException();
                            }
                        }
                        jA0 = -1;
                    }
                } finally {
                    if (z2) {
                        gs8Var.N.o();
                    }
                }
            }
            this.K.F.U.getClass();
            if (!z) {
                if (jA0 != -1) {
                    return jA0;
                }
                if (streamResetException == null) {
                    return -1L;
                }
                throw streamResetException;
            }
            j3 = j2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        gs8 gs8Var = this.K;
        synchronized (gs8Var) {
            this.J = true;
            Buffer buffer = this.H;
            j = buffer.F;
            buffer.c();
            gs8Var.notifyAll();
        }
        if (j > 0) {
            gs8 gs8Var2 = this.K;
            TimeZone timeZone = blj.a;
            gs8Var2.F.i(j);
        }
        this.K.a();
    }

    @Override // okio.Source
    /* JADX INFO: renamed from: l */
    public final Timeout getF() {
        return this.K.N;
    }
}
