package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public final class jeg implements m51 {
    public int b;
    public float c;
    public float d;
    public i51 e;
    public i51 f;
    public i51 g;
    public i51 h;
    public boolean i;
    public ieg j;
    public ByteBuffer k;
    public ByteBuffer l;
    public long m;
    public long n;
    public boolean o;

    @Override // defpackage.m51
    public final boolean c() {
        if (this.f.a != -1) {
            return Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a;
        }
        return false;
    }

    @Override // defpackage.m51
    public final boolean d() {
        if (this.o) {
            ieg iegVar = this.j;
            if (iegVar != null) {
                fd9.M(iegVar.k >= 0);
                if (iegVar.i.n() * iegVar.k * iegVar.b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.m51
    public final ByteBuffer e() {
        ieg iegVar = this.j;
        if (iegVar != null) {
            heg hegVar = iegVar.i;
            int i = iegVar.b;
            fd9.M(iegVar.k >= 0);
            int iN = hegVar.n() * iegVar.k * i;
            if (iN > 0) {
                if (this.k.capacity() < iN) {
                    this.k = ByteBuffer.allocateDirect(iN).order(ByteOrder.nativeOrder());
                } else {
                    this.k.clear();
                }
                ByteBuffer byteBuffer = this.k;
                fd9.M(iegVar.k >= 0);
                int iMin = Math.min(byteBuffer.remaining() / (hegVar.n() * i), iegVar.k);
                hegVar.p(byteBuffer, iMin);
                iegVar.k -= iMin;
                System.arraycopy(hegVar.f(), iMin * i, hegVar.f(), 0, iegVar.k * i);
                this.k.flip();
                this.n += (long) iN;
                this.l = this.k;
            }
        }
        ByteBuffer byteBuffer2 = this.l;
        this.l = m51.a;
        return byteBuffer2;
    }

    @Override // defpackage.m51
    public final void f(j51 j51Var) {
        if (c()) {
            i51 i51Var = this.e;
            this.g = i51Var;
            i51 i51Var2 = this.f;
            this.h = i51Var2;
            if (this.i) {
                this.j = new ieg(i51Var.a, i51Var.b, this.c, this.d, i51Var2.a, i51Var.c == 4);
            } else {
                ieg iegVar = this.j;
                if (iegVar != null) {
                    iegVar.j = 0;
                    iegVar.k = 0;
                    iegVar.l = 0;
                    iegVar.m = 0;
                    iegVar.n = 0;
                    iegVar.o = 0;
                    iegVar.p = 0;
                    iegVar.q = 0.0d;
                    iegVar.i.flush();
                }
            }
        }
        this.l = m51.a;
        this.m = 0L;
        this.n = 0L;
        this.o = false;
    }

    @Override // defpackage.m51
    public final void g(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ieg iegVar = this.j;
            iegVar.getClass();
            this.m += (long) byteBuffer.remaining();
            int iRemaining = byteBuffer.remaining();
            int i = iegVar.b;
            heg hegVar = iegVar.i;
            int iN = iRemaining / (hegVar.n() * i);
            hegVar.o(iN);
            hegVar.l(byteBuffer, iRemaining);
            iegVar.j += iN;
            iegVar.b();
        }
    }

    @Override // defpackage.m51
    public final i51 h(i51 i51Var) throws AudioProcessor$UnhandledAudioFormatException {
        int i = i51Var.c;
        if (i != 2 && i != 4) {
            throw new AudioProcessor$UnhandledAudioFormatException(i51Var);
        }
        int i2 = this.b;
        if (i2 == -1) {
            i2 = i51Var.a;
        }
        this.e = i51Var;
        i51 i51Var2 = new i51(i2, i51Var.b, i);
        this.f = i51Var2;
        this.i = true;
        return i51Var2;
    }

    @Override // defpackage.m51
    public final void i() {
        ieg iegVar = this.j;
        if (iegVar != null) {
            int i = iegVar.j;
            float f = iegVar.c;
            float f2 = iegVar.d;
            double d = f / f2;
            double d2 = iegVar.e * f2;
            int i2 = iegVar.o;
            int i3 = iegVar.k + ((int) ((((((((double) (i - i2)) / d) + ((double) i2)) + iegVar.q) + ((double) iegVar.l)) / d2) + 0.5d));
            iegVar.q = 0.0d;
            heg hegVar = iegVar.i;
            int i4 = iegVar.h * 2;
            hegVar.o(i4 + i);
            hegVar.a(i * iegVar.b, i4);
            iegVar.j = i4 + iegVar.j;
            iegVar.b();
            if (iegVar.k > i3) {
                iegVar.k = Math.max(i3, 0);
            }
            iegVar.j = 0;
            iegVar.o = 0;
            iegVar.l = 0;
        }
        this.o = true;
    }

    @Override // defpackage.m51
    public final long j(long j) {
        if (this.n < 1024) {
            return (long) (j / ((double) this.c));
        }
        long j2 = this.m;
        ieg iegVar = this.j;
        iegVar.getClass();
        long jN = j2 - ((long) (iegVar.i.n() * (iegVar.j * iegVar.b)));
        int i = this.h.a;
        int i2 = this.g.a;
        long j3 = this.n;
        return i == i2 ? tpi.I(j, j3, jN, RoundingMode.DOWN) : tpi.I(j, j3 * ((long) i2), jN * ((long) i), RoundingMode.DOWN);
    }

    @Override // defpackage.m51
    public final void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        i51 i51Var = i51.e;
        this.e = i51Var;
        this.f = i51Var;
        this.g = i51Var;
        this.h = i51Var;
        ByteBuffer byteBuffer = m51.a;
        this.k = byteBuffer;
        this.l = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.m = 0L;
        this.n = 0L;
        this.o = false;
    }
}
