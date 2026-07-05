package okio;

import defpackage.bsg;
import defpackage.mdj;
import defpackage.mr9;
import defpackage.sz6;
import defpackage.vb7;
import defpackage.xh6;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/GzipSource;", "Lokio/Source;", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class GzipSource implements Source {
    public byte E;
    public final RealBufferedSource F;
    public final Inflater G;
    public final InflaterSource H;
    public final CRC32 I;

    public GzipSource(Source source) {
        source.getClass();
        RealBufferedSource realBufferedSource = new RealBufferedSource(source);
        this.F = realBufferedSource;
        Inflater inflater = new Inflater(true);
        this.G = inflater;
        this.H = new InflaterSource(realBufferedSource, inflater);
        this.I = new CRC32();
    }

    public static void c(int i, int i2, String str) throws IOException {
        if (i2 == i) {
            return;
        }
        throw new IOException(str + ": actual 0x" + bsg.O0(8, SegmentedByteString.e(i2)) + " != expected 0x" + bsg.O0(8, SegmentedByteString.e(i)));
    }

    @Override // okio.Source
    public final long A0(Buffer buffer, long j) throws IOException {
        GzipSource gzipSource = this;
        buffer.getClass();
        if (j < 0) {
            mr9.q(vb7.m(j, "byteCount < 0: "));
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        byte b = gzipSource.E;
        CRC32 crc32 = gzipSource.I;
        RealBufferedSource realBufferedSource = gzipSource.F;
        if (b == 0) {
            realBufferedSource.I0(10L);
            Buffer buffer2 = realBufferedSource.F;
            byte bI = buffer2.i(3L);
            boolean z = ((bI >> 1) & 1) == 1;
            if (z) {
                gzipSource.d(buffer2, 0L, 10L);
            }
            c(8075, realBufferedSource.readShort(), "ID1ID2");
            realBufferedSource.skip(8L);
            if (((bI >> 2) & 1) == 1) {
                realBufferedSource.I0(2L);
                if (z) {
                    d(buffer2, 0L, 2L);
                }
                long jR = buffer2.R() & 65535;
                realBufferedSource.I0(jR);
                if (z) {
                    d(buffer2, 0L, jR);
                }
                realBufferedSource.skip(jR);
            }
            if (((bI >> 3) & 1) == 1) {
                long jC = realBufferedSource.c((byte) 0, 0L, Long.MAX_VALUE);
                if (jC == -1) {
                    sz6.n();
                    return 0L;
                }
                if (z) {
                    d(buffer2, 0L, jC + 1);
                }
                realBufferedSource.skip(jC + 1);
            }
            if (((bI >> 4) & 1) == 1) {
                long jC2 = realBufferedSource.c((byte) 0, 0L, Long.MAX_VALUE);
                if (jC2 == -1) {
                    sz6.n();
                    return 0L;
                }
                if (z) {
                    gzipSource = this;
                    gzipSource.d(buffer2, 0L, jC2 + 1);
                } else {
                    gzipSource = this;
                }
                realBufferedSource.skip(jC2 + 1);
            } else {
                gzipSource = this;
            }
            if (z) {
                c(realBufferedSource.d(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            gzipSource.E = (byte) 1;
        }
        if (gzipSource.E == 1) {
            long j2 = buffer.F;
            long jA0 = gzipSource.H.A0(buffer, j);
            if (jA0 != -1) {
                gzipSource.d(buffer, j2, jA0);
                return jA0;
            }
            gzipSource.E = (byte) 2;
        }
        if (gzipSource.E == 2) {
            c(realBufferedSource.q0(), (int) crc32.getValue(), "CRC");
            c(realBufferedSource.q0(), (int) gzipSource.G.getBytesWritten(), "ISIZE");
            gzipSource.E = (byte) 3;
            if (!realBufferedSource.F()) {
                xh6.c("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.H.close();
    }

    public final void d(Buffer buffer, long j, long j2) {
        Segment segment = buffer.E;
        segment.getClass();
        while (true) {
            int i = segment.c;
            int i2 = segment.b;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            segment = segment.f;
            segment.getClass();
        }
        while (j2 > 0) {
            int i3 = (int) (((long) segment.b) + j);
            int iMin = (int) Math.min(segment.c - i3, j2);
            this.I.update(segment.a, i3, iMin);
            j2 -= (long) iMin;
            segment = segment.f;
            segment.getClass();
            j = 0;
        }
    }

    @Override // okio.Source
    public final Timeout l() {
        return this.F.E.l();
    }
}
