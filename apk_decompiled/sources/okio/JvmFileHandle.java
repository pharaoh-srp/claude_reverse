package okio;

import defpackage.mdj;
import java.io.RandomAccessFile;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/JvmFileHandle;", "Lokio/FileHandle;", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class JvmFileHandle extends FileHandle {
    public final RandomAccessFile H;

    public JvmFileHandle(RandomAccessFile randomAccessFile) {
        this.H = randomAccessFile;
    }

    @Override // okio.FileHandle
    public final synchronized void c() {
        this.H.close();
    }

    @Override // okio.FileHandle
    public final synchronized int d(long j, byte[] bArr, int i, int i2) {
        bArr.getClass();
        this.H.seek(j);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int i4 = this.H.read(bArr, i, i2 - i3);
            if (i4 != -1) {
                i3 += i4;
            } else if (i3 == 0) {
                return -1;
            }
        }
        return i3;
    }

    @Override // okio.FileHandle
    public final synchronized long e() {
        return this.H.length();
    }
}
