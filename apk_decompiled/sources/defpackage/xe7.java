package defpackage;

import java.io.EOFException;
import java.io.IOException;
import okio.Buffer;
import okio.ForwardingTimeout;
import okio.RealBufferedSink;
import okio.Sink;
import okio.Timeout;

/* JADX INFO: loaded from: classes3.dex */
public final class xe7 implements Sink {
    public final /* synthetic */ int E = 0;
    public boolean F;
    public final Object G;
    public final Object H;

    public xe7(qr8 qr8Var) {
        this.H = qr8Var;
        this.G = new ForwardingTimeout(((RealBufferedSink) qr8Var.c.G).E.getF());
    }

    @Override // okio.Sink
    public final void c0(Buffer buffer, long j) throws EOFException {
        int i = this.E;
        Object obj = this.H;
        switch (i) {
            case 0:
                if (this.F) {
                    buffer.skip(j);
                } else {
                    try {
                        ((Sink) this.G).c0(buffer, j);
                    } catch (IOException e) {
                        this.F = true;
                        ((py3) obj).invoke(e);
                        return;
                    }
                }
                break;
            default:
                buffer.getClass();
                if (!this.F) {
                    zkj.a(buffer.F, 0L, j);
                    ((RealBufferedSink) ((qr8) obj).c.G).c0(buffer, j);
                } else {
                    sz6.j("closed");
                }
                break;
        }
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.E;
        Object obj = this.G;
        Object obj2 = this.H;
        switch (i) {
            case 0:
                try {
                    ((Sink) obj).close();
                } catch (IOException e) {
                    this.F = true;
                    ((py3) obj2).invoke(e);
                    return;
                }
                break;
            default:
                qr8 qr8Var = (qr8) obj2;
                if (!this.F) {
                    this.F = true;
                    ForwardingTimeout forwardingTimeout = (ForwardingTimeout) obj;
                    Timeout timeout = forwardingTimeout.f;
                    forwardingTimeout.f = Timeout.e;
                    timeout.c();
                    timeout.d();
                    qr8Var.d = 3;
                    break;
                }
                break;
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() {
        int i = this.E;
        Object obj = this.H;
        switch (i) {
            case 0:
                try {
                    ((Sink) this.G).flush();
                } catch (IOException e) {
                    this.F = true;
                    ((py3) obj).invoke(e);
                    return;
                }
                break;
            default:
                if (!this.F) {
                    ((RealBufferedSink) ((qr8) obj).c.G).flush();
                    break;
                }
                break;
        }
    }

    @Override // okio.Sink
    /* JADX INFO: renamed from: l */
    public final Timeout getF() {
        switch (this.E) {
            case 0:
                return ((Sink) this.G).getF();
            default:
                return (ForwardingTimeout) this.G;
        }
    }

    public xe7(Sink sink, py3 py3Var) {
        this.G = sink;
        this.H = py3Var;
    }
}
