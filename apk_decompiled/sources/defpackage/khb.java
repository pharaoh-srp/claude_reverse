package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import okio.Buffer;
import okio.InflaterSource;

/* JADX INFO: loaded from: classes3.dex */
public final class khb implements Closeable {
    public final boolean E;
    public final Buffer F = new Buffer();
    public Inflater G;
    public InflaterSource H;

    public khb(boolean z) {
        this.E = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InflaterSource inflaterSource = this.H;
        if (inflaterSource != null) {
            inflaterSource.close();
        }
        this.H = null;
        this.G = null;
    }
}
