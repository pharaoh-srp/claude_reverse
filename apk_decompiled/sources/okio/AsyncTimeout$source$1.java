package okio;

import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okio/AsyncTimeout$source$1", "Lokio/Source;", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class AsyncTimeout$source$1 implements Source {
    @Override // okio.Source
    public final long A0(Buffer buffer, long j) {
        buffer.getClass();
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // okio.Source
    public final /* bridge */ /* synthetic */ Timeout l() {
        return null;
    }

    public final String toString() {
        return "AsyncTimeout.source(null)";
    }
}
