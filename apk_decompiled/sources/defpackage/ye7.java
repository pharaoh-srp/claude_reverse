package defpackage;

import java.io.EOFException;
import java.io.IOException;
import okio.Buffer;
import okio.ForwardingSink;
import okio.Sink;

/* JADX INFO: loaded from: classes2.dex */
public final class ye7 extends ForwardingSink {
    public final h4 F;
    public boolean G;

    public ye7(Sink sink, h4 h4Var) {
        super(sink);
        this.F = h4Var;
    }

    @Override // okio.ForwardingSink, okio.Sink
    public final void c0(Buffer buffer, long j) throws EOFException {
        if (this.G) {
            buffer.skip(j);
            return;
        }
        try {
            super.c0(buffer, j);
        } catch (IOException e) {
            this.G = true;
            this.F.invoke(e);
        }
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.G = true;
            this.F.invoke(e);
        }
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e) {
            this.G = true;
            this.F.invoke(e);
        }
    }
}
