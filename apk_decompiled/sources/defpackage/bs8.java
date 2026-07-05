package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: classes.dex */
public final class bs8 implements Source {
    public final BufferedSource E;
    public int F;
    public int G;
    public int H;
    public int I;

    public bs8(BufferedSource bufferedSource) {
        bufferedSource.getClass();
        this.E = bufferedSource;
    }

    @Override // okio.Source
    public final long A0(Buffer buffer, long j) throws IOException {
        int i;
        int i2;
        buffer.getClass();
        do {
            int i3 = this.H;
            BufferedSource bufferedSource = this.E;
            if (i3 == 0) {
                bufferedSource.skip(this.I);
                this.I = 0;
                if ((this.F & 4) == 0) {
                    i = this.G;
                    int iM = zkj.m(bufferedSource);
                    this.H = iM;
                    int i4 = bufferedSource.readByte() & 255;
                    this.F = bufferedSource.readByte() & 255;
                    Logger logger = cs8.H;
                    if (logger.isLoggable(Level.FINE)) {
                        ByteString byteString = rr8.a;
                        logger.fine(rr8.b(true, this.G, iM, i4, this.F));
                    }
                    i2 = bufferedSource.readInt() & Integer.MAX_VALUE;
                    this.G = i2;
                    if (i4 != 9) {
                        throw new IOException(i4 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jA0 = bufferedSource.A0(buffer, Math.min(j, i3));
                if (jA0 != -1) {
                    this.H -= (int) jA0;
                    return jA0;
                }
            }
            return -1L;
        } while (i2 == i);
        xh6.c("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // okio.Source
    /* JADX INFO: renamed from: l */
    public final Timeout getF() {
        return this.E.getF();
    }
}
