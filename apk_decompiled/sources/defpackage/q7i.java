package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class q7i extends md1 {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    @Override // defpackage.md1
    public final i51 a(i51 i51Var) throws AudioProcessor$UnhandledAudioFormatException {
        if (!tpi.y(i51Var.c)) {
            throw new AudioProcessor$UnhandledAudioFormatException(i51Var);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? i51.e : i51Var;
    }

    @Override // defpackage.md1
    public final void b() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // defpackage.md1, defpackage.m51
    public final boolean d() {
        return super.d() && this.n == 0;
    }

    @Override // defpackage.md1, defpackage.m51
    public final ByteBuffer e() {
        int i;
        if (super.d() && (i = this.n) > 0) {
            m(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.e();
    }

    @Override // defpackage.m51
    public final void g(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.l);
        this.o += (long) (iMin / this.b.d);
        this.l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.l > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.n + i2) - this.m.length;
        ByteBuffer byteBufferM = m(length);
        int iG = tpi.g(length, 0, this.n);
        byteBufferM.put(this.m, 0, iG);
        int iG2 = tpi.g(length - iG, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iG2);
        byteBufferM.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iG2;
        int i4 = this.n - iG;
        this.n = i4;
        byte[] bArr = this.m;
        System.arraycopy(bArr, iG, bArr, 0, i4);
        byteBuffer.get(this.m, this.n, i3);
        this.n += i3;
        byteBufferM.flip();
    }

    @Override // defpackage.m51
    public final long j(long j) {
        return Math.max(0L, j - tpi.G(this.b.a, this.j + this.i));
    }

    @Override // defpackage.md1
    public final void k() {
        if (this.k) {
            int i = this.n;
            if (i > 0) {
                this.o += (long) (i / this.b.d);
            }
            this.n = 0;
        }
    }

    @Override // defpackage.md1
    public final void l() {
        this.m = tpi.b;
    }
}
