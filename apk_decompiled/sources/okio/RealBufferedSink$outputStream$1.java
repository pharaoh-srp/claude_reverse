package okio;

import defpackage.mdj;
import defpackage.xh6;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okio/RealBufferedSink$outputStream$1", "Ljava/io/OutputStream;", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class RealBufferedSink$outputStream$1 extends OutputStream {
    public final /* synthetic */ RealBufferedSink E;

    public RealBufferedSink$outputStream$1(RealBufferedSink realBufferedSink) {
        this.E = realBufferedSink;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.E.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        RealBufferedSink realBufferedSink = this.E;
        if (realBufferedSink.G) {
            return;
        }
        realBufferedSink.flush();
    }

    public final String toString() {
        return this.E + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        bArr.getClass();
        RealBufferedSink realBufferedSink = this.E;
        if (realBufferedSink.G) {
            xh6.c("closed");
        } else {
            realBufferedSink.F.m1202write(bArr, i, i2);
            realBufferedSink.c();
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        RealBufferedSink realBufferedSink = this.E;
        if (!realBufferedSink.G) {
            realBufferedSink.F.B0((byte) i);
            realBufferedSink.c();
        } else {
            xh6.c("closed");
        }
    }
}
