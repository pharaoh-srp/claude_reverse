package okio;

import defpackage.mdj;
import defpackage.mr9;
import defpackage.ukj;
import defpackage.vb7;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/InputStreamSource;", "Lokio/Source;", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
class InputStreamSource implements Source {
    public final InputStream E;
    public final Timeout F;

    public InputStreamSource(InputStream inputStream, Timeout timeout) {
        inputStream.getClass();
        this.E = inputStream;
        this.F = timeout;
    }

    @Override // okio.Source
    public final long A0(Buffer buffer, long j) throws IOException {
        buffer.getClass();
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            mr9.q(vb7.m(j, "byteCount < 0: "));
            return 0L;
        }
        try {
            this.F.h();
            Segment segmentB0 = buffer.b0(1);
            int i = this.E.read(segmentB0.a, segmentB0.c, (int) Math.min(j, 8192 - segmentB0.c));
            if (i != -1) {
                segmentB0.c += i;
                long j2 = i;
                buffer.F += j2;
                return j2;
            }
            if (segmentB0.b != segmentB0.c) {
                return -1L;
            }
            buffer.E = segmentB0.a();
            SegmentPool.a(segmentB0);
            return -1L;
        } catch (AssertionError e) {
            if (ukj.b(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.E.close();
    }

    @Override // okio.Source
    /* JADX INFO: renamed from: l, reason: from getter */
    public final Timeout getF() {
        return this.F;
    }

    public final String toString() {
        return "source(" + this.E + ')';
    }
}
