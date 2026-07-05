package okio;

import defpackage.mdj;
import defpackage.mr9;
import defpackage.vb7;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/GzipSink;", "Lokio/Sink;", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class GzipSink implements Sink {
    public final RealBufferedSink E;
    public final Deflater F;
    public final DeflaterSink G;
    public boolean H;
    public final CRC32 I;

    public GzipSink(Sink sink) {
        sink.getClass();
        RealBufferedSink realBufferedSink = new RealBufferedSink(sink);
        this.E = realBufferedSink;
        Deflater deflater = new Deflater(-1, true);
        this.F = deflater;
        this.G = new DeflaterSink(realBufferedSink, deflater);
        this.I = new CRC32();
        Buffer buffer = realBufferedSink.F;
        buffer.R0(8075);
        buffer.B0(8);
        buffer.B0(0);
        buffer.P0(0);
        buffer.B0(0);
        buffer.B0(0);
    }

    @Override // okio.Sink
    public final void c0(Buffer buffer, long j) {
        buffer.getClass();
        if (j < 0) {
            mr9.q(vb7.m(j, "byteCount < 0: "));
            return;
        }
        if (j == 0) {
            return;
        }
        Segment segment = buffer.E;
        segment.getClass();
        long j2 = j;
        while (j2 > 0) {
            int iMin = (int) Math.min(j2, segment.c - segment.b);
            this.I.update(segment.a, segment.b, iMin);
            j2 -= (long) iMin;
            segment = segment.f;
            segment.getClass();
        }
        this.G.c0(buffer, j);
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.F;
        RealBufferedSink realBufferedSink = this.E;
        if (this.H) {
            return;
        }
        try {
            DeflaterSink deflaterSink = this.G;
            deflaterSink.F.finish();
            deflaterSink.c(false);
            realBufferedSink.E((int) this.I.getValue());
            realBufferedSink.E((int) deflater.getBytesRead());
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
            realBufferedSink.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.H = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() {
        this.G.flush();
    }

    @Override // okio.Sink
    public final Timeout l() {
        return this.E.E.l();
    }
}
