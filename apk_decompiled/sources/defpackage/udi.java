package defpackage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class udi extends OutputStream {
    public final FileOutputStream E;

    public udi(FileOutputStream fileOutputStream) {
        this.E = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.E.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        bArr.getClass();
        this.E.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.E.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        bArr.getClass();
        this.E.write(bArr, i, i2);
    }
}
