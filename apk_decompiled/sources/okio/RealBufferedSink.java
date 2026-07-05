package okio;

import defpackage.mdj;
import defpackage.sz6;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/RealBufferedSink;", "Lokio/BufferedSink;", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class RealBufferedSink implements BufferedSink {
    public final Sink E;
    public final Buffer F;
    public boolean G;

    public RealBufferedSink(Sink sink) {
        sink.getClass();
        this.E = sink;
        this.F = new Buffer();
    }

    @Override // okio.BufferedSink
    public final BufferedSink E(int i) {
        if (this.G) {
            sz6.j("closed");
            return null;
        }
        this.F.P0(SegmentedByteString.c(i));
        c();
        return this;
    }

    @Override // okio.BufferedSink
    public final OutputStream K0() {
        return new RealBufferedSink$outputStream$1(this);
    }

    @Override // okio.BufferedSink
    public final BufferedSink W(String str) {
        str.getClass();
        if (this.G) {
            sz6.j("closed");
            return null;
        }
        this.F.T0(str);
        c();
        return this;
    }

    public final BufferedSink c() {
        if (this.G) {
            sz6.j("closed");
            return null;
        }
        Buffer buffer = this.F;
        long jD = buffer.d();
        if (jD > 0) {
            this.E.c0(buffer, jD);
        }
        return this;
    }

    @Override // okio.Sink
    public final void c0(Buffer buffer, long j) {
        buffer.getClass();
        if (this.G) {
            sz6.j("closed");
        } else {
            this.F.c0(buffer, j);
            c();
        }
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Sink sink = this.E;
        if (this.G) {
            return;
        }
        try {
            Buffer buffer = this.F;
            long j = buffer.F;
            if (j > 0) {
                sink.c0(buffer, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            sink.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.G = true;
        if (th != null) {
            throw th;
        }
    }

    public final BufferedSink d(long j) {
        if (this.G) {
            sz6.j("closed");
            return null;
        }
        this.F.D0(j);
        c();
        return this;
    }

    @Override // okio.BufferedSink
    public final long f0(Source source) {
        source.getClass();
        long j = 0;
        while (true) {
            long jA0 = source.A0(this.F, 8192L);
            if (jA0 == -1) {
                return j;
            }
            j += jA0;
            c();
        }
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public final void flush() {
        if (this.G) {
            sz6.j("closed");
            return;
        }
        Buffer buffer = this.F;
        long j = buffer.F;
        Sink sink = this.E;
        if (j > 0) {
            sink.c0(buffer, j);
        }
        sink.flush();
    }

    @Override // okio.BufferedSink
    public final BufferedSink i0(int i, int i2, String str) {
        str.getClass();
        if (this.G) {
            sz6.j("closed");
            return null;
        }
        this.F.S0(i, i2, str);
        c();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.G;
    }

    @Override // okio.BufferedSink
    /* JADX INFO: renamed from: k, reason: from getter */
    public final Buffer getF() {
        return this.F;
    }

    @Override // okio.Sink
    public final Timeout l() {
        return this.E.l();
    }

    public final String toString() {
        return "buffer(" + this.E + ')';
    }

    @Override // okio.BufferedSink
    public final BufferedSink write(byte[] bArr) {
        bArr.getClass();
        if (this.G) {
            sz6.j("closed");
            return null;
        }
        this.F.m1202write(bArr, 0, bArr.length);
        c();
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeByte(int i) {
        if (this.G) {
            sz6.j("closed");
            return null;
        }
        this.F.B0(i);
        c();
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeInt(int i) {
        if (this.G) {
            sz6.j("closed");
            return null;
        }
        this.F.P0(i);
        c();
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeShort(int i) {
        if (this.G) {
            sz6.j("closed");
            return null;
        }
        this.F.R0(i);
        c();
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink y(long j) {
        if (this.G) {
            sz6.j("closed");
            return null;
        }
        this.F.Q0(SegmentedByteString.d(j));
        c();
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink z0(ByteString byteString) {
        byteString.getClass();
        if (this.G) {
            sz6.j("closed");
            return null;
        }
        this.F.r0(byteString);
        c();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (!this.G) {
            int iWrite = this.F.write(byteBuffer);
            c();
            return iWrite;
        }
        sz6.j("closed");
        return 0;
    }

    @Override // okio.BufferedSink
    public final BufferedSink write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (!this.G) {
            this.F.m1202write(bArr, i, i2);
            c();
            return this;
        }
        sz6.j("closed");
        return null;
    }
}
