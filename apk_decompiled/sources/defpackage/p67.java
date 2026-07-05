package defpackage;

import android.media.MediaDataSource;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class p67 extends MediaDataSource {
    public long E;
    public final /* synthetic */ u67 F;

    public p67(u67 u67Var) {
        this.F = u67Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        u67 u67Var = this.F;
        DataInputStream dataInputStream = u67Var.E;
        if (i2 == 0) {
            return 0;
        }
        if (j >= 0) {
            try {
                long j2 = this.E;
                if (j2 != j) {
                    if (j2 < 0 || j < j2 + ((long) dataInputStream.available())) {
                        u67Var.d(j);
                        this.E = j;
                    }
                }
                if (i2 > dataInputStream.available()) {
                    i2 = dataInputStream.available();
                }
                int i3 = u67Var.read(bArr, i, i2);
                if (i3 >= 0) {
                    this.E += (long) i3;
                    return i3;
                }
            } catch (IOException unused) {
            }
            this.E = -1L;
            return -1;
        }
        return -1;
    }
}
