package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class w67 extends InputStream {
    public final /* synthetic */ int E;
    public final InputStream F;
    public int G = 1073741824;

    public /* synthetic */ w67(InputStream inputStream, int i) {
        this.E = i;
        this.F = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        switch (this.E) {
        }
        return this.G;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.E) {
            case 0:
                this.F.close();
                break;
            default:
                this.F.close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.E) {
            case 0:
                int i = this.F.read();
                if (i == -1) {
                    this.G = 0;
                }
                return i;
            default:
                int i2 = this.F.read();
                if (i2 == -1) {
                    this.G = 0;
                }
                return i2;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        switch (this.E) {
        }
        return this.F.skip(j);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        switch (this.E) {
            case 0:
                int i = this.F.read(bArr);
                if (i == -1) {
                    this.G = 0;
                }
                return i;
            default:
                int i2 = this.F.read(bArr);
                if (i2 == -1) {
                    this.G = 0;
                }
                return i2;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        switch (this.E) {
            case 0:
                int i3 = this.F.read(bArr, i, i2);
                if (i3 == -1) {
                    this.G = 0;
                }
                return i3;
            default:
                int i4 = this.F.read(bArr, i, i2);
                if (i4 == -1) {
                    this.G = 0;
                }
                return i4;
        }
    }
}
