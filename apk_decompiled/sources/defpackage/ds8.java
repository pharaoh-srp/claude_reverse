package defpackage;

import java.io.InterruptedIOException;
import java.util.TimeZone;
import okio.Buffer;
import okio.Sink;
import okio.Timeout;

/* JADX INFO: loaded from: classes.dex */
public final class ds8 implements Sink {
    public final boolean E;
    public final Buffer F = new Buffer();
    public boolean G;
    public final /* synthetic */ gs8 H;

    public ds8(gs8 gs8Var, boolean z) {
        this.H = gs8Var;
        this.E = z;
    }

    /* JADX WARN: Finally extract failed */
    public final void c(boolean z) {
        long jMin;
        boolean z2;
        gs8 gs8Var = this.H;
        synchronized (gs8Var) {
            gs8Var.O.k();
            while (gs8Var.H >= gs8Var.I && !this.E && !this.G && gs8Var.g() == null) {
                try {
                    try {
                        gs8Var.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    gs8Var.O.o();
                    throw th;
                }
            }
            gs8Var.O.o();
            gs8Var.b();
            jMin = Math.min(gs8Var.I - gs8Var.H, this.F.F);
            gs8Var.H += jMin;
            z2 = z && jMin == this.F.F;
        }
        this.H.O.k();
        try {
            gs8 gs8Var2 = this.H;
            gs8Var2.F.j(gs8Var2.E, z2, this.F, jMin);
        } finally {
            this.H.O.o();
        }
    }

    @Override // okio.Sink
    public final void c0(Buffer buffer, long j) {
        buffer.getClass();
        TimeZone timeZone = blj.a;
        Buffer buffer2 = this.F;
        buffer2.c0(buffer, j);
        while (buffer2.F >= 16384) {
            c(false);
        }
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        gs8 gs8Var = this.H;
        TimeZone timeZone = blj.a;
        synchronized (gs8Var) {
            if (this.G) {
                return;
            }
            boolean z = gs8Var.g() == null;
            gs8 gs8Var2 = this.H;
            if (!gs8Var2.M.E) {
                if (this.F.F > 0) {
                    while (this.F.F > 0) {
                        c(true);
                    }
                } else if (z) {
                    gs8Var2.F.j(gs8Var2.E, true, null, 0L);
                }
            }
            gs8 gs8Var3 = this.H;
            synchronized (gs8Var3) {
                this.G = true;
                gs8Var3.notifyAll();
            }
            this.H.F.flush();
            this.H.a();
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() {
        gs8 gs8Var = this.H;
        TimeZone timeZone = blj.a;
        synchronized (gs8Var) {
            gs8Var.b();
        }
        while (this.F.F > 0) {
            c(false);
            this.H.F.flush();
        }
    }

    @Override // okio.Sink
    /* JADX INFO: renamed from: l */
    public final Timeout getF() {
        return this.H.O;
    }
}
