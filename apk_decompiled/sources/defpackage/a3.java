package defpackage;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class a3 extends FilterInputStream {
    public int E;

    public a3(int i, FileInputStream fileInputStream) {
        super(fileInputStream);
        this.E = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(super.available(), this.E);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.E;
        if (i3 <= 0) {
            return -1;
        }
        int i4 = super.read(bArr, i, Math.min(i2, i3));
        if (i4 >= 0) {
            this.E -= i4;
        }
        return i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        int iSkip = (int) super.skip(Math.min(j, this.E));
        if (iSkip >= 0) {
            this.E -= iSkip;
        }
        return iSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.E <= 0) {
            return -1;
        }
        int i = super.read();
        if (i >= 0) {
            this.E--;
        }
        return i;
    }
}
