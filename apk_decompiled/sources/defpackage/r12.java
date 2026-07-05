package defpackage;

import java.nio.ByteBuffer;
import okio.Buffer;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: classes2.dex */
public final class r12 implements Source {
    public final ByteBuffer E;
    public final int F;

    public r12(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        this.E = byteBufferSlice;
        this.F = byteBufferSlice.capacity();
    }

    @Override // okio.Source
    public final long A0(Buffer buffer, long j) {
        ByteBuffer byteBuffer = this.E;
        int iPosition = byteBuffer.position();
        int i = this.F;
        if (iPosition == i) {
            return -1L;
        }
        int iPosition2 = (int) (((long) byteBuffer.position()) + j);
        if (iPosition2 <= i) {
            i = iPosition2;
        }
        byteBuffer.limit(i);
        return buffer.write(byteBuffer);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // okio.Source
    public final Timeout l() {
        return Timeout.e;
    }
}
