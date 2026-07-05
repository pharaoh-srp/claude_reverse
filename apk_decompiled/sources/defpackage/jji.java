package defpackage;

import android.util.Pair;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import okio.Buffer;
import okio.Sink;
import okio.Timeout;

/* JADX INFO: loaded from: classes3.dex */
public final class jji implements Sink {
    public final ArrayBlockingQueue E = new ArrayBlockingQueue(1);
    public final AtomicBoolean F = new AtomicBoolean();
    public final AtomicReference G = new AtomicReference();

    @Override // okio.Sink
    public final void c0(Buffer buffer, long j) throws IOException {
        fd9.M(!this.F.get());
        while (j != 0) {
            try {
                Pair pair = (Pair) this.E.take();
                ByteBuffer byteBuffer = (ByteBuffer) pair.first;
                exf exfVar = (exf) pair.second;
                int iLimit = byteBuffer.limit();
                byteBuffer.limit((int) Math.min(iLimit, j));
                try {
                    long j2 = buffer.read(byteBuffer);
                    if (j2 == -1) {
                        IOException iOException = new IOException("The source has been exhausted but we expected more!");
                        exfVar.m(iOException);
                        throw iOException;
                    }
                    j -= j2;
                    byteBuffer.limit(iLimit);
                    exfVar.l(iji.E);
                } catch (IOException e) {
                    exfVar.m(e);
                    throw e;
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                xh6.c("Interrupted while waiting for a read to finish!");
                return;
            }
        }
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.F.set(true);
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() {
    }

    @Override // okio.Sink
    /* JADX INFO: renamed from: l */
    public final Timeout getF() {
        return Timeout.e;
    }
}
