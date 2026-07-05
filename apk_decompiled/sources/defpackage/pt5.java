package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import okio.Buffer;
import okio.Segment;
import okio.SegmentPool;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: classes.dex */
public final class pt5 implements Source {
    public final InputStream E;
    public final ydg F;
    public final /* synthetic */ dpf G;

    public pt5(dpf dpfVar) {
        this.G = dpfVar;
        Socket socket = (Socket) dpfVar.F;
        this.E = socket.getInputStream();
        this.F = new ydg(socket);
    }

    @Override // okio.Source
    public final long A0(Buffer buffer, long j) throws IOException {
        buffer.getClass();
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            mr9.q(vb7.m(j, "byteCount < 0: "));
            return 0L;
        }
        ydg ydgVar = this.F;
        ydgVar.h();
        Segment segmentB0 = buffer.b0(1);
        int iMin = (int) Math.min(j, 8192 - segmentB0.c);
        try {
            ydgVar.k();
            try {
                int i = this.E.read(segmentB0.a, segmentB0.c, iMin);
                if (ydgVar.l()) {
                    throw ydgVar.m(null);
                }
                if (i != -1) {
                    segmentB0.c += i;
                    long j2 = i;
                    buffer.F += j2;
                    return j2;
                }
                if (segmentB0.b != segmentB0.c) {
                    return -1L;
                }
                buffer.E = segmentB0.a();
                SegmentPool.a(segmentB0);
                return -1L;
            } catch (IOException e) {
                if (ydgVar.l()) {
                    throw ydgVar.m(e);
                }
                throw e;
            } finally {
                ydgVar.l();
            }
        } catch (AssertionError e2) {
            if (ukj.b(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        dpf dpfVar = this.G;
        ydg ydgVar = this.F;
        ydgVar.k();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) dpfVar.G;
            Socket socket = (Socket) dpfVar.F;
            atomicInteger.getClass();
            while (true) {
                int i2 = atomicInteger.get();
                if ((i2 & 2) != 0) {
                    i = 0;
                    break;
                }
                int i3 = i2 | 2;
                if (atomicInteger.compareAndSet(i2, i3)) {
                    i = i3;
                    break;
                }
            }
            if (i != 0) {
                if (i == 3) {
                    socket.close();
                } else {
                    if (socket.isClosed() || socket.isInputShutdown()) {
                        return;
                    }
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.E.close();
                    }
                }
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

    @Override // okio.Source
    /* JADX INFO: renamed from: l */
    public final Timeout getF() {
        return this.F;
    }

    public final String toString() {
        return "source(" + ((Socket) this.G.F) + ')';
    }
}
