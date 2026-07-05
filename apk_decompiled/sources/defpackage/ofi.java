package defpackage;

import okio.Buffer;
import okio.BufferedSource;
import okio.RealBufferedSource;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: classes.dex */
public final class ofi extends rqe implements Source {
    public final p8b F;
    public final long G;

    public ofi(p8b p8bVar, long j) {
        this.F = p8bVar;
        this.G = j;
    }

    @Override // okio.Source
    public final long A0(Buffer buffer, long j) {
        buffer.getClass();
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // defpackage.rqe
    public final BufferedSource G0() {
        return new RealBufferedSource(this);
    }

    @Override // defpackage.rqe, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.rqe
    public final long d() {
        return this.G;
    }

    @Override // defpackage.rqe
    public final p8b e() {
        return this.F;
    }

    @Override // okio.Source
    /* JADX INFO: renamed from: l */
    public final Timeout getE() {
        return Timeout.e;
    }
}
