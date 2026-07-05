package okio;

import defpackage.mdj;
import defpackage.vb7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/CipherSource;", "Lokio/Source;", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class CipherSource implements Source {
    @Override // okio.Source
    public final long A0(Buffer buffer, long j) {
        buffer.getClass();
        if (j >= 0) {
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(vb7.m(j, "byteCount < 0: ").toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // okio.Source
    public final Timeout l() {
        throw null;
    }
}
