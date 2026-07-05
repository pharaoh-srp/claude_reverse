package okio;

import defpackage.mdj;
import defpackage.yb5;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/DeflaterSink;", "Lokio/Sink;", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class DeflaterSink implements Sink {
    public final RealBufferedSink E;
    public final Deflater F;
    public boolean G;

    public DeflaterSink(RealBufferedSink realBufferedSink, Deflater deflater) {
        this.E = realBufferedSink;
        this.F = deflater;
    }

    public final void c(boolean z) throws IOException {
        Segment segmentB0;
        int iDeflate;
        RealBufferedSink realBufferedSink = this.E;
        Buffer buffer = realBufferedSink.F;
        while (true) {
            segmentB0 = buffer.b0(1);
            byte[] bArr = segmentB0.a;
            int i = segmentB0.c;
            Deflater deflater = this.F;
            if (z) {
                try {
                    iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (IllegalStateException e) {
                    throw new IOException("Deflater already closed", e);
                } catch (NullPointerException e2) {
                    throw new IOException("Deflater already closed", e2);
                }
            } else {
                iDeflate = deflater.deflate(bArr, i, 8192 - i);
            }
            if (iDeflate > 0) {
                segmentB0.c += iDeflate;
                buffer.F += (long) iDeflate;
                realBufferedSink.c();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (segmentB0.b == segmentB0.c) {
            buffer.E = segmentB0.a();
            SegmentPool.a(segmentB0);
        }
    }

    @Override // okio.Sink
    public final void c0(Buffer buffer, long j) {
        buffer.getClass();
        SegmentedByteString.b(buffer.F, 0L, j);
        while (true) {
            Deflater deflater = this.F;
            if (j <= 0) {
                deflater.setInput(yb5.W, 0, 0);
                return;
            }
            Segment segment = buffer.E;
            segment.getClass();
            int iMin = (int) Math.min(j, segment.c - segment.b);
            deflater.setInput(segment.a, segment.b, iMin);
            c(false);
            long j2 = iMin;
            buffer.F -= j2;
            int i = segment.b + iMin;
            segment.b = i;
            if (i == segment.c) {
                buffer.E = segment.a();
                SegmentPool.a(segment);
            }
            j -= j2;
        }
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.F;
        if (this.G) {
            return;
        }
        try {
            deflater.finish();
            c(false);
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.E.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.G = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() {
        c(true);
        this.E.flush();
    }

    @Override // okio.Sink
    public final Timeout l() {
        return this.E.E.l();
    }

    public final String toString() {
        return "DeflaterSink(" + this.E + ')';
    }
}
