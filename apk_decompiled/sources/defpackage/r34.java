package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.b;
import io.sentry.e0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r34 {
    public int a;
    public Object b;

    public static int d(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long e(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static b h(byte[] bArr, int i, int i2, boolean z) {
        b bVar = new b(bArr, i, i2, z);
        try {
            bVar.l(i2);
            return bVar;
        } catch (InvalidProtocolBufferException e) {
            e0.i(e);
            return null;
        }
    }

    public abstract String A();

    public abstract String B();

    public abstract int C();

    public abstract int D();

    public abstract long E();

    public ByteBuffer a(byte[] bArr, int i) {
        int[] iArrC = c(i, tg2.c(bArr));
        int[] iArr = (int[]) iArrC.clone();
        tg2.b(iArr);
        for (int i2 = 0; i2 < iArrC.length; i2++) {
            iArrC[i2] = iArrC[i2] + iArr[i2];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrC, 0, 16);
        return byteBufferOrder;
    }

    public abstract void b(int i);

    public abstract int[] c(int i, int[] iArr);

    public abstract int f();

    public abstract boolean g();

    public abstract int i();

    public abstract void j(int i);

    public void k(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (bArr.length != i()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + i());
        }
        int iRemaining = byteBuffer2.remaining();
        int i = iRemaining / 64;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer byteBufferA = a(bArr, this.a + i3);
            if (i3 == i) {
                ntj.j(byteBuffer, byteBuffer2, byteBufferA, iRemaining % 64);
            } else {
                ntj.j(byteBuffer, byteBuffer2, byteBufferA, 64);
            }
        }
    }

    public abstract int l(int i);

    public abstract boolean m();

    public abstract e22 n();

    public abstract g22 o();

    public abstract double p();

    public abstract int q();

    public abstract int r();

    public abstract long s();

    public abstract float t();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract long x();

    public abstract int y();

    public abstract long z();
}
