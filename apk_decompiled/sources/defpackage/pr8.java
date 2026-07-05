package defpackage;

import java.io.IOException;
import okio.Buffer;

/* JADX INFO: loaded from: classes3.dex */
public final class pr8 extends lr8 {
    public boolean I;

    @Override // defpackage.lr8, okio.Source
    public final long A0(Buffer buffer, long j) throws IOException {
        buffer.getClass();
        if (j < 0) {
            mr9.q(vb7.m(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.G) {
            sz6.j("closed");
            return 0L;
        }
        if (this.I) {
            return -1L;
        }
        long jA0 = super.A0(buffer, j);
        if (jA0 != -1) {
            return jA0;
        }
        this.I = true;
        c(wg8.F);
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.G) {
            return;
        }
        if (!this.I) {
            c(qr8.g);
        }
        this.G = true;
    }
}
