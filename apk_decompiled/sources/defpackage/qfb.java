package defpackage;

import java.io.Closeable;
import java.util.zip.Deflater;
import okio.Buffer;
import okio.DeflaterSink;
import okio.RealBufferedSink;

/* JADX INFO: loaded from: classes3.dex */
public final class qfb implements Closeable {
    public final boolean E;
    public final Buffer F;
    public final Deflater G;
    public final DeflaterSink H;

    public qfb(boolean z) {
        this.E = z;
        Buffer buffer = new Buffer();
        this.F = buffer;
        Deflater deflater = new Deflater(-1, true);
        this.G = deflater;
        this.H = new DeflaterSink(new RealBufferedSink(buffer), deflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.H.close();
    }
}
