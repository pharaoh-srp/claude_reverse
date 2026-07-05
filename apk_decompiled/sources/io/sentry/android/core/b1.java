package io.sentry.android.core;

import defpackage.i99;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class b1 extends InputStream {
    public final BufferedInputStream E;
    public long F;

    public b1(BufferedInputStream bufferedInputStream, int i) {
        this.E = bufferedInputStream;
        this.F = i;
    }

    @Override // java.io.InputStream
    public final int available() {
        return Math.min(this.E.available(), (int) this.F);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        i99.i(this.E, this.F);
        this.F = 0L;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.F;
        if (j <= 0) {
            return -1;
        }
        int i3 = this.E.read(bArr, i, Math.min(i2, (int) j));
        if (i3 > 0) {
            this.F -= (long) i3;
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = this.E.skip(Math.min(j, this.F));
        this.F -= jSkip;
        return jSkip;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.F <= 0) {
            return -1;
        }
        int i = this.E.read();
        if (i != -1) {
            this.F--;
        }
        return i;
    }
}
