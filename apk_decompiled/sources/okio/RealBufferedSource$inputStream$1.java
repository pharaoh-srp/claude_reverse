package okio;

import defpackage.mdj;
import defpackage.xh6;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okio/RealBufferedSource$inputStream$1", "Ljava/io/InputStream;", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class RealBufferedSource$inputStream$1 extends InputStream {
    public final /* synthetic */ RealBufferedSource E;

    public RealBufferedSource$inputStream$1(RealBufferedSource realBufferedSource) {
        this.E = realBufferedSource;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        RealBufferedSource realBufferedSource = this.E;
        if (!realBufferedSource.G) {
            return (int) Math.min(realBufferedSource.F.F, 2147483647L);
        }
        xh6.c("closed");
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.E.close();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        bArr.getClass();
        RealBufferedSource realBufferedSource = this.E;
        Buffer buffer = realBufferedSource.F;
        if (realBufferedSource.G) {
            xh6.c("closed");
            return 0;
        }
        SegmentedByteString.b(bArr.length, i, i2);
        if (buffer.F == 0 && realBufferedSource.E.A0(buffer, 8192L) == -1) {
            return -1;
        }
        return buffer.read(bArr, i, i2);
    }

    public final String toString() {
        return this.E + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final long transferTo(OutputStream outputStream) throws IOException {
        outputStream.getClass();
        RealBufferedSource realBufferedSource = this.E;
        Buffer buffer = realBufferedSource.F;
        if (realBufferedSource.G) {
            xh6.c("closed");
            return 0L;
        }
        long j = 0;
        while (true) {
            if (buffer.F == 0 && realBufferedSource.E.A0(buffer, 8192L) == -1) {
                return j;
            }
            long j2 = buffer.F;
            j += j2;
            SegmentedByteString.b(j2, 0L, j2);
            Segment segment = buffer.E;
            while (j2 > 0) {
                segment.getClass();
                int iMin = (int) Math.min(j2, segment.c - segment.b);
                outputStream.write(segment.a, segment.b, iMin);
                int i = segment.b + iMin;
                segment.b = i;
                long j3 = iMin;
                buffer.F -= j3;
                j2 -= j3;
                if (i == segment.c) {
                    Segment segmentA = segment.a();
                    buffer.E = segmentA;
                    SegmentPool.a(segment);
                    segment = segmentA;
                }
            }
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        RealBufferedSource realBufferedSource = this.E;
        Buffer buffer = realBufferedSource.F;
        if (realBufferedSource.G) {
            xh6.c("closed");
            return 0;
        }
        if (buffer.F == 0 && realBufferedSource.E.A0(buffer, 8192L) == -1) {
            return -1;
        }
        return buffer.readByte() & 255;
    }
}
