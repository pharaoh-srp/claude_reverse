package defpackage;

import android.media.MediaDataSource;
import java.io.IOException;
import okio.Buffer;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: classes2.dex */
public final class z6b implements Source {
    public final MediaDataSource E;
    public final long F;
    public long G;

    public z6b(MediaDataSource mediaDataSource) {
        this.E = mediaDataSource;
        this.F = mediaDataSource.getSize();
    }

    @Override // okio.Source
    public final long A0(Buffer buffer, long j) throws IOException {
        long j2 = this.G;
        long j3 = this.F;
        if (j2 >= j3) {
            return -1L;
        }
        int iMin = (int) Math.min(j, j3 - j2);
        byte[] bArr = new byte[iMin];
        int at = this.E.readAt(this.G, bArr, 0, iMin);
        long j4 = at;
        this.G += j4;
        buffer.m1202write(bArr, 0, at);
        return j4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.E.close();
    }

    @Override // okio.Source
    public final Timeout l() {
        return Timeout.e;
    }
}
