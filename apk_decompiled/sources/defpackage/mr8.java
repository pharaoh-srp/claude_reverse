package defpackage;

import okio.Buffer;
import okio.ForwardingTimeout;
import okio.RealBufferedSink;
import okio.Sink;
import okio.Timeout;

/* JADX INFO: loaded from: classes3.dex */
public final class mr8 implements Sink {
    public final ForwardingTimeout E;
    public boolean F;
    public final /* synthetic */ qr8 G;

    public mr8(qr8 qr8Var) {
        this.G = qr8Var;
        this.E = new ForwardingTimeout(((RealBufferedSink) qr8Var.c.G).E.getF());
    }

    @Override // okio.Sink
    public final void c0(Buffer buffer, long j) {
        buffer.getClass();
        if (this.F) {
            sz6.j("closed");
            return;
        }
        if (j == 0) {
            return;
        }
        RealBufferedSink realBufferedSink = (RealBufferedSink) this.G.c.G;
        if (realBufferedSink.G) {
            sz6.j("closed");
            return;
        }
        realBufferedSink.F.O0(j);
        realBufferedSink.c();
        realBufferedSink.W("\r\n");
        realBufferedSink.c0(buffer, j);
        realBufferedSink.W("\r\n");
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.F) {
            return;
        }
        this.F = true;
        ((RealBufferedSink) this.G.c.G).W("0\r\n\r\n");
        ForwardingTimeout forwardingTimeout = this.E;
        Timeout timeout = forwardingTimeout.f;
        forwardingTimeout.f = Timeout.e;
        timeout.c();
        timeout.d();
        this.G.d = 3;
    }

    @Override // okio.Sink, java.io.Flushable
    public final synchronized void flush() {
        if (this.F) {
            return;
        }
        ((RealBufferedSink) this.G.c.G).flush();
    }

    @Override // okio.Sink
    /* JADX INFO: renamed from: l */
    public final Timeout getF() {
        return this.E;
    }
}
