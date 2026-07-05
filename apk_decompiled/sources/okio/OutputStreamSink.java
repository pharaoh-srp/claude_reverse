package okio;

import defpackage.mdj;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/OutputStreamSink;", "Lokio/Sink;", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class OutputStreamSink implements Sink {
    public final OutputStream E;
    public final Timeout F;

    public OutputStreamSink(OutputStream outputStream, Timeout timeout) {
        this.E = outputStream;
        this.F = timeout;
    }

    @Override // okio.Sink
    public final void c0(Buffer buffer, long j) throws IOException {
        buffer.getClass();
        SegmentedByteString.b(buffer.F, 0L, j);
        while (j > 0) {
            this.F.h();
            Segment segment = buffer.E;
            segment.getClass();
            int iMin = (int) Math.min(j, segment.c - segment.b);
            this.E.write(segment.a, segment.b, iMin);
            int i = segment.b + iMin;
            segment.b = i;
            long j2 = iMin;
            j -= j2;
            buffer.F -= j2;
            if (i == segment.c) {
                buffer.E = segment.a();
                SegmentPool.a(segment);
            }
        }
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.E.close();
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() throws IOException {
        this.E.flush();
    }

    @Override // okio.Sink
    /* JADX INFO: renamed from: l, reason: from getter */
    public final Timeout getF() {
        return this.F;
    }

    public final String toString() {
        return "sink(" + this.E + ')';
    }
}
