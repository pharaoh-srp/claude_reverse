package defpackage;

import androidx.media3.decoder.DecoderInputBuffer$InsufficientCapacityException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class ro5 extends my1 {
    public jw7 G;
    public final rc5 H = new rc5();
    public ByteBuffer I;
    public boolean J;
    public long K;
    public ByteBuffer L;
    public final int M;

    static {
        k7b.a("media3.decoder");
    }

    public ro5(int i) {
        this.M = i;
    }

    public void e() {
        this.F = 0;
        ByteBuffer byteBuffer = this.I;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.L;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.J = false;
    }

    public final ByteBuffer f(int i) {
        int i2 = this.M;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.I;
        throw new DecoderInputBuffer$InsufficientCapacityException(vb7.q("Buffer too small (", " < ", byteBuffer == null ? 0 : byteBuffer.capacity(), i, ")"));
    }

    public final void h(int i) {
        ByteBuffer byteBuffer = this.I;
        if (byteBuffer == null) {
            this.I = f(i);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (iCapacity >= i2) {
            this.I = byteBuffer;
            return;
        }
        ByteBuffer byteBufferF = f(i2);
        byteBufferF.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferF.put(byteBuffer);
        }
        this.I = byteBufferF;
    }

    public final void j() {
        ByteBuffer byteBuffer = this.I;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.L;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
