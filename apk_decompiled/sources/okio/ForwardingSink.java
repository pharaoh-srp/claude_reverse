package okio;

import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/ForwardingSink;", "Lokio/Sink;", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public abstract class ForwardingSink implements Sink {
    public final Sink E;

    public ForwardingSink(Sink sink) {
        sink.getClass();
        this.E = sink;
    }

    @Override // okio.Sink
    public void c0(Buffer buffer, long j) {
        buffer.getClass();
        this.E.c0(buffer, j);
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.E.close();
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
        this.E.flush();
    }

    @Override // okio.Sink
    public final Timeout l() {
        return this.E.l();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.E + ')';
    }
}
