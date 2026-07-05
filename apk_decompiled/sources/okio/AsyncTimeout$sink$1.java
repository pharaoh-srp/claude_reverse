package okio;

import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okio/AsyncTimeout$sink$1", "Lokio/Sink;", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class AsyncTimeout$sink$1 implements Sink {
    @Override // okio.Sink
    public final void c0(Buffer buffer, long j) {
        buffer.getClass();
        SegmentedByteString.b(buffer.F, 0L, j);
        long j2 = 0;
        if (j > 0) {
            Segment segment = buffer.E;
            segment.getClass();
            while (j2 < 65536) {
                j2 += (long) (segment.c - segment.b);
                if (j2 >= j) {
                    break;
                }
                segment = segment.f;
                segment.getClass();
            }
            throw null;
        }
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() {
        throw null;
    }

    @Override // okio.Sink
    public final /* bridge */ /* synthetic */ Timeout l() {
        return null;
    }

    public final String toString() {
        return "AsyncTimeout.sink(null)";
    }
}
