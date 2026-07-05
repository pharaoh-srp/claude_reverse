package defpackage;

import android.media.MediaDataSource;
import java.util.concurrent.locks.ReentrantLock;
import okio.FileHandle;

/* JADX INFO: loaded from: classes2.dex */
public final class ni7 extends MediaDataSource {
    public final FileHandle E;

    public ni7(FileHandle fileHandle) {
        this.E = fileHandle;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.E.close();
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.E.size();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        FileHandle fileHandle = this.E;
        fileHandle.getClass();
        bArr.getClass();
        ReentrantLock reentrantLock = fileHandle.G;
        reentrantLock.lock();
        try {
            if (fileHandle.E) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            return fileHandle.d(j, bArr, i, i2);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
