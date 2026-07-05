package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import okio.Buffer;
import okio.ForwardingSink;
import okio.Sink;

/* JADX INFO: loaded from: classes.dex */
public final class u47 extends ForwardingSink {
    public final long F;
    public final boolean G;
    public boolean H;
    public long I;
    public boolean J;
    public boolean K;
    public final /* synthetic */ w47 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u47(w47 w47Var, Sink sink, long j, boolean z) {
        super(sink);
        sink.getClass();
        this.L = w47Var;
        this.F = j;
        this.G = z;
        this.J = z;
    }

    public final IOException c(IOException iOException) {
        if (this.H) {
            return iOException;
        }
        this.H = true;
        return w47.a(this.L, this.I, this.G, true, iOException, 4);
    }

    @Override // okio.ForwardingSink, okio.Sink
    public final void c0(Buffer buffer, long j) throws IOException {
        buffer.getClass();
        if (this.K) {
            sz6.j("closed");
            return;
        }
        long j2 = this.F;
        if (j2 != -1 && this.I + j > j2) {
            throw new ProtocolException("expected " + this.F + " bytes but received " + (this.I + j));
        }
        try {
            if (this.J) {
                this.J = false;
                ((f4e) this.L.c).I.q((f4e) this.L.c);
            }
            this.E.c0(buffer, j);
            this.I += j;
        } catch (IOException e) {
            IOException iOExceptionC = c(e);
            iOExceptionC.getClass();
            throw iOExceptionC;
        }
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.K) {
            return;
        }
        this.K = true;
        long j = this.F;
        if (j != -1 && this.I != j) {
            mr9.s("unexpected end of stream");
            return;
        }
        try {
            super.close();
            c(null);
        } catch (IOException e) {
            IOException iOExceptionC = c(e);
            iOExceptionC.getClass();
            throw iOExceptionC;
        }
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e) {
            IOException iOExceptionC = c(e);
            iOExceptionC.getClass();
            throw iOExceptionC;
        }
    }
}
