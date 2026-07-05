package okio;

import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/ForwardingSource;", "Lokio/Source;", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public abstract class ForwardingSource implements Source {
    public final Source E;

    public ForwardingSource(Source source) {
        source.getClass();
        this.E = source;
    }

    @Override // okio.Source
    public long A0(Buffer buffer, long j) {
        buffer.getClass();
        return this.E.A0(buffer, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.E.close();
    }

    @Override // okio.Source
    public final Timeout l() {
        return this.E.l();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.E + ')';
    }
}
