package okio;

import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/CipherSink;", "Lokio/Sink;", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class CipherSink implements Sink {
    @Override // okio.Sink
    public final void c0(Buffer buffer, long j) {
        buffer.getClass();
        SegmentedByteString.b(buffer.F, 0L, j);
        throw new IllegalStateException("closed");
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() {
        throw null;
    }

    @Override // okio.Sink
    public final Timeout l() {
        throw null;
    }
}
