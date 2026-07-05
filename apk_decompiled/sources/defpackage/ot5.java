package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import okio.Buffer;
import okio.Segment;
import okio.SegmentPool;
import okio.SegmentedByteString;
import okio.Sink;
import okio.Timeout;

/* JADX INFO: loaded from: classes.dex */
public final class ot5 implements Sink {
    public final OutputStream E;
    public final ydg F;
    public final /* synthetic */ dpf G;

    public ot5(dpf dpfVar) {
        this.G = dpfVar;
        Socket socket = (Socket) dpfVar.F;
        this.E = socket.getOutputStream();
        this.F = new ydg(socket);
    }

    @Override // okio.Sink
    public final void c0(Buffer buffer, long j) throws IOException {
        buffer.getClass();
        SegmentedByteString.b(buffer.F, 0L, j);
        while (j > 0) {
            ydg ydgVar = this.F;
            ydgVar.h();
            Segment segment = buffer.E;
            segment.getClass();
            int iMin = (int) Math.min(j, segment.c - segment.b);
            ydgVar.k();
            try {
                try {
                    this.E.write(segment.a, segment.b, iMin);
                    if (ydgVar.l()) {
                        throw ydgVar.m(null);
                    }
                    int i = segment.b + iMin;
                    segment.b = i;
                    long j2 = iMin;
                    j -= j2;
                    buffer.F -= j2;
                    if (i == segment.c) {
                        buffer.E = segment.a();
                        SegmentPool.a(segment);
                    }
                } catch (IOException e) {
                    if (!ydgVar.l()) {
                        throw e;
                    }
                    throw ydgVar.m(e);
                }
            } catch (Throwable th) {
                ydgVar.l();
                throw th;
            }
        }
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        OutputStream outputStream = this.E;
        dpf dpfVar = this.G;
        ydg ydgVar = this.F;
        ydgVar.k();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) dpfVar.G;
            Socket socket = (Socket) dpfVar.F;
            atomicInteger.getClass();
            while (true) {
                int i2 = atomicInteger.get();
                if ((i2 & 1) != 0) {
                    i = 0;
                    break;
                }
                int i3 = i2 | 1;
                if (atomicInteger.compareAndSet(i2, i3)) {
                    i = i3;
                    break;
                }
            }
            if (i != 0) {
                if (i != 3) {
                    if (!socket.isClosed() && !socket.isOutputShutdown()) {
                        outputStream.flush();
                        try {
                            socket.shutdownOutput();
                        } catch (UnsupportedOperationException unused) {
                            outputStream.close();
                        }
                    }
                    return;
                }
                socket.close();
                if (ydgVar.l()) {
                    throw ydgVar.m(null);
                }
            }
        } catch (IOException e) {
            if (!ydgVar.l()) {
                throw e;
            }
            throw ydgVar.m(e);
        } finally {
            ydgVar.l();
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() throws IOException {
        ydg ydgVar = this.F;
        ydgVar.k();
        try {
            this.E.flush();
            if (ydgVar.l()) {
                throw ydgVar.m(null);
            }
        } catch (IOException e) {
            if (!ydgVar.l()) {
                throw e;
            }
            throw ydgVar.m(e);
        } finally {
            ydgVar.l();
        }
    }

    @Override // okio.Sink
    /* JADX INFO: renamed from: l */
    public final Timeout getF() {
        return this.F;
    }

    public final String toString() {
        return "sink(" + ((Socket) this.G.F) + ')';
    }
}
