package okio;

import defpackage.d;
import defpackage.dj2;
import defpackage.djk;
import defpackage.mdj;
import defpackage.mr9;
import defpackage.sz6;
import defpackage.vb7;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/RealBufferedSource;", "Lokio/BufferedSource;", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class RealBufferedSource implements BufferedSource {
    public final Source E;
    public final Buffer F;
    public boolean G;

    public RealBufferedSource(Source source) {
        source.getClass();
        this.E = source;
        this.F = new Buffer();
    }

    @Override // okio.Source
    public final long A0(Buffer buffer, long j) {
        buffer.getClass();
        if (j < 0) {
            mr9.q(vb7.m(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.G) {
            sz6.j("closed");
            return 0L;
        }
        Buffer buffer2 = this.F;
        if (buffer2.F == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.E.A0(buffer2, 8192L) == -1) {
                return -1L;
            }
        }
        return buffer2.A0(buffer, Math.min(j, buffer2.F));
    }

    @Override // okio.BufferedSource
    public final byte[] B() {
        Source source = this.E;
        Buffer buffer = this.F;
        buffer.f0(source);
        return buffer.K(buffer.F);
    }

    @Override // okio.BufferedSource
    public final long C(ByteString byteString) {
        byteString.getClass();
        return djk.g(this, byteString, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public final long C0() throws EOFException {
        I0(8L);
        return this.F.C0();
    }

    @Override // okio.BufferedSource
    public final boolean F() {
        if (this.G) {
            sz6.j("closed");
            return false;
        }
        Buffer buffer = this.F;
        return buffer.F() && this.E.A0(buffer, 8192L) == -1;
    }

    @Override // okio.BufferedSource
    public final long F0(BufferedSink bufferedSink) {
        Buffer buffer;
        long j = 0;
        while (true) {
            Source source = this.E;
            buffer = this.F;
            if (source.A0(buffer, 8192L) == -1) {
                break;
            }
            long jD = buffer.d();
            if (jD > 0) {
                j += jD;
                bufferedSink.c0(buffer, jD);
            }
        }
        long j2 = buffer.F;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        bufferedSink.c0(buffer, j2);
        return j3;
    }

    @Override // okio.BufferedSource
    public final void I0(long j) throws EOFException {
        if (j0(j)) {
            return;
        }
        sz6.n();
    }

    @Override // okio.BufferedSource
    public final void J(Buffer buffer, long j) throws EOFException {
        Buffer buffer2 = this.F;
        try {
            I0(j);
            buffer2.J(buffer, j);
        } catch (EOFException e) {
            buffer.f0(buffer2);
            throw e;
        }
    }

    @Override // okio.BufferedSource
    public final long L(ByteString byteString) {
        byteString.getClass();
        long jMax = 0;
        if (this.G) {
            sz6.j("closed");
            return 0L;
        }
        while (true) {
            Buffer buffer = this.F;
            long jN = buffer.n(jMax, byteString);
            if (jN != -1) {
                return jN;
            }
            long j = buffer.F;
            if (this.E.A0(buffer, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j);
        }
    }

    @Override // okio.BufferedSource
    public final InputStream M0() {
        return new RealBufferedSource$inputStream$1(this);
    }

    @Override // okio.BufferedSource
    public final int N0(Options options) throws EOFException {
        options.getClass();
        if (this.G) {
            sz6.j("closed");
            return 0;
        }
        while (true) {
            Buffer buffer = this.F;
            int iD = d.d(buffer, options, true);
            if (iD != -2) {
                if (iD != -1) {
                    buffer.skip(options.E[iD].e());
                    return iD;
                }
            } else if (this.E.A0(buffer, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // okio.BufferedSource
    public final String O(long j) throws EOFException {
        if (j < 0) {
            mr9.q(vb7.m(j, "limit < 0: "));
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jC = c((byte) 10, 0L, j2);
        Buffer buffer = this.F;
        if (jC != -1) {
            return d.c(buffer, jC);
        }
        if (j2 < Long.MAX_VALUE && j0(j2) && buffer.i(j2 - 1) == 13 && j0(j2 + 1) && buffer.i(j2) == 10) {
            return d.c(buffer, j2);
        }
        Buffer buffer2 = new Buffer();
        buffer.f(buffer2, 0L, Math.min(32L, buffer.F));
        throw new EOFException("\\n not found: limit=" + Math.min(buffer.F, j) + " content=" + buffer2.t(buffer2.F).f() + (char) 8230);
    }

    @Override // okio.BufferedSource
    public final boolean Y(long j, ByteString byteString) {
        byteString.getClass();
        int iE = byteString.e();
        if (!this.G) {
            return iE >= 0 && iE <= byteString.e() && (iE == 0 || djk.f(this, byteString, iE, 1L) != -1);
        }
        sz6.j("closed");
        return false;
    }

    @Override // okio.BufferedSource
    public final String Z(Charset charset) {
        charset.getClass();
        Source source = this.E;
        Buffer buffer = this.F;
        buffer.f0(source);
        return buffer.S(buffer.F, charset);
    }

    public final long c(byte b, long j, long j2) {
        if (this.G) {
            sz6.j("closed");
            return 0L;
        }
        if (0 > j2) {
            mr9.q(vb7.m(j2, "fromIndex=0 toIndex="));
            return 0L;
        }
        long jMax = 0;
        while (jMax < j2) {
            Buffer buffer = this.F;
            byte b2 = b;
            long j3 = j2;
            long j4 = buffer.j(b2, jMax, j3);
            if (j4 != -1) {
                return j4;
            }
            long j5 = buffer.F;
            if (j5 >= j3 || this.E.A0(buffer, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j5);
            b = b2;
            j2 = j3;
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.G) {
            return;
        }
        this.G = true;
        this.E.close();
        this.F.c();
    }

    public final short d() throws EOFException {
        I0(2L);
        return this.F.R();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.G;
    }

    @Override // okio.BufferedSource
    public final boolean j0(long j) {
        Buffer buffer;
        if (j < 0) {
            mr9.q(vb7.m(j, "byteCount < 0: "));
            return false;
        }
        if (this.G) {
            sz6.j("closed");
            return false;
        }
        do {
            buffer = this.F;
            if (buffer.F >= j) {
                return true;
            }
        } while (this.E.A0(buffer, 8192L) != -1);
        return false;
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    /* JADX INFO: renamed from: k, reason: from getter */
    public final Buffer getF() {
        return this.F;
    }

    @Override // okio.Source
    public final Timeout l() {
        return this.E.l();
    }

    @Override // okio.BufferedSource
    public final String p0() {
        return O(Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public final RealBufferedSource peek() {
        return new RealBufferedSource(new PeekSource(this));
    }

    @Override // okio.BufferedSource
    public final int q0() throws EOFException {
        I0(4L);
        return this.F.q0();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        Buffer buffer = this.F;
        if (buffer.F == 0 && this.E.A0(buffer, 8192L) == -1) {
            return -1;
        }
        return buffer.read(byteBuffer);
    }

    @Override // okio.BufferedSource
    public final byte readByte() throws EOFException {
        I0(1L);
        return this.F.readByte();
    }

    @Override // okio.BufferedSource
    public final void readFully(byte[] bArr) throws EOFException {
        Buffer buffer = this.F;
        bArr.getClass();
        try {
            I0(bArr.length);
            buffer.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = buffer.F;
                if (j <= 0) {
                    throw e;
                }
                int i2 = buffer.read(bArr, i, (int) j);
                if (i2 == -1) {
                    mr9.u();
                    return;
                }
                i += i2;
            }
        }
    }

    @Override // okio.BufferedSource
    public final int readInt() throws EOFException {
        I0(4L);
        return this.F.readInt();
    }

    @Override // okio.BufferedSource
    public final long readLong() throws EOFException {
        I0(8L);
        return this.F.readLong();
    }

    @Override // okio.BufferedSource
    public final short readShort() throws EOFException {
        I0(2L);
        return this.F.readShort();
    }

    @Override // okio.BufferedSource
    public final String s(long j) throws EOFException {
        I0(j);
        return this.F.S(j, dj2.a);
    }

    @Override // okio.BufferedSource
    public final void skip(long j) {
        if (this.G) {
            sz6.j("closed");
            return;
        }
        while (j > 0) {
            Buffer buffer = this.F;
            if (buffer.F == 0 && this.E.A0(buffer, 8192L) == -1) {
                sz6.n();
                return;
            } else {
                long jMin = Math.min(j, buffer.F);
                buffer.skip(jMin);
                j -= jMin;
            }
        }
    }

    @Override // okio.BufferedSource
    public final ByteString t(long j) throws EOFException {
        I0(j);
        return this.F.t(j);
    }

    @Override // okio.BufferedSource
    public final String t0() {
        Source source = this.E;
        Buffer buffer = this.F;
        buffer.f0(source);
        return buffer.t0();
    }

    public final String toString() {
        return "buffer(" + this.E + ')';
    }

    @Override // okio.BufferedSource
    public final long u0(long j, ByteString byteString) {
        byteString.getClass();
        return djk.g(this, byteString, 1024L);
    }
}
