package okio;

import defpackage.mdj;
import defpackage.mr9;
import defpackage.sz6;
import defpackage.vb7;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/InflaterSource;", "Lokio/Source;", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class InflaterSource implements Source {
    public final RealBufferedSource E;
    public final Inflater F;
    public int G;
    public boolean H;

    public InflaterSource(RealBufferedSource realBufferedSource, Inflater inflater) {
        this.E = realBufferedSource;
        this.F = inflater;
    }

    @Override // okio.Source
    public final long A0(Buffer buffer, long j) throws IOException {
        buffer.getClass();
        do {
            long jC = c(buffer, j);
            if (jC > 0) {
                return jC;
            }
            Inflater inflater = this.F;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.E.F());
        throw new EOFException("source exhausted prematurely");
    }

    public final long c(Buffer buffer, long j) throws IOException {
        Inflater inflater = this.F;
        buffer.getClass();
        if (j < 0) {
            mr9.q(vb7.m(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.H) {
            sz6.j("closed");
            return 0L;
        }
        if (j != 0) {
            try {
                Segment segmentB0 = buffer.b0(1);
                int iMin = (int) Math.min(j, 8192 - segmentB0.c);
                boolean zNeedsInput = inflater.needsInput();
                RealBufferedSource realBufferedSource = this.E;
                if (zNeedsInput && !realBufferedSource.F()) {
                    Segment segment = realBufferedSource.F.E;
                    segment.getClass();
                    int i = segment.c;
                    int i2 = segment.b;
                    int i3 = i - i2;
                    this.G = i3;
                    inflater.setInput(segment.a, i2, i3);
                }
                int iInflate = inflater.inflate(segmentB0.a, segmentB0.c, iMin);
                int i4 = this.G;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.G -= remaining;
                    realBufferedSource.skip(remaining);
                }
                if (iInflate > 0) {
                    segmentB0.c += iInflate;
                    long j2 = iInflate;
                    buffer.F += j2;
                    return j2;
                }
                if (segmentB0.b == segmentB0.c) {
                    buffer.E = segmentB0.a();
                    SegmentPool.a(segmentB0);
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.H) {
            return;
        }
        this.F.end();
        this.H = true;
        this.E.close();
    }

    @Override // okio.Source
    public final Timeout l() {
        return this.E.E.l();
    }
}
