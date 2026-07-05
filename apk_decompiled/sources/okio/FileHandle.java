package okio;

import defpackage.mdj;
import defpackage.mr9;
import defpackage.sz6;
import defpackage.vb7;
import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lokio/FileHandle;", "Ljava/io/Closeable;", "Lokio/Closeable;", "FileHandleSink", "FileHandleSource", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public abstract class FileHandle implements Closeable {
    public boolean E;
    public int F;
    public final ReentrantLock G = new ReentrantLock();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/FileHandle$FileHandleSink;", "Lokio/Sink;", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
    public static final class FileHandleSink implements Sink {
        @Override // okio.Sink
        public final void c0(Buffer buffer, long j) {
            buffer.getClass();
            throw new IllegalStateException("closed");
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // okio.Sink, java.io.Flushable
        public final void flush() {
            throw new IllegalStateException("closed");
        }

        @Override // okio.Sink
        public final Timeout l() {
            return Timeout.e;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/FileHandle$FileHandleSource;", "Lokio/Source;", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
    public static final class FileHandleSource implements Source {
        public final FileHandle E;
        public long F;
        public boolean G;

        public FileHandleSource(FileHandle fileHandle, long j) {
            this.E = fileHandle;
            this.F = j;
        }

        @Override // okio.Source
        public final long A0(Buffer buffer, long j) {
            long j2;
            long j3;
            buffer.getClass();
            if (this.G) {
                sz6.j("closed");
                return 0L;
            }
            long j4 = this.F;
            if (j < 0) {
                mr9.q(vb7.m(j, "byteCount < 0: "));
                return 0L;
            }
            long j5 = j + j4;
            long j6 = j4;
            while (true) {
                if (j6 >= j5) {
                    j2 = -1;
                    break;
                }
                Segment segmentB0 = buffer.b0(1);
                j2 = -1;
                int iD = this.E.d(j6, segmentB0.a, segmentB0.c, (int) Math.min(j5 - j6, 8192 - r13));
                if (iD == -1) {
                    if (segmentB0.b == segmentB0.c) {
                        buffer.E = segmentB0.a();
                        SegmentPool.a(segmentB0);
                    }
                    if (j4 == j6) {
                        j3 = -1;
                    }
                } else {
                    segmentB0.c += iD;
                    long j7 = iD;
                    j6 += j7;
                    buffer.F += j7;
                }
            }
            j3 = j6 - j4;
            if (j3 != j2) {
                this.F += j3;
            }
            return j3;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.G) {
                return;
            }
            this.G = true;
            FileHandle fileHandle = this.E;
            ReentrantLock reentrantLock = fileHandle.G;
            reentrantLock.lock();
            try {
                int i = fileHandle.F - 1;
                fileHandle.F = i;
                if (i == 0) {
                    if (fileHandle.E) {
                        reentrantLock.unlock();
                        fileHandle.c();
                    }
                }
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // okio.Source
        public final Timeout l() {
            return Timeout.e;
        }
    }

    public abstract void c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.G;
        reentrantLock.lock();
        try {
            if (this.E) {
                return;
            }
            this.E = true;
            if (this.F != 0) {
                return;
            }
            reentrantLock.unlock();
            c();
        } finally {
            reentrantLock.unlock();
        }
    }

    public abstract int d(long j, byte[] bArr, int i, int i2);

    public abstract long e();

    public final Source f(long j) {
        ReentrantLock reentrantLock = this.G;
        reentrantLock.lock();
        try {
            if (this.E) {
                throw new IllegalStateException("closed");
            }
            this.F++;
            reentrantLock.unlock();
            return new FileHandleSource(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long size() {
        ReentrantLock reentrantLock = this.G;
        reentrantLock.lock();
        try {
            if (this.E) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            return e();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
